pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn compile'
            }
        }
        stage('CodeReview'){
             steps{
                 sh 'mvn pmd:pmd'
             }
             post{
                  always{
                     pmd pattern: 'target/pmd.xml'
                  }
             }
        }

        stage('Test'){
            steps{
                sh 'mvn test'
            }
            post{
                always{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('MetriCheck'){
             agent any
                 steps{
                    sh 'mvn cobertura:cobertura -Dcobertura.report.format=xml'
                 }
                 post{
                   always{
                      cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
                    }
                 }
        }
        stage('Package'){
              agent any
                 steps{
                    sh 'mvn package'
                 }
        }


        stage('Container') {
            steps {
                sh 'mkdir docker-file'
                sh 'cd docker-file'
                sh 'cp /var/lib/jenkins/workspace/mycertProj@2/target/*.jar  .'
                sh 'sudo docker build -t --privileged=true CalculateTaxApplication:$BUILD_NUMBER /var/lib/jenkins/workspace/mycertProj@2/.'
                sh 'sudo docker run -itd -P CalculateTaxApplication:$BUILD_NUMBER'
            }
        }


    }
}
