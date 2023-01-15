// ================================================================================================
// SonarQube Scanner Settings
// ------------------------------------------------------------------------------------------------

// The name of the SonarQube route.  Used to dynamically get the URL for SonarQube.
def SONAR_ROUTE_NAME = 'sonarqube'

// The name of your SonarQube project
def SONAR_PROJECT_NAME = 'Proyecto_FinalCSW'

// The project key of your SonarQube project
def SONAR_PROJECT_KEY = 'sonar_jenkins'

// The base directory of your project.
// This is relative to the location of the `sonar-runner` directory within your project.
// More accurately this is relative to the Gradle build script(s) that manage the SonarQube Scanning
def SONAR_PROJECT_BASE_DIR = '../'

// The source code directory you want to scan.
// This is relative to the project base directory.
def SONAR_SOURCES = './'
// ================================================================================================

@NonCPS
String getUrlForRoute(String routeName, String projectNameSpace = '') {

  def nameSpaceFlag = ''
  if(projectNameSpace?.trim()) {
    nameSpaceFlag = "-n ${projectNameSpace}"
  }
  
  def url = sh (
    script: "oc get routes ${nameSpaceFlag} -o wide --no-headers | awk \'/${routeName}/{ print match(\$0,/edge/) ?  \"https://\"\$2 : \"http://\"\$2 }\'",
    returnStdout: true
  ).trim()

  return url
}

node {
  stage('SCM') {
    checkout scm
  }
//  stage('SonarQube Analysis') {
 //   withSonarQubeEnv() {
  //    sh "mvn clean verify sonar:sonar -Dsonar.projectKey=sonar_jenkins -Dsonar.projectKey=sonar_jenkins -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_bbdac8674166a3e7744af8097aab79ecd56261a5"
  //  }
  stage('SonarQube Analysis') {
      echo "Performing static SonarQube code analysis ..."

 //     SONARQUBE_URL = getUrlForRoute(SONAR_ROUTE_NAME).trim()
 //     SONARQUBE_PWD = getSonarQubePwd().trim()
      echo "URL: ${SONARQUBE_URL}"
      echo "PWD: ${SONARQUBE_PWD}"

      // The `sonar-runner` MUST exist in your project and contain a Gradle environment consisting of:
      // - Gradle wrapper script(s)
      // - A simple `build.gradle` file that includes the SonarQube plug-in.
      //
      // An example can be found here:
      // - https://github.com/BCDevOps/sonarqube
      //dir('sonar-runner') {
        // ======================================================================================================
        // Set your SonarQube scanner properties at this level, not at the Gradle Build level.
        // The only thing that should be defined at the Gradle Build level is a minimal set of generic defaults.
        //
        // For more information on available properties visit:
        // - https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+Gradle
        // ======================================================================================================
        sh (
        //  returnStdout: true,
          script: "./gradlew sonarqube --stacktrace --info \
            -Dsonar.verbose=true \
            -Dsonar.host.url=${SONARQUBE_URL} \
            -Dsonar.projectName=${SONAR_PROJECT_NAME} \
            -Dsonar.projectKey=${SONAR_PROJECT_KEY} \
            -Dsonar.projectBaseDir=${SONAR_PROJECT_BASE_DIR} \
            -Dsonar.sources=${SONAR_SOURCES}"
        )
      }
      }
      
}