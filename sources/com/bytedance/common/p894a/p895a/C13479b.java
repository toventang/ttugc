package com.bytedance.common.p894a.p895a;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.common.p894a.p898d.C13495b;
import com.bytedance.common.p894a.p898d.C13497d;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.common.a.a.b */
public final class C13479b {

    /* renamed from: a */
    static File f32824a;

    /* renamed from: b */
    List<String> f32825b;

    /* renamed from: c */
    File f32826c;

    static {
        Covode.recordClassIndex(15487);
    }

    /* renamed from: com.bytedance.common.a.a.b$a */
    public static class C13480a {

        /* renamed from: a */
        List<String> f32827a = new ArrayList();

        /* renamed from: b */
        File f32828b;

        static {
            Covode.recordClassIndex(15488);
        }

        /* renamed from: a */
        public final C13479b mo21756a() {
            C13479b bVar = new C13479b();
            bVar.f32825b = this.f32827a;
            bVar.f32826c = this.f32828b;
            return bVar;
        }

        /* renamed from: a */
        public final C13480a mo21755a(String str) {
            this.f32827a.add(str);
            return this;
        }
    }

    /* renamed from: a */
    public final int mo21754a() {
        File file;
        if (f32824a == null) {
            if (C13497d.m24275a() || C13497d.m24276b() || C13497d.m24277c()) {
                file = C13495b.m24271b("cvt");
            } else {
                file = null;
            }
            f32824a = file;
        }
        File file2 = f32824a;
        int i = -1;
        if (file2 != null && file2.exists()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(f32824a.getAbsolutePath());
            arrayList.addAll(this.f32825b);
            try {
                SystemClock.uptimeMillis();
                ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
                if (C13497d.m24276b()) {
                    processBuilder.environment().put("LD_LIBRARY_PATH", "/apex/com.android.runtime/lib");
                }
                if (C13497d.m24277c()) {
                    processBuilder.environment().put("LD_LIBRARY_PATH", "/apex/com.android.art/lib");
                }
                if (this.f32826c != null && Build.VERSION.SDK_INT >= 26) {
                    processBuilder.redirectOutput(this.f32826c);
                }
                i = processBuilder.start().waitFor();
                SystemClock.uptimeMillis();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Exception unused) {
            }
        }
        return i;
    }
}
