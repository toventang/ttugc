package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.lifecycle.z */
public final class C1227z {

    /* renamed from: a */
    public final C1205n f4025a;

    /* renamed from: b */
    private final Handler f4026b = new Handler();

    /* renamed from: c */
    private RunnableC1228a f4027c;

    static {
        Covode.recordClassIndex(1334);
    }

    /* renamed from: androidx.lifecycle.z$a */
    static class RunnableC1228a implements Runnable {

        /* renamed from: a */
        final AbstractC1196i.EnumC1198a f4028a;

        /* renamed from: b */
        private final C1205n f4029b;

        /* renamed from: c */
        private boolean f4030c;

        static {
            Covode.recordClassIndex(1335);
        }

        public final void run() {
            if (!this.f4030c) {
                this.f4029b.mo4016a(this.f4028a);
                this.f4030c = true;
            }
        }

        RunnableC1228a(C1205n nVar, AbstractC1196i.EnumC1198a aVar) {
            this.f4029b = nVar;
            this.f4028a = aVar;
        }
    }

    public C1227z(AbstractC1204m mVar) {
        this.f4025a = new C1205n(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4059a(AbstractC1196i.EnumC1198a aVar) {
        RunnableC1228a aVar2 = this.f4027c;
        if (aVar2 != null) {
            aVar2.run();
        }
        RunnableC1228a aVar3 = new RunnableC1228a(this.f4025a, aVar);
        this.f4027c = aVar3;
        this.f4026b.postAtFrontOfQueue(aVar3);
    }
}
