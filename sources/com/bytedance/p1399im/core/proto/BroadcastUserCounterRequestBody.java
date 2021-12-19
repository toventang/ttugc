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

/* renamed from: com.bytedance.im.core.proto.BroadcastUserCounterRequestBody */
public final class BroadcastUserCounterRequestBody extends Message<BroadcastUserCounterRequestBody, Builder> {
    public static final ProtoAdapter<BroadcastUserCounterRequestBody> ADAPTER = new ProtoAdapter_BroadcastUserCounterRequestBody();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversations")
    public final List<ConversationRequest> conversations;

    /* renamed from: com.bytedance.im.core.proto.BroadcastUserCounterRequestBody$ProtoAdapter_BroadcastUserCounterRequestBody */
    static final class ProtoAdapter_BroadcastUserCounterRequestBody extends ProtoAdapter<BroadcastUserCounterRequestBody> {
        static {
            Covode.recordClassIndex(22964);
        }

        public ProtoAdapter_BroadcastUserCounterRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BroadcastUserCounterRequestBody.class);
        }

        public final int encodedSize(BroadcastUserCounterRequestBody broadcastUserCounterRequestBody) {
            return ConversationRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, broadcastUserCounterRequestBody.conversations) + broadcastUserCounterRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.BroadcastUserCounterRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BroadcastUserCounterRequestBody redact(com.bytedance.p1399im.core.proto.BroadcastUserCounterRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.BroadcastUserCounterRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationRequest> r1 = r2.conversations
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationRequest> r0 = com.bytedance.p1399im.core.proto.ConversationRequest.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.BroadcastUserCounterRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BroadcastUserCounterRequestBody.ProtoAdapter_BroadcastUserCounterRequestBody.redact(com.bytedance.im.core.proto.BroadcastUserCounterRequestBody):com.bytedance.im.core.proto.BroadcastUserCounterRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BroadcastUserCounterRequestBody decode(ProtoReader protoReader) {
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
                    builder.conversations.add(ConversationRequest.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody) {
            ConversationRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, broadcastUserCounterRequestBody.conversations);
            protoWriter.writeBytes(broadcastUserCounterRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BroadcastUserCounterRequestBody$Builder */
    public static final class Builder extends Message.Builder<BroadcastUserCounterRequestBody, Builder> {
        public List<ConversationRequest> conversations = Internal.newMutableList();

        static {
            Covode.recordClassIndex(22963);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BroadcastUserCounterRequestBody build() {
            return new BroadcastUserCounterRequestBody(this.conversations, super.buildUnknownFields());
        }

        public final Builder conversations(List<ConversationRequest> list) {
            Internal.checkElementsNotNull(list);
            this.conversations = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(22962);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BroadcastUserCounterRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BroadcastUserCounterRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversations = Internal.copyOf("conversations", this.conversations);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BroadcastUserCounterRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public BroadcastUserCounterRequestBody(List<ConversationRequest> list) {
        this(list, C89427i.EMPTY);
    }

    public BroadcastUserCounterRequestBody(List<ConversationRequest> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversations = Internal.immutableCopyOf("conversations", list);
    }
}
