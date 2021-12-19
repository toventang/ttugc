package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.proto.ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody */
public final class ClearConversationAuditUnreadResponseBody extends Message<ClearConversationAuditUnreadResponseBody, Builder> {
    public static final ProtoAdapter<ClearConversationAuditUnreadResponseBody> ADAPTER;
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody$ProtoAdapter_ClearConversationAuditUnreadResponseBody */
    static final class ProtoAdapter_ClearConversationAuditUnreadResponseBody extends ProtoAdapter<ClearConversationAuditUnreadResponseBody> {
        static {
            Covode.recordClassIndex(22982);
        }

        public ProtoAdapter_ClearConversationAuditUnreadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ClearConversationAuditUnreadResponseBody.class);
        }

        public final int encodedSize(ClearConversationAuditUnreadResponseBody clearConversationAuditUnreadResponseBody) {
            return clearConversationAuditUnreadResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadResponseBody redact(com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadResponseBody.ProtoAdapter_ClearConversationAuditUnreadResponseBody.redact(com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody):com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClearConversationAuditUnreadResponseBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, ClearConversationAuditUnreadResponseBody clearConversationAuditUnreadResponseBody) {
            protoWriter.writeBytes(clearConversationAuditUnreadResponseBody.unknownFields());
        }
    }

    public ClearConversationAuditUnreadResponseBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody$Builder */
    public static final class Builder extends Message.Builder<ClearConversationAuditUnreadResponseBody, Builder> {
        static {
            Covode.recordClassIndex(22981);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ClearConversationAuditUnreadResponseBody build() {
            return new ClearConversationAuditUnreadResponseBody(super.buildUnknownFields());
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2029, ADAPTER);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ClearConversationAuditUnreadResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    static {
        Covode.recordClassIndex(22980);
        ProtoAdapter_ClearConversationAuditUnreadResponseBody protoAdapter_ClearConversationAuditUnreadResponseBody = new ProtoAdapter_ClearConversationAuditUnreadResponseBody();
        ADAPTER = protoAdapter_ClearConversationAuditUnreadResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2029, protoAdapter_ClearConversationAuditUnreadResponseBody);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ClearConversationAuditUnreadResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ClearConversationAuditUnreadResponseBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
