package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25619a;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.iid.C27774aq;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.j */
public final /* synthetic */ class C27794j implements AbstractC25619a {

    /* renamed from: a */
    private final FirebaseInstanceId f65297a;

    /* renamed from: b */
    private final String f65298b;

    /* renamed from: c */
    private final String f65299c;

    static {
        Covode.recordClassIndex(33382);
    }

    C27794j(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f65297a = firebaseInstanceId;
        this.f65298b = str;
        this.f65299c = str2;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25619a
    /* renamed from: a */
    public final Object mo41863a(AbstractC25631h hVar) {
        FirebaseInstanceId firebaseInstanceId = this.f65297a;
        String str = this.f65298b;
        String str2 = this.f65299c;
        String c = firebaseInstanceId.mo46399c();
        C27774aq.C27775a b = firebaseInstanceId.mo46397b(str, str2);
        if (!firebaseInstanceId.mo46396a(b)) {
            return C25635k.m49512a(new C27808w(c, b.f65262a));
        }
        return firebaseInstanceId.f65206g.mo46417a(str, str2, new C27797m(firebaseInstanceId, c, str, str2));
    }
}
