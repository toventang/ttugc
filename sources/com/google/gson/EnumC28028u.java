package com.google.gson;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.gson.u */
public enum EnumC28028u {
    DEFAULT {
        @Override // com.google.gson.EnumC28028u
        public final AbstractC28019l serialize(Long l) {
            return new C28025r((Number) l);
        }
    },
    STRING {
        @Override // com.google.gson.EnumC28028u
        public final AbstractC28019l serialize(Long l) {
            return new C28025r(String.valueOf(l));
        }
    };

    public abstract AbstractC28019l serialize(Long l);

    static {
        Covode.recordClassIndex(33641);
    }

    /* synthetic */ EnumC28028u(byte b) {
        this();
    }
}
