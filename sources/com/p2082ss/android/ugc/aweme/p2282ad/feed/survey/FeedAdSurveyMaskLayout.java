package com.p2082ss.android.ugc.aweme.p2282ad.feed.survey;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.FeedAdSurveyMaskLayout */
public final class FeedAdSurveyMaskLayout extends FrameLayout {

    /* renamed from: a */
    public static final C33351a f79265a = new C33351a((byte) 0);

    /* renamed from: b */
    private int f79266b;

    /* renamed from: c */
    private int f79267c;

    static {
        Covode.recordClassIndex(40190);
    }

    public FeedAdSurveyMaskLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.FeedAdSurveyMaskLayout$a */
    public static final class C33351a {
        static {
            Covode.recordClassIndex(40191);
        }

        private C33351a() {
        }

        public /* synthetic */ C33351a(byte b) {
            this();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        Integer.valueOf(motionEvent.getAction());
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Integer.valueOf(motionEvent.getAction());
            Integer valueOf = Integer.valueOf(motionEvent.getAction());
            if (valueOf != null) {
                if (valueOf.intValue() == 0) {
                    this.f79266b = (int) motionEvent.getX();
                    this.f79267c = (int) motionEvent.getY();
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if (valueOf.intValue() == 2) {
                    if (Math.abs(motionEvent.getX() - ((float) this.f79266b)) > Math.abs(motionEvent.getY() - ((float) this.f79267c))) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        return true;
                    }
                    ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ FeedAdSurveyMaskLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdSurveyMaskLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6912);
        MethodCollector.m26664o(6912);
    }
}
