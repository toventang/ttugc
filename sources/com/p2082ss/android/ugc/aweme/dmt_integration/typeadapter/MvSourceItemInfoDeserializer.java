package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.mvtheme.C61289e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvSourceItemInfoDeserializer */
public final class MvSourceItemInfoDeserializer implements AbstractC28018k<C61289e> {

    /* renamed from: a */
    public static final C43105a f100449a = new C43105a((byte) 0);

    static {
        Covode.recordClassIndex(51271);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvSourceItemInfoDeserializer$a */
    public static final class C43105a {
        static {
            Covode.recordClassIndex(51272);
        }

        private C43105a() {
        }

        public /* synthetic */ C43105a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static C61289e m85998a(AbstractC28019l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            C28022o j = lVar.mo46789j();
            C89219l.m154716b(j, "");
            C43106a.m86002b(j, "photo_path");
            C43106a.m86002b(j, "source");
            C43106a.m86002b(j, "origin_file_path");
            return (C61289e) C63244g.m114602a().mo73262H().mo46667a((AbstractC28019l) j, C61289e.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C61289e mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85998a(lVar);
    }
}
