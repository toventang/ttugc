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

/* renamed from: com.bytedance.im.core.proto.MessageInfo */
public final class MessageInfo extends Message<MessageInfo, Builder> {
    public static final ProtoAdapter<MessageInfo> ADAPTER = new ProtoAdapter_MessageInfo();
    public static final MessageStatus DEFAULT_STATUS = MessageStatus.AVAILABLE;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "body")
    public final MessageBody body;
    @AbstractC27891c(mo46611a = "status")
    public final MessageStatus status;

    /* renamed from: com.bytedance.im.core.proto.MessageInfo$ProtoAdapter_MessageInfo */
    static final class ProtoAdapter_MessageInfo extends ProtoAdapter<MessageInfo> {
        static {
            Covode.recordClassIndex(23316);
        }

        public ProtoAdapter_MessageInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageInfo.class);
        }

        public final int encodedSize(MessageInfo messageInfo) {
            return MessageStatus.ADAPTER.encodedSizeWithTag(1, messageInfo.status) + MessageBody.ADAPTER.encodedSizeWithTag(2, messageInfo.body) + messageInfo.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MessageInfo$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MessageInfo redact(com.bytedance.p1399im.core.proto.MessageInfo r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessageInfo$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.MessageBody r0 = r2.body
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r1 = com.bytedance.p1399im.core.proto.MessageBody.ADAPTER
                com.bytedance.im.core.proto.MessageBody r0 = r2.body
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MessageBody r0 = (com.bytedance.p1399im.core.proto.MessageBody) r0
                r2.body = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessageInfo r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MessageInfo.ProtoAdapter_MessageInfo.redact(com.bytedance.im.core.proto.MessageInfo):com.bytedance.im.core.proto.MessageInfo");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.status(MessageStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.body(MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessageInfo messageInfo) {
            MessageStatus.ADAPTER.encodeWithTag(protoWriter, 1, messageInfo.status);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, messageInfo.body);
            protoWriter.writeBytes(messageInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessageInfo$Builder */
    public static final class Builder extends Message.Builder<MessageInfo, Builder> {
        public MessageBody body;
        public MessageStatus status;

        static {
            Covode.recordClassIndex(23315);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessageInfo build() {
            return new MessageInfo(this.status, this.body, super.buildUnknownFields());
        }

        public final Builder body(MessageBody messageBody) {
            this.body = messageBody;
            return this;
        }

        public final Builder status(MessageStatus messageStatus) {
            this.status = messageStatus;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23314);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessageInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessageInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.body = this.body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessageInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    public MessageInfo(MessageStatus messageStatus, MessageBody messageBody) {
        this(messageStatus, messageBody, C89427i.EMPTY);
    }

    public MessageInfo(MessageStatus messageStatus, MessageBody messageBody, C89427i iVar) {
        super(ADAPTER, iVar);
        this.status = messageStatus;
        this.body = messageBody;
    }
}
