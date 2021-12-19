package com.p2082ss.android.ugc.aweme.utils;

import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89623h;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ef */
public final class C80375ef {
    static {
        Covode.recordClassIndex(93643);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ef$b */
    static final class C80377b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f179905a;

        /* renamed from: b */
        final /* synthetic */ LiveData f179906b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1204m f179907c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1214u f179908d;

        static {
            Covode.recordClassIndex(93645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80377b(LiveData liveData, AbstractC1204m mVar, AbstractC1214u uVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f179906b = liveData;
            this.f179907c = mVar;
            this.f179908d = uVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C80377b(this.f179906b, this.f179907c, this.f179908d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C80377b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f179905a == 0) {
                C89382r.m154942a(obj);
                this.f179906b.observe(this.f179907c, this.f179908d);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ef$a */
    static final class C80376a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f179902a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f179903b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1203l f179904c;

        static {
            Covode.recordClassIndex(93644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80376a(AbstractC1204m mVar, AbstractC1203l lVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f179903b = mVar;
            this.f179904c = lVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C80376a(this.f179903b, this.f179904c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C80376a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC1196i lifecycle;
            if (this.f179902a == 0) {
                C89382r.m154942a(obj);
                AbstractC1204m mVar = this.f179903b;
                if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
                    return null;
                }
                lifecycle.mo4012a(this.f179904c);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ef$c */
    static final class C80378c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f179909a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f179910b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1203l f179911c;

        static {
            Covode.recordClassIndex(93646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80378c(AbstractC1204m mVar, AbstractC1203l lVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f179910b = mVar;
            this.f179911c = lVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C80378c(this.f179910b, this.f179911c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C80378c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC1196i lifecycle;
            if (this.f179909a == 0) {
                C89382r.m154942a(obj);
                AbstractC1204m mVar = this.f179910b;
                if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
                    return null;
                }
                lifecycle.mo4013b(this.f179911c);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    public static final void m139357b(AbstractC1204m mVar, AbstractC1203l lVar) {
        AbstractC1196i lifecycle;
        C89219l.m154721d(lVar, "");
        if (!C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
            C89623h.m155552a(C89652o.f203399a, new C80378c(mVar, lVar, null));
        } else if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
            lifecycle.mo4013b(lVar);
        }
    }

    /* renamed from: a */
    public static final void m139356a(AbstractC1204m mVar, AbstractC1203l lVar) {
        AbstractC1196i lifecycle;
        C89219l.m154721d(lVar, "");
        if (!C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
            C89623h.m155552a(C89652o.f203399a, new C80376a(mVar, lVar, null));
        } else if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
            lifecycle.mo4012a(lVar);
        }
    }

    /* renamed from: a */
    public static final <T> void m139355a(LiveData<T> liveData, AbstractC1204m mVar, AbstractC1214u<T> uVar) {
        C89219l.m154721d(uVar, "");
        if (liveData != null && mVar != null) {
            if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                liveData.observe(mVar, uVar);
            } else {
                C89623h.m155552a(C89652o.f203399a, new C80377b(liveData, mVar, uVar, null));
            }
        }
    }
}
