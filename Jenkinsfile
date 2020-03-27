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
                sh './gradlew test'
            }
        }
    }
   post {
        success {
            emailext body: 'BUILD WAS SUCCESSFULL', subject: 'Test build', to: 'janhavi.parte@thoughtworks.com'
        }
   }
}


