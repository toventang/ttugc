package com.p2082ss.android.ugc.aweme.notification.view;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;

/* renamed from: com.ss.android.ugc.aweme.notification.view.b */
public final class C62285b extends LinkMovementMethod {

    /* renamed from: d */
    public static C62285b f141373d;

    /* renamed from: a */
    public AbstractC33066c f141374a;

    /* renamed from: b */
    public boolean f141375b = false;

    /* renamed from: c */
    public View f141376c;

    /* renamed from: e */
    private final long f141377e = ((long) (ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout()));

    /* renamed from: f */
    private Runnable f141378f = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.notification.view.C62285b.RunnableC622861 */

        static {
            Covode.recordClassIndex(73066);
        }

        public final void run() {
            if (C62285b.this.f141374a == null) {
                C62285b.this.f141375b = true;
                if (C62285b.this.f141376c != null) {
                    View view = C62285b.this.f141376c;
                    ViewGroup viewGroup = view;
                    if (view != null) {
                        while (viewGroup.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                            boolean performLongClick = viewGroup2.performLongClick();
                            viewGroup = viewGroup2;
                            if (performLongClick) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(73065);
    }

    /* renamed from: a */
    private static boolean m112689a(int i, Spannable spannable, Object obj) {
        if (i < spannable.getSpanStart(obj) || i > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static AbstractC33066c m112688a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        AbstractC33066c[] cVarArr = (AbstractC33066c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AbstractC33066c.class);
        if (cVarArr.length <= 0 || !m112689a(offsetForHorizontal, spannable, cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: android.view.ViewGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.f141376c = textView;
        if (motionEvent.getAction() == 0) {
            try {
                this.f141374a = m112688a(textView, spannable, motionEvent);
                this.f141375b = false;
                textView.getHandler().removeCallbacks(this.f141378f);
                textView.postDelayed(this.f141378f, this.f141377e);
                AbstractC33066c cVar = this.f141374a;
                if (cVar != null) {
                    cVar.f78624d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f141374a), spannable.getSpanEnd(this.f141374a));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC33066c a = m112688a(textView, spannable, motionEvent);
                AbstractC33066c cVar2 = this.f141374a;
                if (!(cVar2 == null || a == cVar2)) {
                    cVar2.f78624d = false;
                    this.f141374a = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            textView.getHandler().removeCallbacks(this.f141378f);
            if (motionEvent.getAction() == 1 && !this.f141375b) {
                AbstractC33066c cVar3 = this.f141374a;
                TextView textView2 = textView;
                if (cVar3 == null) {
                    while (true) {
                        if (!(textView2.getParent() instanceof ViewGroup)) {
                            break;
                        }
                        ViewGroup viewGroup = (ViewGroup) textView2.getParent();
                        boolean hasOnClickListeners = viewGroup.hasOnClickListeners();
                        textView2 = viewGroup;
                        if (hasOnClickListeners) {
                            viewGroup.performClick();
                            break;
                        }
                    }
                } else {
                    cVar3.f78624d = false;
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
            }
            AbstractC33066c cVar4 = this.f141374a;
            if (cVar4 != null) {
                cVar4.f78624d = false;
            }
            this.f141375b = false;
            this.f141374a = null;
            this.f141376c = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
