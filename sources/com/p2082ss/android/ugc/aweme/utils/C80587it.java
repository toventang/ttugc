package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.utils.it */
public final class C80587it {

    /* renamed from: a */
    private static C80587it f180205a;

    /* renamed from: b */
    private ExecutorService f180206b;

    /* renamed from: c */
    private Handler f180207c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private LruCache<String, Bitmap> f180208d = new LruCache<String, Bitmap>(this.f180210f / 5) {
        /* class com.p2082ss.android.ugc.aweme.utils.C80587it.C805881 */

        static {
            Covode.recordClassIndex(93861);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final /* synthetic */ int sizeOf(String str, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return bitmap2.getRowBytes() * bitmap2.getHeight();
        }
    };

    /* renamed from: e */
    private String f180209e = C63238c.f143574a.getCacheDir().getPath();

    /* renamed from: f */
    private int f180210f = ((int) Runtime.getRuntime().totalMemory());

    static {
        Covode.recordClassIndex(93860);
    }

    /* renamed from: a */
    public static C80587it m139728a() {
        if (f180205a == null) {
            f180205a = new C80587it();
        }
        return f180205a;
    }

    private C80587it() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 4;
        this.f180206b = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static Bitmap m139727a(String str) {
        String a = C84896h.m145859a(C63247i.f143610a, str);
        if (C84902i.m145892a(a)) {
            return null;
        }
        return ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(a, 1), 90, 110, 2);
    }
}
