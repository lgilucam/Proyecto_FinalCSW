node {
  stage('SCM') {
    checkout scm
  }
  stage('Build') {
   steps{
      sh 'mvn clean package'
     }
  }
  stage('SonarQube Analysis') {
    withSonarQubeEnv() {
      sh "mvn clean verify sonar:sonar -Dsonar.projectKey=sonar_jenkins -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_bbdac8674166a3e7744af8097aab79ecd56261a5"
    }
  }
}