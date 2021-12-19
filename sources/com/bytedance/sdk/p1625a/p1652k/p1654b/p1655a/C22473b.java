package com.bytedance.sdk.p1625a.p1652k.p1654b.p1655a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22464b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22478e;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22477d;

/* renamed from: com.bytedance.sdk.a.k.b.a.b */
public final class C22473b implements AbstractC22478e<AbstractC22464b> {

    /* renamed from: a */
    private String f53126a;

    /* renamed from: b */
    private String f53127b;

    /* renamed from: c */
    private String f53128c;

    /* renamed from: d */
    private String f53129d;

    static {
        Covode.recordClassIndex(26289);
    }

    @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22478e
    /* renamed from: a */
    public final void mo36767a(Context context) {
        C22469a aVar;
        if (context == null) {
            aVar = null;
        } else if (TextUtils.isEmpty(this.f53126a) || TextUtils.isEmpty(this.f53127b)) {
            aVar = new C22469a(this.f53128c, this.f53129d);
        } else {
            aVar = new C22469a(this.f53126a, this.f53127b, this.f53129d);
        }
        C22477d.m42421a(AbstractC22464b.class, aVar);
    }

    public C22473b(String str, String str2, String str3) {
        this.f53126a = str;
        this.f53127b = str2;
        this.f53129d = str3;
    }
}
