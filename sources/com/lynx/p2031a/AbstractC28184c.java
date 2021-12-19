package com.lynx.p2031a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.utils.C28929m;

/* renamed from: com.lynx.a.c */
public abstract class AbstractC28184c {
    static {
        Covode.recordClassIndex(34130);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48199a(Bitmap bitmap);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48202a(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo48203b(Bitmap bitmap);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo48206b(Throwable th);

    /* renamed from: a */
    public final void mo48200a(final Uri uri, final Bitmap bitmap) {
        if (C28929m.m57950a()) {
            mo48199a(bitmap);
        } else {
            C28929m.m57947a(new Runnable() {
                /* class com.lynx.p2031a.AbstractC28184c.RunnableC281851 */

                static {
                    Covode.recordClassIndex(34131);
                }

                public final void run() {
                    AbstractC28184c.this.mo48199a(bitmap);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo48204b(final Uri uri, final Bitmap bitmap) {
        if (C28929m.m57950a()) {
            mo48203b(bitmap);
        } else {
            C28929m.m57947a(new Runnable() {
                /* class com.lynx.p2031a.AbstractC28184c.RunnableC281862 */

                static {
                    Covode.recordClassIndex(34132);
                }

                public final void run() {
                    AbstractC28184c.this.mo48203b(bitmap);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo48201a(final Uri uri, final Throwable th) {
        if (C28929m.m57950a()) {
            mo48202a(th);
        } else {
            C28929m.m57947a(new Runnable() {
                /* class com.lynx.p2031a.AbstractC28184c.RunnableC281873 */

                static {
                    Covode.recordClassIndex(34133);
                }

                public final void run() {
                    AbstractC28184c.this.mo48202a(th);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo48205b(final Uri uri, final Throwable th) {
        if (C28929m.m57950a()) {
            mo48206b(th);
        } else {
            C28929m.m57947a(new Runnable() {
                /* class com.lynx.p2031a.AbstractC28184c.RunnableC281884 */

                static {
                    Covode.recordClassIndex(34134);
                }

                public final void run() {
                    AbstractC28184c.this.mo48206b(th);
                }
            });
        }
    }
}
