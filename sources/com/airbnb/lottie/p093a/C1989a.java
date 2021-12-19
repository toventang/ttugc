package com.airbnb.lottie.p093a;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.a.a */
public final class C1989a extends Paint {
    static {
        Covode.recordClassIndex(2184);
    }

    public final void setTextLocales(LocaleList localeList) {
    }

    public C1989a() {
    }

    public C1989a(int i) {
        super(i);
    }

    public C1989a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C1989a(PorterDuff.Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
