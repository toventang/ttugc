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
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody */
public final class ConversationMessagePreViewResponseBody extends Message<ConversationMessagePreViewResponseBody, Builder> {
    public static final ProtoAdapter<ConversationMessagePreViewResponseBody> ADAPTER = new ProtoAdapter_ConversationMessagePreViewResponseBody();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "message_result")
    public final List<MessageBody> message_result;

    /* renamed from: com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody$ProtoAdapter_ConversationMessagePreViewResponseBody */
    static final class ProtoAdapter_ConversationMessagePreViewResponseBody extends ProtoAdapter<ConversationMessagePreViewResponseBody> {
        static {
            Covode.recordClassIndex(23038);
        }

        public ProtoAdapter_ConversationMessagePreViewResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationMessagePreViewResponseBody.class);
        }

        public final int encodedSize(ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, conversationMessagePreViewResponseBody.message_result) + conversationMessagePreViewResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationMessagePreViewResponseBody redact(com.bytedance.p1399im.core.proto.ConversationMessagePreViewResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.message_result
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.p1399im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationMessagePreViewResponseBody.ProtoAdapter_ConversationMessagePreViewResponseBody.redact(com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody):com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessagePreViewResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.message_result.add(MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, conversationMessagePreViewResponseBody.message_result);
            protoWriter.writeBytes(conversationMessagePreViewResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody$Builder */
    public static final class Builder extends Message.Builder<ConversationMessagePreViewResponseBody, Builder> {
        public List<MessageBody> message_result = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23037);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationMessagePreViewResponseBody build() {
            return new ConversationMessagePreViewResponseBody(this.message_result, super.buildUnknownFields());
        }

        public final Builder message_result(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.message_result = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23036);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationMessagePreViewResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.message_result = Internal.copyOf("message_result", this.message_result);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationMessagePreViewResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ConversationMessagePreViewResponseBody(List<MessageBody> list) {
        this(list, C89427i.EMPTY);
    }

    public ConversationMessagePreViewResponseBody(List<MessageBody> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.message_result = Internal.immutableCopyOf("message_result", list);
    }
}
