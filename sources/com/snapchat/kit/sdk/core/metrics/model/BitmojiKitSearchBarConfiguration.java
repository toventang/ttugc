package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitSearchBarConfiguration implements WireEnum {
    SEARCH_BAR_VISIBLE(0),
    SEARCH_BAR_HIDDEN(1);
    
    public static final ProtoAdapter<BitmojiKitSearchBarConfiguration> ADAPTER = new ProtoAdapter_BitmojiKitSearchBarConfiguration();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BitmojiKitSearchBarConfiguration extends EnumAdapter<BitmojiKitSearchBarConfiguration> {
        static {
            Covode.recordClassIndex(35230);
        }

        ProtoAdapter_BitmojiKitSearchBarConfiguration() {
            super(BitmojiKitSearchBarConfiguration.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BitmojiKitSearchBarConfiguration fromValue(int i) {
            return BitmojiKitSearchBarConfiguration.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(35229);
    }

    public static BitmojiKitSearchBarConfiguration fromValue(int i) {
        if (i == 0) {
            return SEARCH_BAR_VISIBLE;
        }
        if (i != 1) {
            return null;
        }
        return SEARCH_BAR_HIDDEN;
    }

    private BitmojiKitSearchBarConfiguration(int i) {
        this.value = i;
    }
}
