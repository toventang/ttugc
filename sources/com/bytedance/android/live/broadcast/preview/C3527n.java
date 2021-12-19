package com.bytedance.android.live.broadcast.preview;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.EnumC3338p;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.api.p185c.C3053d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.n */
public final class C3527n {

    /* renamed from: g */
    public static final C3528a f9825g = new C3528a((byte) 0);

    /* renamed from: a */
    public final ActivityC0945e f9826a;

    /* renamed from: b */
    final Context f9827b;

    /* renamed from: c */
    public int f9828c;

    /* renamed from: d */
    public DialogC9146a f9829d;

    /* renamed from: e */
    public final C10935a f9830e;

    /* renamed from: f */
    public final AbstractC89171a<AbstractC11683e> f9831f;

    static {
        Covode.recordClassIndex(4011);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.n$a */
    public static final class C3528a {
        static {
            Covode.recordClassIndex(4012);
        }

        private C3528a() {
        }

        public /* synthetic */ C3528a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final Dialog mo8813a() {
        DialogC9146a aVar = this.f9829d;
        if (aVar != null) {
            return C11279p.m20014b(aVar);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.n$g */
    public static final class C3534g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11683e f9837a;

        static {
            Covode.recordClassIndex(4018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3534g(AbstractC11683e eVar) {
            super(0);
            this.f9837a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC11683e eVar = this.f9837a;
            C6805b<Integer> bVar = AbstractC6804a.f16886O;
            C89219l.m154716b(bVar, "");
            Integer a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            eVar.mo8849a(a.intValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.n$d */
    public static final class C3531d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11683e f9834a;

        static {
            Covode.recordClassIndex(4015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3531d(AbstractC11683e eVar) {
            super(0);
            this.f9834a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC11683e eVar = this.f9834a;
            float f = LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23106a;
            C6805b<Float> bVar = AbstractC6804a.f16888Q;
            C89219l.m154716b(bVar, "");
            Float a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            eVar.mo8848a(f * a.floatValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.n$e */
    public static final class C3532e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11683e f9835a;

        static {
            Covode.recordClassIndex(4016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3532e(AbstractC11683e eVar) {
            super(0);
            this.f9835a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC11683e eVar = this.f9835a;
            float f = LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23106a;
            C6805b<Float> bVar = AbstractC6804a.f16889R;
            C89219l.m154716b(bVar, "");
            Float a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            eVar.mo8858b(f * a.floatValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.n$f */
    public static final class C3533f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11683e f9836a;

        static {
            Covode.recordClassIndex(4017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3533f(AbstractC11683e eVar) {
            super(0);
            this.f9836a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC11683e eVar = this.f9836a;
            float f = LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23106a;
            C6805b<Float> bVar = AbstractC6804a.f16890S;
            C89219l.m154716b(bVar, "");
            Float a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            eVar.mo8863c(f * a.floatValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo8814b() {
        AbstractC11683e invoke = this.f9831f.invoke();
        if (invoke != null) {
            C6204h.m13474a(new C3531d(invoke));
            C6204h.m13474a(new C3532e(invoke));
            C6204h.m13474a(new C3533f(invoke));
            C6204h.m13474a(new C3534g(invoke));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.n$b */
    static final class DialogInterface$OnDismissListenerC3529b implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C3527n f9832a;

        static {
            Covode.recordClassIndex(4013);
        }

        DialogInterface$OnDismissListenerC3529b(C3527n nVar) {
            this.f9832a = nVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            ActivityC0945e eVar;
            if (!EnumC3338p.INST.isLoadedRes()) {
                if (this.f9832a.f9831f.invoke() == null && (eVar = this.f9832a.f9826a) != null) {
                    eVar.finish();
                }
                AbstractC11683e invoke = this.f9832a.f9831f.invoke();
                if (invoke != null) {
                    invoke.mo8847a();
                }
                C89219l.m154721d("ttlive_resource_load", "");
                C89219l.m154721d("ttlive_resource_load", "");
                C6497a b = C3053d.m8363a(new C6497a("ttlive_resource_load").mo12623a(2)).mo12633b("preview");
                b.f16147c = true;
                b.f16148d = true;
                b.mo12632a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.n$c */
    static final class C3530c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C3527n f9833a;

        static {
            Covode.recordClassIndex(4014);
        }

        C3530c(C3527n nVar) {
            this.f9833a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, (Object) true)) {
                DialogC9146a aVar = this.f9833a.f9829d;
                if (aVar != null) {
                    C11279p.m20014b(aVar);
                }
                this.f9833a.mo8814b();
                C6497a b = C3051c.C3052a.m8360b("ttlive_resource_load").mo12633b("preview");
                b.f16147c = true;
                b.f16148d = true;
                b.mo12632a();
            } else if (this.f9833a.f9828c > 3) {
                if (this.f9833a.f9830e.isViewValid()) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.grl);
                }
                C6497a b2 = C3051c.C3052a.m8361c("ttlive_resource_load").mo12633b("preview").mo12637b("reason", "exceed max retry count");
                b2.f16148d = true;
                b2.mo12632a();
                DialogC9146a aVar2 = this.f9833a.f9829d;
                if (aVar2 != null) {
                    C11279p.m20014b(aVar2);
                }
            } else {
                EnumC3338p.INST.loadResources();
                this.f9833a.f9828c++;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3527n(C10935a aVar, AbstractC89171a<? extends AbstractC11683e> aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f9830e = aVar;
        this.f9831f = aVar2;
        this.f9826a = aVar.getActivity();
        this.f9827b = aVar.getContext();
    }
}
