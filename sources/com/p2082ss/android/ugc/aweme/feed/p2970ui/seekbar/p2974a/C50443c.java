package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.c */
public final class C50443c {
    static {
        Covode.recordClassIndex(59579);
    }

    /* renamed from: a */
    public static final boolean m94608a(Aweme aweme) {
        VideoControl videoControl;
        if (aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.showProgressBar == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m94612d(Aweme aweme) {
        VideoControl videoControl;
        if (aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.draftProgressBar == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m94605a(View view) {
        C89219l.m154721d(view, "");
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
    }

    /* renamed from: b */
    public static final boolean m94610b(Aweme aweme) {
        if (m94611c(aweme)) {
            return false;
        }
        if (C50435a.m94589a()) {
            return true;
        }
        if (C50435a.m94589a() || !m94612d(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m94611c(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if ((aweme.getAwemeRawAd() == null || !aweme.isAd()) && !aweme.isLive()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m94609a(String str) {
        if ((C89219l.m154714a((Object) "homepage_hot", (Object) str) || C89219l.m154714a((Object) "homepage_follow", (Object) str) || C89219l.m154714a((Object) "homepage_learn", (Object) str)) && (ActivityStack.getValidTopActivity() instanceof AbstractC59103j)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m94607a(View view, int i, int i2, int i3, int i4) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (C89219l.m154714a(layoutParams, layoutParams2)) {
            layoutParams.width = i2;
            layoutParams.height = i;
            layoutParams2.gravity = i4;
            layoutParams2.bottomMargin = i3;
        } else {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            if (C89219l.m154714a(layoutParams, layoutParams3)) {
                layoutParams.width = i2;
                layoutParams.height = i;
                if ((i4 & 80) != 0) {
                    layoutParams3.addRule(12);
                }
                if ((i4 & 1) != 0) {
                    layoutParams3.addRule(14);
                }
                layoutParams2.bottomMargin = i3;
            } else {
                layoutParams.width = i2;
                layoutParams.height = i;
                layoutParams2.bottomMargin = i3;
            }
        }
        view.setLayoutParams(layoutParams);
    }
}
