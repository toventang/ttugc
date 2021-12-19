package com.p2082ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69314g;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69320l;
import p4560f.p4561a.AbstractC88973n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.j */
public abstract class AbstractC69270j implements ShareExtService {
    static {
        Covode.recordClassIndex(81600);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final void mo109359a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (context != null && C69314g.m122511a(context) != null) {
            C34822d.m71158a(C69314g.m122511a(context), "share_command", 0).edit().putString("command", str).apply();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final AbstractC88973n<String> mo109358a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if ((str3 == null || str3.length() == 0) && str3 != null) {
            AbstractC88973n<String> a = AbstractC88973n.m154245a("");
            C89219l.m154716b(a, "");
            return a;
        }
        if (str3 == null) {
            C89219l.m154715b();
        }
        return C69320l.m122518a(str, str2, str3);
    }
}
