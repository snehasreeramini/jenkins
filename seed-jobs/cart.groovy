freeStyleJob('CI-Pipelines/cart') {
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    steps {
        gradle('clean build')
    }
}