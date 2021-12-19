package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.b.j */
public interface AbstractC29285j {
    static {
        Covode.recordClassIndex(35634);
    }

    /* renamed from: a */
    C29286a mo51057a(Uri uri, int i);

    /* renamed from: com.squareup.b.j$b */
    public static class C29287b extends IOException {

        /* renamed from: a */
        final boolean f69484a;

        /* renamed from: b */
        final int f69485b;

        static {
            Covode.recordClassIndex(35636);
        }

        public C29287b(String str, int i, int i2) {
            super(str);
            this.f69484a = EnumC29295q.isOfflineOnly(i);
            this.f69485b = i2;
        }
    }

    /* renamed from: com.squareup.b.j$a */
    public static class C29286a {

        /* renamed from: a */
        public final InputStream f69480a;

        /* renamed from: b */
        public final Bitmap f69481b;

        /* renamed from: c */
        final boolean f69482c;

        /* renamed from: d */
        public final long f69483d;

        static {
            Covode.recordClassIndex(35635);
        }

        public C29286a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f69480a = inputStream;
                this.f69481b = null;
                this.f69482c = z;
                this.f69483d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }
}
