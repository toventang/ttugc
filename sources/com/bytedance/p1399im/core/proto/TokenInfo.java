package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.TokenInfo */
public final class TokenInfo extends Message<TokenInfo, Builder> {
    public static final ProtoAdapter<TokenInfo> ADAPTER = new ProtoAdapter_TokenInfo();
    public static final Integer DEFAULT_APP_ID = 0;
    public static final Integer DEFAULT_MARK_ID = 0;
    public static final Long DEFAULT_TIMESTAMP = 0L;
    public static final TokenType DEFAULT_TYPE = TokenType.DEFAULT_TOKEN;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "app_id")
    public final Integer app_id;
    @AbstractC27891c(mo46611a = "mark_id")
    public final Integer mark_id;
    @AbstractC27891c(mo46611a = "timestamp")
    public final Long timestamp;
    @AbstractC27891c(mo46611a = StringSet.type)
    public final TokenType type;
    @AbstractC27891c(mo46611a = "user_id")
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.TokenInfo$ProtoAdapter_TokenInfo */
    static final class ProtoAdapter_TokenInfo extends ProtoAdapter<TokenInfo> {
        static {
            Covode.recordClassIndex(23508);
        }

        public ProtoAdapter_TokenInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, TokenInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.TokenInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.TokenInfo redact(com.bytedance.p1399im.core.proto.TokenInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.TokenInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.TokenInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.TokenInfo.ProtoAdapter_TokenInfo.redact(com.bytedance.im.core.proto.TokenInfo):com.bytedance.im.core.proto.TokenInfo");
        }

        public final int encodedSize(TokenInfo tokenInfo) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, tokenInfo.mark_id) + TokenType.ADAPTER.encodedSizeWithTag(2, tokenInfo.type) + ProtoAdapter.INT32.encodedSizeWithTag(3, tokenInfo.app_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, tokenInfo.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, tokenInfo.timestamp) + tokenInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TokenInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.mark_id(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        builder.type(TokenType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    builder.app_id(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.timestamp(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, TokenInfo tokenInfo) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, tokenInfo.mark_id);
            TokenType.ADAPTER.encodeWithTag(protoWriter, 2, tokenInfo.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, tokenInfo.app_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, tokenInfo.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, tokenInfo.timestamp);
            protoWriter.writeBytes(tokenInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.TokenInfo$Builder */
    public static final class Builder extends Message.Builder<TokenInfo, Builder> {
        public Integer app_id;
        public Integer mark_id;
        public Long timestamp;
        public TokenType type;
        public Long user_id;

        static {
            Covode.recordClassIndex(23507);
        }

        @Override // com.squareup.wire.Message.Builder
        public final TokenInfo build() {
            return new TokenInfo(this.mark_id, this.type, this.app_id, this.user_id, this.timestamp, super.buildUnknownFields());
        }

        public final Builder app_id(Integer num) {
            this.app_id = num;
            return this;
        }

        public final Builder mark_id(Integer num) {
            this.mark_id = num;
            return this;
        }

        public final Builder timestamp(Long l) {
            this.timestamp = l;
            return this;
        }

        public final Builder type(TokenType tokenType) {
            this.type = tokenType;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "TokenInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23506);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.TokenInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<TokenInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.mark_id = this.mark_id;
        builder.type = this.type;
        builder.app_id = this.app_id;
        builder.user_id = this.user_id;
        builder.timestamp = this.timestamp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public TokenInfo(Integer num, TokenType tokenType, Integer num2, Long l, Long l2) {
        this(num, tokenType, num2, l, l2, C89427i.EMPTY);
    }

    public TokenInfo(Integer num, TokenType tokenType, Integer num2, Long l, Long l2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.mark_id = num;
        this.type = tokenType;
        this.app_id = num2;
        this.user_id = l;
        this.timestamp = l2;
    }
}
