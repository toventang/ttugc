package com.p2082ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import p4632k.C89427i;

/* renamed from: com.ss.ugc.aweme.proto.AnchorShopLinkStructV2 */
public final class AnchorShopLinkStructV2 extends Message<AnchorShopLinkStructV2, Builder> {
    public static final ProtoAdapter<AnchorShopLinkStructV2> ADAPTER = new ProtoAdapter_AnchorShopLinkStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String url;

    public AnchorShopLinkStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorShopLinkStructV2$ProtoAdapter_AnchorShopLinkStructV2 */
    static final class ProtoAdapter_AnchorShopLinkStructV2 extends ProtoAdapter<AnchorShopLinkStructV2> {
        static {
            Covode.recordClassIndex(101937);
        }

        public ProtoAdapter_AnchorShopLinkStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorShopLinkStructV2.class);
        }

        public final int encodedSize(AnchorShopLinkStructV2 anchorShopLinkStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anchorShopLinkStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorShopLinkStructV2.url) + anchorShopLinkStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnchorShopLinkStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.keyword(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.url(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AnchorShopLinkStructV2 anchorShopLinkStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorShopLinkStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorShopLinkStructV2.url);
            protoWriter.writeBytes(anchorShopLinkStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorShopLinkStructV2$Builder */
    public static final class Builder extends Message.Builder<AnchorShopLinkStructV2, Builder> {
        public String keyword;
        public String url;

        static {
            Covode.recordClassIndex(101936);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AnchorShopLinkStructV2 build() {
            return new AnchorShopLinkStructV2(this.keyword, this.url, super.buildUnknownFields());
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101935);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AnchorShopLinkStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AnchorShopLinkStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.keyword;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        String str2 = this.url;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=").append(this.keyword);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        return sb.replace(0, 2, "AnchorShopLinkStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorShopLinkStructV2)) {
            return false;
        }
        AnchorShopLinkStructV2 anchorShopLinkStructV2 = (AnchorShopLinkStructV2) obj;
        if (!unknownFields().equals(anchorShopLinkStructV2.unknownFields()) || !Internal.equals(this.keyword, anchorShopLinkStructV2.keyword) || !Internal.equals(this.url, anchorShopLinkStructV2.url)) {
            return false;
        }
        return true;
    }

    public AnchorShopLinkStructV2(String str, String str2) {
        this(str, str2, C89427i.EMPTY);
    }

    public AnchorShopLinkStructV2(String str, String str2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.keyword = str;
        this.url = str2;
    }
}
