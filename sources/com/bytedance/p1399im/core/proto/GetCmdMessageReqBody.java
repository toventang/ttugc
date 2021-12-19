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

/* renamed from: com.bytedance.im.core.proto.GetCmdMessageReqBody */
public final class GetCmdMessageReqBody extends Message<GetCmdMessageReqBody, Builder> {
    public static final ProtoAdapter<GetCmdMessageReqBody> ADAPTER = new ProtoAdapter_GetCmdMessageReqBody();
    public static final Long DEFAULT_CMD_INDEX = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "cmd_index")
    public final Long cmd_index;
    @AbstractC27891c(mo46611a = "new_user")
    public final Integer new_user;
    @AbstractC27891c(mo46611a = "source")
    public final String source;

    /* renamed from: com.bytedance.im.core.proto.GetCmdMessageReqBody$ProtoAdapter_GetCmdMessageReqBody */
    static final class ProtoAdapter_GetCmdMessageReqBody extends ProtoAdapter<GetCmdMessageReqBody> {
        static {
            Covode.recordClassIndex(23121);
        }

        public ProtoAdapter_GetCmdMessageReqBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCmdMessageReqBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetCmdMessageReqBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetCmdMessageReqBody redact(com.bytedance.p1399im.core.proto.GetCmdMessageReqBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetCmdMessageReqBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetCmdMessageReqBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetCmdMessageReqBody.ProtoAdapter_GetCmdMessageReqBody.redact(com.bytedance.im.core.proto.GetCmdMessageReqBody):com.bytedance.im.core.proto.GetCmdMessageReqBody");
        }

        public final int encodedSize(GetCmdMessageReqBody getCmdMessageReqBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getCmdMessageReqBody.cmd_index) + ProtoAdapter.STRING.encodedSizeWithTag(2, getCmdMessageReqBody.source) + ProtoAdapter.INT32.encodedSizeWithTag(3, getCmdMessageReqBody.new_user) + getCmdMessageReqBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetCmdMessageReqBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.cmd_index(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetCmdMessageReqBody getCmdMessageReqBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getCmdMessageReqBody.cmd_index);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCmdMessageReqBody.source);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getCmdMessageReqBody.new_user);
            protoWriter.writeBytes(getCmdMessageReqBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23119);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetCmdMessageReqBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetCmdMessageReqBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cmd_index = this.cmd_index;
        builder.source = this.source;
        builder.new_user = this.new_user;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetCmdMessageReqBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.GetCmdMessageReqBody$Builder */
    public static final class Builder extends Message.Builder<GetCmdMessageReqBody, Builder> {
        public Long cmd_index;
        public Integer new_user;
        public String source;

        static {
            Covode.recordClassIndex(23120);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetCmdMessageReqBody build() {
            Long l = this.cmd_index;
            if (l != null && this.source != null) {
                return new GetCmdMessageReqBody(this.cmd_index, this.source, this.new_user, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "cmd_index", this.source, "source");
        }

        public final Builder cmd_index(Long l) {
            this.cmd_index = l;
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

    public GetCmdMessageReqBody(Long l, String str, Integer num) {
        this(l, str, num, C89427i.EMPTY);
    }

    public GetCmdMessageReqBody(Long l, String str, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.cmd_index = l;
        this.source = str;
        this.new_user = num;
    }
}
