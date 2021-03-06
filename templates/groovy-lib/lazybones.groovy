def props = [:]
props.group = ask("Define value for 'group' [org.example]: ", "org.example", "group")
props.version = ask("Define value for 'version' [0.1]: ", "0.1", "version")

processTemplates "build.gradle", props

scmExclusions ".DS_Store", "*~", ".idea", "*.iml", "*.iws", "*.ipr", ".project", ".metadata", ".classpath", ".settings/", ".loadpath", ".gradle", ".gradletasknamecache", "/build", "/bin", "/tmp", "/out", "*.class", "*.tmp", "*.bak", "*.swp", "*~.nib", "*.jar", "*.war", "*.ear"