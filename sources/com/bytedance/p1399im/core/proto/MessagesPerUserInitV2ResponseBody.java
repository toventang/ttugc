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
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody */
public final class MessagesPerUserInitV2ResponseBody extends Message<MessagesPerUserInitV2ResponseBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserInitV2ResponseBody> ADAPTER = new ProtoAdapter_MessagesPerUserInitV2ResponseBody();
    public static final Long DEFAULT_CMD_START_INDEX = 0L;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final InitType DEFAULT_INIT_TYPE = InitType.TYPE_BY_CONVERSATION;
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Long DEFAULT_PER_USER_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "cmd_start_index")
    public final Long cmd_start_index;
    @AbstractC27891c(mo46611a = "conversations")
    public final List<ConversationInfoV2> conversations;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "init_type")
    public final InitType init_type;
    @AbstractC27891c(mo46611a = "messages")
    public final List<MessageBody> messages;
    @AbstractC27891c(mo46611a = "next_conversation_version")
    public final Long next_conversation_version;
    @AbstractC27891c(mo46611a = "next_cursor")
    public final Long next_cursor;
    @AbstractC27891c(mo46611a = "per_user_cursor")
    public final Long per_user_cursor;

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody$ProtoAdapter_MessagesPerUserInitV2ResponseBody */
    static final class ProtoAdapter_MessagesPerUserInitV2ResponseBody extends ProtoAdapter<MessagesPerUserInitV2ResponseBody> {
        static {
            Covode.recordClassIndex(23335);
        }

        public ProtoAdapter_MessagesPerUserInitV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitV2ResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MessagesPerUserInitV2ResponseBody redact(com.bytedance.p1399im.core.proto.MessagesPerUserInitV2ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.p1399im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                java.util.List<com.bytedance.im.core.proto.ConversationInfoV2> r1 = r2.conversations
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r0 = com.bytedance.p1399im.core.proto.ConversationInfoV2.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MessagesPerUserInitV2ResponseBody.ProtoAdapter_MessagesPerUserInitV2ResponseBody.redact(com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody):com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody");
        }

        public final int encodedSize(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserInitV2ResponseBody.messages) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(2, messagesPerUserInitV2ResponseBody.conversations) + ProtoAdapter.INT64.encodedSizeWithTag(3, messagesPerUserInitV2ResponseBody.per_user_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(4, messagesPerUserInitV2ResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(5, messagesPerUserInitV2ResponseBody.has_more) + InitType.ADAPTER.encodedSizeWithTag(6, messagesPerUserInitV2ResponseBody.init_type) + ProtoAdapter.INT64.encodedSizeWithTag(7, messagesPerUserInitV2ResponseBody.cmd_start_index) + ProtoAdapter.INT64.encodedSizeWithTag(8, messagesPerUserInitV2ResponseBody.next_conversation_version) + messagesPerUserInitV2ResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserInitV2ResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.conversations.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.per_user_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            try {
                                builder.init_type(InitType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.cmd_start_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.next_conversation_version(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserInitV2ResponseBody.messages);
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messagesPerUserInitV2ResponseBody.conversations);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messagesPerUserInitV2ResponseBody.per_user_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messagesPerUserInitV2ResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, messagesPerUserInitV2ResponseBody.has_more);
            InitType.ADAPTER.encodeWithTag(protoWriter, 6, messagesPerUserInitV2ResponseBody.init_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, messagesPerUserInitV2ResponseBody.cmd_start_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, messagesPerUserInitV2ResponseBody.next_conversation_version);
            protoWriter.writeBytes(messagesPerUserInitV2ResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody$Builder */
    public static final class Builder extends Message.Builder<MessagesPerUserInitV2ResponseBody, Builder> {
        public Long cmd_start_index;
        public List<ConversationInfoV2> conversations = Internal.newMutableList();
        public Boolean has_more;
        public InitType init_type;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_conversation_version;
        public Long next_cursor;
        public Long per_user_cursor;

        static {
            Covode.recordClassIndex(23334);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessagesPerUserInitV2ResponseBody build() {
            return new MessagesPerUserInitV2ResponseBody(this.messages, this.conversations, this.per_user_cursor, this.next_cursor, this.has_more, this.init_type, this.cmd_start_index, this.next_conversation_version, super.buildUnknownFields());
        }

        public final Builder cmd_start_index(Long l) {
            this.cmd_start_index = l;
            return this;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder init_type(InitType initType) {
            this.init_type = initType;
            return this;
        }

        public final Builder next_conversation_version(Long l) {
            this.next_conversation_version = l;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder per_user_cursor(Long l) {
            this.per_user_cursor = l;
            return this;
        }

        public final Builder conversations(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversations = list;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessagesPerUserInitV2ResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23333);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessagesPerUserInitV2ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.conversations = Internal.copyOf("conversations", this.conversations);
        builder.per_user_cursor = this.per_user_cursor;
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.init_type = this.init_type;
        builder.cmd_start_index = this.cmd_start_index;
        builder.next_conversation_version = this.next_conversation_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool, InitType initType, Long l3, Long l4) {
        this(list, list2, l, l2, bool, initType, l3, l4, C89427i.EMPTY);
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool, InitType initType, Long l3, Long l4, C89427i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.conversations = Internal.immutableCopyOf("conversations", list2);
        this.per_user_cursor = l;
        this.next_cursor = l2;
        this.has_more = bool;
        this.init_type = initType;
        this.cmd_start_index = l3;
        this.next_conversation_version = l4;
    }
}
