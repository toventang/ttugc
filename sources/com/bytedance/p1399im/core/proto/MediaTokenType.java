package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MediaTokenType */
public enum MediaTokenType implements WireEnum {
    VSDK(1),
    IMAGEX(2);
    
    public static final ProtoAdapter<MediaTokenType> ADAPTER = new ProtoAdapter_MediaTokenType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.MediaTokenType$ProtoAdapter_MediaTokenType */
    static final class ProtoAdapter_MediaTokenType extends EnumAdapter<MediaTokenType> {
        static {
            Covode.recordClassIndex(23300);
        }

        ProtoAdapter_MediaTokenType() {
            super(MediaTokenType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MediaTokenType fromValue(int i) {
            return MediaTokenType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23299);
    }

    public static MediaTokenType fromValue(int i) {
        if (i == 1) {
            return VSDK;
        }
        if (i != 2) {
            return null;
        }
        return IMAGEX;
    }

    private MediaTokenType(int i) {
        this.value = i;
    }
}
