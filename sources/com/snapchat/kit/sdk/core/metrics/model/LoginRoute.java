package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum LoginRoute implements WireEnum {
    UNKNOWN_LOGIN_ROUTE(0),
    LOGIN_ROUTE(1),
    VERIFY_ROUTE(2);
    
    public static final ProtoAdapter<LoginRoute> ADAPTER = new ProtoAdapter_LoginRoute();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_LoginRoute extends EnumAdapter<LoginRoute> {
        static {
            Covode.recordClassIndex(35297);
        }

        ProtoAdapter_LoginRoute() {
            super(LoginRoute.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final LoginRoute fromValue(int i) {
            return LoginRoute.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(35296);
    }

    public static LoginRoute fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_LOGIN_ROUTE;
        }
        if (i == 1) {
            return LOGIN_ROUTE;
        }
        if (i != 2) {
            return null;
        }
        return VERIFY_ROUTE;
    }

    private LoginRoute(int i) {
        this.value = i;
    }
}
