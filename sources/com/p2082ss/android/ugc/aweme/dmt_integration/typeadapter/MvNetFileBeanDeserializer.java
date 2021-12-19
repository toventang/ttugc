package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvNetFileBeanDeserializer */
public final class MvNetFileBeanDeserializer implements AbstractC28018k<MvNetFileBean> {

    /* renamed from: a */
    public static final C43104a f100448a = new C43104a((byte) 0);

    static {
        Covode.recordClassIndex(51269);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvNetFileBeanDeserializer$a */
    public static final class C43104a {
        static {
            Covode.recordClassIndex(51270);
        }

        private C43104a() {
        }

        public /* synthetic */ C43104a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static MvNetFileBean m85996a(AbstractC28019l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            C28022o j = lVar.mo46789j();
            C89219l.m154716b(j, "");
            C43106a.m86002b(j, "photo_path");
            C43106a.m86002b(j, "filePath");
            return (MvNetFileBean) new C27910f().mo46667a((AbstractC28019l) j, MvNetFileBean.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MvNetFileBean mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85996a(lVar);
    }
}
