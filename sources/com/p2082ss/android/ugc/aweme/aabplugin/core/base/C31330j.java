package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31316c;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.j */
final /* synthetic */ class C31330j implements AbstractC88433f {

    /* renamed from: a */
    private final C31310a f75055a;

    static {
        Covode.recordClassIndex(38030);
    }

    C31330j(C31310a aVar) {
        this.f75055a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C31310a aVar = this.f75055a;
        if (aVar.f75032g == null) {
            return;
        }
        if (aVar.f75032g.f75081e == AbstractC31339n.EnumC31342b.PENDING || aVar.f75032g.f75081e == AbstractC31339n.EnumC31342b.RUNNING) {
            C31316c.m65517a(aVar.f75032g, 6, null);
        }
    }
}
