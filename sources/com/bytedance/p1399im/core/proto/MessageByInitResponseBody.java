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

/* renamed from: com.bytedance.im.core.proto.MessageByInitResponseBody */
public final class MessageByInitResponseBody extends Message<MessageByInitResponseBody, Builder> {
    public static final ProtoAdapter<MessageByInitResponseBody> ADAPTER = new ProtoAdapter_MessageByInitResponseBody();
    public static final Long DEFAULT_CMD_INDEX = 0L;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_INIT_VERSION = 0L;
    public static final Long DEFAULT_USER_CURSOR = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "cmd_index")
    public final Long cmd_index;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "messages")
    public final List<ConversationMessage> messages;
    @AbstractC27891c(mo46611a = "next_init_version")
    public final Long next_init_version;
    @AbstractC27891c(mo46611a = "user_cursor")
    public final Long user_cursor;
    @AbstractC27891c(mo46611a = "version")
    public final Long version;

    /* renamed from: com.bytedance.im.core.proto.MessageByInitResponseBody$ProtoAdapter_MessageByInitResponseBody */
    static final class ProtoAdapter_MessageByInitResponseBody extends ProtoAdapter<MessageByInitResponseBody> {
        static {
            Covode.recordClassIndex(23311);
        }

        public ProtoAdapter_MessageByInitResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageByInitResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.MessageByInitResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MessageByInitResponseBody redact(com.bytedance.p1399im.core.proto.MessageByInitResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessageByInitResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationMessage> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationMessage> r0 = com.bytedance.p1399im.core.proto.ConversationMessage.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessageByInitResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MessageByInitResponseBody.ProtoAdapter_MessageByInitResponseBody.redact(com.bytedance.im.core.proto.MessageByInitResponseBody):com.bytedance.im.core.proto.MessageByInitResponseBody");
        }

        public final int encodedSize(MessageByInitResponseBody messageByInitResponseBody) {
            return ConversationMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, messageByInitResponseBody.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, messageByInitResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, messageByInitResponseBody.next_init_version) + ProtoAdapter.INT64.encodedSizeWithTag(4, messageByInitResponseBody.version) + ProtoAdapter.INT64.encodedSizeWithTag(5, messageByInitResponseBody.user_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(6, messageByInitResponseBody.cmd_index) + messageByInitResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageByInitResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(ConversationMessage.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.next_init_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.user_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.cmd_index(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessageByInitResponseBody messageByInitResponseBody) {
            ConversationMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messageByInitResponseBody.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messageByInitResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageByInitResponseBody.next_init_version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageByInitResponseBody.version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messageByInitResponseBody.user_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, messageByInitResponseBody.cmd_index);
            protoWriter.writeBytes(messageByInitResponseBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessageByInitResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.MessageByInitResponseBody$Builder */
    public static final class Builder extends Message.Builder<MessageByInitResponseBody, Builder> {
        public Long cmd_index;
        public Boolean has_more;
        public List<ConversationMessage> messages = Internal.newMutableList();
        public Long next_init_version;
        public Long user_cursor;
        public Long version;

        static {
            Covode.recordClassIndex(23310);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessageByInitResponseBody build() {
            Boolean bool = this.has_more;
            if (bool != null && this.next_init_version != null) {
                return new MessageByInitResponseBody(this.messages, this.has_more, this.next_init_version, this.version, this.user_cursor, this.cmd_index, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more", this.next_init_version, "next_init_version");
        }

        public final Builder cmd_index(Long l) {
            this.cmd_index = l;
            return this;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_init_version(Long l) {
            this.next_init_version = l;
            return this;
        }

        public final Builder user_cursor(Long l) {
            this.user_cursor = l;
            return this;
        }

        public final Builder version(Long l) {
            this.version = l;
            return this;
        }

        public final Builder messages(List<ConversationMessage> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23309);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessageByInitResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessageByInitResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.has_more = this.has_more;
        builder.next_init_version = this.next_init_version;
        builder.version = this.version;
        builder.user_cursor = this.user_cursor;
        builder.cmd_index = this.cmd_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l, Long l2, Long l3, Long l4) {
        this(list, bool, l, l2, l3, l4, C89427i.EMPTY);
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l, Long l2, Long l3, Long l4, C89427i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.has_more = bool;
        this.next_init_version = l;
        this.version = l2;
        this.user_cursor = l3;
        this.cmd_index = l4;
    }
}
