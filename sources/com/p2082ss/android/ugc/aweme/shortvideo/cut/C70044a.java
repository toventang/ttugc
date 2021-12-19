package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a */
public final class C70044a {
    static {
        Covode.recordClassIndex(82464);
    }

    /* renamed from: a */
    public static final BackgroundVideoCompileConfigure m123683a(Workspace workspace) {
        C89219l.m154721d(workspace, "");
        File c = workspace.f155867a.mo110075c("");
        C89219l.m154716b(c, "");
        String path = c.getPath();
        C89219l.m154716b(path, "");
        File d = workspace.f155867a.mo110078d("");
        C89219l.m154716b(d, "");
        String path2 = d.getPath();
        C89219l.m154716b(path2, "");
        return new BackgroundVideoCompileConfigure(path, path2);
    }
}
