package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35574f;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.View$OnTouchListenerC35573e;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.o */
final /* synthetic */ class View$OnClickListenerC35649o implements View.OnClickListener {

    /* renamed from: a */
    private final ImageView f84080a;

    /* renamed from: b */
    private final ViewGroup f84081b;

    /* renamed from: c */
    private final TextView f84082c;

    /* renamed from: d */
    private final SpannableString f84083d;

    /* renamed from: e */
    private final Challenge f84084e;

    /* renamed from: f */
    private final boolean f84085f;

    /* renamed from: g */
    private final SpannableString f84086g;

    /* renamed from: h */
    private final TextView f84087h;

    static {
        Covode.recordClassIndex(42873);
    }

    View$OnClickListenerC35649o(ImageView imageView, ViewGroup viewGroup, TextView textView, SpannableString spannableString, Challenge challenge, boolean z, SpannableString spannableString2, TextView textView2) {
        this.f84080a = imageView;
        this.f84081b = viewGroup;
        this.f84082c = textView;
        this.f84083d = spannableString;
        this.f84084e = challenge;
        this.f84085f = z;
        this.f84086g = spannableString2;
        this.f84087h = textView2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0083 */
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ImageView imageView = this.f84080a;
        ViewGroup viewGroup = this.f84081b;
        TextView textView = this.f84082c;
        SpannableString spannableString = this.f84083d;
        Challenge challenge = this.f84084e;
        boolean z = this.f84085f;
        SpannableString spannableString2 = this.f84086g;
        TextView textView2 = this.f84087h;
        boolean isSelected = imageView.isSelected();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        if (!isSelected) {
            textView.setText(C35574f.m72678a(textView.getContext(), spannableString.toString(), challenge.getCid(), challenge.getChallengeName()));
            textView.setOnTouchListener(View$OnTouchListenerC35573e.m72677a());
            imageView.setImageResource(C35646l.m72755a(isSelected));
            if (z) {
                marginLayoutParams.bottomMargin = (int) C13628n.m24520b(imageView.getContext(), 20.0f);
            } else {
                marginLayoutParams.topMargin = (int) imageView.getResources().getDimension(R.dimen.ee);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        } else {
            textView.setText(spannableString2);
            imageView.setImageResource(C35646l.m72755a(isSelected));
            if (z) {
                marginLayoutParams.bottomMargin = (int) C13628n.m24520b(imageView.getContext(), 12.0f);
            } else {
                marginLayoutParams.topMargin = (int) C13628n.m24520b(imageView.getContext(), 0.0f);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        textView2.setText(textView.getContext().getString(isSelected ? R.string.bxr : R.string.bq8));
        imageView.setSelected(!isSelected);
        View view2 = viewGroup;
        if (!isSelected) {
            while ((view2 instanceof View) && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
                boolean z2 = view2 instanceof ScrollableLayout;
                view2 = view2;
                if (z2) {
                    break;
                }
            }
            if (view2 instanceof ScrollableLayout) {
                ((ScrollableLayout) view2).scrollTo(0, 0);
            }
        }
    }
}
