package com.bytedance.ugc.p1744a.p1745a;

import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23500c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ugc.a.a.c */
public final class C23492c extends C23500c.AbstractC23506e<ProgressBar> {

    /* renamed from: a */
    public static final C23492c f55698a = new C23492c();

    private C23492c() {
    }

    static {
        Covode.recordClassIndex(27494);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23506e
    /* renamed from: a */
    public final /* synthetic */ int mo38237a(ProgressBar progressBar) {
        ProgressBar progressBar2 = progressBar;
        C89219l.m154719c(progressBar2, "");
        return C23500c.AbstractC23501a.C23502a.m44203a(progressBar2.getProgressDrawable());
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23506e
    /* renamed from: b */
    public final /* synthetic */ ProgressBar mo38238b(View view) {
        C89219l.m154719c(view, "");
        if (!(view instanceof ProgressBar)) {
            view = null;
        }
        return (ProgressBar) view;
    }
}
