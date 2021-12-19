package com.p2082ss.android.ugc.aweme.setting.unit.privacy;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel */
public final class FindCtxViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public boolean f153607a;

    /* renamed from: b */
    public boolean f153608b;

    /* renamed from: c */
    final C1213t<C68646c> f153609c = new C1213t<>();

    /* renamed from: d */
    final C1213t<C68646c> f153610d = new C1213t<>();

    static {
        Covode.recordClassIndex(80901);
    }

    /* renamed from: a */
    public final void mo109138a(C68646c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar.f153613a.f178516a == EnumC79549g.SYNC_STATUS) {
            if (C89219l.m154714a((Object) cVar.f153614b, (Object) "contact")) {
                this.f153609c.postValue(cVar);
            }
            if (C89219l.m154714a((Object) cVar.f153614b, (Object) "facebook")) {
                this.f153610d.postValue(cVar);
            }
        }
    }
}
