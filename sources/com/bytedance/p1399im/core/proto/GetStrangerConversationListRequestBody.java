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

/* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListRequestBody */
public final class GetStrangerConversationListRequestBody extends Message<GetStrangerConversationListRequestBody, Builder> {
    public static final ProtoAdapter<GetStrangerConversationListRequestBody> ADAPTER = new ProtoAdapter_GetStrangerConversationListRequestBody();
    public static final Long DEFAULT_COUNT = 50L;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Boolean DEFAULT_SHOW_TOTAL_UNREAD = false;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "biz_info")
    public final String biz_info;
    @AbstractC27891c(mo46611a = "count")
    public final Long count;
    @AbstractC27891c(mo46611a = "cursor")
    public final Long cursor;
    @AbstractC27891c(mo46611a = "show_total_unread")
    public final Boolean show_total_unread;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListRequestBody$ProtoAdapter_GetStrangerConversationListRequestBody */
    static final class ProtoAdapter_GetStrangerConversationListRequestBody extends ProtoAdapter<GetStrangerConversationListRequestBody> {
        static {
            Covode.recordClassIndex(23220);
        }

        public ProtoAdapter_GetStrangerConversationListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerConversationListRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetStrangerConversationListRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetStrangerConversationListRequestBody redact(com.bytedance.p1399im.core.proto.GetStrangerConversationListRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetStrangerConversationListRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetStrangerConversationListRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetStrangerConversationListRequestBody.ProtoAdapter_GetStrangerConversationListRequestBody.redact(com.bytedance.im.core.proto.GetStrangerConversationListRequestBody):com.bytedance.im.core.proto.GetStrangerConversationListRequestBody");
        }

        public final int encodedSize(GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerConversationListRequestBody.cursor) + ProtoAdapter.INT64.encodedSizeWithTag(2, getStrangerConversationListRequestBody.count) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getStrangerConversationListRequestBody.show_total_unread) + ProtoAdapter.STRING.encodedSizeWithTag(4, getStrangerConversationListRequestBody.biz_info) + getStrangerConversationListRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerConversationListRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.show_total_unread(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.biz_info(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerConversationListRequestBody.cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getStrangerConversationListRequestBody.count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getStrangerConversationListRequestBody.show_total_unread);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getStrangerConversationListRequestBody.biz_info);
            protoWriter.writeBytes(getStrangerConversationListRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListRequestBody$Builder */
    public static final class Builder extends Message.Builder<GetStrangerConversationListRequestBody, Builder> {
        public String biz_info;
        public Long count;
        public Long cursor;
        public Boolean show_total_unread;

        static {
            Covode.recordClassIndex(23219);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetStrangerConversationListRequestBody build() {
            return new GetStrangerConversationListRequestBody(this.cursor, this.count, this.show_total_unread, this.biz_info, super.buildUnknownFields());
        }

        public final Builder biz_info(String str) {
            this.biz_info = str;
            return this;
        }

        public final Builder count(Long l) {
            this.count = l;
            return this;
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder show_total_unread(Boolean bool) {
            this.show_total_unread = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetStrangerConversationListRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetStrangerConversationListRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.count = this.count;
        builder.show_total_unread = this.show_total_unread;
        builder.biz_info = this.biz_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetStrangerConversationListRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23218);
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool, String str) {
        this(l, l2, bool, str, C89427i.EMPTY);
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool, String str, C89427i iVar) {
        super(ADAPTER, iVar);
        this.cursor = l;
        this.count = l2;
        this.show_total_unread = bool;
        this.biz_info = str;
    }
}
