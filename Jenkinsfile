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
                    sh './gradlew jacocoTestCoverageVerification'
            }
        }
    }

   post {
        success {
                mail to: 'janhavi.parte@thoughtworks.com',
                     subject: "Pipeline Status : ${currentBuild.fullDisplayName}",
                     body: "Check with : ${env.BUILD_URL}"
                }
         always {
                jacoco maximumBranchCoverage: '60', maximumClassCoverage: '60', maximumComplexityCoverage: '60', maximumLineCoverage: '60', maximumMethodCoverage: '60', runAlways: true
         }
   }
}


