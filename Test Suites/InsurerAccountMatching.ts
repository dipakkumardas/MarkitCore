<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>This is Insurer Account matching</description>
   <name>InsurerAccountMatching</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>ad9ce6c8-cd22-4798-8be3-bc50f21a016f</testSuiteGuid>
   <testCaseLink>
      <guid>26aaf45b-de66-4c92-ad53-bc349913ee5d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC01-LoginApplication</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>8dfd28fe-95a5-445a-964f-d16a999236c3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC08-AccountMatching-Insurer</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>eb072304-1c1b-43d2-aa6f-5f3e96683504</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>eb072304-1c1b-43d2-aa6f-5f3e96683504</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>9c444b3f-d0a5-404e-8ee7-275bdacb4cf9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>9d93b673-7709-4a73-b87a-02d76ead2e0d</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
