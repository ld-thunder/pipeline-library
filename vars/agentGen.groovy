def call(String podTemplatePath, String cloud, String container, Closure body) {
    def label = UUID.randomUUID().toString()
    def podYaml = libraryResource podTemplatePath

    podTemplate(label: label, yaml: podYaml, cloud: cloud)
    {
        node(POD_LABEL) {
            container(container) {
                body()
            }
        }
    }
}
