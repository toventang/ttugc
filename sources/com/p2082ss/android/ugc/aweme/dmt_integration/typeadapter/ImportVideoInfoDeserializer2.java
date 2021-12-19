package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.ImportVideoInfoDeserializer2 */
public final class ImportVideoInfoDeserializer2 implements AbstractC28018k<ImportVideoInfo> {
    static {
        Covode.recordClassIndex(51260);
    }

    /* renamed from: a */
    private static ImportVideoInfo m85984a(AbstractC28019l lVar) {
        C28022o oVar;
        AbstractC28019l c;
        if (lVar != null) {
            try {
                oVar = lVar.mo46789j();
            } catch (Exception e) {
                C84911q.m145926b("ImportVideoInfoDeserializer2 error :" + e.toString());
                return null;
            }
        } else {
            oVar = null;
        }
        if (!(oVar == null || (c = oVar.mo46803c("e")) == null || (c instanceof C28025r))) {
            oVar.mo46795a("e");
            oVar.mo46797a("e", c.mo46789j().mo46803c("path"));
        }
        return (ImportVideoInfo) new C27910f().mo46667a((AbstractC28019l) oVar, ImportVideoInfo.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ImportVideoInfo mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85984a(lVar);
    }
}
