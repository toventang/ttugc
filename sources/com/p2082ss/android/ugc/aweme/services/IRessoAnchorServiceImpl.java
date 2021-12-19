package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.miniapp.p3440a.C59266a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.IRessoAnchorServiceImpl */
public final class IRessoAnchorServiceImpl implements IRessoAnchorService {
    static {
        Covode.recordClassIndex(79638);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IRessoAnchorService
    public final C89378p<Long, Integer> getCopyrightLimitMsUninstalledResso(String str) {
        return C59266a.m108966b(str);
    }

    public static IRessoAnchorService createIRessoAnchorServicebyMonsterPlugin(boolean z) {
        Object a = C81908b.m141854a(IRessoAnchorService.class, z);
        if (a != null) {
            return (IRessoAnchorService) a;
        }
        return new IRessoAnchorServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IRessoAnchorService
    public final boolean showAnchorUninstalledResso(String str, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        return C59266a.m108965a(context, str);
    }
}
