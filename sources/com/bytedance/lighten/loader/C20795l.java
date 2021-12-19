package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.AbstractC20723c;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1879d.C24370c;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1825b.C24019b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.io.File;

/* renamed from: com.bytedance.lighten.loader.l */
final class C20795l implements AbstractC20723c {
    static {
        Covode.recordClassIndex(24371);
    }

    C20795l() {
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20723c
    /* renamed from: a */
    public final Bitmap mo34141a(Uri uri) {
        C24117a<AbstractC24454c> a = C24428k.m46551a().mo40245c().mo40201a(new C24370c(uri.toString(), null, C24364e.f57783b, C24361b.f57766a, null, null, null));
        if (a != null) {
            return ((AbstractC24453b) a.mo39695a()).mo40296d();
        }
        return null;
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20723c
    /* renamed from: b */
    public final File mo34142b(Uri uri) {
        File file;
        AbstractC24026e a = C24389j.m46446a().mo40187a(C24636b.fromUri(uri));
        AbstractC24018a a2 = C24428k.m46551a().mo40246d().mo39575a(a);
        if (a2 == null) {
            a2 = C24428k.m46551a().mo40250h().mo39575a(a);
        }
        if (!(a2 instanceof C24019b) || (file = ((C24019b) a2).f56886a) == null || !file.exists()) {
            return null;
        }
        return file;
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20723c
    /* renamed from: c */
    public final boolean mo34143c(Uri uri) {
        AbstractC24026e a = C24389j.m46446a().mo40187a(C24636b.fromUri(uri));
        if (C24428k.m46551a().mo40246d().mo39582d(a) || C24428k.m46551a().mo40250h().mo39582d(a)) {
            return true;
        }
        return false;
    }
}
