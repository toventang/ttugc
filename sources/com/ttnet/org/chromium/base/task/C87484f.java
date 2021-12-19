package com.ttnet.org.chromium.base.task;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87444b;
import com.ttnet.org.chromium.base.task.AbstractC87475a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ttnet.org.chromium.base.task.f */
final class C87484f extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final int f198439a;

    /* renamed from: b */
    private static final int f198440b;

    /* renamed from: c */
    private static final int f198441c;

    /* renamed from: d */
    private static final ThreadFactory f198442d = new ThreadFactory() {
        /* class com.ttnet.org.chromium.base.task.C87484f.ThreadFactoryC874851 */

        /* renamed from: a */
        private final AtomicInteger f198444a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(103431);
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC87486g(runnable), "CrAsyncTask #" + this.f198444a.getAndIncrement());
        }
    };

    /* renamed from: e */
    private static final BlockingQueue<Runnable> f198443e = new ArrayBlockingQueue(128);

    C87484f() {
        this(f198440b, f198441c, TimeUnit.SECONDS, f198443e, f198442d);
    }

    static {
        Covode.recordClassIndex(103430);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f198439a = availableProcessors;
        f198440b = Math.max(2, Math.min(availableProcessors - 1, 4));
        f198441c = (availableProcessors * 2) + 1;
    }

    /* renamed from: a */
    private static String m151835a(Runnable runnable) {
        Class<?> cls = runnable.getClass();
        if (cls == AbstractC87475a.C87477a.class) {
            try {
                cls = AbstractC87475a.this.getClass();
            } catch (NoSuchFieldException e) {
                if (C87444b.f198337a) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException e2) {
                if (C87444b.f198337a) {
                    throw new RuntimeException(e2);
                }
            }
        } else if (cls.getEnclosingClass() == AsyncTask.class) {
            Field declaredField = cls.getDeclaredField("this$0");
            declaredField.setAccessible(true);
            cls = declaredField.get(runnable).getClass();
        }
        return cls.getName();
    }

    public final void execute(Runnable runnable) {
        int i;
        MethodCollector.m26663i(5891);
        try {
            super.execute(runnable);
            MethodCollector.m26664o(5891);
        } catch (RejectedExecutionException e) {
            HashMap hashMap = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                String a = m151835a(runnable2);
                if (hashMap.containsKey(a)) {
                    i = ((Integer) hashMap.get(a)).intValue();
                } else {
                    i = 0;
                }
                hashMap.put(a, Integer.valueOf(i + 1));
            }
            RejectedExecutionException rejectedExecutionException = new RejectedExecutionException("Prominent classes in AsyncTask: " + m151836a(hashMap), e);
            MethodCollector.m26664o(5891);
            throw rejectedExecutionException;
        }
    }

    /* renamed from: a */
    private static String m151836a(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > 32) {
                sb.append(entry.getKey()).append(' ');
            }
        }
        if (sb.length() == 0) {
            return "NO CLASSES FOUND";
        }
        return sb.toString();
    }

    private C87484f(int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }
}
