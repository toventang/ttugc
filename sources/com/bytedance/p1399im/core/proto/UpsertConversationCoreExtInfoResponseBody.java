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

/* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody */
public final class UpsertConversationCoreExtInfoResponseBody extends Message<UpsertConversationCoreExtInfoResponseBody, Builder> {
    public static final ProtoAdapter<UpsertConversationCoreExtInfoResponseBody> ADAPTER = new ProtoAdapter_UpsertConversationCoreExtInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "check_code")
    public final Long check_code;
    @AbstractC27891c(mo46611a = "check_message")
    public final String check_message;
    @AbstractC27891c(mo46611a = "core_info")
    public final ConversationCoreInfo core_info;
    @AbstractC27891c(mo46611a = "extra_info")
    public final String extra_info;
    @AbstractC27891c(mo46611a = "status")
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody$ProtoAdapter_UpsertConversationCoreExtInfoResponseBody */
    static final class ProtoAdapter_UpsertConversationCoreExtInfoResponseBody extends ProtoAdapter<UpsertConversationCoreExtInfoResponseBody> {
        static {
            Covode.recordClassIndex(23534);
        }

        public ProtoAdapter_UpsertConversationCoreExtInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationCoreExtInfoResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.UpsertConversationCoreExtInfoResponseBody redact(com.bytedance.p1399im.core.proto.UpsertConversationCoreExtInfoResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = r2.core_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationCoreInfo> r1 = com.bytedance.p1399im.core.proto.ConversationCoreInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = r2.core_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = (com.bytedance.p1399im.core.proto.ConversationCoreInfo) r0
                r2.core_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.UpsertConversationCoreExtInfoResponseBody.ProtoAdapter_UpsertConversationCoreExtInfoResponseBody.redact(com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody):com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody");
        }

        public final int encodedSize(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            return ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationCoreExtInfoResponseBody.core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationCoreExtInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationCoreExtInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, upsertConversationCoreExtInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, upsertConversationCoreExtInfoResponseBody.extra_info) + upsertConversationCoreExtInfoResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpsertConversationCoreExtInfoResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.core_info(ConversationCoreInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, upsertConversationCoreExtInfoResponseBody.core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upsertConversationCoreExtInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upsertConversationCoreExtInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, upsertConversationCoreExtInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, upsertConversationCoreExtInfoResponseBody.extra_info);
            protoWriter.writeBytes(upsertConversationCoreExtInfoResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody$Builder */
    public static final class Builder extends Message.Builder<UpsertConversationCoreExtInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationCoreInfo core_info;
        public String extra_info;
        public Integer status;

        static {
            Covode.recordClassIndex(23533);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpsertConversationCoreExtInfoResponseBody build() {
            return new UpsertConversationCoreExtInfoResponseBody(this.core_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder core_info(ConversationCoreInfo conversationCoreInfo) {
            this.core_info = conversationCoreInfo;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23532);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpsertConversationCoreExtInfoResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpsertConversationCoreExtInfoResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.core_info = this.core_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2) {
        this(conversationCoreInfo, num, l, str, str2, C89427i.EMPTY);
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.core_info = conversationCoreInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
