package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.widget.EmojiCompatTuxTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.SpanInterceptNoTextView */
public class SpanInterceptNoTextView extends EmojiCompatTuxTextView {

    /* renamed from: a */
    CharacterStyle f126479a;

    /* renamed from: b */
    private GestureDetector f126480b;

    static {
        Covode.recordClassIndex(65082);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return null;
    }

    private CharacterStyle getPressedSpan() {
        CharacterStyle characterStyle = this.f126479a;
        if (characterStyle != null) {
            return characterStyle;
        }
        CharacterStyle charStyle = getCharStyle();
        this.f126479a = charStyle;
        return charStyle;
    }

    /* access modifiers changed from: package-private */
    public CharacterStyle getCharStyle() {
        return new BackgroundColorSpan(getHighlightColor());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f126480b.onTouchEvent(motionEvent);
    }

    public SpanInterceptNoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0053, code lost:
        if (r10 != 3) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92375a(android.view.MotionEvent r9, int r10) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.SpanInterceptNoTextView.mo92375a(android.view.MotionEvent, int):boolean");
    }

    private SpanInterceptNoTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (char) 0);
        getPaint().setUnderlineText(false);
        setTextIsSelectable(true);
        this.f126480b = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.SpanInterceptNoTextView.C553181 */

            /* renamed from: b */
            private MotionEvent f126482b;

            static {
                Covode.recordClassIndex(65083);
            }

            public final boolean onDown(MotionEvent motionEvent) {
                this.f126482b = motionEvent;
                return SpanInterceptNoTextView.this.mo92375a(motionEvent, 0);
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return SpanInterceptNoTextView.this.mo92375a(this.f126482b, 1);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                SpanInterceptNoTextView.this.mo92375a(this.f126482b, 3);
                ((View) SpanInterceptNoTextView.this.getParent()).performLongClick();
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return SpanInterceptNoTextView.this.mo92375a(this.f126482b, 3);
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return SpanInterceptNoTextView.this.mo92375a(this.f126482b, 3);
            }
        });
    }
}
