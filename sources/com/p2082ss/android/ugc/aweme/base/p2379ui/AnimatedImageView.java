package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.C20778a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1854e.C24228p;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1885j.C24452a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2381b.AbstractC34682a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AnimatedImageView */
public class AnimatedImageView extends RemoteImageView {

    /* renamed from: a */
    public AbstractC34653a f81831a;

    /* renamed from: b */
    public boolean f81832b;

    /* renamed from: c */
    public boolean f81833c;

    /* renamed from: d */
    protected AbstractC24203d<AbstractC24457f> f81834d = new C24202c<AbstractC24457f>() {
        /* class com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView.C346521 */

        static {
            Covode.recordClassIndex(41622);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onRelease(String str) {
            super.onRelease(str);
            AnimatedImageView.this.f81833c = false;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            AnimatedImageView.this.f81833c = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
            super.onIntermediateImageSet(str, fVar);
            AnimatedImageView.this.f81833c = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            AbstractC24457f fVar2 = fVar;
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && C20778a.C20782a.f49171a.mo34211a(url) == null && (fVar2 instanceof C24452a)) {
                C20778a.C20782a.f49171a.mo34213a(url, (C24452a) fVar2);
            }
            if (animatable != null) {
                AnimatedImageView.this.f81833c = true;
                if (AnimatedImageView.this.f81832b) {
                    AnimatedImageView.this.mo61255b();
                    return;
                }
                return;
            }
            AnimatedImageView.this.f81833c = false;
        }
    };

    /* renamed from: e */
    private WeakReference<AbstractC34682a> f81835e;

    /* renamed from: f */
    private C24117a<Bitmap> f81836f;

    /* renamed from: g */
    private UrlModel f81837g;

    /* renamed from: h */
    private boolean f81838h;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AnimatedImageView$a */
    public interface AbstractC34653a {
        static {
            Covode.recordClassIndex(41623);
        }
    }

    static {
        Covode.recordClassIndex(41621);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView
    /* renamed from: a */
    public void mo61253a() {
    }

    public AbstractC24203d<AbstractC24457f> getControllerListener() {
        return this.f81834d;
    }

    /* renamed from: b */
    public final void mo61255b() {
        Animatable i;
        if (getController() != null && this.f81832b && this.f81833c && this.f81838h && (i = getController().mo39821i()) != null && !i.isRunning()) {
            i.start();
            WeakReference<AbstractC34682a> weakReference = this.f81835e;
            if (weakReference != null && weakReference.get() != null) {
                this.f81835e.get();
            }
        }
    }

    /* renamed from: c */
    public final void mo61256c() {
        Animatable i;
        if (getController() != null && (i = getController().mo39821i()) != null && i.isRunning()) {
            i.stop();
            WeakReference<AbstractC34682a> weakReference = this.f81835e;
            if (weakReference != null && weakReference.get() != null) {
                this.f81835e.get();
            }
        }
    }

    public String getUrl() {
        UrlModel urlModel = this.f81837g;
        if (urlModel == null || urlModel.getUrlList() == null || this.f81837g.getUrlList().size() == 0) {
            return "";
        }
        return this.f81837g.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f81832b = z;
    }

    public void setImageLoadFinishListener(AbstractC34653a aVar) {
        this.f81831a = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f81838h = z;
    }

    public void setAnimationListener(AbstractC34682a aVar) {
        this.f81835e = new WeakReference<>(aVar);
    }

    public AnimatedImageView(Context context) {
        super(context);
        mo61253a();
    }

    /* renamed from: a */
    public final void mo61254a(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            this.f81837g = urlModel;
            ((C24246a) getHierarchy()).mo39953a(0, (Drawable) null);
            C24117a<Bitmap> a = C20778a.C20782a.f49171a.mo34211a(getUrl());
            this.f81836f = a;
            if (a != null && a.mo39700d()) {
                Bitmap a2 = this.f81836f.mo39695a();
                if (!a2.isRecycled()) {
                    ((C24246a) getHierarchy()).mo39953a(0, new C24228p(new BitmapDrawable(a2), C24229q.AbstractC24231b.f57458h));
                    return;
                }
                ((C24246a) getHierarchy()).mo39953a(0, (Drawable) null);
            }
        }
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo61253a();
    }
}
