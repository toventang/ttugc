package com.ttnet.org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TraceEvent implements AutoCloseable {

    /* renamed from: a */
    public static volatile boolean f198321a;

    /* renamed from: b */
    private static volatile boolean f198322b;

    /* renamed from: c */
    private final String f198323c;

    static {
        Covode.recordClassIndex(103364);
    }

    private static native void nativeBegin(String str, String str2);

    public static native void nativeBeginToplevel(String str);

    private static native void nativeEnd(String str, String str2);

    public static native void nativeEndToplevel(String str);

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    /* renamed from: com.ttnet.org.chromium.base.TraceEvent$a */
    static class C87437a implements Printer {

        /* renamed from: a */
        static final /* synthetic */ boolean f198324a = true;

        /* renamed from: b */
        private static final int f198325b = 18;

        /* renamed from: c */
        private String f198326c;

        private C87437a() {
        }

        static {
            Covode.recordClassIndex(103365);
        }

        /* synthetic */ C87437a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo141497b(String str) {
            MethodCollector.m26663i(7247);
            boolean a = EarlyTraceEvent.m151731a();
            if ((TraceEvent.f198321a || a) && this.f198326c != null) {
                if (TraceEvent.f198321a) {
                    TraceEvent.nativeEndToplevel(this.f198326c);
                } else {
                    EarlyTraceEvent.m151732b(this.f198326c);
                }
            }
            this.f198326c = null;
            MethodCollector.m26664o(7247);
        }

        public void println(String str) {
            if (str.startsWith(">")) {
                mo141496a(str);
            } else if (f198324a || str.startsWith("<")) {
                mo141497b(str);
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo141496a(String str) {
            int indexOf;
            String str2;
            int indexOf2;
            MethodCollector.m26663i(7100);
            boolean a = EarlyTraceEvent.m151731a();
            if (TraceEvent.f198321a || a) {
                StringBuilder sb = new StringBuilder("Looper.dispatch: ");
                int i = f198325b;
                int indexOf3 = str.indexOf(40, i);
                if (indexOf3 == -1) {
                    indexOf = -1;
                } else {
                    indexOf = str.indexOf(41, indexOf3);
                }
                String str3 = "";
                if (indexOf != -1) {
                    str2 = str.substring(indexOf3 + 1, indexOf);
                } else {
                    str2 = str3;
                }
                StringBuilder append = sb.append(str2).append("(");
                int indexOf4 = str.indexOf(125, i);
                if (indexOf4 == -1 || (indexOf2 = str.indexOf(58, indexOf4)) == -1) {
                    indexOf2 = str.length();
                }
                if (indexOf4 != -1) {
                    str3 = str.substring(indexOf4 + 2, indexOf2);
                }
                this.f198326c = append.append(str3).append(")").toString();
                if (TraceEvent.f198321a) {
                    TraceEvent.nativeBeginToplevel(this.f198326c);
                    MethodCollector.m26664o(7100);
                    return;
                }
                EarlyTraceEvent.m151729a(this.f198326c);
            }
            MethodCollector.m26664o(7100);
        }
    }

    /* renamed from: com.ttnet.org.chromium.base.TraceEvent$b */
    static final class C87438b extends C87437a implements MessageQueue.IdleHandler {

        /* renamed from: b */
        private long f198327b;

        /* renamed from: c */
        private long f198328c;

        /* renamed from: d */
        private int f198329d;

        /* renamed from: e */
        private int f198330e;

        /* renamed from: f */
        private int f198331f;

        /* renamed from: g */
        private boolean f198332g;

        static {
            Covode.recordClassIndex(103366);
        }

        private C87438b() {
            super((byte) 0);
        }

        /* renamed from: a */
        private final void m151765a() {
            if (TraceEvent.f198321a && !this.f198332g) {
                this.f198327b = SystemClock.elapsedRealtime();
                Looper.myQueue().addIdleHandler(this);
                this.f198332g = true;
            } else if (this.f198332g && !TraceEvent.f198321a) {
                Looper.myQueue().removeIdleHandler(this);
                this.f198332g = false;
            }
        }

        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f198327b == 0) {
                this.f198327b = elapsedRealtime;
            }
            long j = elapsedRealtime - this.f198327b;
            this.f198330e++;
            TraceEvent.m151762b("Looper.queueIdle", this.f198331f + " tasks since last idle.");
            if (j > 48) {
                TraceEvent.m151761a("TraceEvent.LooperMonitor:IdleStats", this.f198329d + " tasks and " + this.f198330e + " idles processed so far, " + this.f198331f + " tasks bursted and " + j + "ms elapsed since last idle");
            }
            this.f198327b = elapsedRealtime;
            this.f198331f = 0;
            return true;
        }

        /* synthetic */ C87438b(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Override // com.ttnet.org.chromium.base.TraceEvent.C87437a
        /* renamed from: a */
        public final void mo141496a(String str) {
            if (this.f198331f == 0) {
                TraceEvent.m151760a("Looper.queueIdle");
            }
            this.f198328c = SystemClock.elapsedRealtime();
            m151765a();
            super.mo141496a(str);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ttnet.org.chromium.base.TraceEvent.C87437a
        /* renamed from: b */
        public final void mo141497b(String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f198328c;
            if (elapsedRealtime > 16) {
                TraceEvent.m151761a("TraceEvent.LooperMonitor:IdleStats", "observed a task that took " + elapsedRealtime + "ms: " + str);
            }
            super.mo141497b(str);
            m151765a();
            this.f198329d++;
            this.f198331f++;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m151760a(this.f198323c);
    }

    /* renamed from: com.ttnet.org.chromium.base.TraceEvent$c */
    static final class C87439c {

        /* renamed from: a */
        public static final C87437a f198333a;

        static {
            C87437a aVar;
            Covode.recordClassIndex(103367);
            if (CommandLine.m151722b().mo141481a()) {
                aVar = new C87438b((byte) 0);
            } else {
                aVar = new C87437a((byte) 0);
            }
            f198333a = aVar;
        }
    }

    public TraceEvent(String str) {
        this.f198323c = str;
        m151762b(str, null);
    }

    /* renamed from: a */
    public static void m151760a(String str) {
        MethodCollector.m26663i(3864);
        EarlyTraceEvent.m151732b(str);
        if (f198321a) {
            nativeEnd(str, null);
        }
        MethodCollector.m26664o(3864);
    }

    public static void setEnabled(boolean z) {
        C87437a aVar;
        MethodCollector.m26663i(3783);
        if (z) {
            synchronized (EarlyTraceEvent.f198250a) {
                try {
                    if (EarlyTraceEvent.m151734b()) {
                        EarlyTraceEvent.f198251b = 2;
                        EarlyTraceEvent.m151736c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3783);
                    throw th;
                }
            }
        }
        if (f198321a != z) {
            f198321a = z;
            if (f198322b) {
                MethodCollector.m26664o(3783);
                return;
            }
            Looper looper = ThreadUtils.m151755a().getLooper();
            if (z) {
                aVar = C87439c.f198333a;
            } else {
                aVar = null;
            }
            looper.setMessageLogging(aVar);
        }
        MethodCollector.m26664o(3783);
    }

    /* renamed from: a */
    public static void m151761a(String str, String str2) {
        MethodCollector.m26663i(3786);
        if (f198321a) {
            nativeInstant(str, str2);
        }
        MethodCollector.m26664o(3786);
    }

    /* renamed from: b */
    public static void m151762b(String str, String str2) {
        MethodCollector.m26663i(3826);
        EarlyTraceEvent.m151729a(str);
        if (f198321a) {
            nativeBegin(str, str2);
        }
        MethodCollector.m26664o(3826);
    }
}
