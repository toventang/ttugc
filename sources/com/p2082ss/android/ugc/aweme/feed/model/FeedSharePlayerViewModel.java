package com.p2082ss.android.ugc.aweme.feed.model;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel */
public final class FeedSharePlayerViewModel extends AbstractC1174ac {
    public static final Companion Companion = new Companion(null);
    public boolean hasBindCover;
    public AbstractC80747i player;

    static {
        Covode.recordClassIndex(58687);
    }

    public static final AbstractC80747i getPlayerManager(ActivityC0945e eVar) {
        return Companion.getPlayerManager(eVar);
    }

    public static final FeedSharePlayerViewModel getViewModel(ActivityC0945e eVar) {
        return Companion.getViewModel(eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58688);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        /* renamed from: com_ss_android_ugc_aweme_feed_model_FeedSharePlayerViewModel$Companion_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m93177xe3228389(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }

        public final AbstractC80747i getPlayerManager(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            return getViewModel(eVar).player;
        }

        public final FeedSharePlayerViewModel getViewModel(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = m93177xe3228389(eVar).mo3983a(FeedSharePlayerViewModel.class);
            C89219l.m154716b(a, "");
            return (FeedSharePlayerViewModel) a;
        }
    }
}
