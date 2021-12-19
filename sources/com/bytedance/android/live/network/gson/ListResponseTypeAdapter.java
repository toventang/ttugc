package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import java.lang.reflect.Type;

public class ListResponseTypeAdapter extends AbsJsonDeserializer<C5831c> {
    static {
        Covode.recordClassIndex(6412);
    }

    public ListResponseTypeAdapter(C27910f fVar) {
        super(fVar);
    }

    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* synthetic */ Object mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        C28022o j = lVar.mo46789j();
        int g = j.mo46803c("status_code").mo46694g();
        if (g == 0) {
            return this.f14658a.mo46668a(lVar, type);
        }
        C5831c cVar = new C5831c();
        cVar.f14683a = g;
        cVar.f14685c = (Extra) this.f14658a.mo46667a(j.mo46803c("extra"), Extra.class);
        cVar.f14686d = (RequestError) this.f14658a.mo46667a(j.mo46803c("data"), RequestError.class);
        return cVar;
    }
}
