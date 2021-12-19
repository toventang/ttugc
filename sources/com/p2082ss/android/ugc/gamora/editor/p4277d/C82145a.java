package com.p2082ss.android.ugc.gamora.editor.p4277d;

import android.app.Activity;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.d.a */
public final class C82145a {

    /* renamed from: a */
    public static final C82145a f183787a = new C82145a();

    private C82145a() {
    }

    static {
        Covode.recordClassIndex(95973);
    }

    /* renamed from: a */
    public static final boolean m142163a(Activity activity) {
        C89219l.m154721d(activity, "");
        Resources resources = activity.getResources();
        C89219l.m154716b(resources, "");
        if (resources.getDisplayMetrics().density <= 1.5f) {
            return true;
        }
        return false;
    }
}
