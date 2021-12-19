package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.port.in.ISchedulerService */
public interface ISchedulerService {
    static {
        Covode.recordClassIndex(74418);
    }

    void schedule(Handler handler, Callable<?> callable, int i);
}
