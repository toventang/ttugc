package com.lynx.component.svg.p2042a;

import com.bytedance.covode.number.Covode;
import com.lynx.component.svg.p2042a.C28257f;

/* renamed from: com.lynx.component.svg.a.e */
public final class C28256e {

    /* renamed from: a */
    C28253d f66239a;

    /* renamed from: b */
    public C28257f.C28259a f66240b;

    /* renamed from: c */
    public float f66241c = 14.0f;

    static {
        Covode.recordClassIndex(34214);
    }

    /* renamed from: a */
    public final boolean mo48328a() {
        if (this.f66240b != null) {
            return true;
        }
        return false;
    }

    public C28256e(float f) {
        this.f66241c = f;
    }

    public C28256e(C28256e eVar) {
        if (eVar != null) {
            this.f66239a = eVar.f66239a;
            this.f66240b = eVar.f66240b;
            this.f66241c = eVar.f66241c;
        }
    }

    /* renamed from: a */
    public final C28256e mo48327a(float f, float f2) {
        this.f66240b = new C28257f.C28259a(0.0f, 0.0f, f, f2);
        return this;
    }
}
