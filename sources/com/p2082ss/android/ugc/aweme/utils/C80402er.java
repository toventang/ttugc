package com.p2082ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1585c.AbstractC21721e;
import com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.C58079a;
import com.p2082ss.android.ugc.aweme.settings.AbstractC68755u;

/* renamed from: com.ss.android.ugc.aweme.utils.er */
public final class C80402er extends AbstractC21721e {
    static {
        Covode.recordClassIndex(93670);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "LooperProtectEnhancePlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: c */
    public final boolean mo35373c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.p1574a.AbstractC21692h
    /* renamed from: a */
    public final boolean mo35345a(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        AbstractC68755u.C68757b bVar;
        if (th != null && (stackTrace = th.getStackTrace()) != null && (bVar = (AbstractC68755u.C68757b) SettingsManager.m29616a().mo25397a("looper_protect_enhance", AbstractC68755u.C68757b.class, AbstractC68755u.f153795a)) != null && bVar.f153802a != null && !bVar.f153802a.isEmpty()) {
            for (AbstractC68755u.C68756a aVar : bVar.f153802a) {
                if (!TextUtils.isEmpty(aVar.f153796a) && !TextUtils.isEmpty(aVar.f153797b) && !TextUtils.isEmpty(aVar.f153798c) && !TextUtils.isEmpty(aVar.f153799d)) {
                    if ((aVar.f153800e == null || aVar.f153800e.contains(Build.MANUFACTURER + " " + Build.MODEL)) && (aVar.f153801f == null || aVar.f153801f.contains(Integer.valueOf(Build.VERSION.SDK_INT)))) {
                        if (!(th.getClass().getName().equals(aVar.f153796a) && th.getMessage() != null && th.getMessage().contains(aVar.f153797b))) {
                            break;
                        }
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (aVar.f153798c.equals(stackTraceElement.getClassName()) && aVar.f153799d.equals(stackTraceElement.getMethodName())) {
                                C58079a.f132320a.mo95583a(new LooperProtectEnhanceThrowable("LOOPER_PROTECT_ENHANCE_SUCCESS", th), "LOOPER_PROTECT_ENHANCE_SUCCESS");
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
