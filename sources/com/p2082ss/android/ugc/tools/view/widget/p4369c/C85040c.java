package com.p2082ss.android.ugc.tools.view.widget.p4369c;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.C85058m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.c.c */
public final class C85040c {
    static {
        Covode.recordClassIndex(99061);
    }

    /* renamed from: a */
    public static final void m146217a(C85037b bVar, String str) {
        C89219l.m154721d(bVar, "");
        if (str != null && str.length() != 0) {
            C84402a.m145173a(bVar.getImageView(), str);
        }
    }

    /* renamed from: a */
    public static final void m146218a(C85037b bVar, boolean z) {
        C89219l.m154721d(bVar, "");
        bVar.setCustomSelected(z);
        TextView textView = bVar.getTextView();
        if (textView instanceof C85058m) {
            ((C85058m) textView).setMarqueeEnable(z);
        }
    }
}
