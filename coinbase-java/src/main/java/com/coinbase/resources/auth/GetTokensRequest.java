/*
 * Copyright 2018 Coinbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.resources.auth;

import androidx.annotation.NonNull;

import com.coinbase.ApiConstants;

/**
 * Get tokens request body parameters.
 */
class GetTokensRequest {

    public final String clientId;
    public final String clientSecret;
    public final String code;
    public final String redirectUri;
    @SuppressWarnings("unused")
    public final String grantType = ApiConstants.AUTHORIZATION_CODE;

    GetTokensRequest(@NonNull String clientId,
                     @NonNull String clientSecret,
                     @NonNull String authCode,
                     @NonNull String redirectUri) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.code = authCode;
        this.redirectUri = redirectUri;
    }
}
