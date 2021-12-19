package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ClientMetric */
public final class ClientMetric extends Message<ClientMetric, Builder> {
    public static final ProtoAdapter<ClientMetric> ADAPTER = new ProtoAdapter_ClientMetric();
    public static final ClientMetricType DEFAULT_METRIC_TYPE = ClientMetricType.COUNTER;
    public static final Long DEFAULT_V = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "k")

    /* renamed from: k */
    public final String f47645k;
    @AbstractC27891c(mo46611a = "metric_type")
    public final ClientMetricType metric_type;
    @AbstractC27891c(mo46611a = "tags")
    public final Map<String, String> tags;
    @AbstractC27891c(mo46611a = "v")

    /* renamed from: v */
    public final Long f47646v;

    /* renamed from: com.bytedance.im.core.proto.ClientMetric$ProtoAdapter_ClientMetric */
    static final class ProtoAdapter_ClientMetric extends ProtoAdapter<ClientMetric> {
        private final ProtoAdapter<Map<String, String>> tags;

        static {
            Covode.recordClassIndex(22994);
        }

        public ProtoAdapter_ClientMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientMetric.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.tags = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ClientMetric$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ClientMetric redact(com.bytedance.p1399im.core.proto.ClientMetric r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ClientMetric$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ClientMetric r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ClientMetric.ProtoAdapter_ClientMetric.redact(com.bytedance.im.core.proto.ClientMetric):com.bytedance.im.core.proto.ClientMetric");
        }

        public final int encodedSize(ClientMetric clientMetric) {
            return ClientMetricType.ADAPTER.encodedSizeWithTag(1, clientMetric.metric_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, clientMetric.f47645k) + ProtoAdapter.INT64.encodedSizeWithTag(3, clientMetric.f47646v) + this.tags.encodedSizeWithTag(4, clientMetric.tags) + clientMetric.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClientMetric decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.metric_type(ClientMetricType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    builder.mo32077k(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.mo32080v(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.tags.putAll(this.tags.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ClientMetric clientMetric) {
            ClientMetricType.ADAPTER.encodeWithTag(protoWriter, 1, clientMetric.metric_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, clientMetric.f47645k);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, clientMetric.f47646v);
            this.tags.encodeWithTag(protoWriter, 4, clientMetric.tags);
            protoWriter.writeBytes(clientMetric.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ClientMetric$Builder */
    public static final class Builder extends Message.Builder<ClientMetric, Builder> {

        /* renamed from: k */
        public String f47647k;
        public ClientMetricType metric_type;
        public Map<String, String> tags = Internal.newMutableMap();

        /* renamed from: v */
        public Long f47648v;

        static {
            Covode.recordClassIndex(22993);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ClientMetric build() {
            return new ClientMetric(this.metric_type, this.f47647k, this.f47648v, this.tags, super.buildUnknownFields());
        }

        /* renamed from: k */
        public final Builder mo32077k(String str) {
            this.f47647k = str;
            return this;
        }

        public final Builder metric_type(ClientMetricType clientMetricType) {
            this.metric_type = clientMetricType;
            return this;
        }

        /* renamed from: v */
        public final Builder mo32080v(Long l) {
            this.f47648v = l;
            return this;
        }

        public final Builder tags(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.tags = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(22992);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ClientMetric" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ClientMetric$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ClientMetric, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.metric_type = this.metric_type;
        builder.f47647k = this.f47645k;
        builder.f47648v = this.f47646v;
        builder.tags = Internal.copyOf("tags", this.tags);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ClientMetric(ClientMetricType clientMetricType, String str, Long l, Map<String, String> map) {
        this(clientMetricType, str, l, map, C89427i.EMPTY);
    }

    public ClientMetric(ClientMetricType clientMetricType, String str, Long l, Map<String, String> map, C89427i iVar) {
        super(ADAPTER, iVar);
        this.metric_type = clientMetricType;
        this.f47645k = str;
        this.f47646v = l;
        this.tags = Internal.immutableCopyOf("tags", map);
    }
}
