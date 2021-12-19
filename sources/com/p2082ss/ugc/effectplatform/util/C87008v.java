package com.p2082ss.ugc.effectplatform.util;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.v */
public final class C87008v {

    /* renamed from: a */
    public static final C87008v f196178a = new C87008v();

    private C87008v() {
    }

    static {
        Covode.recordClassIndex(102774);
    }

    /* renamed from: a */
    public static String m150699a(String str) {
        C89219l.m154719c(str, "");
        String uri = Uri.parse(str).toString();
        C89219l.m154709a((Object) uri, "");
        return uri;
    }
}
