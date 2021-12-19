package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3932e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.broadcast.p */
public enum EnumC3338p {
    INST;
    

    /* renamed from: d */
    private static final String f9513d = C3966y.m9657a((int) R.string.gqy);

    /* renamed from: e */
    private static final String f9514e = C3966y.m9657a((int) R.string.gqx);

    /* renamed from: f */
    private static final String f9515f = C3966y.m9657a((int) R.string.gr1);

    /* renamed from: g */
    private static final String f9516g = C3966y.m9657a((int) R.string.gqv);

    /* renamed from: h */
    private static final String f9517h = C3966y.m9657a((int) R.string.gqu);

    /* renamed from: i */
    private static final String f9518i = C3966y.m9657a((int) R.string.gr0);

    /* renamed from: j */
    private static final String f9519j = C3966y.m9657a((int) R.string.gr3);

    /* renamed from: k */
    private static final String f9520k = C3966y.m9657a((int) R.string.gr4);

    /* renamed from: l */
    private static final String[] f9521l;

    /* renamed from: m */
    private static final String[] f9522m = C3966y.m9671f(R.array.az);

    /* renamed from: n */
    private static final String[] f9523n = C3966y.m9671f(R.array.b0);

    /* renamed from: o */
    private static String f9524o = (C3966y.m9669e().getDir(f9513d, 0).getAbsolutePath() + File.separator);

    /* renamed from: a */
    final Map<String, Object> f9526a = new HashMap();

    /* renamed from: b */
    String f9527b;

    /* renamed from: c */
    boolean f9528c = false;
    public C1213t<Boolean> isLoadedRes = new C1213t<>();

    public final String getLastTimeFailedReason() {
        return this.f9527b;
    }

    public final String getBeautyComposerFilePath() {
        return f9524o + f9517h;
    }

    public final String getBeautyFilePath() {
        String str = f9524o + f9516g;
        if (C3932e.m9578a(str)) {
            return str;
        }
        return "";
    }

    public final String getFaceReshapeFilePath() {
        return f9524o + f9518i;
    }

    public final String getFilterFilePath() {
        return f9524o + f9515f;
    }

    public final String getLiveComposerFilePath() {
        return f9524o + f9514e;
    }

    public final String getModelFilePath() {
        if (((IHostPlugin) C6193a.m13435a(IHostPlugin.class)).getHostModeFilePath() != null) {
            return ((IHostPlugin) C6193a.m13435a(IHostPlugin.class)).getHostModeFilePath();
        }
        return f9524o;
    }

    public final String getROIResPath() {
        return f9524o + f9520k;
    }

    public final String getReshapeComposerFilePath() {
        return f9524o + f9519j;
    }

    public final boolean isLoadedRes() {
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.20".equals(AbstractC6804a.f17060k.mo13066a())));
        }
        return this.isLoadedRes.getValue().booleanValue();
    }

    static {
        Covode.recordClassIndex(3820);
        String[] f = C3966y.m9671f(R.array.ay);
        f9521l = new String[f.length];
        for (int i = 0; i < f.length; i++) {
            f9521l[i] = f[i] + ".zip";
        }
    }

    public final synchronized void loadResources() {
        MethodCollector.m26663i(7417);
        C3854a.m9453a(3, "LiveCameraResManager", "call loadResources");
        if (this.f9528c) {
            C3854a.m9453a(3, "LiveCameraResManager", "resources is loading, return");
            MethodCollector.m26664o(7417);
        } else if ("0.0.20".equals(AbstractC6804a.f17060k.mo13066a())) {
            C3854a.m9453a(3, "LiveCameraResManager", "resources is already loaded, return");
            if (this.isLoadedRes.getValue() == null || !this.isLoadedRes.getValue().booleanValue()) {
                AbstractC88979t.m154310b((Object) 1).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C3653q(this));
            }
            MethodCollector.m26664o(7417);
        } else {
            this.f9528c = true;
            AbstractC88924h.m154136a((Callable) new CallableC3654r(this)).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143191a(new C3655s(this), new C3709t(this), new C3710u(this));
            MethodCollector.m26664o(7417);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo8678a() {
        C3854a.m9453a(3, "LiveCameraResManager", "start load resources");
        AssetManager assets = C3966y.m9669e().getAssets();
        String[] strArr = f9521l;
        boolean z = true;
        for (String str : strArr) {
            try {
                m8807a(assets, str, f9524o + File.separator + str);
            } catch (IOException e) {
                this.f9526a.put("copy_res_file_error", e.toString());
                e.printStackTrace();
                C3854a.m9458a("LiveCameraResManager", e);
                z = false;
            }
        }
        String[] strArr2 = f9522m;
        for (String str2 : strArr2) {
            try {
                m8808b(assets, str2, f9524o + File.separator + str2);
            } catch (IOException e2) {
                this.f9526a.put("copy_res_folder_error", e2.toString());
                e2.printStackTrace();
                C3854a.m9458a("LiveCameraResManager", e2);
                z = false;
            }
        }
        String[] strArr3 = f9523n;
        for (String str3 : strArr3) {
            try {
                m8807a(assets, str3, f9524o + File.separator + str3);
            } catch (IOException e3) {
                this.f9526a.put("copy_res_file_error", e3.toString());
                e3.printStackTrace();
                C3854a.m9458a("LiveCameraResManager", e3);
                z = false;
            }
        }
        String[] strArr4 = f9521l;
        int length = strArr4.length;
        for (int i = 0; i < length; i++) {
            try {
                String str4 = f9524o + strArr4[i];
                C3932e.m9575a(str4, f9524o);
                C3854a.m9453a(3, "LiveCameraResManager", "1 file unzipped: ".concat(String.valueOf(str4)));
            } catch (IOException e4) {
                this.f9526a.put("unzip_res_file_error", e4.toString());
                e4.printStackTrace();
                C3854a.m9458a("LiveCameraResManager", e4);
                z = false;
            }
        }
        C3854a.m9453a(3, "LiveCameraResManager", "finish load resources");
        return z;
    }

    private EnumC3338p(String str) {
    }

    public final Object getResourceFinder(Context context) {
        return ((IHostContext) C6193a.m13435a(IHostContext.class)).getResourceFinder(context, getModelFilePath());
    }

    /* renamed from: com_bytedance_android_live_broadcast_LiveCameraResManager_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m8809xe12b5cc(File file) {
        MethodCollector.m26663i(7761);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7761);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7761);
        return delete;
    }

    /* renamed from: b */
    private void m8808b(AssetManager assetManager, String str, String str2) {
        MethodCollector.m26663i(7904);
        String[] list = assetManager.list(str);
        if (list.length > 0) {
            new File(str2).mkdirs();
            for (String str3 : list) {
                m8808b(assetManager, str + File.separator + str3, str2 + File.separator + str3);
            }
            MethodCollector.m26664o(7904);
            return;
        }
        m8807a(assetManager, str, str2);
        MethodCollector.m26664o(7904);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m8807a(android.content.res.AssetManager r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.EnumC3338p.m8807a(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }
}
