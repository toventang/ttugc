package com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.p1542m.C21411c;
import com.bytedance.p1542m.p1543a.C21399b;
import com.bytedance.p1542m.p1544b.C21409a;
import com.google.android.play.core.p1966e.AbstractC27034f;
import com.google.android.play.core.p1966e.AbstractC27035g;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m;
import java.util.Locale;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.b.b */
public final class C31306b extends AbstractC31333m<C31308d> implements AbstractC27035g {
    static {
        Covode.recordClassIndex(38006);
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: b */
    public final void mo57303b() {
        C21399b.m40170b().f50772a.add(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: c */
    public final void mo57306c() {
        C21399b.m40170b().f50772a.remove(this);
    }

    public C31306b(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo57309a(C21409a aVar) {
        mo57333b(aVar);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: b */
    public final boolean mo57304b(ActivityC17312a aVar) {
        AbstractC27034f a;
        C31308d dVar = (C31308d) this.f75066g;
        if (dVar == null || (a = C31309e.m65492a(dVar.f75022q.getLanguage())) == null) {
            return false;
        }
        return C21399b.m40170b().f50774c.mo44707a(a, aVar, this.f75062c);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.play.core.p1964c.AbstractC26967a
    /* renamed from: a */
    public final /* synthetic */ void mo35005a(AbstractC27034f fVar) {
        AbstractC27034f fVar2 = fVar;
        C31308d dVar = (C31308d) this.f75066g;
        if (fVar2.mo44740g().size() > 0 && dVar != null) {
            Locale locale = dVar.f75022q;
            for (String str : fVar2.mo44740g()) {
                if (TextUtils.equals(new Locale(str).getLanguage(), locale.getLanguage())) {
                    C31309e.f75023a.put(locale.getLanguage(), fVar2);
                    C21409a aVar = new C21409a("com.ss.android.ugc.aweme.dflanguage", C21411c.f50799c.mo35000b(), fVar2.mo44735b());
                    aVar.f50791d = fVar2.mo44738e();
                    aVar.f50792e = fVar2.mo44737d();
                    aVar.f50795h = fVar2.mo44741h();
                    aVar.f50794g = fVar2.mo44736c();
                    C1731i.m5640b(new CallableC31307c(this, aVar), C1731i.f5562a);
                    return;
                }
            }
        }
    }
}
