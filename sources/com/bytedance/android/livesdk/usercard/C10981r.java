package com.bytedance.android.livesdk.usercard;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.usercard.r */
final /* synthetic */ class C10981r implements AbstractC88433f {

    /* renamed from: a */
    private final View$OnClickListenerC10973o f26443a;

    static {
        Covode.recordClassIndex(12596);
    }

    C10981r(View$OnClickListenerC10973o oVar) {
        this.f26443a = oVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        View$OnClickListenerC10973o oVar = this.f26443a;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && oVar.f26424i) {
            oVar.f26436z.setBackgroundDrawable(new BitmapDrawable(bitmap));
            C13628n.m24511a(oVar.f26436z, -3, (int) C13628n.m24520b(C3966y.m9669e(), 106.0f));
            C13628n.m24512a(oVar.f26436z, (int) C13628n.m24520b(C3966y.m9669e(), 25.0f), -3, -3);
            oVar.f26436z.setVisibility(0);
            C24246a aVar = (C24246a) oVar.f26436z.getHierarchy();
            aVar.mo39958a(C24229q.AbstractC24231b.f57452b);
            oVar.f26436z.setHierarchy(aVar);
            C13628n.m24512a(oVar.f26403A, (int) C13628n.m24520b(C3966y.m9669e(), 75.0f), -3, -3);
            oVar.f26403A.setVisibility(0);
            oVar.f26403A.setBackgroundColor(-1);
        }
    }
}
