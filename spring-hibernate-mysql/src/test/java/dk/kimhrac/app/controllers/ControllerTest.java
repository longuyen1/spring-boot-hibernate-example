package dk.kimhrac.app.controllers;

import dk.kimhrac.app.entity.SoftwareMatrix;
import dk.kimhrac.app.entity.SystemRelease;
import dk.kimhrac.app.interfaces.SoftwareMatrixDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by longnguyenk on 4/14/2015.
 */
public class ControllerTest {

    private static Log logger = LogFactory.getLog(ControllerTest.class);

    @Autowired
    private SoftwareMatrixDAO softwareMatrixDAO;

//    @Test
//    public void testcreateSoftwareMatrix_SystemRelease() {
//        new KimhracController().createSoftwareMatrix_SystemRelease();
//    }
//
//    @Test
//    public void testCreateSystemType() {
//        new KimhracController().createSystemType("name", "key", "code");
//    }

    @Before
    public void init() {
        softwareMatrixDAO.deleteAll();
    }

    @Test
    public void insertSoftwareMatrix() {
        SoftwareMatrix softwareMatrix = null;
        try {
            softwareMatrix =  SoftwareMatrix.SoftwareMatrixBuilder.aSoftwareMatrix()
                    .withModifiedDate(new Date())
                    .withAddedDate(new Date())
                    .withRepositoryHost("localhost")
                    .withRepositoryPort(8080)
                    .withRepositoryPwd("xxW0rd")
                    .withRepositoryProtocol("http")
                    .withRepositorySecure("p@secure").build();

            SystemRelease systemRelease = SystemRelease.SystemReleaseBuilder.aSystemRelease()
                    .withAddedDate(new Date())
                    .withSystemReleaseName("cqshared")
                    .withForceUpdate(true)
                    .withBeta(true)
                    .withReleaseDate(new Date())
                    .withModifiedDate(new Date())
                    .withSystemReleaseVersion("4.6")
                    .build();

            Set<SystemRelease> systemReleases = new LinkedHashSet<SystemRelease>();
            systemReleases.add(systemRelease);

            //systemReleaseDAO.save(systemRelease);

            softwareMatrix.setSystemReleaseSet(systemReleases);

            softwareMatrixDAO.save(softwareMatrix);
        } catch (Exception ex) {
            logger.info("Error creating the software matrix: " + ex.toString());
        }
        logger.info(" succesfully created! (id = " + softwareMatrix.getId() + ")");
    }



    @Test
    public void find() {
        List list = (List)softwareMatrixDAO.findAll();
        //assertNotEmpty

    }

    @Test
    public void findById() {
        SoftwareMatrix softwareMatrix = (SoftwareMatrix)softwareMatrixDAO.findOne(new Long(1));
        //assertNotEmpty

    }

    @Test
    public void update() {
        SoftwareMatrix softwareMatrix = (SoftwareMatrix)softwareMatrixDAO.findOne(new Long(1));
        softwareMatrix.setRepositoryPort(8089);
        softwareMatrixDAO.save(softwareMatrix);
    }

    @Test
    public void delete() {
        SoftwareMatrix softwareMatrix = (SoftwareMatrix)softwareMatrixDAO.findOne(new Long(1));
        softwareMatrixDAO.delete(softwareMatrix);
    }

}
