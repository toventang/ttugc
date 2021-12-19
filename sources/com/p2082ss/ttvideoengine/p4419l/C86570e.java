package com.p2082ss.ttvideoengine.p4419l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttvideoengine.l.e */
public final class C86570e {

    /* renamed from: a */
    public long f195043a;

    /* renamed from: b */
    public long f195044b;

    /* renamed from: c */
    public final ReentrantLock f195045c = new ReentrantLock();

    /* renamed from: d */
    public final HashMap<String, C86571a> f195046d = new HashMap<>();

    /* renamed from: com.ss.ttvideoengine.l.e$a */
    public static class C86571a {

        /* renamed from: a */
        public long f195047a;

        /* renamed from: b */
        public long f195048b;

        /* renamed from: c */
        public long f195049c;

        /* renamed from: d */
        public String f195050d = "";

        /* renamed from: e */
        public boolean f195051e;

        /* renamed from: f */
        public boolean f195052f;

        static {
            Covode.recordClassIndex(101799);
        }
    }

    static {
        Covode.recordClassIndex(101798);
    }

    /* renamed from: a */
    public final void mo137825a(String str) {
        C86571a aVar = this.f195046d.get(str);
        if (aVar != null) {
            if (aVar.f195047a > this.f195044b && !aVar.f195052f) {
                C86641i.m150113b("PreloadUtil", "trigger preload " + str + " playable buffer is: " + aVar.f195047a);
                C86385d.C86400h.f193679a.mo137364a(aVar.f195047a);
                aVar.f195052f = true;
            }
            if (aVar.f195051e || (aVar.f195049c > 0 && aVar.f195047a + aVar.f195048b + 1000 >= aVar.f195049c)) {
                if (!aVar.f195052f) {
                    C86641i.m150113b("PreloadUtil", "cached video trigger preload " + str + " playable buffer is: " + aVar.f195047a);
                    C86385d.C86400h.f193679a.mo137364a(aVar.f195047a);
                    aVar.f195052f = true;
                }
            } else if (aVar.f195047a < this.f195043a) {
                long i = C86385d.C86400h.f193679a.mo137392i();
                if (aVar.f195052f && i > 0) {
                    m149836a("low_buffer", str);
                    aVar.f195052f = false;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m149836a(String str, String str2) {
        C86641i.m150113b("PreloadUtil", "cancel preload because:" + str + " traceId:" + str2);
        C86385d.C86400h.f193679a.mo137390h();
        C86385d.C86400h.f193679a.mo137369a(str);
    }
}
