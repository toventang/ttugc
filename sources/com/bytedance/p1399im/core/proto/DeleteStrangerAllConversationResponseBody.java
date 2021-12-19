package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody */
public final class DeleteStrangerAllConversationResponseBody extends Message<DeleteStrangerAllConversationResponseBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerAllConversationResponseBody> ADAPTER = new ProtoAdapter_DeleteStrangerAllConversationResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody$ProtoAdapter_DeleteStrangerAllConversationResponseBody */
    static final class ProtoAdapter_DeleteStrangerAllConversationResponseBody extends ProtoAdapter<DeleteStrangerAllConversationResponseBody> {
        static {
            Covode.recordClassIndex(23093);
        }

        public ProtoAdapter_DeleteStrangerAllConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerAllConversationResponseBody.class);
        }

        public final int encodedSize(DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) {
            return deleteStrangerAllConversationResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.DeleteStrangerAllConversationResponseBody redact(com.bytedance.p1399im.core.proto.DeleteStrangerAllConversationResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.DeleteStrangerAllConversationResponseBody.ProtoAdapter_DeleteStrangerAllConversationResponseBody.redact(com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody):com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerAllConversationResponseBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) {
            protoWriter.writeBytes(deleteStrangerAllConversationResponseBody.unknownFields());
        }
    }

    public DeleteStrangerAllConversationResponseBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody$Builder */
    public static final class Builder extends Message.Builder<DeleteStrangerAllConversationResponseBody, Builder> {
        static {
            Covode.recordClassIndex(23092);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteStrangerAllConversationResponseBody build() {
            return new DeleteStrangerAllConversationResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23091);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteStrangerAllConversationResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteStrangerAllConversationResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public DeleteStrangerAllConversationResponseBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
