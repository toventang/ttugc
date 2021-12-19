package com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel */
public final class KidsAwemeGridViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<List<Aweme>> f130763a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<Integer> f130764b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<Integer> f130765c = new C1213t<>();

    /* renamed from: d */
    AbstractC88412b f130766d;

    /* renamed from: e */
    final AbstractC57374a f130767e;

    /* renamed from: f */
    private AbstractC88412b f130768f;

    /* renamed from: g */
    private final IReportAwemeManager f130769g = ReportAwemeManager.m104144a();

    static {
        Covode.recordClassIndex(67286);
    }

    /* renamed from: a */
    public final void mo94633a() {
        AbstractC88412b bVar;
        if (this.f130767e != null) {
            AbstractC88412b bVar2 = this.f130768f;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f130768f) == null)) {
                bVar.dispose();
            }
            this.f130768f = this.f130767e.mo94635b().mo143292d(new C57371d(this)).mo143254a(new C57372e(this), new C57373f(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel$a */
    static final class C57368a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ KidsAwemeGridViewModel f130770a;

        static {
            Covode.recordClassIndex(67287);
        }

        C57368a(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f130770a = kidsAwemeGridViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p<? extends List<? extends Aweme>, Integer> pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            return this.f130770a.mo94632a(pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel$c */
    static final class C57370c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsAwemeGridViewModel f130772a;

        static {
            Covode.recordClassIndex(67289);
        }

        C57370c(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f130772a = kidsAwemeGridViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f130772a.f130765c.postValue(-2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel$d */
    static final class C57371d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ KidsAwemeGridViewModel f130773a;

        static {
            Covode.recordClassIndex(67290);
        }

        C57371d(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f130773a = kidsAwemeGridViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p<? extends List<? extends Aweme>, Integer> pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            return this.f130773a.mo94632a(pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel$f */
    static final class C57373f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsAwemeGridViewModel f130775a;

        static {
            Covode.recordClassIndex(67292);
        }

        C57373f(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f130775a = kidsAwemeGridViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f130775a.f130764b.postValue(-2);
        }
    }

    public KidsAwemeGridViewModel(AbstractC57374a aVar) {
        C89219l.m154721d(aVar, "");
        this.f130767e = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C89378p<List<Aweme>, Integer> mo94632a(C89378p<? extends List<? extends Aweme>, Integer> pVar) {
        int i;
        if (((Number) pVar.getSecond()).intValue() != 0) {
            return pVar;
        }
        List<Aweme> a = this.f130769g.mo94624a((List) pVar.getFirst());
        if (a.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        return C89387v.m154943a(a, Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel$b */
    static final class C57369b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsAwemeGridViewModel f130771a;

        static {
            Covode.recordClassIndex(67288);
        }

        C57369b(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f130771a = kidsAwemeGridViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (((List) pVar.getFirst()).isEmpty()) {
                this.f130771a.f130765c.postValue(-1);
                return;
            }
            this.f130771a.f130765c.postValue(0);
            ArrayList arrayList = new ArrayList();
            List<Aweme> value = this.f130771a.f130763a.getValue();
            if (value == null) {
                value = C89086z.INSTANCE;
            }
            arrayList.addAll(value);
            arrayList.addAll((Collection) pVar.getFirst());
            this.f130771a.f130763a.postValue(arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel$e */
    static final class C57372e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsAwemeGridViewModel f130774a;

        static {
            Covode.recordClassIndex(67291);
        }

        C57372e(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f130774a = kidsAwemeGridViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            this.f130774a.f130764b.postValue(pVar.getSecond());
            if (((Number) pVar.getSecond()).intValue() == 0) {
                if (((List) pVar.getFirst()).isEmpty()) {
                    this.f130774a.f130764b.postValue(-1);
                } else {
                    this.f130774a.f130763a.postValue(C89070n.m154585g((Collection) pVar.getFirst()));
                }
            }
        }
    }
}
