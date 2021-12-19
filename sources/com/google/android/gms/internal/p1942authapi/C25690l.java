package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api.l */
public final class C25690l {

    /* renamed from: a */
    public static final Feature f60822a;

    /* renamed from: b */
    public static final Feature f60823b;

    /* renamed from: c */
    public static final Feature f60824c;

    /* renamed from: d */
    public static final Feature f60825d;

    /* renamed from: e */
    public static final Feature[] f60826e;

    /* renamed from: f */
    private static final Feature f60827f;

    /* renamed from: g */
    private static final Feature f60828g;

    /* renamed from: h */
    private static final Feature f60829h;

    static {
        Covode.recordClassIndex(31104);
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 4);
        f60822a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2);
        f60823b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1);
        f60827f = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1);
        f60828g = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 3);
        f60824c = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 3);
        f60825d = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 2);
        f60829h = feature7;
        f60826e = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
