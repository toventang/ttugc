package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.AbstractC1600g;
import androidx.work.AbstractC1718k;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1687f;
import androidx.work.impl.p070a.AbstractC1629c;
import androidx.work.impl.p070a.C1630d;
import androidx.work.impl.p073b.C1642g;
import androidx.work.impl.utils.p075a.C1705c;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements AbstractC1629c {

    /* renamed from: j */
    private static final String f5529j = AbstractC1600g.m5318a("ConstraintTrkngWrkr");

    /* renamed from: e */
    WorkerParameters f5530e;

    /* renamed from: f */
    final Object f5531f = new Object();

    /* renamed from: g */
    volatile boolean f5532g = false;

    /* renamed from: h */
    C1705c<ListenableWorker.AbstractC1584a> f5533h = new C1705c<>();

    /* renamed from: i */
    public ListenableWorker f5534i;

    @Override // androidx.work.impl.p070a.AbstractC1629c
    /* renamed from: a */
    public final void mo5400a(List<String> list) {
    }

    static {
        Covode.recordClassIndex(1883);
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: a */
    public final AbstractFutureC27655q<ListenableWorker.AbstractC1584a> mo5335a() {
        this.f5172b.f5183e.execute(new Runnable() {
            /* class androidx.work.impl.workers.ConstraintTrackingWorker.RunnableC17151 */

            static {
                Covode.recordClassIndex(1884);
            }

            public final void run() {
                String str;
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                Object obj = constraintTrackingWorker.f5172b.f5180b.f5225b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    AbstractC1600g.m5317a();
                    constraintTrackingWorker.mo5512d();
                    return;
                }
                constraintTrackingWorker.f5534i = AbstractC1718k.m5622a(constraintTrackingWorker.f5171a, str, constraintTrackingWorker.f5530e);
                if (constraintTrackingWorker.f5534i == null) {
                    AbstractC1600g.m5317a();
                    constraintTrackingWorker.mo5512d();
                    return;
                }
                C1642g a = C1687f.m5535b().f5432c.mo5366i().mo5429a(constraintTrackingWorker.f5172b.f5179a.toString());
                if (a == null) {
                    constraintTrackingWorker.mo5512d();
                    return;
                }
                C1630d dVar = new C1630d(constraintTrackingWorker.f5171a, constraintTrackingWorker);
                dVar.mo5403a(Collections.singletonList(a));
                if (dVar.mo5404a(constraintTrackingWorker.f5172b.f5179a.toString())) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Constraints met for delegate %s", new Object[]{str});
                    try {
                        AbstractFutureC27655q<ListenableWorker.AbstractC1584a> a2 = constraintTrackingWorker.f5534i.mo5335a();
                        a2.mo5481a(new Runnable(a2) {
                            /* class androidx.work.impl.workers.ConstraintTrackingWorker.RunnableC17162 */

                            /* renamed from: a */
                            final /* synthetic */ AbstractFutureC27655q f5536a;

                            static {
                                Covode.recordClassIndex(1885);
                            }

                            public final void run() {
                                synchronized (ConstraintTrackingWorker.this.f5531f) {
                                    if (ConstraintTrackingWorker.this.f5532g) {
                                        ConstraintTrackingWorker.this.mo5513e();
                                    } else {
                                        ConstraintTrackingWorker.this.f5533h.mo5482a(this.f5536a);
                                    }
                                }
                            }

                            {
                                this.f5536a = r2;
                            }
                        }, constraintTrackingWorker.f5172b.f5183e);
                    } catch (Throwable unused) {
                        AbstractC1600g.m5317a();
                        C1764a.m5928a("Delegated worker %s threw exception in startWork.", new Object[]{str});
                        Throwable[] thArr = new Throwable[1];
                        synchronized (constraintTrackingWorker.f5531f) {
                            if (constraintTrackingWorker.f5532g) {
                                AbstractC1600g.m5317a();
                                constraintTrackingWorker.mo5513e();
                            } else {
                                constraintTrackingWorker.mo5512d();
                            }
                        }
                    }
                } else {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Constraints not met for delegate %s. Requesting retry.", new Object[]{str});
                    constraintTrackingWorker.mo5513e();
                }
            }
        });
        return this.f5533h;
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: c */
    public final void mo5337c() {
        super.mo5337c();
        ListenableWorker listenableWorker = this.f5534i;
        if (listenableWorker != null) {
            listenableWorker.mo5336b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5512d() {
        this.f5533h.mo5483a(new ListenableWorker.AbstractC1584a.C1585a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo5513e() {
        this.f5533h.mo5483a(new ListenableWorker.AbstractC1584a.C1586b());
    }

    @Override // androidx.work.impl.p070a.AbstractC1629c
    /* renamed from: b */
    public final void mo5401b(List<String> list) {
        AbstractC1600g.m5317a();
        C1764a.m5928a("Constraints changed for %s", new Object[]{list});
        synchronized (this.f5531f) {
            this.f5532g = true;
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5530e = workerParameters;
    }
}
