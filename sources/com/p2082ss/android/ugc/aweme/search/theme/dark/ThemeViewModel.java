package com.p2082ss.android.ugc.aweme.search.theme.dark;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel */
public final class ThemeViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f151934a = C89250i.m154773a((AbstractC89171a) C67792a.f151938a);

    /* renamed from: b */
    private final AbstractC89244h f151935b = C89250i.m154773a((AbstractC89171a) C67795d.f151941a);

    /* renamed from: c */
    private final AbstractC89244h f151936c = C89250i.m154773a((AbstractC89171a) C67794c.f151940a);

    /* renamed from: d */
    private final AbstractC89244h f151937d = C89250i.m154773a((AbstractC89171a) C67793b.f151939a);

    static {
        Covode.recordClassIndex(79444);
    }

    /* renamed from: a */
    public final C1213t<C67782c> mo106885a() {
        return (C1213t) this.f151934a.getValue();
    }

    /* renamed from: b */
    public final C1213t<Boolean> mo106887b() {
        return (C1213t) this.f151935b.getValue();
    }

    /* renamed from: c */
    public final C1213t<C67782c> mo106889c() {
        return (C1213t) this.f151936c.getValue();
    }

    /* renamed from: d */
    public final C1213t<C67782c> mo106891d() {
        return (C1213t) this.f151937d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel$a */
    static final class C67792a extends AbstractC89220m implements AbstractC89171a<C1213t<C67782c>> {

        /* renamed from: a */
        public static final C67792a f151938a = new C67792a();

        static {
            Covode.recordClassIndex(79445);
        }

        C67792a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C67782c> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel$b */
    static final class C67793b extends AbstractC89220m implements AbstractC89171a<C1213t<C67782c>> {

        /* renamed from: a */
        public static final C67793b f151939a = new C67793b();

        static {
            Covode.recordClassIndex(79446);
        }

        C67793b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C67782c> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel$c */
    static final class C67794c extends AbstractC89220m implements AbstractC89171a<C1213t<C67782c>> {

        /* renamed from: a */
        public static final C67794c f151940a = new C67794c();

        static {
            Covode.recordClassIndex(79447);
        }

        C67794c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C67782c> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel$d */
    static final class C67795d extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C67795d f151941a = new C67795d();

        static {
            Covode.recordClassIndex(79448);
        }

        C67795d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: a */
    public final void mo106886a(C67782c cVar) {
        C89219l.m154721d(cVar, "");
        mo106889c().postValue(cVar);
        mo106890c(cVar);
    }

    /* renamed from: b */
    public final void mo106888b(C67782c cVar) {
        C89219l.m154721d(cVar, "");
        mo106891d().setValue(cVar);
    }

    /* renamed from: c */
    public final void mo106890c(C67782c cVar) {
        C89219l.m154721d(cVar, "");
        mo106885a().postValue(cVar);
    }
}
