package com.gmaslowski.gradle.plugin.lombok

import org.gradle.api.Plugin
import org.gradle.api.Project

class LombokIntelliJGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.configurations.getByName("idea")
    }
}