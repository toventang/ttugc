package com.p2082ss.android.ugc.tools.view.base;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.base.a */
public final class C84933a implements AbstractC84941d {

    /* renamed from: a */
    public EnumC84936b f189784a;

    /* renamed from: b */
    public final AbstractC88969g<EnumC84942e> f189785b;

    /* renamed from: c */
    public final View f189786c;

    /* renamed from: d */
    private final AbstractC40905d f189787d;

    /* renamed from: e */
    private EnumC84935a f189788e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.base.a$a */
    public enum EnumC84935a {
        NONE,
        SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(98930);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.base.a$b */
    public enum EnumC84936b {
        UNKNOWN,
        SHOWING,
        SHOWN,
        HIDING,
        HIDE;

        static {
            Covode.recordClassIndex(98931);
        }
    }

    static {
        Covode.recordClassIndex(98928);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: e */
    public final AbstractC88979t<EnumC84942e> mo86262e() {
        AbstractC88979t<EnumC84942e> c = this.f189785b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: b */
    public final void mo86259b() {
        this.f189784a = EnumC84936b.UNKNOWN;
        this.f189786c.setVisibility(0);
        this.f189785b.onNext(EnumC84942e.PRE_SHOW);
        this.f189785b.onNext(EnumC84942e.SHOWN);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: d */
    public final AbstractC88979t<Boolean> mo86261d() {
        AbstractC88979t<R> d = mo86262e().mo143268a(C84937c.f189801a).mo143292d(C84938d.f189802a);
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: f */
    public final void mo86263f() {
        this.f189784a = EnumC84936b.HIDE;
        this.f189786c.setVisibility(8);
        this.f189785b.onNext(EnumC84942e.PRE_HIDE);
        this.f189785b.onNext(EnumC84942e.HIDDEN);
    }

    /* renamed from: g */
    public final void mo129705g() {
        if (this.f189788e == EnumC84935a.SHOW) {
            mo86258a();
        } else if (this.f189788e == EnumC84935a.HIDE) {
            mo86260c();
        }
        this.f189788e = EnumC84935a.NONE;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: a */
    public final void mo86258a() {
        if (this.f189787d != null) {
            int i = C84939b.f189803a[this.f189784a.ordinal()];
            if (i == 1 || i == 2) {
                this.f189788e = EnumC84935a.NONE;
            } else if (i != 3) {
                this.f189784a = EnumC84936b.SHOWING;
                this.f189787d.mo70110a(new C40903b());
            } else {
                this.f189788e = EnumC84935a.SHOW;
            }
        } else {
            mo86259b();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.AbstractC84941d
    /* renamed from: c */
    public final void mo86260c() {
        if (this.f189787d != null) {
            int i = C84939b.f189804b[this.f189784a.ordinal()];
            if (i == 1 || i == 2) {
                this.f189788e = EnumC84935a.NONE;
            } else if (i != 3) {
                this.f189784a = EnumC84936b.HIDING;
                this.f189787d.mo70112b(new C40903b());
            } else {
                this.f189788e = EnumC84935a.HIDE;
            }
        } else {
            mo86263f();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.base.a$c */
    static final class C84937c<T> implements AbstractC88438k<EnumC84942e> {

        /* renamed from: a */
        public static final C84937c f189801a = new C84937c();

        static {
            Covode.recordClassIndex(98932);
        }

        C84937c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(EnumC84942e eVar) {
            C89219l.m154721d(eVar, "");
            if (eVar == EnumC84942e.PRE_SHOW || eVar == EnumC84942e.PRE_HIDE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.base.a$d */
    static final class C84938d<T, R> implements AbstractC88434g<EnumC84942e, Boolean> {

        /* renamed from: a */
        public static final C84938d f189802a = new C84938d();

        static {
            Covode.recordClassIndex(98933);
        }

        C84938d() {
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

    public C84933a(View view, final View view2, View view3, AbstractC89172b<? super View, ? extends AbstractC40905d> bVar) {
        AbstractC40905d dVar;
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f189786c = view;
        if (view3 != null) {
            dVar = (AbstractC40905d) bVar.invoke(view3);
        } else {
            dVar = null;
        }
        this.f189787d = dVar;
        this.f189784a = EnumC84936b.UNKNOWN;
        this.f189788e = EnumC84935a.NONE;
        C88960c cVar = new C88960c();
        C89219l.m154716b(cVar, "");
        this.f189785b = cVar;
        if (dVar != null) {
            dVar.mo70111a((AbstractC40906e) new AbstractC40906e.C40907a(this) {
                /* class com.p2082ss.android.ugc.tools.view.base.C84933a.C849341 */

                /* renamed from: a */
                final /* synthetic */ C84933a f189789a;

                static {
                    Covode.recordClassIndex(98929);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: a */
                public final void mo70104a() {
                    this.f189789a.f189786c.setVisibility(0);
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    this.f189789a.f189785b.onNext(EnumC84942e.PRE_SHOW);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: b */
                public final void mo70106b() {
                    this.f189789a.f189784a = EnumC84936b.SHOWN;
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    this.f189789a.f189785b.onNext(EnumC84942e.SHOWN);
                    this.f189789a.mo129705g();
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: c */
                public final void mo70108c() {
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    this.f189789a.f189785b.onNext(EnumC84942e.PRE_HIDE);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: d */
                public final void mo70109d() {
                    this.f189789a.f189784a = EnumC84936b.HIDE;
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    this.f189789a.f189786c.setVisibility(8);
                    this.f189789a.f189785b.onNext(EnumC84942e.HIDDEN);
                    this.f189789a.mo129705g();
                }

                {
                    this.f189789a = r1;
                }
            });
        }
    }
}
