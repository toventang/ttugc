package com.p2082ss.android.ugc.aweme.base.p2379ui.session;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.a */
public final class C34708a<T> {

    /* renamed from: a */
    ArrayList<AbstractC34709b<T>> f81992a = new ArrayList<>();

    static {
        Covode.recordClassIndex(41697);
    }

    /* renamed from: b */
    public final void mo61384b() {
        this.f81992a.clear();
        C34710c.m70888a().mo61387a(this);
    }

    /* renamed from: a */
    public final void mo61382a() {
        Iterator<AbstractC34709b<T>> it = this.f81992a.iterator();
        while (it.hasNext()) {
            it.next().mo61385a();
        }
        mo61384b();
    }

    /* renamed from: a */
    public final C34708a<T> mo61381a(AbstractC1204m mVar) {
        mVar.getLifecycle().mo4012a(new Session$2(this));
        return this;
    }

    /* renamed from: a */
    public final void mo61383a(AbstractC1204m mVar, AbstractC34709b bVar) {
        if (!this.f81992a.contains(bVar)) {
            this.f81992a.add(bVar);
        }
        mVar.getLifecycle().mo4012a(new Session$1(this, bVar));
    }
}
