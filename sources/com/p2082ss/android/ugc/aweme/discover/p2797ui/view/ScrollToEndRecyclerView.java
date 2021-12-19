package com.p2082ss.android.ugc.aweme.discover.p2797ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42777bl;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.view.ScrollToEndRecyclerView */
public class ScrollToEndRecyclerView extends RecyclerView {

    /* renamed from: O */
    public boolean f100228O;

    static {
        Covode.recordClassIndex(51119);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f100228O) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            C42777bl.f99783a = false;
        } else if (action == 2) {
            C42777bl.f99783a = this.f100228O;
            if (this.f100228O) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public ScrollToEndRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4405a(new C42989a() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.view.ScrollToEndRecyclerView.C429871 */

            static {
                Covode.recordClassIndex(51120);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.view.C42989a
            /* renamed from: a */
            public final void mo73174a(boolean z) {
                super.mo73174a(z);
                ScrollToEndRecyclerView.this.f100228O = z;
            }
        });
    }
}
