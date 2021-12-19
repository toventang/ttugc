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

/* renamed from: com.ss.ugc.aweme.proto.QuickShopStructV2 */
public final class QuickShopStructV2 extends Message<QuickShopStructV2, Builder> {
    public static final ProtoAdapter<QuickShopStructV2> ADAPTER = new ProtoAdapter_QuickShopStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String quick_shop_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String quick_shop_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.QuickShopSecondFloorV2#ADAPTER", tag = 4)
    public QuickShopSecondFloorV2 second_floor_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean with_text_entry;

    public QuickShopStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.QuickShopStructV2$ProtoAdapter_QuickShopStructV2 */
    static final class ProtoAdapter_QuickShopStructV2 extends ProtoAdapter<QuickShopStructV2> {
        static {
            Covode.recordClassIndex(102270);
        }

        public ProtoAdapter_QuickShopStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, QuickShopStructV2.class);
        }

        public final int encodedSize(QuickShopStructV2 quickShopStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, quickShopStructV2.quick_shop_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, quickShopStructV2.quick_shop_name) + ProtoAdapter.BOOL.encodedSizeWithTag(3, quickShopStructV2.with_text_entry) + QuickShopSecondFloorV2.ADAPTER.encodedSizeWithTag(4, quickShopStructV2.second_floor_info) + quickShopStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final QuickShopStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.quick_shop_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.quick_shop_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.with_text_entry(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.second_floor_info(QuickShopSecondFloorV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, QuickShopStructV2 quickShopStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quickShopStructV2.quick_shop_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, quickShopStructV2.quick_shop_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, quickShopStructV2.with_text_entry);
            QuickShopSecondFloorV2.ADAPTER.encodeWithTag(protoWriter, 4, quickShopStructV2.second_floor_info);
            protoWriter.writeBytes(quickShopStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102268);
    }

    /* renamed from: com.ss.ugc.aweme.proto.QuickShopStructV2$Builder */
    public static final class Builder extends Message.Builder<QuickShopStructV2, Builder> {
        public String quick_shop_name;
        public String quick_shop_url;
        public QuickShopSecondFloorV2 second_floor_info;
        public Boolean with_text_entry;

        static {
            Covode.recordClassIndex(102269);
        }

        @Override // com.squareup.wire.Message.Builder
        public final QuickShopStructV2 build() {
            return new QuickShopStructV2(this.quick_shop_url, this.quick_shop_name, this.with_text_entry, this.second_floor_info, super.buildUnknownFields());
        }

        public final Builder quick_shop_name(String str) {
            this.quick_shop_name = str;
            return this;
        }

        public final Builder quick_shop_url(String str) {
            this.quick_shop_url = str;
            return this;
        }

        public final Builder second_floor_info(QuickShopSecondFloorV2 quickShopSecondFloorV2) {
            this.second_floor_info = quickShopSecondFloorV2;
            return this;
        }

        public final Builder with_text_entry(Boolean bool) {
            this.with_text_entry = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.QuickShopStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<QuickShopStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.quick_shop_url = this.quick_shop_url;
        builder.quick_shop_name = this.quick_shop_name;
        builder.with_text_entry = this.with_text_entry;
        builder.second_floor_info = this.second_floor_info;
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
        String str = this.quick_shop_url;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        String str2 = this.quick_shop_name;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        Boolean bool = this.with_text_entry;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        QuickShopSecondFloorV2 quickShopSecondFloorV2 = this.second_floor_info;
        if (quickShopSecondFloorV2 != null) {
            i5 = quickShopSecondFloorV2.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.quick_shop_url != null) {
            sb.append(", quick_shop_url=").append(this.quick_shop_url);
        }
        if (this.quick_shop_name != null) {
            sb.append(", quick_shop_name=").append(this.quick_shop_name);
        }
        if (this.with_text_entry != null) {
            sb.append(", with_text_entry=").append(this.with_text_entry);
        }
        if (this.second_floor_info != null) {
            sb.append(", second_floor_info=").append(this.second_floor_info);
        }
        return sb.replace(0, 2, "QuickShopStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickShopStructV2)) {
            return false;
        }
        QuickShopStructV2 quickShopStructV2 = (QuickShopStructV2) obj;
        if (!unknownFields().equals(quickShopStructV2.unknownFields()) || !Internal.equals(this.quick_shop_url, quickShopStructV2.quick_shop_url) || !Internal.equals(this.quick_shop_name, quickShopStructV2.quick_shop_name) || !Internal.equals(this.with_text_entry, quickShopStructV2.with_text_entry) || !Internal.equals(this.second_floor_info, quickShopStructV2.second_floor_info)) {
            return false;
        }
        return true;
    }

    public QuickShopStructV2(String str, String str2, Boolean bool, QuickShopSecondFloorV2 quickShopSecondFloorV2) {
        this(str, str2, bool, quickShopSecondFloorV2, C89427i.EMPTY);
    }

    public QuickShopStructV2(String str, String str2, Boolean bool, QuickShopSecondFloorV2 quickShopSecondFloorV2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.quick_shop_url = str;
        this.quick_shop_name = str2;
        this.with_text_entry = bool;
        this.second_floor_info = quickShopSecondFloorV2;
    }
}
