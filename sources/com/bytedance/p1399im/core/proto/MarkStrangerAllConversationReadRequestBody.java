package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody */
public final class MarkStrangerAllConversationReadRequestBody extends Message<MarkStrangerAllConversationReadRequestBody, Builder> {
    public static final ProtoAdapter<MarkStrangerAllConversationReadRequestBody> ADAPTER = new ProtoAdapter_MarkStrangerAllConversationReadRequestBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody$ProtoAdapter_MarkStrangerAllConversationReadRequestBody */
    static final class ProtoAdapter_MarkStrangerAllConversationReadRequestBody extends ProtoAdapter<MarkStrangerAllConversationReadRequestBody> {
        static {
            Covode.recordClassIndex(23289);
        }

        public ProtoAdapter_MarkStrangerAllConversationReadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerAllConversationReadRequestBody.class);
        }

        public final int encodedSize(MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody) {
            return markStrangerAllConversationReadRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MarkStrangerAllConversationReadRequestBody redact(com.bytedance.p1399im.core.proto.MarkStrangerAllConversationReadRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MarkStrangerAllConversationReadRequestBody.ProtoAdapter_MarkStrangerAllConversationReadRequestBody.redact(com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody):com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkStrangerAllConversationReadRequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody) {
            protoWriter.writeBytes(markStrangerAllConversationReadRequestBody.unknownFields());
        }
    }

    public MarkStrangerAllConversationReadRequestBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody$Builder */
    public static final class Builder extends Message.Builder<MarkStrangerAllConversationReadRequestBody, Builder> {
        static {
            Covode.recordClassIndex(23288);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkStrangerAllConversationReadRequestBody build() {
            return new MarkStrangerAllConversationReadRequestBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23287);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkStrangerAllConversationReadRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkStrangerAllConversationReadRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public MarkStrangerAllConversationReadRequestBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
