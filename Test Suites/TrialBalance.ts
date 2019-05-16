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
      <isRun>true</isRun>
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
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>5fc2114f-0aab-482c-9928-bae896732c6d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MGATrialBalance</testDataId>
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
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC12-TrialBalance-Insurer</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b8d59265-d65f-4764-ae54-67adbf6f1819</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>53bd0836-408c-4f1c-a75c-a1b72a6c975a</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/InsurerComission</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>53bd0836-408c-4f1c-a75c-a1b72a6c975a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Insurer Comission</value>
         <variableId>e6fe6a04-a39e-43d3-b52c-5802ed129f4e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b8d59265-d65f-4764-ae54-67adbf6f1819</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>1a56ecc2-62f1-426b-97b1-68b4817351d1</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c7576fcf-e70a-47b8-b22e-388e21c23e23</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC13-TrialBalance-Broker</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1c880311-92c1-42cf-b59a-34b096c07e55</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>5082f4e2-f9c2-415d-8a3a-96e0553687c6</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/BrokerComission</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>5082f4e2-f9c2-415d-8a3a-96e0553687c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>BrokerComission</value>
         <variableId>095b248a-29c5-4901-8367-4b2f0ed64117</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1c880311-92c1-42cf-b59a-34b096c07e55</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>c8c65c13-9650-4ac0-a4ec-50495dcb164a</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
