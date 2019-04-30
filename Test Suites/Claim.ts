<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Claim</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>e2e7ae62-63bd-4969-992f-c7af4c7b4d93</testSuiteGuid>
   <testCaseLink>
      <guid>e98c7374-b17c-4d45-9c7d-fb8fa9d997fc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC01-LoginApplication</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>d7b9f81b-1bd8-4b79-bc30-d34b25570543</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC10-ClaimManagement</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b0484d16-0d7b-4379-b65e-af4f69855a1c</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>b0484d16-0d7b-4379-b65e-af4f69855a1c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>3dde0c9f-e419-4dbc-be24-3a2d43edd9b8</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>5c1771af-05ba-49a6-a3d8-2c8fa65c4655</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
