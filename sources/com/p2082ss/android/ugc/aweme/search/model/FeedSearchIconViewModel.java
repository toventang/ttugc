package com.p2082ss.android.ugc.aweme.search.model;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel */
public final class FeedSearchIconViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public static final C67668a f151599a = new C67668a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f151600b = C89250i.m154773a((AbstractC89171a) C67669b.f151603a);

    /* renamed from: c */
    private final AbstractC89244h f151601c = C89250i.m154773a((AbstractC89171a) C67671d.f151605a);

    /* renamed from: d */
    private final AbstractC89244h f151602d = C89250i.m154773a((AbstractC89171a) C67670c.f151604a);

    static {
        Covode.recordClassIndex(79311);
    }

    /* renamed from: a */
    public final NextLiveData<Integer> mo106646a() {
        return (NextLiveData) this.f151600b.getValue();
    }

    /* renamed from: b */
    public final NextLiveData<Boolean> mo106647b() {
        return (NextLiveData) this.f151601c.getValue();
    }

    /* renamed from: c */
    public final NextLiveData<Boolean> mo106648c() {
        return (NextLiveData) this.f151602d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel$a */
    public static final class C67668a {
        static {
            Covode.recordClassIndex(79312);
        }

        private C67668a() {
        }

        public /* synthetic */ C67668a(byte b) {
            this();
        }

        /* renamed from: a */
        public static FeedSearchIconViewModel m119823a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(FeedSearchIconViewModel.class);
            C89219l.m154716b(a, "");
            return (FeedSearchIconViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel$b */
    static final class C67669b extends AbstractC89220m implements AbstractC89171a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C67669b f151603a = new C67669b();

        static {
            Covode.recordClassIndex(79313);
        }

        C67669b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<Integer> invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel$c */
    static final class C67670c extends AbstractC89220m implements AbstractC89171a<NextLiveData<Boolean>> {

        /* renamed from: a */
        public static final C67670c f151604a = new C67670c();

        static {
            Covode.recordClassIndex(79314);
        }

        C67670c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<Boolean> invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel$d */
    static final class C67671d extends AbstractC89220m implements AbstractC89171a<NextLiveData<Boolean>> {

        /* renamed from: a */
        public static final C67671d f151605a = new C67671d();

        static {
            Covode.recordClassIndex(79315);
        }

        C67671d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<Boolean> invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: d */
    public final void mo106649d() {
        mo106646a().postValue(2);
    }

    /* renamed from: e */
    public final boolean mo106650e() {
        return C89219l.m154714a((Object) mo106647b().getValue(), (Object) true);
    }
}
