package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitSearchCategory implements WireEnum {
    UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY(0),
    TEXT(1),
    AUTOCOMPLETE(2),
    PROGRAMMED_PILLS(3),
    SEED_SEARCH(4);
    
    public static final ProtoAdapter<BitmojiKitSearchCategory> ADAPTER = new ProtoAdapter_BitmojiKitSearchCategory();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BitmojiKitSearchCategory extends EnumAdapter<BitmojiKitSearchCategory> {
        static {
            Covode.recordClassIndex(35232);
        }

        ProtoAdapter_BitmojiKitSearchCategory() {
            super(BitmojiKitSearchCategory.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BitmojiKitSearchCategory fromValue(int i) {
            return BitmojiKitSearchCategory.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(35231);
    }

    public static BitmojiKitSearchCategory fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
        }
        if (i == 1) {
            return TEXT;
        }
        if (i == 2) {
            return AUTOCOMPLETE;
        }
        if (i == 3) {
            return PROGRAMMED_PILLS;
        }
        if (i != 4) {
            return null;
        }
        return SEED_SEARCH;
    }

    private BitmojiKitSearchCategory(int i) {
        this.value = i;
    }
}
