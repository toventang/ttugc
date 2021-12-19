package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.C20778a;
import com.bytedance.lighten.p1477a.AbstractC20754k;
import com.bytedance.lighten.p1477a.AbstractC20755l;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20765u;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20724a;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.bytedance.lighten.p1477a.p1481d.ExecutorC20742b;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1854e.C24228p;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.lang.ref.WeakReference;

public class SmartImageView extends SimpleDraweeView implements AbstractC20754k, AbstractC20755l {

    /* renamed from: a */
    private WeakReference<AbstractC20724a> f49152a;

    /* renamed from: b */
    private C20765u f49153b;

    /* renamed from: c */
    public C20784c f49154c;

    /* renamed from: d */
    private String f49155d;

    /* renamed from: e */
    private C24117a<Bitmap> f49156e;

    /* renamed from: f */
    private boolean f49157f;

    /* renamed from: g */
    private boolean f49158g;

    static {
        Covode.recordClassIndex(24351);
    }

    /* renamed from: a */
    public void mo34192a() {
    }

    public AbstractC20754k getSmartHierarchy() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public String getAnimPreviewFrameCacheKey() {
        return this.f49155d;
    }

    /* renamed from: b */
    public final void mo34197b() {
        C20784c cVar;
        Animatable i;
        if (getController() != null && (cVar = this.f49154c) != null && this.f49157f && cVar.f49175b && this.f49158g && (i = getController().mo39821i()) != null && !i.isRunning()) {
            i.start();
            WeakReference<AbstractC20724a> weakReference = this.f49152a;
            if (weakReference != null && weakReference.get() != null) {
                this.f49152a.get().mo34144a();
            }
        }
    }

    /* renamed from: c */
    public final void mo34198c() {
        Animatable i;
        if (getController() != null && (i = getController().mo39821i()) != null && i.isRunning()) {
            i.stop();
            WeakReference<AbstractC20724a> weakReference = this.f49152a;
            if (weakReference != null && weakReference.get() != null) {
                this.f49152a.get();
            }
        }
    }

    public void setAttached(boolean z) {
        this.f49157f = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.f49158g = z;
    }

    public SmartImageView(Context context) {
        super(context);
        mo34192a();
    }

    public void setAnimationListener(AbstractC20724a aVar) {
        this.f49152a = new WeakReference<>(aVar);
    }

    public void setImageDisplayListener(AbstractC20734k kVar) {
        C20784c cVar = this.f49154c;
        if (cVar != null) {
            cVar.f49174a = kVar;
        }
    }

    public void setActualImageScaleType(EnumC20767w wVar) {
        if (wVar != null) {
            ((C24246a) getHierarchy()).mo39958a(C20828x.m39185a(wVar));
        }
    }

    public void setPlaceholderImage(int i) {
        if (i > 0) {
            ((C24246a) getHierarchy()).mo39966c(i);
        }
    }

    public void setPlaceholderImage(Drawable drawable) {
        ((C24246a) getHierarchy()).mo39953a(1, drawable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.facebook.imagepipeline.o.b */
    /* JADX WARN: Multi-variable type inference failed */
    private void setController(C24636b bVar) {
        boolean z;
        final C24185e b = C24182c.m45843b();
        b.f57309m = getController();
        b.f57306j = this.f49153b.f49063c;
        if (this.f49153b.f49057L > 0) {
            z = true;
        } else {
            z = false;
        }
        b.f57305i = z;
        b.f57299c = bVar;
        if (!TextUtils.isEmpty(this.f49153b.f49046A)) {
            b.f57298b = this.f49153b.f49046A;
        }
        C20784c cVar = this.f49154c;
        if (cVar != null) {
            cVar.mo34218a(this.f49153b);
            b.f57303g = this.f49154c;
        } else {
            C20784c cVar2 = new C20784c();
            this.f49154c = cVar2;
            cVar2.mo34218a(this.f49153b);
            b.f57303g = this.f49154c;
        }
        ExecutorC20742b.C20743a.f48948a.execute(new Runnable() {
            /* class com.bytedance.lighten.loader.SmartImageView.RunnableC207772 */

            static {
                Covode.recordClassIndex(24353);
            }

            public final void run() {
                SmartImageView.this.setController(b.mo39827e());
            }
        });
    }

    public void setCircleOptions(C20745e eVar) {
        C24250e eVar2;
        if (eVar != null) {
            if (((C24246a) getHierarchy()).f57470a != null) {
                eVar2 = ((C24246a) getHierarchy()).f57470a;
            } else {
                eVar2 = new C24250e();
            }
            if (eVar.f48955g != null) {
                C20745e.C20747b bVar = eVar.f48955g;
                eVar2.mo39979a(bVar.f48965a, bVar.f48966b, bVar.f48967c, bVar.f48968d);
            }
            eVar2.f57500b = eVar.f48952d;
            eVar2.mo39978a(eVar.f48953e);
            eVar2.mo39985c(eVar.f48949a);
            eVar2.f57504f = eVar.f48950b;
            eVar2.mo39980a(eVar.f48951c);
            eVar2.mo39986d(eVar.f48954f);
            eVar2.f57499a = C20831z.m39187a(eVar.f48956h);
            ((C24246a) getHierarchy()).mo39959a(eVar2);
        }
    }

    private void setController(C24636b[] bVarArr) {
        boolean z;
        if (bVarArr.length != 0) {
            C24185e b = C24182c.m45843b();
            b.f57309m = getController();
            b.f57306j = this.f49153b.f49063c;
            if (this.f49153b.f49057L > 0) {
                z = true;
            } else {
                z = false;
            }
            b.f57305i = z;
            b.f57298b = this.f49153b.f49046A;
            final C24185e eVar = (C24185e) b.mo39823a(bVarArr);
            if (!TextUtils.isEmpty(this.f49153b.f49046A)) {
                eVar.f57298b = this.f49153b.f49046A;
            }
            C20784c cVar = this.f49154c;
            if (cVar != null) {
                cVar.mo34218a(this.f49153b);
                eVar.f57303g = this.f49154c;
            } else {
                C20784c cVar2 = new C20784c();
                this.f49154c = cVar2;
                cVar2.mo34218a(this.f49153b);
                eVar.f57303g = this.f49154c;
            }
            ExecutorC20742b.C20743a.f48948a.execute(new Runnable() {
                /* class com.bytedance.lighten.loader.SmartImageView.RunnableC207761 */

                static {
                    Covode.recordClassIndex(24352);
                }

                public final void run() {
                    SmartImageView.this.setController(eVar.mo39827e());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo34193a(C20765u uVar) {
        this.f49153b = uVar;
        if (uVar.f49054I) {
            if (uVar.f49059N == null || uVar.f49059N.mo34125a()) {
                this.f49155d = uVar.f49061a.toString();
            } else {
                this.f49155d = uVar.f49059N.f48941a.get(0);
            }
            ((C24246a) getHierarchy()).mo39953a(0, (Drawable) null);
            C24117a<Bitmap> a = C20778a.C20782a.f49171a.mo34211a(this.f49155d);
            this.f49156e = a;
            if (a != null && a.mo39700d()) {
                Bitmap a2 = this.f49156e.mo39695a();
                if (!a2.isRecycled()) {
                    ((C24246a) getHierarchy()).mo39953a(0, new C24228p(new BitmapDrawable(a2), C24229q.AbstractC24231b.f57458h));
                } else {
                    ((C24246a) getHierarchy()).mo39953a(0, (Drawable) null);
                }
            }
        }
        if (uVar.f49059N == null || uVar.f49059N.mo34125a()) {
            setController(C20805q.m39138a(uVar, uVar.f49061a));
        } else {
            setController(C20805q.m39144b(uVar));
        }
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo34192a();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        mo34192a();
    }
}
