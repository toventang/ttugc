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

/* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody */
public final class UpsertConversationCoreExtInfoRequestBody extends Message<UpsertConversationCoreExtInfoRequestBody, Builder> {
    public static final ProtoAdapter<UpsertConversationCoreExtInfoRequestBody> ADAPTER = new ProtoAdapter_UpsertConversationCoreExtInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "ext")
    public final Map<String, String> ext;

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody$ProtoAdapter_UpsertConversationCoreExtInfoRequestBody */
    static final class ProtoAdapter_UpsertConversationCoreExtInfoRequestBody extends ProtoAdapter<UpsertConversationCoreExtInfoRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23531);
        }

        public ProtoAdapter_UpsertConversationCoreExtInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationCoreExtInfoRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.UpsertConversationCoreExtInfoRequestBody redact(com.bytedance.p1399im.core.proto.UpsertConversationCoreExtInfoRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.UpsertConversationCoreExtInfoRequestBody.ProtoAdapter_UpsertConversationCoreExtInfoRequestBody.redact(com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody):com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody");
        }

        public final int encodedSize(UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, upsertConversationCoreExtInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, upsertConversationCoreExtInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, upsertConversationCoreExtInfoRequestBody.conversation_type) + this.ext.encodedSizeWithTag(4, upsertConversationCoreExtInfoRequestBody.ext) + upsertConversationCoreExtInfoRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpsertConversationCoreExtInfoRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ext.putAll(this.ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upsertConversationCoreExtInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, upsertConversationCoreExtInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, upsertConversationCoreExtInfoRequestBody.conversation_type);
            this.ext.encodeWithTag(protoWriter, 4, upsertConversationCoreExtInfoRequestBody.ext);
            protoWriter.writeBytes(upsertConversationCoreExtInfoRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody$Builder */
    public static final class Builder extends Message.Builder<UpsertConversationCoreExtInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();

        static {
            Covode.recordClassIndex(23530);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpsertConversationCoreExtInfoRequestBody build() {
            return new UpsertConversationCoreExtInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.ext, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23529);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpsertConversationCoreExtInfoRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpsertConversationCoreExtInfoRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public UpsertConversationCoreExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map) {
        this(str, l, num, map, C89427i.EMPTY);
    }

    public UpsertConversationCoreExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
