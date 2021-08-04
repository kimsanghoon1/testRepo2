
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CourseManager from "./components/CourseManager"
import ApprovalSystemManager from "./components/ApprovalSystemManager"

import InstructorManager from "./components/InstructorManager"
import VenueManager from "./components/VenueManager"
import ClassManager from "./components/ClassManager"

import CourseList from "./components/CourseList"
import WebSiteManager from "./components/WebSiteManager"

import CalendarManager from "./components/CalendarManager"

import EnrollmentManager from "./components/EnrollmentManager"

import 추천시스템Manager from "./components/추천시스템Manager"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/courses',
                name: 'CourseManager',
                component: CourseManager
            },
            {
                path: '/approvalSystems',
                name: 'ApprovalSystemManager',
                component: ApprovalSystemManager
            },

            {
                path: '/instructors',
                name: 'InstructorManager',
                component: InstructorManager
            },
            {
                path: '/venues',
                name: 'VenueManager',
                component: VenueManager
            },
            {
                path: '/classes',
                name: 'ClassManager',
                component: ClassManager
            },

            {
                path: '/courseLists',
                name: 'CourseList',
                component: CourseList
            },
            {
                path: '/webSites',
                name: 'WebSiteManager',
                component: WebSiteManager
            },

            {
                path: '/calendars',
                name: 'CalendarManager',
                component: CalendarManager
            },

            {
                path: '/enrollments',
                name: 'EnrollmentManager',
                component: EnrollmentManager
            },

            {
                path: '/추천시스템',
                name: '추천시스템Manager',
                component: 추천시스템Manager
            },




    ]
})
