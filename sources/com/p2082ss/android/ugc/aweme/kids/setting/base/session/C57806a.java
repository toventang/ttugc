package com.p2082ss.android.ugc.aweme.kids.setting.base.session;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.base.session.a */
public final class C57806a<T> {

    /* renamed from: a */
    ArrayList<AbstractC34709b<T>> f131844a = new ArrayList<>();

    static {
        Covode.recordClassIndex(67810);
    }

    /* renamed from: b */
    public final void mo95141b() {
        this.f131844a.clear();
        C57807b.m104534a().mo95143a(this);
    }

    /* renamed from: a */
    public final void mo95139a() {
        Iterator<AbstractC34709b<T>> it = this.f131844a.iterator();
        while (it.hasNext()) {
            it.next().mo61385a();
        }
        mo95141b();
    }

    /* renamed from: a */
    public final C57806a<T> mo95138a(AbstractC1204m mVar) {
        mVar.getLifecycle().mo4012a(new Session$2(this));
        return this;
    }

    /* renamed from: a */
    public final void mo95140a(AbstractC1204m mVar, AbstractC34709b bVar) {
        if (!this.f131844a.contains(bVar)) {
            this.f131844a.add(bVar);
        }
        mVar.getLifecycle().mo4012a(new Session$1(this, bVar));
    }
}
