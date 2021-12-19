package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63809j;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.z */
public final class C34529z implements AbstractC63809j {

    /* renamed from: a */
    private Context f81531a;

    /* renamed from: b */
    private Keva f81532b;

    static {
        Covode.recordClassIndex(41487);
    }

    public C34529z(Context context) {
        this.f81531a = context;
        this.f81532b = Keva.getRepoFromSp(context, "PrivateAlbumSp", 0);
    }
}
