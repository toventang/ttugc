package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1844d.AbstractC24157c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.f */
public abstract class AbstractC6000f extends AbstractC6005i {

    /* renamed from: c */
    public AbstractC24157c<C24117a<AbstractC24454c>> f15060c;

    /* renamed from: d */
    public boolean f15061d;

    /* renamed from: e */
    public Bitmap f15062e;

    /* renamed from: h */
    private final ImageModel f15063h;

    static {
        Covode.recordClassIndex(6611);
    }

    /* renamed from: d */
    public final Bitmap mo11893d() {
        Bitmap bitmap = this.f15062e;
        if (bitmap == null) {
            C89219l.m154710a("bitmap");
        }
        return bitmap;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC6005i
    /* renamed from: f */
    public final void mo11895f() {
        this.f15061d = false;
        AbstractC24157c<C24117a<AbstractC24454c>> cVar = this.f15060c;
        if (cVar != null) {
            cVar.mo39750g();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.f$a */
    public static final class C6001a extends AbstractC24435b {

        /* renamed from: a */
        final /* synthetic */ AbstractC6000f f15064a;

        static {
            Covode.recordClassIndex(6612);
        }

        /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.f$a$a */
        static final class RunnableC6002a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6001a f15065a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f15066b;

            static {
                Covode.recordClassIndex(6613);
            }

            RunnableC6002a(C6001a aVar, Bitmap bitmap) {
                this.f15065a = aVar;
                this.f15066b = bitmap;
            }

            public final void run() {
                AbstractC6000f fVar = this.f15065a.f15064a;
                Bitmap bitmap = this.f15066b;
                C89219l.m154721d(bitmap, "");
                fVar.f15062e = bitmap;
                this.f15065a.f15064a.f15069g.invoke(this.f15065a.f15064a);
                this.f15065a.f15064a.f15061d = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6001a(AbstractC6000f fVar) {
            this.f15064a = fVar;
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            C89219l.m154721d(cVar, "");
            cVar.mo39750g();
            this.f15064a.f15061d = false;
        }

        @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
        /* renamed from: a */
        public final void mo9033a(Bitmap bitmap) {
            AbstractC24157c<C24117a<AbstractC24454c>> cVar = this.f15064a.f15060c;
            if (cVar == null || !cVar.mo39745b() || bitmap == null || bitmap.isRecycled()) {
                this.f15064a.f15061d = false;
            } else {
                this.f15064a.f15068f.post(new RunnableC6002a(this, bitmap));
            }
            AbstractC24157c<C24117a<AbstractC24454c>> cVar2 = this.f15064a.f15060c;
            if (cVar2 != null) {
                cVar2.mo39750g();
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC6005i
    /* renamed from: e */
    public final void mo11894e() {
        if (this.f15062e == null && !this.f15061d) {
            this.f15061d = true;
            AbstractC24157c<C24117a<AbstractC24454c>> cVar = this.f15060c;
            if (cVar != null) {
                cVar.mo39750g();
            }
            AbstractC24157c<C24117a<AbstractC24454c>> a = C3941k.m9597a(this.f15063h, -1, -1);
            this.f15060c = a;
            if (a != null) {
                a.mo39739a(new C6001a(this), C24065a.f56998a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC6000f(C5889g gVar, Handler handler, ImageModel imageModel, AbstractC89172b<? super AbstractC6005i, C89391z> bVar) {
        super(gVar, handler, bVar);
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(handler, "");
        C89219l.m154721d(imageModel, "");
        C89219l.m154721d(bVar, "");
        this.f15063h = imageModel;
    }
}
