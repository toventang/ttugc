package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ax */
public final /* synthetic */ class C72158ax implements AbstractC88983w {

    /* renamed from: a */
    private final MvImageChooseAdapter f161765a;

    /* renamed from: b */
    private final List f161766b;

    static {
        Covode.recordClassIndex(84823);
    }

    C72158ax(MvImageChooseAdapter mvImageChooseAdapter, List list) {
        this.f161765a = mvImageChooseAdapter;
        this.f161766b = list;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161765a;
        vVar.mo143031a(C1445j.m4922a(new C72054ab(mvImageChooseAdapter.f161446m, this.f161766b), false));
    }
}
