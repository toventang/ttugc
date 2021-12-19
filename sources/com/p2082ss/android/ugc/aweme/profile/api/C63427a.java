package com.p2082ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17796c;
import com.bytedance.ies.powerpreload.p1245d.C17808a;
import com.p2082ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.p2082ss.android.ugc.aweme.profile.preload.ProfilePagePreload;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.api.a */
public final /* synthetic */ class C63427a implements C17796c.AbstractC17800b {

    /* renamed from: a */
    private final String f144008a;

    /* renamed from: b */
    private final int f144009b;

    /* renamed from: c */
    private final String f144010c;

    /* renamed from: d */
    private final String f144011d;

    /* renamed from: e */
    private final int f144012e = 0;

    /* renamed from: f */
    private final long f144013f = 0;

    /* renamed from: g */
    private final int f144014g = 20;

    /* renamed from: h */
    private final int f144015h = 0;

    /* renamed from: i */
    private final int f144016i = 0;

    /* renamed from: j */
    private final Integer f144017j = null;

    /* renamed from: k */
    private final Integer f144018k;

    static {
        Covode.recordClassIndex(74732);
    }

    public C63427a(String str, int i, String str2, String str3, Integer num) {
        this.f144008a = str;
        this.f144009b = i;
        this.f144010c = str2;
        this.f144011d = str3;
        this.f144018k = num;
    }

    @Override // com.bytedance.ies.powerpreload.C17796c.AbstractC17800b
    /* renamed from: a */
    public final void mo28271a(C17808a aVar) {
        String str = this.f144008a;
        int i = this.f144009b;
        String str2 = this.f144010c;
        String str3 = this.f144011d;
        int i2 = this.f144012e;
        long j = this.f144013f;
        int i3 = this.f144014g;
        int i4 = this.f144015h;
        int i5 = this.f144016i;
        Integer num = this.f144017j;
        Integer num2 = this.f144018k;
        ArrayList arrayList = new ArrayList();
        arrayList.add("sec_user_id");
        arrayList.add("user_id");
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo("others_homepage", str, "/aweme/v1/aweme/post/", i, arrayList);
        String a = AwemeApi.m115009a(str2, str3, i2, j, i3, i4, i5, num);
        Intent intent = new Intent();
        intent.putExtra("preload_profile_page_url", a);
        if (num2 != null) {
            intent.putExtra("profile_aweme_ttl", num2);
        }
        intent.putExtra("preload_profile_page_extra_info", preloadExtraInfo);
        aVar.mo28276a(AwemeApi.m115005a(intent), ProfilePagePreload.class);
    }
}
