package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.AbstractC57298a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.e */
final /* synthetic */ class RunnableC57180e implements Runnable {

    /* renamed from: a */
    private final C57174b f130201a;

    /* renamed from: b */
    private final boolean f130202b = false;

    static {
        Covode.recordClassIndex(67081);
    }

    RunnableC57180e(C57174b bVar) {
        this.f130201a = bVar;
    }

    public final void run() {
        C57174b bVar = this.f130201a;
        boolean z = this.f130202b;
        if (bVar.f130182b != null) {
            RecyclerView.ViewHolder f = bVar.f130182b.mo4451f(bVar.f130183c);
            if (f instanceof C57320o) {
                ((AbstractC57298a) f).mo94503a(z, true);
            }
        }
    }
}
