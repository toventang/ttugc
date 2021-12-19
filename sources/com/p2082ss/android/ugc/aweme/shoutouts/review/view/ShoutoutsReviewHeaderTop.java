package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderTop */
public final class ShoutoutsReviewHeaderTop extends ConstraintLayout {

    /* renamed from: g */
    public TuxTextView f167713g;

    /* renamed from: h */
    public TuxTextView f167714h;

    /* renamed from: i */
    public ShoutOutRatingBar f167715i;

    /* renamed from: j */
    public TuxTextView f167716j;

    /* renamed from: k */
    public ImageView f167717k;

    /* renamed from: l */
    public TextView f167718l;

    /* renamed from: m */
    public boolean f167719m;

    static {
        Covode.recordClassIndex(87396);
    }

    public ShoutoutsReviewHeaderTop(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.f1g);
        C89219l.m154716b(findViewById, "");
        this.f167713g = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.evw);
        C89219l.m154716b(findViewById2, "");
        this.f167714h = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.def);
        C89219l.m154716b(findViewById3, "");
        this.f167715i = (ShoutOutRatingBar) findViewById3;
        View findViewById4 = findViewById(R.id.f2n);
        C89219l.m154716b(findViewById4, "");
        this.f167716j = (TuxTextView) findViewById4;
        View findViewById5 = findViewById(R.id.bw9);
        C89219l.m154716b(findViewById5, "");
        this.f167717k = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.f25);
        C89219l.m154716b(findViewById6, "");
        this.f167718l = (TextView) findViewById6;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderTop$a */
    public static final class View$OnClickListenerC74583a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsReviewHeaderTop f167720a;

        static {
            Covode.recordClassIndex(87397);
        }

        public View$OnClickListenerC74583a(ShoutoutsReviewHeaderTop shoutoutsReviewHeaderTop) {
            this.f167720a = shoutoutsReviewHeaderTop;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f167720a.getContext();
            C89219l.m154716b(context, "");
            C23025b bVar = new C23025b(context);
            bVar.mo37416a(R.string.fy, (AbstractC89172b<? super C23024a, C89391z>) null);
            Context context2 = this.f167720a.getContext();
            C89219l.m154716b(context2, "");
            C23023b a = new C23023b(context2).mo37411b(this.f167720a.getContext().getString(R.string.fw)).mo37413d(this.f167720a.getContext().getString(R.string.fx)).mo37407a(bVar);
            a.f54502a = false;
            ((C23023b) a.mo37482a(false)).mo37405a().mo37396b().show();
        }
    }

    /* renamed from: a */
    public final void mo117261a(float f, long j) {
        if (j > 0) {
            ShoutOutRatingBar shoutOutRatingBar = this.f167715i;
            if (shoutOutRatingBar == null) {
                C89219l.m154710a("ratingBar");
            }
            shoutOutRatingBar.setStar(f);
            TuxTextView tuxTextView = this.f167716j;
            if (tuxTextView == null) {
                C89219l.m154710a("tvRatingCount");
            }
            String string = getContext().getString(R.string.dc9);
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{C53437b.m98615a(j)}, 1));
            C89219l.m154716b(a, "");
            tuxTextView.setText(a);
            TextView textView = this.f167718l;
            if (textView == null) {
                C89219l.m154710a("tvRatingAvg");
            }
            String a2 = C1764a.m5928a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            C89219l.m154716b(a2, "");
            textView.setText(a2);
            TextView textView2 = this.f167718l;
            if (textView2 == null) {
                C89219l.m154710a("tvRatingAvg");
            }
            textView2.setVisibility(0);
            return;
        }
        ShoutOutRatingBar shoutOutRatingBar2 = this.f167715i;
        if (shoutOutRatingBar2 == null) {
            C89219l.m154710a("ratingBar");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        shoutOutRatingBar2.setStarIdleDrawable(context.getResources().getDrawable(2131233845));
        ShoutOutRatingBar shoutOutRatingBar3 = this.f167715i;
        if (shoutOutRatingBar3 == null) {
            C89219l.m154710a("ratingBar");
        }
        shoutOutRatingBar3.setStar(0.0f);
        TuxTextView tuxTextView2 = this.f167716j;
        if (tuxTextView2 == null) {
            C89219l.m154710a("tvRatingCount");
        }
        tuxTextView2.setText(getContext().getString(R.string.dgd));
        TextView textView3 = this.f167718l;
        if (textView3 == null) {
            C89219l.m154710a("tvRatingAvg");
        }
        textView3.setVisibility(8);
    }

    private /* synthetic */ ShoutoutsReviewHeaderTop(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsReviewHeaderTop(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
