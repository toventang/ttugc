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

/* renamed from: com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody */
public final class CheckMessagesPerUserResponseBody extends Message<CheckMessagesPerUserResponseBody, Builder> {
    public static final ProtoAdapter<CheckMessagesPerUserResponseBody> ADAPTER = new ProtoAdapter_CheckMessagesPerUserResponseBody();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "messages")
    public final List<InboxMessagesPerUserResponseBody> messages;

    /* renamed from: com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody$ProtoAdapter_CheckMessagesPerUserResponseBody */
    static final class ProtoAdapter_CheckMessagesPerUserResponseBody extends ProtoAdapter<CheckMessagesPerUserResponseBody> {
        static {
            Covode.recordClassIndex(22976);
        }

        public ProtoAdapter_CheckMessagesPerUserResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckMessagesPerUserResponseBody.class);
        }

        public final int encodedSize(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            return InboxMessagesPerUserResponseBody.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagesPerUserResponseBody.messages) + checkMessagesPerUserResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.CheckMessagesPerUserResponseBody redact(com.bytedance.p1399im.core.proto.CheckMessagesPerUserResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody> r0 = com.bytedance.p1399im.core.proto.InboxMessagesPerUserResponseBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.CheckMessagesPerUserResponseBody.ProtoAdapter_CheckMessagesPerUserResponseBody.redact(com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody):com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CheckMessagesPerUserResponseBody decode(ProtoReader protoReader) {
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
                    builder.messages.add(InboxMessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            InboxMessagesPerUserResponseBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkMessagesPerUserResponseBody.messages);
            protoWriter.writeBytes(checkMessagesPerUserResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody$Builder */
    public static final class Builder extends Message.Builder<CheckMessagesPerUserResponseBody, Builder> {
        public List<InboxMessagesPerUserResponseBody> messages = Internal.newMutableList();

        static {
            Covode.recordClassIndex(22975);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CheckMessagesPerUserResponseBody build() {
            return new CheckMessagesPerUserResponseBody(this.messages, super.buildUnknownFields());
        }

        public final Builder messages(List<InboxMessagesPerUserResponseBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(22974);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CheckMessagesPerUserResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "CheckMessagesPerUserResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list) {
        this(list, C89427i.EMPTY);
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
