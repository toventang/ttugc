package com.p2082ss.android.ugc.aweme.deeplink.p2731a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.api.C33536e;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.deeplink.a.e */
final /* synthetic */ class C41004e implements AbstractC88433f {

    /* renamed from: a */
    private final C41002d f95883a;

    /* renamed from: b */
    private final AbstractC79622e f95884b;

    /* renamed from: c */
    private final Uri f95885c;

    static {
        Covode.recordClassIndex(48867);
    }

    C41004e(C41002d dVar, AbstractC79622e eVar, Uri uri) {
        this.f95883a = dVar;
        this.f95884b = eVar;
        this.f95885c = uri;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C41002d dVar = this.f95883a;
        AbstractC79622e eVar = this.f95884b;
        Uri uri = this.f95885c;
        C41039c.f95929b = System.currentTimeMillis();
        String str = ((C33536e) obj).f79648a;
        if (TextUtils.isEmpty(str)) {
            eVar.mo123170b();
            C41039c.m82668a("short_2_long", 2015, uri, "short2long transUrl is empty");
            return;
        }
        dVar.mo70210a(uri, str);
        boolean z = C17873f.f42636l;
        C41039c.f95930c = z;
        eVar.mo123169a(z);
        dVar.mo70211b(uri, str);
    }
}
