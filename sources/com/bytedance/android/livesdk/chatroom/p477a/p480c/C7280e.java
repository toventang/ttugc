package com.bytedance.android.livesdk.chatroom.p477a.p480c;

import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.e */
final /* synthetic */ class C7280e implements AbstractC88433f {

    /* renamed from: a */
    private final C7273a f18112a;

    /* renamed from: b */
    private final TextImageModel f18113b;

    static {
        Covode.recordClassIndex(8031);
    }

    C7280e(C7273a aVar, TextImageModel textImageModel) {
        this.f18112a = aVar;
        this.f18113b = textImageModel;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MethodCollector.m26663i(6649);
        C7273a aVar = this.f18112a;
        TextImageModel textImageModel = this.f18113b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            aVar.f18100g.setVisibility(8);
            aVar.f18101h.setVisibility(8);
            MethodCollector.m26664o(6649);
            return;
        }
        aVar.f18100g.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
        aVar.f18101h.setText(textImageModel.f27880a);
        aVar.f18101h.setTextColor(textImageModel.f27881b);
        aVar.f18100g.setVisibility(0);
        aVar.f18101h.setVisibility(0);
        if (aVar.f18095b != null) {
            aVar.f18095b.mo140678a(aVar.f18094a);
        }
        MethodCollector.m26664o(6649);
    }
}
