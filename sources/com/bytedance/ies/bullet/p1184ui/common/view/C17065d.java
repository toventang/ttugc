package com.bytedance.ies.bullet.p1184ui.common.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.view.d */
public final class C17065d extends FrameLayout implements AbstractC17051k.AbstractC17052a {

    /* renamed from: a */
    private HashMap f40614a;

    static {
        Covode.recordClassIndex(19515);
    }

    /* renamed from: a */
    private View m31537a(int i) {
        if (this.f40614a == null) {
            this.f40614a = new HashMap();
        }
        View view = (View) this.f40614a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f40614a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final View getTitleBarRoot() {
        return this;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final ImageView getBackView() {
        return (ImageView) m31537a(R.id.bsy);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final ImageView getCloseAllView() {
        return (ImageView) m31537a(R.id.bu6);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final ImageView getMoreButtonView() {
        return (ImageView) m31537a(R.id.bxm);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final ImageView getReportView() {
        return (ImageView) m31537a(R.id.byz);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final ImageView getShareView() {
        return (ImageView) m31537a(R.id.bzo);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final TextView getTitleView() {
        return (TextView) m31537a(R.id.f63);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final void setTitleBarBackgroundColor(int i) {
        ((FrameLayout) m31537a(R.id.ejs)).setBackgroundColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17065d(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(6354);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.lk, this, true);
        MethodCollector.m26664o(6354);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17052a
    public final void setDefaultTitle(CharSequence charSequence) {
        C89219l.m154719c(charSequence, "");
        TextView titleView = getTitleView();
        if (titleView != null) {
            CharSequence text = titleView.getText();
            C89219l.m154709a((Object) text, "");
            if (text.length() == 0) {
                titleView.setText(charSequence);
            }
        }
    }
}
