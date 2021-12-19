package com.p2082ss.android.ugc.aweme.sticker.presenter;

import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75635n;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a.C75608a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a.C75611b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a.p3978a.C75609a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.AbstractC75586c;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a */
public abstract class AbstractC75578a implements AbstractC75649i {

    /* renamed from: a */
    private volatile boolean f169894a;

    /* renamed from: b */
    public AbstractC75653m f169895b;

    /* renamed from: c */
    public final List<AbstractC75576l> f169896c = new ArrayList();

    /* renamed from: d */
    public final List<AbstractC75498c> f169897d = new ArrayList();

    /* renamed from: e */
    public final CopyOnWriteArrayList<AbstractC75591e> f169898e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public AbstractC75573i f169899f;

    /* renamed from: g */
    public final SafeHandler f169900g;

    /* renamed from: h */
    private final List<AbstractC75633m> f169901h = new ArrayList();

    /* renamed from: i */
    private final AbstractC89244h f169902i = C89250i.m154773a((AbstractC89171a) new C75582d(this));

    /* renamed from: j */
    private final AbstractC89244h f169903j = C89250i.m154773a((AbstractC89171a) new C75580b(this));

    /* renamed from: k */
    private final C75635n f169904k;

    /* renamed from: l */
    private final AbstractC1204m f169905l;

    /* renamed from: m */
    private final AbstractC84903j f169906m;

    static {
        Covode.recordClassIndex(88503);
    }

    /* renamed from: d */
    private final C75608a mo122531d() {
        return (C75608a) this.f169903j.getValue();
    }

    /* renamed from: a */
    public abstract AbstractC75586c mo23179a();

    /* renamed from: b */
    public C75635n mo23180b() {
        return this.f169904k;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: v */
    public final AbstractC75573i mo23169v() {
        return this.f169899f;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: x */
    public final SafeHandler mo23171x() {
        return this.f169900g;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$b */
    static final class C75580b extends AbstractC89220m implements AbstractC89171a<C75608a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC75578a f169908a;

        static {
            Covode.recordClassIndex(88505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75580b(AbstractC75578a aVar) {
            super(0);
            this.f169908a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75608a invoke() {
            return new C75608a(this.f169908a.f169895b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$d */
    static final class C75582d extends AbstractC89220m implements AbstractC89171a<C75611b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC75578a f169910a;

        static {
            Covode.recordClassIndex(88507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75582d(AbstractC75578a aVar) {
            super(0);
            this.f169910a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75611b invoke() {
            return new C75611b(this.f169910a.mo23179a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$a */
    public static final class C75579a implements AbstractC75576l {

        /* renamed from: a */
        final /* synthetic */ AbstractC75578a f169907a;

        static {
            Covode.recordClassIndex(88504);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        public final void cD_() {
            Iterator<T> it = this.f169907a.f169896c.iterator();
            while (it.hasNext()) {
                it.next().cD_();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75579a(AbstractC75578a aVar) {
            this.f169907a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: a */
        public final void mo23175a(View view) {
            C89219l.m154721d(view, "");
            Iterator<T> it = this.f169907a.f169896c.iterator();
            while (it.hasNext()) {
                it.next().mo23175a(view);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: b */
        public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
            C89219l.m154721d(aVar, "");
            Iterator<T> it = this.f169907a.f169896c.iterator();
            while (it.hasNext()) {
                it.next().mo23177b(aVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
        /* renamed from: a */
        public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
            C89219l.m154721d(aVar, "");
            Iterator<T> it = this.f169907a.f169896c.iterator();
            while (it.hasNext()) {
                it.next().mo23176a(aVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo119308c() {
        if (!this.f169894a) {
            this.f169894a = true;
            mo23168u().mo118615a(new C75581c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$c */
    public static final class C75581c implements AbstractC75301e {

        /* renamed from: a */
        final /* synthetic */ AbstractC75578a f169909a;

        static {
            Covode.recordClassIndex(88506);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75581c(AbstractC75578a aVar) {
            this.f169909a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87551a(C75618a aVar) {
            C89219l.m154721d(aVar, "");
            this.f169909a.mo119306a(aVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87552a(C75621d dVar) {
            C89219l.m154721d(dVar, "");
            this.f169909a.mo119306a(dVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: a */
    public final void mo23156a(AbstractC75573i iVar) {
        C89219l.m154721d(iVar, "");
        this.f169899f = iVar;
        iVar.mo119134a(new C75579a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: a */
    public final void mo23157a(AbstractC75633m mVar) {
        C89219l.m154721d(mVar, "");
        mo119307a(mVar, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: b */
    public final void mo23161b(AbstractC75633m mVar) {
        C89219l.m154721d(mVar, "");
        if (!this.f169901h.remove(mVar)) {
            mo122531d().mo23161b(mVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75656p
    /* renamed from: a */
    public final AbstractC75633m mo23154a(AbstractC89172b<? super AbstractC75633m, Boolean> bVar) {
        T t;
        C89219l.m154721d(bVar, "");
        Iterator<T> it = this.f169901h.iterator();
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
        T t2 = t;
        if (t2 == null) {
            return mo122531d().mo23154a(bVar);
        }
        return t2;
    }

    /* renamed from: a */
    public final void mo119306a(AbstractC75620c cVar) {
        ArrayList arrayList = new ArrayList();
        C75635n b = mo23180b();
        if (b != null) {
            arrayList.add(b);
        }
        arrayList.add(mo122531d());
        arrayList.addAll(this.f169901h);
        arrayList.add(this.f169902i.getValue());
        new C75609a(arrayList, 0, this.f169906m).mo119345a(cVar);
    }

    public AbstractC75578a(AbstractC1204m mVar, AbstractC84903j jVar) {
        C89219l.m154721d(mVar, "");
        this.f169905l = mVar;
        this.f169906m = jVar;
        this.f169900g = new SafeHandler(mVar);
    }

    /* renamed from: a */
    public final void mo119307a(AbstractC75633m mVar, boolean z) {
        C89219l.m154721d(mVar, "");
        if (!z) {
            mo122531d().mo23157a(mVar);
        } else if (!this.f169901h.contains(mVar)) {
            this.f169901h.add(mVar);
        }
        if ((mVar instanceof AbstractC75576l) && !this.f169896c.contains(mVar)) {
            this.f169896c.add(mVar);
        }
        if ((mVar instanceof AbstractC75498c) && !this.f169897d.contains(mVar)) {
            this.f169897d.add(mVar);
        }
        if ((mVar instanceof AbstractC75591e) && !this.f169898e.contains(mVar)) {
            this.f169898e.add(mVar);
        }
    }
}
