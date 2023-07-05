freeStyleJob('CI-Pipelines/b_cart') {
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    steps {
        gradle('clean build')
    }

}
