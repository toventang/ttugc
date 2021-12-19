package com.p2082ss.android.deviceregister.p2139d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.UUID;

/* renamed from: com.ss.android.deviceregister.d.a */
public final class C29893a {

    /* renamed from: a */
    public static AbstractC29898e<String> f71331a = new C29894a((byte) 0);

    /* renamed from: com.ss.android.deviceregister.d.a$a */
    public static class C29894a extends AbstractC29898e<String> {
        static {
            Covode.recordClassIndex(36304);
        }

        private C29894a() {
        }

        public /* synthetic */ C29894a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.deviceregister.p2139d.AbstractC29898e
        /* renamed from: a */
        public final /* synthetic */ String mo52170a(Object[] objArr) {
            if (objArr == null || objArr[0] == null) {
                return null;
            }
            SharedPreferences a = C34822d.m71158a((Context) objArr[0], "com.ss.android.deviceregister.utils.Cdid", 0);
            String string = a.getString("cdid", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String uuid = UUID.randomUUID().toString();
            a.edit().putString("cdid", uuid).apply();
            return uuid;
        }
    }

    static {
        Covode.recordClassIndex(36303);
    }

    /* renamed from: a */
    public static String m60260a(Context context) {
        return f71331a.mo52185b(context);
    }
}
