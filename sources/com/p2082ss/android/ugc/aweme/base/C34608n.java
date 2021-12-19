package com.p2082ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.base.n */
public class C34608n {

    /* renamed from: a */
    public static volatile C34608n f81665a;

    /* renamed from: b */
    public boolean f81666b;

    /* renamed from: c */
    public Executor f81667c;

    /* renamed from: com.ss.android.ugc.aweme.base.n$b */
    public static class C34610b {

        /* renamed from: a */
        public Executor f81670a;

        static {
            Covode.recordClassIndex(41574);
        }
    }

    static {
        Covode.recordClassIndex(41572);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.base.n$a */
    public static class RunnableC34609a implements Runnable {

        /* renamed from: a */
        private final Callable<?> f81668a;

        /* renamed from: b */
        private final Message f81669b;

        static {
            Covode.recordClassIndex(41573);
        }

        public final void run() {
            Object e;
            try {
                e = this.f81668a.call();
            } catch (Exception e2) {
                e = e2;
            }
            Message message = this.f81669b;
            if (message != null) {
                message.obj = e;
                this.f81669b.sendToTarget();
            }
        }

        public final String toString() {
            return "TaskManager[" + this.f81668a.toString() + "]";
        }

        private RunnableC34609a(Callable<?> callable, Message message) {
            this.f81668a = callable;
            this.f81669b = message;
        }

        /* synthetic */ RunnableC34609a(Callable callable, Message message, byte b) {
            this(callable, message);
        }
    }

    /* renamed from: a */
    public static C34608n m70658a() {
        MethodCollector.m26663i(14018);
        if (f81665a == null) {
            synchronized (C34608n.class) {
                try {
                    if (f81665a == null) {
                        f81665a = new C34608n();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14018);
                    throw th;
                }
            }
        }
        C34608n nVar = f81665a;
        MethodCollector.m26664o(14018);
        return nVar;
    }

    /* renamed from: a */
    private static void m70659a(C34608n nVar) {
        if (!nVar.f81666b) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    /* renamed from: b */
    private static Runnable m70660b(Handler handler, Callable<?> callable, int i) {
        if (handler == null) {
            return new RunnableC34609a(callable, null, (byte) 0);
        }
        return new RunnableC34609a(callable, handler.obtainMessage(i), (byte) 0);
    }

    /* renamed from: a */
    public final void mo61083a(Handler handler, Callable<?> callable, int i) {
        m70659a(this);
        this.f81667c.execute(m70660b(handler, callable, i));
    }
}
