package com.p2082ss.android.vesdk.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.runtime.p4393a.C85551a;

/* renamed from: com.ss.android.vesdk.runtime.c */
public final class C85554c {

    /* renamed from: a */
    public String f191692a;

    /* renamed from: b */
    private String f191693b;

    static {
        Covode.recordClassIndex(99728);
    }

    /* renamed from: a */
    public final String mo131522a() {
        if (TextUtils.isEmpty(this.f191693b)) {
            this.f191693b = (String) C85551a.EnumC85552a.INSTANCE.f191679b.mo131519a("vesdk_models_dir_sp_key", "");
        }
        return this.f191693b;
    }
}
