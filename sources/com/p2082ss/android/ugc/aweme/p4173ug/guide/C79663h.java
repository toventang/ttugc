package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.experiment.C46972gg;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.p4182a.C79640a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.h */
public final class C79663h {

    /* renamed from: a */
    private final AbstractC49849am f178768a;

    static {
        Covode.recordClassIndex(92879);
    }

    public C79663h(AbstractC49849am amVar) {
        C89219l.m154721d(amVar, "");
        this.f178768a = amVar;
    }

    /* renamed from: a */
    public final boolean mo123211a(Activity activity, Aweme aweme) {
        C89219l.m154721d(activity, "");
        if (C16048b.m29633a().mo25412a(true, "interction_share_button_whatsapp_style", 0) == 0 && !C79640a.C79641a.m138452a(activity) && !C37699a.m76314s(aweme) && C79657g.m138468d(aweme) && !C46972gg.m90250a()) {
            return this.f178768a.mo70439E();
        }
        return false;
    }
}
