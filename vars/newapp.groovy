def uber('String reposUri'){
  pipeline{
    agent any
    stages{
        stage('1-build'){
                steps{
                    sh 'logname'
                }
        }
        stage('2-Checkout code'){
                steps{
                    git branch: 'main'
                    url: "{$repoUrl}"
        }
    }
        stage('3-closing'){
                steps{
            echo "closing"
        }
    }
        }
        }
}
           