def props = [:]

props.app_id = ask("Define value for'app_id' [gaelyk-app]: ", "gaelyk-app", "app_id")
props.app_version = ask("Define value for 'app_version' [1]: ", "1", "app_version")

processTemplates "src/main/webapp/WEB-INF/appengine-web.xml", props

scmExclusions ".DS_Store", "*~", ".idea", "*.iml", "*.iws", "*.ipr", ".project", ".metadata", ".classpath", ".settings/", ".loadpath", ".gradle", ".gradletasknamecache", "/build", "/bin", "/tmp", "/out", "*.class", "*.tmp", "*.bak", "*.swp", "*~.nib", "*.jar", "*.war", "*.ear"