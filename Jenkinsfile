pipeline{
    agent any
    stages{
       stage('GetCode'){
            steps{
                git 'https://github.com/lgilucam/Proyecto_FinalCSW.git'
            }
         }        
       stage('Build'){
            steps{
                sh 'mvn clean package'
            }
         }
        stage('SonarQube analysis') {
//    def scannerHome = tool 'SonarScanner 4.0';
        steps{
        withSonarQubeEnv('sonarqube-8.9') { 
        // If you have configured more than one global server connection, you can specify its name
//      sh "${scannerHome}/bin/sonar-scanner"
        sh "mvn package verify sonar:sonar -Dsonar.projectKey=sonar_jenkins -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_bbdac8674166a3e7744af8097aab79ecd56261a5"
    }
        }
        }
       
    }
}