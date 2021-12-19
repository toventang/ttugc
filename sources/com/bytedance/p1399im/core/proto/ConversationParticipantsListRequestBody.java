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

/* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListRequestBody */
public final class ConversationParticipantsListRequestBody extends Message<ConversationParticipantsListRequestBody, Builder> {
    public static final ProtoAdapter<ConversationParticipantsListRequestBody> ADAPTER = new ProtoAdapter_ConversationParticipantsListRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 100;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "cursor")
    public final Long cursor;
    @AbstractC27891c(mo46611a = "limit")
    public final Integer limit;

    /* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListRequestBody$ProtoAdapter_ConversationParticipantsListRequestBody */
    static final class ProtoAdapter_ConversationParticipantsListRequestBody extends ProtoAdapter<ConversationParticipantsListRequestBody> {
        static {
            Covode.recordClassIndex(23049);
        }

        public ProtoAdapter_ConversationParticipantsListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantsListRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationParticipantsListRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationParticipantsListRequestBody redact(com.bytedance.p1399im.core.proto.ConversationParticipantsListRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationParticipantsListRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationParticipantsListRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationParticipantsListRequestBody.ProtoAdapter_ConversationParticipantsListRequestBody.redact(com.bytedance.im.core.proto.ConversationParticipantsListRequestBody):com.bytedance.im.core.proto.ConversationParticipantsListRequestBody");
        }

        public final int encodedSize(ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationParticipantsListRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationParticipantsListRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationParticipantsListRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationParticipantsListRequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(5, conversationParticipantsListRequestBody.limit) + conversationParticipantsListRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationParticipantsListRequestBody decode(ProtoReader protoReader) {
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
                } else if (nextTag == 4) {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.limit(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationParticipantsListRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationParticipantsListRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationParticipantsListRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationParticipantsListRequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, conversationParticipantsListRequestBody.limit);
            protoWriter.writeBytes(conversationParticipantsListRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationParticipantsListRequestBody$Builder */
    public static final class Builder extends Message.Builder<ConversationParticipantsListRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long cursor;
        public Integer limit;

        static {
            Covode.recordClassIndex(23048);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationParticipantsListRequestBody build() {
            return new ConversationParticipantsListRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.cursor, this.limit, super.buildUnknownFields());
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

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationParticipantsListRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23047);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationParticipantsListRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationParticipantsListRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2) {
        this(str, l, num, l2, num2, C89427i.EMPTY);
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.cursor = l2;
        this.limit = num2;
    }
}
