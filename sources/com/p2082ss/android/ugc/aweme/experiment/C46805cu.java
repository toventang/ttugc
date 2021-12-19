package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.cu */
public final class C46805cu {

    /* renamed from: a */
    public static boolean f109044a = C16048b.m29633a().mo25421a(true, "feed_page_selected_optimize", false);

    /* renamed from: b */
    public static int f109045b = C16048b.m29633a().mo25412a(true, "feed_page_selected_mode_optimize", 0);

    /* renamed from: c */
    public static boolean f109046c = C16048b.m29633a().mo25421a(true, "feed_page_selected_do_frame_optimize", false);

    /* renamed from: a */
    public static boolean m90143a() {
        if (f109045b == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(55406);
    }
}
