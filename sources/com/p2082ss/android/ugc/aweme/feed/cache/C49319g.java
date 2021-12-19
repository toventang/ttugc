package com.p2082ss.android.ugc.aweme.feed.cache;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.experiment.C46819cz;
import com.p2082ss.android.ugc.aweme.experiment.C46822da;
import com.p2082ss.android.ugc.aweme.experiment.C46823db;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.utils.C80444fq;
import com.p2082ss.android.ugc.aweme.utils.EnumC80443fp;
import com.p2082ss.android.ugc.aweme.video.C81079v;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.g */
public final class C49319g {

    /* renamed from: a */
    public static boolean f113354a;

    /* renamed from: b */
    static volatile boolean f113355b;

    /* renamed from: c */
    static volatile boolean f113356c;

    /* renamed from: d */
    public static final C49319g f113357d = new C49319g();

    private C49319g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.g$a */
    public static final class RunnableC49320a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f113358a;

        static {
            Covode.recordClassIndex(58121);
        }

        RunnableC49320a(Aweme aweme) {
            this.f113358a = aweme;
        }

        public final void run() {
            C49319g.m92396a(this.f113358a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.g$b */
    public static final class RunnableC49321b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f113359a;

        static {
            Covode.recordClassIndex(58122);
        }

        RunnableC49321b(Aweme aweme) {
            this.f113359a = aweme;
        }

        public final void run() {
            C49319g.m92396a(this.f113359a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.g$c */
    public static final class RunnableC49322c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f113360a;

        static {
            Covode.recordClassIndex(58123);
        }

        RunnableC49322c(Aweme aweme) {
            this.f113360a = aweme;
        }

        public final void run() {
            C49319g.m92396a(this.f113360a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.g$d */
    public static final class RunnableC49323d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f113361a;

        static {
            Covode.recordClassIndex(58124);
        }

        RunnableC49323d(Aweme aweme) {
            this.f113361a = aweme;
        }

        public final void run() {
            C49319g.m92396a(this.f113361a);
        }
    }

    static {
        Covode.recordClassIndex(58120);
    }

    /* renamed from: a */
    public static boolean m92398a() {
        if (!f113355b || !f113356c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m92396a(Aweme aweme) {
        if (aweme != null && aweme.getVideo() != null && !f113354a) {
            if ((!C46819cz.f109071a || C58945a.C58947b.f134185a.f134176c) && C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.PLAYER_FIRST_VIDEO_PREPARED)) {
                C58945a.C58947b.f134185a.mo96429b("feed_player_to_render", false);
                C58945a.C58947b.f134185a.mo96429b("feed_get_cache_to_render", false);
                C58945a.C58947b.f134185a.mo96425a("feed_get_cache_render_duration", false);
                C81079v.m140776O().mo123944b(aweme);
                C58945a.C58947b.f134185a.mo96429b("feed_get_cache_render_duration", false);
                C58945a.C58947b.f134185a.mo96425a("feed_render_to_focus", false);
                C58945a.C58947b.f134185a.mo96425a("feed_render_to_ui", false);
            }
        }
    }

    /* renamed from: a */
    public static void m92397a(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null && feedItemList.getItems().size() > 0 && m92398a()) {
            Aweme aweme = feedItemList.getItems().get(0);
            if (!C46823db.f109077a) {
                C40780g.m82241a().execute(new RunnableC49320a(aweme));
            } else if (C13628n.m24517a()) {
                if (C46822da.f109076a) {
                    new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC49321b(aweme));
                } else {
                    m92396a(aweme);
                }
            } else if (C46822da.f109076a) {
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC49322c(aweme));
            } else {
                ExecutorC34605m.f81660a.execute(new RunnableC49323d(aweme));
            }
        }
    }
}
