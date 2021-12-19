package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27917g;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditPreviewInfoDeserializer */
public final class EditPreviewInfoDeserializer implements AbstractC28018k<EditPreviewInfo> {

    /* renamed from: a */
    public static final C43100a f100444a = new C43100a((byte) 0);

    static {
        Covode.recordClassIndex(51255);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditPreviewInfoDeserializer$a */
    public static final class C43100a {
        static {
            Covode.recordClassIndex(51256);
        }

        private C43100a() {
        }

        public /* synthetic */ C43100a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static EditPreviewInfo m85976a(AbstractC28019l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            C28022o j = lVar.mo46789j();
            C89219l.m154716b(j, "");
            C43106a.m86000a(j, "reverseVideoArray");
            C43106a.m86000a(j, "tempVideoArray");
            C27917g gVar = new C27917g();
            gVar.f65564d = true;
            return (EditPreviewInfo) gVar.mo46681a((Type) EditVideoSegment.class, (Object) new EditVideoSegmentDeserializer()).mo46682b().mo46667a((AbstractC28019l) j, EditPreviewInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ EditPreviewInfo mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85976a(lVar);
    }
}
