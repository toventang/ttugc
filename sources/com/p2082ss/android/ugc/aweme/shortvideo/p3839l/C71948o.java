package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.C24359g;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.imagepipeline.p1890o.C24636b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.o */
public final class C71948o {
    static {
        Covode.recordClassIndex(84497);
    }

    /* renamed from: a */
    public static C24117a<AbstractC24454c> m127025a(Bitmap bitmap) {
        return C24117a.m45706a(new C24455d(bitmap, C24359g.m46366a(), C24458g.f58105a));
    }

    /* renamed from: a */
    public static void m127026a(C24117a<AbstractC24454c> aVar, String str) {
        C24428k.m46551a().mo40245c().mo40202a(C24389j.m46446a().mo40188a(C24636b.fromUri("file://".concat(String.valueOf(str))), null), aVar);
    }
}
