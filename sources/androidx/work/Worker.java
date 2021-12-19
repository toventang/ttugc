package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.p075a.C1705c;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;

public abstract class Worker extends ListenableWorker {

    /* renamed from: e */
    C1705c<ListenableWorker.AbstractC1584a> f5177e;

    static {
        Covode.recordClassIndex(1739);
    }

    /* renamed from: d */
    public abstract ListenableWorker.AbstractC1584a mo5347d();

    @Override // androidx.work.ListenableWorker
    /* renamed from: a */
    public final AbstractFutureC27655q<ListenableWorker.AbstractC1584a> mo5335a() {
        this.f5177e = new C1705c<>();
        this.f5172b.f5183e.execute(new Runnable() {
            /* class androidx.work.Worker.RunnableC15881 */

            static {
                Covode.recordClassIndex(1740);
            }

            public final void run() {
                try {
                    Worker.this.f5177e.mo5483a(Worker.this.mo5347d());
                } catch (Throwable th) {
                    Worker.this.f5177e.mo5484a(th);
                }
            }
        });
        return this.f5177e;
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
