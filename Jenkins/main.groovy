pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git(
                    url: 'https://github.com/Omar-Al-Badi/Jenkins-Docker-Pipeline.git',
                    branch: 'main'
                )
            }
        }

        stage('Stop Previous Container') {
            steps {
                script {
                    sh 'docker-compose down'
                }
            }
        }

        stage('Docker Compose Up') {
            steps {
                script {
                    sh 'docker-compose up -d'
                }
            }
        }
    }
}
