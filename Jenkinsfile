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
                junit allowEmptyResults: true ,testResults :' /Users/janhavi.parte/Desktop/Multibranch/build/test-results/test/*.xml'
            }
        }
    }

   post {
        success {
            emailext body: 'BUILD WAS SUCCESSFULL', subject: 'Test build', to: 'janhavi.parte@thoughtworks.com'
        }
   }
}


