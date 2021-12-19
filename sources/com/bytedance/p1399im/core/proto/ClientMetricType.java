package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ClientMetricType */
public enum ClientMetricType implements WireEnum {
    COUNTER(0),
    TIMER(1);
    
    public static final ProtoAdapter<ClientMetricType> ADAPTER = new ProtoAdapter_ClientMetricType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.ClientMetricType$ProtoAdapter_ClientMetricType */
    static final class ProtoAdapter_ClientMetricType extends EnumAdapter<ClientMetricType> {
        static {
            Covode.recordClassIndex(22996);
        }

        ProtoAdapter_ClientMetricType() {
            super(ClientMetricType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ClientMetricType fromValue(int i) {
            return ClientMetricType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(22995);
    }

    public static ClientMetricType fromValue(int i) {
        if (i == 0) {
            return COUNTER;
        }
        if (i != 1) {
            return null;
        }
        return TIMER;
    }

    private ClientMetricType(int i) {
        this.value = i;
    }
}
