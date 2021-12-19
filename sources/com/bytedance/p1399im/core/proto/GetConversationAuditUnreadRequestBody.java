package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody */
public final class GetConversationAuditUnreadRequestBody extends Message<GetConversationAuditUnreadRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationAuditUnreadRequestBody> ADAPTER;
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody$ProtoAdapter_GetConversationAuditUnreadRequestBody */
    static final class ProtoAdapter_GetConversationAuditUnreadRequestBody extends ProtoAdapter<GetConversationAuditUnreadRequestBody> {
        static {
            Covode.recordClassIndex(23148);
        }

        public ProtoAdapter_GetConversationAuditUnreadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditUnreadRequestBody.class);
        }

        public final int encodedSize(GetConversationAuditUnreadRequestBody getConversationAuditUnreadRequestBody) {
            return getConversationAuditUnreadRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetConversationAuditUnreadRequestBody redact(com.bytedance.p1399im.core.proto.GetConversationAuditUnreadRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetConversationAuditUnreadRequestBody.ProtoAdapter_GetConversationAuditUnreadRequestBody.redact(com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody):com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationAuditUnreadRequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, GetConversationAuditUnreadRequestBody getConversationAuditUnreadRequestBody) {
            protoWriter.writeBytes(getConversationAuditUnreadRequestBody.unknownFields());
        }
    }

    public GetConversationAuditUnreadRequestBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody$Builder */
    public static final class Builder extends Message.Builder<GetConversationAuditUnreadRequestBody, Builder> {
        static {
            Covode.recordClassIndex(23147);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationAuditUnreadRequestBody build() {
            return new GetConversationAuditUnreadRequestBody(super.buildUnknownFields());
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2028, ADAPTER);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationAuditUnreadRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationAuditUnreadRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    static {
        Covode.recordClassIndex(23146);
        ProtoAdapter_GetConversationAuditUnreadRequestBody protoAdapter_GetConversationAuditUnreadRequestBody = new ProtoAdapter_GetConversationAuditUnreadRequestBody();
        ADAPTER = protoAdapter_GetConversationAuditUnreadRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2028, protoAdapter_GetConversationAuditUnreadRequestBody);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationAuditUnreadRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetConversationAuditUnreadRequestBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
