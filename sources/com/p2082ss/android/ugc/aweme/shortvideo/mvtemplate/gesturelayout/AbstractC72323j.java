package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j */
public abstract class AbstractC72323j {

    /* renamed from: a */
    public static final C72324a f162119a = new C72324a((byte) 0);

    static {
        Covode.recordClassIndex(84990);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo114591c();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j$a */
    public static final class C72324a {
        static {
            Covode.recordClassIndex(84991);
        }

        private C72324a() {
        }

        public /* synthetic */ C72324a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final Rect mo114590b() {
        View c = mo114591c();
        if (c == null || !C0792v.m2791y(c)) {
            return null;
        }
        Rect rect = new Rect();
        c.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: a */
    public final Rect mo114589a() {
        View c = mo114591c();
        if (c == null || !C0792v.m2791y(c)) {
            return null;
        }
        int[] iArr = new int[2];
        c.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, (int) (((float) i) + (((float) c.getWidth()) * c.getScaleX())), (int) (((float) i2) + (((float) c.getHeight()) * c.getScaleY())));
    }
}
