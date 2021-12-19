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

/* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesRequestBody */
public final class GetStrangerMessagesRequestBody extends Message<GetStrangerMessagesRequestBody, Builder> {
    public static final ProtoAdapter<GetStrangerMessagesRequestBody> ADAPTER = new ProtoAdapter_GetStrangerMessagesRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Boolean DEFAULT_RESET_UNREAD_COUNT = false;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "reset_unread_count")
    public final Boolean reset_unread_count;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesRequestBody$ProtoAdapter_GetStrangerMessagesRequestBody */
    static final class ProtoAdapter_GetStrangerMessagesRequestBody extends ProtoAdapter<GetStrangerMessagesRequestBody> {
        static {
            Covode.recordClassIndex(23226);
        }

        public ProtoAdapter_GetStrangerMessagesRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerMessagesRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetStrangerMessagesRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetStrangerMessagesRequestBody redact(com.bytedance.p1399im.core.proto.GetStrangerMessagesRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetStrangerMessagesRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetStrangerMessagesRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetStrangerMessagesRequestBody.ProtoAdapter_GetStrangerMessagesRequestBody.redact(com.bytedance.im.core.proto.GetStrangerMessagesRequestBody):com.bytedance.im.core.proto.GetStrangerMessagesRequestBody");
        }

        public final int encodedSize(GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerMessagesRequestBody.conversation_short_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerMessagesRequestBody.reset_unread_count) + getStrangerMessagesRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerMessagesRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.reset_unread_count(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerMessagesRequestBody.conversation_short_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStrangerMessagesRequestBody.reset_unread_count);
            protoWriter.writeBytes(getStrangerMessagesRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesRequestBody$Builder */
    public static final class Builder extends Message.Builder<GetStrangerMessagesRequestBody, Builder> {
        public Long conversation_short_id;
        public Boolean reset_unread_count;

        static {
            Covode.recordClassIndex(23225);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetStrangerMessagesRequestBody build() {
            return new GetStrangerMessagesRequestBody(this.conversation_short_id, this.reset_unread_count, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder reset_unread_count(Boolean bool) {
            this.reset_unread_count = bool;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23224);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetStrangerMessagesRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetStrangerMessagesRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.reset_unread_count = this.reset_unread_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetStrangerMessagesRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool) {
        this(l, bool, C89427i.EMPTY);
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l;
        this.reset_unread_count = bool;
    }
}
