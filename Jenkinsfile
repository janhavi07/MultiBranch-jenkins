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
            emailext body: 'A test email' recipientProviders : [[$class: 'DevelopersRecipientProvider'], [$class : 'RequesterRecipientProvider']],
                                                   subject : 'Test'
        }
    }
}


