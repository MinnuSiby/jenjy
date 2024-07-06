pipeline {
    agent any

    stages {
        
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('minnuown') {
            steps {
                echo 'minnu own'
            }
        }
        
        
       stage('minnuown2') {
            steps {
                echo 'minnu 2'
            }
        }
    }
       
        post{
            
            always{
                emailext body: '', subject: 'min', to: 'msiby6982@gmail.com'
            }
        }
        
    
}
