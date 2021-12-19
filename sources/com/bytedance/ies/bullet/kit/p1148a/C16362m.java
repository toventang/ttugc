package com.bytedance.ies.bullet.kit.p1148a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.m */
public final class C16362m {
    static {
        Covode.recordClassIndex(18655);
    }

    /* renamed from: a */
    public static /* synthetic */ Uri m30381a(String str) {
        C89219l.m154719c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        C89219l.m154709a((Object) path, "");
        C89219l.m154719c(path, "");
        Uri build = path.build();
        C89219l.m154709a((Object) build, "");
        return build;
    }

    /* renamed from: b */
    public static /* synthetic */ Uri m30382b(String str) {
        C89219l.m154719c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("absolute").path(str);
        C89219l.m154709a((Object) path, "");
        C89219l.m154719c(path, "");
        Uri build = path.build();
        C89219l.m154709a((Object) build, "");
        return build;
    }

    /* renamed from: c */
    public static /* synthetic */ Uri m30383c(String str) {
        C89219l.m154719c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("assets").authority("relative").path(str);
        C89219l.m154709a((Object) path, "");
        C89219l.m154719c(path, "");
        Uri build = path.build();
        C89219l.m154709a((Object) build, "");
        return build;
    }
}
