def call(Map config) {
  echo ${config.message}
  node {
    sh '''
      git version
      docker version
      dotnet --list-sdks
      dotnet --list-runtimes
  '''
  }
}