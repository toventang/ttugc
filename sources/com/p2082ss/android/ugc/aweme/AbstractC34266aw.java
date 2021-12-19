package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aw */
public abstract class AbstractC34266aw {
    static {
        Covode.recordClassIndex(41203);
    }

    /* renamed from: a */
    public Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return null;
    }

    /* renamed from: a */
    public String mo59960a() {
        return null;
    }

    /* renamed from: a */
    public void mo59959a(Activity activity, Uri uri, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
    }

    /* renamed from: a */
    public void mo60120a(Uri uri, Intent intent, boolean z) {
    }

    /* renamed from: a */
    public boolean mo59957a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return false;
    }

    /* renamed from: a */
    public String mo59956a(Uri uri) {
        C89219l.m154721d(uri, "");
        if (TextUtils.isEmpty(uri.getHost())) {
            return "homepage_hot";
        }
        String host = uri.getHost();
        if (host == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(host, "");
        return host;
    }

    /* renamed from: a */
    public boolean mo59965a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return mo59957a(str2, str3);
    }

    /* renamed from: a */
    public boolean mo59964a(Uri uri, String str, String str2, String str3) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return mo59965a(str, str2, str3);
    }

    /* renamed from: a */
    public Intent mo59958a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return mo59955a(activity, uri, str, str2, str3, z);
    }
}
