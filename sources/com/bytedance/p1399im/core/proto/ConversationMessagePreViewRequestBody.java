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
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody */
public final class ConversationMessagePreViewRequestBody extends Message<ConversationMessagePreViewRequestBody, Builder> {
    public static final ProtoAdapter<ConversationMessagePreViewRequestBody> ADAPTER = new ProtoAdapter_ConversationMessagePreViewRequestBody();
    public static final Long DEFAULT_CONVERSATION_INDEX = 0L;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conv_short_id")
    public final Long conv_short_id;
    @AbstractC27891c(mo46611a = "conversation_index")
    public final Long conversation_index;
    @AbstractC27891c(mo46611a = "inbox_type")
    public final Integer inbox_type;
    @AbstractC27891c(mo46611a = "message_id")
    public final Long message_id;

    /* renamed from: com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody$ProtoAdapter_ConversationMessagePreViewRequestBody */
    static final class ProtoAdapter_ConversationMessagePreViewRequestBody extends ProtoAdapter<ConversationMessagePreViewRequestBody> {
        static {
            Covode.recordClassIndex(23035);
        }

        public ProtoAdapter_ConversationMessagePreViewRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationMessagePreViewRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationMessagePreViewRequestBody redact(com.bytedance.p1399im.core.proto.ConversationMessagePreViewRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationMessagePreViewRequestBody.ProtoAdapter_ConversationMessagePreViewRequestBody.redact(com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody):com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody");
        }

        public final int encodedSize(ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationMessagePreViewRequestBody.conv_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationMessagePreViewRequestBody.message_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, conversationMessagePreViewRequestBody.conversation_index) + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationMessagePreViewRequestBody.inbox_type) + conversationMessagePreViewRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessagePreViewRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.message_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_index(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationMessagePreViewRequestBody.conv_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationMessagePreViewRequestBody.message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, conversationMessagePreViewRequestBody.conversation_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationMessagePreViewRequestBody.inbox_type);
            protoWriter.writeBytes(conversationMessagePreViewRequestBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23033);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationMessagePreViewRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = this.conv_short_id;
        builder.message_id = this.message_id;
        builder.conversation_index = this.conversation_index;
        builder.inbox_type = this.inbox_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationMessagePreViewRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody$Builder */
    public static final class Builder extends Message.Builder<ConversationMessagePreViewRequestBody, Builder> {
        public Long conv_short_id;
        public Long conversation_index;
        public Integer inbox_type;
        public Long message_id;

        static {
            Covode.recordClassIndex(23034);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationMessagePreViewRequestBody build() {
            Long l = this.conv_short_id;
            if (l != null && this.message_id != null && this.conversation_index != null && this.inbox_type != null) {
                return new ConversationMessagePreViewRequestBody(this.conv_short_id, this.message_id, this.conversation_index, this.inbox_type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "conv_short_id", this.message_id, "message_id", this.conversation_index, "conversation_index", this.inbox_type, "inbox_type");
        }

        public final Builder conv_short_id(Long l) {
            this.conv_short_id = l;
            return this;
        }

        public final Builder conversation_index(Long l) {
            this.conversation_index = l;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder message_id(Long l) {
            this.message_id = l;
            return this;
        }
    }

    public ConversationMessagePreViewRequestBody(Long l, Long l2, Long l3, Integer num) {
        this(l, l2, l3, num, C89427i.EMPTY);
    }

    public ConversationMessagePreViewRequestBody(Long l, Long l2, Long l3, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = l;
        this.message_id = l2;
        this.conversation_index = l3;
        this.inbox_type = num;
    }
}
