package com.p2082ss.android.deviceregister.p2135b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.deviceregister.p2139d.AbstractC29898e;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.deviceregister.b.b */
public final class C29881b {

    /* renamed from: a */
    public static boolean f71284a;

    /* renamed from: b */
    public static AbstractC29898e<SharedPreferences> f71285b = new AbstractC29898e<SharedPreferences>() {
        /* class com.p2082ss.android.deviceregister.p2135b.C29881b.C298821 */

        static {
            Covode.recordClassIndex(36292);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.deviceregister.p2139d.AbstractC29898e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ SharedPreferences mo52170a(Object[] objArr) {
            return C34822d.m71158a((Context) objArr[0], "ug_install_settings_pref", 0);
        }
    };

    static {
        Covode.recordClassIndex(36291);
    }
}
