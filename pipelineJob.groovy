 pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build by Said'
            }
        }
        stage('Test'){
            steps {
                echo 'Test by RAHHAL'
            }
        }
    }
}