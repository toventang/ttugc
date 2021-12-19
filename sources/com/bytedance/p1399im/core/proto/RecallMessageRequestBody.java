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

/* renamed from: com.bytedance.im.core.proto.RecallMessageRequestBody */
public final class RecallMessageRequestBody extends Message<RecallMessageRequestBody, Builder> {
    public static final ProtoAdapter<RecallMessageRequestBody> ADAPTER = new ProtoAdapter_RecallMessageRequestBody();
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

    /* renamed from: com.bytedance.im.core.proto.RecallMessageRequestBody$ProtoAdapter_RecallMessageRequestBody */
    static final class ProtoAdapter_RecallMessageRequestBody extends ProtoAdapter<RecallMessageRequestBody> {
        static {
            Covode.recordClassIndex(23427);
        }

        public ProtoAdapter_RecallMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, RecallMessageRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.RecallMessageRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.RecallMessageRequestBody redact(com.bytedance.p1399im.core.proto.RecallMessageRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.RecallMessageRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.RecallMessageRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.RecallMessageRequestBody.ProtoAdapter_RecallMessageRequestBody.redact(com.bytedance.im.core.proto.RecallMessageRequestBody):com.bytedance.im.core.proto.RecallMessageRequestBody");
        }

        public final int encodedSize(RecallMessageRequestBody recallMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, recallMessageRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, recallMessageRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, recallMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, recallMessageRequestBody.server_message_id) + recallMessageRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RecallMessageRequestBody decode(ProtoReader protoReader) {
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
                    builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, RecallMessageRequestBody recallMessageRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recallMessageRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, recallMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, recallMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, recallMessageRequestBody.server_message_id);
            protoWriter.writeBytes(recallMessageRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.RecallMessageRequestBody$Builder */
    public static final class Builder extends Message.Builder<RecallMessageRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long server_message_id;

        static {
            Covode.recordClassIndex(23426);
        }

        @Override // com.squareup.wire.Message.Builder
        public final RecallMessageRequestBody build() {
            return new RecallMessageRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.server_message_id, super.buildUnknownFields());
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
        Covode.recordClassIndex(23425);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.RecallMessageRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<RecallMessageRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.server_message_id = this.server_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "RecallMessageRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2) {
        this(str, l, num, l2, C89427i.EMPTY);
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.server_message_id = l2;
    }
}
