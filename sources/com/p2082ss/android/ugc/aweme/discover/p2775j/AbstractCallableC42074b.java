package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: com.ss.android.ugc.aweme.discover.j.b */
public abstract class AbstractCallableC42074b implements AbstractC42073a, Callable {

    /* renamed from: a */
    public C67678d f98096a;

    /* renamed from: b */
    private boolean f98097b;

    static {
        Covode.recordClassIndex(50008);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo71270a();

    /* renamed from: b */
    private void m84228b() {
        if (this.f98097b) {
            throw new CancellationException();
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        m84228b();
        Object a = mo71270a();
        m84228b();
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42073a
    /* renamed from: a */
    public final void mo71269a(int i, String str) {
        this.f98097b = true;
        C67678d dVar = this.f98096a;
        if (dVar != null) {
            C67605g.m119730a(dVar).mo106587d().mo106583b(2).mo106592g();
            C67606h.m119736a(this.f98096a).mo106600b().mo106604c(2).mo106606d(i).mo106610f();
            C67592a.f151371d.mo106561b();
            C67592a.f151370c.mo106569a(2, str);
        }
    }
}
