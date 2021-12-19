package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.NetworkType */
public enum NetworkType implements WireEnum {
    UNKNOWN(0),
    WIFI(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    MOBILE_4G(4),
    MOBILE_5G(5);
    
    public static final ProtoAdapter<NetworkType> ADAPTER = new ProtoAdapter_NetworkType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.NetworkType$ProtoAdapter_NetworkType */
    static final class ProtoAdapter_NetworkType extends EnumAdapter<NetworkType> {
        static {
            Covode.recordClassIndex(23371);
        }

        ProtoAdapter_NetworkType() {
            super(NetworkType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final NetworkType fromValue(int i) {
            return NetworkType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23370);
    }

    public static NetworkType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return WIFI;
        }
        if (i == 2) {
            return MOBILE_2G;
        }
        if (i == 3) {
            return MOBILE_3G;
        }
        if (i == 4) {
            return MOBILE_4G;
        }
        if (i != 5) {
            return null;
        }
        return MOBILE_5G;
    }

    private NetworkType(int i) {
        this.value = i;
    }
}
