package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvCreateVideoDataDeserializer */
public final class MvCreateVideoDataDeserializer implements AbstractC28018k<C61288d> {

    /* renamed from: a */
    public static final C43103a f100447a = new C43103a((byte) 0);

    static {
        Covode.recordClassIndex(51267);
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvCreateVideoDataDeserializer$a */
    public static final class C43103a {
        static {
            Covode.recordClassIndex(51268);
        }

        private C43103a() {
        }

        public /* synthetic */ C43103a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static C61288d m85994a(AbstractC28019l lVar) {
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
            C43106a.m86000a(oVar, "select_media_list");
            C43106a.m86001a(oVar, "select_media_list", "new_select_media_list");
        }
        if (oVar != null) {
            C43106a.m86000a(oVar, "select_src_media_list");
            C43106a.m86001a(oVar, "select_src_media_list", "new_select_src_media_list");
        }
        if (oVar != null) {
            C43106a.m86000a(oVar, "photo_to_save");
            C43106a.m86001a(oVar, "photo_to_save", "new_photo_to_save");
        }
        if (oVar != null) {
            C43106a.m86002b(oVar, "mv_contact_video_path");
            C43106a.m86003b(oVar, "mv_contact_video_path", "new_mv_contact_video_path");
        }
        return (C61288d) C63244g.m114602a().mo73262H().mo46667a((AbstractC28019l) oVar, C61288d.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C61288d mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m85994a(lVar);
    }
}
