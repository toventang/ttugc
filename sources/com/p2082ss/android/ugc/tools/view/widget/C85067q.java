package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.q */
public final class C85067q {
    static {
        Covode.recordClassIndex(99088);
    }

    /* renamed from: a */
    public static final void m146266a(TabLayout tabLayout, int i) {
        C89219l.m154721d(tabLayout, "");
        int i2 = 0;
        if (i <= 1) {
            tabLayout.setHideIndicatorView(true);
        } else {
            tabLayout.setHideIndicatorView(false);
        }
        if (i <= 4 && i > 1) {
            i2 = 1;
        }
        tabLayout.setTabMode(i2);
    }

    /* renamed from: a */
    public static final void m146267a(TabLayout tabLayout, int i, List<String> list) {
        float f;
        C89219l.m154721d(tabLayout, "");
        m146266a(tabLayout, i);
        if (!C84904k.m145909a(list)) {
            Paint paint = new Paint();
            Context context = tabLayout.getContext();
            C89219l.m154716b(context, "");
            paint.setTextSize(C84912r.m145930a(context, 15.0f));
            int i2 = 0;
            for (String str : list) {
                if (str != null) {
                    f = paint.measureText(str);
                } else {
                    f = 0.0f;
                }
                if (f > ((float) i2)) {
                    i2 = (int) f;
                }
            }
            Context context2 = tabLayout.getContext();
            C89219l.m154716b(context2, "");
            if (((float) i2) > C84912r.m145930a(context2, 50.0f) && i > 2) {
                tabLayout.setTabMode(0);
            }
        }
    }
}
