package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
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

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel */
public final class KidsFeedViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<List<Aweme>> f131093a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<Integer> f131094b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<Integer> f131095c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Boolean> f131096d = new C1213t<>();

    /* renamed from: e */
    AbstractC88412b f131097e;

    /* renamed from: f */
    AbstractC88412b f131098f;

    /* renamed from: g */
    AbstractC88412b f131099g;

    /* renamed from: h */
    final AbstractC57401a f131100h;

    /* renamed from: i */
    private final IReportAwemeManager f131101i = ReportAwemeManager.m104144a();

    static {
        Covode.recordClassIndex(67409);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$a */
    static final class C57475a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131102a;

        static {
            Covode.recordClassIndex(67410);
        }

        C57475a(KidsFeedViewModel kidsFeedViewModel) {
            this.f131102a = kidsFeedViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p<? extends List<? extends Aweme>, Integer> pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            return this.f131102a.mo94735a(pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$c */
    static final class C57477c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131104a;

        static {
            Covode.recordClassIndex(67412);
        }

        C57477c(KidsFeedViewModel kidsFeedViewModel) {
            this.f131104a = kidsFeedViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f131104a.f131094b.postValue(-2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$d */
    public static final class C57478d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131105a;

        static {
            Covode.recordClassIndex(67413);
        }

        C57478d(KidsFeedViewModel kidsFeedViewModel) {
            this.f131105a = kidsFeedViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p<? extends List<? extends Aweme>, Integer> pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            return this.f131105a.mo94735a(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$f */
    public static final class C57480f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131107a;

        static {
            Covode.recordClassIndex(67415);
        }

        C57480f(KidsFeedViewModel kidsFeedViewModel) {
            this.f131107a = kidsFeedViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f131107a.f131096d.postValue(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$g */
    static final class C57481g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131108a;

        static {
            Covode.recordClassIndex(67416);
        }

        C57481g(KidsFeedViewModel kidsFeedViewModel) {
            this.f131108a = kidsFeedViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p<? extends List<? extends Aweme>, Integer> pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            return this.f131108a.mo94735a(pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$i */
    static final class C57483i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131110a;

        static {
            Covode.recordClassIndex(67418);
        }

        C57483i(KidsFeedViewModel kidsFeedViewModel) {
            this.f131110a = kidsFeedViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f131110a.f131095c.postValue(-2);
        }
    }

    public KidsFeedViewModel(AbstractC57401a aVar) {
        this.f131100h = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C89378p<List<Aweme>, Integer> mo94735a(C89378p<? extends List<? extends Aweme>, Integer> pVar) {
        int i;
        if (((Number) pVar.getSecond()).intValue() != 0) {
            return pVar;
        }
        List<Aweme> a = this.f131101i.mo94624a((List) pVar.getFirst());
        if (a.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        return C89387v.m154943a(a, Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$b */
    static final class C57476b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131103a;

        static {
            Covode.recordClassIndex(67411);
        }

        C57476b(KidsFeedViewModel kidsFeedViewModel) {
            this.f131103a = kidsFeedViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            this.f131103a.f131094b.postValue(pVar.getSecond());
            if (((Number) pVar.getSecond()).intValue() == 0) {
                if (((List) pVar.getFirst()).isEmpty()) {
                    this.f131103a.f131094b.postValue(-1);
                } else {
                    this.f131103a.f131093a.postValue(C89070n.m154585g((Collection) pVar.getFirst()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$e */
    public static final class C57479e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131106a;

        static {
            Covode.recordClassIndex(67414);
        }

        C57479e(KidsFeedViewModel kidsFeedViewModel) {
            this.f131106a = kidsFeedViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (((List) pVar.getFirst()).isEmpty()) {
                this.f131106a.f131096d.postValue(false);
                return;
            }
            this.f131106a.f131096d.postValue(true);
            ArrayList arrayList = new ArrayList();
            List<Aweme> value = this.f131106a.f131093a.getValue();
            if (value == null) {
                value = C89086z.INSTANCE;
            }
            arrayList.addAll(value);
            arrayList.addAll((Collection) pVar.getFirst());
            this.f131106a.f131093a.postValue(arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel$h */
    static final class C57482h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsFeedViewModel f131109a;

        static {
            Covode.recordClassIndex(67417);
        }

        C57482h(KidsFeedViewModel kidsFeedViewModel) {
            this.f131109a = kidsFeedViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            this.f131109a.f131095c.postValue(pVar.getSecond());
            if (((Number) pVar.getSecond()).intValue() == 0) {
                if (((List) pVar.getFirst()).isEmpty()) {
                    this.f131109a.f131095c.postValue(-1);
                } else {
                    this.f131109a.f131093a.postValue(C89070n.m154585g((Collection) pVar.getFirst()));
                }
            }
        }
    }
}
