def call() {
    pipeline {
        agent any
        stages {
            stage('GIT') {
                steps {
                    git url: 'https://github.com/spring-projects/spring-petclinic.git',
                        branch: 'main'
                }
            }
            stage('build') {
                steps {
                    sh 'mvn clean package'
                }
            }
            
        }
    
}
}