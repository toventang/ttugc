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

/* renamed from: com.ss.ugc.aweme.proto.LinkUserInfoStructV2 */
public final class LinkUserInfoStructV2 extends Message<LinkUserInfoStructV2, Builder> {
    public static final ProtoAdapter<LinkUserInfoStructV2> ADAPTER = new ProtoAdapter_LinkUserInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer auth_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer auth_type;

    public LinkUserInfoStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.LinkUserInfoStructV2$ProtoAdapter_LinkUserInfoStructV2 */
    static final class ProtoAdapter_LinkUserInfoStructV2 extends ProtoAdapter<LinkUserInfoStructV2> {
        static {
            Covode.recordClassIndex(102156);
        }

        public ProtoAdapter_LinkUserInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkUserInfoStructV2.class);
        }

        public final int encodedSize(LinkUserInfoStructV2 linkUserInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, linkUserInfoStructV2.auth_status) + ProtoAdapter.INT32.encodedSizeWithTag(2, linkUserInfoStructV2.auth_type) + linkUserInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LinkUserInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.auth_status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.auth_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LinkUserInfoStructV2 linkUserInfoStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, linkUserInfoStructV2.auth_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, linkUserInfoStructV2.auth_type);
            protoWriter.writeBytes(linkUserInfoStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LinkUserInfoStructV2$Builder */
    public static final class Builder extends Message.Builder<LinkUserInfoStructV2, Builder> {
        public Integer auth_status;
        public Integer auth_type;

        static {
            Covode.recordClassIndex(102155);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LinkUserInfoStructV2 build() {
            return new LinkUserInfoStructV2(this.auth_status, this.auth_type, super.buildUnknownFields());
        }

        public final Builder auth_status(Integer num) {
            this.auth_status = num;
            return this;
        }

        public final Builder auth_type(Integer num) {
            this.auth_type = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102154);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.LinkUserInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LinkUserInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.auth_status = this.auth_status;
        builder.auth_type = this.auth_type;
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
        Integer num = this.auth_status;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        Integer num2 = this.auth_type;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.auth_status != null) {
            sb.append(", auth_status=").append(this.auth_status);
        }
        if (this.auth_type != null) {
            sb.append(", auth_type=").append(this.auth_type);
        }
        return sb.replace(0, 2, "LinkUserInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkUserInfoStructV2)) {
            return false;
        }
        LinkUserInfoStructV2 linkUserInfoStructV2 = (LinkUserInfoStructV2) obj;
        if (!unknownFields().equals(linkUserInfoStructV2.unknownFields()) || !Internal.equals(this.auth_status, linkUserInfoStructV2.auth_status) || !Internal.equals(this.auth_type, linkUserInfoStructV2.auth_type)) {
            return false;
        }
        return true;
    }

    public LinkUserInfoStructV2(Integer num, Integer num2) {
        this(num, num2, C89427i.EMPTY);
    }

    public LinkUserInfoStructV2(Integer num, Integer num2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.auth_status = num;
        this.auth_type = num2;
    }
}
