package com.p2082ss.android.ugc.aweme.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.loginlog.C31961a;
import com.p2082ss.android.ugc.aweme.account.login.loginlog.LoginLog;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.login.l */
public class C58966l extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(69293);
    }

    public void onReceive(Context context, Intent intent) {
        C31575b.m65860b().logout("expired_logout", "sdk_expired_logout");
        C31961a a = C31961a.m66329a();
        boolean isLogin = C31575b.m65865g().isLogin();
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = "session_expire";
        loginLog.errorUrl = "";
        loginLog.isSuccess = false;
        loginLog.isLogin = isLogin;
        loginLog.platform = "user_login_out";
        loginLog.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        if (a.f76325a != null) {
            a.f76325a.add(loginLog);
        }
        C33830n.m69192a("aweme_user_logout", "", new C33743c().mo59976a("errorDesc", "session_expire").mo59977a());
    }
}
