package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.proto.ResponseBody;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.SendConversationApplyResponseBody */
public final class SendConversationApplyResponseBody extends Message<SendConversationApplyResponseBody, Builder> {
    public static final ProtoAdapter<SendConversationApplyResponseBody> ADAPTER;
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "check_code")
    public final Long check_code;
    @AbstractC27891c(mo46611a = "check_message")
    public final String check_message;
    @AbstractC27891c(mo46611a = "status")
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.SendConversationApplyResponseBody$ProtoAdapter_SendConversationApplyResponseBody */
    static final class ProtoAdapter_SendConversationApplyResponseBody extends ProtoAdapter<SendConversationApplyResponseBody> {
        static {
            Covode.recordClassIndex(23462);
        }

        public ProtoAdapter_SendConversationApplyResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendConversationApplyResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.SendConversationApplyResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.SendConversationApplyResponseBody redact(com.bytedance.p1399im.core.proto.SendConversationApplyResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SendConversationApplyResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SendConversationApplyResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.SendConversationApplyResponseBody.ProtoAdapter_SendConversationApplyResponseBody.redact(com.bytedance.im.core.proto.SendConversationApplyResponseBody):com.bytedance.im.core.proto.SendConversationApplyResponseBody");
        }

        public final int encodedSize(SendConversationApplyResponseBody sendConversationApplyResponseBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, sendConversationApplyResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(2, sendConversationApplyResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, sendConversationApplyResponseBody.check_message) + sendConversationApplyResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendConversationApplyResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SendConversationApplyResponseBody sendConversationApplyResponseBody) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, sendConversationApplyResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, sendConversationApplyResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sendConversationApplyResponseBody.check_message);
            protoWriter.writeBytes(sendConversationApplyResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SendConversationApplyResponseBody$Builder */
    public static final class Builder extends Message.Builder<SendConversationApplyResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public Integer status;

        static {
            Covode.recordClassIndex(23461);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SendConversationApplyResponseBody build() {
            return new SendConversationApplyResponseBody(this.status, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2024, ADAPTER);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SendConversationApplyResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SendConversationApplyResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SendConversationApplyResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23460);
        ProtoAdapter_SendConversationApplyResponseBody protoAdapter_SendConversationApplyResponseBody = new ProtoAdapter_SendConversationApplyResponseBody();
        ADAPTER = protoAdapter_SendConversationApplyResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2024, protoAdapter_SendConversationApplyResponseBody);
    }

    public SendConversationApplyResponseBody(Integer num, Long l, String str) {
        this(num, l, str, C89427i.EMPTY);
    }

    public SendConversationApplyResponseBody(Integer num, Long l, String str, C89427i iVar) {
        super(ADAPTER, iVar);
        this.status = num;
        this.check_code = l;
        this.check_message = str;
    }
}
