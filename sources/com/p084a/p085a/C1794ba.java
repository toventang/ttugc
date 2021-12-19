package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ba */
public final class C1794ba implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1964);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1568);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ald);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -2);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(R.drawable.a01);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.dxn);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.fx), (int) resources.getDimension(R.dimen.fu));
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.dxv);
        remoteImageView.setImageResource(2131233153);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -1);
        C0174a.m578a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            frameLayout.addView(remoteImageView, layoutParams2);
        }
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources.getColor(R.color.iu));
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        tuxTextView.setId(R.id.dxq);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, -1.4f, resources.getDisplayMetrics());
        }
        tuxTextView.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Semibold"), tuxTextView, layoutParams3);
        C79467f.m138187a(tuxTextView, layoutParams3);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams3);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(1568);
        return linearLayout;
    }
}
