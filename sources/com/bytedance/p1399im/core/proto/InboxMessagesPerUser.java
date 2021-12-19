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

/* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUser */
public final class InboxMessagesPerUser extends Message<InboxMessagesPerUser, Builder> {
    public static final ProtoAdapter<InboxMessagesPerUser> ADAPTER = new ProtoAdapter_InboxMessagesPerUser();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "cursor")
    public final Long cursor;
    @AbstractC27891c(mo46611a = "inbox_type")
    public final Integer inbox_type;

    /* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUser$ProtoAdapter_InboxMessagesPerUser */
    static final class ProtoAdapter_InboxMessagesPerUser extends ProtoAdapter<InboxMessagesPerUser> {
        static {
            Covode.recordClassIndex(23257);
        }

        public ProtoAdapter_InboxMessagesPerUser() {
            super(FieldEncoding.LENGTH_DELIMITED, InboxMessagesPerUser.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.InboxMessagesPerUser$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.InboxMessagesPerUser redact(com.bytedance.p1399im.core.proto.InboxMessagesPerUser r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.InboxMessagesPerUser$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.InboxMessagesPerUser r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.InboxMessagesPerUser.ProtoAdapter_InboxMessagesPerUser.redact(com.bytedance.im.core.proto.InboxMessagesPerUser):com.bytedance.im.core.proto.InboxMessagesPerUser");
        }

        public final int encodedSize(InboxMessagesPerUser inboxMessagesPerUser) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUser.inbox_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, inboxMessagesPerUser.cursor) + inboxMessagesPerUser.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InboxMessagesPerUser decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, InboxMessagesPerUser inboxMessagesPerUser) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inboxMessagesPerUser.inbox_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, inboxMessagesPerUser.cursor);
            protoWriter.writeBytes(inboxMessagesPerUser.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUser$Builder */
    public static final class Builder extends Message.Builder<InboxMessagesPerUser, Builder> {
        public Long cursor;
        public Integer inbox_type;

        static {
            Covode.recordClassIndex(23256);
        }

        @Override // com.squareup.wire.Message.Builder
        public final InboxMessagesPerUser build() {
            return new InboxMessagesPerUser(this.inbox_type, this.cursor, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23255);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.InboxMessagesPerUser$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<InboxMessagesPerUser, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.inbox_type = this.inbox_type;
        builder.cursor = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "InboxMessagesPerUser" + C19999h.f47538a.mo46674b(this).toString();
    }

    public InboxMessagesPerUser(Integer num, Long l) {
        this(num, l, C89427i.EMPTY);
    }

    public InboxMessagesPerUser(Integer num, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.inbox_type = num;
        this.cursor = l;
    }
}
