<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>This test case is used to create Policy</description>
   <name>PolicyCreation</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>51bdc993-58a8-4bed-8faa-8d1548539873</testSuiteGuid>
   <testCaseLink>
      <guid>c0be1ba3-4eb4-415a-a7e8-4dd15483441a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC01-LoginApplication</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>3af4f965-9179-4991-89eb-379f548de577</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC02-CreatePolicy</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b45416e5-22e3-43fb-8d6c-e76e16051958</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/TestData/PolicyDetails</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f7464fb7-5c35-46bb-b277-bad18dfa810c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>AlertOption</value>
         <variableId>4a160e9f-3ddb-45ec-a34a-1c92399ce4cb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Currency</value>
         <variableId>7a335c14-2523-474f-9660-1b0df397f8af</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Broker</value>
         <variableId>ac460aaa-deff-4784-8e6a-876c79b220ec</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ProductName</value>
         <variableId>9f9b1647-87ed-440e-acb8-928595f70fb5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyTerm</value>
         <variableId>35a15e9f-5371-4a54-b79c-e7a3489c7c9a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Type</value>
         <variableId>0304b570-553a-4f27-8eca-a5b7948a30fc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>BuildingSumInsure</value>
         <variableId>7d7cf7a2-f3a5-44de-8c03-eec646830c14</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>RoomNo</value>
         <variableId>3fcda662-2e8b-4bc1-b19a-56a4941b99bc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b45416e5-22e3-43fb-8d6c-e76e16051958</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ContentSumInsure</value>
         <variableId>4c187d20-c86a-4ba3-be4f-cd6e18859365</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>8a8ef93e-42b3-4327-bac0-82520ffb8260</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>31afcc48-9ad7-4879-ad29-6d8f0d4de665</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>76c3e2dc-16f2-4fa9-a16d-100cb8d649c9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC05-PaymentSection</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>256a7673-b1ed-4376-a936-f8be37687452</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>256a7673-b1ed-4376-a936-f8be37687452</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>40ee224d-c9c5-4749-8e50-9a6add50ee67</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>d1b1e8f8-17ad-4223-853e-96ce3f7f01a3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC04-AccountMatching-MGA</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>fb4c1793-7b26-4e40-ae60-61ec42f49afc</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>fb4c1793-7b26-4e40-ae60-61ec42f49afc</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>7aa213af-01dc-4774-96b7-8e9d7c39244b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>952df2ad-ec4c-4db0-8918-5c2e7d363865</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>9805e1c8-674b-4c46-b8a2-f194b59f51d1</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>7c501557-811e-4fa5-8d04-7365100ba20e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC07-AccountMatching-Broker</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8c002e69-0c26-425f-8158-c1dc0a5362f5</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>8c002e69-0c26-425f-8158-c1dc0a5362f5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>64c58571-67e7-437e-b14d-21496d6750fc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>43eee103-f51c-49b7-a16d-fc9354890f81</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>7241c9ca-9617-4e94-ab0d-de032419fd7d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f5507a98-aadf-4c89-9001-c11222a664ba</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC08-AccountMatching-Insurer</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>07a49930-f219-447d-bc81-eae27379dafb</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>07a49930-f219-447d-bc81-eae27379dafb</testDataLinkId>
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
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>484a7b71-40a0-4bf2-9b17-fe633797eb6a</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
