package com.p2082ss.android.ugc.aweme.deeplink.p2731a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.deeplink.a.f */
final /* synthetic */ class C41005f implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC79622e f95886a;

    /* renamed from: b */
    private final Uri f95887b;

    static {
        Covode.recordClassIndex(48868);
    }

    C41005f(AbstractC79622e eVar, Uri uri) {
        this.f95886a = eVar;
        this.f95887b = uri;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC79622e eVar = this.f95886a;
        Uri uri = this.f95887b;
        C41039c.f95929b = System.currentTimeMillis();
        eVar.mo123170b();
        C41039c.m82668a("short_2_long", 2015, uri, "short2long transUrl fail");
    }
}
