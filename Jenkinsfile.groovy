import jenkins.model.GlobalConfiguration

node {
        label 'proiect'
        ws("/var/lib/jenkins/jobs/${env.JOB_NAME}/MyWorkspace"){
        
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
        stage ('remove untagged images')
	   {
	   sh '''docker rmi $(docker images | grep "^<none>" | awk '{print $3}')'''
	   }
}
}
