package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitShareCategory implements WireEnum {
    UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY(0),
    POPULAR(1),
    SEARCH(2);
    
    public static final ProtoAdapter<BitmojiKitShareCategory> ADAPTER = new ProtoAdapter_BitmojiKitShareCategory();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BitmojiKitShareCategory extends EnumAdapter<BitmojiKitShareCategory> {
        static {
            Covode.recordClassIndex(35240);
        }

        ProtoAdapter_BitmojiKitShareCategory() {
            super(BitmojiKitShareCategory.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BitmojiKitShareCategory fromValue(int i) {
            return BitmojiKitShareCategory.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(35239);
    }

    public static BitmojiKitShareCategory fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY;
        }
        if (i == 1) {
            return POPULAR;
        }
        if (i != 2) {
            return null;
        }
        return SEARCH;
    }

    private BitmojiKitShareCategory(int i) {
        this.value = i;
    }
}
