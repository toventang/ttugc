package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.views.form.AbstractC38940b;
import com.p2082ss.android.ugc.aweme.commercialize.views.form.C38934a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.al */
public final class C38634al {

    /* renamed from: a */
    public static int f91293a = 1;

    /* renamed from: b */
    public static final C38634al f91294b = new C38634al();

    private C38634al() {
    }

    static {
        Covode.recordClassIndex(46175);
    }

    /* renamed from: a */
    public static final void m78393a(AbstractC0952i iVar, ViewGroup viewGroup, int i, boolean z) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(viewGroup, "");
        C38934a.C38935a.m79078a(iVar, viewGroup, i, z);
    }

    /* renamed from: a */
    public static final void m78394a(Aweme aweme, AbstractC38940b bVar, AbstractC0952i iVar, ViewGroup viewGroup, int i) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(viewGroup, "");
        Bundle c = C38739d.m78576c(aweme);
        C89219l.m154716b(c, "");
        C38934a a = C38934a.C38935a.m79076a(c);
        a.f91977c = bVar;
        C38934a.C38935a.m79077a(iVar, viewGroup, i, a);
    }
}
