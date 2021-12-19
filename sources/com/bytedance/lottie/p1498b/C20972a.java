package com.bytedance.lottie.p1498b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C20971b;
import com.bytedance.lottie.p1499c.C21036h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.lottie.b.a */
public final class C20972a {

    /* renamed from: a */
    public final C21036h<String> f49695a = new C21036h<>();

    /* renamed from: b */
    public final Map<C21036h<String>, Typeface> f49696b = new HashMap();

    /* renamed from: c */
    public C20971b f49697c;

    /* renamed from: d */
    public String f49698d = ".ttf";

    /* renamed from: e */
    private final Map<String, Typeface> f49699e = new HashMap();

    /* renamed from: f */
    private final AssetManager f49700f;

    static {
        Covode.recordClassIndex(24588);
    }

    /* renamed from: a */
    public final Typeface mo34476a(String str) {
        Typeface typeface = this.f49699e.get(str);
        if (typeface != null) {
            return typeface;
        }
        C20971b bVar = this.f49697c;
        Typeface typeface2 = null;
        try {
            typeface2 = Typeface.createFromAsset(this.f49700f, "fonts/" + str + this.f49698d);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        this.f49699e.put(str, typeface2);
        return typeface2;
    }

    public C20972a(Drawable.Callback callback, C20971b bVar) {
        this.f49697c = bVar;
        if (!(callback instanceof View)) {
            this.f49700f = null;
        } else {
            this.f49700f = ((View) callback).getContext().getAssets();
        }
    }
}
