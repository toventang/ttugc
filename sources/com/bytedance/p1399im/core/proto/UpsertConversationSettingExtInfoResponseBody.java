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

/* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody */
public final class UpsertConversationSettingExtInfoResponseBody extends Message<UpsertConversationSettingExtInfoResponseBody, Builder> {
    public static final ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> ADAPTER = new ProtoAdapter_UpsertConversationSettingExtInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "check_code")
    public final Long check_code;
    @AbstractC27891c(mo46611a = "check_message")
    public final String check_message;
    @AbstractC27891c(mo46611a = "extra_info")
    public final String extra_info;
    @AbstractC27891c(mo46611a = "setting_info")
    public final ConversationSettingInfo setting_info;
    @AbstractC27891c(mo46611a = "status")
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$ProtoAdapter_UpsertConversationSettingExtInfoResponseBody */
    static final class ProtoAdapter_UpsertConversationSettingExtInfoResponseBody extends ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> {
        static {
            Covode.recordClassIndex(23540);
        }

        public ProtoAdapter_UpsertConversationSettingExtInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationSettingExtInfoResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.UpsertConversationSettingExtInfoResponseBody redact(com.bytedance.p1399im.core.proto.UpsertConversationSettingExtInfoResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = r2.setting_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationSettingInfo> r1 = com.bytedance.p1399im.core.proto.ConversationSettingInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = r2.setting_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = (com.bytedance.p1399im.core.proto.ConversationSettingInfo) r0
                r2.setting_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.UpsertConversationSettingExtInfoResponseBody.ProtoAdapter_UpsertConversationSettingExtInfoResponseBody.redact(com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody):com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody");
        }

        public final int encodedSize(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            return ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationSettingExtInfoResponseBody.setting_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationSettingExtInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationSettingExtInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, upsertConversationSettingExtInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, upsertConversationSettingExtInfoResponseBody.extra_info) + upsertConversationSettingExtInfoResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpsertConversationSettingExtInfoResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.setting_info(ConversationSettingInfo.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 1, upsertConversationSettingExtInfoResponseBody.setting_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upsertConversationSettingExtInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upsertConversationSettingExtInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, upsertConversationSettingExtInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, upsertConversationSettingExtInfoResponseBody.extra_info);
            protoWriter.writeBytes(upsertConversationSettingExtInfoResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$Builder */
    public static final class Builder extends Message.Builder<UpsertConversationSettingExtInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public ConversationSettingInfo setting_info;
        public Integer status;

        static {
            Covode.recordClassIndex(23539);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpsertConversationSettingExtInfoResponseBody build() {
            return new UpsertConversationSettingExtInfoResponseBody(this.setting_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder setting_info(ConversationSettingInfo conversationSettingInfo) {
            this.setting_info = conversationSettingInfo;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23538);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpsertConversationSettingExtInfoResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpsertConversationSettingExtInfoResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.setting_info = this.setting_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2) {
        this(conversationSettingInfo, num, l, str, str2, C89427i.EMPTY);
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.setting_info = conversationSettingInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
