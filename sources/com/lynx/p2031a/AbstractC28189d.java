package com.lynx.p2031a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;

/* renamed from: com.lynx.a.d */
public abstract class AbstractC28189d {
    public volatile boolean mDestroyed;

    static {
        Covode.recordClassIndex(34135);
    }

    public abstract Bitmap getCurrent();

    /* access modifiers changed from: protected */
    public abstract void onDestroy();

    /* access modifiers changed from: protected */
    public abstract void onLoad(AbstractC28520j jVar, Uri uri, C28182b bVar, AbstractC28184c cVar);

    /* access modifiers changed from: protected */
    public abstract void onPause();

    /* access modifiers changed from: protected */
    public abstract void onRelease();

    /* access modifiers changed from: protected */
    public abstract void onResume();

    public final void destroy() {
        if (!this.mDestroyed) {
            this.mDestroyed = true;
            onDestroy();
        }
    }

    public final void pause() {
        if (!this.mDestroyed) {
            onPause();
        }
    }

    public final void release() {
        if (!this.mDestroyed) {
            onRelease();
        }
    }

    public final void resume() {
        if (!this.mDestroyed) {
            onResume();
        }
    }

    private void sequenceLoad(AbstractC28520j jVar, final Uri uri, C28182b bVar, final AbstractC28184c cVar) {
        onLoad(jVar, uri, bVar, new AbstractC28184c() {
            /* class com.lynx.p2031a.AbstractC28189d.C281901 */

            static {
                Covode.recordClassIndex(34136);
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: b */
            public final void mo48206b(Throwable th) {
                AbstractC28184c cVar;
                if (!AbstractC28189d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.mo48206b(th);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: a */
            public final void mo48199a(Bitmap bitmap) {
                AbstractC28184c cVar;
                if (!AbstractC28189d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.mo48200a(uri, bitmap);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: b */
            public final void mo48203b(Bitmap bitmap) {
                AbstractC28184c cVar;
                if (!AbstractC28189d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.mo48204b(uri, bitmap);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: a */
            public final void mo48202a(Throwable th) {
                AbstractC28184c cVar;
                if (!AbstractC28189d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.mo48201a(uri, th);
                }
            }
        });
    }

    public final void load(AbstractC28520j jVar, Uri uri, C28182b bVar, AbstractC28184c cVar) {
        if (this.mDestroyed) {
            LLog.m56856a(6, "LynxImageLoader", "load after destroyed");
        } else if (jVar != null && uri != null) {
            sequenceLoad(jVar, uri, bVar, cVar);
        }
    }
}
