package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody */
public final class DeleteStrangerAllConversationRequestBody extends Message<DeleteStrangerAllConversationRequestBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerAllConversationRequestBody> ADAPTER = new ProtoAdapter_DeleteStrangerAllConversationRequestBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody$ProtoAdapter_DeleteStrangerAllConversationRequestBody */
    static final class ProtoAdapter_DeleteStrangerAllConversationRequestBody extends ProtoAdapter<DeleteStrangerAllConversationRequestBody> {
        static {
            Covode.recordClassIndex(23090);
        }

        public ProtoAdapter_DeleteStrangerAllConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerAllConversationRequestBody.class);
        }

        public final int encodedSize(DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody) {
            return deleteStrangerAllConversationRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.DeleteStrangerAllConversationRequestBody redact(com.bytedance.p1399im.core.proto.DeleteStrangerAllConversationRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.DeleteStrangerAllConversationRequestBody.ProtoAdapter_DeleteStrangerAllConversationRequestBody.redact(com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody):com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerAllConversationRequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody) {
            protoWriter.writeBytes(deleteStrangerAllConversationRequestBody.unknownFields());
        }
    }

    public DeleteStrangerAllConversationRequestBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody$Builder */
    public static final class Builder extends Message.Builder<DeleteStrangerAllConversationRequestBody, Builder> {
        static {
            Covode.recordClassIndex(23089);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteStrangerAllConversationRequestBody build() {
            return new DeleteStrangerAllConversationRequestBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23088);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteStrangerAllConversationRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteStrangerAllConversationRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public DeleteStrangerAllConversationRequestBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
