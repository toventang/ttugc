package com.bytedance.p1615s.p1616a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17689c;
import com.bytedance.ies.powerlist.page.AbstractC17714i;
import com.bytedance.ies.powerlist.page.C17712h;
import com.bytedance.ies.powerlist.page.EnumC17699e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.s.a.a */
public class C22112a implements AbstractC17689c {
    static {
        Covode.recordClassIndex(25912);
    }

    /* renamed from: a */
    public void mo36297a() {
    }

    /* renamed from: a */
    public void mo36298a(Exception exc) {
    }

    /* renamed from: a */
    public void mo36299a(boolean z) {
    }

    /* renamed from: b */
    public void mo36300b() {
    }

    @Override // com.bytedance.ies.powerlist.page.AbstractC17689c
    /* renamed from: a */
    public final void mo28146a(C17712h hVar) {
        C89219l.m154719c(hVar, "");
        EnumC17699e eVar = hVar.f42362a.f42364a;
        AbstractC17714i iVar = hVar.f42362a;
        if (iVar instanceof AbstractC17714i.C17718d) {
            int i = C22113b.f52273a[eVar.ordinal()];
            if (i == 2) {
                mo36300b();
            } else if (i == 3) {
                mo36297a();
            }
        } else if (iVar instanceof AbstractC17714i.C17717c) {
            if (C22113b.f52274b[eVar.ordinal()] == 3) {
                mo36299a(true);
            }
        } else if (iVar instanceof AbstractC17714i.C17716b) {
            Exception exc = ((AbstractC17714i.C17716b) iVar).f42370e;
            if (C22113b.f52275c[eVar.ordinal()] == 1) {
                mo36298a(exc);
            }
        } else if ((iVar instanceof AbstractC17714i.C17715a) && C22113b.f52276d[eVar.ordinal()] == 1) {
            mo36299a(false);
        }
    }
}
