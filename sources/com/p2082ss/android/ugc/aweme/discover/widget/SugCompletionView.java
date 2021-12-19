package com.p2082ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.SugCompletionView */
public class SugCompletionView extends AppCompatImageView {

    /* renamed from: a */
    private int f100305a;

    /* renamed from: b */
    private AbstractC43029a f100306b;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.SugCompletionView$a */
    public interface AbstractC43029a {
        static {
            Covode.recordClassIndex(51177);
        }

        /* renamed from: a */
        void mo70890a();

        /* renamed from: a */
        void mo70891a(C67679e eVar, int i);

        /* renamed from: a */
        void mo70892a(boolean z);
    }

    static {
        Covode.recordClassIndex(51176);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public void setKeyboardDismissHandler(AbstractC43029a aVar) {
        this.f100306b = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f100306b != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f100306b.mo70892a(false);
            } else if (action != 2) {
                this.f100306b.mo70892a(true);
            } else {
                float f = (float) this.f100305a;
                float f2 = -f;
                if (x < f2 || y < f2 || x >= ((float) (getRight() - getLeft())) + f || y >= ((float) (getBottom() - getTop())) + f) {
                    this.f100306b.mo70890a();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public SugCompletionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SugCompletionView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f100305a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
