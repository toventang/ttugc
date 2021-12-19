package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.p2144h.C29913a;
import com.p2082ss.android.p2144h.C29921d;
import com.p2082ss.android.ugc.aweme.app.C33802l;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.p */
final /* synthetic */ class C58443p implements AbstractC88433f {

    /* renamed from: a */
    private final LegacyTask f133060a;

    static {
        Covode.recordClassIndex(68704);
    }

    C58443p(LegacyTask legacyTask) {
        this.f133060a = legacyTask;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LegacyTask legacyTask = this.f133060a;
        String str = (String) obj;
        if (!TextUtils.equals(legacyTask.f132898c, str)) {
            legacyTask.f132898c = str;
            if (!TextUtils.isEmpty(legacyTask.f132898c)) {
                String serverDeviceId = AppLog.getServerDeviceId();
                if (legacyTask.f132897b) {
                    FirebaseAnalytics instance = FirebaseAnalytics.getInstance(legacyTask.f132896a);
                    if (!TextUtils.isEmpty(serverDeviceId)) {
                        instance.mo46310a(serverDeviceId);
                    }
                }
                C29913a aVar = C29921d.C29923a.f71406a.f71403g;
                if (aVar != null) {
                    aVar.f71355e = legacyTask.f132898c;
                    C29921d.C29923a.f71406a.mo52230a(aVar);
                }
                String str2 = legacyTask.f132898c;
                String installId = AppLog.getInstallId();
                if (installId == null) {
                    installId = "";
                }
                SecApiImpl.m119993a().updateDeviceIdAndInstallId(str2, installId);
                if (C33802l.m69153a() != ((int) C17867d.m33084e())) {
                    SecApiImpl.m119993a().reportData("install");
                }
                new C58221f.C58224c().mo95703b((AbstractC58264w) new LegacyTask.DeviceIdChangeTask(legacyTask, (byte) 0)).mo95706a();
            }
        }
    }
}
