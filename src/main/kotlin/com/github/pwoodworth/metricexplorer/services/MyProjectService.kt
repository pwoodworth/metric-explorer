package com.github.pwoodworth.metricexplorer.services

import com.intellij.openapi.project.Project
import com.github.pwoodworth.metricexplorer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
