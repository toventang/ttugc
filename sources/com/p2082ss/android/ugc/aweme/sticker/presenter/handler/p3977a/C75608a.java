package com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75653m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a.p3978a.C75610b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4601a.C89046al;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a.a */
public final class C75608a implements AbstractC75633m, AbstractC75656p {

    /* renamed from: a */
    private final CopyOnWriteArrayList<AbstractC75633m> f170004a;

    /* renamed from: b */
    private final AbstractC75653m f170005b;

    static {
        Covode.recordClassIndex(88539);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: b */
    public final void mo23161b(AbstractC75633m mVar) {
        C89219l.m154721d(mVar, "");
        this.f170004a.remove(mVar);
    }

    public C75608a(AbstractC75653m mVar) {
        this.f170005b = mVar;
        CopyOnWriteArrayList<AbstractC75633m> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (mVar != null) {
            copyOnWriteArrayList.add(new C75612c(mVar));
        }
        this.f170004a = copyOnWriteArrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: a */
    public final void mo23157a(AbstractC75633m mVar) {
        C89219l.m154721d(mVar, "");
        if (!this.f170004a.contains(mVar)) {
            this.f170004a.add(mVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: a */
    public final AbstractC75633m mo23154a(AbstractC89172b<? super AbstractC75633m, Boolean> bVar) {
        T t;
        C89219l.m154721d(bVar, "");
        Iterator<T> it = this.f170004a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (bVar.invoke(t).booleanValue()) {
                break;
            }
        }
        return t;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C75619b a = aVar.mo119345a(cVar);
        CopyOnWriteArrayList<AbstractC75633m> copyOnWriteArrayList = this.f170004a;
        C89219l.m154721d(copyOnWriteArrayList, "");
        for (AbstractC75633m mVar : new C89046al(copyOnWriteArrayList)) {
            mVar.mo23184a(cVar, C75610b.f170010a);
        }
        return a;
    }
}
