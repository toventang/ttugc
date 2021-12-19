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

/* renamed from: com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody */
public final class PreviewerMessagesInConversationResponseBody extends Message<PreviewerMessagesInConversationResponseBody, Builder> {
    public static final ProtoAdapter<PreviewerMessagesInConversationResponseBody> ADAPTER = new ProtoAdapter_PreviewerMessagesInConversationResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "check_code")
    public final Long check_code;
    @AbstractC27891c(mo46611a = "check_message")
    public final String check_message;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "messages")
    public final List<MessageBody> messages;
    @AbstractC27891c(mo46611a = "next_cursor")
    public final Long next_cursor;
    @AbstractC27891c(mo46611a = "status")
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$ProtoAdapter_PreviewerMessagesInConversationResponseBody */
    static final class ProtoAdapter_PreviewerMessagesInConversationResponseBody extends ProtoAdapter<PreviewerMessagesInConversationResponseBody> {
        static {
            Covode.recordClassIndex(23407);
        }

        public ProtoAdapter_PreviewerMessagesInConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewerMessagesInConversationResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.PreviewerMessagesInConversationResponseBody redact(com.bytedance.p1399im.core.proto.PreviewerMessagesInConversationResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.p1399im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.PreviewerMessagesInConversationResponseBody.ProtoAdapter_PreviewerMessagesInConversationResponseBody.redact(com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody):com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody");
        }

        public final int encodedSize(PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerMessagesInConversationResponseBody.messages) + ProtoAdapter.INT64.encodedSizeWithTag(2, previewerMessagesInConversationResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, previewerMessagesInConversationResponseBody.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(4, previewerMessagesInConversationResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(5, previewerMessagesInConversationResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, previewerMessagesInConversationResponseBody.check_message) + previewerMessagesInConversationResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerMessagesInConversationResponseBody decode(ProtoReader protoReader) {
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
                            builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.check_message(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerMessagesInConversationResponseBody.messages);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, previewerMessagesInConversationResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, previewerMessagesInConversationResponseBody.has_more);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, previewerMessagesInConversationResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, previewerMessagesInConversationResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, previewerMessagesInConversationResponseBody.check_message);
            protoWriter.writeBytes(previewerMessagesInConversationResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$Builder */
    public static final class Builder extends Message.Builder<PreviewerMessagesInConversationResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cursor;
        public Integer status;

        static {
            Covode.recordClassIndex(23406);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PreviewerMessagesInConversationResponseBody build() {
            return new PreviewerMessagesInConversationResponseBody(this.messages, this.next_cursor, this.has_more, this.status, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
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
        return "PreviewerMessagesInConversationResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23405);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PreviewerMessagesInConversationResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, Integer num, Long l2, String str) {
        this(list, l, bool, num, l2, str, C89427i.EMPTY);
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, Integer num, Long l2, String str, C89427i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
        this.status = num;
        this.check_code = l2;
        this.check_message = str;
    }
}
