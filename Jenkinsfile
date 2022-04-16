pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
             withMaven(maven : 'maven_3.8.5')
                sh 'mvn clean compile' 
            }
        }
        stage('Test') { 
            steps {
             withMaven(maven : 'maven_3.8.5')
                sh 'mvn test'
            }
        }
        stage('Deploy') { 
            steps {
           withMaven(maven : 'maven_3.8.5')
                sh 'mvn deploy'
            }
        }
    }
}