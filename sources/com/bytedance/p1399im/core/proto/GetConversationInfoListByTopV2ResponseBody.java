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

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody */
public final class GetConversationInfoListByTopV2ResponseBody extends Message<GetConversationInfoListByTopV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListByTopV2ResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoListByTopV2ResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "next_cursor")
    public final Long next_cursor;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody$ProtoAdapter_GetConversationInfoListByTopV2ResponseBody */
    static final class ProtoAdapter_GetConversationInfoListByTopV2ResponseBody extends ProtoAdapter<GetConversationInfoListByTopV2ResponseBody> {
        static {
            Covode.recordClassIndex(23157);
        }

        public ProtoAdapter_GetConversationInfoListByTopV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListByTopV2ResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetConversationInfoListByTopV2ResponseBody redact(com.bytedance.p1399im.core.proto.GetConversationInfoListByTopV2ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationInfoV2> r1 = r2.conversation_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r0 = com.bytedance.p1399im.core.proto.ConversationInfoV2.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetConversationInfoListByTopV2ResponseBody.ProtoAdapter_GetConversationInfoListByTopV2ResponseBody.redact(com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody):com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody");
        }

        public final int encodedSize(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListByTopV2ResponseBody.conversation_info_list) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getConversationInfoListByTopV2ResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getConversationInfoListByTopV2ResponseBody.next_cursor) + getConversationInfoListByTopV2ResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoListByTopV2ResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_info_list.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListByTopV2ResponseBody.conversation_info_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getConversationInfoListByTopV2ResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getConversationInfoListByTopV2ResponseBody.next_cursor);
            protoWriter.writeBytes(getConversationInfoListByTopV2ResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody$Builder */
    public static final class Builder extends Message.Builder<GetConversationInfoListByTopV2ResponseBody, Builder> {
        public List<ConversationInfoV2> conversation_info_list = Internal.newMutableList();
        public Boolean has_more;
        public Long next_cursor;

        static {
            Covode.recordClassIndex(23156);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationInfoListByTopV2ResponseBody build() {
            return new GetConversationInfoListByTopV2ResponseBody(this.conversation_info_list, this.has_more, this.next_cursor, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder conversation_info_list(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23155);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationInfoListByTopV2ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.has_more = this.has_more;
        builder.next_cursor = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationInfoListByTopV2ResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetConversationInfoListByTopV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l) {
        this(list, bool, l, C89427i.EMPTY);
    }

    public GetConversationInfoListByTopV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
