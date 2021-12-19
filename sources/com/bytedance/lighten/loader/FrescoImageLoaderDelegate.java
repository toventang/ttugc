package com.bytedance.lighten.loader;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.C20821u;
import com.bytedance.lighten.p1477a.AbstractC20723c;
import com.bytedance.lighten.p1477a.AbstractC20752i;
import com.bytedance.lighten.p1477a.AbstractC20753j;
import com.bytedance.lighten.p1477a.AbstractC20759p;
import com.bytedance.lighten.p1477a.C20751h;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20762s;
import com.bytedance.lighten.p1477a.C20765u;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.facebook.common.p1833e.C24099a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.imagepipeline.p1880e.AbstractC24412g;
import com.facebook.imagepipeline.p1880e.C24420i;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.imageutils.C24658b;
import java.io.File;
import java.io.IOException;

public class FrescoImageLoaderDelegate implements AbstractC20759p {
    private static volatile boolean sInitialized;
    private AbstractC20723c mFrescoCache;
    private AbstractC20752i mImpl;

    static {
        Covode.recordClassIndex(24344);
    }

    /* renamed from: com_bytedance_lighten_loader_FrescoImageLoaderDelegate_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m39083x6f5d3308(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public AbstractC20723c getCache() {
        return this.mFrescoCache;
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public C20766v load(Uri uri) {
        return new C20766v(uri);
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public C20766v load(C20714a aVar) {
        return new C20766v(aVar);
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public void display(C20765u uVar) {
        if (!sInitialized) {
            m39083x6f5d3308("Lighten:", "display, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.display(uVar);
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public void download(C20765u uVar) {
        if (!sInitialized) {
            m39083x6f5d3308("Lighten:", "trimDisk, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.download(uVar);
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public C20766v load(File file) {
        return new C20766v(Uri.fromFile(file));
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public void loadBitmap(C20765u uVar) {
        if (!sInitialized) {
            m39083x6f5d3308("Lighten:", "loadBitmap, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.loadBitmap(uVar);
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public void trimDisk(int i) {
        if (!sInitialized) {
            m39083x6f5d3308("Lighten:", "trimDisk, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.trimDisk(i);
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public void trimMemory(int i) {
        if (!sInitialized) {
            m39083x6f5d3308("Lighten:", "trimMemory, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.trimMemory(i);
        }
    }

    public void init(C20762s sVar) {
        if (!sInitialized) {
            C20751h.m39050a(sVar.f48996a);
            if (sVar.f49006k) {
                C24420i a = C20823v.m39167a(sVar);
                C24182c.m45841a(sVar.f48996a, a);
                C20821u.C20822a.f49253a.f49251a = a;
                C24099a.m45646b(sVar.f49005j);
            }
            this.mFrescoCache = new C20795l();
            this.mImpl = new C20805q(this.mFrescoCache);
            sInitialized = true;
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public C20766v load(int i) {
        return new C20766v(Uri.parse("res://" + C20761r.f48994d + "/" + i));
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public void init(final AbstractC20753j jVar) {
        if (!sInitialized) {
            C20751h.m39050a(jVar.mo34171b());
            C207711 r6 = new AbstractC24412g() {
                /* class com.bytedance.lighten.loader.FrescoImageLoaderDelegate.C207711 */

                /* renamed from: c */
                private volatile C24420i f49137c;

                static {
                    Covode.recordClassIndex(24345);
                }

                @Override // com.facebook.imagepipeline.p1880e.AbstractC24412g
                /* renamed from: a */
                public final C24420i mo34191a() {
                    MethodCollector.m26663i(8927);
                    if (this.f49137c == null) {
                        synchronized (this) {
                            try {
                                if (this.f49137c == null) {
                                    this.f49137c = C20823v.m39167a(jVar.mo34170a());
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(8927);
                                throw th;
                            }
                        }
                    }
                    C24420i iVar = this.f49137c;
                    MethodCollector.m26664o(8927);
                    return iVar;
                }
            };
            Context b = jVar.mo34171b();
            Boolean valueOf = Boolean.valueOf(jVar.mo34172c());
            C24644b.m47156a();
            if (C24182c.f57220b) {
                C24099a.m45647b(C24182c.f57219a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            } else {
                C24182c.f57220b = true;
            }
            try {
                C24644b.m47156a();
                C24658b.m47174a(b);
                C24644b.m47156a();
            } catch (IOException e) {
                C24099a.m45641a(C24182c.f57219a, e, "Could not initialize SoLoader", new Object[0]);
                C24644b.m47156a();
            }
            Context b2 = C24182c.m45842b(b);
            C24428k.m46554a(r6, valueOf);
            C24182c.m45845c(b2);
            if (valueOf.booleanValue()) {
                C24182c.m45839a();
            }
            C24644b.m47156a();
            C20821u.C20822a.f49253a.f49252b = r6;
            C24099a.m45646b(5);
            this.mFrescoCache = new C20795l();
            this.mImpl = new C20805q(this.mFrescoCache);
            sInitialized = true;
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public C20766v load(Object obj) {
        return new C20766v(obj);
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20759p
    public C20766v load(String str) {
        return new C20766v(str);
    }
}
