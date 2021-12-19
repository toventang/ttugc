package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25630g;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;

/* renamed from: com.google.firebase.iid.n */
final /* synthetic */ class C27798n implements AbstractC25630g {

    /* renamed from: a */
    private final FirebaseInstanceId f65306a;

    /* renamed from: b */
    private final String f65307b;

    /* renamed from: c */
    private final String f65308c;

    /* renamed from: d */
    private final String f65309d;

    static {
        Covode.recordClassIndex(33386);
    }

    C27798n(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f65306a = firebaseInstanceId;
        this.f65307b = str;
        this.f65308c = str2;
        this.f65309d = str3;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25630g
    /* renamed from: a */
    public final AbstractC25631h mo41892a(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.f65306a;
        String str = this.f65307b;
        String str2 = this.f65308c;
        String str3 = this.f65309d;
        String str4 = (String) obj;
        FirebaseInstanceId.f65198a.mo46430a(firebaseInstanceId.mo46403h(), str, str2, str4, firebaseInstanceId.f65204e.mo46413c());
        return C25635k.m49512a(new C27808w(str3, str4));
    }
}
