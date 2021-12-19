package com.bytedance.monitor.p1546a.p1548b.p1549a;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.AbstractC21453f;
import com.bytedance.monitor.p1546a.p1548b.C21435a;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.monitor.a.b.a.a */
public final class ThreadFactoryC21440a implements ThreadFactory {

    /* renamed from: a */
    public final String f50833a = getClass().getSimpleName();

    /* renamed from: b */
    public AbstractC21453f f50834b;

    /* renamed from: c */
    public AbstractC21442a f50835c;

    /* renamed from: d */
    private final String f50836d;

    /* renamed from: com.bytedance.monitor.a.b.a.a$a */
    public interface AbstractC21442a {
        static {
            Covode.recordClassIndex(25065);
        }

        /* renamed from: a */
        void mo35041a(long j);
    }

    static {
        Covode.recordClassIndex(25063);
    }

    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() {
            /* class com.bytedance.monitor.p1546a.p1548b.p1549a.ThreadFactoryC21440a.RunnableC214411 */

            static {
                Covode.recordClassIndex(25064);
            }

            public final void run() {
                Process.setThreadPriority(10);
                if (ThreadFactoryC21440a.this.f50835c != null) {
                    ThreadFactoryC21440a.this.f50835c.mo35041a(Thread.currentThread().getId());
                }
                try {
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    C21435a.C21439a.f50832a.mo35037a(th, "APM_INNER_ERROR_async_task");
                    if (ThreadFactoryC21440a.this.f50834b != null) {
                        th.getMessage();
                    }
                }
            }
        }, this.f50836d);
    }

    public ThreadFactoryC21440a(String str) {
        this.f50836d = "APM_".concat(String.valueOf(str));
    }
}
