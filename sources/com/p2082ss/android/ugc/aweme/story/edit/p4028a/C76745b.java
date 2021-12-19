package com.p2082ss.android.ugc.aweme.story.edit.p4028a;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.view.C76113a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.a.b */
public final class C76745b implements AbstractC45913a {

    /* renamed from: a */
    public static final C76745b f172256a = new C76745b();

    private C76745b() {
    }

    static {
        Covode.recordClassIndex(89741);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a
    /* renamed from: a */
    public final AbstractC45920e mo77311a(Context context, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        C76741a aVar = new C76741a(context, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C70636dh.m124831b(context), C76113a.m133465a(context));
        layoutParams.gravity = 1;
        aVar.setLayoutParams(layoutParams);
        aVar.setDeltaX(i);
        aVar.setLayerType(1, null);
        return aVar;
    }
}
