package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.C41072a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41090d;
import com.p2082ss.android.ugc.aweme.editSticker.AbstractC45891h;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45851b;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.f */
public final class C46140f<T extends C45850a> implements AbstractC46187r<T> {

    /* renamed from: a */
    public static final C46141a f107421a = new C46141a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f107422b;

    static {
        Covode.recordClassIndex(54699);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41072a<T, Void> mo78352a() {
        return (C41072a) this.f107422b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.f$a */
    public static final class C46141a {
        static {
            Covode.recordClassIndex(54700);
        }

        private C46141a() {
        }

        public /* synthetic */ C46141a(byte b) {
            this();
        }
    }

    public /* synthetic */ C46140f() {
        this(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.f$b */
    static final class C46142b extends AbstractC89220m implements AbstractC89171a<C41072a<T, Void>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f107423a;

        static {
            Covode.recordClassIndex(54701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46142b(AbstractC89183m mVar) {
            super(0);
            this.f107423a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            C41072a aVar = new C41072a(new C46146h(this.f107423a));
            aVar.f96007a = 0;
            aVar.f96009c = true;
            aVar.f96008b = true;
            aVar.f96010d = new AbstractC41090d() {
                /* class com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46140f.C46142b.C461431 */

                static {
                    Covode.recordClassIndex(54702);
                }

                @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41090d
                /* renamed from: a */
                public final void mo70309a(Exception exc) {
                    C89219l.m154721d(exc, "");
                    AbstractC45891h d = C45866d.m88491d();
                    if (d != null) {
                        d.mo77252a(exc);
                    }
                }
            };
            return aVar;
        }
    }

    public C46140f(AbstractC89183m<? super T, ? super AbstractC89124d<? super C89391z>, ? extends Object> mVar) {
        this.f107422b = C89250i.m154773a((AbstractC89171a) new C46142b(mVar));
    }

    /* renamed from: a */
    public final int mo78351a(T t) {
        C89219l.m154721d(t, "");
        if (t.mo77203a() || t.mo77204b()) {
            return 4;
        }
        if (mo78352a().mo70292b(t) || mo78352a().mo70295c(t)) {
            return 8;
        }
        t.f106809a = C45851b.m88478a(t.f106810b);
        if (t.mo77204b()) {
            return 4;
        }
        return 2;
    }

    /* renamed from: b */
    public final boolean mo78356b(T t) {
        C89219l.m154721d(t, "");
        int a = mo78351a((C45850a) t);
        if (a == 4 || a == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo78354a(List<? extends T> list) {
        C89219l.m154721d(list, "");
        if ((!list.isEmpty()) && list != null) {
            mo78352a().mo70287a(list);
        }
    }

    /* renamed from: c */
    public final void mo78357c(T t, AbstractC41085a<T, Void> aVar) {
        C89219l.m154721d(t, "");
        mo78352a().mo70291b(t, aVar);
    }

    /* renamed from: a */
    public final void mo78353a(T t, AbstractC41085a<T, Void> aVar) {
        C89219l.m154721d(t, "");
        C89219l.m154721d(aVar, "");
        mo78352a().mo70286a(t, aVar, null);
    }

    /* renamed from: b */
    public final void mo78355b(T t, AbstractC41085a<T, Void> aVar) {
        C89219l.m154721d(t, "");
        C41072a<T, Void> a = mo78352a();
        a.mo70284a(new C41072a.C41084l(a, t, aVar));
    }
}
