package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.AuthType */
public enum AuthType implements WireEnum {
    UNKNOWN_AUTH(0),
    SESSION_AUTH(1),
    TOKEN_AUTH(2);
    
    public static final ProtoAdapter<AuthType> ADAPTER = new ProtoAdapter_AuthType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.AuthType$ProtoAdapter_AuthType */
    static final class ProtoAdapter_AuthType extends EnumAdapter<AuthType> {
        static {
            Covode.recordClassIndex(22915);
        }

        ProtoAdapter_AuthType() {
            super(AuthType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final AuthType fromValue(int i) {
            return AuthType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(22914);
    }

    public static AuthType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_AUTH;
        }
        if (i == 1) {
            return SESSION_AUTH;
        }
        if (i != 2) {
            return null;
        }
        return TOKEN_AUTH;
    }

    private AuthType(int i) {
        this.value = i;
    }
}
