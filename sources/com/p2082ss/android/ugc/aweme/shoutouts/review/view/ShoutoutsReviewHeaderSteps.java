package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.shoutouts.p3902b.C74387a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderSteps */
public final class ShoutoutsReviewHeaderSteps extends ConstraintLayout {

    /* renamed from: g */
    public boolean f167704g;

    /* renamed from: h */
    public LinearLayout f167705h;

    /* renamed from: i */
    public LinearLayout f167706i;

    /* renamed from: j */
    public boolean f167707j;

    /* renamed from: k */
    public boolean f167708k;

    static {
        Covode.recordClassIndex(87391);
    }

    public ShoutoutsReviewHeaderSteps(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderSteps$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC74581c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f167711a;

        static {
            Covode.recordClassIndex(87394);
        }

        public final void onGlobalLayout() {
            if (ShoutoutsReviewHeaderSteps.m130990a(this.f167711a).getWidth() > 0) {
                this.f167711a.f167707j = true;
                ShoutoutsReviewHeaderSteps.m130990a(this.f167711a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (this.f167711a.f167708k) {
                    this.f167711a.mo9139b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC74581c(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f167711a = shoutoutsReviewHeaderSteps;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderSteps$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC74582d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f167712a;

        static {
            Covode.recordClassIndex(87395);
        }

        public final void onGlobalLayout() {
            if (ShoutoutsReviewHeaderSteps.m130991b(this.f167712a).getWidth() > 0) {
                this.f167712a.f167708k = true;
                ShoutoutsReviewHeaderSteps.m130991b(this.f167712a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (this.f167712a.f167707j) {
                    this.f167712a.mo9139b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC74582d(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f167712a = shoutoutsReviewHeaderSteps;
        }
    }

    /* renamed from: b */
    public final void mo9139b() {
        int i;
        MethodCollector.m26663i(2820);
        int a = C17234b.m31806a(getContext());
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a2 = a - C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
        int i2 = a2 / 2;
        LinearLayout linearLayout = this.f167705h;
        if (linearLayout == null) {
            C89219l.m154710a("llTerm");
        }
        int width = linearLayout.getWidth();
        LinearLayout linearLayout2 = this.f167706i;
        if (linearLayout2 == null) {
            C89219l.m154710a("llFAQ");
        }
        if (a2 < width + linearLayout2.getWidth()) {
            LinearLayout linearLayout3 = this.f167705h;
            if (linearLayout3 == null) {
                C89219l.m154710a("llTerm");
            }
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = this.f167706i;
            if (linearLayout4 == null) {
                C89219l.m154710a("llFAQ");
            }
            linearLayout4.setVisibility(8);
            View findViewById = findViewById(R.id.amc);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
            LinearLayout linearLayout5 = this.f167705h;
            if (linearLayout5 == null) {
                C89219l.m154710a("llTerm");
            }
            if (linearLayout5.getWidth() > i2) {
                i = R.id.fgd;
            } else {
                i = R.id.fge;
            }
            View inflate = ((ViewStub) findViewById(i)).inflate();
            if (inflate != null) {
                ((ShoutoutsHeaderStepBottomStyle) inflate).setOnlyView(this.f167704g);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsHeaderStepBottomStyle");
                MethodCollector.m26664o(2820);
                throw nullPointerException;
            }
        }
        MethodCollector.m26664o(2820);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.cem).setOnClickListener(new View$OnClickListenerC74579a(this));
        findViewById(R.id.cdb).setOnClickListener(new View$OnClickListenerC74580b(this));
        View findViewById = findViewById(R.id.f4e);
        C89219l.m154716b(findViewById, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        String string = context.getResources().getString(R.string.g34);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"3"}, 1));
        C89219l.m154716b(a, "");
        ((TextView) findViewById).setText(a);
        View findViewById2 = findViewById(R.id.cem);
        C89219l.m154716b(findViewById2, "");
        this.f167705h = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.cdb);
        C89219l.m154716b(findViewById3, "");
        this.f167706i = (LinearLayout) findViewById3;
        LinearLayout linearLayout = this.f167705h;
        if (linearLayout == null) {
            C89219l.m154710a("llTerm");
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC74581c(this));
        LinearLayout linearLayout2 = this.f167706i;
        if (linearLayout2 == null) {
            C89219l.m154710a("llFAQ");
        }
        linearLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC74582d(this));
    }

    public final void setOnlyView(boolean z) {
        this.f167704g = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m130990a(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
        LinearLayout linearLayout = shoutoutsReviewHeaderSteps.f167705h;
        if (linearLayout == null) {
            C89219l.m154710a("llTerm");
        }
        return linearLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ LinearLayout m130991b(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
        LinearLayout linearLayout = shoutoutsReviewHeaderSteps.f167706i;
        if (linearLayout == null) {
            C89219l.m154710a("llFAQ");
        }
        return linearLayout;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderSteps$b */
    static final class View$OnClickListenerC74580b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f167710a;

        static {
            Covode.recordClassIndex(87393);
        }

        View$OnClickListenerC74580b(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f167710a = shoutoutsReviewHeaderSteps;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f167710a.f167704g) {
                Context context = this.f167710a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context).mo37635a(this.f167710a.getResources().getString(R.string.fxb)).mo37637b();
                return;
            }
            Context context2 = this.f167710a.getContext();
            C89219l.m154716b(context2, "");
            C74387a.m130851a(context2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderSteps$a */
    static final class View$OnClickListenerC74579a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f167709a;

        static {
            Covode.recordClassIndex(87392);
        }

        View$OnClickListenerC74579a(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f167709a = shoutoutsReviewHeaderSteps;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f167709a.f167704g) {
                Context context = this.f167709a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context).mo37635a(this.f167709a.getResources().getString(R.string.fxb)).mo37637b();
                return;
            }
            Context context2 = this.f167709a.getContext();
            C89219l.m154716b(context2, "");
            C89219l.m154721d(context2, "");
            C74387a.m130855b(context2, "https://www.tiktok.com/legal/tiktok-shoutouts-user-terms-of-service?hide_nav_bar=1");
        }
    }

    private /* synthetic */ ShoutoutsReviewHeaderSteps(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsReviewHeaderSteps(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
