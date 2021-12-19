package com.p2082ss.android.ugc.aweme.app.launch.p2334a;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61594p;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.launch.a.a */
public final class C33814a {

    /* renamed from: a */
    public static volatile boolean f80061a = true;

    static {
        Covode.recordClassIndex(40714);
    }

    /* renamed from: a */
    public static final void m69181a(boolean z, String str) {
        C89219l.m154721d(str, "");
        if (z || !C17873f.f42636l) {
            String a = C18205a.m33878a();
            String installId = AppLog.getInstallId();
            if (C13627m.m24498a(a) || C13627m.m24498a(installId)) {
                String str2 = "deviceId:" + a + " or iid:" + installId + " is empty!";
                C61594p.m111544a(str, "did_or_iid_is_empty", str2);
                C51423a.m95791b(6, "ws", str2);
                return;
            }
            C61595q.f139777f.mo99332a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a.a$a */
    public static final class C33815a implements IAccountService.AbstractC31272b {

        /* renamed from: a */
        public static final C33815a f80062a = new C33815a();

        static {
            Covode.recordClassIndex(40715);
        }

        C33815a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
        public final void onAccountResult(int i, boolean z, int i2, User user) {
            if (!z) {
                return;
            }
            if (i == 1 || i == 2) {
                C33814a.m69181a(true, "account_change");
            }
        }
    }
}
