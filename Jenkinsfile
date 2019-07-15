node{

  stage('GIT'){
    git 'https://github.com/kunalsingh047/hello_world.git'
  }

  stage('BUILD'){
    def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
