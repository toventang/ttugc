package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedInterceptTouchLayout */
public final class FeedInterceptTouchLayout extends FrameLayout {

    /* renamed from: a */
    public int f115335a;

    /* renamed from: b */
    private boolean f115336b;

    static {
        Covode.recordClassIndex(59113);
    }

    public FeedInterceptTouchLayout(Context context, byte b) {
        this(context);
    }

    public final boolean getGroupClickable() {
        return this.f115336b;
    }

    public final int getHintTextRes() {
        return this.f115335a;
    }

    public final void setGroupClickable(boolean z) {
        this.f115336b = z;
    }

    public final void setHintTextRes(int i) {
        this.f115335a = i;
    }

    private /* synthetic */ FeedInterceptTouchLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f115336b) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedInterceptTouchLayout(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5184);
        this.f115336b = true;
        this.f115335a = -1;
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.FeedInterceptTouchLayout.View$OnClickListenerC499981 */

            /* renamed from: a */
            final /* synthetic */ FeedInterceptTouchLayout f115337a;

            static {
                Covode.recordClassIndex(59114);
            }

            {
                this.f115337a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f115337a.f115335a != -1) {
                    new C79459a(context).mo123050a(this.f115337a.f115335a).mo123053a();
                }
            }
        });
        MethodCollector.m26664o(5184);
    }
}
