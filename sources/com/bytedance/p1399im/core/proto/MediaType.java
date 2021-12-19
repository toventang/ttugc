package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MediaType */
public enum MediaType implements WireEnum {
    IMG(1),
    VIDEO(2),
    AUDIO(3),
    FILE(4),
    OTHER(10);
    
    public static final ProtoAdapter<MediaType> ADAPTER = new ProtoAdapter_MediaType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.MediaType$ProtoAdapter_MediaType */
    static final class ProtoAdapter_MediaType extends EnumAdapter<MediaType> {
        static {
            Covode.recordClassIndex(23302);
        }

        ProtoAdapter_MediaType() {
            super(MediaType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MediaType fromValue(int i) {
            return MediaType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23301);
    }

    public static MediaType fromValue(int i) {
        if (i == 1) {
            return IMG;
        }
        if (i == 2) {
            return VIDEO;
        }
        if (i == 3) {
            return AUDIO;
        }
        if (i == 4) {
            return FILE;
        }
        if (i != 10) {
            return null;
        }
        return OTHER;
    }

    private MediaType(int i) {
        this.value = i;
    }
}
