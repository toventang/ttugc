package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.p1085a.p1086a.C15294g;
import com.bytedance.helios.p1085a.p1086a.HandlerThreadC15288a;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.p2082ss.android.agilelogger.ALog;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.utils.f */
public final class C15484f {

    /* renamed from: a */
    static final ConcurrentLinkedQueue<C15483e> f37736a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    static AtomicBoolean f37737b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final C15484f f37738c = new C15484f();

    /* renamed from: a */
    public static final void m28490a(String str, String str2) {
        m28491a(str, str2, (String) null, 12);
    }

    private C15484f() {
    }

    static {
        Covode.recordClassIndex(17738);
    }

    /* renamed from: com.bytedance.helios.sdk.utils.f$a */
    public static final class RunnableC15485a implements Runnable {

        /* renamed from: a */
        public static final RunnableC15485a f37739a = new RunnableC15485a();

        static {
            Covode.recordClassIndex(17739);
        }

        RunnableC15485a() {
        }

        public final void run() {
            while (!C15484f.f37736a.isEmpty()) {
                C15483e poll = C15484f.f37736a.poll();
                if (poll != null) {
                    String str = "(" + C15294g.m28203a(poll.f37735e) + ") ";
                    String str2 = poll.f37732b;
                    if (str2 == null || !C89361p.m154874b(str2, str, false)) {
                        poll.f37732b = str + poll.f37732b;
                    }
                    C15484f.m28489a(poll);
                }
            }
            C15484f.f37737b.set(false);
        }
    }

    /* renamed from: b */
    private static void m28494b(C15483e eVar) {
        ConcurrentLinkedQueue<C15483e> concurrentLinkedQueue = f37736a;
        if (concurrentLinkedQueue.size() > 1000) {
            concurrentLinkedQueue.poll();
        }
        concurrentLinkedQueue.offer(eVar);
    }

    /* renamed from: a */
    public static final void m28489a(C15483e eVar) {
        C89219l.m154719c(eVar, "");
        if (HeliosEnvImpl.INSTANCE.getAlogEnabled()) {
            if (ALog.sConfig == null) {
                m28494b(eVar);
                return;
            }
            m28493a(true);
            m28497d(eVar);
        } else if (HeliosEnvImpl.INSTANCE.isOffLineEnv()) {
            m28496c(eVar);
        }
    }

    /* renamed from: c */
    private static void m28496c(C15483e eVar) {
        String str = eVar.f37733c;
        int hashCode = str.hashCode();
        if (hashCode == 100) {
            if (str.equals("d")) {
            }
        } else if (hashCode != 101) {
            if (hashCode == 105) {
                str.equals("i");
            } else if (hashCode != 119 || !str.equals("w")) {
            }
        } else if (!str.equals("e")) {
        }
    }

    /* renamed from: a */
    public static void m28493a(boolean z) {
        if ((!f37736a.isEmpty()) && !f37737b.getAndSet(true)) {
            RunnableC15485a aVar = RunnableC15485a.f37739a;
            if (z) {
                HandlerThreadC15288a.m28195b().post(aVar);
            } else {
                aVar.run();
            }
        }
    }

    /* renamed from: d */
    private static void m28497d(C15483e eVar) {
        String str = eVar.f37733c;
        int hashCode = str.hashCode();
        String str2 = "";
        if (hashCode != 100) {
            if (hashCode != 101) {
                if (hashCode != 105) {
                    if (hashCode == 119 && str.equals("w")) {
                        String str3 = eVar.f37731a;
                        String str4 = eVar.f37732b;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        ALog.m59871w(str3, str2);
                    }
                } else if (str.equals("i")) {
                    String str5 = eVar.f37731a;
                    String str6 = eVar.f37732b;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    ALog.m59869i(str5, str2);
                }
            } else if (str.equals("e")) {
                ALog.m59867e(eVar.f37731a, eVar.f37732b, eVar.f37734d);
            }
        } else if (str.equals("d")) {
            String str7 = eVar.f37731a;
            String str8 = eVar.f37732b;
            if (str8 != null) {
                str2 = str8;
            }
            ALog.m59865d(str7, str2);
        }
    }

    /* renamed from: b */
    public static final void m28495b(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        HeliosEnvImpl.INSTANCE.isOffLineEnv();
    }

    /* renamed from: a */
    public static /* synthetic */ void m28491a(String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str3 = "i";
        }
        m28492a(str, str2, str3, (Throwable) null);
    }

    /* renamed from: a */
    public static final void m28492a(String str, String str2, String str3, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str3, "");
        m28489a(new C15483e(str, str2, str3, th));
    }
}
