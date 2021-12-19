package com.p2082ss.android.agilelogger.p2119c;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.p2110a.AbstractC29704b;
import com.p2082ss.android.agilelogger.p2110a.p2111a.C29703b;
import com.p2082ss.android.agilelogger.p2110a.p2112b.C29705a;
import com.p2082ss.android.agilelogger.p2110a.p2112b.p2113a.C29706a;
import com.p2082ss.android.agilelogger.p2110a.p2112b.p2114b.C29708a;
import com.p2082ss.android.agilelogger.p2110a.p2112b.p2114b.C29709b;
import com.p2082ss.android.agilelogger.p2110a.p2112b.p2115c.C29711a;
import com.p2082ss.android.agilelogger.p2110a.p2116c.C29713a;
import com.p2082ss.android.agilelogger.p2110a.p2117d.C29715a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.agilelogger.c.b */
public final class C29721b {

    /* renamed from: a */
    private static ConcurrentHashMap<EnumC29722a, AbstractC29704b> f70878a;

    /* renamed from: com.ss.android.agilelogger.c.b$a */
    public enum EnumC29722a {
        MSG,
        JSON,
        BUNDLE,
        INTENT,
        THROWABLE,
        BORDER,
        STACKTRACE,
        THREAD,
        STACKTRACE_STR;

        static {
            Covode.recordClassIndex(36119);
        }
    }

    static {
        Covode.recordClassIndex(36118);
        ConcurrentHashMap<EnumC29722a, AbstractC29704b> concurrentHashMap = new ConcurrentHashMap<>();
        f70878a = concurrentHashMap;
        concurrentHashMap.put(EnumC29722a.MSG, new C29705a());
        f70878a.put(EnumC29722a.JSON, new C29706a());
        f70878a.put(EnumC29722a.BUNDLE, new C29708a());
        f70878a.put(EnumC29722a.INTENT, new C29709b());
        f70878a.put(EnumC29722a.BORDER, new C29703b());
        f70878a.put(EnumC29722a.STACKTRACE, new C29713a());
        f70878a.put(EnumC29722a.THREAD, new C29715a());
        f70878a.put(EnumC29722a.THROWABLE, new C29711a());
    }

    /* renamed from: a */
    public static String m59893a(EnumC29722a aVar, Intent intent) {
        f70878a.get(aVar);
        return C29709b.m59883a(intent);
    }

    /* renamed from: a */
    public static String m59894a(EnumC29722a aVar, Bundle bundle) {
        f70878a.get(aVar);
        return C29723c.m59902a(bundle);
    }

    /* renamed from: a */
    public static String m59895a(EnumC29722a aVar, String str) {
        AbstractC29704b bVar = f70878a.get(aVar);
        if (bVar == null) {
            return str;
        }
        if (aVar != EnumC29722a.BORDER) {
            return bVar.mo51950a(str);
        }
        return bVar.mo51950a(new String[]{str});
    }

    /* renamed from: a */
    public static String m59896a(EnumC29722a aVar, Thread thread) {
        return f70878a.get(aVar).mo51950a(thread);
    }

    /* renamed from: a */
    public static String m59897a(EnumC29722a aVar, Throwable th) {
        return f70878a.get(aVar).mo51950a(th);
    }

    /* renamed from: a */
    public static String m59898a(EnumC29722a aVar, StackTraceElement[] stackTraceElementArr) {
        return f70878a.get(aVar).mo51950a(stackTraceElementArr);
    }
}
