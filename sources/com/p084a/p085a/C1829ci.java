package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ci */
public final class C1829ci implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1999);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        MethodCollector.m26663i(3307);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.ckv);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, (int) TypedValue.applyDimension(1, 101.0f, resources.getDisplayMetrics()));
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.afs);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 85.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        C1766a aVar = new C1766a();
        aVar.mo5576a("app:roundedCornerRadius", new C1863a.C1867d("2", "dp"), remoteImageView, layoutParams);
        aVar.mo5576a("fresco:failureImage", new C1863a.C1865b("2131099674", C19386b.f45894a), remoteImageView, layoutParams);
        aVar.mo5576a("fresco:placeholderImage", new C1863a.C1865b("2131099674", C19386b.f45894a), remoteImageView, layoutParams);
        aVar.mo5575a(remoteImageView, layoutParams);
        C0174a.m578a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView, layoutParams);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i3 = Build.VERSION.SDK_INT;
            f = 16.0f;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, R.id.afs);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ckt);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(3);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        tuxTextView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView, layoutParams3);
        C79467f.m138187a(tuxTextView, layoutParams3);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout2.addView(tuxTextView, layoutParams3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.cku);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(3, R.id.ckt);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView2, layoutParams4);
        C79467f.m138187a(tuxTextView2, layoutParams4);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout2.addView(tuxTextView2, layoutParams4);
        }
        C0174a.m578a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams2);
        }
        C0174a.m578a(relativeLayout);
        relativeLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.m26664o(3307);
        return relativeLayout;
    }
}
