package com.zhihu.matisse.internal.p4516ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.C24261b;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import p4593g.p4594a.p4595a.p4596a.p4598b.C88989a;

/* renamed from: com.zhihu.matisse.internal.ui.widget.DraweeViewTouch */
public class DraweeViewTouch extends C88989a {

    /* renamed from: A */
    private C24261b f199828A;

    static {
        Covode.recordClassIndex(103999);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f199828A.mo40003b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f199828A.mo40005c();
        C58030k.m104850a(this);
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f199828A.mo40003b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f199828A.mo40005c();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f199828A.mo40008f() || !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.facebook.imagepipeline.o.b */
    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(C24636b bVar) {
        final AbstractC24157c<C24117a<AbstractC24454c>> a = C24428k.m46551a().mo40247e().mo40224a(bVar, (Object) null);
        C24185e b = C24182c.m45843b();
        b.f57309m = this.f199828A.f57519b;
        b.f57299c = bVar;
        b.f57303g = new C24202c<AbstractC24457f>() {
            /* class com.zhihu.matisse.internal.p4516ui.widget.DraweeViewTouch.C879781 */

            static {
                Covode.recordClassIndex(104000);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                C24117a aVar;
                Throwable th;
                Bitmap bitmap;
                super.onFinalImageSet(str, fVar, animatable);
                try {
                    aVar = (C24117a) a.mo39747d();
                    if (aVar != null) {
                        try {
                            AbstractC24454c cVar = (AbstractC24454c) aVar.mo39695a();
                            if ((cVar instanceof C24455d) && (bitmap = ((C24455d) cVar).f58089a) != null) {
                                DraweeViewTouch.this.setImageBitmap(bitmap);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a.mo39750g();
                            C24117a.m45712c(aVar);
                            throw th;
                        }
                    }
                    a.mo39750g();
                    C24117a.m45712c(aVar);
                } catch (Throwable th3) {
                    th = th3;
                    aVar = null;
                    a.mo39750g();
                    C24117a.m45712c(aVar);
                    throw th;
                }
            }
        };
        this.f199828A.mo40001a(b.mo39827e());
    }

    public DraweeViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.f199828A == null) {
            this.f199828A = C24261b.m46095a(new C24247b(getResources()).mo39973a());
        }
    }
}
