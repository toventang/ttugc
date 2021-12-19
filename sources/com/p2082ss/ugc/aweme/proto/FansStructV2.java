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

/* renamed from: com.ss.ugc.aweme.proto.FansStructV2 */
public final class FansStructV2 extends Message<FansStructV2, Builder> {
    public static final ProtoAdapter<FansStructV2> ADAPTER = new ProtoAdapter_FansStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer fans_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String fans_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean is_fan;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean light_up;

    public FansStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.FansStructV2$ProtoAdapter_FansStructV2 */
    static final class ProtoAdapter_FansStructV2 extends ProtoAdapter<FansStructV2> {
        static {
            Covode.recordClassIndex(102093);
        }

        public ProtoAdapter_FansStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, FansStructV2.class);
        }

        public final int encodedSize(FansStructV2 fansStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fansStructV2.fans_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, fansStructV2.fans_level) + ProtoAdapter.BOOL.encodedSizeWithTag(3, fansStructV2.is_fan) + ProtoAdapter.BOOL.encodedSizeWithTag(4, fansStructV2.light_up) + fansStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FansStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.fans_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.fans_level(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.is_fan(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.light_up(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, FansStructV2 fansStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fansStructV2.fans_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, fansStructV2.fans_level);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, fansStructV2.is_fan);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, fansStructV2.light_up);
            protoWriter.writeBytes(fansStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102091);
    }

    /* renamed from: com.ss.ugc.aweme.proto.FansStructV2$Builder */
    public static final class Builder extends Message.Builder<FansStructV2, Builder> {
        public Integer fans_level;
        public String fans_name;
        public Boolean is_fan;
        public Boolean light_up;

        static {
            Covode.recordClassIndex(102092);
        }

        @Override // com.squareup.wire.Message.Builder
        public final FansStructV2 build() {
            return new FansStructV2(this.fans_name, this.fans_level, this.is_fan, this.light_up, super.buildUnknownFields());
        }

        public final Builder fans_level(Integer num) {
            this.fans_level = num;
            return this;
        }

        public final Builder fans_name(String str) {
            this.fans_name = str;
            return this;
        }

        public final Builder is_fan(Boolean bool) {
            this.is_fan = bool;
            return this;
        }

        public final Builder light_up(Boolean bool) {
            this.light_up = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.FansStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<FansStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.fans_name = this.fans_name;
        builder.fans_level = this.fans_level;
        builder.is_fan = this.is_fan;
        builder.light_up = this.light_up;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.fans_name;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        Integer num = this.fans_level;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        Boolean bool = this.is_fan;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Boolean bool2 = this.light_up;
        if (bool2 != null) {
            i5 = bool2.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fans_name != null) {
            sb.append(", fans_name=").append(this.fans_name);
        }
        if (this.fans_level != null) {
            sb.append(", fans_level=").append(this.fans_level);
        }
        if (this.is_fan != null) {
            sb.append(", is_fan=").append(this.is_fan);
        }
        if (this.light_up != null) {
            sb.append(", light_up=").append(this.light_up);
        }
        return sb.replace(0, 2, "FansStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FansStructV2)) {
            return false;
        }
        FansStructV2 fansStructV2 = (FansStructV2) obj;
        if (!unknownFields().equals(fansStructV2.unknownFields()) || !Internal.equals(this.fans_name, fansStructV2.fans_name) || !Internal.equals(this.fans_level, fansStructV2.fans_level) || !Internal.equals(this.is_fan, fansStructV2.is_fan) || !Internal.equals(this.light_up, fansStructV2.light_up)) {
            return false;
        }
        return true;
    }

    public FansStructV2(String str, Integer num, Boolean bool, Boolean bool2) {
        this(str, num, bool, bool2, C89427i.EMPTY);
    }

    public FansStructV2(String str, Integer num, Boolean bool, Boolean bool2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.fans_name = str;
        this.fans_level = num;
        this.is_fan = bool;
        this.light_up = bool2;
    }
}
