package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50829e;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50816c;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.EnumC50817d;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.m */
public final class C50916m implements AbstractC50829e {

    /* renamed from: a */
    public final C88411a f117488a = new C88411a();

    /* renamed from: b */
    public EnumC50917a f117489b = EnumC50917a.HIDE;

    /* renamed from: c */
    public final AbstractC89171a<AbstractC50824j> f117490c;

    /* renamed from: d */
    public final AbstractC89171a<AbstractC50819f> f117491d;

    /* renamed from: e */
    public final AbstractC89171a<C89391z> f117492e;

    /* renamed from: f */
    private final AbstractC88969g<Boolean> f117493f;

    /* renamed from: g */
    private final AbstractC89244h f117494g = C89250i.m154773a((AbstractC89171a) new C50920c(this));

    /* renamed from: h */
    private final AbstractC89244h f117495h = C89250i.m154773a((AbstractC89171a) new C50918b(this));

    /* renamed from: i */
    private final AbstractC89244h f117496i = C89250i.m154773a((AbstractC89171a) new C50922d(this));

    /* renamed from: j */
    private final AbstractC84919c f117497j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.m$a */
    public enum EnumC50917a {
        FILTER_BOX_SHOW,
        FILTER_VIEW_SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(60092);
        }
    }

    static {
        Covode.recordClassIndex(60091);
    }

    /* renamed from: f */
    private AbstractC50824j m95337f() {
        return (AbstractC50824j) this.f117494g.getValue();
    }

    /* renamed from: g */
    private AbstractC50819f m95338g() {
        return (AbstractC50819f) this.f117495h.getValue();
    }

    /* renamed from: h */
    private final AbstractC84917a m95339h() {
        return (AbstractC84917a) this.f117496i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.m$d */
    static final class C50922d extends AbstractC89220m implements AbstractC89171a<AbstractC84917a> {

        /* renamed from: a */
        final /* synthetic */ C50916m f117506a;

        static {
            Covode.recordClassIndex(60097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50922d(C50916m mVar) {
            super(0);
            this.f117506a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84917a invoke() {
            return new AbstractC84917a(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50916m.C50922d.C509231 */

                /* renamed from: a */
                final /* synthetic */ C50922d f117507a;

                static {
                    Covode.recordClassIndex(60098);
                }

                {
                    this.f117507a = r1;
                }

                @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    if (this.f117507a.f117506a.f117489b == EnumC50917a.FILTER_BOX_SHOW) {
                        this.f117507a.f117506a.mo86277a(EnumC50917a.FILTER_VIEW_SHOW);
                        return true;
                    } else if (this.f117507a.f117506a.f117489b != EnumC50917a.FILTER_VIEW_SHOW) {
                        return true;
                    } else {
                        this.f117507a.f117506a.mo86277a(EnumC50917a.HIDE);
                        return true;
                    }
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50829e
    /* renamed from: a */
    public final void mo86214a() {
        mo86277a(EnumC50917a.FILTER_VIEW_SHOW);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50829e
    /* renamed from: c */
    public final void mo86216c() {
        mo86277a(EnumC50917a.HIDE);
    }

    /* renamed from: e */
    public final boolean mo86278e() {
        if (this.f117491d != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50829e
    /* renamed from: b */
    public final void mo86215b() {
        if (mo86278e()) {
            mo86277a(EnumC50917a.FILTER_BOX_SHOW);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50829e
    /* renamed from: d */
    public final AbstractC88979t<Boolean> mo86217d() {
        AbstractC88979t<Boolean> c = this.f117493f.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.m$b */
    static final class C50918b extends AbstractC89220m implements AbstractC89171a<AbstractC50819f> {

        /* renamed from: a */
        final /* synthetic */ C50916m f117502a;

        static {
            Covode.recordClassIndex(60093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50918b(C50916m mVar) {
            super(0);
            this.f117502a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50819f invoke() {
            AbstractC50819f invoke;
            AbstractC89171a<AbstractC50819f> aVar = this.f117502a.f117491d;
            if (aVar == null || (invoke = aVar.invoke()) == null) {
                return null;
            }
            this.f117502a.f117488a.mo142945a(invoke.mo86177e().mo143254a(new AbstractC88433f<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50916m.C50918b.C509191 */

                /* renamed from: a */
                final /* synthetic */ C50918b f117503a;

                static {
                    Covode.recordClassIndex(60094);
                }

                {
                    this.f117503a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(C89391z zVar) {
                    if (this.f117503a.f117502a.f117489b == EnumC50917a.FILTER_BOX_SHOW) {
                        this.f117503a.f117502a.mo86277a(EnumC50917a.FILTER_VIEW_SHOW);
                    }
                }
            }, C88446a.f200699e));
            return invoke;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.m$c */
    static final class C50920c extends AbstractC89220m implements AbstractC89171a<AbstractC50824j> {

        /* renamed from: a */
        final /* synthetic */ C50916m f117504a;

        static {
            Covode.recordClassIndex(60095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50920c(C50916m mVar) {
            super(0);
            this.f117504a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50824j invoke() {
            AbstractC50824j invoke = this.f117504a.f117490c.invoke();
            this.f117504a.f117488a.mo142945a(invoke.mo86201h().mo143254a(new AbstractC88433f<C50816c>(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50916m.C50920c.C509211 */

                /* renamed from: a */
                final /* synthetic */ C50920c f117505a;

                static {
                    Covode.recordClassIndex(60096);
                }

                {
                    this.f117505a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(C50816c cVar) {
                    AbstractC89171a<C89391z> aVar;
                    C50816c cVar2 = cVar;
                    if (cVar2.f117264a == EnumC50817d.FILTER_BOX_ENTRANCE_CLICK && this.f117505a.f117504a.f117489b == EnumC50917a.FILTER_VIEW_SHOW && this.f117505a.f117504a.mo86278e() && ((aVar = this.f117505a.f117504a.f117492e) == null || aVar.invoke() == null)) {
                        this.f117505a.f117504a.mo86277a(EnumC50917a.FILTER_BOX_SHOW);
                    }
                    if (cVar2.f117264a == EnumC50817d.OUTSIDE_TOUCH && this.f117505a.f117504a.f117489b == EnumC50917a.FILTER_VIEW_SHOW) {
                        this.f117505a.f117504a.mo86277a(EnumC50917a.HIDE);
                    }
                }
            }, C88446a.f200699e));
            return invoke;
        }
    }

    /* renamed from: a */
    public final void mo86277a(EnumC50917a aVar) {
        AbstractC50819f g;
        AbstractC50819f g2;
        EnumC50917a aVar2 = this.f117489b;
        if (aVar2 != aVar) {
            int i = C50924n.f117508a[aVar.ordinal()];
            if (i == 1) {
                AbstractC50819f g3 = m95338g();
                if (g3 != null) {
                    g3.mo86173a();
                }
                if (aVar2 == EnumC50917a.FILTER_VIEW_SHOW) {
                    m95337f().mo86196c();
                }
            } else if (i == 2) {
                m95337f().mo86195b();
                if (aVar2 == EnumC50917a.FILTER_BOX_SHOW && (g = m95338g()) != null) {
                    g.mo86174b();
                }
            } else if (i == 3) {
                if (aVar2 == EnumC50917a.FILTER_VIEW_SHOW) {
                    m95337f().mo86196c();
                }
                if (aVar2 == EnumC50917a.FILTER_BOX_SHOW && (g2 = m95338g()) != null) {
                    g2.mo86174b();
                }
            }
            this.f117489b = aVar;
            if (aVar2 == EnumC50917a.HIDE) {
                AbstractC84919c cVar = this.f117497j;
                if (cVar != null) {
                    cVar.mo87533b(m95339h());
                }
                this.f117493f.onNext(true);
            } else if (aVar == EnumC50917a.HIDE) {
                AbstractC84919c cVar2 = this.f117497j;
                if (cVar2 != null) {
                    cVar2.mo87535c(m95339h());
                }
                this.f117493f.onNext(false);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.filter.view.a.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.filter.view.a.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50916m(AbstractC89171a<? extends AbstractC50824j> aVar, AbstractC89171a<? extends AbstractC50819f> aVar2, AbstractC84919c cVar, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        this.f117490c = aVar;
        this.f117491d = aVar2;
        this.f117497j = cVar;
        this.f117492e = aVar3;
        C88960c cVar2 = new C88960c();
        C89219l.m154716b(cVar2, "");
        this.f117493f = cVar2;
    }
}
