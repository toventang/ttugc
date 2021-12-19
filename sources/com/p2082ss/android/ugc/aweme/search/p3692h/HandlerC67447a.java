package com.p2082ss.android.ugc.aweme.search.p3692h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41534j;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41535k;
import com.p2082ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import java.lang.ref.WeakReference;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.search.h.a */
public final class HandlerC67447a extends Handler {

    /* renamed from: e */
    public static final C67448a f151113e = new C67448a((byte) 0);

    /* renamed from: a */
    WeakReference<ActivityC0945e> f151114a;

    /* renamed from: b */
    AbstractC88412b f151115b;

    /* renamed from: c */
    public long f151116c;

    /* renamed from: d */
    public long f151117d;

    /* renamed from: f */
    private final AbstractC89244h f151118f = C89250i.m154773a((AbstractC89171a) C67450c.f151120a);

    static {
        Covode.recordClassIndex(79084);
    }

    /* renamed from: a */
    public final long mo106410a() {
        return ((Number) this.f151118f.getValue()).longValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.h.a$a */
    public static final class C67448a {
        static {
            Covode.recordClassIndex(79085);
        }

        private C67448a() {
        }

        public /* synthetic */ C67448a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.h.a$c */
    static final class C67450c extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C67450c f151120a = new C67450c();

        static {
            Covode.recordClassIndex(79087);
        }

        C67450c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j;
            Long l;
            C41534j b = C41535k.m83472b();
            if (b == null || (l = b.f96877c) == null) {
                j = 30000;
            } else {
                j = l.longValue();
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: b */
    public final void mo106412b() {
        removeCallbacksAndMessages(null);
        m119519a(false);
        AbstractC88412b bVar = this.f151115b;
        if (bVar != null && !bVar.isDisposed()) {
            AbstractC88412b bVar2 = this.f151115b;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            this.f151115b = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC67447a(Looper looper) {
        super(looper);
        C89219l.m154721d(looper, "");
    }

    /* renamed from: a */
    public final void mo106411a(long j) {
        removeMessages(1);
        sendEmptyMessageDelayed(1, C89271h.m154764a(j, 0L));
        m119519a(true);
        this.f151117d = SystemClock.elapsedRealtime();
        WeakReference<ActivityC0945e> weakReference = this.f151114a;
        if (weakReference != null) {
            weakReference.get();
        }
    }

    /* renamed from: a */
    private final void m119519a(boolean z) {
        ActivityC0945e eVar;
        WeakReference<ActivityC0945e> weakReference = this.f151114a;
        if (weakReference != null && (eVar = weakReference.get()) != null) {
            C89219l.m154716b(eVar, "");
            FeedSearchIconViewModel a = FeedSearchIconViewModel.C67668a.m119823a(eVar);
            a.mo106647b().postValue(Boolean.valueOf(z));
            if (z) {
                a.mo106648c().postValue(false);
            }
        }
    }

    public final void handleMessage(Message message) {
        ActivityC0945e eVar;
        C89219l.m154721d(message, "");
        if (message.what == 1) {
            mo106410a();
            WeakReference<ActivityC0945e> weakReference = this.f151114a;
            if (weakReference != null) {
                weakReference.get();
            }
            mo106412b();
            WeakReference<ActivityC0945e> weakReference2 = this.f151114a;
            if (weakReference2 != null && (eVar = weakReference2.get()) != null) {
                C89219l.m154716b(eVar, "");
                FeedSearchIconViewModel.C67668a.m119823a(eVar).mo106648c().postValue(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.h.a$b */
    static final class C67449b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ HandlerC67447a f151119a;

        static {
            Covode.recordClassIndex(79086);
        }

        C67449b(HandlerC67447a aVar) {
            this.f151119a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long a;
            if (((C17873f.C17875b) obj).f42646b) {
                this.f151119a.removeCallbacksAndMessages(null);
                Long valueOf = Long.valueOf(this.f151119a.f151116c);
                if (valueOf.longValue() <= 0 || valueOf == null) {
                    a = this.f151119a.mo106410a();
                } else {
                    a = valueOf.longValue();
                }
                this.f151119a.f151116c = a - (SystemClock.elapsedRealtime() - this.f151119a.f151117d);
                return;
            }
            HandlerC67447a aVar = this.f151119a;
            aVar.mo106411a(aVar.f151116c);
        }
    }
}
