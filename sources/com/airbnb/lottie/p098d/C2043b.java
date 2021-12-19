package com.airbnb.lottie.p098d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.AbstractC2038c;
import com.airbnb.lottie.C2152h;
import com.airbnb.lottie.C2199j;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2194g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.d.b */
public final class C2043b {

    /* renamed from: c */
    private static final Object f6132c = new Object();

    /* renamed from: a */
    public final Context f6133a;

    /* renamed from: b */
    public AbstractC2038c f6134b;

    /* renamed from: d */
    private String f6135d;

    /* renamed from: e */
    private final Map<String, C2152h> f6136e;

    static {
        Covode.recordClassIndex(2238);
    }

    /* renamed from: a */
    public final void mo5939a() {
        MethodCollector.m26663i(13437);
        try {
            synchronized (f6132c) {
                try {
                    for (Map.Entry<String, C2152h> entry : this.f6136e.entrySet()) {
                        C2152h value = entry.getValue();
                        Bitmap bitmap = value.f6515g;
                        if (bitmap != null) {
                            bitmap.recycle();
                            value.f6515g = null;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13437);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(13437);
        }
    }

    /* renamed from: b */
    public final void mo5940b() {
        MethodCollector.m26663i(13438);
        try {
            synchronized (f6132c) {
                try {
                    for (Map.Entry<String, C2152h> entry : this.f6136e.entrySet()) {
                        C2152h value = entry.getValue();
                        if (value.f6515g != null) {
                            value.f6515g = null;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13438);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(13438);
        }
    }

    /* renamed from: a */
    public final Bitmap mo5938a(String str) {
        Bitmap bitmap;
        MethodCollector.m26663i(13436);
        C2152h hVar = this.f6136e.get(str);
        if (hVar == null) {
            MethodCollector.m26664o(13436);
            return null;
        }
        Bitmap bitmap2 = hVar.f6515g;
        if (bitmap2 != null) {
            MethodCollector.m26664o(13436);
            return bitmap2;
        }
        hVar.f6516h = false;
        hVar.f6517i = false;
        if (C2144d.C2145a.f6479a && C2144d.C2145a.f6484f && C2144d.C2149e.f6506c) {
            int i = hVar.f6509a;
            int i2 = hVar.f6510b;
            if (i >= 32 && i2 >= 32) {
                hVar.f6517i = true;
            }
        }
        AbstractC2038c cVar = this.f6134b;
        if (cVar != null) {
            Bitmap a = cVar.mo5937a(hVar);
            if (a != null) {
                m6464a(str, a);
            }
            MethodCollector.m26664o(13436);
            return a;
        }
        String str2 = hVar.f6512d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.f6135d)) {
                    C2199j.C2200a.m6800a().mo6120a(new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder"));
                    MethodCollector.m26664o(13436);
                    return null;
                }
                InputStream open = this.f6133a.getAssets().open(this.f6135d + str2);
                if (C2144d.C2145a.f6479a) {
                    if (hVar.f6517i) {
                        options.inSampleSize = 2;
                    }
                    try {
                        bitmap = C2194g.m6794a(BitmapFactory.decodeStream(open, null, options), hVar.f6509a, hVar.f6510b, hVar);
                    } catch (IllegalArgumentException e) {
                        if (!C2144d.f6474a) {
                            MethodCollector.m26664o(13436);
                            return null;
                        }
                        MethodCollector.m26664o(13436);
                        throw e;
                    } catch (OutOfMemoryError e2) {
                        if (!C2144d.f6474a) {
                            MethodCollector.m26664o(13436);
                            return null;
                        }
                        MethodCollector.m26664o(13436);
                        throw e2;
                    }
                } else {
                    bitmap = BitmapFactory.decodeStream(open, null, options);
                }
                Bitmap a2 = m6464a(str, bitmap);
                MethodCollector.m26664o(13436);
                return a2;
            } catch (IOException unused) {
                MethodCollector.m26664o(13436);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap a3 = m6464a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                MethodCollector.m26664o(13436);
                return a3;
            } catch (IllegalArgumentException unused2) {
                MethodCollector.m26664o(13436);
                return null;
            }
        }
    }

    /* renamed from: a */
    private Bitmap m6464a(String str, Bitmap bitmap) {
        MethodCollector.m26663i(13439);
        synchronized (f6132c) {
            try {
                this.f6136e.get(str).f6515g = bitmap;
            } finally {
                MethodCollector.m26664o(13439);
            }
        }
        return bitmap;
    }

    public C2043b(Drawable.Callback callback, String str, AbstractC2038c cVar, Map<String, C2152h> map) {
        this.f6135d = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f6135d;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f6135d += '/';
            }
        }
        if (!(callback instanceof View)) {
            this.f6136e = new HashMap();
            this.f6133a = null;
            return;
        }
        this.f6133a = ((View) callback).getContext();
        this.f6136e = map;
        this.f6134b = cVar;
    }
}
