package com.p2082ss.android.ugc.aweme.homepage.api.p3051ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.AbstractC15498b;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService */
public interface HomePageUIFrameService {
    static {
        Covode.recordClassIndex(62485);
    }

    /* renamed from: a */
    View.OnClickListener mo89378a(Context context, String str);

    /* renamed from: a */
    AbstractC15498b mo89379a(ActivityC0945e eVar);

    /* renamed from: a */
    AbstractC59108o mo89380a(Context context);

    /* renamed from: a */
    Class<? extends Activity> mo89381a();

    /* renamed from: a */
    void mo89382a(ActivityC0945e eVar, Bundle bundle);

    /* renamed from: a */
    void mo89383a(String str);

    /* renamed from: b */
    ImageView mo89384b(ActivityC0945e eVar);

    /* renamed from: b */
    AbstractC35329by mo89385b(Context context);

    /* renamed from: b */
    Class<? extends Fragment> mo89386b(String str);

    /* renamed from: b */
    void mo89387b();

    /* renamed from: c */
    View mo89388c();

    /* renamed from: c */
    View mo89389c(ActivityC0945e eVar);

    /* renamed from: c */
    C33931ar mo89390c(Context context);

    /* renamed from: d */
    View mo89391d();

    /* renamed from: d */
    ImageView mo89392d(ActivityC0945e eVar);

    /* renamed from: d */
    C33931ar mo89393d(Context context);

    /* renamed from: e */
    View mo89394e(ActivityC0945e eVar);

    /* renamed from: f */
    View mo89395f(ActivityC0945e eVar);

    /* renamed from: g */
    View mo89396g(ActivityC0945e eVar);

    String getTagForCurrentTabInMainPageFragment(TabChangeManager tabChangeManager, String str, String str2);

    /* renamed from: h */
    View mo89398h(ActivityC0945e eVar);

    /* renamed from: i */
    View mo89399i(ActivityC0945e eVar);

    /* renamed from: j */
    View mo89400j(ActivityC0945e eVar);

    /* renamed from: k */
    View mo89401k(ActivityC0945e eVar);

    void runInTabHostRunnable(AbstractC18234b bVar);

    void setTitleTabVisibility(boolean z);
}
