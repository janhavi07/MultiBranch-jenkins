pipeline {
    agent any
    stages {
        stage(' Build') {
            steps {
                sh ' ./gradlew build'
            }
        }
    }
    post {
        success {
            emailext body: 'Succesfully build' recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
                                                   subject: 'Test', to: 'janhavi.parte@thoughtworks.com'
        }
    }
}


