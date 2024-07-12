def call(String podTemplatePath, String cloud, Closure body) {
    def label = "custom-${UUID.randomUUID().toString()}"
    def podYaml = libraryResource podTemplatePath

    podTemplate(name: 'custom', label: label, yaml: podYaml, cloud: cloud)
    {
        node(label) {
            body()
        }
    }
}
