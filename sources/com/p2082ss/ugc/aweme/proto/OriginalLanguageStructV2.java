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

/* renamed from: com.ss.ugc.aweme.proto.OriginalLanguageStructV2 */
public final class OriginalLanguageStructV2 extends Message<OriginalLanguageStructV2, Builder> {
    public static final ProtoAdapter<OriginalLanguageStructV2> ADAPTER = new ProtoAdapter_OriginalLanguageStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String lang;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long language_id;

    public OriginalLanguageStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.OriginalLanguageStructV2$ProtoAdapter_OriginalLanguageStructV2 */
    static final class ProtoAdapter_OriginalLanguageStructV2 extends ProtoAdapter<OriginalLanguageStructV2> {
        static {
            Covode.recordClassIndex(102234);
        }

        public ProtoAdapter_OriginalLanguageStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, OriginalLanguageStructV2.class);
        }

        public final int encodedSize(OriginalLanguageStructV2 originalLanguageStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, originalLanguageStructV2.lang) + ProtoAdapter.INT64.encodedSizeWithTag(2, originalLanguageStructV2.language_id) + originalLanguageStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final OriginalLanguageStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.lang(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.language_id(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, OriginalLanguageStructV2 originalLanguageStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, originalLanguageStructV2.lang);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, originalLanguageStructV2.language_id);
            protoWriter.writeBytes(originalLanguageStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.OriginalLanguageStructV2$Builder */
    public static final class Builder extends Message.Builder<OriginalLanguageStructV2, Builder> {
        public String lang;
        public Long language_id;

        static {
            Covode.recordClassIndex(102233);
        }

        @Override // com.squareup.wire.Message.Builder
        public final OriginalLanguageStructV2 build() {
            return new OriginalLanguageStructV2(this.lang, this.language_id, super.buildUnknownFields());
        }

        public final Builder lang(String str) {
            this.lang = str;
            return this;
        }

        public final Builder language_id(Long l) {
            this.language_id = l;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102232);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.OriginalLanguageStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<OriginalLanguageStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.lang = this.lang;
        builder.language_id = this.language_id;
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
        String str = this.lang;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        Long l = this.language_id;
        if (l != null) {
            i3 = l.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.lang != null) {
            sb.append(", lang=").append(this.lang);
        }
        if (this.language_id != null) {
            sb.append(", language_id=").append(this.language_id);
        }
        return sb.replace(0, 2, "OriginalLanguageStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OriginalLanguageStructV2)) {
            return false;
        }
        OriginalLanguageStructV2 originalLanguageStructV2 = (OriginalLanguageStructV2) obj;
        if (!unknownFields().equals(originalLanguageStructV2.unknownFields()) || !Internal.equals(this.lang, originalLanguageStructV2.lang) || !Internal.equals(this.language_id, originalLanguageStructV2.language_id)) {
            return false;
        }
        return true;
    }

    public OriginalLanguageStructV2(String str, Long l) {
        this(str, l, C89427i.EMPTY);
    }

    public OriginalLanguageStructV2(String str, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.lang = str;
        this.language_id = l;
    }
}
