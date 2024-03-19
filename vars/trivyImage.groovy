def call() {
    sh 'trivy image murali9542/youtube:latest > trivyimage.txt'
}
