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

/* renamed from: com.bytedance.im.core.proto.BroadcastUserInfo */
public final class BroadcastUserInfo extends Message<BroadcastUserInfo, Builder> {
    public static final ProtoAdapter<BroadcastUserInfo> ADAPTER = new ProtoAdapter_BroadcastUserInfo();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_COUNTER = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "counter")
    public final Integer counter;

    /* renamed from: com.bytedance.im.core.proto.BroadcastUserInfo$ProtoAdapter_BroadcastUserInfo */
    static final class ProtoAdapter_BroadcastUserInfo extends ProtoAdapter<BroadcastUserInfo> {
        static {
            Covode.recordClassIndex(22970);
        }

        public ProtoAdapter_BroadcastUserInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, BroadcastUserInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BroadcastUserInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BroadcastUserInfo redact(com.bytedance.p1399im.core.proto.BroadcastUserInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BroadcastUserInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BroadcastUserInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BroadcastUserInfo.ProtoAdapter_BroadcastUserInfo.redact(com.bytedance.im.core.proto.BroadcastUserInfo):com.bytedance.im.core.proto.BroadcastUserInfo");
        }

        public final int encodedSize(BroadcastUserInfo broadcastUserInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, broadcastUserInfo.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, broadcastUserInfo.counter) + ProtoAdapter.INT32.encodedSizeWithTag(3, broadcastUserInfo.conversation_type) + broadcastUserInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BroadcastUserInfo decode(ProtoReader protoReader) {
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
                    builder.counter(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BroadcastUserInfo broadcastUserInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, broadcastUserInfo.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, broadcastUserInfo.counter);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, broadcastUserInfo.conversation_type);
            protoWriter.writeBytes(broadcastUserInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BroadcastUserInfo$Builder */
    public static final class Builder extends Message.Builder<BroadcastUserInfo, Builder> {
        public Long conversation_short_id;
        public Integer conversation_type;
        public Integer counter;

        static {
            Covode.recordClassIndex(22969);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BroadcastUserInfo build() {
            return new BroadcastUserInfo(this.conversation_short_id, this.counter, this.conversation_type, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder counter(Integer num) {
            this.counter = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(22968);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BroadcastUserInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BroadcastUserInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.counter = this.counter;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BroadcastUserInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    public BroadcastUserInfo(Long l, Integer num, Integer num2) {
        this(l, num, num2, C89427i.EMPTY);
    }

    public BroadcastUserInfo(Long l, Integer num, Integer num2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l;
        this.counter = num;
        this.conversation_type = num2;
    }
}
