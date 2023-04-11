 pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                echo 'Cleaning the project for you said'
            }
        }
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