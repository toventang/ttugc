package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.f */
final /* synthetic */ class RunnableC57632f implements Runnable {

    /* renamed from: a */
    private final HomeBottomTabView f131542a;

    /* renamed from: b */
    private final String f131543b;

    /* renamed from: c */
    private final String f131544c;

    /* renamed from: d */
    private final boolean f131545d = false;

    static {
        Covode.recordClassIndex(67593);
    }

    RunnableC57632f(HomeBottomTabView homeBottomTabView, String str, String str2) {
        this.f131542a = homeBottomTabView;
        this.f131543b = str;
        this.f131544c = str2;
    }

    public final void run() {
        HomeBottomTabView homeBottomTabView = this.f131542a;
        String str = this.f131543b;
        String str2 = this.f131544c;
        if (str2 == null) {
            str2 = "homepage_hot";
        }
        if (!TextUtils.equals(str, str2)) {
            if (homeBottomTabView.f131517c != null) {
                homeBottomTabView.f131517c.mo94940a(homeBottomTabView.f131516b, str);
            }
            if (!TextUtils.equals(str, "tab_publish")) {
                homeBottomTabView.mo94920a(str);
                homeBottomTabView.f131516b = str;
            }
        }
    }
}
