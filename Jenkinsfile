pipeline {
   agent {
     label "${params.AGENT_LABEL ?: 'master'}"
   }
   stages {
     stage('env') {
       steps {
          script {
            if (isUnix()) {
              sh "env|sort"
            } else {
              bat "set"
            }
          }          
       }
     }
     stage('gradle-build') {
       steps {
          script {
            if (isUnix()) {
              sh "./gradlew clean build"
            } else {
              bat "gradlew.bat clean build"
            }
          }          
       }
     }
   }
   post {
     always {
       echo "scuccess"
       recordIssues enabledForFailure: true, tools: [pmdParser(pattern: '**/pmd/main.xml', reportEncoding: 'UTF-8'),
                             spotBugs(pattern: '**/spotbugs/main.xml', reportEncoding: 'UTF-8'),
                             checkStyle(pattern: '**/checkstyle/main.xml', reportEncoding: 'UTF-8')]
     }
  }
}
