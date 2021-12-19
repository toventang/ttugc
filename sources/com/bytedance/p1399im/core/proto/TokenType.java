package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.TokenType */
public enum TokenType implements WireEnum {
    DEFAULT_TOKEN(0),
    APP_TOKEN(1),
    SERVER_TOKEN(2);
    
    public static final ProtoAdapter<TokenType> ADAPTER = new ProtoAdapter_TokenType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.TokenType$ProtoAdapter_TokenType */
    static final class ProtoAdapter_TokenType extends EnumAdapter<TokenType> {
        static {
            Covode.recordClassIndex(23510);
        }

        ProtoAdapter_TokenType() {
            super(TokenType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final TokenType fromValue(int i) {
            return TokenType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23509);
    }

    public static TokenType fromValue(int i) {
        if (i == 0) {
            return DEFAULT_TOKEN;
        }
        if (i == 1) {
            return APP_TOKEN;
        }
        if (i != 2) {
            return null;
        }
        return SERVER_TOKEN;
    }

    private TokenType(int i) {
        this.value = i;
    }
}
