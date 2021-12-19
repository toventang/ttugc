package com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50760e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.p2988a.C50718d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.d.a.a */
public final class C50652a extends C50760e {
    static {
        Covode.recordClassIndex(59814);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50652a(AbstractC50704l lVar) {
        super(lVar);
        C89219l.m154721d(lVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50760e, com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l
    /* renamed from: a */
    public final boolean mo86011a(C50698f fVar) {
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar, "");
        String string = C50718d.f117081a.getString(String.valueOf(fVar.f117047a), "");
        C89219l.m154716b(string, "");
        ToolsUrlModel toolsUrlModel = fVar.f117051e;
        if (toolsUrlModel == null || (str = toolsUrlModel.f174537a) == null || !(!C89219l.m154714a((Object) string, (Object) str))) {
            return super.mo86011a(fVar);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50760e
    /* renamed from: f */
    public final boolean mo86012f(int i) {
        File[] listFiles;
        File file = new File(mo86054c(i));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : listFiles) {
            C89219l.m154716b(file2, "");
            if (file2.isFile() && C89219l.m154714a((Object) file2.getName(), (Object) "config.json")) {
                return true;
            }
        }
        return false;
    }
}
