package com.p2082ss.android.p2092ad.splash.core.p2100e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ad.splash.core.e.l */
public class C29468l {

    /* renamed from: X */
    public String f70096X;

    static {
        Covode.recordClassIndex(35862);
    }

    public C29468l() {
    }

    /* renamed from: x */
    public String mo51554x() {
        return this.f70096X;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(mo51554x())) {
            return super.hashCode();
        }
        return mo51554x().hashCode();
    }

    public C29468l(String str) {
        this.f70096X = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C29468l) && !TextUtils.isEmpty(mo51554x())) {
            C29468l lVar = (C29468l) obj;
            if (!TextUtils.isEmpty(lVar.mo51554x())) {
                return TextUtils.equals(mo51554x(), lVar.mo51554x());
            }
        }
        return false;
    }
}
