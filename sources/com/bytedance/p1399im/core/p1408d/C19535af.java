package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.af */
public final class C19535af {

    /* renamed from: a */
    public int f46375a;

    /* renamed from: b */
    public boolean f46376b;

    /* renamed from: c */
    public C19590ap f46377c;

    /* renamed from: d */
    public C19590ap f46378d;

    /* renamed from: e */
    public C19590ap f46379e;

    /* renamed from: f */
    public List<C19538ai> f46380f;

    /* renamed from: g */
    public C19672u f46381g;

    static {
        Covode.recordClassIndex(22379);
    }

    public C19535af() {
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Result{direction=").append(this.f46375a).append(", origin=").append(this.f46377c).append(", toCheck=").append(this.f46378d).append(", checked=").append(this.f46379e).append(", success=").append(this.f46376b).append(", size=").append(this.f46380f.size()).append(", logId=");
        C19672u uVar = this.f46381g;
        if (uVar != null) {
            str = uVar.f46733f;
        } else {
            str = null;
        }
        return append.append(str).append("}").toString();
    }

    public C19535af(long j, long j2, int i) {
        this.f46375a = i;
        this.f46377c = new C19590ap(j, j2);
        this.f46378d = new C19590ap(j, j2);
        this.f46379e = new C19590ap();
        this.f46380f = new ArrayList();
    }
}
