package com.p2082ss.android.ugc.trill.setting.p4383a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.net.C61305b;
import com.p2082ss.android.ugc.aweme.net.EnumC61379i;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.setting.a.a */
public final class C85118a {

    /* renamed from: a */
    private static final String f190460a = (Api.f79771d + "/aweme/v1/notice/shield/");

    static {
        Covode.recordClassIndex(99157);
    }

    /* renamed from: a */
    public static C61305b<String> m146385a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C29934d("shield_type", String.valueOf(i)));
        arrayList.add(new C29934d("is_shield", String.valueOf(i2)));
        return new C61305b<>(f190460a, EnumC61379i.POST, arrayList, String.class);
    }
}
