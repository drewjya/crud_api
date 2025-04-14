package com.drewjya.crud_api.controller

import com.drewjya.crud_api.entity.Project
import com.drewjya.crud_api.service.ProjectService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/projects")
class ProjectsController(val projectService: ProjectService) {


     @GetMapping
     fun getAllProjects(): List<Project> {
         return projectService.getAllProjects()
     }

    // @PostMapping
    // fun createProject(@RequestBody project: Project): Project {
    //     return projectService.createProject(project)
    // }

    // Add more endpoints as needed
}