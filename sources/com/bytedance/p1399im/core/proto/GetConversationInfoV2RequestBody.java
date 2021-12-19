package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2RequestBody */
public final class GetConversationInfoV2RequestBody extends Message<GetConversationInfoV2RequestBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoV2RequestBody> ADAPTER = new ProtoAdapter_GetConversationInfoV2RequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2RequestBody$ProtoAdapter_GetConversationInfoV2RequestBody */
    static final class ProtoAdapter_GetConversationInfoV2RequestBody extends ProtoAdapter<GetConversationInfoV2RequestBody> {
        static {
            Covode.recordClassIndex(23166);
        }

        public ProtoAdapter_GetConversationInfoV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoV2RequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetConversationInfoV2RequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetConversationInfoV2RequestBody redact(com.bytedance.p1399im.core.proto.GetConversationInfoV2RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationInfoV2RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationInfoV2RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetConversationInfoV2RequestBody.ProtoAdapter_GetConversationInfoV2RequestBody.redact(com.bytedance.im.core.proto.GetConversationInfoV2RequestBody):com.bytedance.im.core.proto.GetConversationInfoV2RequestBody");
        }

        public final int encodedSize(GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getConversationInfoV2RequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationInfoV2RequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, getConversationInfoV2RequestBody.conversation_type) + getConversationInfoV2RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoV2RequestBody decode(ProtoReader protoReader) {
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
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConversationInfoV2RequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationInfoV2RequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getConversationInfoV2RequestBody.conversation_type);
            protoWriter.writeBytes(getConversationInfoV2RequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2RequestBody$Builder */
    public static final class Builder extends Message.Builder<GetConversationInfoV2RequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(23165);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationInfoV2RequestBody build() {
            return new GetConversationInfoV2RequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, super.buildUnknownFields());
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
    }

    static {
        Covode.recordClassIndex(23164);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationInfoV2RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationInfoV2RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationInfoV2RequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num) {
        this(str, l, num, C89427i.EMPTY);
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
