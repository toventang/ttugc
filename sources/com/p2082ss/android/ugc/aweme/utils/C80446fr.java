package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.jato.C13556d;
import com.bytedance.common.jato.gcblocker.C13576b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.monitor.collector.C21478d;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.common.p2132c.C29822b;
import com.p2082ss.android.ugc.aweme.lego.C58254p;

/* renamed from: com.ss.android.ugc.aweme.utils.fr */
public final class C80446fr {

    /* renamed from: a */
    static int f180027a;

    /* renamed from: b */
    static int f180028b;

    /* renamed from: c */
    static int f180029c;

    /* renamed from: d */
    public static boolean f180030d;

    static {
        Covode.recordClassIndex(93714);
    }

    /* renamed from: a */
    public static boolean m139458a() {
        if (C13627m.m24499a(C17867d.f42595s, "local_test") || C13627m.m24499a(C17867d.f42595s, "rhea")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m139457a(Runnable runnable) {
        C58254p.f132679a.postDelayed(runnable, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    /* renamed from: a */
    public static void m139456a(long j) {
        C58254p.f132679a.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80446fr.RunnableC804471 */

            static {
                Covode.recordClassIndex(93715);
            }

            public final void run() {
                C13556d.m24356a();
                C13576b.m24384a().mo21844a("tt");
                C80446fr.f180027a++;
            }
        });
        C58254p.f132679a.postDelayed(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80446fr.RunnableC804482 */

            static {
                Covode.recordClassIndex(93716);
            }

            public final void run() {
                if (C80446fr.f180027a < 2) {
                    C13576b.m24384a().mo21845b("tt");
                }
                C80446fr.f180027a--;
            }
        }, j);
    }

    /* renamed from: b */
    public static void m139459b(long j) {
        C58254p.f132679a.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80446fr.RunnableC804504 */

            static {
                Covode.recordClassIndex(93718);
            }

            public final void run() {
                C29822b.f71163a = true;
                C29822b.f71165c = 0;
                C80446fr.f180028b++;
            }
        });
        C58254p.f132679a.postDelayed(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80446fr.RunnableC804515 */

            static {
                Covode.recordClassIndex(93719);
            }

            public final void run() {
                if (C80446fr.f180028b < 2) {
                    C29819a.m60075a();
                }
                C80446fr.f180028b--;
            }
        }, j);
    }

    /* renamed from: c */
    public static void m139460c(long j) {
        C21478d.f50922d = true;
        C21478d.f50924f = 1;
        f180029c++;
        C58254p.f132679a.postDelayed(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80446fr.RunnableC804537 */

            static {
                Covode.recordClassIndex(93721);
            }

            public final void run() {
                if (C80446fr.f180029c < 2) {
                    C21478d.f50922d = false;
                }
                C80446fr.f180029c--;
            }
        }, j);
    }
}
