package com.p2082ss.android.websocket.internal.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.ss.android.websocket.internal.proto.Version */
public enum Version implements WireEnum {
    V1(1);
    
    public static final ProtoAdapter<Version> ADAPTER = ProtoAdapter.newEnumAdapter(Version.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(99824);
    }

    public static Version fromValue(int i) {
        if (i != 1) {
            return null;
        }
        return V1;
    }

    private Version(int i) {
        this.value = i;
    }
}
