package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView */
public class SugCompletionView extends AppCompatImageView {

    /* renamed from: a */
    private int f84864a;

    /* renamed from: b */
    private AbstractC35955a f84865b;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView$a */
    public interface AbstractC35955a {
        static {
            Covode.recordClassIndex(43201);
        }

        /* renamed from: a */
        void mo62952a();

        /* renamed from: a */
        void mo62953a(boolean z);
    }

    static {
        Covode.recordClassIndex(43200);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public void setKeyboardDismissHandler(AbstractC35955a aVar) {
        this.f84865b = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r2 != 3) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView$a r0 = r5.f84865b
            if (r0 == 0) goto L_0x001c
            float r4 = r6.getX()
            float r3 = r6.getY()
            int r2 = r6.getAction()
            r1 = 0
            if (r2 == 0) goto L_0x0058
            r1 = 1
            if (r2 == r1) goto L_0x0052
            r0 = 2
            if (r2 == r0) goto L_0x0021
            r0 = 3
            if (r2 == r0) goto L_0x0052
        L_0x001c:
            boolean r0 = super.dispatchTouchEvent(r6)
            return r0
        L_0x0021:
            int r0 = r5.f84864a
            float r2 = (float) r0
            float r1 = -r2
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            int r1 = r5.getRight()
            int r0 = r5.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            int r1 = r5.getBottom()
            int r0 = r5.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            goto L_0x001c
        L_0x004c:
            com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView$a r0 = r5.f84865b
            r0.mo62952a()
            goto L_0x001c
        L_0x0052:
            com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView$a r0 = r5.f84865b
            r0.mo62953a(r1)
            goto L_0x001c
        L_0x0058:
            com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView$a r0 = r5.f84865b
            r0.mo62953a(r1)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.choosemusic.view.SugCompletionView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public SugCompletionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SugCompletionView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f84864a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
