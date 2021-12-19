package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$12$onSuccess$1 */
public final class ListenerAdaptExtKt$toKNListener$12$onSuccess$1 extends AbstractC89220m implements AbstractC89172b<CategoryPageModel, C89391z> {
    final /* synthetic */ ListenerAdaptExtKt$toKNListener$12 this$0;

    static {
        Covode.recordClassIndex(95742);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListenerAdaptExtKt$toKNListener$12$onSuccess$1(ListenerAdaptExtKt$toKNListener$12 listenerAdaptExtKt$toKNListener$12) {
        super(1);
        this.this$0 = listenerAdaptExtKt$toKNListener$12;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(CategoryPageModel categoryPageModel) {
        invoke(categoryPageModel);
        return C89391z.f203057a;
    }

    public final void invoke(CategoryPageModel categoryPageModel) {
        C89219l.m154719c(categoryPageModel, "");
        this.this$0.$oldListener.onSuccess(categoryPageModel);
    }
}
