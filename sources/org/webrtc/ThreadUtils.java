package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    public interface BlockingOperation {
        static {
            Covode.recordClassIndex(106733);
        }

        void run();
    }

    static {
        Covode.recordClassIndex(106726);
    }

    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        static {
            Covode.recordClassIndex(106734);
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
            /* class org.webrtc.ThreadUtils.C903062 */

            static {
                Covode.recordClassIndex(106730);
            }

            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public final void run() {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() {
            /* class org.webrtc.ThreadUtils.C903051 */

            static {
                Covode.recordClassIndex(106727);
            }

            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public final void run() {
                MethodCollector.m26663i(348);
                thread.join();
                MethodCollector.m26664o(348);
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
            /* class org.webrtc.ThreadUtils.CallableC903084 */

            static {
                Covode.recordClassIndex(106732);
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
        MethodCollector.m26663i(2623);
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
        MethodCollector.m26664o(2623);
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
            final AnonymousClass1Result r2 = new Object() {
                /* class org.webrtc.ThreadUtils.AnonymousClass1Result */
                public V value;

                static {
                    Covode.recordClassIndex(106729);
                }
            };
            final AnonymousClass1CaughtException r3 = new Object() {
                /* class org.webrtc.ThreadUtils.AnonymousClass1CaughtException */

                /* renamed from: e */
                Exception f205064e;

                static {
                    Covode.recordClassIndex(106728);
                }
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!handler.post(new Runnable() {
                /* class org.webrtc.ThreadUtils.RunnableC903073 */

                static {
                    Covode.recordClassIndex(106731);
                }

                public final void run() {
                    try {
                        r2.value = (V) callable.call();
                    } catch (Exception e) {
                        r3.f205064e = e;
                    }
                    countDownLatch.countDown();
                }
            })) {
                return null;
            }
            awaitUninterruptibly(countDownLatch);
            if (r3.f205064e == null) {
                return r2.value;
            }
            RuntimeException runtimeException = new RuntimeException(r3.f205064e);
            runtimeException.setStackTrace(concatStackTraces(r3.f205064e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }
}
