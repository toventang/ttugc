package androidx.core.widget;

import android.os.Build;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.widget.f */
public final class C0821f extends AbstractView$OnTouchListenerC0814a {

    /* renamed from: h */
    private final ListView f3049h;

    static {
        Covode.recordClassIndex(904);
    }

    public C0821f(ListView listView) {
        super(listView);
        this.f3049h = listView;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0814a
    /* renamed from: a */
    public final void mo3000a(int i) {
        ListView listView = this.f3049h;
        int i2 = Build.VERSION.SDK_INT;
        listView.scrollListBy(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0814a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3002b(int r8) {
        /*
            r7 = this;
            android.widget.ListView r6 = r7.f3049h
            int r5 = r6.getCount()
            r4 = 0
            if (r5 != 0) goto L_0x000a
            return r4
        L_0x000a:
            int r3 = r6.getChildCount()
            int r1 = r6.getFirstVisiblePosition()
            int r0 = r1 + r3
            r2 = 1
            if (r8 <= 0) goto L_0x0029
            if (r0 < r5) goto L_0x0038
            int r3 = r3 - r2
            android.view.View r0 = r6.getChildAt(r3)
            int r1 = r0.getBottom()
            int r0 = r6.getHeight()
            if (r1 > r0) goto L_0x0038
            return r4
        L_0x0029:
            if (r8 >= 0) goto L_0x0039
            if (r1 > 0) goto L_0x0038
            android.view.View r0 = r6.getChildAt(r4)
            int r0 = r0.getTop()
            if (r0 < 0) goto L_0x0038
            return r4
        L_0x0038:
            return r2
        L_0x0039:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0821f.mo3002b(int):boolean");
    }
}
