package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import android.graphics.drawable.BitmapDrawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.e */
public final class C45103e {
    static {
        Covode.recordClassIndex(53534);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.e$a */
    public static final class C45104a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f105163a;

        /* renamed from: b */
        Object f105164b;

        /* renamed from: c */
        Object f105165c;

        /* renamed from: d */
        Object f105166d;

        /* renamed from: e */
        Object f105167e;

        /* renamed from: f */
        int f105168f;

        /* renamed from: g */
        final /* synthetic */ SmartImageView f105169g;

        /* renamed from: h */
        final /* synthetic */ Image f105170h;

        static {
            Covode.recordClassIndex(53535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45104a(SmartImageView smartImageView, Image image, AbstractC89124d dVar) {
            super(2, dVar);
            this.f105169g = smartImageView;
            this.f105170h = image;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45104a(this.f105169g, this.f105170h, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45104a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.e$a$a */
        public static final class C45105a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f105171a;

            /* renamed from: b */
            final /* synthetic */ BitmapDrawable f105172b;

            /* renamed from: c */
            final /* synthetic */ C45104a f105173c;

            /* renamed from: d */
            final /* synthetic */ C89233z.C89234a f105174d;

            /* renamed from: e */
            final /* synthetic */ boolean f105175e;

            static {
                Covode.recordClassIndex(53536);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45105a(BitmapDrawable bitmapDrawable, AbstractC89124d dVar, C45104a aVar, C89233z.C89234a aVar2, boolean z) {
                super(2, dVar);
                this.f105172b = bitmapDrawable;
                this.f105173c = aVar;
                this.f105174d = aVar2;
                this.f105175e = z;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C45105a(this.f105172b, dVar, this.f105173c, this.f105174d, this.f105175e);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C45105a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f105171a == 0) {
                    C89382r.m154942a(obj);
                    if (this.f105173c.f105169g.getWindowVisibility() == 0) {
                        ((C24246a) this.f105173c.f105169g.getHierarchy()).mo39957a(this.f105172b, C24229q.AbstractC24231b.f57458h);
                    }
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 239
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45103e.C45104a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
