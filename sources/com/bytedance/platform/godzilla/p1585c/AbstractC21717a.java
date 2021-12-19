package com.bytedance.platform.godzilla.p1585c;

import android.app.Application;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.platform.godzilla.c.a */
public abstract class AbstractC21717a {

    /* renamed from: a */
    public EnumC21719c f51487a;

    static {
        Covode.recordClassIndex(25358);
    }

    /* renamed from: b */
    public abstract String mo35351b();

    /* renamed from: d */
    public EnumC21720d mo35374d() {
        return EnumC21720d.IMMEDIATE;
    }

    /* renamed from: a */
    public void mo35350a() {
        this.f51487a = EnumC21719c.STARTED;
    }

    /* renamed from: a */
    public void mo35359a(Application application) {
        this.f51487a = EnumC21719c.INITIALIZED;
    }
}
