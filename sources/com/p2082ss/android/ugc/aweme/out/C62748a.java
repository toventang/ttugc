package com.p2082ss.android.ugc.aweme.out;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* renamed from: com.ss.android.ugc.aweme.out.a */
public final class C62748a implements IAbnormalExitLogService {

    /* renamed from: a */
    public static final C62748a f142234a = new C62748a();

    private C62748a() {
    }

    static {
        Covode.recordClassIndex(73570);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logAppAbnormalExit() {
        C72479d.m127866a(C72477c.f162474a).mo114744f();
        C72479d.m127867b(C72477c.f162474a).mo114744f();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogShow() {
        C39162r.m79460a("continue_popup_show", new C84425b().mo129406a("last_status", C72479d.m127867b(C72477c.f162474a).mo114740b()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogClick(boolean z) {
        String str;
        C84425b a = new C84425b().mo129406a("last_status", C72479d.m127867b(C72477c.f162474a).mo114740b());
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        C39162r.m79460a("continue_popup_click", a.mo129406a("click_position", str).f188764a);
    }
}
