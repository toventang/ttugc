package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.util.c */
public final class C14045c {

    /* renamed from: a */
    private static final HashMap<String, C14046a> f34218a = new HashMap<>();

    static {
        Covode.recordClassIndex(16112);
    }

    /* renamed from: com.bytedance.crash.util.c$a */
    public static class C14046a {

        /* renamed from: a */
        File f34219a;

        /* renamed from: b */
        public int f34220b;

        /* renamed from: c */
        int f34221c;

        /* renamed from: d */
        int f34222d;

        /* renamed from: e */
        public int f34223e = 1;

        static {
            Covode.recordClassIndex(16113);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo22583a() {
            try {
                C14056j.m25566a(this.f34219a, this.f34220b + "\n" + this.f34221c + "\n" + this.f34222d + "\n" + this.f34223e, false);
            } catch (IOException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo22584a(int i) {
            this.f34221c = 0;
            this.f34222d = 0;
            this.f34223e = 1;
            this.f34220b = 2;
        }

        C14046a(File file) {
            this.f34219a = file;
            try {
                if (file.exists()) {
                    JSONArray a = C14056j.m25562a(file, -1);
                    this.f34220b = Integer.parseInt(a.optString(0));
                    this.f34221c = Integer.parseInt(a.optString(1));
                    this.f34222d = Integer.parseInt(a.optString(2));
                    this.f34223e = Integer.parseInt(a.optString(3));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static C14046a m25525a(String str) {
        HashMap<String, C14046a> hashMap = f34218a;
        C14046a aVar = hashMap.get(str);
        if (aVar != null) {
            return aVar;
        }
        C14046a aVar2 = new C14046a(new File(C14069r.m25627c(C13933m.f33936a), str));
        hashMap.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public static void m25526a(boolean z, String str, int i) {
        C14046a a = m25525a(str);
        if (2 != a.f34220b) {
            a.mo22584a(2);
        }
        if (a.f34223e == 1) {
            if (z) {
                a.f34221c++;
                if (i <= a.f34221c) {
                    a.f34222d = 0;
                }
            } else {
                a.f34222d++;
                if (i <= a.f34222d) {
                    a.f34221c = 0;
                    a.f34223e = 0;
                }
            }
            a.mo22583a();
        }
    }
}
