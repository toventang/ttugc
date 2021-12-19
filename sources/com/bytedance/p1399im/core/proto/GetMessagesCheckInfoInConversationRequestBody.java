package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody */
public final class GetMessagesCheckInfoInConversationRequestBody extends Message<GetMessagesCheckInfoInConversationRequestBody, Builder> {
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody> ADAPTER = new ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CURSOR_REVERSE_BEGIN = 0L;
    public static final Long DEFAULT_CURSOR_REVERSE_END = 0L;
    public static final Integer DEFAULT_EXPECT_MSG_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "cursor_reverse_begin")
    public final Long cursor_reverse_begin;
    @AbstractC27891c(mo46611a = "cursor_reverse_end")
    public final Long cursor_reverse_end;
    @AbstractC27891c(mo46611a = "expect_msg_total_count")
    public final Integer expect_msg_total_count;

    /* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody$ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody */
    static final class ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody extends ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody> {
        static {
            Covode.recordClassIndex(23208);
        }

        public ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoInConversationRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetMessagesCheckInfoInConversationRequestBody redact(com.bytedance.p1399im.core.proto.GetMessagesCheckInfoInConversationRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetMessagesCheckInfoInConversationRequestBody.ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody.redact(com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody):com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody");
        }

        public final int encodedSize(GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(2, getMessagesCheckInfoInConversationRequestBody.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, getMessagesCheckInfoInConversationRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(6, getMessagesCheckInfoInConversationRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_begin) + ProtoAdapter.INT64.encodedSizeWithTag(7, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_end) + ProtoAdapter.INT32.encodedSizeWithTag(4, getMessagesCheckInfoInConversationRequestBody.expect_msg_total_count) + getMessagesCheckInfoInConversationRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesCheckInfoInConversationRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.cursor_reverse_begin(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.expect_msg_total_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.cursor_reverse_end(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMessagesCheckInfoInConversationRequestBody.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getMessagesCheckInfoInConversationRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getMessagesCheckInfoInConversationRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_begin);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_end);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getMessagesCheckInfoInConversationRequestBody.expect_msg_total_count);
            protoWriter.writeBytes(getMessagesCheckInfoInConversationRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody$Builder */
    public static final class Builder extends Message.Builder<GetMessagesCheckInfoInConversationRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long cursor_reverse_begin;
        public Long cursor_reverse_end;
        public Integer expect_msg_total_count;

        static {
            Covode.recordClassIndex(23207);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessagesCheckInfoInConversationRequestBody build() {
            return new GetMessagesCheckInfoInConversationRequestBody(this.conversation_short_id, this.conversation_id, this.conversation_type, this.cursor_reverse_begin, this.cursor_reverse_end, this.expect_msg_total_count, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder cursor_reverse_begin(Long l) {
            this.cursor_reverse_begin = l;
            return this;
        }

        public final Builder cursor_reverse_end(Long l) {
            this.cursor_reverse_end = l;
            return this;
        }

        public final Builder expect_msg_total_count(Integer num) {
            this.expect_msg_total_count = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessagesCheckInfoInConversationRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23206);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessagesCheckInfoInConversationRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.cursor_reverse_begin = this.cursor_reverse_begin;
        builder.cursor_reverse_end = this.cursor_reverse_end;
        builder.expect_msg_total_count = this.expect_msg_total_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2) {
        this(l, str, num, l2, l3, num2, C89427i.EMPTY);
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l;
        this.conversation_id = str;
        this.conversation_type = num;
        this.cursor_reverse_begin = l2;
        this.cursor_reverse_end = l3;
        this.expect_msg_total_count = num2;
    }
}
