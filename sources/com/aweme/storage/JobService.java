package com.aweme.storage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;

public class JobService extends Service {
    static {
        Covode.recordClassIndex(2628);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return 2;
    }

    public void onCreate() {
        C1731i.m5640b(new Callable<String>() {
            /* class com.aweme.storage.JobService.CallableC23533 */

            static {
                Covode.recordClassIndex(2631);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() {
                C2360c.m7183c(JobService.this);
                return null;
            }
        }, C40780g.m82241a()).mo5543c(new AbstractC1729g<String, String>() {
            /* class com.aweme.storage.JobService.C23522 */

            static {
                Covode.recordClassIndex(2630);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ String then(C1731i<String> iVar) {
                C2360c.m7184d(JobService.this);
                return null;
            }
        }, C1731i.f5564c).mo5537b((AbstractC1729g) new AbstractC1729g<String, C1731i<String>>() {
            /* class com.aweme.storage.JobService.C23511 */

            static {
                Covode.recordClassIndex(2629);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ C1731i<String> then(C1731i<String> iVar) {
                JobService.this.stopSelf();
                return null;
            }
        });
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
