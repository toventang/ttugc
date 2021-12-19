package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.google.gson.C27910f;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.NetworkServiceImpl */
public final class NetworkServiceImpl implements AbstractC63196au {
    static {
        Covode.recordClassIndex(79694);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au
    public final String getApiHost() {
        String str = C29736b.f70921b;
        C89219l.m154716b(str, "");
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au
    public final C27910f getRetrofitFactoryGson() {
        C27910f b = GsonHolder.m138943c().mo123620b();
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au
    public final <T> T createDefaultRetrofit(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return (T) RetrofitFactory.m33635a().mo28816a(getApiHost()).mo28858a(cls);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au
    public final <T> T retrofitCreate(String str, Class<T> cls) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        return (T) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(cls);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au
    public final <T> T createRetrofit(String str, boolean z, Class<T> cls) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        return (T) RetrofitFactory.m33635a().mo28817b(str).mo28829a(z).mo28832d().mo28858a(cls);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au
    public final <T> T createRetrofitWithInterceptors(String str, boolean z, Class<T> cls, List<? extends AbstractC22021a> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(list, "");
        return (T) RetrofitFactory.m33635a().mo28817b(str).mo28829a(z).mo28828a((List<AbstractC22021a>) list).mo28832d().mo28858a(cls);
    }
}
