package com.p2082ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p2082ss.android.ugc.aweme.feed.widget.RectCornerRelativeLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.g */
public final class C49591g implements GalleryLayoutManager.AbstractC49579d {

    /* renamed from: a */
    public final Context f114092a;

    static {
        Covode.recordClassIndex(58437);
    }

    public C49591g(Context context) {
        C89219l.m154721d(context, "");
        this.f114092a = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.AbstractC49579d
    /* renamed from: a */
    public final void mo81345a(GalleryLayoutManager galleryLayoutManager, View view, float f) {
        C89219l.m154721d(galleryLayoutManager, "");
        C89219l.m154721d(view, "");
        if (f < -1.0f || f > 1.0f) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            view.setAlpha(0.34f);
            return;
        }
        float abs = ((1.0f - Math.abs(f)) * 0.100000024f) + 0.9f;
        float abs2 = ((1.0f - Math.abs(f)) * 1.0f) + 7.0f;
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setAlpha(((1.0f - Math.abs(f)) * 0.65999997f) + 0.34f);
        view.setTranslationY(C13628n.m24520b(this.f114092a, Math.abs(f) * 12.0f));
        RectCornerRelativeLayout rectCornerRelativeLayout = (RectCornerRelativeLayout) view.findViewById(R.id.aej);
        if (rectCornerRelativeLayout != null) {
            rectCornerRelativeLayout.setRadius((int) C13628n.m24520b(this.f114092a, abs2));
        }
    }
}
