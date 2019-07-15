node{

  stage('GIT'){
    git 'https://github.com/kunalsingh047/hello_world.git'
  }

  stage('BUILD'){
    def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
  stage('Slack Notification'){
    slackSend baseUrl: 'https://hooks.slack.com/services/', channel: 'jenkins', color: 'good', iconEmoji: '', message: 'Hello slak user', teamDomain: 'self', tokenCredentialId: 'slack-id', username: ''
  }
}
