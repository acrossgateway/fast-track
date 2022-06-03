pipeline {
   agent {
     label "${parms.LABEL ?: 'master'}"
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
              bat "./gradlew.bat clean build"
            }
          }          
       }
     }
   }
   post {
     success {
       echo "scuccess"
       recordIssues(tools: [pmdParser(pattern: '**/reports/pmd/main.xml', reportEncoding: 'UTF-8'),
                             spotBugs(pattern: '**/report/spotbugs/main.xml', reportEncoding: 'UTF-8'),
                             spotBugs(pattern: '**/reports/spotbugs/main.xml', reportEncoding: 'UTF-8'),
                             checkStyle(pattern: '**/reports/checkstyle/main.xml', reportEncoding: 'UTF-8')])
     }
  }
}
