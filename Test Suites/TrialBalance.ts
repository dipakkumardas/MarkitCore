<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TrialBalance</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>a4cd09bb-aea8-476c-9d57-402a07840a9c</testSuiteGuid>
   <testCaseLink>
      <guid>9ebee200-19eb-4630-be04-07f4a657690f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC01-LoginApplication</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>6d22ef19-6fb9-44aa-83a0-dba1237740f6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC11-TrialBalance-MGA</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>79f4a0f1-efe8-4856-92fd-49ac53733660</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>53846ce5-1ccf-4ecf-b6b0-5b03ea33bb5c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MGAComission</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>79f4a0f1-efe8-4856-92fd-49ac53733660</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>ae96ae78-a819-4ed5-ac37-efc3340de41e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>53846ce5-1ccf-4ecf-b6b0-5b03ea33bb5c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>MGA Comission</value>
         <variableId>e76654a4-aa32-41ca-897e-c7bd7248a016</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3a1c9475-a2ba-4204-a0ba-346fd636fe72</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC12-TrialBalance-Insurer</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
