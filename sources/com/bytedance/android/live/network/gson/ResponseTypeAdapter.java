package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import java.lang.reflect.Type;

public class ResponseTypeAdapter extends AbsJsonDeserializer<C5832d> {
    static {
        Covode.recordClassIndex(6413);
    }

    public ResponseTypeAdapter(C27910f fVar) {
        super(fVar);
    }

    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* synthetic */ Object mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        C5832d dVar = (C5832d) this.f14658a.mo46668a(lVar, type);
        if (dVar.statusCode != 0) {
            dVar.error = (RequestError) this.f14658a.mo46667a(lVar.mo46789j().mo46803c("data"), RequestError.class);
        }
        return dVar;
    }
}
