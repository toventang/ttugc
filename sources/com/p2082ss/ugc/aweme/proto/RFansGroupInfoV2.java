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

/* renamed from: com.ss.ugc.aweme.proto.RFansGroupInfoV2 */
public final class RFansGroupInfoV2 extends Message<RFansGroupInfoV2, Builder> {
    public static final ProtoAdapter<RFansGroupInfoV2> ADAPTER = new ProtoAdapter_RFansGroupInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String download_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String token;

    public RFansGroupInfoV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.RFansGroupInfoV2$ProtoAdapter_RFansGroupInfoV2 */
    static final class ProtoAdapter_RFansGroupInfoV2 extends ProtoAdapter<RFansGroupInfoV2> {
        static {
            Covode.recordClassIndex(102273);
        }

        public ProtoAdapter_RFansGroupInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RFansGroupInfoV2.class);
        }

        public final int encodedSize(RFansGroupInfoV2 rFansGroupInfoV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, rFansGroupInfoV2.schema) + ProtoAdapter.STRING.encodedSizeWithTag(2, rFansGroupInfoV2.token) + ProtoAdapter.STRING.encodedSizeWithTag(3, rFansGroupInfoV2.download_url) + rFansGroupInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RFansGroupInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.schema(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.token(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.download_url(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, RFansGroupInfoV2 rFansGroupInfoV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rFansGroupInfoV2.schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rFansGroupInfoV2.token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rFansGroupInfoV2.download_url);
            protoWriter.writeBytes(rFansGroupInfoV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RFansGroupInfoV2$Builder */
    public static final class Builder extends Message.Builder<RFansGroupInfoV2, Builder> {
        public String download_url;
        public String schema;
        public String token;

        static {
            Covode.recordClassIndex(102272);
        }

        @Override // com.squareup.wire.Message.Builder
        public final RFansGroupInfoV2 build() {
            return new RFansGroupInfoV2(this.schema, this.token, this.download_url, super.buildUnknownFields());
        }

        public final Builder download_url(String str) {
            this.download_url = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102271);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.RFansGroupInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<RFansGroupInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.token = this.token;
        builder.download_url = this.download_url;
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
        String str = this.schema;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        String str2 = this.token;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        String str3 = this.download_url;
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
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.token != null) {
            sb.append(", token=").append(this.token);
        }
        if (this.download_url != null) {
            sb.append(", download_url=").append(this.download_url);
        }
        return sb.replace(0, 2, "RFansGroupInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RFansGroupInfoV2)) {
            return false;
        }
        RFansGroupInfoV2 rFansGroupInfoV2 = (RFansGroupInfoV2) obj;
        if (!unknownFields().equals(rFansGroupInfoV2.unknownFields()) || !Internal.equals(this.schema, rFansGroupInfoV2.schema) || !Internal.equals(this.token, rFansGroupInfoV2.token) || !Internal.equals(this.download_url, rFansGroupInfoV2.download_url)) {
            return false;
        }
        return true;
    }

    public RFansGroupInfoV2(String str, String str2, String str3) {
        this(str, str2, str3, C89427i.EMPTY);
    }

    public RFansGroupInfoV2(String str, String str2, String str3, C89427i iVar) {
        super(ADAPTER, iVar);
        this.schema = str;
        this.token = str2;
        this.download_url = str3;
    }
}
