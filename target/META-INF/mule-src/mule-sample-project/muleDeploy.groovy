muleDeploy {
    // version of the tool
    version '1.0'

    apiSpecification {
        name 'Mule Sample Project TS'
        exchangeAssetId 'Mule Sample Project TS-spec'
    }

    policies {
        clientEnforcementPolicyBasic {
            // version is optional (will use version in this library by default)
            version '1.2.1'
        }
    }

    enabledFeatures {
        /* 
        available features: designCenterSync, apiManagerDefinitions, policySync and AppDeployment
        */
        designCenterSync
        apiManagerDefinitions
        policySync
        AppDeployment
    
    }


    /* 
        This model is not in use because 'AppDeployment' is not provided in the enabledFeatures object. however, the mule deploy library needs this
        model to build successfully
    */
    cloudHubApplication {
        environment params.env
        file params.appArtifact
        cryptoKey params.cryptoKey
        autoDiscovery {
            clientId params.autoDiscClientId
            clientSecret params.autoDiscClientSecret
        }
        cloudHubAppPrefix 'OIA'
    }
}