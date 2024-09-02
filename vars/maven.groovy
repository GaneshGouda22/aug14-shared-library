def call() {
    pipeline {
        agent any
        tools {
            maven "${config.maven}"
        }
        stages {
            stage('GIT') {
                steps {
                    git url: "${config.url}",
                        branch: "${config.branch}"
                }
            }
            stage('build') {
                steps {
                    sh "mvn ${config.goals}"
                }
            }
            
        }
    
}
}