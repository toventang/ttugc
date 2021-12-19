package com.bytedance.android.ecommerce.p164j;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.android.ecommerce.j.n */
public final class C2819n implements AbstractC2810i {

    /* renamed from: a */
    private final SharedPreferences f8417a;

    static {
        Covode.recordClassIndex(3245);
    }

    public C2819n(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f8417a = C34822d.m71158a(applicationContext, "e_commerce_sp", 0);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2810i
    /* renamed from: a */
    public final String mo7399a(String str) {
        return this.f8417a.getString("sp_key_starling_data_".concat(String.valueOf(str)), "");
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2810i
    /* renamed from: b */
    public final long mo7402b(String str) {
        return this.f8417a.getLong("sp_key_starling_version_".concat(String.valueOf(str)), 0);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2810i
    /* renamed from: a */
    public final void mo7400a(String str, Long l) {
        this.f8417a.edit().putLong("sp_key_starling_version_".concat(String.valueOf(str)), l.longValue()).apply();
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2810i
    /* renamed from: a */
    public final void mo7401a(String str, String str2) {
        this.f8417a.edit().putString("sp_key_starling_data_".concat(String.valueOf(str)), str2).apply();
    }
}
