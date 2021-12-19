package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck */
public final class C36087ck extends FrameLayout {

    /* renamed from: a */
    public LinearLayout f85270a;

    /* renamed from: b */
    public LinearLayout f85271b;

    /* renamed from: c */
    public TuxIconView f85272c;

    /* renamed from: d */
    public LinearLayout f85273d;

    /* renamed from: e */
    public View f85274e;

    /* renamed from: f */
    public LinearLayout f85275f;

    /* renamed from: g */
    public int f85276g;

    /* renamed from: h */
    private View f85277h;

    /* renamed from: i */
    private RemoteImageView f85278i;

    /* renamed from: j */
    private TextView f85279j;

    /* renamed from: k */
    private RemoteImageView f85280k;

    /* renamed from: com.ss.android.ugc.aweme.ck$d */
    public final /* synthetic */ class View$OnClickListenerC36091d implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f85286a;

        static {
            Covode.recordClassIndex(43344);
        }

        public View$OnClickListenerC36091d(AbstractC89172b bVar) {
            this.f85286a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f85286a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(43340);
    }

    public final ViewGroup getAnchorListContent() {
        return this.f85271b;
    }

    public final RemoteImageView getLeftIcon() {
        return this.f85278i;
    }

    public final TuxIconView getRightIcon() {
        return this.f85272c;
    }

    /* renamed from: b */
    public final void mo63228b() {
        C13628n.m24510a(this.f85280k, 0);
    }

    /* renamed from: c */
    public final void mo63229c() {
        C13628n.m24510a(this.f85280k, 8);
    }

    /* renamed from: d */
    public final boolean mo63230d() {
        LinearLayout linearLayout = this.f85273d;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ck$a */
    public static final class RunnableC36088a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f85281a;

        /* renamed from: b */
        final /* synthetic */ float f85282b;

        static {
            Covode.recordClassIndex(43341);
        }

        public RunnableC36088a(LinearLayout linearLayout, float f) {
            this.f85281a = linearLayout;
            this.f85282b = f;
        }

        public final void run() {
            if (((float) this.f85281a.getMeasuredWidth()) > this.f85282b) {
                ViewGroup.LayoutParams layoutParams = this.f85281a.getLayoutParams();
                layoutParams.width = (int) this.f85282b;
                this.f85281a.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ck$b */
    public static final class RunnableC36089b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f85283a;

        /* renamed from: b */
        final /* synthetic */ float f85284b;

        static {
            Covode.recordClassIndex(43342);
        }

        public RunnableC36089b(LinearLayout linearLayout, float f) {
            this.f85283a = linearLayout;
            this.f85284b = f;
        }

        public final void run() {
            if (((float) this.f85283a.getMeasuredWidth()) > this.f85284b) {
                ViewGroup.LayoutParams layoutParams = this.f85283a.getLayoutParams();
                layoutParams.width = (int) this.f85284b;
                this.f85283a.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo63227a() {
        MethodCollector.m26663i(9140);
        LinearLayout linearLayout = this.f85270a;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.f85276g = 0;
        MethodCollector.m26664o(9140);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck$c */
    public static final class RunnableC36090c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36087ck f85285a;

        static {
            Covode.recordClassIndex(43343);
        }

        public RunnableC36090c(C36087ck ckVar) {
            this.f85285a = ckVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            LinearLayout linearLayout = this.f85285a.f85271b;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = (int) C13628n.m24520b(this.f85285a.getContext(), 16.0f);
                LinearLayout linearLayout2 = this.f85285a.f85271b;
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C36087ck(Context context) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    public final void setOnAddClickListener(AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.gn);
        this.f85275f = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View$OnClickListenerC36091d(bVar));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C36087ck(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C36087ck(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9144);
        this.f85277h = LayoutInflater.from(context).inflate(R.layout.aad, this);
        RemoteImageView remoteImageView = (RemoteImageView) findViewById(R.id.d6s);
        this.f85278i = remoteImageView;
        if (remoteImageView != null) {
            remoteImageView.setImageResource(2131232525);
        }
        this.f85279j = (TextView) findViewById(R.id.d6y);
        this.f85272c = (TuxIconView) findViewById(R.id.d6t);
        this.f85270a = (LinearLayout) findViewById(R.id.d6n);
        this.f85271b = (LinearLayout) findViewById(R.id.adw);
        this.f85273d = (LinearLayout) findViewById(R.id.d6z);
        RemoteImageView remoteImageView2 = (RemoteImageView) findViewById(R.id.d6p);
        this.f85280k = remoteImageView2;
        if (remoteImageView2 != null) {
            remoteImageView2.setImageResource(R.drawable.a_l);
        }
        this.f85274e = findViewById(R.id.ave);
        this.f85275f = (LinearLayout) findViewById(R.id.gn);
        MethodCollector.m26664o(9144);
    }
}
