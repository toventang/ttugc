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
import java.util.Map;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody */
public final class ConversationAddParticipantsRequestBody extends Message<ConversationAddParticipantsRequestBody, Builder> {
    public static final ProtoAdapter<ConversationAddParticipantsRequestBody> ADAPTER = new ProtoAdapter_ConversationAddParticipantsRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "biz_ext")
    public final Map<String, String> biz_ext;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "participants")
    public final List<Long> participants;

    /* renamed from: com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody$ProtoAdapter_ConversationAddParticipantsRequestBody */
    static final class ProtoAdapter_ConversationAddParticipantsRequestBody extends ProtoAdapter<ConversationAddParticipantsRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        static {
            Covode.recordClassIndex(23005);
        }

        public ProtoAdapter_ConversationAddParticipantsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationAddParticipantsRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationAddParticipantsRequestBody redact(com.bytedance.p1399im.core.proto.ConversationAddParticipantsRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationAddParticipantsRequestBody.ProtoAdapter_ConversationAddParticipantsRequestBody.redact(com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody):com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody");
        }

        public final int encodedSize(ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationAddParticipantsRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationAddParticipantsRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationAddParticipantsRequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, conversationAddParticipantsRequestBody.participants) + this.biz_ext.encodedSizeWithTag(5, conversationAddParticipantsRequestBody.biz_ext) + conversationAddParticipantsRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationAddParticipantsRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.biz_ext.putAll(this.biz_ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationAddParticipantsRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationAddParticipantsRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationAddParticipantsRequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, conversationAddParticipantsRequestBody.participants);
            this.biz_ext.encodeWithTag(protoWriter, 5, conversationAddParticipantsRequestBody.biz_ext);
            protoWriter.writeBytes(conversationAddParticipantsRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody$Builder */
    public static final class Builder extends Message.Builder<ConversationAddParticipantsRequestBody, Builder> {
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> participants = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23004);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationAddParticipantsRequestBody build() {
            return new ConversationAddParticipantsRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.participants, this.biz_ext, super.buildUnknownFields());
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

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23003);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationAddParticipantsRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationAddParticipantsRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationAddParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map) {
        this(str, l, num, list, map, C89427i.EMPTY);
    }

    public ConversationAddParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}
