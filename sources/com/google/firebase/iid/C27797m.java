package com.google.firebase.iid;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.firebase.iid.C27763ah;

/* renamed from: com.google.firebase.iid.m */
final /* synthetic */ class C27797m implements C27763ah.AbstractC27764a {

    /* renamed from: a */
    private final FirebaseInstanceId f65302a;

    /* renamed from: b */
    private final String f65303b;

    /* renamed from: c */
    private final String f65304c;

    /* renamed from: d */
    private final String f65305d;

    static {
        Covode.recordClassIndex(33385);
    }

    C27797m(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f65302a = firebaseInstanceId;
        this.f65303b = str;
        this.f65304c = str2;
        this.f65305d = str3;
    }

    @Override // com.google.firebase.iid.C27763ah.AbstractC27764a
    /* renamed from: a */
    public final AbstractC25631h mo46418a() {
        FirebaseInstanceId firebaseInstanceId = this.f65302a;
        String str = this.f65303b;
        String str2 = this.f65304c;
        String str3 = this.f65305d;
        C27801q qVar = firebaseInstanceId.f65205f;
        return qVar.mo46447a(qVar.mo46448a(str, str2, str3, new Bundle())).mo41876a(firebaseInstanceId.f65202c, new C27798n(firebaseInstanceId, str2, str3, str));
    }
}
