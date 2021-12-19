package com.p2082ss.android.anrmonitor;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.anrmonitor.ANRError */
public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    private final Map<Thread, StackTraceElement[]> stackTraces;

    static {
        Covode.recordClassIndex(36125);
    }

    public Map<Thread, StackTraceElement[]> getStackTraces() {
        return this.stackTraces;
    }

    /* renamed from: com.ss.android.anrmonitor.ANRError$a */
    static class C29728a {

        /* renamed from: a */
        public final String f70889a;

        /* renamed from: b */
        public final StackTraceElement[] f70890b;

        static {
            Covode.recordClassIndex(36126);
        }

        /* renamed from: com.ss.android.anrmonitor.ANRError$a$a */
        class C29729a extends Throwable {
            static {
                Covode.recordClassIndex(36127);
            }

            public Throwable fillInStackTrace() {
                setStackTrace(C29728a.this.f70890b);
                return this;
            }

            private C29729a() {
                super(C29728a.this.f70889a, null);
            }

            /* synthetic */ C29729a(C29728a aVar, byte b) {
                this();
            }
        }

        private C29728a(String str, StackTraceElement[] stackTraceElementArr) {
            this.f70889a = str;
            this.f70890b = stackTraceElementArr;
        }

        /* synthetic */ C29728a(String str, StackTraceElement[] stackTraceElementArr, byte b) {
            this(str, stackTraceElementArr);
        }
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static ANRError NewMainOnly() {
        Thread thread = Looper.getMainLooper().getThread();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        HashMap hashMap = new HashMap(1);
        hashMap.put(thread, stackTrace);
        return new ANRError(new C29728a.C29729a(new C29728a(thread.getName(), stackTrace, (byte) 0), (byte) 0), hashMap);
    }

    public ANRError(C29728a.C29729a aVar, Map<Thread, StackTraceElement[]> map) {
        super("Application Not Responding", aVar);
        this.stackTraces = map;
    }
}
