package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.m */
public final class C74115m {

    /* renamed from: a */
    static C40964c.AbstractC40966a f166417a;

    /* renamed from: b */
    public static final C74115m f166418b = new C74115m();

    private C74115m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.m$a */
    public static final class C74116a implements C40964c.AbstractC40966a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f166419a;

        static {
            Covode.recordClassIndex(86869);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: a */
        public final void mo70154a() {
            C1731i.m5640b(new CallableC74117b(this.f166419a), C1731i.f5562a);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: b */
        public final void mo70155b() {
            C1731i.m5640b(new CallableC74118c(this.f166419a), C1731i.f5562a);
        }

        C74116a(AbstractC89171a aVar) {
            this.f166419a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(86868);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.m$b */
    static final class CallableC74117b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f166420a;

        static {
            Covode.recordClassIndex(86870);
        }

        CallableC74117b(AbstractC89171a aVar) {
            this.f166420a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(((AbstractC31071f) this.f166420a.invoke()).mo56390u());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.m$c */
    static final class CallableC74118c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f166421a;

        static {
            Covode.recordClassIndex(86871);
        }

        CallableC74118c(AbstractC89171a aVar) {
            this.f166421a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(((AbstractC31071f) this.f166421a.invoke()).mo56388t());
        }
    }
}
