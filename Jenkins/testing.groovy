pipeline {
    agent any

    stages {
        stage('ssh-agent'){
            steps{

                sshagent(['ssh-agent']) {
                    sh 'ssh -tt -o StrictHostKeyChecking=no ubuntu@54.173.41.171'
                    sh 'git clone https://github.com/Omar-Al-Badi/Multi-Container-App.git'
                    sh 'cd Multi-Container-App'
                    sh 'sudo docker compose up'
                }
                
            }
            
        }
        
    }
}
