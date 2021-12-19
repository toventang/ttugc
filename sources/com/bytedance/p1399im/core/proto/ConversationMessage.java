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

/* renamed from: com.bytedance.im.core.proto.ConversationMessage */
public final class ConversationMessage extends Message<ConversationMessage, Builder> {
    public static final ProtoAdapter<ConversationMessage> ADAPTER = new ProtoAdapter_ConversationMessage();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversations")
    public final ConversationInfoV2 conversations;
    @AbstractC27891c(mo46611a = "messages")
    public final List<MessageBody> messages;

    /* renamed from: com.bytedance.im.core.proto.ConversationMessage$ProtoAdapter_ConversationMessage */
    static final class ProtoAdapter_ConversationMessage extends ProtoAdapter<ConversationMessage> {
        static {
            Covode.recordClassIndex(23032);
        }

        public ProtoAdapter_ConversationMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationMessage.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ConversationMessage$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationMessage redact(com.bytedance.p1399im.core.proto.ConversationMessage r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationMessage$Builder r2 = r4.newBuilder()
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r1 = com.bytedance.p1399im.core.proto.ConversationInfoV2.ADAPTER
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.conversations
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = (com.bytedance.p1399im.core.proto.ConversationInfoV2) r0
                r2.conversations = r0
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.p1399im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationMessage r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationMessage.ProtoAdapter_ConversationMessage.redact(com.bytedance.im.core.proto.ConversationMessage):com.bytedance.im.core.proto.ConversationMessage");
        }

        public final int encodedSize(ConversationMessage conversationMessage) {
            return ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, conversationMessage.conversations) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(2, conversationMessage.messages) + conversationMessage.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessage decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversations(ConversationInfoV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationMessage conversationMessage) {
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, conversationMessage.conversations);
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, conversationMessage.messages);
            protoWriter.writeBytes(conversationMessage.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23030);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationMessage$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationMessage, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversations = this.conversations;
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationMessage" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationMessage$Builder */
    public static final class Builder extends Message.Builder<ConversationMessage, Builder> {
        public ConversationInfoV2 conversations;
        public List<MessageBody> messages = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23031);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationMessage build() {
            ConversationInfoV2 conversationInfoV2 = this.conversations;
            if (conversationInfoV2 != null) {
                return new ConversationMessage(this.conversations, this.messages, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(conversationInfoV2, "conversations");
        }

        public final Builder conversations(ConversationInfoV2 conversationInfoV2) {
            this.conversations = conversationInfoV2;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    public ConversationMessage(ConversationInfoV2 conversationInfoV2, List<MessageBody> list) {
        this(conversationInfoV2, list, C89427i.EMPTY);
    }

    public ConversationMessage(ConversationInfoV2 conversationInfoV2, List<MessageBody> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversations = conversationInfoV2;
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
