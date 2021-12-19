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

/* renamed from: com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody */
public final class PreviewerGetConversationInfoListRequestBody extends Message<PreviewerGetConversationInfoListRequestBody, Builder> {
    public static final ProtoAdapter<PreviewerGetConversationInfoListRequestBody> ADAPTER = new ProtoAdapter_PreviewerGetConversationInfoListRequestBody();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_info_list")
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    /* renamed from: com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$ProtoAdapter_PreviewerGetConversationInfoListRequestBody */
    static final class ProtoAdapter_PreviewerGetConversationInfoListRequestBody extends ProtoAdapter<PreviewerGetConversationInfoListRequestBody> {
        static {
            Covode.recordClassIndex(23398);
        }

        public ProtoAdapter_PreviewerGetConversationInfoListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewerGetConversationInfoListRequestBody.class);
        }

        public final int encodedSize(PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
            return GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerGetConversationInfoListRequestBody.conversation_info_list) + previewerGetConversationInfoListRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.PreviewerGetConversationInfoListRequestBody redact(com.bytedance.p1399im.core.proto.PreviewerGetConversationInfoListRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.GetConversationInfoV2RequestBody> r1 = r2.conversation_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.GetConversationInfoV2RequestBody> r0 = com.bytedance.p1399im.core.proto.GetConversationInfoV2RequestBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.PreviewerGetConversationInfoListRequestBody.ProtoAdapter_PreviewerGetConversationInfoListRequestBody.redact(com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody):com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerGetConversationInfoListRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_info_list.add(GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
            GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerGetConversationInfoListRequestBody.conversation_info_list);
            protoWriter.writeBytes(previewerGetConversationInfoListRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$Builder */
    public static final class Builder extends Message.Builder<PreviewerGetConversationInfoListRequestBody, Builder> {
        public List<GetConversationInfoV2RequestBody> conversation_info_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23397);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PreviewerGetConversationInfoListRequestBody build() {
            return new PreviewerGetConversationInfoListRequestBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<GetConversationInfoV2RequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23396);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PreviewerGetConversationInfoListRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PreviewerGetConversationInfoListRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, C89427i.EMPTY);
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
