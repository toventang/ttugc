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

/* renamed from: com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody */
public final class ConversationsPerUserByTopV2RequestBody extends Message<ConversationsPerUserByTopV2RequestBody, Builder> {
    public static final ProtoAdapter<ConversationsPerUserByTopV2RequestBody> ADAPTER = new ProtoAdapter_ConversationsPerUserByTopV2RequestBody();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 500;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "cursor")
    public final Long cursor;
    @AbstractC27891c(mo46611a = "limit")
    public final Integer limit;

    /* renamed from: com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody$ProtoAdapter_ConversationsPerUserByTopV2RequestBody */
    static final class ProtoAdapter_ConversationsPerUserByTopV2RequestBody extends ProtoAdapter<ConversationsPerUserByTopV2RequestBody> {
        static {
            Covode.recordClassIndex(23075);
        }

        public ProtoAdapter_ConversationsPerUserByTopV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationsPerUserByTopV2RequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConversationsPerUserByTopV2RequestBody redact(com.bytedance.p1399im.core.proto.ConversationsPerUserByTopV2RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConversationsPerUserByTopV2RequestBody.ProtoAdapter_ConversationsPerUserByTopV2RequestBody.redact(com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody):com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody");
        }

        public final int encodedSize(ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsPerUserByTopV2RequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationsPerUserByTopV2RequestBody.limit) + conversationsPerUserByTopV2RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationsPerUserByTopV2RequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.limit(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsPerUserByTopV2RequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationsPerUserByTopV2RequestBody.limit);
            protoWriter.writeBytes(conversationsPerUserByTopV2RequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody$Builder */
    public static final class Builder extends Message.Builder<ConversationsPerUserByTopV2RequestBody, Builder> {
        public Long cursor;
        public Integer limit;

        static {
            Covode.recordClassIndex(23074);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationsPerUserByTopV2RequestBody build() {
            return new ConversationsPerUserByTopV2RequestBody(this.cursor, this.limit, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23073);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationsPerUserByTopV2RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationsPerUserByTopV2RequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ConversationsPerUserByTopV2RequestBody(Long l, Integer num) {
        this(l, num, C89427i.EMPTY);
    }

    public ConversationsPerUserByTopV2RequestBody(Long l, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.cursor = l;
        this.limit = num;
    }
}
