package com.bytedance.android.live.network.model;

import android.text.TextUtils;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.network.model.b */
public final class C5820b extends C2912a {

    /* renamed from: a */
    private String f14676a;

    /* renamed from: b */
    private String f14677b;

    static {
        Covode.recordClassIndex(6426);
    }

    public final String getUrl() {
        return this.f14676a;
    }

    @Override // com.bytedance.android.live.p172a.p173a.p175b.C2912a, com.bytedance.android.live.p172a.p173a.C2908a
    public final String getMessage() {
        return " TYPE = CustomApiServerException, url = " + this.f14676a + ", xTtLogId = " + this.f14677b + "  " + super.getMessage();
    }

    public C5820b(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.f14676a = "";
        } else {
            this.f14676a = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.f14677b = "";
        } else {
            this.f14677b = str2;
        }
    }
}
