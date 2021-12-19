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

/* renamed from: com.ss.ugc.aweme.proto.AvatarDecorationStructV2 */
public final class AvatarDecorationStructV2 extends Message<AvatarDecorationStructV2, Builder> {
    public static final ProtoAdapter<AvatarDecorationStructV2> ADAPTER = new ProtoAdapter_AvatarDecorationStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)

    /* renamed from: id */
    public Long f195406id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 source_url;

    public AvatarDecorationStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.AvatarDecorationStructV2$ProtoAdapter_AvatarDecorationStructV2 */
    static final class ProtoAdapter_AvatarDecorationStructV2 extends ProtoAdapter<AvatarDecorationStructV2> {
        static {
            Covode.recordClassIndex(101958);
        }

        public ProtoAdapter_AvatarDecorationStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarDecorationStructV2.class);
        }

        public final int encodedSize(AvatarDecorationStructV2 avatarDecorationStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, avatarDecorationStructV2.f195406id) + ProtoAdapter.STRING.encodedSizeWithTag(2, avatarDecorationStructV2.name) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, avatarDecorationStructV2.source_url) + avatarDecorationStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AvatarDecorationStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.mo138077id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.source_url(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AvatarDecorationStructV2 avatarDecorationStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, avatarDecorationStructV2.f195406id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, avatarDecorationStructV2.name);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, avatarDecorationStructV2.source_url);
            protoWriter.writeBytes(avatarDecorationStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AvatarDecorationStructV2$Builder */
    public static final class Builder extends Message.Builder<AvatarDecorationStructV2, Builder> {

        /* renamed from: id */
        public Long f195407id;
        public String name;
        public UrlStructV2 source_url;

        static {
            Covode.recordClassIndex(101957);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AvatarDecorationStructV2 build() {
            return new AvatarDecorationStructV2(this.f195407id, this.name, this.source_url, super.buildUnknownFields());
        }

        /* renamed from: id */
        public final Builder mo138077id(Long l) {
            this.f195407id = l;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder source_url(UrlStructV2 urlStructV2) {
            this.source_url = urlStructV2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101956);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AvatarDecorationStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AvatarDecorationStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.f195407id = this.f195406id;
        builder.name = this.name;
        builder.source_url = this.source_url;
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
        Long l = this.f195406id;
        int i4 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        String str = this.name;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        UrlStructV2 urlStructV2 = this.source_url;
        if (urlStructV2 != null) {
            i4 = urlStructV2.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f195406id != null) {
            sb.append(", id=").append(this.f195406id);
        }
        if (this.name != null) {
            sb.append(", name=").append(this.name);
        }
        if (this.source_url != null) {
            sb.append(", source_url=").append(this.source_url);
        }
        return sb.replace(0, 2, "AvatarDecorationStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarDecorationStructV2)) {
            return false;
        }
        AvatarDecorationStructV2 avatarDecorationStructV2 = (AvatarDecorationStructV2) obj;
        if (!unknownFields().equals(avatarDecorationStructV2.unknownFields()) || !Internal.equals(this.f195406id, avatarDecorationStructV2.f195406id) || !Internal.equals(this.name, avatarDecorationStructV2.name) || !Internal.equals(this.source_url, avatarDecorationStructV2.source_url)) {
            return false;
        }
        return true;
    }

    public AvatarDecorationStructV2(Long l, String str, UrlStructV2 urlStructV2) {
        this(l, str, urlStructV2, C89427i.EMPTY);
    }

    public AvatarDecorationStructV2(Long l, String str, UrlStructV2 urlStructV2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.f195406id = l;
        this.name = str;
        this.source_url = urlStructV2;
    }
}
