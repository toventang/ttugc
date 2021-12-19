package com.p2082ss.android.ugc.aweme.choosemusic;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel */
public final class MusicSearchStateViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public static final C35693a f84189a = new C35693a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f84190b = C89250i.m154773a((AbstractC89171a) C35698f.f84199a);

    /* renamed from: c */
    private final AbstractC89244h f84191c = C89250i.m154773a((AbstractC89171a) C35697e.f84198a);

    /* renamed from: d */
    private final AbstractC89244h f84192d = C89250i.m154773a((AbstractC89171a) C35696d.f84197a);

    /* renamed from: e */
    private final AbstractC89244h f84193e = C89250i.m154773a((AbstractC89171a) C35694b.f84195a);

    /* renamed from: f */
    private final AbstractC89244h f84194f = C89250i.m154773a((AbstractC89171a) C35695c.f84196a);

    static {
        Covode.recordClassIndex(42923);
    }

    /* renamed from: a */
    public final C33943c<Integer> mo62735a() {
        return (C33943c) this.f84190b.getValue();
    }

    /* renamed from: b */
    public final C33943c<String> mo62736b() {
        return (C33943c) this.f84191c.getValue();
    }

    /* renamed from: c */
    public final C33943c<C35890aj> mo62737c() {
        return (C33943c) this.f84192d.getValue();
    }

    /* renamed from: d */
    public final C33943c<Boolean> mo62738d() {
        return (C33943c) this.f84193e.getValue();
    }

    /* renamed from: e */
    public final C33943c<Boolean> mo62739e() {
        return (C33943c) this.f84194f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$a */
    public static final class C35693a {
        static {
            Covode.recordClassIndex(42924);
        }

        private C35693a() {
        }

        public /* synthetic */ C35693a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$b */
    static final class C35694b extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C35694b f84195a = new C35694b();

        static {
            Covode.recordClassIndex(42925);
        }

        C35694b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$c */
    static final class C35695c extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C35695c f84196a = new C35695c();

        static {
            Covode.recordClassIndex(42926);
        }

        C35695c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$d */
    static final class C35696d extends AbstractC89220m implements AbstractC89171a<C33943c<C35890aj>> {

        /* renamed from: a */
        public static final C35696d f84197a = new C35696d();

        static {
            Covode.recordClassIndex(42927);
        }

        C35696d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C35890aj> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$e */
    static final class C35697e extends AbstractC89220m implements AbstractC89171a<C33943c<String>> {

        /* renamed from: a */
        public static final C35697e f84198a = new C35697e();

        static {
            Covode.recordClassIndex(42928);
        }

        C35697e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<String> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$f */
    static final class C35698f extends AbstractC89220m implements AbstractC89171a<C33943c<Integer>> {

        /* renamed from: a */
        public static final C35698f f84199a = new C35698f();

        static {
            Covode.recordClassIndex(42929);
        }

        C35698f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Integer> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: f */
    public final int mo62740f() {
        Integer value = mo62735a().getValue();
        if (value != null) {
            return value.intValue();
        }
        return 1;
    }
}
