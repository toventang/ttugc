package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1590c.AbstractC21777h;
import com.bytedance.push.p1590c.AbstractC21779j;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.push.b */
public final class C21761b {

    /* renamed from: a */
    public static AbstractC21777h f51571a = new C21793e();

    static {
        Covode.recordClassIndex(25410);
    }

    /* renamed from: a */
    public static AbstractC21779j m40732a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C30061a.m60799a((Application) applicationContext);
        return C30221b.m61148b();
    }
}
