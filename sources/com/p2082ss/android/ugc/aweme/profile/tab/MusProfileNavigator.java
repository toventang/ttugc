package com.p2082ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0974l;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator */
public class MusProfileNavigator extends RelativeLayout {

    /* renamed from: a */
    public LinearLayout f144843a;

    /* renamed from: b */
    public View f144844b;

    /* renamed from: c */
    public View f144845c;

    /* renamed from: d */
    boolean f144846d;

    /* renamed from: e */
    AbstractC0974l f144847e;

    /* renamed from: f */
    public boolean f144848f = true;

    /* renamed from: g */
    private ViewPager.AbstractC1579e f144849g;

    /* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator$a */
    public interface AbstractC63898a {
        static {
            Covode.recordClassIndex(75327);
        }

        /* renamed from: a */
        void mo103445a(int i);

        /* renamed from: b */
        void mo103446b(int i);
    }

    static {
        Covode.recordClassIndex(75321);
    }

    public int getTabCount() {
        return this.f144843a.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f144843a = (LinearLayout) findViewById(R.id.edx);
        this.f144845c = findViewById(R.id.chr);
    }

    public void setScrollable(boolean z) {
        this.f144848f = z;
    }

    /* renamed from: a */
    public final View mo103435a(int i) {
        return this.f144843a.getChildAt(i);
    }

    public MusProfileNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(8492);
        MethodCollector.m26664o(8492);
    }

    /* renamed from: a */
    public final void mo103436a(int i, float f, View view) {
        if (C34729o.m70957a(view)) {
            View a = mo103435a(i);
            View a2 = mo103435a(i + 1);
            if (a != null && a.getVisibility() == 0 && a2 != null && a2.getVisibility() == 0) {
                float x = (a.getX() + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f * (((a2.getX() + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (C34729o.m70957a(a)) {
                view.setX(((getX() + a.getX()) + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0108  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103437a(final androidx.viewpager.widget.ViewPager r9, boolean r10, final com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator.AbstractC63898a r11) {
        /*
        // Method dump skipped, instructions count: 386
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator.mo103437a(androidx.viewpager.widget.ViewPager, boolean, com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator$a):void");
    }
}
