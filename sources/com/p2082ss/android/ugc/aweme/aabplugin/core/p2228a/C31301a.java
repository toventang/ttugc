package com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1542m.C21411c;
import com.bytedance.p1542m.p1544b.C21409a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31332l;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31316c;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31317d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.a.a */
public final class C31301a extends AbstractC31332l<C31304d> {
    static {
        Covode.recordClassIndex(38001);
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31332l
    /* renamed from: a */
    public final boolean mo57300a() {
        T t = this.f75058a;
        C31317d.m65518a(t);
        String str = t.f75089m;
        C21409a a = C21411c.m40190a(str);
        if (a == null) {
            C51423a.m95791b(3, null, "The state of " + str + "was not found");
            t.mo57339a(2, t.f75077a);
            return false;
        }
        int i = a.f50790c;
        C31316c.m65516a(t, i);
        if (i == 5) {
            if (t.mo57311b()) {
                t.mo57344d();
                return true;
            }
        } else if (i == 2 || i == 4) {
            AbstractC31333m<?> b = C31310a.m65494a().mo57317b(t.f75088l);
            if (b != null) {
                b.mo57334b(t);
            }
            return false;
        }
        C31310a.m65494a().mo57316a(t.f75088l, this.f75059b);
        C31310a.m65494a().mo57313a(t);
        return false;
    }

    public C31301a(C31304d dVar) {
        super(dVar, new C31302b(dVar.f75088l));
    }
}
