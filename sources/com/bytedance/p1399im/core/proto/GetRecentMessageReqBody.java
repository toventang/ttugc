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

/* renamed from: com.bytedance.im.core.proto.GetRecentMessageReqBody */
public final class GetRecentMessageReqBody extends Message<GetRecentMessageReqBody, Builder> {
    public static final ProtoAdapter<GetRecentMessageReqBody> ADAPTER = new ProtoAdapter_GetRecentMessageReqBody();
    public static final Long DEFAULT_CONVERSATION_VERSION = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conversation_version")
    public final Long conversation_version;
    @AbstractC27891c(mo46611a = "new_user")
    public final Integer new_user;
    @AbstractC27891c(mo46611a = "source")
    public final String source;

    /* renamed from: com.bytedance.im.core.proto.GetRecentMessageReqBody$ProtoAdapter_GetRecentMessageReqBody */
    static final class ProtoAdapter_GetRecentMessageReqBody extends ProtoAdapter<GetRecentMessageReqBody> {
        static {
            Covode.recordClassIndex(23214);
        }

        public ProtoAdapter_GetRecentMessageReqBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecentMessageReqBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetRecentMessageReqBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetRecentMessageReqBody redact(com.bytedance.p1399im.core.proto.GetRecentMessageReqBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetRecentMessageReqBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetRecentMessageReqBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetRecentMessageReqBody.ProtoAdapter_GetRecentMessageReqBody.redact(com.bytedance.im.core.proto.GetRecentMessageReqBody):com.bytedance.im.core.proto.GetRecentMessageReqBody");
        }

        public final int encodedSize(GetRecentMessageReqBody getRecentMessageReqBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getRecentMessageReqBody.conversation_version) + ProtoAdapter.STRING.encodedSizeWithTag(2, getRecentMessageReqBody.source) + ProtoAdapter.INT32.encodedSizeWithTag(3, getRecentMessageReqBody.new_user) + getRecentMessageReqBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetRecentMessageReqBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_version(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.source(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.new_user(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetRecentMessageReqBody getRecentMessageReqBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getRecentMessageReqBody.conversation_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getRecentMessageReqBody.source);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getRecentMessageReqBody.new_user);
            protoWriter.writeBytes(getRecentMessageReqBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23212);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetRecentMessageReqBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetRecentMessageReqBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_version = this.conversation_version;
        builder.source = this.source;
        builder.new_user = this.new_user;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetRecentMessageReqBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.GetRecentMessageReqBody$Builder */
    public static final class Builder extends Message.Builder<GetRecentMessageReqBody, Builder> {
        public Long conversation_version;
        public Integer new_user;
        public String source;

        static {
            Covode.recordClassIndex(23213);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetRecentMessageReqBody build() {
            Long l = this.conversation_version;
            if (l != null && this.source != null) {
                return new GetRecentMessageReqBody(this.conversation_version, this.source, this.new_user, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "conversation_version", this.source, "source");
        }

        public final Builder conversation_version(Long l) {
            this.conversation_version = l;
            return this;
        }

        public final Builder new_user(Integer num) {
            this.new_user = num;
            return this;
        }

        public final Builder source(String str) {
            this.source = str;
            return this;
        }
    }

    public GetRecentMessageReqBody(Long l, String str, Integer num) {
        this(l, str, num, C89427i.EMPTY);
    }

    public GetRecentMessageReqBody(Long l, String str, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_version = l;
        this.source = str;
        this.new_user = num;
    }
}
