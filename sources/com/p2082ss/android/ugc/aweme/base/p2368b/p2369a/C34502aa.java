package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63418ad;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.aa */
public final class C34502aa implements AbstractC63418ad {

    /* renamed from: a */
    private Context f81486a;

    /* renamed from: b */
    private SharedPreferences f81487b;

    static {
        Covode.recordClassIndex(41460);
    }

    public C34502aa(Context context) {
        this.f81486a = context;
        this.f81487b = C34822d.m71158a(context, "ProfilePreferences", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63418ad
    /* renamed from: a */
    public final void mo60938a(String str) {
        SharedPreferences.Editor edit = this.f81487b.edit();
        edit.putString("profile_cache_post_list", str);
        edit.apply();
    }
}
