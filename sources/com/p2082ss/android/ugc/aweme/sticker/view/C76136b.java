package com.p2082ss.android.ugc.aweme.sticker.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.setting.C68118k;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.b */
public final class C76136b implements AbstractC45913a {
    static {
        Covode.recordClassIndex(89084);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a
    /* renamed from: a */
    public final AbstractC45920e mo77311a(Context context, int i) {
        C89219l.m154721d(context, "");
        C76113a aVar = new C76113a(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C70636dh.m124831b(context), C76113a.m133465a(context));
        layoutParams.gravity = 1;
        aVar.setLayoutParams(layoutParams);
        aVar.setDeltaX(i);
        if (C16048b.m29633a().mo25421a(true, "dmtborderlineview_do_software3", true) != C68118k.f152524a) {
            aVar.setLayerType(1, null);
        }
        C89219l.m154716b(aVar, "");
        return aVar;
    }
}
