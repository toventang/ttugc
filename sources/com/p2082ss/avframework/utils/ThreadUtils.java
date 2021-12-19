package com.p2082ss.avframework.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.avframework.utils.ThreadUtils */
public class ThreadUtils {

    /* renamed from: com.ss.avframework.utils.ThreadUtils$BlockingOperation */
    public interface BlockingOperation {
        static {
            Covode.recordClassIndex(100760);
        }

        void run();
    }

    static {
        Covode.recordClassIndex(100749);
    }

    /* renamed from: com.ss.avframework.utils.ThreadUtils$ThreadChecker */
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        static {
            Covode.recordClassIndex(100761);
        }

        public void detachThread() {
            this.thread = null;
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() {
            /* class com.p2082ss.avframework.utils.ThreadUtils.C860512 */

            static {
                Covode.recordClassIndex(100753);
            }

            @Override // com.p2082ss.avframework.utils.ThreadUtils.BlockingOperation
            public final void run() {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() {
            /* class com.p2082ss.avframework.utils.ThreadUtils.C860501 */

            static {
                Covode.recordClassIndex(100750);
            }

            @Override // com.p2082ss.avframework.utils.ThreadUtils.BlockingOperation
            public final void run() {
                MethodCollector.m26663i(3767);
                thread.join();
                MethodCollector.m26664o(3767);
            }
        });
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[(stackTraceElementArr.length + stackTraceElementArr2.length)];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() {
            /* class com.p2082ss.avframework.utils.ThreadUtils.CallableC860534 */

            static {
                Covode.recordClassIndex(100757);
            }

            @Override // java.util.concurrent.Callable
            public final Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                z2 = true;
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j2 <= 0) {
                    break;
                }
            }
        }
        Thread.currentThread().interrupt();
        return z;
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        MethodCollector.m26663i(114);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j;
        boolean z = false;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        boolean isAlive = thread.isAlive();
        MethodCollector.m26664o(114);
        if (!isAlive) {
            return true;
        }
        return false;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            final AnonymousClass1Result r4 = new Object() {
                /* class com.p2082ss.avframework.utils.ThreadUtils.AnonymousClass1Result */
                public V value;

                static {
                    Covode.recordClassIndex(100752);
                }
            };
            final AnonymousClass1CaughtException r3 = new Object() {
                /* class com.p2082ss.avframework.utils.ThreadUtils.AnonymousClass1CaughtException */

                /* renamed from: e */
                Exception f191999e;

                static {
                    Covode.recordClassIndex(100751);
                }
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!handler.post(new Runnable() {
                /* class com.p2082ss.avframework.utils.ThreadUtils.RunnableC860523 */

                static {
                    Covode.recordClassIndex(100756);
                }

                public final void run() {
                    try {
                        r4.value = (V) callable.call();
                    } catch (Exception e) {
                        r3.f191999e = e;
                    }
                    countDownLatch.countDown();
                }
            })) {
                Exception exc = new Exception("Handler is invalid");
                exc.printStackTrace();
                AVLog.ioe("ThreadUtils", exc.getCause() + " " + Log.getStackTraceString(exc));
                countDownLatch.countDown();
            }
            awaitUninterruptibly(countDownLatch);
            if (r3.f191999e == null) {
                return r4.value;
            }
            RuntimeException runtimeException = new RuntimeException(r3.f191999e);
            runtimeException.setStackTrace(concatStackTraces(r3.f191999e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    public static long invokeAtFrontUninterruptibly(Handler handler, Runnable runnable, long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!handler.post(new Runnable() {
            /* class com.p2082ss.avframework.utils.ThreadUtils.RunnableC860556 */

            static {
                Covode.recordClassIndex(100759);
            }

            public final void run() {
                countDownLatch.countDown();
            }
        })) {
            return -1;
        }
        if (awaitUninterruptibly(countDownLatch, j)) {
            return 0;
        }
        return j;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable, long j) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            final AnonymousClass2Result r2 = new Object() {
                /* class com.p2082ss.avframework.utils.ThreadUtils.AnonymousClass2Result */
                public V value;

                static {
                    Covode.recordClassIndex(100755);
                }
            };
            final AnonymousClass2CaughtException r3 = new Object() {
                /* class com.p2082ss.avframework.utils.ThreadUtils.AnonymousClass2CaughtException */

                /* renamed from: e */
                Exception f192000e;

                static {
                    Covode.recordClassIndex(100754);
                }
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!handler.post(new Runnable() {
                /* class com.p2082ss.avframework.utils.ThreadUtils.RunnableC860545 */

                static {
                    Covode.recordClassIndex(100758);
                }

                public final void run() {
                    try {
                        r2.value = (V) callable.call();
                    } catch (Exception e) {
                        r3.f192000e = e;
                    }
                    countDownLatch.countDown();
                }
            })) {
                Exception exc = new Exception("Handler is invalid");
                exc.printStackTrace();
                AVLog.ioe("ThreadUtils", exc.getCause() + " " + Log.getStackTraceString(exc));
                countDownLatch.countDown();
            }
            awaitUninterruptibly(countDownLatch, j);
            if (r3.f192000e == null) {
                return r2.value;
            }
            RuntimeException runtimeException = new RuntimeException(r3.f192000e);
            runtimeException.setStackTrace(concatStackTraces(r3.f192000e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }
}
