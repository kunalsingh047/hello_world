pipeline{
    agent any
    stages{
        stage('SCM'){
            steps{
                git 'https://github.com/kunalsingh047/hello_world.git'
            }
        }
        stage('input from user'){
            steps{
                input('do you want to proceed')
            }
        }
        stage('Build'){
            steps{
                withMaven(maven : 'maven-3'){
                sh 'mvn clean package test'
                }
            }
        }
    }
            
}
