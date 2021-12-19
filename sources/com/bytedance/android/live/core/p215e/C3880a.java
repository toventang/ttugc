package com.bytedance.android.live.core.p215e;

import android.text.TextUtils;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.e.a */
public final class C3880a extends C2912a {

    /* renamed from: a */
    private String f10728a;

    /* renamed from: b */
    private String f10729b;

    static {
        Covode.recordClassIndex(4409);
    }

    public final String getUrl() {
        return this.f10728a;
    }

    @Override // com.bytedance.android.live.p172a.p173a.p175b.C2912a, com.bytedance.android.live.p172a.p173a.C2908a
    public final String getMessage() {
        return " TYPE = CustomApiServerException, url = " + this.f10728a + ", xTtLogId = " + this.f10729b + "  " + super.getMessage();
    }

    public C3880a(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.f10728a = "";
        } else {
            this.f10728a = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.f10729b = "";
        } else {
            this.f10729b = str2;
        }
    }
}
