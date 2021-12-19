package com.p2082ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Build;
import android.os.FileObserver;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1007g.C14853c;
import com.p2082ss.android.newmedia.p2163a.C30122a;
import com.p2082ss.android.ugc.aweme.experiment.C46962g;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58262u;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58263v;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService */
public class AOTOptimizeService implements AbstractC58262u {

    /* renamed from: b */
    public static boolean f132753b;

    /* renamed from: a */
    public FileObserverC58294a f132754a;

    static {
        Covode.recordClassIndex(68373);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58263v.m105203a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "service_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58262u
    /* renamed from: b */
    public final EnumC58151ae mo95709b() {
        if (!m105317c() || !C14853c.f36267d || C46962g.f109445c.getValue().intValue() != C46962g.f109444b) {
            return EnumC58151ae.BOOT_FINISH;
        }
        return EnumC58151ae.APP_BACKGROUND;
    }

    /* renamed from: c */
    static boolean m105317c() {
        if ((!C49907s.m93685a().booleanValue() || !C46962g.m90246a()) && Build.VERSION.SDK_INT >= 24 && m105318d() && !f132753b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m105318d() {
        Context a = C17867d.m33078a();
        if (!C36145b.m73641b().mo63260a(a, "aot_release_build_version").equals(C30122a.m60926a(a).mo53499a("release_build", "default_version"))) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n, com.p2082ss.android.ugc.aweme.lego.AbstractC58262u
    /* renamed from: a */
    public final void mo28600a(Context context) {
        mo95710b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58262u
    /* renamed from: b */
    public final void mo95710b(Context context) {
        if (m105317c()) {
            C51423a.m95787a("startWatchingForOptimize");
            if (this.f132754a == null) {
                this.f132754a = new FileObserverC58294a(context, C1764a.m5928a("%s/%s/%s", new Object[]{"/data/misc/profiles/cur/0", context.getPackageName(), "primary.prof"}));
            }
            this.f132754a.startWatching();
        }
    }

    /* renamed from: c */
    static void m105316c(Context context) {
        try {
            Context a = C17867d.m33078a();
            C36145b.m73641b().mo63265a(a, "aot_release_build_version", C30122a.m60926a(a).mo53499a("release_build", "default_version"));
            f132753b = true;
            Process exec = Runtime.getRuntime().exec("cmd package compile -m everything-profile -f " + context.getPackageName());
            try {
                exec.waitFor();
                exec.exitValue();
            } catch (InterruptedException unused) {
                System.err.println("execCommand InterruptedException");
            }
        } catch (IOException unused2) {
            System.err.println("execOptCommand IOException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService$a */
    class FileObserverC58294a extends FileObserver {

        /* renamed from: a */
        Context f132755a;

        static {
            Covode.recordClassIndex(68374);
        }

        public final void onEvent(int i, String str) {
            int intValue;
            if (i == 2 && !AOTOptimizeService.f132753b) {
                if (AOTOptimizeService.this.f132754a != null) {
                    AOTOptimizeService.this.f132754a.stopWatching();
                    AOTOptimizeService.this.f132754a = null;
                }
                AOTOptimizeService aOTOptimizeService = AOTOptimizeService.this;
                Context context = this.f132755a;
                if (!AOTOptimizeService.m105317c()) {
                    return;
                }
                if (C49907s.m93685a().booleanValue() || !C14853c.f36267d || C46962g.f109445c.getValue().intValue() == C46962g.f109444b || (intValue = C46962g.f109445c.getValue().intValue()) == 0) {
                    AOTOptimizeService.m105316c(context);
                    return;
                }
                AOTOptimizeService.f132753b = true;
                C58254p.f132679a.postDelayed(new RunnableC58298a(aOTOptimizeService, context), (long) intValue);
            }
        }

        FileObserverC58294a(Context context, String str) {
            super(str);
            this.f132755a = context;
        }
    }
}
