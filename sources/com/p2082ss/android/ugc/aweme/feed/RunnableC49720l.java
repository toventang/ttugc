package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.experiment.C46890em;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.utils.C80304cm;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.l */
public final /* synthetic */ class RunnableC49720l implements Runnable {

    /* renamed from: a */
    public static final Runnable f114426a = new RunnableC49720l();

    static {
        Covode.recordClassIndex(58569);
    }

    private RunnableC49720l() {
    }

    public final void run() {
        if (C49710k.f114395c != null && C49710k.f114395c.booleanValue()) {
            C49710k.f114396d = true;
            if (C49710k.f114393a == null) {
                C49710k.m93122a("no_request", "");
                C49710k.m93125b("no_request", "");
            } else if (C49710k.m93126b()) {
                C49710k.m93122a("no_repsonse", "");
                C34608n.m70658a().mo61083a(new C49710k.HandlerC49716c(), new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.C49710k.CallableC497133 */

                    static {
                        Covode.recordClassIndex(58562);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Runnable runnable;
                        FeedItemList c = C49710k.m93127c();
                        if (C46890em.m90194a() && (runnable = RunnableC49814q.f114751a) != null) {
                            try {
                                runnable.run();
                            } catch (Exception e) {
                                C80304cm.m139209a(e, "executeMethodSafely", "ExceptionHelper", "executeMethodSafely");
                            }
                        }
                        return c;
                    }
                }, 0);
            } else if (!C49710k.f114393a.booleanValue()) {
                C49710k.m93122a("valid_response", "");
            } else {
                C49710k.m93122a("exception", "");
            }
        }
    }
}
