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

/* renamed from: com.ss.ugc.aweme.proto.AnchorWikipediaStructV2 */
public final class AnchorWikipediaStructV2 extends Message<AnchorWikipediaStructV2, Builder> {
    public static final ProtoAdapter<AnchorWikipediaStructV2> ADAPTER = new ProtoAdapter_AnchorWikipediaStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String lang;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String url;

    public AnchorWikipediaStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorWikipediaStructV2$ProtoAdapter_AnchorWikipediaStructV2 */
    static final class ProtoAdapter_AnchorWikipediaStructV2 extends ProtoAdapter<AnchorWikipediaStructV2> {
        static {
            Covode.recordClassIndex(101943);
        }

        public ProtoAdapter_AnchorWikipediaStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorWikipediaStructV2.class);
        }

        public final int encodedSize(AnchorWikipediaStructV2 anchorWikipediaStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anchorWikipediaStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorWikipediaStructV2.lang) + ProtoAdapter.STRING.encodedSizeWithTag(3, anchorWikipediaStructV2.url) + anchorWikipediaStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnchorWikipediaStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.keyword(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.lang(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.url(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AnchorWikipediaStructV2 anchorWikipediaStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorWikipediaStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorWikipediaStructV2.lang);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, anchorWikipediaStructV2.url);
            protoWriter.writeBytes(anchorWikipediaStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorWikipediaStructV2$Builder */
    public static final class Builder extends Message.Builder<AnchorWikipediaStructV2, Builder> {
        public String keyword;
        public String lang;
        public String url;

        static {
            Covode.recordClassIndex(101942);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AnchorWikipediaStructV2 build() {
            return new AnchorWikipediaStructV2(this.keyword, this.lang, this.url, super.buildUnknownFields());
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder lang(String str) {
            this.lang = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101941);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AnchorWikipediaStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AnchorWikipediaStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.lang = this.lang;
        builder.url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.keyword;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        String str2 = this.lang;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        String str3 = this.url;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=").append(this.keyword);
        }
        if (this.lang != null) {
            sb.append(", lang=").append(this.lang);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        return sb.replace(0, 2, "AnchorWikipediaStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorWikipediaStructV2)) {
            return false;
        }
        AnchorWikipediaStructV2 anchorWikipediaStructV2 = (AnchorWikipediaStructV2) obj;
        if (!unknownFields().equals(anchorWikipediaStructV2.unknownFields()) || !Internal.equals(this.keyword, anchorWikipediaStructV2.keyword) || !Internal.equals(this.lang, anchorWikipediaStructV2.lang) || !Internal.equals(this.url, anchorWikipediaStructV2.url)) {
            return false;
        }
        return true;
    }

    public AnchorWikipediaStructV2(String str, String str2, String str3) {
        this(str, str2, str3, C89427i.EMPTY);
    }

    public AnchorWikipediaStructV2(String str, String str2, String str3, C89427i iVar) {
        super(ADAPTER, iVar);
        this.keyword = str;
        this.lang = str2;
        this.url = str3;
    }
}
