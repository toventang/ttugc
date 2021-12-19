package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer */
public final class MultiEditVideoSegmentRecordDataDeserializer implements AbstractC28018k<MultiEditVideoSegmentRecordData> {

    /* renamed from: a */
    public static final C43102a f100446a = new C43102a((byte) 0);

    static {
        Covode.recordClassIndex(51264);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer$a */
    public static final class C43102a {
        static {
            Covode.recordClassIndex(51265);
        }

        private C43102a() {
        }

        public /* synthetic */ C43102a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static MultiEditVideoSegmentRecordData m85990a(AbstractC28019l lVar) {
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
            C43106a.m86002b(oVar, "video_path");
            C43106a.m86003b(oVar, "video_path", "new_video_path");
        }
        if (oVar != null) {
            C43106a.m86002b(oVar, "draft_video_path");
            C43106a.m86003b(oVar, "draft_video_path", "new_draft_video_path");
        }
        return (MultiEditVideoSegmentRecordData) new C27910f().mo46667a((AbstractC28019l) oVar, MultiEditVideoSegmentRecordData.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MultiEditVideoSegmentRecordData mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85990a(lVar);
    }
}
