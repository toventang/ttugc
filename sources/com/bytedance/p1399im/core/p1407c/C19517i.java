package com.bytedance.p1399im.core.p1407c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.C19483d;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.c.i */
public final class C19517i {

    /* renamed from: a */
    private String f46328a;

    /* renamed from: b */
    private JSONObject f46329b;

    static {
        Covode.recordClassIndex(22361);
    }

    /* renamed from: a */
    public static C19517i m36463a() {
        return new C19517i();
    }

    /* renamed from: b */
    public final void mo31181b() {
        if (C19483d.m36365a().mo31141b().f46222aD) {
            C19512f.m36451a(this.f46328a, this.f46329b);
        } else {
            C19510e.m36442b(this.f46328a, this.f46329b);
        }
    }

    /* renamed from: c */
    public final void mo31182c() {
        if (C19483d.m36365a().mo31141b().f46222aD) {
            C19512f.m36451a(this.f46328a, this.f46329b);
        } else {
            C19510e.m36443c(this.f46328a, this.f46329b);
        }
    }

    /* renamed from: d */
    public final void mo31183d() {
        if (C19483d.m36365a().mo31141b().f46222aD) {
            C19512f.m36452a(this.f46328a, this.f46329b, true);
        } else {
            C19510e.m36444d(this.f46328a, this.f46329b);
        }
    }

    /* renamed from: a */
    public final C19517i mo31179a(String str) {
        this.f46328a = str;
        mo31180a("params_for_special", "imsdk");
        mo31180a("sdk_version", "5.1.3.8-rc.2.6-bugfix");
        mo31180a("sdk_type", "Android");
        mo31180a("im_appid", Integer.valueOf(C19483d.m36365a().f46157b.mo27967h()));
        return this;
    }

    /* renamed from: a */
    public final C19517i mo31180a(String str, Object obj) {
        if (this.f46329b == null) {
            this.f46329b = new JSONObject();
        }
        try {
            this.f46329b.put(str, obj);
        } catch (Exception unused) {
        }
        return this;
    }
}
