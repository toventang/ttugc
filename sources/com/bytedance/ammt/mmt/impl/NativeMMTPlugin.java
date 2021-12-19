package com.bytedance.ammt.mmt.impl;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ammt.mmt.p123a.C2570a;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.io.File;

public class NativeMMTPlugin extends C2570a {

    /* renamed from: d */
    private static volatile NativeMMTPlugin f7757d;

    /* renamed from: e */
    private static String f7758e = "nmt";

    /* renamed from: f */
    private String f7759f;

    /* renamed from: g */
    private String f7760g;

    private static native void native_dump(String str, String str2);

    private static native void native_setConfigParams(int i);

    private static native void native_setMemoryThreshold(long j, long j2);

    private static native void native_start();

    private static native void native_stop();

    private NativeMMTPlugin() {
    }

    static {
        Covode.recordClassIndex(2962);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("mmt", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "mmt");
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7046a() {
        MethodCollector.m26663i(8426);
        super.mo7046a();
        ByteHook.m7797a();
        native_start();
        this.f7736c = true;
        MethodCollector.m26664o(8426);
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: b */
    public final void mo7050b() {
        MethodCollector.m26663i(8732);
        super.mo7050b();
        native_dump(this.f7759f, this.f7760g);
        MethodCollector.m26664o(8732);
    }

    /* renamed from: c */
    public static NativeMMTPlugin m7520c() {
        MethodCollector.m26663i(8275);
        if (f7757d == null) {
            synchronized (NativeMMTPlugin.class) {
                try {
                    f7757d = new NativeMMTPlugin();
                } catch (Throwable th) {
                    MethodCollector.m26664o(8275);
                    throw th;
                }
            }
        }
        NativeMMTPlugin nativeMMTPlugin = f7757d;
        MethodCollector.m26664o(8275);
        return nativeMMTPlugin;
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7047a(int i) {
        super.mo7047a(i);
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7048a(long j, long j2) {
        MethodCollector.m26663i(8584);
        super.mo7048a(j, j2);
        native_setMemoryThreshold(j, j2);
        MethodCollector.m26664o(8584);
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7049a(String str, String str2) {
        super.mo7049a(str, str2);
        this.f7759f = str + File.separator + f7758e;
        this.f7760g = str2;
    }
}
