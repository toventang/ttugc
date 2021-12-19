package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71494b;
import dmt.p4542av.video.VEPreviewParams;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c */
public final class C71428c {

    /* renamed from: a */
    public static final C71428c f160049a = new C71428c();

    private C71428c() {
    }

    /* renamed from: c */
    public static void m126152c() {
        C71494b.f160203e = 0;
        C71494b.f160204f = 0;
    }

    static {
        Covode.recordClassIndex(83962);
    }

    /* renamed from: b */
    public static boolean m126151b() {
        if (C71494b.f160202d <= 0 || C71494b.f160201c <= 0 || C71494b.f160199a <= 0 || C71494b.f160200b <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m126150a() {
        if (C71494b.f160204f <= 0 || C71494b.f160203e <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m126149a(VEPreviewParams vEPreviewParams) {
        if (vEPreviewParams != null) {
            C71494b.f160203e = vEPreviewParams.getCanvasWidth();
            C71494b.f160204f = vEPreviewParams.getCanvasHeight();
        }
    }

    /* renamed from: a */
    public static void m126148a(int i, int i2, int i3, int i4) {
        C71494b.f160205g = i;
        C71494b.f160206h = i2;
        C71494b.f160207i = i3;
        C71494b.f160208j = i4;
    }
}
