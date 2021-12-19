package androidx.work;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.k */
public abstract class AbstractC1718k {

    /* renamed from: a */
    private static final String f5538a = AbstractC1600g.m5318a("WorkerFactory");

    static {
        Covode.recordClassIndex(1887);
    }

    /* renamed from: a */
    public static ListenableWorker m5622a(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Exception e) {
                AbstractC1600g.m5317a();
                new Throwable[1][0] = e;
                return null;
            }
        } catch (ClassNotFoundException unused) {
            AbstractC1600g.m5317a();
            return null;
        }
    }
}
