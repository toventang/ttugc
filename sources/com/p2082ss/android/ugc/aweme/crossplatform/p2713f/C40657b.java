package com.p2082ss.android.ugc.aweme.crossplatform.p2713f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.f.b */
public final class C40657b {

    /* renamed from: a */
    public static final C40657b f95236a = new C40657b();

    private C40657b() {
    }

    static {
        Covode.recordClassIndex(48497);
    }

    /* renamed from: a */
    public static final boolean m82028a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        C89219l.m154716b(parse, "");
        String scheme = parse.getScheme();
        C89219l.m154716b(parse2, "");
        if (!(!C89219l.m154714a((Object) scheme, (Object) parse2.getScheme())) && !(!C89219l.m154714a((Object) parse.getHost(), (Object) parse2.getHost())) && !(!C89219l.m154714a((Object) parse.getPath(), (Object) parse2.getPath()))) {
            return true;
        }
        return false;
    }
}
