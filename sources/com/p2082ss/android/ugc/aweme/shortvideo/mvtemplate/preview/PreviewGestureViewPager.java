package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.utils.C30745b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager */
public final class PreviewGestureViewPager extends ViewPager {

    /* renamed from: a */
    private float f162230a = -1.0f;

    /* renamed from: b */
    private AbstractC72361a f162231b;

    /* renamed from: c */
    private float f162232c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager$a */
    public interface AbstractC72361a {
        static {
            Covode.recordClassIndex(85032);
        }

        /* renamed from: a */
        void mo114645a(boolean z);
    }

    static {
        Covode.recordClassIndex(85031);
    }

    public final void setGestureCallback(AbstractC72361a aVar) {
        C89219l.m154721d(aVar, "");
        this.f162231b = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f162230a = motionEvent.getX();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        Integer num;
        int i;
        AbstractC72361a aVar;
        if (motionEvent != null) {
            f = motionEvent.getX();
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            f = 0.0f;
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 2) {
                if (this.f162230a == -1.0f) {
                    this.f162230a = f;
                }
            } else if (num.intValue() == 1) {
                PagerAdapter adapter = getAdapter();
                if (adapter != null) {
                    i = adapter.getCount();
                } else {
                    i = 0;
                }
                if (getCurrentItem() == 0 && f - this.f162230a > this.f162232c) {
                    AbstractC72361a aVar2 = this.f162231b;
                    if (aVar2 != null) {
                        aVar2.mo114645a(true);
                    }
                } else if (getCurrentItem() == i - 1 && this.f162230a - f > this.f162232c && (aVar = this.f162231b) != null) {
                    aVar.mo114645a(false);
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewGestureViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        this.f162232c = C30745b.m63132b(context, 10.0f);
    }
}
