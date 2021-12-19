package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bm */
public final class C73997bm {

    /* renamed from: a */
    public static final C73997bm f166091a = new C73997bm();

    private C73997bm() {
    }

    static {
        Covode.recordClassIndex(86747);
    }

    /* renamed from: a */
    public static String m130141a(int i) {
        Resources resources = C17867d.m33078a().getResources();
        String uri = Uri.parse("android.resource://" + resources.getResourcePackageName(i) + "/" + resources.getResourceTypeName(i) + "/" + resources.getResourceEntryName(i)).toString();
        C89219l.m154716b(uri, "");
        return uri;
    }
}
