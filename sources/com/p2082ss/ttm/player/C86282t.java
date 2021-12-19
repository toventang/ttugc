package com.p2082ss.ttm.player;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ttm.player.t */
public class C86282t {

    /* renamed from: a */
    public static final String f192730a = C86282t.class.getSimpleName();

    /* renamed from: b */
    public static String f192731b = null;

    /* renamed from: c */
    private static AbstractC86247g f192732c;

    /* renamed from: d */
    private static AbstractC86247g f192733d;

    /* renamed from: e */
    private static AbstractC86247g f192734e = new C86283a((byte) 0);

    /* renamed from: f */
    private static boolean f192735f = false;

    /* renamed from: g */
    private static boolean f192736g = false;

    /* renamed from: h */
    private static int f192737h = 0;

    /* renamed from: com.ss.ttm.player.t$a */
    static class C86283a implements AbstractC86247g {
        static {
            Covode.recordClassIndex(101460);
        }

        private C86283a() {
        }

        /* synthetic */ C86283a(byte b) {
            this();
        }

        @Override // com.p2082ss.ttm.player.AbstractC86247g
        /* renamed from: a */
        public final boolean mo136716a(List<String> list) {
            for (String str : list) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.m38962a(str);
                    C58032m.m104852a(uptimeMillis, str);
                } catch (Throwable th) {
                    C86282t.f192731b = th.getMessage();
                    return false;
                }
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(101459);
    }

    /* renamed from: a */
    public static final synchronized void m148514a() {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (C86282t.class) {
            MethodCollector.m26663i(5229);
            try {
                boolean z4 = false;
                if (f192737h == 0) {
                    f192737h = C86277r.m148503a(13, 0) / 1000;
                }
                if (f192737h == 2925) {
                    z = true;
                } else {
                    z = false;
                }
                if (C86277r.m148508a(3)) {
                    if (!z) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Librarian.m38962a("c++_shared");
                        C58032m.m104852a(uptimeMillis, "c++_shared");
                        if (!C86277r.m148508a(28)) {
                            m148515a("ttcrypto");
                            m148515a("ttboringssl");
                        }
                        m148515a("ByteVC1_dec");
                        m148515a("ttffmpeg");
                    }
                    if (C86277r.m148508a(29)) {
                        if (!m148515a("ttmplayerbeta")) {
                            if (!m148515a("ttmplayer")) {
                                z4 = true;
                            }
                            f192736g = z4;
                            MethodCollector.m26664o(5229);
                            return;
                        }
                    } else if (!m148515a("ttmplayer")) {
                        f192736g = true;
                        MethodCollector.m26664o(5229);
                        return;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (!z) {
                        arrayList.add("c++_shared");
                        if (!C86277r.m148508a(28)) {
                            arrayList.add("ttcrypto");
                            arrayList.add("ttboringssl");
                        }
                        arrayList.add("ByteVC1_dec");
                        arrayList.add("ttffmpeg");
                    }
                    if (C86277r.m148508a(29)) {
                        if (!m148516a(arrayList, false)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        f192736g = z2;
                        if (!z2) {
                            arrayList.clear();
                            arrayList.add("ttmplayerbeta");
                            if (!m148516a(arrayList, false)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            f192736g = z3;
                            if (z3) {
                                arrayList.clear();
                                arrayList.add("ttmplayer");
                                if (!m148516a(arrayList, false)) {
                                    z4 = true;
                                }
                                f192736g = z4;
                                MethodCollector.m26664o(5229);
                                return;
                            }
                        }
                    } else {
                        arrayList.add("ttmplayer");
                        if (!m148516a(arrayList, false)) {
                            z4 = true;
                        }
                        f192736g = z4;
                    }
                }
                MethodCollector.m26664o(5229);
            } catch (Throwable th) {
                f192736g = true;
                f192731b = "load default library error." + th.toString();
                MethodCollector.m26664o(5229);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[SYNTHETIC, Splitter:B:30:0x00d8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m148515a(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.C86282t.m148515a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m148516a(List<String> list, boolean z) {
        boolean z2 = f192735f;
        if ((!z) && z2) {
            return z2;
        }
        AbstractC86247g gVar = f192732c;
        if (gVar != null) {
            try {
                f192735f = gVar.mo136716a(list);
            } catch (Throwable th) {
                f192731b = th.getMessage();
            }
        } else {
            f192735f = f192734e.mo136716a(list);
        }
        return f192735f;
    }
}
