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

/* renamed from: com.bytedance.im.core.proto.PullMarkMessageResponseBody */
public final class PullMarkMessageResponseBody extends Message<PullMarkMessageResponseBody, Builder> {
    public static final ProtoAdapter<PullMarkMessageResponseBody> ADAPTER = new ProtoAdapter_PullMarkMessageResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "messages")
    public final List<MessageBody> messages;
    @AbstractC27891c(mo46611a = "next_cursor")
    public final Long next_cursor;

    /* renamed from: com.bytedance.im.core.proto.PullMarkMessageResponseBody$ProtoAdapter_PullMarkMessageResponseBody */
    static final class ProtoAdapter_PullMarkMessageResponseBody extends ProtoAdapter<PullMarkMessageResponseBody> {
        static {
            Covode.recordClassIndex(23422);
        }

        public ProtoAdapter_PullMarkMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PullMarkMessageResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.PullMarkMessageResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.PullMarkMessageResponseBody redact(com.bytedance.p1399im.core.proto.PullMarkMessageResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.PullMarkMessageResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.p1399im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.PullMarkMessageResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.PullMarkMessageResponseBody.ProtoAdapter_PullMarkMessageResponseBody.redact(com.bytedance.im.core.proto.PullMarkMessageResponseBody):com.bytedance.im.core.proto.PullMarkMessageResponseBody");
        }

        public final int encodedSize(PullMarkMessageResponseBody pullMarkMessageResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, pullMarkMessageResponseBody.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, pullMarkMessageResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, pullMarkMessageResponseBody.next_cursor) + pullMarkMessageResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PullMarkMessageResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PullMarkMessageResponseBody pullMarkMessageResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullMarkMessageResponseBody.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullMarkMessageResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullMarkMessageResponseBody.next_cursor);
            protoWriter.writeBytes(pullMarkMessageResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.PullMarkMessageResponseBody$Builder */
    public static final class Builder extends Message.Builder<PullMarkMessageResponseBody, Builder> {
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cursor;

        static {
            Covode.recordClassIndex(23421);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PullMarkMessageResponseBody build() {
            return new PullMarkMessageResponseBody(this.messages, this.has_more, this.next_cursor, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23420);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PullMarkMessageResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PullMarkMessageResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.has_more = this.has_more;
        builder.next_cursor = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PullMarkMessageResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public PullMarkMessageResponseBody(List<MessageBody> list, Boolean bool, Long l) {
        this(list, bool, l, C89427i.EMPTY);
    }

    public PullMarkMessageResponseBody(List<MessageBody> list, Boolean bool, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
