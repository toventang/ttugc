package com.p2082ss.android.storageInit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1023j.C14960b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;

/* renamed from: com.ss.android.storageInit.a */
public final class C30618a extends AbstractC30619b {
    static {
        Covode.recordClassIndex(37155);
    }

    @Override // com.p2082ss.android.storageInit.AbstractC30619b
    /* renamed from: f */
    public final String mo54878f() {
        return "GECKO";
    }

    @Override // com.p2082ss.android.storageInit.AbstractC30619b, com.bytedance.p1733u.AbstractC23430a
    /* renamed from: d */
    public final boolean mo38201d() {
        C14960b.m27547a(true);
        return true;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: e */
    public final long mo38202e() {
        return C14960b.m27547a(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.storageInit.AbstractC30619b
    /* renamed from: g */
    public final boolean mo54879g() {
        C14960b.m27547a(true);
        return true;
    }

    @Override // com.p2082ss.android.storageInit.AbstractC30619b, com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        Context a = C17867d.m33078a();
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = a.getFilesDir();
        }
        return new File(C58016d.f132222c + "/offlineX");
    }
}
