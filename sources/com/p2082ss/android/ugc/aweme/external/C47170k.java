package com.p2082ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.external.IInitTaskService;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.external.k */
public final class C47170k implements IInitTaskService {
    static {
        Covode.recordClassIndex(55774);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.k$a */
    static final class RunnableC47171a implements Runnable {

        /* renamed from: a */
        public static final RunnableC47171a f109792a = new RunnableC47171a();

        static {
            Covode.recordClassIndex(55775);
        }

        RunnableC47171a() {
        }

        public final void run() {
            C63238c.f143589p.invalidate();
            C63238c.f143588o.invalidate();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInitTaskService
    public final AbstractC58264w initTask(int i) {
        if (i == 1) {
            return new AVCleanStorageTask();
        }
        if (i == 4) {
            return new AVCameraInitTask();
        }
        if (i != 5) {
            return null;
        }
        return new DownloadSuperEntranceResTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInitTaskService
    public final Runnable initTask(int i, Object obj) {
        if (i == 2) {
            AbstractC63154aa aaVar = C63238c.f143581h;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            aaVar.mo101545d((String) obj);
            return null;
        } else if (i != 3) {
            return null;
        } else {
            return RunnableC47171a.f109792a;
        }
    }
}
