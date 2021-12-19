package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator */
public class AwemeViewPagerNavigator extends FrameLayout {

    /* renamed from: e */
    public static final String f181781e = AwemeViewPagerNavigator.class.getSimpleName();

    /* renamed from: a */
    public View f181782a;

    /* renamed from: b */
    public LinearLayout f181783b;

    /* renamed from: c */
    public int f181784c;

    /* renamed from: d */
    public View f181785d;

    /* renamed from: f */
    ViewPager f181786f;

    /* renamed from: g */
    public boolean f181787g;

    /* renamed from: h */
    private int f181788h;

    /* renamed from: i */
    private C81444l f181789i;

    /* renamed from: j */
    private FrameLayout f181790j;

    /* renamed from: k */
    private boolean f181791k;

    public int getAllTabWidth() {
        return this.f181788h;
    }

    public View getLastSelectedTab() {
        return this.f181785d;
    }

    public ViewPager getViewPager() {
        return this.f181786f;
    }

    public int getTabCount() {
        return this.f181783b.getChildCount();
    }

    static {
        Covode.recordClassIndex(94737);
    }

    public void setAllTabWidth(int i) {
        this.f181788h = i;
    }

    public void setScrollable(boolean z) {
        this.f181787g = z;
        this.f181789i.setScrollable(z);
    }

    private void setIndicatorPosition(int i) {
        if (this.f181782a != null) {
            float f = (float) (this.f181784c * i);
            Context context = getContext();
            if (context != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    f = -f;
                }
            }
            this.f181782a.setTranslationX(f);
        }
    }

    public AwemeViewPagerNavigator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AwemeViewPagerNavigator(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10594);
        this.f181788h = -1;
        this.f181791k = true;
        this.f181787g = true;
        C81444l lVar = new C81444l(getContext());
        this.f181789i = lVar;
        lVar.setScrollable(false);
        this.f181789i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f181789i);
        this.f181789i.setHorizontalFadingEdgeEnabled(false);
        this.f181789i.setHorizontalScrollBarEnabled(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f181790j = frameLayout;
        this.f181789i.addView(frameLayout, new ViewGroup.LayoutParams(-2, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f181783b = linearLayout;
        linearLayout.setOrientation(0);
        this.f181783b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f181790j.addView(this.f181783b);
        MethodCollector.m26664o(10594);
    }
}
