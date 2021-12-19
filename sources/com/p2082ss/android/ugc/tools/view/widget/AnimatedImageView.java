package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.C20778a;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1885j.C24452a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.tools.view.widget.AnimatedImageView */
public class AnimatedImageView extends SimpleDraweeView {

    /* renamed from: a */
    WeakReference<AbstractC85049g> f190060a;

    /* renamed from: b */
    public AbstractC84992a f190061b;

    /* renamed from: c */
    public boolean f190062c;

    /* renamed from: d */
    public boolean f190063d;

    /* renamed from: e */
    boolean f190064e;

    /* renamed from: f */
    protected AbstractC24203d<AbstractC24457f> f190065f = new C24202c<AbstractC24457f>() {
        /* class com.p2082ss.android.ugc.tools.view.widget.AnimatedImageView.C849911 */

        static {
            Covode.recordClassIndex(99004);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onRelease(String str) {
            super.onRelease(str);
            AnimatedImageView.this.f190063d = false;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            AnimatedImageView.this.f190063d = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
            super.onIntermediateImageSet(str, fVar);
            AnimatedImageView.this.f190063d = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            Animatable i;
            AbstractC24457f fVar2 = fVar;
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && C20778a.C20782a.f49171a.mo34211a(url) == null && (fVar2 instanceof C24452a)) {
                C20778a.C20782a.f49171a.mo34213a(url, (C24452a) fVar2);
            }
            if (animatable != null) {
                AnimatedImageView.this.f190063d = true;
                if (AnimatedImageView.this.f190062c) {
                    AnimatedImageView animatedImageView = AnimatedImageView.this;
                    if (animatedImageView.getController() != null && animatedImageView.f190062c && animatedImageView.f190063d && animatedImageView.f190064e && (i = animatedImageView.getController().mo39821i()) != null && !i.isRunning()) {
                        i.start();
                        if (animatedImageView.f190060a != null && animatedImageView.f190060a.get() != null) {
                            animatedImageView.f190060a.get();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            AnimatedImageView.this.f190063d = false;
        }
    };

    /* renamed from: g */
    private UrlModel f190066g;

    /* renamed from: com.ss.android.ugc.tools.view.widget.AnimatedImageView$a */
    public interface AbstractC84992a {
        static {
            Covode.recordClassIndex(99005);
        }
    }

    static {
        Covode.recordClassIndex(99003);
    }

    public AbstractC24203d<AbstractC24457f> getControllerListener() {
        return this.f190065f;
    }

    public String getUrl() {
        UrlModel urlModel = this.f190066g;
        if (urlModel == null || urlModel.getUrlList() == null || this.f190066g.getUrlList().size() == 0) {
            return "";
        }
        return this.f190066g.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f190062c = z;
    }

    public void setImageLoadFinishListener(AbstractC84992a aVar) {
        this.f190061b = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f190064e = z;
    }

    public void setAnimationListener(AbstractC85049g gVar) {
        this.f190060a = new WeakReference<>(gVar);
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
