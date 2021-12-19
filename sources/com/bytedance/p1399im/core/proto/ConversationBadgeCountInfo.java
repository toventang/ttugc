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
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ConversationBadgeCountInfo */
public final class ConversationBadgeCountInfo extends Message<ConversationBadgeCountInfo, Builder> {
    public static final ProtoAdapter<ConversationBadgeCountInfo> ADAPTER = new ProtoAdapter_ConversationBadgeCountInfo();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_INDEX_V2 = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "badge_count")
    public final Integer badge_count;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_index_v2")
    public final Long conversation_index_v2;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;

    /* renamed from: com.bytedance.im.core.proto.ConversationBadgeCountInfo$ProtoAdapter_ConversationBadgeCountInfo */
    static final class ProtoAdapter_ConversationBadgeCountInfo extends ProtoAdapter<ConversationBadgeCountInfo> {
        static {
            Covode.recordClassIndex(23014);
        }

        public ProtoAdapter_ConversationBadgeCountInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationBadgeCountInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationBadgeCountInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationBadgeCountInfo redact(com.bytedance.p1399im.core.proto.ConversationBadgeCountInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationBadgeCountInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationBadgeCountInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationBadgeCountInfo.ProtoAdapter_ConversationBadgeCountInfo.redact(com.bytedance.im.core.proto.ConversationBadgeCountInfo):com.bytedance.im.core.proto.ConversationBadgeCountInfo");
        }

        public final int encodedSize(ConversationBadgeCountInfo conversationBadgeCountInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationBadgeCountInfo.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationBadgeCountInfo.badge_count) + ProtoAdapter.INT64.encodedSizeWithTag(3, conversationBadgeCountInfo.conversation_index_v2) + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationBadgeCountInfo.conversation_id) + conversationBadgeCountInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationBadgeCountInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.badge_count(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_index_v2(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationBadgeCountInfo conversationBadgeCountInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationBadgeCountInfo.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationBadgeCountInfo.badge_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, conversationBadgeCountInfo.conversation_index_v2);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationBadgeCountInfo.conversation_id);
            protoWriter.writeBytes(conversationBadgeCountInfo.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23012);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationBadgeCountInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationBadgeCountInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.badge_count = this.badge_count;
        builder.conversation_index_v2 = this.conversation_index_v2;
        builder.conversation_id = this.conversation_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationBadgeCountInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationBadgeCountInfo$Builder */
    public static final class Builder extends Message.Builder<ConversationBadgeCountInfo, Builder> {
        public Integer badge_count;
        public String conversation_id;
        public Long conversation_index_v2;
        public Long conversation_short_id;

        static {
            Covode.recordClassIndex(23013);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationBadgeCountInfo build() {
            Long l = this.conversation_short_id;
            if (l != null && this.badge_count != null && this.conversation_index_v2 != null && this.conversation_id != null) {
                return new ConversationBadgeCountInfo(this.conversation_short_id, this.badge_count, this.conversation_index_v2, this.conversation_id, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "conversation_short_id", this.badge_count, "badge_count", this.conversation_index_v2, "conversation_index_v2", this.conversation_id, "conversation_id");
        }

        public final Builder badge_count(Integer num) {
            this.badge_count = num;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_index_v2(Long l) {
            this.conversation_index_v2 = l;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }
    }

    public ConversationBadgeCountInfo(Long l, Integer num, Long l2, String str) {
        this(l, num, l2, str, C89427i.EMPTY);
    }

    public ConversationBadgeCountInfo(Long l, Integer num, Long l2, String str, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l;
        this.badge_count = num;
        this.conversation_index_v2 = l2;
        this.conversation_id = str;
    }
}
