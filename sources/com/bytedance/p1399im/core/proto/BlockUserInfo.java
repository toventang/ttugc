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

/* renamed from: com.bytedance.im.core.proto.BlockUserInfo */
public final class BlockUserInfo extends Message<BlockUserInfo, Builder> {
    public static final ProtoAdapter<BlockUserInfo> ADAPTER = new ProtoAdapter_BlockUserInfo();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "create_time")
    public final Long create_time;
    @AbstractC27891c(mo46611a = "user_id")
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.BlockUserInfo$ProtoAdapter_BlockUserInfo */
    static final class ProtoAdapter_BlockUserInfo extends ProtoAdapter<BlockUserInfo> {
        static {
            Covode.recordClassIndex(22961);
        }

        public ProtoAdapter_BlockUserInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockUserInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BlockUserInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BlockUserInfo redact(com.bytedance.p1399im.core.proto.BlockUserInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BlockUserInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BlockUserInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BlockUserInfo.ProtoAdapter_BlockUserInfo.redact(com.bytedance.im.core.proto.BlockUserInfo):com.bytedance.im.core.proto.BlockUserInfo");
        }

        public final int encodedSize(BlockUserInfo blockUserInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, blockUserInfo.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, blockUserInfo.create_time) + blockUserInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockUserInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BlockUserInfo blockUserInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, blockUserInfo.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, blockUserInfo.create_time);
            protoWriter.writeBytes(blockUserInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BlockUserInfo$Builder */
    public static final class Builder extends Message.Builder<BlockUserInfo, Builder> {
        public Long create_time;
        public Long user_id;

        static {
            Covode.recordClassIndex(22960);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BlockUserInfo build() {
            return new BlockUserInfo(this.user_id, this.create_time, super.buildUnknownFields());
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(22959);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BlockUserInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BlockUserInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.create_time = this.create_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BlockUserInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    public BlockUserInfo(Long l, Long l2) {
        this(l, l2, C89427i.EMPTY);
    }

    public BlockUserInfo(Long l, Long l2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.user_id = l;
        this.create_time = l2;
    }
}
