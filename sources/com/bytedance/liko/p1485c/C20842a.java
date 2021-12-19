package com.bytedance.liko.p1485c;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.liko.p1485c.p1486a.C20843a;
import java.io.File;
import java.util.List;
import p4600h.p4601a.C89086z;

/* renamed from: com.bytedance.liko.c.a */
public final class C20842a {

    /* renamed from: a */
    public static final C20842a f49297a = new C20842a();

    private C20842a() {
    }

    static {
        Covode.recordClassIndex(24418);
    }

    /* renamed from: a */
    public static final List<String> m39191a() {
        try {
            return C20843a.m39192a(new File("/proc/" + Process.myPid() + "/fd"));
        } catch (Throwable unused) {
            return C89086z.INSTANCE;
        }
    }
}
