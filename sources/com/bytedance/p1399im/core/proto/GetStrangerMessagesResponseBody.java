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

/* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesResponseBody */
public final class GetStrangerMessagesResponseBody extends Message<GetStrangerMessagesResponseBody, Builder> {
    public static final ProtoAdapter<GetStrangerMessagesResponseBody> ADAPTER = new ProtoAdapter_GetStrangerMessagesResponseBody();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "messages")
    public final List<MessageBody> messages;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesResponseBody$ProtoAdapter_GetStrangerMessagesResponseBody */
    static final class ProtoAdapter_GetStrangerMessagesResponseBody extends ProtoAdapter<GetStrangerMessagesResponseBody> {
        static {
            Covode.recordClassIndex(23229);
        }

        public ProtoAdapter_GetStrangerMessagesResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerMessagesResponseBody.class);
        }

        public final int encodedSize(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(3, getStrangerMessagesResponseBody.messages) + getStrangerMessagesResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetStrangerMessagesResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetStrangerMessagesResponseBody redact(com.bytedance.p1399im.core.proto.GetStrangerMessagesResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetStrangerMessagesResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.p1399im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetStrangerMessagesResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetStrangerMessagesResponseBody.ProtoAdapter_GetStrangerMessagesResponseBody.redact(com.bytedance.im.core.proto.GetStrangerMessagesResponseBody):com.bytedance.im.core.proto.GetStrangerMessagesResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerMessagesResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getStrangerMessagesResponseBody.messages);
            protoWriter.writeBytes(getStrangerMessagesResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesResponseBody$Builder */
    public static final class Builder extends Message.Builder<GetStrangerMessagesResponseBody, Builder> {
        public List<MessageBody> messages = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23228);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetStrangerMessagesResponseBody build() {
            return new GetStrangerMessagesResponseBody(this.messages, super.buildUnknownFields());
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23227);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetStrangerMessagesResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetStrangerMessagesResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetStrangerMessagesResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list) {
        this(list, C89427i.EMPTY);
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
