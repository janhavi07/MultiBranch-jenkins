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
         always {
                jacoco maximumBranchCoverage: '50', maximumClassCoverage: '60', maximumComplexityCoverage: '60', maximumLineCoverage: '60', maximumMethodCoverage: '60', runAlways: true
         }
   }
}


