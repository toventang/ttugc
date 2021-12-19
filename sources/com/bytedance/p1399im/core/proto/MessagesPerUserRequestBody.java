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

/* renamed from: com.bytedance.im.core.proto.MessagesPerUserRequestBody */
public final class MessagesPerUserRequestBody extends Message<MessagesPerUserRequestBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserRequestBody> ADAPTER = new ProtoAdapter_MessagesPerUserRequestBody();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Long DEFAULT_INTERVAL = 0L;
    public static final Integer DEFAULT_LIMIT = 50;
    public static final Integer DEFAULT_NEW_USER = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "cursor")
    public final Long cursor;
    @AbstractC27891c(mo46611a = "interval")
    public final Long interval;
    @AbstractC27891c(mo46611a = "limit")
    public final Integer limit;
    @AbstractC27891c(mo46611a = "new_user")
    public final Integer new_user;

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserRequestBody$ProtoAdapter_MessagesPerUserRequestBody */
    static final class ProtoAdapter_MessagesPerUserRequestBody extends ProtoAdapter<MessagesPerUserRequestBody> {
        static {
            Covode.recordClassIndex(23338);
        }

        public ProtoAdapter_MessagesPerUserRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MessagesPerUserRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MessagesPerUserRequestBody redact(com.bytedance.p1399im.core.proto.MessagesPerUserRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MessagesPerUserRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MessagesPerUserRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MessagesPerUserRequestBody.ProtoAdapter_MessagesPerUserRequestBody.redact(com.bytedance.im.core.proto.MessagesPerUserRequestBody):com.bytedance.im.core.proto.MessagesPerUserRequestBody");
        }

        public final int encodedSize(MessagesPerUserRequestBody messagesPerUserRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerUserRequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, messagesPerUserRequestBody.limit) + ProtoAdapter.INT64.encodedSizeWithTag(3, messagesPerUserRequestBody.interval) + ProtoAdapter.INT32.encodedSizeWithTag(4, messagesPerUserRequestBody.new_user) + messagesPerUserRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.limit(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.interval(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.new_user(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesPerUserRequestBody messagesPerUserRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerUserRequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messagesPerUserRequestBody.limit);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messagesPerUserRequestBody.interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, messagesPerUserRequestBody.new_user);
            protoWriter.writeBytes(messagesPerUserRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserRequestBody$Builder */
    public static final class Builder extends Message.Builder<MessagesPerUserRequestBody, Builder> {
        public Long cursor;
        public Long interval;
        public Integer limit;
        public Integer new_user;

        static {
            Covode.recordClassIndex(23337);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessagesPerUserRequestBody build() {
            return new MessagesPerUserRequestBody(this.cursor, this.limit, this.interval, this.new_user, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder interval(Long l) {
            this.interval = l;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public final Builder new_user(Integer num) {
            this.new_user = num;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessagesPerUserRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessagesPerUserRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.interval = this.interval;
        builder.new_user = this.new_user;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessagesPerUserRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23336);
    }

    public MessagesPerUserRequestBody(Long l, Integer num, Long l2, Integer num2) {
        this(l, num, l2, num2, C89427i.EMPTY);
    }

    public MessagesPerUserRequestBody(Long l, Integer num, Long l2, Integer num2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.cursor = l;
        this.limit = num;
        this.interval = l2;
        this.new_user = num2;
    }
}
