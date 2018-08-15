node{
	stage('Check out'){
		git 'https://github.com/ram4975/todoservice'
	}
	stage('Test'){
		bat 'mvn test';
		junit 'target/surefire-reports/**/*.xml'
	} 
	stage('Build'){
		bat 'mvn clean package -DskipTests=true';
	} 
}