package com.lynx.tasm.behavior.p2052ui.p2053a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.a.d */
public class C28591d implements Drawable.Callback {

    /* renamed from: a */
    public List<AbstractC28590c> f67308a = new ArrayList();

    /* renamed from: b */
    public List<C28594f> f67309b = new ArrayList();

    /* renamed from: c */
    public List<Integer> f67310c = new ArrayList();

    /* renamed from: d */
    public List<Integer> f67311d = new ArrayList();

    /* renamed from: e */
    public List<EnumC28596h> f67312e = new ArrayList();

    /* renamed from: f */
    public List<C28597i> f67313f = new ArrayList();

    /* renamed from: g */
    public Bitmap.Config f67314g;

    /* renamed from: h */
    private AbstractC28520j f67315h;

    /* renamed from: i */
    private BackgroundDrawable f67316i;

    /* renamed from: j */
    private float f67317j;

    static {
        Covode.recordClassIndex(34626);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* renamed from: a */
    public final boolean mo49417a() {
        if (!this.f67308a.isEmpty()) {
            return true;
        }
        return false;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.f67316i.invalidateSelf();
    }

    /* renamed from: a */
    public final void mo49415a(Rect rect) {
        for (AbstractC28590c cVar : this.f67308a) {
            cVar.mo49401a(rect.width(), rect.height());
        }
    }

    /* renamed from: a */
    public final void mo49416a(ReadableArray readableArray) {
        this.f67308a.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            int i = 0;
            while (i < size) {
                int i2 = readableArray.getInt(i);
                if (i2 == 1) {
                    i++;
                    if (LynxEnv.m56706b().f66649p != null) {
                        AbstractC28590c a = LynxEnv.m56706b().f66649p.mo49409a(this.f67315h, readableArray.getString(i));
                        a.setCallback(this);
                        this.f67308a.add(a);
                    }
                } else if (i2 == 2) {
                    i++;
                    this.f67308a.add(new C28592e(readableArray.getArray(i)));
                } else if (i2 == 3) {
                    i++;
                    this.f67308a.add(new C28595g(readableArray.getArray(i)));
                }
                i++;
            }
        }
    }

    public C28591d(AbstractC28520j jVar, BackgroundDrawable backgroundDrawable, float f) {
        this.f67315h = jVar;
        this.f67316i = backgroundDrawable;
        this.f67317j = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r1 < r6) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        if (r1 > r6) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f6, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0169 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0236  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49414a(android.graphics.Canvas r20, android.graphics.RectF r21, android.graphics.RectF r22, android.graphics.RectF r23, android.graphics.RectF r24, android.graphics.Path r25) {
        /*
        // Method dump skipped, instructions count: 609
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.p2053a.C28591d.mo49414a(android.graphics.Canvas, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.Path):void");
    }
}
