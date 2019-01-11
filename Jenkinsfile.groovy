<<<<<<< HEAD
import jenkins.model.GlobalConfiguration

node {
        label 'proiect'
        ws("/var/lib/jenkins/jobs/DotNET/MyWorkspace"){
        
        stage ('Clone repo') {
          git name: 'Demo',
              branch: 'master',
              credentialsId: 'git',
              url: 'git@github.com:Mozaic33/Demo.git'
        }
    
        stage ('docker build')
        {
            sh "docker-compose build aspnetcoreA7"
        }
        
        stage ('docker up')
        {
           sh "docker-compose up -d --remove-orphans"
        }
        
}
=======
import jenkins.model.GlobalConfiguration

node {
        label 'proiect'
        ws("/var/lib/jenkins/jobs/DotNET/MyWorkspace"){
        
        stage ('Clone repo') {
          git name: 'Demo',
              branch: 'master',
              credentialsId: 'git',
              url: 'git@github.com:Mozaic33/Demo.git'
        }
    
        stage ('docker build')
        {
            sh "docker-compose build aspnetcoreA7"
        }
        
        stage ('docker up')
        {
           sh "docker-compose up -d --remove-orphans"
        }
        
}
>>>>>>> a1f0cc2aa7a80867252688887ac4bfa0f07297d4
}