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

public class GraphicMMTPlugin extends C2570a {

    /* renamed from: d */
    private static GraphicMMTPlugin f7751d;

    /* renamed from: e */
    private static String f7752e = "gmt";

    /* renamed from: h */
    private static String f7753h = "_usage";

    /* renamed from: i */
    private static String f7754i = "_profile";

    /* renamed from: f */
    private String f7755f;

    /* renamed from: g */
    private String f7756g;

    private static native void gmt_native_dump(String str, String str2);

    private static native void gmt_native_setConfigParams(int i);

    private static native void gmt_native_setMemoryThreshold(long j, long j2);

    private static native void gmt_native_start();

    private static native void gmt_native_stop();

    private GraphicMMTPlugin() {
    }

    static {
        Covode.recordClassIndex(2961);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("mmt", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "mmt");
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7046a() {
        MethodCollector.m26663i(7015);
        super.mo7046a();
        ByteHook.m7797a();
        gmt_native_start();
        this.f7736c = true;
        MethodCollector.m26664o(7015);
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: b */
    public final void mo7050b() {
        MethodCollector.m26663i(7320);
        super.mo7050b();
        gmt_native_dump(this.f7755f, this.f7756g);
        MethodCollector.m26664o(7320);
    }

    /* renamed from: c */
    public static GraphicMMTPlugin m7513c() {
        MethodCollector.m26663i(7013);
        if (f7751d == null) {
            synchronized (GraphicMMTPlugin.class) {
                try {
                    f7751d = new GraphicMMTPlugin();
                } catch (Throwable th) {
                    MethodCollector.m26664o(7013);
                    throw th;
                }
            }
        }
        GraphicMMTPlugin graphicMMTPlugin = f7751d;
        MethodCollector.m26664o(7013);
        return graphicMMTPlugin;
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7047a(int i) {
        MethodCollector.m26663i(7016);
        super.mo7047a(i);
        gmt_native_setConfigParams(i);
        MethodCollector.m26664o(7016);
    }

    /* renamed from: a */
    public final void mo7054a(Context context) {
        String str = this.f7755f + File.separator + this.f7756g + f7753h;
        String str2 = this.f7755f + File.separator + this.f7756g + f7754i;
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists() && file2.exists()) {
            new Thread(new Runnable(str2, str, context) {
                /* class com.bytedance.ammt.mmt.C2572c.RunnableC25731 */

                /* renamed from: a */
                final /* synthetic */ String f7745a;

                /* renamed from: b */
                final /* synthetic */ String f7746b;

                /* renamed from: c */
                final /* synthetic */ Context f7747c;

                static {
                    Covode.recordClassIndex(2958);
                }

                /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[SYNTHETIC, Splitter:B:41:0x00c3] */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
                /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 283
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ammt.mmt.C2572c.RunnableC25731.run():void");
                }

                {
                    this.f7745a = r1;
                    this.f7746b = r2;
                    this.f7747c = r3;
                }
            }).start();
        }
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7048a(long j, long j2) {
        MethodCollector.m26663i(7172);
        super.mo7048a(j, j2);
        gmt_native_setMemoryThreshold(j, j2);
        MethodCollector.m26664o(7172);
    }

    @Override // com.bytedance.ammt.mmt.p123a.C2570a
    /* renamed from: a */
    public final void mo7049a(String str, String str2) {
        super.mo7049a(str, str2);
        this.f7755f = str + File.separator + f7752e;
        this.f7756g = str2;
    }
}
