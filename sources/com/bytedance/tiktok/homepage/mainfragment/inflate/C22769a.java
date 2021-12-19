package com.bytedance.tiktok.homepage.mainfragment.inflate;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.C53308a;
import com.p2082ss.android.ugc.aweme.live.p3398a.C58487a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.inflate.a */
public final class C22769a {

    /* renamed from: a */
    public static final C22769a f53778a = new C22769a();

    private C22769a() {
    }

    static {
        Covode.recordClassIndex(26664);
    }

    /* renamed from: b */
    public static View m42953b(Context context) {
        C89219l.m154721d(context, "");
        return IMService.createIIMServicebyMonsterPlugin(false).getDmEntranceView(context, "homepage_hot");
    }

    /* renamed from: a */
    public static ImageView m42952a(Context context) {
        int i;
        MethodCollector.m26663i(7614);
        C89219l.m154721d(context, "");
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        boolean a = C58487a.m107308a();
        int a2 = C34728n.m70946a(10.0d);
        if (a) {
            i = C34728n.m70946a(16.0d);
            a2 = C34728n.m70946a(16.0d);
        } else {
            i = 0;
        }
        imageView.setPadding(i, a2, i, a2);
        imageView.setImageResource(2131232116);
        imageView.setVisibility(8);
        MethodCollector.m26664o(7614);
        return imageView;
    }

    /* renamed from: c */
    public static View m42954c(Context context) {
        int i;
        C89219l.m154721d(context, "");
        AnimatedImageView animatedImageView = new AnimatedImageView(context);
        animatedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (C53308a.f122372c) {
            i = 56;
        } else {
            i = 40;
        }
        double d = (double) i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C34728n.m70946a(d), C34728n.m70946a(d));
        layoutParams.setMargins(0, 0, C34728n.m70946a(8.0d), 0);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.setMarginEnd(C34728n.m70946a(8.0d));
        animatedImageView.setLayoutParams(layoutParams);
        return animatedImageView;
    }

    /* renamed from: e */
    public static View m42956e(Context context) {
        MethodCollector.m26663i(5638);
        C89219l.m154721d(context, "");
        int a = C34728n.m70946a(12.0d);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(a, a, a, a);
        imageView.setImageResource(2131232470);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(C34728n.m70946a(44.0d), C34728n.m70946a(44.0d)));
        MethodCollector.m26664o(5638);
        return imageView;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.inflate.a$a */
    static final class C22770a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C22770a f53779a = new C22770a();

        static {
            Covode.recordClassIndex(26665);
        }

        C22770a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.raw.icon_magnifying_glass_offset;
            aVar2.f54435e = Integer.valueOf((int) R.attr.aa);
            aVar2.f54436f = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public static View m42955d(Context context) {
        int a;
        C89219l.m154721d(context, "");
        C22999a a2 = C23005c.m43393a(C22770a.f53779a);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6);
        C17235c.m31810a(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(a2);
        tuxIconView.setClickable(true);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (SearchServiceImpl.m119336t().mo106221j()) {
            a = C34728n.m70946a(55.0d);
        } else {
            a = C34728n.m70946a(44.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.setMargins(0, 0, C34728n.m70946a(7.0d), 0);
        tuxIconView.setLayoutParams(layoutParams);
        return tuxIconView;
    }
}
