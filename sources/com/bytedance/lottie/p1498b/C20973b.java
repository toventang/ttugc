package com.bytedance.lottie.p1498b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.AbstractC20975c;
import com.bytedance.lottie.C21118j;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.lottie.b.b */
public final class C20973b {

    /* renamed from: d */
    private static final Object f49701d = new Object();

    /* renamed from: a */
    public final Context f49702a;

    /* renamed from: b */
    public AbstractC20975c f49703b;

    /* renamed from: c */
    public final Set<String> f49704c = new HashSet();

    /* renamed from: e */
    private String f49705e;

    /* renamed from: f */
    private final Map<String, C21118j> f49706f;

    /* renamed from: g */
    private Handler f49707g;

    static {
        Covode.recordClassIndex(24589);
    }

    /* renamed from: a */
    public final void mo34478a() {
        MethodCollector.m26663i(9273);
        this.f49707g.removeMessages(1);
        synchronized (f49701d) {
            try {
                for (Map.Entry<String, C21118j> entry : this.f49706f.entrySet()) {
                    C21118j value = entry.getValue();
                    Bitmap bitmap = value.f50075g;
                    if (bitmap != null) {
                        bitmap.recycle();
                        value.f50075g = null;
                    }
                }
            } finally {
                MethodCollector.m26664o(9273);
            }
        }
    }

    /* renamed from: com.bytedance.lottie.b.b$a */
    static class HandlerC20974a extends Handler {

        /* renamed from: a */
        private WeakReference<C20973b> f49708a;

        static {
            Covode.recordClassIndex(24590);
        }

        public final void handleMessage(Message message) {
            C20973b bVar;
            super.handleMessage(message);
            if (message.what == 1 && (bVar = this.f49708a.get()) != null) {
                bVar.mo34478a();
            }
        }

        HandlerC20974a(C20973b bVar, Looper looper) {
            super(looper);
            this.f49708a = new WeakReference<>(bVar);
        }
    }

    /* renamed from: a */
    public final Bitmap mo34477a(String str) {
        MethodCollector.m26663i(9116);
        C21118j jVar = this.f49706f.get(str);
        if (jVar == null) {
            MethodCollector.m26664o(9116);
            return null;
        }
        Bitmap bitmap = jVar.f50075g;
        if (bitmap != null) {
            MethodCollector.m26664o(9116);
            return bitmap;
        }
        AbstractC20975c cVar = this.f49703b;
        if (cVar != null) {
            cVar.mo30276b();
            MethodCollector.m26664o(9116);
            return null;
        }
        String str2 = jVar.f50072d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f49705e)) {
                    Bitmap a = m39525a(str, BitmapFactory.decodeStream(this.f49702a.getAssets().open(this.f49705e + str2), null, options));
                    MethodCollector.m26664o(9116);
                    return a;
                }
                IllegalStateException illegalStateException = new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                MethodCollector.m26664o(9116);
                throw illegalStateException;
            } catch (IOException unused) {
                MethodCollector.m26664o(9116);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap a2 = m39525a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                MethodCollector.m26664o(9116);
                return a2;
            } catch (IllegalArgumentException unused2) {
                MethodCollector.m26664o(9116);
                return null;
            }
        }
    }

    /* renamed from: a */
    private Bitmap m39525a(String str, Bitmap bitmap) {
        MethodCollector.m26663i(9274);
        synchronized (f49701d) {
            try {
                if (!this.f49704c.contains(str)) {
                    this.f49706f.get(str).f50075g = bitmap;
                }
            } finally {
                MethodCollector.m26664o(9274);
            }
        }
        return bitmap;
    }

    public C20973b(Drawable.Callback callback, String str, AbstractC20975c cVar, Map<String, C21118j> map) {
        this.f49705e = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f49705e;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f49705e += '/';
            }
        }
        if (!(callback instanceof View)) {
            this.f49706f = new HashMap();
            this.f49702a = null;
            return;
        }
        this.f49702a = ((View) callback).getContext();
        this.f49706f = map;
        this.f49703b = cVar;
        this.f49707g = new HandlerC20974a(this, Looper.getMainLooper());
    }
}
