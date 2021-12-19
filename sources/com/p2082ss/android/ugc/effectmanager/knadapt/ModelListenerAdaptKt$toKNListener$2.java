package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.ModelEventListener;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt$toKNListener$2 */
public final class ModelListenerAdaptKt$toKNListener$2 implements AbstractC86799h {
    final /* synthetic */ ModelEventListener $oldListener;

    static {
        Covode.recordClassIndex(95764);
    }

    ModelListenerAdaptKt$toKNListener$2(ModelEventListener modelEventListener) {
        this.$oldListener = modelEventListener;
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h
    public final void onModelNotFound(Effect effect, Exception exc) {
        C89219l.m154719c(exc, "");
        this.$oldListener.onModelNotFound(new com.p2082ss.android.ugc.effectmanager.effect.model.Effect(effect), exc);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h
    public final void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
        C89219l.m154719c(effect, "");
        C89219l.m154719c(modelInfo, "");
        this.$oldListener.onModelDownloadStart(new com.p2082ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.p2082ss.android.ugc.effectmanager.model.ModelInfo(modelInfo));
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h
    public final void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
        C89219l.m154719c(effect, "");
        C89219l.m154719c(modelInfo, "");
        C89219l.m154719c(exc, "");
        this.$oldListener.onModelDownloadError(new com.p2082ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.p2082ss.android.ugc.effectmanager.model.ModelInfo(modelInfo), exc);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h
    public final void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j) {
        C89219l.m154719c(effect, "");
        C89219l.m154719c(modelInfo, "");
        this.$oldListener.onModelDownloadSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.Effect(effect), new com.p2082ss.android.ugc.effectmanager.model.ModelInfo(modelInfo), j);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h
    public final void onFetchModelList(boolean z, String str, long j, String str2) {
        this.$oldListener.onFetchModelList(z, str, j, str2);
    }
}
