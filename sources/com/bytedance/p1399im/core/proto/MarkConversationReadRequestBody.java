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

/* renamed from: com.bytedance.im.core.proto.MarkConversationReadRequestBody */
public final class MarkConversationReadRequestBody extends Message<MarkConversationReadRequestBody, Builder> {
    public static final ProtoAdapter<MarkConversationReadRequestBody> ADAPTER = new ProtoAdapter_MarkConversationReadRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_UNREAD_COUNT = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final Long DEFAULT_READ_MESSAGE_INDEX = 0L;
    public static final Long DEFAULT_READ_MESSAGE_INDEX_V2 = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conv_unread_count")
    public final Long conv_unread_count;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "read_badge_count")
    public final Integer read_badge_count;
    @AbstractC27891c(mo46611a = "read_message_index")
    public final Long read_message_index;
    @AbstractC27891c(mo46611a = "read_message_index_v2")
    public final Long read_message_index_v2;
    @AbstractC27891c(mo46611a = "server_message_id")
    public final Long server_message_id;
    @AbstractC27891c(mo46611a = "ticket")
    public final String ticket;
    @AbstractC27891c(mo46611a = "total_unread_count")
    public final Long total_unread_count;

    /* renamed from: com.bytedance.im.core.proto.MarkConversationReadRequestBody$ProtoAdapter_MarkConversationReadRequestBody */
    static final class ProtoAdapter_MarkConversationReadRequestBody extends ProtoAdapter<MarkConversationReadRequestBody> {
        static {
            Covode.recordClassIndex(23268);
        }

        public ProtoAdapter_MarkConversationReadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkConversationReadRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkConversationReadRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MarkConversationReadRequestBody redact(com.bytedance.p1399im.core.proto.MarkConversationReadRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkConversationReadRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkConversationReadRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MarkConversationReadRequestBody.ProtoAdapter_MarkConversationReadRequestBody.redact(com.bytedance.im.core.proto.MarkConversationReadRequestBody):com.bytedance.im.core.proto.MarkConversationReadRequestBody");
        }

        public final int encodedSize(MarkConversationReadRequestBody markConversationReadRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, markConversationReadRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, markConversationReadRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, markConversationReadRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, markConversationReadRequestBody.read_message_index) + ProtoAdapter.INT64.encodedSizeWithTag(5, markConversationReadRequestBody.conv_unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(6, markConversationReadRequestBody.total_unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(7, markConversationReadRequestBody.read_message_index_v2) + ProtoAdapter.INT32.encodedSizeWithTag(8, markConversationReadRequestBody.read_badge_count) + ProtoAdapter.STRING.encodedSizeWithTag(9, markConversationReadRequestBody.ticket) + ProtoAdapter.INT64.encodedSizeWithTag(10, markConversationReadRequestBody.server_message_id) + markConversationReadRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.read_message_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.conv_unread_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.total_unread_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.read_message_index_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.read_badge_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.ticket(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MarkConversationReadRequestBody markConversationReadRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markConversationReadRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, markConversationReadRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, markConversationReadRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, markConversationReadRequestBody.read_message_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, markConversationReadRequestBody.conv_unread_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, markConversationReadRequestBody.total_unread_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, markConversationReadRequestBody.read_message_index_v2);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, markConversationReadRequestBody.read_badge_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, markConversationReadRequestBody.ticket);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, markConversationReadRequestBody.server_message_id);
            protoWriter.writeBytes(markConversationReadRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MarkConversationReadRequestBody$Builder */
    public static final class Builder extends Message.Builder<MarkConversationReadRequestBody, Builder> {
        public Long conv_unread_count;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Integer read_badge_count;
        public Long read_message_index;
        public Long read_message_index_v2;
        public Long server_message_id;
        public String ticket;
        public Long total_unread_count;

        static {
            Covode.recordClassIndex(23267);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkConversationReadRequestBody build() {
            return new MarkConversationReadRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.read_message_index, this.conv_unread_count, this.total_unread_count, this.read_message_index_v2, this.read_badge_count, this.ticket, this.server_message_id, super.buildUnknownFields());
        }

        public final Builder conv_unread_count(Long l) {
            this.conv_unread_count = l;
            return this;
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

        public final Builder read_badge_count(Integer num) {
            this.read_badge_count = num;
            return this;
        }

        public final Builder read_message_index(Long l) {
            this.read_message_index = l;
            return this;
        }

        public final Builder read_message_index_v2(Long l) {
            this.read_message_index_v2 = l;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder total_unread_count(Long l) {
            this.total_unread_count = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkConversationReadRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23266);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkConversationReadRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkConversationReadRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.read_message_index = this.read_message_index;
        builder.conv_unread_count = this.conv_unread_count;
        builder.total_unread_count = this.total_unread_count;
        builder.read_message_index_v2 = this.read_message_index_v2;
        builder.read_badge_count = this.read_badge_count;
        builder.ticket = this.ticket;
        builder.server_message_id = this.server_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MarkConversationReadRequestBody(String str, Long l, Integer num, Long l2, Long l3, Long l4, Long l5, Integer num2, String str2, Long l6) {
        this(str, l, num, l2, l3, l4, l5, num2, str2, l6, C89427i.EMPTY);
    }

    public MarkConversationReadRequestBody(String str, Long l, Integer num, Long l2, Long l3, Long l4, Long l5, Integer num2, String str2, Long l6, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.read_message_index = l2;
        this.conv_unread_count = l3;
        this.total_unread_count = l4;
        this.read_message_index_v2 = l5;
        this.read_badge_count = num2;
        this.ticket = str2;
        this.server_message_id = l6;
    }
}
