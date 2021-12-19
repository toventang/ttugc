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
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody */
public final class GetStrangerUnreadCountResponseBody extends Message<GetStrangerUnreadCountResponseBody, Builder> {
    public static final ProtoAdapter<GetStrangerUnreadCountResponseBody> ADAPTER = new ProtoAdapter_GetStrangerUnreadCountResponseBody();
    public static final Long DEFAULT_USER_UNREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "user_unread_count")
    public final Long user_unread_count;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody$ProtoAdapter_GetStrangerUnreadCountResponseBody */
    static final class ProtoAdapter_GetStrangerUnreadCountResponseBody extends ProtoAdapter<GetStrangerUnreadCountResponseBody> {
        static {
            Covode.recordClassIndex(23235);
        }

        public ProtoAdapter_GetStrangerUnreadCountResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerUnreadCountResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetStrangerUnreadCountResponseBody redact(com.bytedance.p1399im.core.proto.GetStrangerUnreadCountResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetStrangerUnreadCountResponseBody.ProtoAdapter_GetStrangerUnreadCountResponseBody.redact(com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody):com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody");
        }

        public final int encodedSize(GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerUnreadCountResponseBody.user_unread_count) + getStrangerUnreadCountResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerUnreadCountResponseBody decode(ProtoReader protoReader) {
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
                    builder.user_unread_count(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerUnreadCountResponseBody.user_unread_count);
            protoWriter.writeBytes(getStrangerUnreadCountResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody$Builder */
    public static final class Builder extends Message.Builder<GetStrangerUnreadCountResponseBody, Builder> {
        public Long user_unread_count;

        static {
            Covode.recordClassIndex(23234);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetStrangerUnreadCountResponseBody build() {
            Long l = this.user_unread_count;
            if (l != null) {
                return new GetStrangerUnreadCountResponseBody(this.user_unread_count, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "user_unread_count");
        }

        public final Builder user_unread_count(Long l) {
            this.user_unread_count = l;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23233);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetStrangerUnreadCountResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_unread_count = this.user_unread_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetStrangerUnreadCountResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetStrangerUnreadCountResponseBody(Long l) {
        this(l, C89427i.EMPTY);
    }

    public GetStrangerUnreadCountResponseBody(Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.user_unread_count = l;
    }
}
