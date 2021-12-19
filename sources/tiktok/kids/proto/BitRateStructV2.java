package tiktok.kids.proto;

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

public final class BitRateStructV2 extends Message<BitRateStructV2, Builder> {
    public static final ProtoAdapter<BitRateStructV2> ADAPTER = new ProtoAdapter_BitRateStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer bit_rate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String gear_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer is_h265;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 play_addr;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 play_addr_265;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public UrlStructV2 play_addr_bytevc1;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer quality_type;

    public BitRateStructV2() {
    }

    static final class ProtoAdapter_BitRateStructV2 extends ProtoAdapter<BitRateStructV2> {
        static {
            Covode.recordClassIndex(106782);
        }

        public ProtoAdapter_BitRateStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BitRateStructV2.class);
        }

        public final int encodedSize(BitRateStructV2 bitRateStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, bitRateStructV2.gear_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, bitRateStructV2.quality_type) + ProtoAdapter.INT32.encodedSizeWithTag(3, bitRateStructV2.bit_rate) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, bitRateStructV2.play_addr) + ProtoAdapter.INT32.encodedSizeWithTag(5, bitRateStructV2.is_h265) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, bitRateStructV2.play_addr_265) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, bitRateStructV2.play_addr_bytevc1) + bitRateStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitRateStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.gear_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.quality_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.bit_rate(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.play_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.is_h265(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.play_addr_265(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.play_addr_bytevc1(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitRateStructV2 bitRateStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bitRateStructV2.gear_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, bitRateStructV2.quality_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, bitRateStructV2.bit_rate);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, bitRateStructV2.play_addr);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, bitRateStructV2.is_h265);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, bitRateStructV2.play_addr_265);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, bitRateStructV2.play_addr_bytevc1);
            protoWriter.writeBytes(bitRateStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106780);
    }

    public static final class Builder extends Message.Builder<BitRateStructV2, Builder> {
        public Integer bit_rate;
        public String gear_name;
        public Integer is_h265;
        public UrlStructV2 play_addr;
        public UrlStructV2 play_addr_265;
        public UrlStructV2 play_addr_bytevc1;
        public Integer quality_type;

        static {
            Covode.recordClassIndex(106781);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitRateStructV2 build() {
            return new BitRateStructV2(this.gear_name, this.quality_type, this.bit_rate, this.play_addr, this.is_h265, this.play_addr_265, this.play_addr_bytevc1, super.buildUnknownFields());
        }

        public final Builder bit_rate(Integer num) {
            this.bit_rate = num;
            return this;
        }

        public final Builder gear_name(String str) {
            this.gear_name = str;
            return this;
        }

        public final Builder is_h265(Integer num) {
            this.is_h265 = num;
            return this;
        }

        public final Builder play_addr(UrlStructV2 urlStructV2) {
            this.play_addr = urlStructV2;
            return this;
        }

        public final Builder play_addr_265(UrlStructV2 urlStructV2) {
            this.play_addr_265 = urlStructV2;
            return this;
        }

        public final Builder play_addr_bytevc1(UrlStructV2 urlStructV2) {
            this.play_addr_bytevc1 = urlStructV2;
            return this;
        }

        public final Builder quality_type(Integer num) {
            this.quality_type = num;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.BitRateStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitRateStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.gear_name = this.gear_name;
        builder.quality_type = this.quality_type;
        builder.bit_rate = this.bit_rate;
        builder.play_addr = this.play_addr;
        builder.is_h265 = this.is_h265;
        builder.play_addr_265 = this.play_addr_265;
        builder.play_addr_bytevc1 = this.play_addr_bytevc1;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.gear_name;
        int i8 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        Integer num = this.quality_type;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        Integer num2 = this.bit_rate;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        UrlStructV2 urlStructV2 = this.play_addr;
        if (urlStructV2 != null) {
            i4 = urlStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        Integer num3 = this.is_h265;
        if (num3 != null) {
            i5 = num3.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        UrlStructV2 urlStructV22 = this.play_addr_265;
        if (urlStructV22 != null) {
            i6 = urlStructV22.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        UrlStructV2 urlStructV23 = this.play_addr_bytevc1;
        if (urlStructV23 != null) {
            i8 = urlStructV23.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.gear_name != null) {
            sb.append(", gear_name=").append(this.gear_name);
        }
        if (this.quality_type != null) {
            sb.append(", quality_type=").append(this.quality_type);
        }
        if (this.bit_rate != null) {
            sb.append(", bit_rate=").append(this.bit_rate);
        }
        if (this.play_addr != null) {
            sb.append(", play_addr=").append(this.play_addr);
        }
        if (this.is_h265 != null) {
            sb.append(", is_h265=").append(this.is_h265);
        }
        if (this.play_addr_265 != null) {
            sb.append(", play_addr_265=").append(this.play_addr_265);
        }
        if (this.play_addr_bytevc1 != null) {
            sb.append(", play_addr_bytevc1=").append(this.play_addr_bytevc1);
        }
        return sb.replace(0, 2, "BitRateStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitRateStructV2)) {
            return false;
        }
        BitRateStructV2 bitRateStructV2 = (BitRateStructV2) obj;
        if (!unknownFields().equals(bitRateStructV2.unknownFields()) || !Internal.equals(this.gear_name, bitRateStructV2.gear_name) || !Internal.equals(this.quality_type, bitRateStructV2.quality_type) || !Internal.equals(this.bit_rate, bitRateStructV2.bit_rate) || !Internal.equals(this.play_addr, bitRateStructV2.play_addr) || !Internal.equals(this.is_h265, bitRateStructV2.is_h265) || !Internal.equals(this.play_addr_265, bitRateStructV2.play_addr_265) || !Internal.equals(this.play_addr_bytevc1, bitRateStructV2.play_addr_bytevc1)) {
            return false;
        }
        return true;
    }

    public BitRateStructV2(String str, Integer num, Integer num2, UrlStructV2 urlStructV2, Integer num3, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23) {
        this(str, num, num2, urlStructV2, num3, urlStructV22, urlStructV23, C89427i.EMPTY);
    }

    public BitRateStructV2(String str, Integer num, Integer num2, UrlStructV2 urlStructV2, Integer num3, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, C89427i iVar) {
        super(ADAPTER, iVar);
        this.gear_name = str;
        this.quality_type = num;
        this.bit_rate = num2;
        this.play_addr = urlStructV2;
        this.is_h265 = num3;
        this.play_addr_265 = urlStructV22;
        this.play_addr_bytevc1 = urlStructV23;
    }
}
