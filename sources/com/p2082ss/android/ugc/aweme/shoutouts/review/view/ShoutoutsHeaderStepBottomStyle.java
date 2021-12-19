package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.shoutouts.p3902b.C74387a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsHeaderStepBottomStyle */
public final class ShoutoutsHeaderStepBottomStyle extends LinearLayout {

    /* renamed from: a */
    public boolean f167697a;

    static {
        Covode.recordClassIndex(87384);
    }

    public ShoutoutsHeaderStepBottomStyle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.cen).setOnClickListener(new View$OnClickListenerC74575a(this));
        findViewById(R.id.cdc).setOnClickListener(new View$OnClickListenerC74576b(this));
    }

    public final void setOnlyView(boolean z) {
        this.f167697a = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsHeaderStepBottomStyle$b */
    static final class View$OnClickListenerC74576b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsHeaderStepBottomStyle f167699a;

        static {
            Covode.recordClassIndex(87386);
        }

        View$OnClickListenerC74576b(ShoutoutsHeaderStepBottomStyle shoutoutsHeaderStepBottomStyle) {
            this.f167699a = shoutoutsHeaderStepBottomStyle;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f167699a.f167697a) {
                Context context = this.f167699a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context).mo37635a(this.f167699a.getResources().getString(R.string.fxb)).mo37637b();
                return;
            }
            Context context2 = this.f167699a.getContext();
            C89219l.m154716b(context2, "");
            C74387a.m130851a(context2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsHeaderStepBottomStyle$a */
    static final class View$OnClickListenerC74575a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsHeaderStepBottomStyle f167698a;

        static {
            Covode.recordClassIndex(87385);
        }

        View$OnClickListenerC74575a(ShoutoutsHeaderStepBottomStyle shoutoutsHeaderStepBottomStyle) {
            this.f167698a = shoutoutsHeaderStepBottomStyle;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f167698a.f167697a) {
                Context context = this.f167698a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context).mo37635a(this.f167698a.getResources().getString(R.string.fxb)).mo37637b();
                return;
            }
            C68432f fVar = C68432f.f153189a;
            Context context2 = this.f167698a.getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
            fVar.mo108862a((Activity) context2);
        }
    }

    private /* synthetic */ ShoutoutsHeaderStepBottomStyle(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsHeaderStepBottomStyle(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2937);
        MethodCollector.m26664o(2937);
    }
}
