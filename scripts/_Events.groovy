includeTargets << new File("${jasminePhantomjsPluginDir}/scripts/_RunJavaScriptTests.groovy")

eventTestPhaseEnd = { phase ->
    if (phase == "other") {
        runJsTests()
    }
}