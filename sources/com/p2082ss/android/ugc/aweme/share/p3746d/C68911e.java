package com.p2082ss.android.ugc.aweme.share.p3746d;

import android.app.Activity;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.d.e */
public final class C68911e implements AbstractC1214u<Aweme> {
    static {
        Covode.recordClassIndex(81217);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Aweme aweme) {
        Activity j;
        String str;
        Aweme aweme2 = aweme;
        if (aweme2 != null && (j = C17873f.m33102j()) != null) {
            String aid = aweme2.getAid();
            Aweme aweme3 = C68909c.f154157e;
            if (aweme3 != null) {
                str = aweme3.getAid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) aid, (Object) str)) {
                C68909c.f154160h++;
            } else {
                C68909c.f154160h = 0;
            }
            AbstractC69693h hVar = C68863ah.f154028b.mo109356a(j, aweme2, C68909c.f154158f, "retry");
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.action.DownloadAction");
            ((C69070j) hVar).mo109538a(aweme2, j, C68909c.f154162j, C68909c.f154161i, false);
        }
    }
}
