package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoRecordDataDeserializer */
public final class MultiEditVideoRecordDataDeserializer implements AbstractC28018k<MultiEditVideoRecordData> {

    /* renamed from: a */
    public static final C43101a f100445a = new C43101a((byte) 0);

    static {
        Covode.recordClassIndex(51261);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoRecordDataDeserializer$a */
    public static final class C43101a {
        static {
            Covode.recordClassIndex(51262);
        }

        private C43101a() {
        }

        public /* synthetic */ C43101a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static MultiEditVideoRecordData m85986a(AbstractC28019l lVar) {
        C28022o oVar;
        if (lVar != null) {
            try {
                oVar = lVar.mo46789j();
            } catch (Exception unused) {
                return null;
            }
        } else {
            oVar = null;
        }
        if (oVar != null) {
            C43106a.m86002b(oVar, "concat_video");
            C43106a.m86003b(oVar, "concat_video", "new_concat_video");
        }
        return (MultiEditVideoRecordData) C63244g.m114602a().mo73262H().mo46667a((AbstractC28019l) oVar, MultiEditVideoRecordData.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MultiEditVideoRecordData mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85986a(lVar);
    }
}
