package androidx.emoji.widget;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.widget.f */
final class C0914f implements KeyListener {

    /* renamed from: a */
    private final KeyListener f3273a;

    static {
        Covode.recordClassIndex(1002);
    }

    public final int getInputType() {
        return this.f3273a.getInputType();
    }

    C0914f(KeyListener keyListener) {
        this.f3273a = keyListener;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f3273a.clearMetaKeyState(view, editable, i);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3273a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f3273a.onKeyUp(view, editable, i, keyEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r1 = 0
            r0 = 19
            r0 = 67
            if (r6 == r0) goto L_0x001c
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto L_0x0017
        L_0x000e:
            android.text.method.KeyListener r0 = r3.f3273a
            boolean r0 = r0.onKeyDown(r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0027
        L_0x0016:
            return r2
        L_0x0017:
            boolean r0 = androidx.emoji.p045a.C0888c.m3081a(r5, r7, r2)
            goto L_0x0020
        L_0x001c:
            boolean r0 = androidx.emoji.p045a.C0888c.m3081a(r5, r7, r1)
        L_0x0020:
            if (r0 == 0) goto L_0x000e
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            r0 = 1
            goto L_0x0016
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.widget.C0914f.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }
}
