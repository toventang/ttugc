package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ClientBatchACKResponseBody */
public final class ClientBatchACKResponseBody extends Message<ClientBatchACKResponseBody, Builder> {
    public static final ProtoAdapter<ClientBatchACKResponseBody> ADAPTER = new ProtoAdapter_ClientBatchACKResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.ClientBatchACKResponseBody$ProtoAdapter_ClientBatchACKResponseBody */
    static final class ProtoAdapter_ClientBatchACKResponseBody extends ProtoAdapter<ClientBatchACKResponseBody> {
        static {
            Covode.recordClassIndex(22991);
        }

        public ProtoAdapter_ClientBatchACKResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientBatchACKResponseBody.class);
        }

        public final int encodedSize(ClientBatchACKResponseBody clientBatchACKResponseBody) {
            return clientBatchACKResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ClientBatchACKResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ClientBatchACKResponseBody redact(com.bytedance.p1399im.core.proto.ClientBatchACKResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ClientBatchACKResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ClientBatchACKResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ClientBatchACKResponseBody.ProtoAdapter_ClientBatchACKResponseBody.redact(com.bytedance.im.core.proto.ClientBatchACKResponseBody):com.bytedance.im.core.proto.ClientBatchACKResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClientBatchACKResponseBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, ClientBatchACKResponseBody clientBatchACKResponseBody) {
            protoWriter.writeBytes(clientBatchACKResponseBody.unknownFields());
        }
    }

    public ClientBatchACKResponseBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.ClientBatchACKResponseBody$Builder */
    public static final class Builder extends Message.Builder<ClientBatchACKResponseBody, Builder> {
        static {
            Covode.recordClassIndex(22990);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ClientBatchACKResponseBody build() {
            return new ClientBatchACKResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(22989);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ClientBatchACKResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ClientBatchACKResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ClientBatchACKResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ClientBatchACKResponseBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
