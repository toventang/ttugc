package com.p2082ss.android.ugc.aweme.feed.helper;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.l */
public class C49645l {

    /* renamed from: a */
    private static final int f114269a = R.id.e0x;

    /* renamed from: b */
    private static volatile C49645l f114270b;

    /* renamed from: a */
    private static String m93086a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "share_highlight_click" : "comment_highlight_click" : "like_highlight_click";
    }

    private C49645l() {
    }

    static {
        Covode.recordClassIndex(58492);
    }

    /* renamed from: a */
    public static C49645l m93085a() {
        MethodCollector.m26663i(4232);
        if (f114270b == null) {
            synchronized (C49645l.class) {
                try {
                    if (f114270b == null) {
                        f114270b = new C49645l();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4232);
                    throw th;
                }
            }
        }
        C49645l lVar = f114270b;
        MethodCollector.m26664o(4232);
        return lVar;
    }

    /* renamed from: a */
    private static boolean m93089a(ImageView imageView) {
        Boolean bool = (Boolean) imageView.getTag(f114269a);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    public static void m93090b(ImageView imageView, String str, String str2, String str3) {
        m93087a(imageView, 1, str, str2, str3, null);
    }

    /* renamed from: a */
    public static void m93088a(ImageView imageView, String str, String str2, String str3) {
        View findViewById = imageView.getRootView().findViewById(R.id.bvl);
        boolean z = false;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            z = true;
        }
        m93087a(imageView, 2, str, str2, str3, Boolean.valueOf(z));
        if (z) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    private static void m93087a(ImageView imageView, int i, String str, String str2, String str3, Boolean bool) {
        if (m93089a(imageView)) {
            C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("group_id", str2).mo59983a("author_id", str3).mo59983a("show_content", "");
            if (i == 2) {
                a.mo59980a("is_pop_up", bool.booleanValue() ? 1 : 0);
            }
            C39162r.m79460a(m93086a(i), a.f79943a);
        }
    }
}
