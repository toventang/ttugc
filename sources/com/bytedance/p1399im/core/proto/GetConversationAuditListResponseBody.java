package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.proto.ResponseBody;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.GetConversationAuditListResponseBody */
public final class GetConversationAuditListResponseBody extends Message<GetConversationAuditListResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationAuditListResponseBody> ADAPTER;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "apply_info_list")
    public final List<ConversationApplyInfo> apply_info_list;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "next_cursor")
    public final Long next_cursor;

    /* renamed from: com.bytedance.im.core.proto.GetConversationAuditListResponseBody$ProtoAdapter_GetConversationAuditListResponseBody */
    static final class ProtoAdapter_GetConversationAuditListResponseBody extends ProtoAdapter<GetConversationAuditListResponseBody> {
        static {
            Covode.recordClassIndex(23139);
        }

        public ProtoAdapter_GetConversationAuditListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditListResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationAuditListResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetConversationAuditListResponseBody redact(com.bytedance.p1399im.core.proto.GetConversationAuditListResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationAuditListResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationApplyInfo> r1 = r2.apply_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationApplyInfo> r0 = com.bytedance.p1399im.core.proto.ConversationApplyInfo.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationAuditListResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetConversationAuditListResponseBody.ProtoAdapter_GetConversationAuditListResponseBody.redact(com.bytedance.im.core.proto.GetConversationAuditListResponseBody):com.bytedance.im.core.proto.GetConversationAuditListResponseBody");
        }

        public final int encodedSize(GetConversationAuditListResponseBody getConversationAuditListResponseBody) {
            return ConversationApplyInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationAuditListResponseBody.apply_info_list) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationAuditListResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getConversationAuditListResponseBody.has_more) + getConversationAuditListResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationAuditListResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.apply_info_list.add(ConversationApplyInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationAuditListResponseBody getConversationAuditListResponseBody) {
            ConversationApplyInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationAuditListResponseBody.apply_info_list);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationAuditListResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getConversationAuditListResponseBody.has_more);
            protoWriter.writeBytes(getConversationAuditListResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationAuditListResponseBody$Builder */
    public static final class Builder extends Message.Builder<GetConversationAuditListResponseBody, Builder> {
        public List<ConversationApplyInfo> apply_info_list = Internal.newMutableList();
        public Boolean has_more;
        public Long next_cursor;

        static {
            Covode.recordClassIndex(23138);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationAuditListResponseBody build() {
            return new GetConversationAuditListResponseBody(this.apply_info_list, this.next_cursor, this.has_more, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder apply_info_list(List<ConversationApplyInfo> list) {
            Internal.checkElementsNotNull(list);
            this.apply_info_list = list;
            return this;
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2027, ADAPTER);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationAuditListResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationAuditListResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.apply_info_list = Internal.copyOf("apply_info_list", this.apply_info_list);
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationAuditListResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23137);
        ProtoAdapter_GetConversationAuditListResponseBody protoAdapter_GetConversationAuditListResponseBody = new ProtoAdapter_GetConversationAuditListResponseBody();
        ADAPTER = protoAdapter_GetConversationAuditListResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2027, protoAdapter_GetConversationAuditListResponseBody);
    }

    public GetConversationAuditListResponseBody(List<ConversationApplyInfo> list, Long l, Boolean bool) {
        this(list, l, bool, C89427i.EMPTY);
    }

    public GetConversationAuditListResponseBody(List<ConversationApplyInfo> list, Long l, Boolean bool, C89427i iVar) {
        super(ADAPTER, iVar);
        this.apply_info_list = Internal.immutableCopyOf("apply_info_list", list);
        this.next_cursor = l;
        this.has_more = bool;
    }
}
