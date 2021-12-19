package com.p2082ss.android.ugc.aweme.user.p4196c;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.user.c.b */
public final class C80056b {

    /* renamed from: a */
    public SharedPreferences f179392a;

    /* renamed from: b */
    private C27910f f179393b = new C27910f();

    /* renamed from: c */
    private SharedPreferences.Editor f179394c;

    static {
        Covode.recordClassIndex(93287);
    }

    public C80056b() {
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "aweme_user", 0);
        this.f179392a = a;
        this.f179394c = a.edit();
    }

    /* renamed from: a */
    public final User mo123506a() {
        String string = this.f179392a.getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (User) this.f179393b.mo46670a(string, User.class);
            }
            return new C80055a().mo123505a();
        } catch (Exception unused) {
            return new User();
        }
    }
}
