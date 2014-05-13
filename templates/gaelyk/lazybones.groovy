@Grapes([
    @Grab(group='org.slf4j', module='slf4j-api', version= '1.6.6'),
    @Grab(group='org.slf4j', module='slf4j-simple', version='1.6.6'),
    @Grab(group='uk.co.cacoethes', module='groovy-handlebars-engine', version='0.2')
])
import uk.co.cacoethes.handlebars.HandlebarsTemplateEngine

def hbsEngine = new HandlebarsTemplateEngine()
registerEngine "hbs", hbsEngine
registerDefaultEngine hbsEngine

def props = [:]

props.app_id = ask("Enter application id [gaelyk-app]: ", "gaelyk-app", "app_id")
props.app_version = ask("Enter application version [1]: ", "1", "app_version")
props.gae_version = ask("Enter Google App Engine version [1.9.4]: ", "1.9.4", "gae_version")

processTemplates "src/main/webapp/WEB-INF/appengine-web.xml", props
processTemplates "build.gradle", props


scmExclusions ".DS_Store", "*~", ".idea", "*.iml", "*.iws", "*.ipr", ".project", ".metadata", ".classpath", ".settings/", ".loadpath", ".gradle", ".gradletasknamecache", "/build", "/bin", "/tmp", "/out", "*.class", "*.tmp", "*.bak", "*.swp", "*~.nib", "*.jar", "*.war", "*.ear"