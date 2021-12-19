package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.core.p218f.C3964w;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.j */
public final class C5715j {

    /* renamed from: a */
    String f14498a;

    /* renamed from: b */
    String f14499b;

    /* renamed from: c */
    float f14500c;

    /* renamed from: d */
    long f14501d;

    /* renamed from: e */
    int f14502e;

    /* renamed from: f */
    int f14503f;

    /* renamed from: g */
    int f14504g;

    /* renamed from: h */
    int f14505h;

    /* renamed from: i */
    private AbstractC88412b f14506i;

    static {
        Covode.recordClassIndex(6313);
    }

    /* renamed from: b */
    public final void mo11476b() {
        AbstractC88412b bVar = this.f14506i;
        if (bVar != null && !bVar.isDisposed()) {
            this.f14506i.dispose();
        }
    }

    /* renamed from: a */
    public final void mo11475a() {
        this.f14500c = ((float) C3964w.m9651a()) / 1024.0f;
        this.f14506i = C11231b.m19899b(5000, TimeUnit.MILLISECONDS).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C5716k(this)).mo143267a(C5717l.f14508a, false).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C5718m.f14509a, C5719n.f14510a);
    }

    public C5715j(String str, String str2, long j, int i, int i2, int i3, int i4) {
        this.f14498a = str;
        this.f14499b = str2;
        this.f14501d = j;
        this.f14502e = i;
        this.f14503f = i2;
        this.f14504g = i3;
        this.f14505h = i4;
    }
}
