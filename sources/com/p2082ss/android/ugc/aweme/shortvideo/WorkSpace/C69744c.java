package com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace;

import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.c */
public final class C69744c {

    /* renamed from: a */
    public static final C69744c f155869a = new C69744c();

    private C69744c() {
    }

    static {
        Covode.recordClassIndex(82150);
    }

    /* renamed from: a */
    public static final Workspace m123266a() {
        OldImpl oldImpl = new OldImpl();
        Workspace workspace = new Workspace(oldImpl);
        oldImpl.f155865p = workspace;
        return workspace;
    }

    /* renamed from: b */
    public static final String m123270b() {
        return C70638dj.f158104g + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
    }

    /* renamed from: a */
    public static final Workspace m123267a(WorkspaceImpl workspaceImpl) {
        C89219l.m154721d(workspaceImpl, "");
        return new Workspace(workspaceImpl);
    }

    /* renamed from: a */
    public static final String m123269a(String str) {
        return C70638dj.f158103f + C13607d.m24442b(str);
    }

    /* renamed from: a */
    public static final Workspace m123268a(String str, String str2, String str3, String str4) {
        OldImpl oldImpl = new OldImpl();
        oldImpl.f155850a = 1;
        oldImpl.f155853d = str;
        oldImpl.f155854e = str2;
        oldImpl.f155856g = str3;
        oldImpl.f155855f = str4;
        oldImpl.f155852c = m123269a(str);
        Workspace workspace = new Workspace(oldImpl);
        oldImpl.f155865p = workspace;
        return workspace;
    }
}
