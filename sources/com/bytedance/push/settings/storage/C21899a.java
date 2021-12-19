package com.bytedance.push.settings.storage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.C21895h;

/* renamed from: com.bytedance.push.settings.storage.a */
final class C21899a implements AbstractC21907e {
    static {
        Covode.recordClassIndex(25563);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21907e
    /* renamed from: a */
    public final String mo35631a() {
        return "_contains";
    }

    C21899a() {
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21907e
    /* renamed from: a */
    public final Bundle mo35630a(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("_storage_key");
        String string2 = bundle.getString("_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("_result", C21895h.f51860a.mo35620a(context, true, string).mo35656f(string2));
        return bundle2;
    }
}
