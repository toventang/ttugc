package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.C29299t;
import java.io.InputStream;

/* renamed from: com.squareup.b.y */
public abstract class AbstractC29315y {
    static {
        Covode.recordClassIndex(35664);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo51104a() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo51105a(NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: a */
    public abstract boolean mo51062a(C29312w wVar);

    /* renamed from: b */
    public abstract C29316a mo51063b(C29312w wVar);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo51106b() {
        return false;
    }

    /* renamed from: a */
    static boolean m58717a(BitmapFactory.Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    static BitmapFactory.Options m58718d(C29312w wVar) {
        boolean z;
        boolean c = wVar.mo51126c();
        if (wVar.f69575q != null) {
            z = true;
        } else {
            z = false;
        }
        BitmapFactory.Options options = null;
        if (c || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c;
            if (z) {
                options.inPreferredConfig = wVar.f69575q;
            }
        }
        return options;
    }

    /* renamed from: com.squareup.b.y$a */
    public static final class C29316a {

        /* renamed from: a */
        public final C29299t.EnumC29305d f69605a;

        /* renamed from: b */
        public final Bitmap f69606b;

        /* renamed from: c */
        public final InputStream f69607c;

        /* renamed from: d */
        public final int f69608d;

        static {
            Covode.recordClassIndex(35665);
        }

        public C29316a(Bitmap bitmap, C29299t.EnumC29305d dVar) {
            this((Bitmap) C29262ae.m58605a(bitmap, "bitmap == null"), null, dVar, 0);
        }

        public C29316a(InputStream inputStream, C29299t.EnumC29305d dVar) {
            this(null, (InputStream) C29262ae.m58605a(inputStream, "stream == null"), dVar, 0);
        }

        C29316a(Bitmap bitmap, InputStream inputStream, C29299t.EnumC29305d dVar, int i) {
            boolean z;
            boolean z2 = true;
            if (bitmap != null) {
                z = true;
            } else {
                z = false;
            }
            if ((inputStream == null ? false : z2) ^ z) {
                this.f69606b = bitmap;
                this.f69607c = inputStream;
                this.f69605a = (C29299t.EnumC29305d) C29262ae.m58605a(dVar, "loadedFrom == null");
                this.f69608d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    static void m58716a(int i, int i2, BitmapFactory.Options options, C29312w wVar) {
        m58715a(i, i2, options.outWidth, options.outHeight, options, wVar);
    }

    /* renamed from: a */
    static void m58715a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C29312w wVar) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                if (wVar.f69569k) {
                    i5 = Math.max(floor2, floor3);
                } else {
                    i5 = Math.min(floor2, floor3);
                }
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
