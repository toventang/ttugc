package com.bytedance.android.livesdk.chatroom.p477a.p480c;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.c */
final /* synthetic */ class C7278c implements AbstractC88433f {

    /* renamed from: a */
    private final C7273a f18109a;

    /* renamed from: b */
    private final FansClubData f18110b;

    static {
        Covode.recordClassIndex(8029);
    }

    C7278c(C7273a aVar, FansClubData fansClubData) {
        this.f18109a = aVar;
        this.f18110b = fansClubData;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MethodCollector.m26663i(6798);
        C7273a aVar = this.f18109a;
        FansClubData fansClubData = this.f18110b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            aVar.f18098e.setVisibility(8);
            aVar.f18099f.setVisibility(8);
            MethodCollector.m26664o(6798);
            return;
        }
        aVar.f18098e.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
        aVar.f18099f.setText(fansClubData.clubName);
        aVar.f18098e.setVisibility(0);
        aVar.f18099f.setVisibility(0);
        if (aVar.f18095b != null) {
            aVar.f18095b.mo140678a(aVar.f18094a);
        }
        MethodCollector.m26664o(6798);
    }
}
