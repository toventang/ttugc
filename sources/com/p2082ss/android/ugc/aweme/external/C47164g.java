package com.p2082ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.IEnterFromService;

/* renamed from: com.ss.android.ugc.aweme.external.g */
public final class C47164g implements IEnterFromService {

    /* renamed from: a */
    public static final C47164g f109787a = new C47164g();

    /* renamed from: b */
    private static String f109788b = "HOME";

    private C47164g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IEnterFromService
    public final String getEnterFrom() {
        return f109788b;
    }

    static {
        Covode.recordClassIndex(55768);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IEnterFromService
    public final void setEnterFrom(String str) {
        f109788b = str;
    }
}
