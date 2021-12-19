package com.facebook.imagepipeline.p1890o;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1839k.C24134g;
import com.facebook.imagepipeline.common.C24360a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.p1880e.C24420i;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.o.c */
public class C24639c {

    /* renamed from: a */
    public Uri f58550a;

    /* renamed from: b */
    public List<Uri> f58551b;

    /* renamed from: c */
    public C24636b.EnumC24638b f58552c = C24636b.EnumC24638b.FULL_FETCH;

    /* renamed from: d */
    public C24363d f58553d;

    /* renamed from: e */
    public C24364e f58554e;

    /* renamed from: f */
    public C24361b f58555f = C24361b.f57766a;

    /* renamed from: g */
    public C24636b.EnumC24637a f58556g = C24636b.EnumC24637a.DEFAULT;

    /* renamed from: h */
    public boolean f58557h = C24420i.f57892B.f57950a;

    /* renamed from: i */
    public boolean f58558i = false;

    /* renamed from: j */
    public EnumC24362c f58559j = EnumC24362c.HIGH;

    /* renamed from: k */
    public AbstractC24641d f58560k = null;

    /* renamed from: l */
    boolean f58561l = true;

    /* renamed from: m */
    public boolean f58562m = false;

    /* renamed from: n */
    public boolean f58563n = true;

    /* renamed from: o */
    public AbstractC24462c f58564o;

    /* renamed from: p */
    public C24360a f58565p = null;

    static {
        Covode.recordClassIndex(28789);
    }

    private C24639c() {
    }

    /* renamed from: a */
    public final C24636b mo40483a() {
        Uri uri = this.f58550a;
        if (uri != null) {
            if (C24134g.m45742g(uri)) {
                if (!this.f58550a.isAbsolute()) {
                    throw new C24640a("Resource URI path must be absolute.");
                } else if (!this.f58550a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f58550a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new C24640a("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new C24640a("Resource URI must not be empty");
                }
            }
            if (!C24134g.m45741f(this.f58550a) || this.f58550a.isAbsolute()) {
                return new C24636b(this);
            }
            throw new C24640a("Asset URI path must be absolute.");
        }
        throw new C24640a("Source must be set!");
    }

    /* renamed from: a */
    public final C24639c mo40484a(EnumC24362c cVar) {
        this.f58559j = cVar;
        return this;
    }

    /* renamed from: b */
    private C24639c m47151b(Uri uri) {
        C24091i.m45617a(uri);
        this.f58550a = uri;
        return this;
    }

    /* renamed from: a */
    public final C24639c mo40485a(AbstractC24641d dVar) {
        this.f58560k = dVar;
        return this;
    }

    /* renamed from: com.facebook.imagepipeline.o.c$a */
    public static class C24640a extends RuntimeException {
        static {
            Covode.recordClassIndex(28790);
        }

        public C24640a(String str) {
            super("Invalid request builder: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: a */
    public static C24639c m47149a(Uri uri) {
        return new C24639c().m47151b(uri);
    }

    /* renamed from: a */
    public final C24639c mo40486a(boolean z) {
        if (z) {
            this.f58554e = C24364e.f57783b;
            return this;
        }
        this.f58554e = C24364e.f57784c;
        return this;
    }

    /* renamed from: a */
    public static C24639c m47150a(C24636b bVar) {
        C24639c a = m47149a(bVar.mSourceUri);
        a.f58555f = bVar.mImageDecodeOptions;
        a.f58565p = bVar.mBytesRange;
        a.f58556g = bVar.mCacheChoice;
        a.f58558i = bVar.mLocalThumbnailPreviewsEnabled;
        a.f58552c = bVar.mLowestPermittedRequestLevel;
        a.f58560k = bVar.mPostprocessor;
        a.f58557h = bVar.mProgressiveRenderingEnabled;
        a.f58559j = bVar.mRequestPriority;
        a.f58553d = bVar.mResizeOptions;
        a.f58564o = bVar.mRequestListener;
        a.f58554e = bVar.mRotationOptions;
        return a;
    }
}
