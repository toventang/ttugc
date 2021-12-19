package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ba */
final /* synthetic */ class RunnableC72166ba implements Runnable {

    /* renamed from: a */
    private final MvImageChooseAdapter f161774a;

    /* renamed from: b */
    private final C1445j.C1450d f161775b;

    /* renamed from: c */
    private final List f161776c;

    static {
        Covode.recordClassIndex(84831);
    }

    RunnableC72166ba(MvImageChooseAdapter mvImageChooseAdapter, C1445j.C1450d dVar, List list) {
        this.f161774a = mvImageChooseAdapter;
        this.f161775b = dVar;
        this.f161776c = list;
    }

    public final void run() {
        this.f161774a.mo114274a(this.f161775b, this.f161776c);
    }
}
