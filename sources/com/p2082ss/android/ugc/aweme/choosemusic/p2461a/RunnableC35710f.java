package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.f */
public final /* synthetic */ class RunnableC35710f implements Runnable {

    /* renamed from: a */
    private final C35703b f84239a;

    /* renamed from: b */
    private final boolean f84240b;

    static {
        Covode.recordClassIndex(42942);
    }

    RunnableC35710f(C35703b bVar, boolean z) {
        this.f84239a = bVar;
        this.f84240b = z;
    }

    public final void run() {
        C35703b bVar = this.f84239a;
        boolean z = this.f84240b;
        if (bVar.f84219b != null) {
            RecyclerView.ViewHolder f = bVar.f84219b.mo4451f(bVar.f84220c);
            if (f instanceof C36050s) {
                ((AbstractC35998a) f).mo63155a(z, true);
            }
        }
    }
}
