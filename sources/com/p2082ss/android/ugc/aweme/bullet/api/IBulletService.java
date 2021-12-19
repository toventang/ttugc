package com.p2082ss.android.ugc.aweme.bullet.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1125a.AbstractC16114a;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.p2082ss.android.ugc.aweme.bullet.views.AbstractC35316c;

/* renamed from: com.ss.android.ugc.aweme.bullet.api.IBulletService */
public interface IBulletService {
    static {
        Covode.recordClassIndex(41991);
    }

    /* renamed from: a */
    Activity mo61848a(String str);

    /* renamed from: a */
    View mo61849a(Context context);

    /* renamed from: a */
    AbstractC16239d.AbstractC16241b mo61850a();

    /* renamed from: a */
    AbstractC35316c mo61851a(Context context, String str, String str2, int i, int i2);

    /* renamed from: a */
    void mo61852a(Context context, String str);

    /* renamed from: a */
    void mo61853a(Context context, String str, Bundle bundle);

    /* renamed from: a */
    void mo61854a(Context context, String str, String str2, Bundle bundle);

    /* renamed from: a */
    void mo61855a(Class<?> cls);

    /* renamed from: b */
    AbstractC16114a mo61856b();

    /* renamed from: b */
    String mo61857b(String str);

    /* renamed from: b */
    void mo61858b(Context context);

    /* renamed from: b */
    boolean mo61859b(Context context, String str);

    /* renamed from: c */
    void mo61860c();
}
