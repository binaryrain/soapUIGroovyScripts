/**
* Refer: https://community.smartbear.com/t5/SoapUI-NG/How-to-run-a-specific-testSuite-using-groovy-script/m-p/144456/highlight/false#M32686
*
**/

def suiteNameToExecute = 'TestSuite1'

def runSuite = { suiteName, async = true ->
	def suite = context.testCase.testSuite.project.testSuites[suiteName]
	suite.run([] as StringToObjectMap, async)
}

runSuite(suiteNameToExecute, false)
