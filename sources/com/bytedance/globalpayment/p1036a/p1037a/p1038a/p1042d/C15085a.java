package com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1047f.C15103a;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.a.a.a.d.a */
public class C15085a {

    /* renamed from: a */
    public boolean f36799a;

    /* renamed from: b */
    private String f36800b;

    /* renamed from: c */
    private String f36801c;

    /* renamed from: d */
    private List<C15085a> f36802d;

    static {
        Covode.recordClassIndex(17253);
    }

    public String toString() {
        String a;
        StringBuilder append = new StringBuilder("{mIsValid=").append(this.f36799a).append(", mErrorMessage='");
        if (TextUtils.isEmpty(this.f36801c)) {
            a = C15103a.m27768a(this.f36800b, new String[0]);
        } else {
            a = C15103a.m27768a(this.f36800b, this.f36801c);
        }
        return append.append(a).append('\'').append(", mChildElementValidity=").append(this.f36802d).append('}').toString();
    }
}
