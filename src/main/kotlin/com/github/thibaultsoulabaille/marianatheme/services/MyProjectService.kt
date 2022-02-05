package com.github.thibaultsoulabaille.marianatheme.services

import com.intellij.openapi.project.Project
import com.github.thibaultsoulabaille.marianatheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
