package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.firebase.C27737d;

/* renamed from: com.google.firebase.installations.h */
public final class C27846h extends C27737d {

    /* renamed from: a */
    private final EnumC27847a f65420a;

    static {
        Covode.recordClassIndex(33435);
    }

    public final EnumC27847a getStatus() {
        return this.f65420a;
    }

    /* renamed from: com.google.firebase.installations.h$a */
    public enum EnumC27847a {
        BAD_CONFIG;

        static {
            Covode.recordClassIndex(33436);
        }
    }

    public C27846h(EnumC27847a aVar) {
        this.f65420a = aVar;
    }

    public C27846h(String str, EnumC27847a aVar) {
        super(str);
        this.f65420a = aVar;
    }

    public C27846h(String str, EnumC27847a aVar, Throwable th) {
        super(str, th);
        this.f65420a = aVar;
    }
}
