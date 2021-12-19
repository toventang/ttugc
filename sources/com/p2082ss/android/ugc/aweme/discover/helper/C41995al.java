package com.p2082ss.android.ugc.aweme.discover.helper;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.al */
public final class C41995al {

    /* renamed from: a */
    public static final C41995al f97940a = new C41995al();

    private C41995al() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.al$a */
    public static final class C41996a extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ float f97941a = 2.0f;

        static {
            Covode.recordClassIndex(49926);
        }

        C41996a() {
        }

        public final void getOutline(View view, Outline outline) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C13628n.m24520b(view.getContext(), this.f97941a));
        }
    }

    static {
        Covode.recordClassIndex(49925);
    }

    /* renamed from: a */
    public static void m84058a(View view) {
        C89219l.m154721d(view, "");
        if (Build.VERSION.SDK_INT >= 21 && view.getContext() != null) {
            view.setOutlineProvider(new C41996a());
            view.setClipToOutline(true);
        }
    }
}
