package com.p2082ss.android.ugc.aweme.search.theme;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.theme.p3706a.C67777e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;

/* renamed from: com.ss.android.ugc.aweme.search.theme.a */
public final class C67757a {

    /* renamed from: d */
    public static final C67758a f151851d = new C67758a((byte) 0);

    /* renamed from: a */
    public final AbstractC1214u<Integer> f151852a = new C67760c(this);

    /* renamed from: b */
    public final ActivityC0945e f151853b;

    /* renamed from: c */
    public final AbstractC67759b f151854c;

    /* renamed from: e */
    private final AbstractC89244h f151855e = C89250i.m154773a((AbstractC89171a) new C67761d(this));

    /* renamed from: f */
    private final AbstractC89244h f151856f = C89250i.m154773a((AbstractC89171a) new C67762e(this));

    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$b */
    public interface AbstractC67759b {
        static {
            Covode.recordClassIndex(79410);
        }

        /* renamed from: a */
        void mo106855a(float f);

        /* renamed from: a */
        void mo106856a(boolean z);

        /* renamed from: b */
        void mo106857b(boolean z);

        /* renamed from: c */
        void mo106858c(boolean z);
    }

    static {
        Covode.recordClassIndex(79408);
    }

    /* renamed from: a */
    public final SearchIntermediateViewModel mo106850a() {
        return (SearchIntermediateViewModel) this.f151855e.getValue();
    }

    /* renamed from: c */
    public final ViewPager.AbstractC1579e mo106852c() {
        return (ViewPager.AbstractC1579e) this.f151856f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$a */
    static final class C67758a {
        static {
            Covode.recordClassIndex(79409);
        }

        private C67758a() {
        }

        public /* synthetic */ C67758a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$e */
    static final class C67762e extends AbstractC89220m implements AbstractC89171a<C677631> {

        /* renamed from: a */
        final /* synthetic */ C67757a f151859a;

        static {
            Covode.recordClassIndex(79413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67762e(C67757a aVar) {
            super(0);
            this.f151859a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C677631 invoke() {
            return new ViewPager.AbstractC1579e(this) {
                /* class com.p2082ss.android.ugc.aweme.search.theme.C67757a.C67762e.C677631 */

                /* renamed from: a */
                final /* synthetic */ C67762e f151860a;

                /* renamed from: b */
                private boolean f151861b;

                /* renamed from: c */
                private Integer f151862c;

                static {
                    Covode.recordClassIndex(79414);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f151860a = r1;
                }

                @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrollStateChanged(int i) {
                    if (i == 0) {
                        this.f151861b = false;
                        this.f151862c = null;
                    } else if (i == 1) {
                        if (!this.f151861b) {
                            this.f151862c = Integer.valueOf(this.f151860a.f151859a.mo106851b());
                        }
                        this.f151861b = true;
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageSelected(int i) {
                    boolean z = false;
                    if (this.f151862c != null) {
                        C89269g gVar = new C89269g(0, 1);
                        Integer num = this.f151862c;
                        if (num != null && gVar.mo143686a(num.intValue())) {
                            AbstractC67759b bVar = this.f151860a.f151859a.f151854c;
                            if (i == 0) {
                                z = true;
                            }
                            bVar.mo106856a(z);
                        }
                    } else if (i != 0) {
                        this.f151860a.f151859a.f151854c.mo106858c(true);
                    } else {
                        this.f151860a.f151859a.f151854c.mo106857b(true);
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrolled(int i, float f, int i2) {
                    float f2;
                    if (this.f151861b && i == 0) {
                        Float valueOf = Float.valueOf(f);
                        if (valueOf.floatValue() > 0.99f || valueOf == null) {
                            f2 = 1.0f;
                        } else {
                            f2 = valueOf.floatValue();
                        }
                        this.f151860a.f151859a.f151854c.mo106855a(f2);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$d */
    static final class C67761d extends AbstractC89220m implements AbstractC89171a<SearchIntermediateViewModel> {

        /* renamed from: a */
        final /* synthetic */ C67757a f151858a;

        static {
            Covode.recordClassIndex(79412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67761d(C67757a aVar) {
            super(0);
            this.f151858a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchIntermediateViewModel invoke() {
            return C1181ae.m3881a(this.f151858a.f151853b, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        }
    }

    /* renamed from: d */
    public final void mo106853d() {
        this.f151853b.runOnUiThread(new RunnableC67764f(this));
    }

    /* renamed from: e */
    public final void mo106854e() {
        this.f151853b.runOnUiThread(new RunnableC67765g(this));
    }

    /* renamed from: b */
    public final int mo106851b() {
        Integer value = mo106850a().getSearchTabIndex().getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$f */
    public static final class RunnableC67764f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67757a f151863a;

        static {
            Covode.recordClassIndex(79415);
        }

        RunnableC67764f(C67757a aVar) {
            this.f151863a = aVar;
        }

        public final void run() {
            this.f151863a.mo106850a().getIntermediateState().observe(this.f151863a.f151853b, this.f151863a.f151852a);
            AbstractC81915c.m141874a(new C67777e(true, this.f151863a.mo106852c()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$g */
    public static final class RunnableC67765g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67757a f151864a;

        static {
            Covode.recordClassIndex(79416);
        }

        RunnableC67765g(C67757a aVar) {
            this.f151864a = aVar;
        }

        public final void run() {
            this.f151864a.mo106850a().getIntermediateState().removeObserver(this.f151864a.f151852a);
            AbstractC81915c.m141874a(new C67777e(false, this.f151864a.mo106852c()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$c */
    static final class C67760c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C67757a f151857a;

        static {
            Covode.recordClassIndex(79411);
        }

        C67760c(C67757a aVar) {
            this.f151857a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                return;
            }
            if (num.intValue() == 1 || num.intValue() == 2) {
                this.f151857a.f151854c.mo106858c(false);
            } else if (num.intValue() != 0) {
            } else {
                if (this.f151857a.mo106851b() == C67458j.f151133b) {
                    this.f151857a.f151854c.mo106857b(false);
                } else {
                    this.f151857a.f151854c.mo106858c(false);
                }
            }
        }
    }

    public C67757a(ActivityC0945e eVar, AbstractC67759b bVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        this.f151853b = eVar;
        this.f151854c = bVar;
    }
}
