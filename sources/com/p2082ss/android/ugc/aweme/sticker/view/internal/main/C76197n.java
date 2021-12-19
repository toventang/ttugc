package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.EnumC76135n;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.n */
public final class C76197n implements AbstractC76152h {

    /* renamed from: a */
    public final AbstractC88969g<EnumC76135n> f171169a;

    /* renamed from: b */
    public EnumC76200b f171170b;

    /* renamed from: c */
    public final View f171171c;

    /* renamed from: d */
    private final AbstractC40905d f171172d;

    /* renamed from: e */
    private EnumC76199a f171173e;

    /* renamed from: f */
    private final ViewGroup f171174f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.n$a */
    public enum EnumC76199a {
        NONE,
        SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(89149);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.n$b */
    public enum EnumC76200b {
        SHOWING,
        SHOWN,
        HIDING,
        HIDE;

        static {
            Covode.recordClassIndex(89150);
        }
    }

    static {
        Covode.recordClassIndex(89147);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h
    /* renamed from: a */
    public final boolean mo119913a() {
        if (this.f171170b == EnumC76200b.SHOWING || this.f171170b == EnumC76200b.SHOWN) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h
    /* renamed from: f */
    public final AbstractC88979t<EnumC76135n> mo119918f() {
        AbstractC88979t<EnumC76135n> c = this.f171169a.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h
    /* renamed from: c */
    public final void mo119915c() {
        this.f171170b = EnumC76200b.SHOWN;
        this.f171171c.setVisibility(0);
        this.f171169a.onNext(EnumC76135n.PRE_SHOW);
        this.f171169a.onNext(EnumC76135n.SHOWN);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h
    /* renamed from: e */
    public final void mo119917e() {
        this.f171170b = EnumC76200b.HIDE;
        this.f171171c.setVisibility(8);
        this.f171169a.onNext(EnumC76135n.PRE_HIDE);
        this.f171169a.onNext(EnumC76135n.HIDDEN);
    }

    /* renamed from: g */
    public final void mo119937g() {
        if (this.f171173e == EnumC76199a.SHOW) {
            mo119914b();
        } else if (this.f171173e == EnumC76199a.HIDE) {
            mo119916d();
        }
        this.f171173e = EnumC76199a.NONE;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h
    /* renamed from: b */
    public final void mo119914b() {
        if (this.f171172d != null) {
            int i = C76201o.f171185a[this.f171170b.ordinal()];
            if (i == 1 || i == 2) {
                this.f171173e = EnumC76199a.NONE;
            } else if (i != 3) {
                this.f171170b = EnumC76200b.SHOWING;
                this.f171172d.mo70110a(new C40903b());
            } else {
                this.f171173e = EnumC76199a.SHOW;
            }
        } else {
            mo119915c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h
    /* renamed from: d */
    public final void mo119916d() {
        if (this.f171172d != null) {
            int i = C76201o.f171186b[this.f171170b.ordinal()];
            if (i == 1 || i == 2) {
                this.f171173e = EnumC76199a.NONE;
            } else if (i != 3) {
                this.f171170b = EnumC76200b.HIDING;
                this.f171172d.mo70112b(new C40903b());
            } else {
                this.f171173e = EnumC76199a.HIDE;
            }
        } else {
            mo119917e();
        }
    }

    private C76197n(ViewGroup viewGroup, View view, View view2, long j, Interpolator interpolator) {
        C76202p pVar;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interpolator, "");
        this.f171174f = viewGroup;
        this.f171171c = view;
        if (view2 != null) {
            pVar = new C76202p(viewGroup, view, view2, j, 250, interpolator);
        } else {
            pVar = null;
        }
        this.f171172d = pVar;
        C88960c cVar = new C88960c();
        C89219l.m154716b(cVar, "");
        this.f171169a = cVar;
        this.f171170b = EnumC76200b.HIDE;
        this.f171173e = EnumC76199a.NONE;
        if (pVar != null) {
            pVar.mo70111a((AbstractC40906e) new AbstractC40906e.C40907a(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76197n.C761981 */

                /* renamed from: a */
                final /* synthetic */ C76197n f171175a;

                static {
                    Covode.recordClassIndex(89148);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: c */
                public final void mo70108c() {
                    this.f171175a.f171169a.onNext(EnumC76135n.PRE_HIDE);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: a */
                public final void mo70104a() {
                    this.f171175a.f171171c.setVisibility(0);
                    this.f171175a.f171169a.onNext(EnumC76135n.PRE_SHOW);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: b */
                public final void mo70106b() {
                    this.f171175a.f171170b = EnumC76200b.SHOWN;
                    this.f171175a.f171169a.onNext(EnumC76135n.SHOWN);
                    this.f171175a.mo119937g();
                }

                @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
                /* renamed from: d */
                public final void mo70109d() {
                    this.f171175a.f171170b = EnumC76200b.HIDE;
                    this.f171175a.f171171c.setVisibility(8);
                    this.f171175a.f171169a.onNext(EnumC76135n.HIDDEN);
                    this.f171175a.mo119937g();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f171175a = r1;
                }
            });
        }
    }

    public /* synthetic */ C76197n(ViewGroup viewGroup, View view, View view2, long j, Interpolator interpolator, byte b) {
        this(viewGroup, view, view2, j, interpolator);
    }
}
