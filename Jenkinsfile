pipeline{
    agent any
    stages{
        stage('compile'){
            steps{
                sh 'mvn compile'
            }
        }
        stage('test'){
            steps{
                sh 'mvn test'
            }
            post{
                always{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

    }

}