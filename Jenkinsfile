node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
      sh "mvn clean verify sonar:sonar -Dsonar.projectKey=sonar_jenkins"
  }
}