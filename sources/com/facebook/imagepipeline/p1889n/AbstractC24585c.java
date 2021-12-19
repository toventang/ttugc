package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1889n.C24614t;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.c */
public abstract class AbstractC24585c<FETCH_STATE extends C24614t> implements AbstractC24529ag<FETCH_STATE> {
    static {
        Covode.recordClassIndex(28729);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i) {
        return null;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public void onFetchCompletion(FETCH_STATE fetch_state, int i) {
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public boolean shouldPropagate(FETCH_STATE fetch_state) {
        return true;
    }
}
