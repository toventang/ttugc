package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.tools.C78099c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftItemView */
public class DraftItemView extends LinearLayout {

    /* renamed from: a */
    private Scroller f175423a;

    /* renamed from: b */
    private int f175424b;

    /* renamed from: c */
    private boolean f175425c;

    /* renamed from: d */
    private AbstractC78114a f175426d;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftItemView$a */
    public interface AbstractC78114a {
        static {
            Covode.recordClassIndex(91223);
        }

        /* renamed from: a */
        void mo122027a(int i, boolean z);
    }

    static {
        Covode.recordClassIndex(91222);
    }

    /* renamed from: b */
    public final void mo122033b() {
        if (this.f175425c) {
            this.f175425c = false;
            Scroller scroller = this.f175423a;
            int i = this.f175424b;
            scroller.startScroll(-i, 0, i, 0, 200);
            AbstractC78114a aVar = this.f175426d;
            if (aVar != null) {
                aVar.mo122027a(this.f175424b, this.f175425c);
            }
        }
    }

    /* renamed from: a */
    public final void mo122032a() {
        if (!this.f175425c) {
            this.f175425c = true;
            this.f175423a.startScroll(0, 0, -this.f175424b, 0, 200);
            AbstractC78114a aVar = this.f175426d;
            if (aVar != null) {
                aVar.mo122027a(this.f175424b, this.f175425c);
            }
        }
    }

    public void computeScroll() {
        if (this.f175423a.computeScrollOffset()) {
            scrollTo(this.f175423a.getCurrX(), this.f175423a.getCurrY());
            if (this.f175426d != null) {
                this.f175423a.getCurrX();
                this.f175423a.getCurrY();
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        this.f175424b = (int) (((float) (layoutParams.width + (layoutParams.rightMargin * 2))) + C13628n.m24520b(getContext(), 16.0f));
        if (C78099c.m136517a(getContext())) {
            this.f175424b = -this.f175424b;
        }
    }

    public void setOnScrollListener(AbstractC78114a aVar) {
        this.f175426d = aVar;
    }

    public DraftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10262);
        this.f175423a = new Scroller(context);
        MethodCollector.m26664o(10262);
    }
}
