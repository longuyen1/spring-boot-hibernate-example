package dk.kimhrac.app.controllers;

import dk.kimhrac.app.entity.SoftwareMatrix;
import dk.kimhrac.app.entity.SystemRelease;
import dk.kimhrac.app.entity.SystemType;
import dk.kimhrac.app.interfaces.SoftwareMatrixDAO;
import dk.kimhrac.app.interfaces.SystemReleaseDAO;
import dk.kimhrac.app.interfaces.SystemTypeDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Controller
public class KimhracController {

    private static Log logger = LogFactory.getLog(KimhracController.class);

    // ==============
    // PRIVATE FIELDS
    // ==============

    @Autowired
    private SystemTypeDAO systemTypeDAO;

    @Autowired
    private SoftwareMatrixDAO softwareMatrixDAO;

    @Autowired
    private SystemReleaseDAO systemReleaseDAO;

    // ==============
    // PUBLIC METHODS
    // ==============

    @RequestMapping("/createSystemType")
    @ResponseBody
    public String createSystemType(String systemTypeName, String systemTypeKey,
            String systemTypeCode) {
        SystemType systemType = null;
        try {
            systemType = SystemType.SystemTypeBuilder.aSystemType()
                    .withSystemTypeName(systemTypeName)
                    .withSystemTypeKey(systemTypeKey)
                    .withSystemTypeCode(systemTypeCode)
                    .withAddedDate(new Date())
                    .withModifiedDate(new Date()).build();

            systemTypeDAO.save(systemType);

        } catch (Exception ex) {
            logger.info("Error creating the system type: " + ex.toString());
            return "Error creating the system type: " + ex.toString();
        }
        logger.info(
                "System Type succesfully created! (id = " + systemType.getId()
                        + ")");
        return "System Type succesfully created! (id = " + systemType.getId()
                + ")";

    }

    @RequestMapping("/soft")
    @ResponseBody
    public String createSoftwareMatrix_SystemRelease() {

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
                    .withRepositorySecure("p@secure").build();

            SystemRelease systemRelease = SystemRelease.SystemReleaseBuilder
                    .aSystemRelease()
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
            return "Error creating the software matrix: " + ex.toString();
        }
        return " succesfully created! (id = " + softwareMatrix.getId() + ")";
    }

    // locale    SystemLocaleMap

}
