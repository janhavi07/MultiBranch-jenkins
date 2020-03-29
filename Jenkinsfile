pipeline {
    agent any
       triggers {
              cron('H/15 * * * *')
       }
       stages {
            stage(' Build') {
                steps {
                    retry(2) {
                        sh './gradlew build'
                    }
                }
            }
            stage('Test') {
                steps {
                    sh './gradlew test'
                    junit allowEmptyResults: true ,testResults:'  /Users/janhavi.parte/Desktop/Multibranch/build/test-results/test/*.xml'
            }
        }
    }

   post {
        //success {
          //  emailext body: 'BUILD WAS SUCCESSFULL', subject: 'Test build', to: 'janhavi.parte@thoughtworks.com'
        //}
        success {
                mail to: 'janhavi.parte@thoughtworks.com',
                     subject: "Pipeline Status : ${currentBuild.fullDisplayName}",
                     body: "Check with : ${env.BUILD_URL}"
            }
   }
}


