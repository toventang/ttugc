package com.bytedance.tiktok.homepage.mainfragment.inflate;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.live.p3398a.C58487a;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class MainFragmentTopLeftIconInflate implements AbstractC58258q {

    /* renamed from: a */
    public ImageView f53773a;

    static {
        Covode.recordClassIndex(26662);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "inflate_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return EnumC58150ad.INFLATE;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: b */
    public final Class<? extends Activity> mo28743b() {
        return HomePageUIFrameServiceImpl.m108627e().mo89381a();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public final void mo37082c() {
        boolean a = C58487a.m107308a();
        int a2 = C34728n.m70946a(24.0d);
        int a3 = C34728n.m70946a(44.0d);
        if (a) {
            a2 = C34728n.m70946a(56.0d);
            a3 = C34728n.m70946a(56.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a3);
        if (!a) {
            if (!C77260g.f173332a.mo120161i()) {
                layoutParams.setMargins(C34728n.m70946a(16.0d), 0, 0, 0);
                int i = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(C34728n.m70946a(16.0d));
            } else {
                layoutParams.setMargins(0, 0, C34728n.m70946a(16.0d), 0);
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(C34728n.m70946a(16.0d));
            }
        }
        if (C16048b.m29633a().mo25421a(true, "optimize_feed_tab_layout", false)) {
            layoutParams.topMargin = C34728n.m70946a(-3.0d);
        }
        ImageView imageView = this.f53773a;
        if (imageView == null) {
            C89219l.m154715b();
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: a */
    public final void mo28741a(Context context, Activity activity) {
        C89219l.m154721d(context, "");
        if (activity != null) {
            context = activity;
        }
        this.f53773a = C22769a.m42952a(context);
        if (C67248d.m119180h()) {
            mo37082c();
        }
    }
}
