#!/usr/bin/env groovy

node
{
stage('Checkout') {
		deleteDir()

		dir('Demo') {
			checkout scm
		}
		sh "pwd"
		}
}