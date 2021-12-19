package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Looper;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.utils.C80561hz;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ay */
public final /* synthetic */ class C72159ay implements AbstractC88433f {

    /* renamed from: a */
    private final MvImageChooseAdapter f161767a;

    /* renamed from: b */
    private final List f161768b;

    static {
        Covode.recordClassIndex(84824);
    }

    C72159ay(MvImageChooseAdapter mvImageChooseAdapter, List list) {
        this.f161767a = mvImageChooseAdapter;
        this.f161768b = list;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161767a;
        List<MvImageChooseAdapter.MyMediaModel> list = this.f161768b;
        C1445j.C1450d dVar = (C1445j.C1450d) obj;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mvImageChooseAdapter.mo114274a(dVar, list);
        } else {
            C80561hz.m139645a(new RunnableC72166ba(mvImageChooseAdapter, dVar, list));
        }
    }
}
