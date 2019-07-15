node{

  stage('GIT'){
    git 'https://github.com/kunalsingh047/hello_world.git'
  }

  stage('BUILD'){
    def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }


  stage('Sonar scanner'){
    def mvnHome = tool name: 'maven-3', type: 'maven'
    withSonarQubeEnv('sonar-7') {
      sh "${mvnHome}/bin/mvn  sonar:sonar"
    }
  }


  stage('Slack Notification'){
    slackSend baseUrl: 'https://hooks.slack.com/services/', channel: 'jenkins', color: 'good', iconEmoji: '', message: 'Hello slak user', teamDomain: 'self', tokenCredentialId: 'slack-id', username: ''
  }
}
