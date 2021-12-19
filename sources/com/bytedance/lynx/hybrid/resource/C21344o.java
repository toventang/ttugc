package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.o */
public final class C21344o {
    static {
        Covode.recordClassIndex(24962);
    }

    /* renamed from: a */
    public static final Uri m40087a(String str) {
        C89219l.m154719c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        C89219l.m154709a((Object) path, "");
        C89219l.m154719c(path, "");
        Uri build = path.build();
        C89219l.m154709a((Object) build, "");
        return build;
    }

    /* renamed from: b */
    public static /* synthetic */ Uri m40088b(String str) {
        C89219l.m154719c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("assets").authority("relative").path(str);
        C89219l.m154709a((Object) path, "");
        C89219l.m154719c(path, "");
        Uri build = path.build();
        C89219l.m154709a((Object) build, "");
        return build;
    }
}
