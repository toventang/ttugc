package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.IFetchModelListener;
import com.p2082ss.android.ugc.effectmanager.ModelEventListener;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt */
public final class ModelListenerAdaptKt {
    static {
        Covode.recordClassIndex(95762);
    }

    public static final AbstractC86796e<String[]> toKNListener(IFetchModelListener iFetchModelListener) {
        if (iFetchModelListener == null) {
            return null;
        }
        return new ModelListenerAdaptKt$toKNListener$1(iFetchModelListener);
    }

    public static final AbstractC86799h toKNListener(ModelEventListener modelEventListener) {
        if (modelEventListener == null) {
            return null;
        }
        return new ModelListenerAdaptKt$toKNListener$2(modelEventListener);
    }
}
