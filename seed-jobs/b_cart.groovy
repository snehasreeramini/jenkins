multibranchPipelineJob('CI-Pipelines/b_cart') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            repository('snehasreeramini/cart')
            scanCredentialsId('Github')
        }
    }
}








freeStyleJob('CI-Pipelines/b_cart') {
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    steps {
        gradle('clean build')
    }

}
