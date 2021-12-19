package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;

/* renamed from: com.ss.android.ugc.aweme.views.c */
public class C81431c extends DmtTextView {

    /* renamed from: a */
    private MentionTextView.AbstractC81406c f182006a;

    static {
        Covode.recordClassIndex(94800);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtTextView
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C51423a.m95788a("", e);
            return null;
        }
    }

    public C81431c(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MentionTextView.AbstractC81406c cVar;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            MentionTextView.AbstractC81406c cVar2 = (MentionTextView.AbstractC81406c) m141208a(motionEvent, MentionTextView.AbstractC81406c.class);
            if (cVar2 != null) {
                cVar2.mo125011a(true);
                this.f182006a = cVar2;
                return true;
            } else if (m141208a(motionEvent, ClickableSpan.class) != null) {
                return true;
            } else {
                return false;
            }
        } else if (action == 1) {
            MentionTextView.AbstractC81406c cVar3 = this.f182006a;
            if (cVar3 == null || cVar3 != m141208a(motionEvent, MentionTextView.AbstractC81406c.class)) {
                return false;
            }
            this.f182006a.mo125011a(false);
            this.f182006a = null;
            return true;
        } else if (action != 2) {
            if (action == 3 && (cVar = this.f182006a) != null) {
                cVar.mo125011a(false);
                this.f182006a = null;
            }
            return false;
        } else {
            MentionTextView.AbstractC81406c cVar4 = this.f182006a;
            if (!(cVar4 == null || cVar4 == m141208a(motionEvent, MentionTextView.AbstractC81406c.class))) {
                this.f182006a.mo125011a(false);
                this.f182006a = null;
            }
            return false;
        }
    }

    public C81431c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private <T extends ClickableSpan> T m141208a(MotionEvent motionEvent, Class<T> cls) {
        if (!(getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) getText();
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        Layout layout = getLayout();
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, cls);
            if (clickableSpanArr.length <= 0) {
                return null;
            }
            ClickableSpan clickableSpan = clickableSpanArr[0];
            if (offsetForHorizontal < spanned.getSpanStart(clickableSpan) || offsetForHorizontal > spanned.getSpanEnd(clickableSpan)) {
                return null;
            }
            return (T) clickableSpanArr[0];
        } catch (Exception unused) {
            return null;
        }
    }
}
