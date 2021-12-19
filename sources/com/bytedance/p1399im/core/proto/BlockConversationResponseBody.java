package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.BlockConversationResponseBody */
public final class BlockConversationResponseBody extends Message<BlockConversationResponseBody, Builder> {
    public static final ProtoAdapter<BlockConversationResponseBody> ADAPTER = new ProtoAdapter_BlockConversationResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.BlockConversationResponseBody$ProtoAdapter_BlockConversationResponseBody */
    static final class ProtoAdapter_BlockConversationResponseBody extends ProtoAdapter<BlockConversationResponseBody> {
        static {
            Covode.recordClassIndex(22948);
        }

        public ProtoAdapter_BlockConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockConversationResponseBody.class);
        }

        public final int encodedSize(BlockConversationResponseBody blockConversationResponseBody) {
            return blockConversationResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BlockConversationResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BlockConversationResponseBody redact(com.bytedance.p1399im.core.proto.BlockConversationResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BlockConversationResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BlockConversationResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BlockConversationResponseBody.ProtoAdapter_BlockConversationResponseBody.redact(com.bytedance.im.core.proto.BlockConversationResponseBody):com.bytedance.im.core.proto.BlockConversationResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockConversationResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BlockConversationResponseBody blockConversationResponseBody) {
            protoWriter.writeBytes(blockConversationResponseBody.unknownFields());
        }
    }

    public BlockConversationResponseBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.BlockConversationResponseBody$Builder */
    public static final class Builder extends Message.Builder<BlockConversationResponseBody, Builder> {
        static {
            Covode.recordClassIndex(22947);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BlockConversationResponseBody build() {
            return new BlockConversationResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(22946);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BlockConversationResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BlockConversationResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BlockConversationResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public BlockConversationResponseBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
