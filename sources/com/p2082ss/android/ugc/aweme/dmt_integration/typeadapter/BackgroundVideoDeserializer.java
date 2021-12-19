package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.BackgroundVideoDeserializer */
public final class BackgroundVideoDeserializer implements AbstractC28018k<C75439a> {

    /* renamed from: a */
    public static final C43099a f100443a = new C43099a((byte) 0);

    static {
        Covode.recordClassIndex(51253);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.BackgroundVideoDeserializer$a */
    public static final class C43099a {
        static {
            Covode.recordClassIndex(51254);
        }

        private C43099a() {
        }

        public /* synthetic */ C43099a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static C75439a m85974a(AbstractC28019l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            C28022o j = lVar.mo46789j();
            C89219l.m154716b(j, "");
            C43106a.m86002b(j, "videoPath");
            return (C75439a) C63244g.m114602a().mo73262H().mo46667a((AbstractC28019l) j, C75439a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C75439a mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85974a(lVar);
    }
}
