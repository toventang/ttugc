package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bytedance.covode.number.Covode;

public class CombineContinuationsWorker extends Worker {
    static {
        Covode.recordClassIndex(1882);
    }

    @Override // androidx.work.Worker
    /* renamed from: d */
    public final ListenableWorker.AbstractC1584a mo5347d() {
        return new ListenableWorker.AbstractC1584a.C1587c(this.f5172b.f5180b);
    }

    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
