package com.p2082ss.android.ugc.aweme.tools.draft.p4114l;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78406d;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.l.b */
public class C78404b extends DmtTextView {

    /* renamed from: a */
    private C78406d.AbstractC78409c f176149a;

    static {
        Covode.recordClassIndex(91530);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtTextView
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C40970e.m82484a(e);
            return null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C78406d.AbstractC78409c cVar;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C40970e.m82484a(e);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            C78406d.AbstractC78409c cVar2 = (C78406d.AbstractC78409c) m136930a(motionEvent, C78406d.AbstractC78409c.class);
            if (cVar2 != null) {
                cVar2.mo122346a(true);
                this.f176149a = cVar2;
                return true;
            } else if (m136930a(motionEvent, ClickableSpan.class) != null) {
                return true;
            } else {
                return false;
            }
        } else if (action == 1) {
            C78406d.AbstractC78409c cVar3 = this.f176149a;
            if (cVar3 == null || cVar3 != m136930a(motionEvent, C78406d.AbstractC78409c.class)) {
                return false;
            }
            this.f176149a.mo122346a(false);
            this.f176149a = null;
            return true;
        } else if (action != 2) {
            if (action == 3 && (cVar = this.f176149a) != null) {
                cVar.mo122346a(false);
                this.f176149a = null;
            }
            return false;
        } else {
            C78406d.AbstractC78409c cVar4 = this.f176149a;
            if (!(cVar4 == null || cVar4 == m136930a(motionEvent, C78406d.AbstractC78409c.class))) {
                this.f176149a.mo122346a(false);
                this.f176149a = null;
            }
            return false;
        }
    }

    public C78404b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private <T extends ClickableSpan> T m136930a(MotionEvent motionEvent, Class<T> cls) {
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
