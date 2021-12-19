package com.p2082ss.android.ugc.aweme.utils;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.de */
public final class C80339de {

    /* renamed from: a */
    private final AbstractView$OnClickListenerC81441k f179869a = new AbstractView$OnClickListenerC81441k(300, 300) {
        /* class com.p2082ss.android.ugc.aweme.utils.C80339de.C803401 */

        /* renamed from: a */
        final /* synthetic */ int f179870a = 300;

        static {
            Covode.recordClassIndex(93608);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(View view) {
            C89219l.m154721d(view, "");
        }
    };

    static {
        Covode.recordClassIndex(93607);
    }

    /* renamed from: a */
    public final boolean mo123710a(View view) {
        C89219l.m154721d(view, "");
        if (!AbstractView$OnClickListenerC81441k.f182028b) {
            return false;
        }
        this.f179869a.onClick(view);
        return true;
    }
}
