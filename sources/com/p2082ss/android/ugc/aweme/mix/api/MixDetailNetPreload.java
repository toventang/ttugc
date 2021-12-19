package com.p2082ss.android.ugc.aweme.mix.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59398d;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59412a;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59537a;
import java.io.Serializable;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.api.MixDetailNetPreload */
public final class MixDetailNetPreload implements AbstractC17788c<MixFeedApi, AbstractC88403ab<C59398d>> {
    static {
        Covode.recordClassIndex(69773);
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
    public final AbstractC88403ab<C59398d> preload(Bundle bundle, AbstractC89172b<? super Class<MixFeedApi>, ? extends MixFeedApi> bVar) {
        Serializable serializable;
        String str;
        String str2;
        String str3 = "";
        C89219l.m154721d(bVar, str3);
        String str4 = null;
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
            aVar.getMAid();
            str4 = aVar.getMixId();
        } else {
            str = null;
            str2 = null;
        }
        MixFeedApi mixFeedApi = (MixFeedApi) bVar.invoke(MixFeedApi.class);
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        if (str4 != null) {
            str3 = str4;
        }
        return mixFeedApi.getMixDetail(str, str2, str3);
    }
}
