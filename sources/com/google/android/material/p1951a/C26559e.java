package com.google.android.material.p1951a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.a.e */
public final class C26559e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f62662a = new C26559e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f62663b = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(31990);
    }

    private C26559e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ Integer get(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return Integer.valueOf(drawable.getAlpha());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(Drawable drawable, Integer num) {
        int i = Build.VERSION.SDK_INT;
        drawable.setAlpha(num.intValue());
    }
}
