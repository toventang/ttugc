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

/* renamed from: com.bytedance.im.core.proto.GetMessageByIdRequestBody */
public final class GetMessageByIdRequestBody extends Message<GetMessageByIdRequestBody, Builder> {
    public static final ProtoAdapter<GetMessageByIdRequestBody> ADAPTER = new ProtoAdapter_GetMessageByIdRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "server_message_id")
    public final Long server_message_id;

    /* renamed from: com.bytedance.im.core.proto.GetMessageByIdRequestBody$ProtoAdapter_GetMessageByIdRequestBody */
    static final class ProtoAdapter_GetMessageByIdRequestBody extends ProtoAdapter<GetMessageByIdRequestBody> {
        static {
            Covode.recordClassIndex(23190);
        }

        public ProtoAdapter_GetMessageByIdRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageByIdRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetMessageByIdRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetMessageByIdRequestBody redact(com.bytedance.p1399im.core.proto.GetMessageByIdRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetMessageByIdRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessageByIdRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetMessageByIdRequestBody.ProtoAdapter_GetMessageByIdRequestBody.redact(com.bytedance.im.core.proto.GetMessageByIdRequestBody):com.bytedance.im.core.proto.GetMessageByIdRequestBody");
        }

        public final int encodedSize(GetMessageByIdRequestBody getMessageByIdRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageByIdRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageByIdRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessageByIdRequestBody.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, getMessageByIdRequestBody.server_message_id) + getMessageByIdRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageByIdRequestBody decode(ProtoReader protoReader) {
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
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessageByIdRequestBody getMessageByIdRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageByIdRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageByIdRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessageByIdRequestBody.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getMessageByIdRequestBody.server_message_id);
            protoWriter.writeBytes(getMessageByIdRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetMessageByIdRequestBody$Builder */
    public static final class Builder extends Message.Builder<GetMessageByIdRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long server_message_id;

        static {
            Covode.recordClassIndex(23189);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessageByIdRequestBody build() {
            return new GetMessageByIdRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.server_message_id, super.buildUnknownFields());
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

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23188);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessageByIdRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessageByIdRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.server_message_id = this.server_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessageByIdRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetMessageByIdRequestBody(String str, Integer num, Long l, Long l2) {
        this(str, num, l, l2, C89427i.EMPTY);
    }

    public GetMessageByIdRequestBody(String str, Integer num, Long l, Long l2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
    }
}
