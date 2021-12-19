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

/* renamed from: com.ss.ugc.aweme.proto.ItemLikeEggDataV2 */
public final class ItemLikeEggDataV2 extends Message<ItemLikeEggDataV2, Builder> {
    public static final ProtoAdapter<ItemLikeEggDataV2> ADAPTER = new ProtoAdapter_ItemLikeEggDataV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String file_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String material_url;

    public ItemLikeEggDataV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.ItemLikeEggDataV2$ProtoAdapter_ItemLikeEggDataV2 */
    static final class ProtoAdapter_ItemLikeEggDataV2 extends ProtoAdapter<ItemLikeEggDataV2> {
        static {
            Covode.recordClassIndex(102147);
        }

        public ProtoAdapter_ItemLikeEggDataV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ItemLikeEggDataV2.class);
        }

        public final int encodedSize(ItemLikeEggDataV2 itemLikeEggDataV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, itemLikeEggDataV2.material_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, itemLikeEggDataV2.file_type) + itemLikeEggDataV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ItemLikeEggDataV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.material_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.file_type(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ItemLikeEggDataV2 itemLikeEggDataV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, itemLikeEggDataV2.material_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, itemLikeEggDataV2.file_type);
            protoWriter.writeBytes(itemLikeEggDataV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ItemLikeEggDataV2$Builder */
    public static final class Builder extends Message.Builder<ItemLikeEggDataV2, Builder> {
        public String file_type;
        public String material_url;

        static {
            Covode.recordClassIndex(102146);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ItemLikeEggDataV2 build() {
            return new ItemLikeEggDataV2(this.material_url, this.file_type, super.buildUnknownFields());
        }

        public final Builder file_type(String str) {
            this.file_type = str;
            return this;
        }

        public final Builder material_url(String str) {
            this.material_url = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102145);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ItemLikeEggDataV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ItemLikeEggDataV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.material_url = this.material_url;
        builder.file_type = this.file_type;
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
        String str = this.material_url;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        String str2 = this.file_type;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.material_url != null) {
            sb.append(", material_url=").append(this.material_url);
        }
        if (this.file_type != null) {
            sb.append(", file_type=").append(this.file_type);
        }
        return sb.replace(0, 2, "ItemLikeEggDataV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemLikeEggDataV2)) {
            return false;
        }
        ItemLikeEggDataV2 itemLikeEggDataV2 = (ItemLikeEggDataV2) obj;
        if (!unknownFields().equals(itemLikeEggDataV2.unknownFields()) || !Internal.equals(this.material_url, itemLikeEggDataV2.material_url) || !Internal.equals(this.file_type, itemLikeEggDataV2.file_type)) {
            return false;
        }
        return true;
    }

    public ItemLikeEggDataV2(String str, String str2) {
        this(str, str2, C89427i.EMPTY);
    }

    public ItemLikeEggDataV2(String str, String str2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.material_url = str;
        this.file_type = str2;
    }
}
