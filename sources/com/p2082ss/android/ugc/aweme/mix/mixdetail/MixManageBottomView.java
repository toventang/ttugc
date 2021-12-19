package com.p2082ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixManageBottomView */
public final class MixManageBottomView extends FrameLayout implements AbstractC59732u {

    /* renamed from: a */
    public TuxButton f136002a;

    /* renamed from: b */
    public TextView f136003b;

    /* renamed from: c */
    public TuxButton f136004c;

    /* renamed from: d */
    public LinearLayout f136005d;

    /* renamed from: e */
    boolean f136006e;

    static {
        Covode.recordClassIndex(70030);
    }

    public final TuxButton getAddVideoView() {
        TuxButton tuxButton = this.f136004c;
        if (tuxButton == null) {
            C89219l.m154710a("addVideoView");
        }
        return tuxButton;
    }

    public final LinearLayout getEditMixLayout() {
        LinearLayout linearLayout = this.f136005d;
        if (linearLayout == null) {
            C89219l.m154710a("editMixLayout");
        }
        return linearLayout;
    }

    public final TextView getRemoveConfirmView() {
        TextView textView = this.f136003b;
        if (textView == null) {
            C89219l.m154710a("removeConfirmView");
        }
        return textView;
    }

    public final TuxButton getRemoveView() {
        TuxButton tuxButton = this.f136002a;
        if (tuxButton == null) {
            C89219l.m154710a("removeView");
        }
        return tuxButton;
    }

    public final void setAddVideoView(TuxButton tuxButton) {
        C89219l.m154721d(tuxButton, "");
        this.f136004c = tuxButton;
    }

    public final void setEditMixLayout(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f136005d = linearLayout;
    }

    public final void setRemoveConfirmView(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f136003b = textView;
    }

    public final void setRemoveView(TuxButton tuxButton) {
        C89219l.m154721d(tuxButton, "");
        this.f136002a = tuxButton;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixManageBottomView$a */
    static final class View$OnClickListenerC59630a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixManageBottomView f136007a;

        static {
            Covode.recordClassIndex(70031);
        }

        View$OnClickListenerC59630a(MixManageBottomView mixManageBottomView) {
            this.f136007a = mixManageBottomView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixManageBottomView mixManageBottomView = this.f136007a;
            mixManageBottomView.f136006e = true;
            LinearLayout linearLayout = mixManageBottomView.f136005d;
            if (linearLayout == null) {
                C89219l.m154710a("editMixLayout");
            }
            linearLayout.setVisibility(8);
            TextView textView = mixManageBottomView.f136003b;
            if (textView == null) {
                C89219l.m154710a("removeConfirmView");
            }
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo97181a(int i) {
        boolean z;
        TextView textView = this.f136003b;
        if (textView == null) {
            C89219l.m154710a("removeConfirmView");
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        textView.setEnabled(z);
        TextView textView2 = this.f136003b;
        if (textView2 == null) {
            C89219l.m154710a("removeConfirmView");
        }
        textView2.setText(getResources().getQuantityString(R.plurals.fc, i, Integer.valueOf(i)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MixManageBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(774);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aku, this, true);
        View findViewById = findViewById(R.id.ckr);
        C89219l.m154716b(findViewById, "");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f136005d = linearLayout;
        if (linearLayout == null) {
            C89219l.m154710a("editMixLayout");
        }
        linearLayout.setVisibility(0);
        View findViewById2 = findViewById(R.id.yl);
        C89219l.m154716b(findViewById2, "");
        TuxButton tuxButton = (TuxButton) findViewById2;
        this.f136002a = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("removeView");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC59630a(this));
        View findViewById3 = findViewById(R.id.ww);
        C89219l.m154716b(findViewById3, "");
        this.f136004c = (TuxButton) findViewById3;
        View findViewById4 = findViewById(R.id.ym);
        C89219l.m154716b(findViewById4, "");
        TextView textView = (TextView) findViewById4;
        this.f136003b = textView;
        if (textView == null) {
            C89219l.m154710a("removeConfirmView");
        }
        textView.setVisibility(8);
        MethodCollector.m26664o(774);
    }
}
