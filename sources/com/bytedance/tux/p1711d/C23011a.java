package com.bytedance.tux.p1711d;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.d.a */
public final class C23011a {

    /* renamed from: a */
    static Context f54475a;

    /* renamed from: b */
    static Map<String, Typeface> f54476b = new LinkedHashMap();

    /* renamed from: c */
    public static final C23011a f54477c = new C23011a();

    private C23011a() {
    }

    static {
        Covode.recordClassIndex(26931);
    }

    /* renamed from: a */
    public static Typeface m43398a(String str) {
        C89219l.m154719c(str, "");
        Typeface typeface = f54476b.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface b = m43399b(str);
        f54476b.put(str, b);
        return b;
    }

    /* renamed from: b */
    static Typeface m43399b(String str) {
        AssetManager assets;
        Context context = f54475a;
        Typeface typeface = null;
        if (context == null || (assets = context.getAssets()) == null) {
            return null;
        }
        try {
            typeface = Typeface.createFromAsset(assets, str);
            return typeface;
        } catch (Exception e) {
            e.getMessage();
            return typeface;
        }
    }
}
