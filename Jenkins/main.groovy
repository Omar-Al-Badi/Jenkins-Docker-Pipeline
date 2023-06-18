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

<<<<<<< HEAD
        stage('Stop Previous Container') {
=======
        stage('Docker Compose Up') {
>>>>>>> 33bb47ea50a172b18c39404412943cc4903ebefd
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
