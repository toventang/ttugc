package com.p2082ss.android.ugc.aweme.tools.draft.ftc.util;

import android.app.Activity;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78271b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.d */
public final class C78332d {
    static {
        Covode.recordClassIndex(91451);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.d$a */
    static final class RunnableC78333a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78332d f175926a;

        /* renamed from: b */
        final /* synthetic */ float f175927b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f175928c;

        static {
            Covode.recordClassIndex(91452);
        }

        RunnableC78333a(C78332d dVar, float f, VideoPublishEditModel videoPublishEditModel) {
            this.f175926a = dVar;
            this.f175927b = f;
            this.f175928c = videoPublishEditModel;
        }

        public final void run() {
            if (this.f175927b <= 100.0f && C78326c.f175914c) {
                C78332d.m136801a(C78271b.m136757a(2, this.f175928c, (int) this.f175927b));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.d$b */
    static final class RunnableC78334b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78332d f175929a;

        /* renamed from: b */
        final /* synthetic */ Activity f175930b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f175931c;

        static {
            Covode.recordClassIndex(91453);
        }

        RunnableC78334b(C78332d dVar, Activity activity, VideoPublishEditModel videoPublishEditModel) {
            this.f175929a = dVar;
            this.f175930b = activity;
            this.f175931c = videoPublishEditModel;
        }

        public final void run() {
            if (C78326c.f175915d) {
                new C23144b(this.f175930b).mo37632a().mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37640e(R.string.cse).mo37637b();
            } else {
                C78332d.m136801a(C78271b.m136757a(4, this.f175931c, 0));
            }
            C78326c.f175914c = false;
        }
    }

    /* renamed from: a */
    public static void m136801a(C78271b bVar) {
        AbstractC81915c.m141874a(new C78325b(bVar));
    }

    /* renamed from: a */
    public static void m136800a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        m136801a(C78271b.m136757a(1, videoPublishEditModel, 0));
        C78326c.f175914c = true;
    }

    /* renamed from: b */
    public static void m136802b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C78326c.f175914c = false;
        m136801a(C78271b.m136757a(5, videoPublishEditModel, 0));
    }

    /* renamed from: a */
    public final void mo122202a(Activity activity, VideoPublishEditModel videoPublishEditModel, float f) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(videoPublishEditModel, "");
        new Handler().post(new RunnableC78333a(this, f, videoPublishEditModel));
    }
}
