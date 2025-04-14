package com.drewjya.crud_api.service

import com.drewjya.crud_api.entity.Project
import com.drewjya.crud_api.repository.ProjectRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProjectService(var projectRepository: ProjectRepository) {

    fun getAllProjects(): List<Project> {
        return projectRepository.findAll()
    }

    fun getProjectById(id: Long): Project? {
        return projectRepository.findById(id).orElse(null)
    }

    fun createProject(project: Project): Project {
        return projectRepository.save(project)
    }

    fun updateProject(id: Long, project: Project): Project? {
        if (projectRepository.findByIdOrNull(id) != null) {

            return projectRepository.save(project)
        }
        return null
    }

    fun deleteProject(id: Long) {
        projectRepository.deleteById(id)
    }
}