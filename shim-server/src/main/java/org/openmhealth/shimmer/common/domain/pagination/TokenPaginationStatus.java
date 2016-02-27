/*
 * Copyright 2015 Open mHealth
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

package org.openmhealth.shimmer.common.domain.pagination;

import java.util.Optional;


/**
 * Encapsulates information necessary to successfully request the next page of data points for an API that provides a
 * "next page token" as a means of pagination in their responses.
 *
 * @author Chris Schaefbauer
 */
public class TokenPaginationStatus implements PaginationStatus {

    private String nextPageToken;

    @Override
    public boolean hasMoreData() {

        return getPaginationResponseValue().isPresent();
    }

    @Override
    public Optional<String> getPaginationResponseValue() {

        return Optional.ofNullable(nextPageToken);
    }

    @Override
    public void setPaginationResponseValue(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
}