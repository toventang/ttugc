package com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveClickView */
public final class FeedAdInteractiveClickView extends C33298c {

    /* renamed from: a */
    public static final C33290a f79062a = new C33290a((byte) 0);

    /* renamed from: b */
    private float f79063b;

    /* renamed from: c */
    private float f79064c;

    static {
        Covode.recordClassIndex(40118);
    }

    public FeedAdInteractiveClickView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveClickView$a */
    public static final class C33290a {
        static {
            Covode.recordClassIndex(40119);
        }

        private C33290a() {
        }

        public /* synthetic */ C33290a(byte b) {
            this();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Integer.valueOf(motionEvent.getAction());
        }
        if (motionEvent == null) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && m68260a(this.f79063b, this.f79064c, x, y)) {
                if (!C89271h.m154767a(getCoreAreaXRange(), this.f79063b) || !C89271h.m154767a(getCoreAreaYRange(), this.f79064c)) {
                    AbstractC33299d interactiveListener = getInteractiveListener();
                    if (interactiveListener != null) {
                        interactiveListener.mo59261e();
                    }
                } else {
                    AbstractC33299d interactiveListener2 = getInteractiveListener();
                    if (interactiveListener2 != null) {
                        interactiveListener2.mo59258b();
                    }
                }
            }
            return false;
        }
        this.f79063b = x;
        this.f79064c = y;
        return true;
    }

    private /* synthetic */ FeedAdInteractiveClickView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveClickView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
