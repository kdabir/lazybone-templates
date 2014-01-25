@GrabResolver(name="directree", root='http://dl.bintray.com/kdabir/maven') @Grab('directree:directree:0.1')
import static directree.DirTree.create

def props = [:]
props.group = ask("Define value for 'group' [org.example]: ", "org.example", "group")
props.version = ask("Define value for 'version' [0.1]: ", "0.1", "version")

processTemplates "build.gradle", props
scmExclusions ".DS_Store", "*~", ".idea", "*.iml", "*.iws", "*.ipr", ".project", ".metadata", ".classpath", ".settings/", ".loadpath", ".gradle", ".gradletasknamecache", "/build", "/bin", "/tmp", "/out", "*.class", "*.tmp", "*.bak", "*.swp", "*~.nib", "*.jar", "*.war", "*.ear"

create ("$targetDir") {
    dir("src") {
        dir(props.group.replaceAll(/\./,"/")) {
            file("Main.java") {
                """
                |package ${props.group};
                |
                |public class Main {
                |    public static void main(String[] args) {
                |        System.out.println("Hello, World!");
                |    }
                |}
                """.stripMargin()
            }
        }
    }
}
            