package com.github.mlimwxxnn.matrixtemplate.services

import com.github.mlimwxxnn.matrixtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
