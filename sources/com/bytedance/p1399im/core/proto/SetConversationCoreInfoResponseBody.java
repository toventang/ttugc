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

/* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody */
public final class SetConversationCoreInfoResponseBody extends Message<SetConversationCoreInfoResponseBody, Builder> {
    public static final ProtoAdapter<SetConversationCoreInfoResponseBody> ADAPTER = new ProtoAdapter_SetConversationCoreInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "check_code")
    public final Long check_code;
    @AbstractC27891c(mo46611a = "check_message")
    public final String check_message;
    @AbstractC27891c(mo46611a = "conversation_core_info")
    public final ConversationCoreInfo conversation_core_info;
    @AbstractC27891c(mo46611a = "extra_info")
    public final String extra_info;
    @AbstractC27891c(mo46611a = "status")
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody$ProtoAdapter_SetConversationCoreInfoResponseBody */
    static final class ProtoAdapter_SetConversationCoreInfoResponseBody extends ProtoAdapter<SetConversationCoreInfoResponseBody> {
        static {
            Covode.recordClassIndex(23487);
        }

        public ProtoAdapter_SetConversationCoreInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationCoreInfoResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.SetConversationCoreInfoResponseBody redact(com.bytedance.p1399im.core.proto.SetConversationCoreInfoResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = r2.conversation_core_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationCoreInfo> r1 = com.bytedance.p1399im.core.proto.ConversationCoreInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = r2.conversation_core_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = (com.bytedance.p1399im.core.proto.ConversationCoreInfo) r0
                r2.conversation_core_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.SetConversationCoreInfoResponseBody.ProtoAdapter_SetConversationCoreInfoResponseBody.redact(com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody):com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody");
        }

        public final int encodedSize(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            return ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, setConversationCoreInfoResponseBody.conversation_core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationCoreInfoResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, setConversationCoreInfoResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, setConversationCoreInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, setConversationCoreInfoResponseBody.check_message) + setConversationCoreInfoResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationCoreInfoResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_core_info(ConversationCoreInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, setConversationCoreInfoResponseBody.conversation_core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setConversationCoreInfoResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setConversationCoreInfoResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, setConversationCoreInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setConversationCoreInfoResponseBody.check_message);
            protoWriter.writeBytes(setConversationCoreInfoResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody$Builder */
    public static final class Builder extends Message.Builder<SetConversationCoreInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationCoreInfo conversation_core_info;
        public String extra_info;
        public Integer status;

        static {
            Covode.recordClassIndex(23486);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SetConversationCoreInfoResponseBody build() {
            return new SetConversationCoreInfoResponseBody(this.conversation_core_info, this.status, this.extra_info, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder conversation_core_info(ConversationCoreInfo conversationCoreInfo) {
            this.conversation_core_info = conversationCoreInfo;
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
        Covode.recordClassIndex(23485);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SetConversationCoreInfoResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SetConversationCoreInfoResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_core_info = this.conversation_core_info;
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2) {
        this(conversationCoreInfo, num, str, l, str2, C89427i.EMPTY);
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_core_info = conversationCoreInfo;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
