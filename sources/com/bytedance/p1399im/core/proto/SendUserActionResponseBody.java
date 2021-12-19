package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.SendUserActionResponseBody */
public final class SendUserActionResponseBody extends Message<SendUserActionResponseBody, Builder> {
    public static final ProtoAdapter<SendUserActionResponseBody> ADAPTER = new ProtoAdapter_SendUserActionResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.SendUserActionResponseBody$ProtoAdapter_SendUserActionResponseBody */
    static final class ProtoAdapter_SendUserActionResponseBody extends ProtoAdapter<SendUserActionResponseBody> {
        static {
            Covode.recordClassIndex(23481);
        }

        public ProtoAdapter_SendUserActionResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendUserActionResponseBody.class);
        }

        public final int encodedSize(SendUserActionResponseBody sendUserActionResponseBody) {
            return sendUserActionResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.SendUserActionResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.SendUserActionResponseBody redact(com.bytedance.p1399im.core.proto.SendUserActionResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SendUserActionResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SendUserActionResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.SendUserActionResponseBody.ProtoAdapter_SendUserActionResponseBody.redact(com.bytedance.im.core.proto.SendUserActionResponseBody):com.bytedance.im.core.proto.SendUserActionResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendUserActionResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SendUserActionResponseBody sendUserActionResponseBody) {
            protoWriter.writeBytes(sendUserActionResponseBody.unknownFields());
        }
    }

    public SendUserActionResponseBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.SendUserActionResponseBody$Builder */
    public static final class Builder extends Message.Builder<SendUserActionResponseBody, Builder> {
        static {
            Covode.recordClassIndex(23480);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SendUserActionResponseBody build() {
            return new SendUserActionResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23479);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SendUserActionResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SendUserActionResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SendUserActionResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public SendUserActionResponseBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
