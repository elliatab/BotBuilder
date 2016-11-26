java -jar swagger-codegen-cli-2.2.1.jar generate \
  -i https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector/Swagger/ConnectorAPI.json \
  -l java --library=retrofit2 \
  --api-package com.microsoft.bot.connector.connectorapi \
  --model-package com.microsoft.bot.connector.connectorapi.model \
  --group-id com.microsoft.bot \
  --artifact-id connectorapi \
  --artifact-version 1.0.0 \
  -o ./connector_connectorapi


java -jar swagger-codegen-cli-2.2.1.jar generate \
  -i https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector/Swagger/StateAPI.json \
  -l java --library=retrofit2 \
  --api-package com.microsoft.bot.connector.stateapi \
  --model-package com.microsoft.bot.connector.stateapi.model \
  --group-id com.microsoft.bot \
  --artifact-id stateapi \
  --artifact-version 1.0.0 \
  -o ./connector_stateapi
