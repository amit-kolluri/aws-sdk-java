/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.managedblockchain.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedblockchain.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApprovalThresholdPolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApprovalThresholdPolicyMarshaller {

    private static final MarshallingInfo<Integer> THRESHOLDPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdPercentage").build();
    private static final MarshallingInfo<Integer> PROPOSALDURATIONINHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProposalDurationInHours").build();
    private static final MarshallingInfo<String> THRESHOLDCOMPARATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdComparator").build();

    private static final ApprovalThresholdPolicyMarshaller instance = new ApprovalThresholdPolicyMarshaller();

    public static ApprovalThresholdPolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApprovalThresholdPolicy approvalThresholdPolicy, ProtocolMarshaller protocolMarshaller) {

        if (approvalThresholdPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(approvalThresholdPolicy.getThresholdPercentage(), THRESHOLDPERCENTAGE_BINDING);
            protocolMarshaller.marshall(approvalThresholdPolicy.getProposalDurationInHours(), PROPOSALDURATIONINHOURS_BINDING);
            protocolMarshaller.marshall(approvalThresholdPolicy.getThresholdComparator(), THRESHOLDCOMPARATOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
