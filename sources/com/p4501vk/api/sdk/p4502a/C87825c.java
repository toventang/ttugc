package com.p4501vk.api.sdk.p4502a;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.AbstractC87896h;
import com.p4501vk.api.sdk.p4502a.C87821a;
import com.p4501vk.api.sdk.p4507f.C87893g;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.a.c */
public final class C87825c {

    /* renamed from: b */
    public static final C87826a f199505b = new C87826a((byte) 0);

    /* renamed from: a */
    public final AbstractC87896h f199506a;

    static {
        Covode.recordClassIndex(103835);
    }

    /* renamed from: com.vk.api.sdk.a.c$a */
    public static final class C87826a {
        static {
            Covode.recordClassIndex(103836);
        }

        private C87826a() {
        }

        public /* synthetic */ C87826a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo142299a() {
        C87821a b = C87821a.C87822a.m152834b(this.f199506a);
        if (b == null || !b.mo142298a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static Bundle m152840b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public C87825c(AbstractC87896h hVar) {
        C89219l.m154719c(hVar, "");
        this.f199506a = hVar;
    }

    /* renamed from: a */
    public static C87829e m152837a(Intent intent) {
        Map hashMap;
        if (intent.hasExtra("extra-token-data")) {
            hashMap = C87893g.m152897a(m152839a(intent, "extra-token-data"));
            if (hashMap == null) {
                return null;
            }
        } else if (m152840b(intent) == null) {
            return null;
        } else {
            hashMap = new HashMap();
            Bundle b = m152840b(intent);
            if (b == null) {
                C89219l.m154707a();
            }
            for (String str : b.keySet()) {
                C89219l.m154709a((Object) str, "");
                Bundle b2 = m152840b(intent);
                if (b2 == null) {
                    C89219l.m154707a();
                }
                hashMap.put(str, String.valueOf(m152838a(b2, str)));
            }
        }
        if (hashMap.get("error") != null) {
            return null;
        }
        try {
            return new C87829e(new C87821a(hashMap), (byte) 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m152838a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m152839a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
