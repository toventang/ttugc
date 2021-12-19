package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ammt.mmt.C2569a;
import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.hyper.Hyper;
import com.p2082ss.android.p2143g.C29911a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58243m;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2400bp.C34896a;
import com.p2082ss.android.ugc.aweme.p2400bp.C34899b;
import com.p2082ss.android.ugc.aweme.p2400bp.C34900c;
import com.p2082ss.android.ugc.aweme.p2400bp.C34901d;
import com.p2082ss.android.ugc.aweme.p2400bp.C34906g;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask */
public class MemoryMonitorTask implements AbstractC58264w {

    /* renamed from: a */
    EnumC58367a f132901a = EnumC58367a.LOCALTEST_MODE;

    static {
        Covode.recordClassIndex(68533);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        if (!C58243m.m105179b()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask$a */
    enum EnumC58367a {
        ONLINE_MODE,
        LOCALTEST_MODE;

        static {
            Covode.recordClassIndex(68534);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Context a;
        Context a2;
        if (TextUtils.equals(C17867d.f42595s, "local_test")) {
            this.f132901a = EnumC58367a.LOCALTEST_MODE;
        } else {
            this.f132901a = EnumC58367a.ONLINE_MODE;
        }
        if (this.f132901a == EnumC58367a.ONLINE_MODE) {
            if (!C34906g.m71289a()) {
                if (C34896a.m71280a()) {
                    C34896a.C34897a aVar = null;
                    try {
                        aVar = (C34896a.C34897a) SettingsManager.m29616a().mo25397a("gmt_settings", C34896a.C34897a.class, C34896a.AbstractC34898b.f82349a);
                    } catch (Throwable unused) {
                    }
                    if (aVar != null && aVar.f82345a) {
                        int i = aVar.f82346b;
                        int i2 = aVar.f82347c;
                        int i3 = aVar.f82348d;
                        GraphicMMTPlugin c = GraphicMMTPlugin.m7513c();
                        c.mo7047a(i);
                        c.mo7049a(C2569a.m7498b(context), "graphic");
                        c.mo7048a((long) i2, (long) i3);
                        c.mo7046a();
                        c.mo7054a(context);
                        Npth.registerCrashCallback(C34899b.f82350a, CrashType.JAVA);
                        Npth.registerCrashCallback(C34900c.f82351a, CrashType.NATIVE);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (this.f132901a == EnumC58367a.LOCALTEST_MODE) {
            if (C34906g.m71289a() && (a2 = C17867d.m33078a()) != null) {
                File file = new File(C29911a.m60288b().getAbsolutePath() + File.separator + "NativeMMT.ini");
                SharedPreferences a3 = C34822d.m71158a(a2, "LeakDetectorSp", 0);
                if ((a3.getBoolean("open_leak_detector_on_local_test", false) && a3.getBoolean("native_memory_monitor_status", true)) || file.exists()) {
                    C34906g.m71288a(context);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23 && (a = C17867d.m33078a()) != null && new File(C29911a.m60288b().getAbsolutePath() + File.separator + "VEhookLibNames.ini").exists() && a.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                try {
                    String[] a4 = C34901d.m71282a();
                    String str = C29911a.m60288b().getAbsolutePath() + File.separator + "VEhookTempFiles";
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        file2.mkdir();
                    }
                    Hyper.init(a4, str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (C34896a.m71280a() && new File(C29911a.m60288b().getAbsolutePath() + File.separator + C34896a.f82343a).exists()) {
                C2569a.m7496a(context);
                int b = C34896a.m71281b();
                GraphicMMTPlugin c2 = GraphicMMTPlugin.m7513c();
                c2.mo7049a(C2569a.m7498b(context), "graphic");
                c2.mo7047a(b);
                c2.mo7048a(419430400, 1048576);
                c2.mo7046a();
                c2.mo7054a(context);
            }
        }
    }
}
