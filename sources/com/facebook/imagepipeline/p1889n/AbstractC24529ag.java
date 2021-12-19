package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.C24614t;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.ag */
public interface AbstractC24529ag<FETCH_STATE extends C24614t> {

    /* renamed from: com.facebook.imagepipeline.n.ag$a */
    public interface AbstractC24530a {
        static {
            Covode.recordClassIndex(28674);
        }

        /* renamed from: a */
        void mo40400a();

        /* renamed from: a */
        void mo40401a(InputStream inputStream, int i);

        /* renamed from: a */
        void mo40402a(Throwable th);
    }

    static {
        Covode.recordClassIndex(28673);
    }

    FETCH_STATE createFetchState(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar);

    void fetch(FETCH_STATE fetch_state, AbstractC24530a aVar);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i);

    void onFetchCompletion(FETCH_STATE fetch_state, int i);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
