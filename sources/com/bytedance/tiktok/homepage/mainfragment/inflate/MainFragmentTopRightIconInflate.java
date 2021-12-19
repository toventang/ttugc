package com.bytedance.tiktok.homepage.mainfragment.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class MainFragmentTopRightIconInflate implements AbstractC58258q {

    /* renamed from: a */
    private View f53774a;

    /* renamed from: b */
    private ImageView f53775b;

    /* renamed from: c */
    private AnimatedImageView f53776c;

    /* renamed from: d */
    private ImageView f53777d;

    static {
        Covode.recordClassIndex(26663);
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

    /* renamed from: a */
    public final View mo37083a(Context context, int i) {
        View view;
        C89219l.m154721d(context, "");
        if (i == 3) {
            view = this.f53774a;
            if (view == null) {
                view = C22769a.m42953b(context);
            }
            this.f53774a = null;
        } else if (i == 4) {
            view = this.f53775b;
            if (view == null) {
                view = C22769a.m42955d(context);
            }
            this.f53775b = null;
        } else if (i != 5) {
            view = this.f53777d;
            if (view == null) {
                view = C22769a.m42956e(context);
            }
            this.f53777d = null;
        } else {
            view = this.f53776c;
            if (view == null) {
                view = C22769a.m42954c(context);
            }
            this.f53776c = null;
        }
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: a */
    public final void mo28741a(Context context, Activity activity) {
        Activity activity2;
        Activity activity3;
        C89219l.m154721d(context, "");
        if (activity != null) {
            activity2 = activity;
        } else {
            activity2 = context;
        }
        this.f53775b = (ImageView) C22769a.m42955d(activity2);
        if (activity != null) {
            activity3 = activity;
        } else {
            activity3 = context;
        }
        this.f53776c = (AnimatedImageView) C22769a.m42954c(activity3);
        if (activity != null) {
            context = activity;
        }
        this.f53777d = (ImageView) C22769a.m42956e(context);
    }
}
