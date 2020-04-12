pipeline {
    agent any
       stages {
       /*
            stage(' Build') {
                steps {
                    retry(2) {
                        sh './gradlew build'
                    }
                }
            } */
            stage('Test') {
                steps {
                    sh './gradlew jacocoTestCoverageVerification'
                    junit '/Users/janhavi.parte/Desktop/Multibranch/build/test-results/test/TEST-HelloWorldTest.xml'
                    step( [ $class: 'JacocoPublisher' ] )
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
         always {
                junit '/Users/janhavi.parte/Desktop/Multibranch/build/test-results/test/TEST-HelloWorldTest.xml'
         }
   }
}


