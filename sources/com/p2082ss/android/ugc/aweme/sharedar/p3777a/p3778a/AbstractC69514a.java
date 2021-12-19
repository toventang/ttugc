package com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a;

import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.a */
public abstract class AbstractC69514a implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f155294a = {new C89232y(AbstractC69514a.class, "host", "getHost()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: b */
    private final AbstractC89248d f155295b = C21572a.m40505b(getDiContainer(), ActivityC0945e.class);

    /* renamed from: c */
    private final C21582f f155296c;

    static {
        Covode.recordClassIndex(81856);
    }

    /* renamed from: a */
    public abstract long mo109765a();

    /* renamed from: a */
    public abstract void mo109766a(int i, long j, String str);

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f155296c;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.a$a */
    static final class CallableC69515a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f155297a;

        static {
            Covode.recordClassIndex(81857);
        }

        CallableC69515a(AbstractC89171a aVar) {
            this.f155297a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f155297a.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.a$b */
    static final class RunnableC69516b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f155298a;

        static {
            Covode.recordClassIndex(81858);
        }

        RunnableC69516b(AbstractC89171a aVar) {
            this.f155298a = aVar;
        }

        public final void run() {
            this.f155298a.invoke();
        }
    }

    public AbstractC69514a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f155296c = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo109767b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        ActivityC0945e eVar = (ActivityC0945e) this.f155295b.mo23374a(this, f155294a[0]);
        if (eVar != null) {
            eVar.runOnUiThread(new RunnableC69516b(aVar));
        }
    }

    /* renamed from: a */
    protected static void m122727a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (!C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            C1731i.m5640b(new CallableC69515a(aVar), C1731i.f5562a);
        }
    }
}
