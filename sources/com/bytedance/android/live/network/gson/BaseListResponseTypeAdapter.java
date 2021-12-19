package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import java.lang.reflect.Type;

public class BaseListResponseTypeAdapter extends AbsJsonDeserializer<C5827a> {
    static {
        Covode.recordClassIndex(6410);
    }

    public BaseListResponseTypeAdapter(C27910f fVar) {
        super(fVar);
    }

    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* synthetic */ Object mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        C5827a aVar = (C5827a) this.f14658a.mo46668a(lVar, type);
        if (aVar.f14683a != 0) {
            aVar.f14686d = (RequestError) this.f14658a.mo46667a(lVar.mo46789j().mo46803c("data"), RequestError.class);
        }
        return aVar;
    }
}
