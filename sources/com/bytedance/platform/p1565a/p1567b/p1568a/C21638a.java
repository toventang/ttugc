package com.bytedance.platform.p1565a.p1567b.p1568a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.p1565a.p1566a.C21624a;
import com.bytedance.platform.p1565a.p1566a.C21630g;
import com.bytedance.platform.p1565a.p1567b.C21637a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.platform.a.b.a.a */
public final class C21638a {

    /* renamed from: a */
    public static Set<Integer> f51337a = new HashSet();

    /* renamed from: b */
    static Set<Integer> f51338b = new HashSet();

    /* renamed from: c */
    public static Set<String> f51339c;

    /* renamed from: d */
    public static AbstractC21640b f51340d = new C21639a();

    /* renamed from: e */
    private static final Object f51341e = new Object();

    /* renamed from: f */
    private static final Set<String> f51342f = new HashSet();

    /* renamed from: g */
    private static final Object f51343g = new Object();

    /* renamed from: com.bytedance.platform.a.b.a.a$b */
    public interface AbstractC21640b {
        static {
            Covode.recordClassIndex(25281);
        }

        /* renamed from: a */
        boolean mo35288a(String str);
    }

    static {
        Covode.recordClassIndex(25279);
        f51337a.add(113);
        f51337a.add(114);
        f51337a.add(115);
        f51337a.add(116);
        f51337a.add(121);
        f51337a.add(122);
        f51337a.add(123);
        f51338b.add(140);
        f51338b.add(118);
        f51338b.add(113);
        f51338b.add(114);
        f51338b.add(115);
        f51338b.add(116);
        f51338b.add(121);
        f51338b.add(122);
        f51338b.add(123);
    }

    /* renamed from: com.bytedance.platform.a.b.a.a$a */
    public static class C21639a implements AbstractC21640b {
        static {
            Covode.recordClassIndex(25280);
        }

        @Override // com.bytedance.platform.p1565a.p1567b.p1568a.C21638a.AbstractC21640b
        /* renamed from: a */
        public final boolean mo35288a(String str) {
            return C21638a.f51339c.contains(str);
        }
    }

    /* renamed from: a */
    public static void m40591a(Message message) {
        MethodCollector.m26663i(4077);
        if (message == null) {
            MethodCollector.m26664o(4077);
            return;
        }
        int i = message.what;
        C21630g.m40583a(C21630g.EnumC21632a.ERROR);
        Handler handler = (Handler) C21624a.m40572b();
        synchronized (f51341e) {
            try {
                message.arg2 = 1000089;
                handler.dispatchMessage(message);
            } finally {
                MethodCollector.m26664o(4077);
            }
        }
    }

    /* renamed from: b */
    public static boolean m40592b(Message message) {
        if (message.getTarget() == C21624a.m40572b() && f51337a.contains(Integer.valueOf(message.what)) && !m40593c(message)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m40593c(Message message) {
        MethodCollector.m26663i(4139);
        if (message != null) {
            Set<String> set = f51339c;
            boolean z = false;
            if (set == null || set.isEmpty()) {
                MethodCollector.m26664o(4139);
                return false;
            }
            C21637a a = C21637a.m40590a(message);
            synchronized (f51343g) {
                try {
                    if (message.what == 114 && f51340d.mo35288a(a.f51331a)) {
                        f51342f.add(a.f51332b);
                    }
                    if (f51340d.mo35288a(a.f51331a) || f51342f.contains(a.f51332b)) {
                        z = true;
                    }
                } finally {
                    MethodCollector.m26664o(4139);
                }
            }
            return z;
        }
        RuntimeException runtimeException = new RuntimeException("Argument can not be null");
        MethodCollector.m26664o(4139);
        throw runtimeException;
    }
}
