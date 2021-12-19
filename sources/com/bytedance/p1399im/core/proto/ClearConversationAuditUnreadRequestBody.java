package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody */
public final class ClearConversationAuditUnreadRequestBody extends Message<ClearConversationAuditUnreadRequestBody, Builder> {
    public static final ProtoAdapter<ClearConversationAuditUnreadRequestBody> ADAPTER;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conv_short_id")
    public final Long conv_short_id;

    /* renamed from: com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody$ProtoAdapter_ClearConversationAuditUnreadRequestBody */
    static final class ProtoAdapter_ClearConversationAuditUnreadRequestBody extends ProtoAdapter<ClearConversationAuditUnreadRequestBody> {
        static {
            Covode.recordClassIndex(22979);
        }

        public ProtoAdapter_ClearConversationAuditUnreadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ClearConversationAuditUnreadRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadRequestBody redact(com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ClearConversationAuditUnreadRequestBody.ProtoAdapter_ClearConversationAuditUnreadRequestBody.redact(com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody):com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody");
        }

        public final int encodedSize(ClearConversationAuditUnreadRequestBody clearConversationAuditUnreadRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, clearConversationAuditUnreadRequestBody.conv_short_id) + clearConversationAuditUnreadRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClearConversationAuditUnreadRequestBody decode(ProtoReader protoReader) {
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
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ClearConversationAuditUnreadRequestBody clearConversationAuditUnreadRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, clearConversationAuditUnreadRequestBody.conv_short_id);
            protoWriter.writeBytes(clearConversationAuditUnreadRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody$Builder */
    public static final class Builder extends Message.Builder<ClearConversationAuditUnreadRequestBody, Builder> {
        public Long conv_short_id;

        static {
            Covode.recordClassIndex(22978);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ClearConversationAuditUnreadRequestBody build() {
            return new ClearConversationAuditUnreadRequestBody(this.conv_short_id, super.buildUnknownFields());
        }

        public final Builder conv_short_id(Long l) {
            this.conv_short_id = l;
            return this;
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2029, ADAPTER);
    }

    static {
        Covode.recordClassIndex(22977);
        ProtoAdapter_ClearConversationAuditUnreadRequestBody protoAdapter_ClearConversationAuditUnreadRequestBody = new ProtoAdapter_ClearConversationAuditUnreadRequestBody();
        ADAPTER = protoAdapter_ClearConversationAuditUnreadRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2029, protoAdapter_ClearConversationAuditUnreadRequestBody);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ClearConversationAuditUnreadRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = this.conv_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ClearConversationAuditUnreadRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ClearConversationAuditUnreadRequestBody(Long l) {
        this(l, C89427i.EMPTY);
    }

    public ClearConversationAuditUnreadRequestBody(Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = l;
    }
}
