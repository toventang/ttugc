package com.facebook.imagepipeline.p1879d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;

/* renamed from: com.facebook.imagepipeline.d.j */
public final class C24389j implements AbstractC24380f {

    /* renamed from: b */
    private static C24389j f57842b;

    /* renamed from: a */
    public boolean f57843a;

    /* renamed from: c */
    private boolean f57844c;

    /* renamed from: d */
    private String[] f57845d;

    static {
        Covode.recordClassIndex(28532);
    }

    protected C24389j() {
    }

    /* renamed from: a */
    public static synchronized C24389j m46446a() {
        C24389j jVar;
        synchronized (C24389j.class) {
            MethodCollector.m26663i(3441);
            if (f57842b == null) {
                f57842b = new C24389j();
            }
            jVar = f57842b;
            MethodCollector.m26664o(3441);
        }
        return jVar;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24380f
    /* renamed from: a */
    public final AbstractC24026e mo40187a(C24636b bVar) {
        return mo40186a(bVar.mSourceUri);
    }

    /* renamed from: b */
    private String m46447b(Uri uri) {
        if (this.f57844c) {
            return m46448c(uri);
        }
        return uri.toString();
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24380f
    /* renamed from: a */
    public final AbstractC24026e mo40186a(Uri uri) {
        return new C24031j(m46447b(uri));
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24380f
    /* renamed from: b */
    public final AbstractC24026e mo40189b(C24636b bVar) {
        return new C24403u(bVar.mSourceUri.toString(), bVar.mResizeOptions, bVar.getSourceFile());
    }

    /* renamed from: c */
    private String m46448c(Uri uri) {
        if (uri == null) {
            return "";
        }
        if (!("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))) {
            return uri.toString();
        }
        String[] strArr = this.f57845d;
        if (strArr == null || strArr.length <= 0) {
            return uri.toString();
        }
        String host = uri.getHost();
        if (host != null) {
            String[] strArr2 = this.f57845d;
            for (String str : strArr2) {
                if (str != null && host.endsWith(str)) {
                    return m46449d(uri);
                }
            }
        }
        return uri.toString();
    }

    /* renamed from: d */
    private String m46449d(Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme()).append(":");
        if (uri.getEncodedAuthority() != null) {
            sb.append("//");
        }
        String encodedPath = uri.getEncodedPath();
        if (encodedPath != null) {
            sb.append(encodedPath);
        }
        if (this.f57843a) {
            return sb.toString();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            sb.append("?").append(encodedQuery);
        }
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment != null) {
            sb.append("#").append(encodedFragment);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo40209a(String[] strArr) {
        this.f57844c = true;
        this.f57845d = strArr;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24380f
    /* renamed from: a */
    public final AbstractC24026e mo40188a(C24636b bVar, Object obj) {
        return new C24370c(m46447b(bVar.mSourceUri), bVar.mResizeOptions, bVar.mRotationOptions, bVar.mImageDecodeOptions, null, null, obj);
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24380f
    /* renamed from: b */
    public final AbstractC24026e mo40190b(C24636b bVar, Object obj) {
        String str;
        AbstractC24641d dVar = bVar.mPostprocessor;
        AbstractC24026e eVar = null;
        if (dVar != null) {
            eVar = dVar.getPostprocessorCacheKey();
            str = dVar.getClass().getName();
        } else {
            str = null;
        }
        return new C24370c(m46447b(bVar.mSourceUri), bVar.mResizeOptions, bVar.mRotationOptions, bVar.mImageDecodeOptions, eVar, str, obj);
    }
}
