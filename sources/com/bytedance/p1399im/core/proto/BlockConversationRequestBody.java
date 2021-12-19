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

/* renamed from: com.bytedance.im.core.proto.BlockConversationRequestBody */
public final class BlockConversationRequestBody extends Message<BlockConversationRequestBody, Builder> {
    public static final ProtoAdapter<BlockConversationRequestBody> ADAPTER = new ProtoAdapter_BlockConversationRequestBody();
    public static final Boolean DEFAULT_BLOCK_NORMAL_ONLY = false;
    public static final BlockStatus DEFAULT_BLOCK_STATUS = BlockStatus.UNBLOCK;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "block_normal_only")
    public final Boolean block_normal_only;
    @AbstractC27891c(mo46611a = "block_status")
    public final BlockStatus block_status;
    @AbstractC27891c(mo46611a = "conv_short_id")
    public final Long conv_short_id;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.BlockConversationRequestBody$ProtoAdapter_BlockConversationRequestBody */
    static final class ProtoAdapter_BlockConversationRequestBody extends ProtoAdapter<BlockConversationRequestBody> {
        static {
            Covode.recordClassIndex(22945);
        }

        public ProtoAdapter_BlockConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockConversationRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BlockConversationRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BlockConversationRequestBody redact(com.bytedance.p1399im.core.proto.BlockConversationRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BlockConversationRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BlockConversationRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BlockConversationRequestBody.ProtoAdapter_BlockConversationRequestBody.redact(com.bytedance.im.core.proto.BlockConversationRequestBody):com.bytedance.im.core.proto.BlockConversationRequestBody");
        }

        public final int encodedSize(BlockConversationRequestBody blockConversationRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, blockConversationRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, blockConversationRequestBody.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, blockConversationRequestBody.conversation_type) + BlockStatus.ADAPTER.encodedSizeWithTag(4, blockConversationRequestBody.block_status) + ProtoAdapter.BOOL.encodedSizeWithTag(5, blockConversationRequestBody.block_normal_only) + blockConversationRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockConversationRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    try {
                        builder.block_status(BlockStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.block_normal_only(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BlockConversationRequestBody blockConversationRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockConversationRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, blockConversationRequestBody.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, blockConversationRequestBody.conversation_type);
            BlockStatus.ADAPTER.encodeWithTag(protoWriter, 4, blockConversationRequestBody.block_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, blockConversationRequestBody.block_normal_only);
            protoWriter.writeBytes(blockConversationRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BlockConversationRequestBody$Builder */
    public static final class Builder extends Message.Builder<BlockConversationRequestBody, Builder> {
        public Boolean block_normal_only;
        public BlockStatus block_status;
        public Long conv_short_id;
        public String conversation_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(22944);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BlockConversationRequestBody build() {
            return new BlockConversationRequestBody(this.conversation_id, this.conv_short_id, this.conversation_type, this.block_status, this.block_normal_only, super.buildUnknownFields());
        }

        public final Builder block_normal_only(Boolean bool) {
            this.block_normal_only = bool;
            return this;
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
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BlockConversationRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(22943);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BlockConversationRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BlockConversationRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conv_short_id = this.conv_short_id;
        builder.conversation_type = this.conversation_type;
        builder.block_status = this.block_status;
        builder.block_normal_only = this.block_normal_only;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public BlockConversationRequestBody(String str, Long l, Integer num, BlockStatus blockStatus, Boolean bool) {
        this(str, l, num, blockStatus, bool, C89427i.EMPTY);
    }

    public BlockConversationRequestBody(String str, Long l, Integer num, BlockStatus blockStatus, Boolean bool, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conv_short_id = l;
        this.conversation_type = num;
        this.block_status = blockStatus;
        this.block_normal_only = bool;
    }
}
