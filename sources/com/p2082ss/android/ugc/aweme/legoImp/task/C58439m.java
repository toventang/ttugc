package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.p2144h.C29913a;
import com.p2082ss.android.p2144h.C29921d;
import com.p2082ss.android.ugc.aweme.app.C33802l;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.m */
final /* synthetic */ class C58439m implements AbstractC88433f {

    /* renamed from: a */
    private final KidsModeLegacyTask f133056a;

    static {
        Covode.recordClassIndex(68695);
    }

    C58439m(KidsModeLegacyTask kidsModeLegacyTask) {
        this.f133056a = kidsModeLegacyTask;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        KidsModeLegacyTask kidsModeLegacyTask = this.f133056a;
        String str = (String) obj;
        if (!TextUtils.equals(kidsModeLegacyTask.f132885a, str)) {
            kidsModeLegacyTask.f132885a = str;
            if (!TextUtils.isEmpty(kidsModeLegacyTask.f132885a)) {
                C29913a aVar = C29921d.C29923a.f71406a.f71403g;
                if (aVar != null) {
                    aVar.f71355e = kidsModeLegacyTask.f132885a;
                    C29921d.C29923a.f71406a.mo52230a(aVar);
                }
                String str2 = kidsModeLegacyTask.f132885a;
                String installId = AppLog.getInstallId();
                if (installId == null) {
                    installId = "";
                }
                SecApiImpl.m119993a().updateDeviceIdAndInstallId(str2, installId);
                if (C33802l.m69153a() != ((int) C17867d.m33084e())) {
                    SecApiImpl.m119993a().reportData("install");
                }
                new C58221f.C58224c().mo95703b((AbstractC58264w) new KidsModeLegacyTask.DeviceIdChangeTask(kidsModeLegacyTask, (byte) 0)).mo95706a();
            }
        }
    }
}
