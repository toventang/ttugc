package com.p2082ss.android.ttvecamera.p2195d;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30956m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.d.c */
public final class C30796c {

    /* renamed from: f */
    public static final List<String> f73736f;

    /* renamed from: a */
    protected final int f73737a = 90;

    /* renamed from: b */
    protected final float f73738b = 1.0f;

    /* renamed from: c */
    protected final float f73739c = 2.0f;

    /* renamed from: d */
    public int f73740d;

    /* renamed from: e */
    public List<Camera.Area> f73741e = new ArrayList();

    /* renamed from: g */
    private int f73742g = 1;

    /* renamed from: h */
    private List<Camera.Area> f73743h = new ArrayList();

    static {
        Covode.recordClassIndex(37421);
        ArrayList arrayList = new ArrayList();
        f73736f = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    /* renamed from: a */
    public static boolean m63288a(Camera.Parameters parameters) {
        if (parameters == null || parameters.getMaxNumMeteringAreas() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List<Camera.Area> mo55768a(int i, int i2, float f, int i3, int i4, int i5) {
        Rect a = mo55767a(i, i2, f, 180.0f, i3, i4, i5);
        if (this.f73743h.size() > 0) {
            this.f73743h.clear();
        }
        this.f73743h.add(new Camera.Area(a, 1000));
        return this.f73743h;
    }

    /* renamed from: a */
    public final Rect mo55767a(int i, int i2, float f, float f2, int i3, int i4, int i5) {
        int intValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) ((((float) (i3 * LiveNetAdaptiveHurryTimeSetting.DEFAULT)) * 1.0f) / ((float) i))) - 1000;
        int i7 = ((int) ((((float) (i4 * LiveNetAdaptiveHurryTimeSetting.DEFAULT)) * 1.0f) / ((float) i2))) - 1000;
        if (this.f73740d == 1) {
            i6 = -i6;
        }
        int i8 = intValue / 2;
        int a = C30956m.m63658a(i6 - i8, -1000, 1000);
        int a2 = C30956m.m63658a(i7 - i8, -1000, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) C30956m.m63657a(a + intValue), (float) C30956m.m63657a(a2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        C30956m.m63667a(i5, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = C30956m.m63657a(rect2.left);
        rect2.right = C30956m.m63657a(rect2.right);
        rect2.top = C30956m.m63657a(rect2.top);
        rect2.bottom = C30956m.m63657a(rect2.bottom);
        return rect2;
    }
}
