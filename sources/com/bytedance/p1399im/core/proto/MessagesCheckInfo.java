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

/* renamed from: com.bytedance.im.core.proto.MessagesCheckInfo */
public final class MessagesCheckInfo extends Message<MessagesCheckInfo, Builder> {
    public static final ProtoAdapter<MessagesCheckInfo> ADAPTER = new ProtoAdapter_MessagesCheckInfo();
    public static final Long DEFAULT_HEAD_MSG_INDEX = 0L;
    public static final Integer DEFAULT_INDEXES_CHECKSUM = 0;
    public static final Integer DEFAULT_MSG_COUNT = 0;
    public static final Long DEFAULT_TAIL_MSG_INDEX = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "head_msg_index")
    public final Long head_msg_index;
    @AbstractC27891c(mo46611a = "indexes_checksum")
    public final Integer indexes_checksum;
    @AbstractC27891c(mo46611a = "msg_count")
    public final Integer msg_count;
    @AbstractC27891c(mo46611a = "tail_msg_index")
    public final Long tail_msg_index;

    /* renamed from: com.bytedance.im.core.proto.MessagesCheckInfo$ProtoAdapter_MessagesCheckInfo */
    static final class ProtoAdapter_MessagesCheckInfo extends ProtoAdapter<MessagesCheckInfo> {
        static {
            Covode.recordClassIndex(23323);
        }

        public ProtoAdapter_MessagesCheckInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesCheckInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MessagesCheckInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MessagesCheckInfo redact(com.bytedance.p1399im.core.proto.MessagesCheckInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MessagesCheckInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MessagesCheckInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MessagesCheckInfo.ProtoAdapter_MessagesCheckInfo.redact(com.bytedance.im.core.proto.MessagesCheckInfo):com.bytedance.im.core.proto.MessagesCheckInfo");
        }

        public final int encodedSize(MessagesCheckInfo messagesCheckInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesCheckInfo.head_msg_index) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesCheckInfo.tail_msg_index) + ProtoAdapter.INT32.encodedSizeWithTag(3, messagesCheckInfo.msg_count) + ProtoAdapter.UINT32.encodedSizeWithTag(4, messagesCheckInfo.indexes_checksum) + messagesCheckInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesCheckInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.head_msg_index(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.tail_msg_index(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.msg_count(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.indexes_checksum(ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesCheckInfo messagesCheckInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesCheckInfo.head_msg_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesCheckInfo.tail_msg_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, messagesCheckInfo.msg_count);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, messagesCheckInfo.indexes_checksum);
            protoWriter.writeBytes(messagesCheckInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesCheckInfo$Builder */
    public static final class Builder extends Message.Builder<MessagesCheckInfo, Builder> {
        public Long head_msg_index;
        public Integer indexes_checksum;
        public Integer msg_count;
        public Long tail_msg_index;

        static {
            Covode.recordClassIndex(23322);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessagesCheckInfo build() {
            return new MessagesCheckInfo(this.head_msg_index, this.tail_msg_index, this.msg_count, this.indexes_checksum, super.buildUnknownFields());
        }

        public final Builder head_msg_index(Long l) {
            this.head_msg_index = l;
            return this;
        }

        public final Builder indexes_checksum(Integer num) {
            this.indexes_checksum = num;
            return this;
        }

        public final Builder msg_count(Integer num) {
            this.msg_count = num;
            return this;
        }

        public final Builder tail_msg_index(Long l) {
            this.tail_msg_index = l;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23321);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessagesCheckInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessagesCheckInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.head_msg_index = this.head_msg_index;
        builder.tail_msg_index = this.tail_msg_index;
        builder.msg_count = this.msg_count;
        builder.indexes_checksum = this.indexes_checksum;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessagesCheckInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2) {
        this(l, l2, num, num2, C89427i.EMPTY);
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.head_msg_index = l;
        this.tail_msg_index = l2;
        this.msg_count = num;
        this.indexes_checksum = num2;
    }
}
