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

/* renamed from: com.bytedance.im.core.proto.ConversationRequest */
public final class ConversationRequest extends Message<ConversationRequest, Builder> {
    public static final ProtoAdapter<ConversationRequest> ADAPTER = new ProtoAdapter_ConversationRequest();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.ConversationRequest$ProtoAdapter_ConversationRequest */
    static final class ProtoAdapter_ConversationRequest extends ProtoAdapter<ConversationRequest> {
        static {
            Covode.recordClassIndex(23064);
        }

        public ProtoAdapter_ConversationRequest() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationRequest.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationRequest$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationRequest redact(com.bytedance.p1399im.core.proto.ConversationRequest r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationRequest$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationRequest r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationRequest.ProtoAdapter_ConversationRequest.redact(com.bytedance.im.core.proto.ConversationRequest):com.bytedance.im.core.proto.ConversationRequest");
        }

        public final int encodedSize(ConversationRequest conversationRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationRequest.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationRequest.conversation_type) + conversationRequest.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRequest decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationRequest conversationRequest) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationRequest.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationRequest.conversation_type);
            protoWriter.writeBytes(conversationRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationRequest$Builder */
    public static final class Builder extends Message.Builder<ConversationRequest, Builder> {
        public Long conversation_short_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(23063);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationRequest build() {
            return new ConversationRequest(this.conversation_short_id, this.conversation_type, super.buildUnknownFields());
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
        Covode.recordClassIndex(23062);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationRequest$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationRequest, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationRequest" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ConversationRequest(Long l, Integer num) {
        this(l, num, C89427i.EMPTY);
    }

    public ConversationRequest(Long l, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
