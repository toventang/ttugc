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

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ugc.aweme.proto.MusicChorusInfoStructV2 */
public final class MusicChorusInfoStructV2 extends Message<MusicChorusInfoStructV2, Builder> {
    public static final ProtoAdapter<MusicChorusInfoStructV2> ADAPTER = new ProtoAdapter_MusicChorusInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long duration_ms;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long start_ms;

    /* renamed from: com.ss.ugc.aweme.proto.MusicChorusInfoStructV2$ProtoAdapter_MusicChorusInfoStructV2 */
    static final class ProtoAdapter_MusicChorusInfoStructV2 extends ProtoAdapter<MusicChorusInfoStructV2> {
        static {
            Covode.recordClassIndex(102210);
        }

        public ProtoAdapter_MusicChorusInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicChorusInfoStructV2.class);
        }

        public final int encodedSize(MusicChorusInfoStructV2 musicChorusInfoStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, musicChorusInfoStructV2.start_ms) + ProtoAdapter.INT64.encodedSizeWithTag(2, musicChorusInfoStructV2.duration_ms) + musicChorusInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MusicChorusInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.start_ms(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.duration_ms(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MusicChorusInfoStructV2 musicChorusInfoStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, musicChorusInfoStructV2.start_ms);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, musicChorusInfoStructV2.duration_ms);
            protoWriter.writeBytes(musicChorusInfoStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MusicChorusInfoStructV2$Builder */
    public static final class Builder extends Message.Builder<MusicChorusInfoStructV2, Builder> {
        public Long duration_ms;
        public Long start_ms;

        static {
            Covode.recordClassIndex(102209);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MusicChorusInfoStructV2 build() {
            return new MusicChorusInfoStructV2(this.start_ms, this.duration_ms, super.buildUnknownFields());
        }

        public final Builder duration_ms(Long l) {
            this.duration_ms = l;
            return this;
        }

        public final Builder start_ms(Long l) {
            this.start_ms = l;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102208);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MusicChorusInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MusicChorusInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.start_ms = this.start_ms;
        builder.duration_ms = this.duration_ms;
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
        Long l = this.start_ms;
        int i3 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        Long l2 = this.duration_ms;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start_ms != null) {
            sb.append(", start_ms=").append(this.start_ms);
        }
        if (this.duration_ms != null) {
            sb.append(", duration_ms=").append(this.duration_ms);
        }
        return sb.replace(0, 2, "MusicChorusInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicChorusInfoStructV2)) {
            return false;
        }
        MusicChorusInfoStructV2 musicChorusInfoStructV2 = (MusicChorusInfoStructV2) obj;
        if (!unknownFields().equals(musicChorusInfoStructV2.unknownFields()) || !Internal.equals(this.start_ms, musicChorusInfoStructV2.start_ms) || !Internal.equals(this.duration_ms, musicChorusInfoStructV2.duration_ms)) {
            return false;
        }
        return true;
    }

    public MusicChorusInfoStructV2(Long l, Long l2) {
        this(l, l2, C89427i.EMPTY);
    }

    public MusicChorusInfoStructV2(Long l, Long l2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.start_ms = l;
        this.duration_ms = l2;
    }
}
