package com.p2082ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46993gt;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.base.component.d */
final /* synthetic */ class C34541d implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    private final EventActivityComponent f81558a;

    /* renamed from: b */
    private final long f81559b;

    static {
        Covode.recordClassIndex(41503);
    }

    C34541d(EventActivityComponent eventActivityComponent, long j) {
        this.f81558a = eventActivityComponent;
        this.f81559b = j;
    }

    public final void onDismiss() {
        long j = this.f81559b;
        User curUser = C31575b.m65865g().getCurUser();
        if ((!C46993gt.m90271a() || (curUser != null && curUser.nicknameUpdateReminder())) && !C39223a.m79589c().mo68606a(4)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > j) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(currentTimeMillis);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                if (instance.getTimeInMillis() >= j) {
                    if (curUser.nicknameUpdateReminder()) {
                        Activity j2 = C17873f.m33102j();
                        if (j2 == null) {
                            return;
                        }
                        if (EventActivityComponent.f81546c == null || !EventActivityComponent.f81546c.isShowing()) {
                            DialogC34558i iVar = new DialogC34558i(j2, curUser);
                            EventActivityComponent.f81546c = iVar;
                            iVar.show();
                            C39162r.onEventV3("modify_username_notify");
                            return;
                        }
                        return;
                    }
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog("publish", null, null);
                }
            }
        }
    }
}
