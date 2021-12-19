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
/* renamed from: com.ss.ugc.aweme.proto.DuetInfoV2 */
public final class DuetInfoV2 extends Message<DuetInfoV2, Builder> {
    public static final ProtoAdapter<DuetInfoV2> ADAPTER = new ProtoAdapter_DuetInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long original_item_duetted_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String original_item_id;

    /* renamed from: com.ss.ugc.aweme.proto.DuetInfoV2$ProtoAdapter_DuetInfoV2 */
    static final class ProtoAdapter_DuetInfoV2 extends ProtoAdapter<DuetInfoV2> {
        static {
            Covode.recordClassIndex(102075);
        }

        public ProtoAdapter_DuetInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DuetInfoV2.class);
        }

        public final int encodedSize(DuetInfoV2 duetInfoV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(2, duetInfoV2.original_item_duetted_count) + ProtoAdapter.STRING.encodedSizeWithTag(3, duetInfoV2.original_item_id) + duetInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DuetInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 2) {
                    builder.original_item_duetted_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.original_item_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DuetInfoV2 duetInfoV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, duetInfoV2.original_item_duetted_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, duetInfoV2.original_item_id);
            protoWriter.writeBytes(duetInfoV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.DuetInfoV2$Builder */
    public static final class Builder extends Message.Builder<DuetInfoV2, Builder> {
        public Long original_item_duetted_count;
        public String original_item_id;

        static {
            Covode.recordClassIndex(102074);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DuetInfoV2 build() {
            return new DuetInfoV2(this.original_item_duetted_count, this.original_item_id, super.buildUnknownFields());
        }

        public final Builder original_item_duetted_count(Long l) {
            this.original_item_duetted_count = l;
            return this;
        }

        public final Builder original_item_id(String str) {
            this.original_item_id = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102073);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.DuetInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DuetInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.original_item_duetted_count = this.original_item_duetted_count;
        builder.original_item_id = this.original_item_id;
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
        Long l = this.original_item_duetted_count;
        int i3 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        String str = this.original_item_id;
        if (str != null) {
            i3 = str.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.original_item_duetted_count != null) {
            sb.append(", original_item_duetted_count=").append(this.original_item_duetted_count);
        }
        if (this.original_item_id != null) {
            sb.append(", original_item_id=").append(this.original_item_id);
        }
        return sb.replace(0, 2, "DuetInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DuetInfoV2)) {
            return false;
        }
        DuetInfoV2 duetInfoV2 = (DuetInfoV2) obj;
        if (!unknownFields().equals(duetInfoV2.unknownFields()) || !Internal.equals(this.original_item_duetted_count, duetInfoV2.original_item_duetted_count) || !Internal.equals(this.original_item_id, duetInfoV2.original_item_id)) {
            return false;
        }
        return true;
    }

    public DuetInfoV2(Long l, String str) {
        this(l, str, C89427i.EMPTY);
    }

    public DuetInfoV2(Long l, String str, C89427i iVar) {
        super(ADAPTER, iVar);
        this.original_item_duetted_count = l;
        this.original_item_id = str;
    }
}
