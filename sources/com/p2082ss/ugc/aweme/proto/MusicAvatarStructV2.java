package com.p2082ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import p4632k.C89427i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ugc.aweme.proto.MusicAvatarStructV2 */
public final class MusicAvatarStructV2 extends Message<MusicAvatarStructV2, Builder> {
    public static final ProtoAdapter<MusicAvatarStructV2> ADAPTER = new ProtoAdapter_MusicAvatarStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)

    /* renamed from: hd */
    public UrlStructV2 f195416hd;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 thumb;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 thumbnail;

    /* renamed from: com.ss.ugc.aweme.proto.MusicAvatarStructV2$ProtoAdapter_MusicAvatarStructV2 */
    static final class ProtoAdapter_MusicAvatarStructV2 extends ProtoAdapter<MusicAvatarStructV2> {
        static {
            Covode.recordClassIndex(102207);
        }

        public ProtoAdapter_MusicAvatarStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicAvatarStructV2.class);
        }

        public final int encodedSize(MusicAvatarStructV2 musicAvatarStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, musicAvatarStructV2.thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, musicAvatarStructV2.thumbnail) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, musicAvatarStructV2.medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, musicAvatarStructV2.large) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, musicAvatarStructV2.f195416hd) + musicAvatarStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MusicAvatarStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.thumb(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.thumbnail(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.medium(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.large(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.mo139042hd(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MusicAvatarStructV2 musicAvatarStructV2) {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, musicAvatarStructV2.thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, musicAvatarStructV2.thumbnail);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, musicAvatarStructV2.medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, musicAvatarStructV2.large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, musicAvatarStructV2.f195416hd);
            protoWriter.writeBytes(musicAvatarStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102205);
    }

    /* renamed from: com.ss.ugc.aweme.proto.MusicAvatarStructV2$Builder */
    public static final class Builder extends Message.Builder<MusicAvatarStructV2, Builder> {

        /* renamed from: hd */
        public UrlStructV2 f195417hd;
        public UrlStructV2 large;
        public UrlStructV2 medium;
        public UrlStructV2 thumb;
        public UrlStructV2 thumbnail;

        static {
            Covode.recordClassIndex(102206);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MusicAvatarStructV2 build() {
            return new MusicAvatarStructV2(this.thumb, this.thumbnail, this.medium, this.large, this.f195417hd, super.buildUnknownFields());
        }

        /* renamed from: hd */
        public final Builder mo139042hd(UrlStructV2 urlStructV2) {
            this.f195417hd = urlStructV2;
            return this;
        }

        public final Builder large(UrlStructV2 urlStructV2) {
            this.large = urlStructV2;
            return this;
        }

        public final Builder medium(UrlStructV2 urlStructV2) {
            this.medium = urlStructV2;
            return this;
        }

        public final Builder thumb(UrlStructV2 urlStructV2) {
            this.thumb = urlStructV2;
            return this;
        }

        public final Builder thumbnail(UrlStructV2 urlStructV2) {
            this.thumbnail = urlStructV2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MusicAvatarStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MusicAvatarStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.thumb = this.thumb;
        builder.thumbnail = this.thumbnail;
        builder.medium = this.medium;
        builder.large = this.large;
        builder.f195417hd = this.f195416hd;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UrlStructV2 urlStructV2 = this.thumb;
        int i6 = 0;
        if (urlStructV2 != null) {
            i = urlStructV2.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        UrlStructV2 urlStructV22 = this.thumbnail;
        if (urlStructV22 != null) {
            i2 = urlStructV22.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        UrlStructV2 urlStructV23 = this.medium;
        if (urlStructV23 != null) {
            i3 = urlStructV23.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        UrlStructV2 urlStructV24 = this.large;
        if (urlStructV24 != null) {
            i4 = urlStructV24.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        UrlStructV2 urlStructV25 = this.f195416hd;
        if (urlStructV25 != null) {
            i6 = urlStructV25.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.thumb != null) {
            sb.append(", thumb=").append(this.thumb);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=").append(this.thumbnail);
        }
        if (this.medium != null) {
            sb.append(", medium=").append(this.medium);
        }
        if (this.large != null) {
            sb.append(", large=").append(this.large);
        }
        if (this.f195416hd != null) {
            sb.append(", hd=").append(this.f195416hd);
        }
        return sb.replace(0, 2, "MusicAvatarStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicAvatarStructV2)) {
            return false;
        }
        MusicAvatarStructV2 musicAvatarStructV2 = (MusicAvatarStructV2) obj;
        if (!unknownFields().equals(musicAvatarStructV2.unknownFields()) || !Internal.equals(this.thumb, musicAvatarStructV2.thumb) || !Internal.equals(this.thumbnail, musicAvatarStructV2.thumbnail) || !Internal.equals(this.medium, musicAvatarStructV2.medium) || !Internal.equals(this.large, musicAvatarStructV2.large) || !Internal.equals(this.f195416hd, musicAvatarStructV2.f195416hd)) {
            return false;
        }
        return true;
    }

    public MusicAvatarStructV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25) {
        this(urlStructV2, urlStructV22, urlStructV23, urlStructV24, urlStructV25, C89427i.EMPTY);
    }

    public MusicAvatarStructV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25, C89427i iVar) {
        super(ADAPTER, iVar);
        this.thumb = urlStructV2;
        this.thumbnail = urlStructV22;
        this.medium = urlStructV23;
        this.large = urlStructV24;
        this.f195416hd = urlStructV25;
    }
}
