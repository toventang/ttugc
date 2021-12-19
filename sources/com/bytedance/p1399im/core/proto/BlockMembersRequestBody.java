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
import java.util.Map;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.BlockMembersRequestBody */
public final class BlockMembersRequestBody extends Message<BlockMembersRequestBody, Builder> {
    public static final ProtoAdapter<BlockMembersRequestBody> ADAPTER = new ProtoAdapter_BlockMembersRequestBody();
    public static final BlockStatus DEFAULT_BLOCK_STATUS = BlockStatus.UNBLOCK;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "biz_ext")
    public final Map<String, String> biz_ext;
    @AbstractC27891c(mo46611a = "block_status")
    public final BlockStatus block_status;
    @AbstractC27891c(mo46611a = "block_time")
    public final Map<Long, Long> block_time;
    @AbstractC27891c(mo46611a = "conv_short_id")
    public final Long conv_short_id;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.BlockMembersRequestBody$Builder */
    public static final class Builder extends Message.Builder<BlockMembersRequestBody, Builder> {
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public BlockStatus block_status;
        public Map<Long, Long> block_time = Internal.newMutableMap();
        public Long conv_short_id;
        public String conversation_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(22950);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BlockMembersRequestBody build() {
            return new BlockMembersRequestBody(this.block_status, this.block_time, this.conv_short_id, this.conversation_type, this.conversation_id, this.biz_ext, super.buildUnknownFields());
        }

        public final Builder block_status(BlockStatus blockStatus) {
            this.block_status = blockStatus;
            return this;
        }

        public final Builder conv_short_id(Long l) {
            this.conv_short_id = l;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
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

        public final Builder block_time(Map<Long, Long> map) {
            Internal.checkElementsNotNull(map);
            this.block_time = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BlockMembersRequestBody$ProtoAdapter_BlockMembersRequestBody */
    static final class ProtoAdapter_BlockMembersRequestBody extends ProtoAdapter<BlockMembersRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;
        private final ProtoAdapter<Map<Long, Long>> block_time;

        static {
            Covode.recordClassIndex(22951);
        }

        public ProtoAdapter_BlockMembersRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockMembersRequestBody.class);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.block_time = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BlockMembersRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BlockMembersRequestBody redact(com.bytedance.p1399im.core.proto.BlockMembersRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BlockMembersRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BlockMembersRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BlockMembersRequestBody.ProtoAdapter_BlockMembersRequestBody.redact(com.bytedance.im.core.proto.BlockMembersRequestBody):com.bytedance.im.core.proto.BlockMembersRequestBody");
        }

        public final int encodedSize(BlockMembersRequestBody blockMembersRequestBody) {
            return BlockStatus.ADAPTER.encodedSizeWithTag(1, blockMembersRequestBody.block_status) + this.block_time.encodedSizeWithTag(2, blockMembersRequestBody.block_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, blockMembersRequestBody.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(4, blockMembersRequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(5, blockMembersRequestBody.conversation_id) + this.biz_ext.encodedSizeWithTag(11, blockMembersRequestBody.biz_ext) + blockMembersRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockMembersRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.block_status(BlockStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    builder.block_time.putAll(this.block_time.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 5) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.biz_ext.putAll(this.biz_ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BlockMembersRequestBody blockMembersRequestBody) {
            BlockStatus.ADAPTER.encodeWithTag(protoWriter, 1, blockMembersRequestBody.block_status);
            this.block_time.encodeWithTag(protoWriter, 2, blockMembersRequestBody.block_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, blockMembersRequestBody.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, blockMembersRequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, blockMembersRequestBody.conversation_id);
            this.biz_ext.encodeWithTag(protoWriter, 11, blockMembersRequestBody.biz_ext);
            protoWriter.writeBytes(blockMembersRequestBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(22949);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BlockMembersRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BlockMembersRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BlockMembersRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.block_status = this.block_status;
        builder.block_time = Internal.copyOf("block_time", this.block_time);
        builder.conv_short_id = this.conv_short_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_id = this.conversation_id;
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public BlockMembersRequestBody(BlockStatus blockStatus, Map<Long, Long> map, Long l, Integer num, String str, Map<String, String> map2) {
        this(blockStatus, map, l, num, str, map2, C89427i.EMPTY);
    }

    public BlockMembersRequestBody(BlockStatus blockStatus, Map<Long, Long> map, Long l, Integer num, String str, Map<String, String> map2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.block_status = blockStatus;
        this.block_time = Internal.immutableCopyOf("block_time", map);
        this.conv_short_id = l;
        this.conversation_type = num;
        this.conversation_id = str;
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map2);
    }
}
