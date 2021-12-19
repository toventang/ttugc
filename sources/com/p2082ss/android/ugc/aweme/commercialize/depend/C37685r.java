package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.r */
public final class C37685r implements IHostRouterDepend {
    static {
        Covode.recordClassIndex(45118);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
    public final boolean isHostScheme(String str) {
        C89219l.m154721d(str, "");
        return C89219l.m154714a((Object) str, (Object) "aweme");
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
    public final boolean openHostScheme(String str) {
        C89219l.m154721d(str, "");
        return C36125t.m73598a(C36125t.m73591a(), str);
    }
}
