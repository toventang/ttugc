package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.aw */
public final class C1789aw implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1959);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        MethodCollector.m26663i(2355);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -2, -2);
        View view = new View(context);
        view.setId(R.id.co8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(12, -1);
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams);
        }
        View periscopeLayout = new PeriscopeLayout(context);
        periscopeLayout.setId(R.id.ctt);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, -22.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(periscopeLayout);
        if (periscopeLayout.getParent() == null) {
            relativeLayout.addView(periscopeLayout, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.cnm);
        frameLayout.setFocusable(false);
        frameLayout.setFocusableInTouchMode(false);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = R.id.co8;
            layoutParams3.addRule(0, R.id.co8);
        } else {
            i = R.id.co8;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(16, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context);
        smartCircleImageView.setId(R.id.cnl);
        smartCircleImageView.setFocusable(false);
        smartCircleImageView.setFocusableInTouchMode(false);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.fw), (int) resources.getDimension(R.dimen.fw));
        C1766a aVar = new C1766a();
        aVar.mo5576a("app:placeholderImage", new C1863a.C1865b("2131233154", "drawable"), smartCircleImageView, layoutParams4);
        aVar.mo5575a(smartCircleImageView, layoutParams4);
        C0174a.m578a(smartCircleImageView);
        if (smartCircleImageView.getParent() == null) {
            frameLayout.addView(smartCircleImageView, layoutParams4);
        }
        SmartCircleImageView smartCircleImageView2 = new SmartCircleImageView(context);
        smartCircleImageView2.setId(R.id.cxm);
        smartCircleImageView2.setFocusable(false);
        smartCircleImageView2.setFocusableInTouchMode(false);
        smartCircleImageView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.C0844d) layoutParams5).f3113a = 17;
        }
        C0174a.m578a(smartCircleImageView2);
        if (smartCircleImageView2.getParent() == null) {
            frameLayout.addView(smartCircleImageView2, layoutParams5);
        }
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            relativeLayout.addView(frameLayout, layoutParams3);
        }
        C0174a.m578a(relativeLayout);
        relativeLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.m26664o(2355);
        return relativeLayout;
    }
}
