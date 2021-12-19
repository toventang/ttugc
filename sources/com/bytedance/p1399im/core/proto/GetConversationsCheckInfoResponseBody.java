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

/* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody */
public final class GetConversationsCheckInfoResponseBody extends Message<GetConversationsCheckInfoResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationsCheckInfoResponseBody> ADAPTER = new ProtoAdapter_GetConversationsCheckInfoResponseBody();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_checkinfo_list")
    public final List<ConversationCheckInfo> conversation_checkinfo_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody$ProtoAdapter_GetConversationsCheckInfoResponseBody */
    static final class ProtoAdapter_GetConversationsCheckInfoResponseBody extends ProtoAdapter<GetConversationsCheckInfoResponseBody> {
        static {
            Covode.recordClassIndex(23187);
        }

        public ProtoAdapter_GetConversationsCheckInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationsCheckInfoResponseBody.class);
        }

        public final int encodedSize(GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            return ConversationCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationsCheckInfoResponseBody.conversation_checkinfo_list) + getConversationsCheckInfoResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetConversationsCheckInfoResponseBody redact(com.bytedance.p1399im.core.proto.GetConversationsCheckInfoResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationCheckInfo> r1 = r2.conversation_checkinfo_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationCheckInfo> r0 = com.bytedance.p1399im.core.proto.ConversationCheckInfo.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetConversationsCheckInfoResponseBody.ProtoAdapter_GetConversationsCheckInfoResponseBody.redact(com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody):com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationsCheckInfoResponseBody decode(ProtoReader protoReader) {
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
                    builder.conversation_checkinfo_list.add(ConversationCheckInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            ConversationCheckInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationsCheckInfoResponseBody.conversation_checkinfo_list);
            protoWriter.writeBytes(getConversationsCheckInfoResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody$Builder */
    public static final class Builder extends Message.Builder<GetConversationsCheckInfoResponseBody, Builder> {
        public List<ConversationCheckInfo> conversation_checkinfo_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23186);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationsCheckInfoResponseBody build() {
            return new GetConversationsCheckInfoResponseBody(this.conversation_checkinfo_list, super.buildUnknownFields());
        }

        public final Builder conversation_checkinfo_list(List<ConversationCheckInfo> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_checkinfo_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23185);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationsCheckInfoResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_checkinfo_list = Internal.copyOf("conversation_checkinfo_list", this.conversation_checkinfo_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationsCheckInfoResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list) {
        this(list, C89427i.EMPTY);
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_checkinfo_list = Internal.immutableCopyOf("conversation_checkinfo_list", list);
    }
}
