/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.AdditionalProperties;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.flush_synced.Response
public final class FlushSyncedResponse extends AdditionalProperties<String, ShardStatistics> {
	private final ShardStatistics _shards;

	// ---------------------------------------------------------------------------------------------

	protected FlushSyncedResponse(Builder builder) {
		super(builder);
		this._shards = Objects.requireNonNull(builder._shards, "_shards");

	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics _shards() {
		return this._shards;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("_shards");
		this._shards.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushSyncedResponse}.
	 */
	public static class Builder extends AdditionalProperties.AbstractBuilder<String, ShardStatistics, Builder>
			implements
				ObjectBuilder<FlushSyncedResponse> {
		private ShardStatistics _shards;

		/**
		 * API name: {@code _shards}
		 */
		public Builder _shards(ShardStatistics value) {
			this._shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder _shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this._shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FlushSyncedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushSyncedResponse build() {
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new FlushSyncedResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for FlushSyncedResponse
	 */
	public static final JsonpValueParser<FlushSyncedResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, FlushSyncedResponse::setupFlushSyncedResponseParser);

	protected static void setupFlushSyncedResponseParser(DelegatingJsonpValueParser<FlushSyncedResponse.Builder> op) {
		AdditionalProperties.setupAdditionalPropertiesParser(op, JsonpValueParser.stringParser(),
				ShardStatistics.JSONP_PARSER);
		op.add(Builder::_shards, ShardStatistics.JSONP_PARSER, "_shards");

	}

}