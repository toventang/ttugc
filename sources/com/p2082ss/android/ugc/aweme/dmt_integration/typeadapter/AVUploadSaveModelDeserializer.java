package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.AVUploadSaveModelDeserializer */
public final class AVUploadSaveModelDeserializer implements AbstractC28018k<AVUploadSaveModel> {

    /* renamed from: a */
    public static final C43098a f100442a = new C43098a((byte) 0);

    static {
        Covode.recordClassIndex(51251);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.AVUploadSaveModelDeserializer$a */
    public static final class C43098a {
        static {
            Covode.recordClassIndex(51252);
        }

        private C43098a() {
        }

        public /* synthetic */ C43098a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static AVUploadSaveModel m85972a(AbstractC28019l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            C28022o j = lVar.mo46789j();
            C89219l.m154716b(j, "");
            C43106a.m86002b(j, "local_final_path");
            return (AVUploadSaveModel) C63244g.m114602a().mo73262H().mo46667a((AbstractC28019l) j, AVUploadSaveModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AVUploadSaveModel mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85972a(lVar);
    }
}
