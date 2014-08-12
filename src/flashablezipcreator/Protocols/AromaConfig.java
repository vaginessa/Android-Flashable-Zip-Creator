/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.Protocols;

import flashablezipcreator.Core.GroupNode;
import flashablezipcreator.Core.ProjectItemNode;
import flashablezipcreator.Core.ProjectNode;
import flashablezipcreator.Operations.AromaScriptOperations;
import flashablezipcreator.Operations.TreeOperations;

/**
 *
 * @author Nikhil
 */
public class AromaConfig {

    public static TreeOperations to;
    public static AromaScriptOperations op = new AromaScriptOperations();
    public static String aromaConfig = "";
    public static String aromaConfigPath = "META-INF/com/google/android/aroma-config";

    public static String build(ProjectItemNode rootNode) {
        aromaConfig = "";
        to = new TreeOperations(rootNode);
        aromaConfig += op.addSplashString();
        aromaConfig += op.addFontsString();
        aromaConfig += op.addThemesString(rootNode);
        aromaConfig += op.addAgreeBox();
        for (ProjectItemNode project : to.getProjectsSorted(rootNode)) {
            if (((ProjectNode) project).createZip) {
                switch (((ProjectNode) project).projectType) {
                    case ProjectNode.PROJECT_ROM:
                        aromaConfig += buildAdvancedScript((ProjectNode) project);
                        break;
                    case ProjectNode.PROJECT_GAPPS:
                        aromaConfig += buildAdvancedScript((ProjectNode) project);
                        break;
                    case ProjectNode.PROJECT_AROMA:
                        aromaConfig += buildAromaScript((ProjectNode) project);
                        break;
                    //following is not needed. added just in case.
                    case ProjectNode.PROJECT_ADVANCED:
                        break;
                }
            }
        }
        aromaConfig += op.setNextText("Install");
        aromaConfig += op.addCheckViewBox();
        aromaConfig += op.setNextText("Finish");
        aromaConfig += op.addInstallString();
        return aromaConfig;
    }

    public static String buildAromaScript(ProjectNode project) {
        String str = "";
        for (ProjectItemNode group : to.getNodeList(ProjectItemNode.NODE_GROUP)) {
            if (((ProjectNode) group.parent).projectType == ProjectNode.PROJECT_AROMA) {
                str += op.addCheckBox((GroupNode) group);
                str += op.addSelectBox((GroupNode) group);
            }
        }
        return str;
    }

    public static String buildAdvancedScript(ProjectNode project) {
        String str = "";
        switch (project.projectType) {
            case ProjectNode.PROJECT_ROM:
                str += op.addMenuBox(project);
                str += "if prop(\"" + project.title + ".prop\",\"selected\")==\"1\" then\n";
                break;
            case ProjectNode.PROJECT_GAPPS:
                str += op.addMenuBox(project);
                str += "if prop(\"" + project.title + ".prop\",\"selected\")==\"1\" then\n";
                break;
        }
        for (ProjectItemNode group : to.getNodeList(ProjectItemNode.NODE_GROUP)) {
            if (((ProjectNode) group.parent).projectType == project.projectType
                    && ((ProjectNode) group.parent).title.equals(project.title)) {
                str += op.addCheckBox((GroupNode) group);
                str += op.addSelectBox((GroupNode) group);
            }
        }
        return str + "endif;\n";
    }
}
