package com.p2082ss.android.ugc.aweme.p2480cl;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.FeedInterceptTouchLayout;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cl.a */
public final class C36139a {

    /* renamed from: a */
    public static final SimpleDateFormat f85366a = new SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.getDefault());

    /* renamed from: b */
    public static final C36139a f85367b = new C36139a();

    private C36139a() {
    }

    static {
        Covode.recordClassIndex(43392);
    }

    /* renamed from: a */
    public static void m73618a(FrameLayout frameLayout, boolean z) {
        C89219l.m154721d(frameLayout, "");
        FeedInterceptTouchLayout feedInterceptTouchLayout = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.b17);
        if (feedInterceptTouchLayout != null) {
            feedInterceptTouchLayout.setGroupClickable(z);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout2 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.alb);
        if (feedInterceptTouchLayout2 != null) {
            feedInterceptTouchLayout2.setGroupClickable(z);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout3 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.a9t);
        if (feedInterceptTouchLayout3 != null) {
            feedInterceptTouchLayout3.setGroupClickable(z);
        }
    }
}
