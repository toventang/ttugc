package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62855a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69789ac;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72613aj;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dz */
public final /* synthetic */ class C73629dz implements AbstractC89171a {

    /* renamed from: a */
    private final C73560cj f165452a;

    static {
        Covode.recordClassIndex(86367);
    }

    C73629dz(C73560cj cjVar) {
        this.f165452a = cjVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        String str;
        AbstractC88979t<C69789ac> b;
        AbstractC88979t<C69789ac> a;
        C73560cj cjVar = this.f165452a;
        C84911q.m145921a("TitleSensitivity SensitiveTitleCheck() ");
        C62855a value = cjVar.f165338m.getValue();
        if (value != null) {
            C72613aj a2 = cjVar.f165343r.mo113454a(value.getPermission(), C63238c.f143594u.mo93906e().mo58662e());
            if (a2 == null) {
                cjVar.mo116163n();
                C84911q.m145921a("TitleSensitivity SensitiveTitleCheck() checker is null");
            } else {
                C84911q.m145921a("TitleSensitivity SensitiveTitleCheck() goes to sync  data");
                C73635ee eeVar = new C73635ee(cjVar);
                C73636ef efVar = new C73636ef(cjVar);
                C73637eg egVar = new C73637eg(cjVar, a2);
                C89219l.m154721d(eeVar, "");
                C89219l.m154721d(efVar, "");
                C89219l.m154721d(egVar, "");
                C84911q.m145921a("TitleSensitivity start synchronize data with 2 different response");
                if (a2.f162787d || a2.f162785b != null || a2.f162784a != null || (str = a2.f162786c) == null || str.length() == 0) {
                    egVar.invoke();
                } else {
                    eeVar.invoke();
                    C84911q.m145921a("TitleSensitivity showloding when sync data");
                    AbstractC88979t<C69789ac> tVar = a2.f162788e;
                    a2.f162790g = (tVar == null || (b = tVar.mo143278b(C88925a.m154180b(C88946a.f201991c))) == null || (a = b.mo143261a(C88391a.m153580a(C88392a.f200660a))) == null) ? null : a.mo143254a(new C72613aj.C72617d(a2, efVar, egVar), new C72613aj.C72618e(efVar, egVar));
                }
            }
        }
        return null;
    }
}
