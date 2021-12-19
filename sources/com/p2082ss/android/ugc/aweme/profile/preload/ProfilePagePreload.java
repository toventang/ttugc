package com.p2082ss.android.ugc.aweme.profile.preload;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import java.util.ArrayList;
import java.util.concurrent.Future;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.preload.ProfilePagePreload */
public final class ProfilePagePreload implements AbstractC17788c<Api.NetApi, Future<String>> {
    static {
        Covode.recordClassIndex(75243);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17789d
    public final boolean enable(Bundle bundle) {
        if (bundle == null || bundle.getString("preload_profile_page_url") == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final boolean handleException(Exception exc) {
        C89219l.m154721d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final C17794i getPreloadStrategy(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("profile_aweme_ttl")) {
            return new C17794i(0, Api.f79771d, false, 5);
        }
        return new C17794i(bundle.getInt("profile_aweme_ttl"), Api.f79771d, false);
    }

    /* Return type fixed from 'com.google.c.h.a.q<java.lang.String>' to match base method */
    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final Future<String> preload(Bundle bundle, AbstractC89172b<? super Class<Api.NetApi>, ? extends Api.NetApi> bVar) {
        String str;
        C89219l.m154721d(bVar, "");
        Parcelable parcelable = null;
        if (bundle != null) {
            str = bundle.getString("preload_profile_page_url");
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (bundle != null) {
            parcelable = bundle.getParcelable("preload_profile_page_extra_info");
        }
        AbstractFutureC27655q<String> doGet = ((Api.NetApi) bVar.invoke(Api.NetApi.class)).doGet(str, arrayList, parcelable);
        C89219l.m154716b(doGet, "");
        return doGet;
    }
}
