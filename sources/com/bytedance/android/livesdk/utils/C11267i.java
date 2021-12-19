package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.android.livesdk.utils.C11268j;
import com.bytedance.android.livesdkapi.p700m.AbstractC11829b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.utils.i */
public final class C11267i implements AbstractC11829b {
    static {
        Covode.recordClassIndex(12899);
    }

    @Override // com.bytedance.android.livesdkapi.p700m.AbstractC11829b
    /* renamed from: a */
    public final Map<String, String> mo18031a(Context context) {
        C11268j jVar = new C11268j();
        if (context == null) {
            return null;
        }
        jVar.f26954a = context;
        if (jVar.f26955b == null || jVar.f26955b.isEmpty()) {
            if (jVar.f26955b == null) {
                jVar.f26955b = new ArrayList<>();
            }
            jVar.f26955b.add(new C11268j.C11271c("webcast_language"));
            jVar.f26955b.add(new C11268j.C11272d("webcast_locale"));
            jVar.f26955b.add(new C11268j.C11270b("webcast_client_version"));
            jVar.f26955b.add(new C11268j.C11273e("webcast_sdk_version"));
        }
        HashMap hashMap = new HashMap();
        Iterator<C11268j.AbstractC11269a> it = jVar.f26955b.iterator();
        while (it.hasNext()) {
            it.next().mo18033a(hashMap);
        }
        return hashMap;
    }
}
