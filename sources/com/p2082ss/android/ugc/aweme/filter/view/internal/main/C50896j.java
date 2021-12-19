package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84941d;
import com.p2082ss.android.ugc.tools.view.base.EnumC84942e;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j */
public final class C50896j implements AbstractC84941d {

    /* renamed from: a */
    public EnumC50899b f117426a;

    /* renamed from: b */
    public final AbstractC88969g<EnumC84942e> f117427b;

    /* renamed from: c */
    public final View f117428c;

    /* renamed from: d */
    private final C50928q f117429d;

    /* renamed from: e */
    private EnumC50898a f117430e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$a */
    public enum EnumC50898a {
        NONE,
        SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(60073);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$b */
    public enum EnumC50899b {
        UNKNOWN,
        SHOWING,
        SHOWN,
        HIDING,
        HIDE;

        static {
            Covode.recordClassIndex(60074);
        }
    }

    static {
        Covode.recordClassIndex(60071);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: e */
    public final AbstractC88979t<EnumC84942e> mo86262e() {
        AbstractC88979t<EnumC84942e> c = this.f117427b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: b */
    public final void mo86259b() {
        this.f117426a = EnumC50899b.UNKNOWN;
        this.f117428c.setVisibility(0);
        this.f117427b.onNext(EnumC84942e.PRE_SHOW);
        this.f117427b.onNext(EnumC84942e.SHOWN);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: d */
    public final AbstractC88979t<Boolean> mo86261d() {
        AbstractC88979t<R> d = mo86262e().mo143268a(C50900c.f117442a).mo143292d(C50901d.f117443a);
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: f */
    public final void mo86263f() {
        this.f117426a = EnumC50899b.HIDE;
        this.f117428c.setVisibility(8);
        this.f117427b.onNext(EnumC84942e.PRE_HIDE);
        this.f117427b.onNext(EnumC84942e.HIDDEN);
    }

    /* renamed from: g */
    public final void mo86264g() {
        if (this.f117430e == EnumC50898a.SHOW) {
            mo86258a();
        } else if (this.f117430e == EnumC50898a.HIDE) {
            mo86260c();
        }
        this.f117430e = EnumC50898a.NONE;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: a */
    public final void mo86258a() {
        if (this.f117429d != null) {
            int i = C50902k.f117444a[this.f117426a.ordinal()];
            if (i == 1 || i == 2) {
                this.f117430e = EnumC50898a.NONE;
            } else if (i != 3) {
                this.f117426a = EnumC50899b.SHOWING;
                this.f117429d.mo70110a(new C40903b());
            } else {
                this.f117430e = EnumC50898a.SHOW;
            }
        } else {
            mo86259b();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: c */
    public final void mo86260c() {
        if (this.f117429d != null) {
            int i = C50902k.f117445b[this.f117426a.ordinal()];
            if (i == 1 || i == 2) {
                this.f117430e = EnumC50898a.NONE;
            } else if (i != 3) {
                this.f117426a = EnumC50899b.HIDING;
                this.f117429d.mo70112b(new C40903b());
            } else {
                this.f117430e = EnumC50898a.HIDE;
            }
        } else {
            mo86263f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$c */
    static final class C50900c<T> implements AbstractC88438k<EnumC84942e> {

        /* renamed from: a */
        public static final C50900c f117442a = new C50900c();

        static {
            Covode.recordClassIndex(60075);
        }

        C50900c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(EnumC84942e eVar) {
            C89219l.m154721d(eVar, "");
            if (eVar == EnumC84942e.PRE_SHOW || eVar == EnumC84942e.HIDDEN) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$d */
    static final class C50901d<T, R> implements AbstractC88434g<EnumC84942e, Boolean> {

        /* renamed from: a */
        public static final C50901d f117443a = new C50901d();

        static {
            Covode.recordClassIndex(60076);
        }

        C50901d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Boolean apply(EnumC84942e eVar) {
            boolean z;
            C89219l.m154721d(eVar, "");
            if (eVar == EnumC84942e.PRE_SHOW) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C50896j(View view, View view2) {
        C50928q qVar;
        C89219l.m154721d(view, "");
        this.f117428c = view;
        if (view2 != null) {
            qVar = new C50928q(view2, (byte) 0);
        } else {
            qVar = null;
        }
        this.f117429d = qVar;
        this.f117426a = EnumC50899b.UNKNOWN;
        this.f117430e = EnumC50898a.NONE;
        C88960c cVar = new C88960c();
        C89219l.m154716b(cVar, "");
        this.f117427b = cVar;
        if (qVar != null) {
            qVar.mo70111a((AbstractC40906e) new AbstractC40906e.C40907a(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50896j.C508971 */

                /* renamed from: a */
                final /* synthetic */ C50896j f117431a;

                static {
                    Covode.recordClassIndex(60072);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: c */
                public final void mo70108c() {
                    this.f117431a.f117427b.onNext(EnumC84942e.PRE_HIDE);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: a */
                public final void mo70104a() {
                    this.f117431a.f117428c.setVisibility(0);
                    this.f117431a.f117427b.onNext(EnumC84942e.PRE_SHOW);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: b */
                public final void mo70106b() {
                    this.f117431a.f117426a = EnumC50899b.SHOWN;
                    this.f117431a.f117427b.onNext(EnumC84942e.SHOWN);
                    this.f117431a.mo86264g();
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: d */
                public final void mo70109d() {
                    this.f117431a.f117426a = EnumC50899b.HIDE;
                    this.f117431a.f117428c.setVisibility(8);
                    this.f117431a.f117427b.onNext(EnumC84942e.HIDDEN);
                    this.f117431a.mo86264g();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f117431a = r1;
                }
            });
        }
    }
}
