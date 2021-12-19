package com.lynx.tasm.provider;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.provider.c */
public final class C28845c {

    /* renamed from: a */
    public final Map<String, AbstractC28850h> f68085a = new HashMap();

    static {
        Covode.recordClassIndex(34954);
    }

    /* renamed from: a */
    public final void mo49981a(String str, AbstractC28850h hVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f68085a.put(str, hVar);
        }
    }
}
