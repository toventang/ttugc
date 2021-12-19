package com.airbnb.lottie.p098d;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.C2033b;
import com.airbnb.lottie.p099e.C2107h;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.d.a */
public final class C2042a {

    /* renamed from: a */
    public final C2107h<String> f6126a = new C2107h<>();

    /* renamed from: b */
    public final Map<C2107h<String>, Typeface> f6127b = new HashMap();

    /* renamed from: c */
    public final Map<String, Typeface> f6128c = new HashMap();

    /* renamed from: d */
    public final AssetManager f6129d;

    /* renamed from: e */
    public C2033b f6130e;

    /* renamed from: f */
    public String f6131f = ".ttf";

    static {
        Covode.recordClassIndex(2237);
    }

    public C2042a(Drawable.Callback callback, C2033b bVar) {
        this.f6130e = bVar;
        if (!(callback instanceof View)) {
            this.f6129d = null;
        } else {
            this.f6129d = ((View) callback).getContext().getAssets();
        }
    }
}
