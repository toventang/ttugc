package com.bytedance.ugc.p1744a.p1745a;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23500c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ugc.a.a.b */
public final class C23491b extends C23500c.AbstractC23506e<ImageView> {

    /* renamed from: a */
    public static final C23491b f55697a = new C23491b();

    private C23491b() {
    }

    static {
        Covode.recordClassIndex(27493);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23506e
    /* renamed from: a */
    public final /* synthetic */ int mo38237a(ImageView imageView) {
        ImageView imageView2 = imageView;
        C89219l.m154719c(imageView2, "");
        return C23500c.AbstractC23501a.C23502a.m44203a(imageView2.getDrawable());
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23506e
    /* renamed from: b */
    public final /* synthetic */ ImageView mo38238b(View view) {
        C89219l.m154719c(view, "");
        if (!(view instanceof ImageView)) {
            view = null;
        }
        return (ImageView) view;
    }
}
