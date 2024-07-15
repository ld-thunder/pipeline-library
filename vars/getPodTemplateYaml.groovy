def call(String language) {
    def langMap = [
        node: "podtemplates/react/react-test-pod.yml",
        python: "podtemplates/python39/python-test-pod.yml"
    ]
    if (!langMap.containsKey(language)) {
        error("Invalid language specified: ${language}. Valid options are: ${langMap.keySet()}")
    }
    return libraryResource(langMap[language])
}
