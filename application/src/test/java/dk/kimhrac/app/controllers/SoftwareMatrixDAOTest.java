package dk.kimhrac.app.controllers;

import dk.kimhrac.app.Application;
import dk.kimhrac.app.entity.SoftwareMatrix;
import dk.kimhrac.app.entity.SystemRelease;
import dk.kimhrac.app.entity.SystemType;
import dk.kimhrac.app.interfaces.SoftwareMatrixDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by longnguyenk on 4/14/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class SoftwareMatrixDAOTest {

    private static Log logger = LogFactory.getLog(SoftwareMatrixDAOTest.class);

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private SoftwareMatrixDAO softwareMatrixDAO;

    @Before
    public void init() {
        softwareMatrixDAO.deleteAll();
    }

    @Test
    public void testDefaultSettings() throws Exception {
        assertEquals(new Integer(0), this.template.queryForObject(
                "SELECT COUNT(*) from SOFTWARE_MATRIX", Integer.class));

        insertSoftwareMatrix();

        List list = (List) softwareMatrixDAO.findAll();

        Assert.assertTrue(list.size() == 1);

        SoftwareMatrix sm = ((SoftwareMatrix) list.get(0));
        sm.setRepositoryPort(8089);
        softwareMatrixDAO.save(sm);

        list = (List) softwareMatrixDAO.findAll();

        Assert.assertEquals(new Integer(8089),
                ((SoftwareMatrix) list.get(0)).getRepositoryPort());

        softwareMatrixDAO.delete((SoftwareMatrix) list.get(0));

        list = (List) softwareMatrixDAO.findAll();

        Assert.assertTrue(list.size() == 0);

    }


    public void insertSoftwareMatrix() {
        SoftwareMatrix softwareMatrix = null;
        try {
            softwareMatrix = SoftwareMatrix.SoftwareMatrixBuilder
                    .aSoftwareMatrix()
                    .withModifiedDate(new Date())
                    .withAddedDate(new Date())
                    .withRepositoryHost("localhost")
                    .withRepositoryPort(8080)
                    .withRepositoryPwd("xxW0rd")
                    .withRepositoryProtocol("http")
                    .withSystemType(SystemType.SystemTypeBuilder.aSystemType()
                            .withAddedDate(new Date())
                            .withModifiedDate(new Date())
                            .withSystemTypeCode("code")
                            .withSystemTypeKey("key")
                            .withSystemTypeName("Name").build())
                    .withRepositorySecure("p@secure").build();

            SystemRelease systemRelease = SystemRelease.SystemReleaseBuilder
                    .aSystemRelease()
                    .withAddedDate(new Date())
                    .withSystemReleaseName("cqshared")
                    .withForceUpdate(true)
                    .withBeta(true)
                    .withReleaseDate(new Date())
                    .withModifiedDate(new Date())
                    .withSystemReleaseVersion("4.6").withSoftwareMatrix(softwareMatrix)
                    .build();

            Set<SystemRelease> systemReleases = new LinkedHashSet<SystemRelease>();
            systemReleases.add(systemRelease);

            softwareMatrix.setSystemReleaseSet(systemReleases);

            softwareMatrixDAO.save(softwareMatrix); // FIXME not yet save 2 references
        } catch (Exception ex) {
            logger.info("Error creating the software matrix: " + ex.toString());
        }
        logger.info(
                " succesfully created! (id = " + softwareMatrix.getId() + ")");
    }

    //    private void updateSoftwareMatrix() {
    //        SoftwareMatrix softwareMatrix = (SoftwareMatrix)softwareMatrixDAO.findOne(new Long(1));
    //        softwareMatrix.setRepositoryPort(8089);
    //        softwareMatrixDAO.save(softwareMatrix);
    //    }

    //
    //    @Test
    //    public void delete() {
    //        SoftwareMatrix softwareMatrix = (SoftwareMatrix)softwareMatrixDAO.findOne(new Long(1));
    //        softwareMatrixDAO.delete(softwareMatrix);
    //    }

    //
    //    @Test
    //    public void find() {
    //        List list = (List)softwareMatrixDAO.findAll();
    //        //assertNotEmpty
    //        assertNotNull(list);
    //    }
    //
    //    @Test
    //    public void findById() {
    //        SoftwareMatrix softwareMatrix = (SoftwareMatrix)softwareMatrixDAO.findOne(new Long(1));
    //        assertEquals(new Integer(8080), softwareMatrix.getRepositoryPort());
    //    }
    //

}
