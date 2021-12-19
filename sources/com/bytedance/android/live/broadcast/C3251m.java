package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p558h.EnumC8917a;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.avframework.utils.EarlyAVLog;
import com.p2082ss.avframework.utils.LibraryLoader;
import java.util.Arrays;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.broadcast.m */
public class C3251m {

    /* renamed from: b */
    public static final String[] f9302b = {"lens", "ttquic", "avframework", "ies_render", "bytertc"};

    /* renamed from: c */
    private static C3251m f9303c;

    /* renamed from: e */
    private static final String[] f9304e = {"c++_shared", "yuv", "ttffmpeg", "audioeffect", "effect"};

    /* renamed from: a */
    public Context f9305a = C3966y.m9669e();

    /* renamed from: d */
    private boolean f9306d;

    private C3251m() {
    }

    static {
        Covode.recordClassIndex(3732);
    }

    /* renamed from: a */
    public static C3251m m8741a() {
        MethodCollector.m26663i(6803);
        if (f9303c == null) {
            synchronized (C3251m.class) {
                try {
                    if (f9303c == null) {
                        f9303c = new C3251m();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6803);
                    throw th;
                }
            }
        }
        C3251m mVar = f9303c;
        MethodCollector.m26664o(6803);
        return mVar;
    }

    /* renamed from: b */
    public final void mo8583b() {
        try {
            C3854a.m9453a(6, "LiveBroadcastContext", "LibraryLoader.setupLibraryLoader");
            LibraryLoader.setupLibraryLoader(new LibraryLoader.Loader() {
                /* class com.bytedance.android.live.broadcast.C3251m.C32521 */

                static {
                    Covode.recordClassIndex(3733);
                }

                @Override // com.p2082ss.avframework.utils.LibraryLoader.Loader
                public final boolean loadLibraryFromPath(String str) {
                    return true;
                }

                @Override // com.p2082ss.avframework.utils.LibraryLoader.Loader
                public final boolean loadLibrary(String str) {
                    boolean loadLibrary;
                    C3854a.m9453a(6, "LiveBroadcastContext", "start sdk load library name:".concat(String.valueOf(str)));
                    if (Arrays.asList(C3251m.f9302b).contains(str)) {
                        loadLibrary = ((IHostPlugin) C6193a.m13435a(IHostPlugin.class)).loadLibrary(0, C3251m.this.f9305a, EnumC8917a.LiveResource.getPackageName(), str, null);
                    } else {
                        loadLibrary = ((IHostPlugin) C6193a.m13435a(IHostPlugin.class)).loadLibrary(2, C3251m.this.f9305a, "", str, null);
                    }
                    if (loadLibrary) {
                        return loadLibrary;
                    }
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Librarian.m38965b(str, false, null);
                        C58032m.m104852a(uptimeMillis, str);
                        loadLibrary = true;
                        return true;
                    } catch (NullPointerException | SecurityException | UnsatisfiedLinkError unused) {
                        C3854a.m9453a(6, "LiveBroadcastContext", "Fail to load so although retry: ".concat(String.valueOf(str)));
                        return loadLibrary;
                    }
                }
            });
            C3854a.m9453a(6, "LiveBroadcastContext", "EarlyAVLog.setEarlyLogPrint");
            EarlyAVLog.setEarlyLogPrint(C3275n.f9389a);
        } catch (Throwable th) {
            C3854a.m9458a("LiveBroadcastContext", th);
        }
        if (!this.f9306d) {
            EnumC8917a.LiveResource.preload();
            m8742c();
            AbstractC88979t.m154310b((Object) 1);
            try {
                EnumC8917a.LiveResource.load(this.f9305a, false);
            } catch (Throwable unused) {
            }
            this.f9306d = true;
        }
    }

    /* renamed from: c */
    private void m8742c() {
        EnumC3338p.INST.loadResources();
        String[] strArr = {"yuv", "NailSLAM_jni", "ttffmpeg", "c++_shared", "audioeffect", "effect", "avframework", "ies_render"};
        IHostPlugin iHostPlugin = (IHostPlugin) C6193a.m13435a(IHostPlugin.class);
        int i = 0;
        do {
            try {
                C3854a.m9453a(6, "LiveBroadcastContext", "start load library:" + strArr[i]);
                iHostPlugin.loadLibrary(2, this.f9305a, iHostPlugin.getHostPackageName(), strArr[i], getClass().getClassLoader());
            } catch (Throwable unused) {
            }
            i++;
        } while (i < 8);
    }
}
