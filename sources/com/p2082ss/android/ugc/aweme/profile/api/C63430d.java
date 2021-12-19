package com.p2082ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17796c;
import com.bytedance.ies.powerpreload.p1245d.C17808a;
import com.p2082ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.p2082ss.android.ugc.aweme.profile.preload.ProfilePagePreload;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.api.d */
public final /* synthetic */ class C63430d implements C17796c.AbstractC17800b {

    /* renamed from: a */
    private final String f144025a;

    /* renamed from: b */
    private final int f144026b;

    /* renamed from: c */
    private final String f144027c;

    /* renamed from: d */
    private final Integer f144028d;

    static {
        Covode.recordClassIndex(74735);
    }

    public C63430d(String str, int i, String str2, Integer num) {
        this.f144025a = str;
        this.f144026b = i;
        this.f144027c = str2;
        this.f144028d = num;
    }

    @Override // com.bytedance.ies.powerpreload.C17796c.AbstractC17800b
    /* renamed from: a */
    public final void mo28271a(C17808a aVar) {
        String str = this.f144025a;
        int i = this.f144026b;
        String str2 = this.f144027c;
        Integer num = this.f144028d;
        ArrayList arrayList = new ArrayList();
        arrayList.add("sec_user_id");
        arrayList.add("user_id");
        arrayList.add("unique_id");
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo("others_homepage", str, "/aweme/v1/user/profile/other/", i, arrayList);
        Intent intent = new Intent();
        intent.putExtra("preload_profile_page_url", str2);
        if (num != null) {
            intent.putExtra("profile_aweme_ttl", num);
        }
        intent.putExtra("preload_profile_page_extra_info", preloadExtraInfo);
        aVar.mo28276a(C63429c.m115015a(intent), ProfilePagePreload.class);
    }
}
