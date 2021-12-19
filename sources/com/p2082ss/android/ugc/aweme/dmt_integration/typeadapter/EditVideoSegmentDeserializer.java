package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditVideoSegmentDeserializer */
public final class EditVideoSegmentDeserializer implements AbstractC28018k<EditVideoSegment> {
    static {
        Covode.recordClassIndex(51257);
    }

    /* renamed from: a */
    private static EditVideoSegment m85978a(AbstractC28019l lVar) {
        C28022o oVar;
        AbstractC28019l c;
        if (lVar != null) {
            try {
                oVar = lVar.mo46789j();
            } catch (Exception unused) {
                return null;
            }
        } else {
            oVar = null;
        }
        if (!(oVar == null || (c = oVar.mo46803c("videoPath")) == null || (c instanceof C28025r))) {
            oVar.mo46795a("videoPath");
            oVar.mo46797a("videoPath", c.mo46789j().mo46803c("path"));
        }
        return (EditVideoSegment) C63244g.m114602a().mo73262H().mo46667a((AbstractC28019l) oVar, EditVideoSegment.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ EditVideoSegment mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85978a(lVar);
    }
}
