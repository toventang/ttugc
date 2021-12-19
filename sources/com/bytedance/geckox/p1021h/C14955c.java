package com.bytedance.geckox.p1021h;

import android.os.Process;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.ExecutorC15055g;
import com.bytedance.geckox.utils.FileLock;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.geckox.h.c */
public final class C14955c {

    /* renamed from: a */
    public static final Map<String, Pair<FileLock, AtomicLong>> f36538a = new HashMap();

    static {
        Covode.recordClassIndex(17068);
    }

    /* renamed from: a */
    public static boolean m27541a(String str) {
        MethodCollector.m26663i(4681);
        Map<String, Pair<FileLock, AtomicLong>> map = f36538a;
        synchronized (map) {
            try {
                FileLock b = FileLock.m27697b(str);
                if (b == null) {
                    return false;
                }
                Pair<FileLock, AtomicLong> pair = map.get(str);
                if (pair == null || ((AtomicLong) pair.second).get() == 0) {
                    File parentFile = new File(str).getParentFile();
                    final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
                    boolean renameTo = parentFile.renameTo(file);
                    b.mo24325a();
                    b.mo24326b();
                    if (renameTo) {
                        ExecutorC15055g.m27720a().execute(new Runnable() {
                            /* class com.bytedance.geckox.p1021h.C14955c.RunnableC149561 */

                            static {
                                Covode.recordClassIndex(17069);
                            }

                            public final void run() {
                                C15052e.m27712a(file);
                            }
                        });
                    }
                    MethodCollector.m26664o(4681);
                    return renameTo;
                }
                b.mo24325a();
                FileLock.m27696a(str, Process.myPid());
                MethodCollector.m26664o(4681);
                return false;
            } finally {
                MethodCollector.m26664o(4681);
            }
        }
    }
}
