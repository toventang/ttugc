package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.GetRecentMessageRespBody */
public final class GetRecentMessageRespBody extends Message<GetRecentMessageRespBody, Builder> {
    public static final ProtoAdapter<GetRecentMessageRespBody> ADAPTER = new ProtoAdapter_GetRecentMessageRespBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "messages")
    public final List<ConversationRecentMessage> messages;
    @AbstractC27891c(mo46611a = "next_conversation_version")
    public final Long next_conversation_version;

    /* renamed from: com.bytedance.im.core.proto.GetRecentMessageRespBody$ProtoAdapter_GetRecentMessageRespBody */
    static final class ProtoAdapter_GetRecentMessageRespBody extends ProtoAdapter<GetRecentMessageRespBody> {
        static {
            Covode.recordClassIndex(23217);
        }

        public ProtoAdapter_GetRecentMessageRespBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecentMessageRespBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetRecentMessageRespBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetRecentMessageRespBody redact(com.bytedance.p1399im.core.proto.GetRecentMessageRespBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetRecentMessageRespBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationRecentMessage> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationRecentMessage> r0 = com.bytedance.p1399im.core.proto.ConversationRecentMessage.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetRecentMessageRespBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetRecentMessageRespBody.ProtoAdapter_GetRecentMessageRespBody.redact(com.bytedance.im.core.proto.GetRecentMessageRespBody):com.bytedance.im.core.proto.GetRecentMessageRespBody");
        }

        public final int encodedSize(GetRecentMessageRespBody getRecentMessageRespBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getRecentMessageRespBody.next_conversation_version) + ConversationRecentMessage.ADAPTER.asRepeated().encodedSizeWithTag(2, getRecentMessageRespBody.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getRecentMessageRespBody.has_more) + getRecentMessageRespBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetRecentMessageRespBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.next_conversation_version(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.messages.add(ConversationRecentMessage.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetRecentMessageRespBody getRecentMessageRespBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getRecentMessageRespBody.next_conversation_version);
            ConversationRecentMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getRecentMessageRespBody.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getRecentMessageRespBody.has_more);
            protoWriter.writeBytes(getRecentMessageRespBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23215);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetRecentMessageRespBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetRecentMessageRespBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.next_conversation_version = this.next_conversation_version;
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetRecentMessageRespBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.GetRecentMessageRespBody$Builder */
    public static final class Builder extends Message.Builder<GetRecentMessageRespBody, Builder> {
        public Boolean has_more;
        public List<ConversationRecentMessage> messages = Internal.newMutableList();
        public Long next_conversation_version;

        static {
            Covode.recordClassIndex(23216);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetRecentMessageRespBody build() {
            Long l = this.next_conversation_version;
            if (l != null && this.has_more != null) {
                return new GetRecentMessageRespBody(this.next_conversation_version, this.messages, this.has_more, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "next_conversation_version", this.has_more, "has_more");
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_conversation_version(Long l) {
            this.next_conversation_version = l;
            return this;
        }

        public final Builder messages(List<ConversationRecentMessage> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    public GetRecentMessageRespBody(Long l, List<ConversationRecentMessage> list, Boolean bool) {
        this(l, list, bool, C89427i.EMPTY);
    }

    public GetRecentMessageRespBody(Long l, List<ConversationRecentMessage> list, Boolean bool, C89427i iVar) {
        super(ADAPTER, iVar);
        this.next_conversation_version = l;
        this.messages = Internal.immutableCopyOf("messages", list);
        this.has_more = bool;
    }
}
