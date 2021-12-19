package com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView */
public final class FTCDraftItemView extends LinearLayout {

    /* renamed from: a */
    Scroller f175815a;

    /* renamed from: b */
    int f175816b;

    /* renamed from: c */
    boolean f175817c;

    /* renamed from: d */
    AbstractC78269a f175818d;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView$a */
    public interface AbstractC78269a {
        static {
            Covode.recordClassIndex(91386);
        }

        /* renamed from: a */
        void mo122159a(int i, boolean z);
    }

    static {
        Covode.recordClassIndex(91385);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        C89219l.m154716b(childAt, "");
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        this.f175816b = (int) (((float) (layoutParams2.width + (layoutParams2.rightMargin * 2))) + C13628n.m24520b(getContext(), 16.0f));
        if (C78099c.m136517a(getContext())) {
            this.f175816b = -this.f175816b;
        }
    }

    public final void computeScroll() {
        Scroller scroller = this.f175815a;
        if (scroller == null) {
            C89219l.m154715b();
        }
        if (scroller.computeScrollOffset()) {
            Scroller scroller2 = this.f175815a;
            if (scroller2 == null) {
                C89219l.m154715b();
            }
            int currX = scroller2.getCurrX();
            Scroller scroller3 = this.f175815a;
            if (scroller3 == null) {
                C89219l.m154715b();
            }
            scrollTo(currX, scroller3.getCurrY());
            if (this.f175818d != null) {
                Scroller scroller4 = this.f175815a;
                if (scroller4 == null) {
                    C89219l.m154715b();
                }
                scroller4.getCurrX();
                Scroller scroller5 = this.f175815a;
                if (scroller5 == null) {
                    C89219l.m154715b();
                }
                scroller5.getCurrY();
            }
            invalidate();
        }
    }

    public final void setOnScrollListener(AbstractC78269a aVar) {
        this.f175818d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCDraftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8371);
        this.f175815a = new Scroller(context);
        MethodCollector.m26664o(8371);
    }
}
