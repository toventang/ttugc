package com.bytedance.android.ecommerce.p153a;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p165k.C2839j;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.ecommerce.a.d */
public final class C2744d {

    /* renamed from: a */
    public boolean f8231a = true;

    /* renamed from: b */
    public List<C2744d> f8232b;

    /* renamed from: c */
    private String f8233c = "";

    /* renamed from: d */
    private String f8234d;

    static {
        Covode.recordClassIndex(3170);
    }

    /* renamed from: a */
    public final String mo7328a() {
        if (TextUtils.isEmpty(this.f8234d)) {
            return C2839j.m8118a(this.f8233c, new String[0]);
        }
        return C2839j.m8118a(this.f8233c, this.f8234d);
    }

    public final String toString() {
        return "{mIsValid=" + this.f8231a + ", mErrorMessage='" + mo7328a() + '\'' + ", mChildElementValidity=" + this.f8232b + '}';
    }

    /* renamed from: a */
    public static C2744d m7914a(String str) {
        throw new RuntimeException(str);
    }

    /* renamed from: a */
    public final void mo7329a(C2744d dVar) {
        if (this.f8232b == null) {
            this.f8232b = new ArrayList();
        }
        this.f8232b.add(dVar);
    }

    /* renamed from: a */
    public final C2744d mo7327a(String str, String... strArr) {
        this.f8233c = str;
        if (strArr.length > 0) {
            this.f8234d = strArr[0];
        }
        return this;
    }
}
