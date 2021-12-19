package com.p2082ss.android.ugc.aweme.experiment;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel */
public final class FeedRefreshViewModel extends AbstractC1174ac {

    /* renamed from: b */
    public static final C46672a f108820b = new C46672a((byte) 0);

    /* renamed from: a */
    public final AbstractC89244h f108821a = C89250i.m154773a((AbstractC89171a) C46674c.f108825a);

    /* renamed from: c */
    private final AbstractC89244h f108822c = C89250i.m154773a((AbstractC89171a) C46675d.f108826a);

    /* renamed from: d */
    private final AbstractC89244h f108823d = C89250i.m154773a((AbstractC89171a) C46673b.f108824a);

    static {
        Covode.recordClassIndex(55269);
    }

    /* renamed from: a */
    public final C1213t<Boolean> mo79312a() {
        return (C1213t) this.f108823d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$a */
    public static final class C46672a {
        static {
            Covode.recordClassIndex(55270);
        }

        private C46672a() {
        }

        public /* synthetic */ C46672a(byte b) {
            this();
        }

        /* renamed from: a */
        public static FeedRefreshViewModel m90084a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(FeedRefreshViewModel.class);
            C89219l.m154716b(a, "");
            return (FeedRefreshViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$b */
    static final class C46673b extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C46673b f108824a = new C46673b();

        static {
            Covode.recordClassIndex(55271);
        }

        C46673b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$c */
    static final class C46674c extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C46674c f108825a = new C46674c();

        static {
            Covode.recordClassIndex(55272);
        }

        C46674c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$d */
    static final class C46675d extends AbstractC89220m implements AbstractC89171a<C1213t<String>> {

        /* renamed from: a */
        public static final C46675d f108826a = new C46675d();

        static {
            Covode.recordClassIndex(55273);
        }

        C46675d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<String> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: a */
    public static final FeedRefreshViewModel m90082a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (activity instanceof ActivityC0945e) {
            return C46672a.m90084a((ActivityC0945e) activity);
        }
        return null;
    }
}
