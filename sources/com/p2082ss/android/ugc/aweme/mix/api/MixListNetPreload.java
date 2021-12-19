package com.p2082ss.android.ugc.aweme.mix.api;

import android.os.Bundle;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59399e;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59860g;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59412a;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59537a;
import java.io.Serializable;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.api.MixListNetPreload */
public final class MixListNetPreload implements AbstractC17788c<MixFeedApi, AbstractC88979t<C59399e>> {
    static {
        Covode.recordClassIndex(69777);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17789d
    public final boolean enable(Bundle bundle) {
        if (C59412a.m109111a() == 0 || C59412a.m109111a() == 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final C17794i getPreloadStrategy(Bundle bundle) {
        return new C17794i(0, C29736b.f70924e, false, 5);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final boolean handleException(Exception exc) {
        C89219l.m154721d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final AbstractC88979t<C59399e> preload(Bundle bundle, AbstractC89172b<? super Class<MixFeedApi>, ? extends MixFeedApi> bVar) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        String str4 = "";
        C89219l.m154721d(bVar, str4);
        String str5 = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("mix_video_list_params");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof C59537a)) {
            serializable = null;
        }
        C59537a aVar = (C59537a) serializable;
        if (aVar != null) {
            str = aVar.getMUsrId();
            str2 = aVar.getMSecUid();
            str3 = aVar.getMAid();
            str5 = aVar.getMixId();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        int i = C59860g.f136349a;
        if (!C13627m.m24498a(str3)) {
            i = C59860g.f136352d;
        }
        MixFeedApi mixFeedApi = (MixFeedApi) bVar.invoke(MixFeedApi.class);
        if (str5 == null) {
            str5 = str4;
        }
        if (str3 == null) {
            str3 = str4;
        }
        if (str == null) {
            str = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        return mixFeedApi.getMixVideos2(str5, str3, 0, i, str, str4);
    }
}
