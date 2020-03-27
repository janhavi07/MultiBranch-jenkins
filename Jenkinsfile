pipeline {
    agent any
    stages {
        stage(' Build') {
            steps {
                sh '''
                ./gradlew build
                gradle test --tests HelloWorldTest
                '''

            }
        }
    }
    post {
        success {
            emailext body: 'BUILD WAS SUCCESSFULL', subject: 'Test build', to: 'janhavi.parte@thoughtworks.com'
        }
    }
}


