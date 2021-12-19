package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1948g.C25746g;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.l */
public final class C27874l implements Closeable {

    /* renamed from: a */
    final URL f65456a;

    /* renamed from: b */
    AbstractC25631h<Bitmap> f65457b;

    /* renamed from: c */
    private volatile InputStream f65458c;

    static {
        Covode.recordClassIndex(33467);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            InputStream inputStream = this.f65458c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    try {
                        C25746g.f60865a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                    } catch (IOException e2) {
                        throw new AssertionError(e2);
                    }
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo46568a() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C27874l.mo46568a():byte[]");
    }

    private C27874l(URL url) {
        this.f65456a = url;
    }

    /* renamed from: a */
    public static C27874l m55785a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C27874l(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                new String("Not downloading image, bad URL: ");
            }
            return null;
        }
    }
}
