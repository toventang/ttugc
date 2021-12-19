package com.google.android.gms.auth.api.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.api.signin.c */
public final /* synthetic */ class C25295c implements Comparator {

    /* renamed from: a */
    static final Comparator f60031a = new C25295c();

    static {
        Covode.recordClassIndex(30682);
    }

    private C25295c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).f60098a.compareTo(((Scope) obj2).f60098a);
    }
}
