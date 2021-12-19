package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a;

import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.f */
public final class C50446f {
    static {
        Covode.recordClassIndex(59582);
    }

    /* renamed from: a */
    public static final void m94620a(VideoSeekBar videoSeekBar, ViewGroup viewGroup) {
        int b = (int) C13628n.m24520b(videoSeekBar.getContext(), 20.0f);
        int b2 = (int) (C13628n.m24520b(videoSeekBar.getContext(), (float) C33403c.f79373c) - ((((float) b) - videoSeekBar.getProgressHeight()) / 2.0f));
        C50443c.m94607a(videoSeekBar, b, -1, b2, 80);
        C50443c.m94607a(viewGroup, -2, (int) C13628n.m24520b(videoSeekBar.getContext(), 264.0f), (int) (((float) b2) + C13628n.m24520b(videoSeekBar.getContext(), 56.0f)), 81);
    }
}
