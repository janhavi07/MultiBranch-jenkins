pipeline {
    agent any
    stages {
        stage(' Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
    }
   post {
           always {
               junit allowEmptyResults: true, healthScaleFactor: 1.1, testResults: '/build/test-reports/*.xml'
           }
   }
   post {
        success {
            emailext body: 'BUILD WAS SUCCESSFULL', subject: 'Test build', to: 'janhavi.parte@thoughtworks.com'
        }
   }
}


