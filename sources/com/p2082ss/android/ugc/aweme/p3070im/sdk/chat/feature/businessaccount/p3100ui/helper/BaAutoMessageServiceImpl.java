package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53869a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.api.AutoMsgSettingApiManager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53871a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53872b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53873c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53875e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53876f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53877g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55227s;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl */
public final class BaAutoMessageServiceImpl implements IBaAutoMessageService {

    /* renamed from: a */
    public AbstractC89568bz f123725a;

    /* renamed from: b */
    public boolean f123726b;

    /* renamed from: c */
    public boolean f123727c;

    /* renamed from: d */
    public AbstractC89568bz f123728d;

    /* renamed from: e */
    public C53869a f123729e;

    /* renamed from: f */
    public List<C53870b> f123730f = new ArrayList();

    /* renamed from: g */
    public AbstractC89568bz f123731g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$a */
    public static final class C53965a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123732a;

        /* renamed from: b */
        int f123733b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123734c;

        /* renamed from: d */
        Object f123735d;

        /* renamed from: e */
        Object f123736e;

        static {
            Covode.recordClassIndex(63633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53965a(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123734c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123732a = obj;
            this.f123733b |= Integer.MIN_VALUE;
            return this.f123734c.mo91017b((C53870b) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$c */
    public static final class C53967c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123738a;

        /* renamed from: b */
        int f123739b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123740c;

        /* renamed from: d */
        Object f123741d;

        /* renamed from: e */
        Object f123742e;

        static {
            Covode.recordClassIndex(63635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53967c(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123740c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123738a = obj;
            this.f123739b |= Integer.MIN_VALUE;
            return this.f123740c.mo91011a((C53870b) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$d */
    public static final class C53968d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123743a;

        /* renamed from: b */
        int f123744b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123745c;

        /* renamed from: d */
        Object f123746d;

        /* renamed from: e */
        Object f123747e;

        static {
            Covode.recordClassIndex(63636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53968d(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123745c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123743a = obj;
            this.f123744b |= Integer.MIN_VALUE;
            return this.f123745c.mo91010a((C53869a) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$h */
    public static final class C53973h extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123755a;

        /* renamed from: b */
        int f123756b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123757c;

        /* renamed from: d */
        Object f123758d;

        static {
            Covode.recordClassIndex(63641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53973h(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123757c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123755a = obj;
            this.f123756b |= Integer.MIN_VALUE;
            return this.f123757c.mo91018b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$i */
    public static final class C53974i extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123759a;

        /* renamed from: b */
        int f123760b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123761c;

        /* renamed from: d */
        Object f123762d;

        static {
            Covode.recordClassIndex(63642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53974i(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123761c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123759a = obj;
            this.f123760b |= Integer.MIN_VALUE;
            return this.f123761c.mo91024d(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$j */
    public static final class C53975j extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123763a;

        /* renamed from: b */
        int f123764b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123765c;

        /* renamed from: d */
        Object f123766d;

        static {
            Covode.recordClassIndex(63643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53975j(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123765c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123763a = obj;
            this.f123764b |= Integer.MIN_VALUE;
            return this.f123765c.mo91022c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$k */
    public static final class C53976k extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123767a;

        /* renamed from: b */
        int f123768b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123769c;

        /* renamed from: d */
        Object f123770d;

        static {
            Covode.recordClassIndex(63644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53976k(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123769c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123767a = obj;
            this.f123768b |= Integer.MIN_VALUE;
            return this.f123769c.mo91012a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$l */
    public static final class C53977l extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123771a;

        /* renamed from: b */
        int f123772b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123773c;

        /* renamed from: d */
        Object f123774d;

        /* renamed from: e */
        boolean f123775e;

        static {
            Covode.recordClassIndex(63645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53977l(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123773c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123771a = obj;
            this.f123772b |= Integer.MIN_VALUE;
            return this.f123773c.mo91019b(false, (AbstractC89124d<? super Boolean>) this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$m */
    public static final class C53978m extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123776a;

        /* renamed from: b */
        int f123777b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123778c;

        /* renamed from: d */
        Object f123779d;

        /* renamed from: e */
        Object f123780e;

        static {
            Covode.recordClassIndex(63646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53978m(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123778c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123776a = obj;
            this.f123777b |= Integer.MIN_VALUE;
            return this.f123778c.mo91021c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$o */
    public static final class C53980o extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123784a;

        /* renamed from: b */
        int f123785b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123786c;

        /* renamed from: d */
        Object f123787d;

        /* renamed from: e */
        Object f123788e;

        static {
            Covode.recordClassIndex(63648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53980o(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123786c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123784a = obj;
            this.f123785b |= Integer.MIN_VALUE;
            return this.f123786c.mo91016b((C53869a) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$p */
    public static final class C53981p extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123789a;

        /* renamed from: b */
        int f123790b;

        /* renamed from: c */
        final /* synthetic */ BaAutoMessageServiceImpl f123791c;

        /* renamed from: d */
        Object f123792d;

        /* renamed from: e */
        boolean f123793e;

        static {
            Covode.recordClassIndex(63649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53981p(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(dVar);
            this.f123791c = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123789a = obj;
            this.f123790b |= Integer.MIN_VALUE;
            return this.f123791c.mo91013a(false, (AbstractC89124d<? super Boolean>) this);
        }
    }

    static {
        Covode.recordClassIndex(63632);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: b */
    public final void mo91020b() {
        this.f123728d = C89624i.m155555a(C89561bs.f203280a, null, null, new C53972g(this, null), 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: c */
    public final void mo91023c() {
        this.f123731g = C89624i.m155555a(C89561bs.f203280a, null, null, new C53969e(this, null), 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: a */
    public final void mo91014a() {
        this.f123725a = C89624i.m155555a(C89561bs.f203280a, null, null, new C53971f(this, null), 3);
    }

    /* renamed from: d */
    public static IBaAutoMessageService m99180d() {
        MethodCollector.m26663i(3705);
        Object a = C81908b.m141854a(IBaAutoMessageService.class, false);
        if (a != null) {
            IBaAutoMessageService iBaAutoMessageService = (IBaAutoMessageService) a;
            MethodCollector.m26664o(3705);
            return iBaAutoMessageService;
        }
        if (C81908b.f183244bu == null) {
            synchronized (IBaAutoMessageService.class) {
                try {
                    if (C81908b.f183244bu == null) {
                        C81908b.f183244bu = new BaAutoMessageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3705);
                    throw th;
                }
            }
        }
        BaAutoMessageServiceImpl baAutoMessageServiceImpl = (BaAutoMessageServiceImpl) C81908b.f183244bu;
        MethodCollector.m26664o(3705);
        return baAutoMessageServiceImpl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$b */
    public static final class C53966b extends AbstractC89220m implements AbstractC89172b<C53870b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C53870b f123737a;

        static {
            Covode.recordClassIndex(63634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53966b(C53870b bVar) {
            super(1);
            this.f123737a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C53870b bVar) {
            boolean z;
            C53870b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (bVar2.f123518a == this.f123737a.f123518a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: a */
    public final void mo91015a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        AutoMsgSettingApiManager.f123540a.reportOpenDmDialog(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$f */
    public static final class C53971f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123751a;

        /* renamed from: b */
        final /* synthetic */ BaAutoMessageServiceImpl f123752b;

        static {
            Covode.recordClassIndex(63639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53971f(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123752b = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53971f(this.f123752b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53971f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123751a;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    AbstractC89531av a = C55227s.m100993a(AutoMsgSettingApiManager.f123540a.getMsgSwitches());
                    this.f123751a = 1;
                    obj = a.mo144106a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                    this.f123752b.f123725a = null;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53871a[] aVarArr = ((C53875e) obj).f123534a;
            if (aVarArr != null) {
                for (C53871a aVar2 : aVarArr) {
                    int i2 = aVar2.f123523a;
                    if (i2 == 1) {
                        this.f123752b.f123726b = aVar2.mo91031a();
                    } else if (i2 == 2) {
                        this.f123752b.f123727c = aVar2.mo91031a();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$n */
    public static final class C53979n extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

        /* renamed from: a */
        int f123781a;

        /* renamed from: b */
        final /* synthetic */ int f123782b;

        /* renamed from: c */
        final /* synthetic */ boolean f123783c;

        static {
            Covode.recordClassIndex(63647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53979n(int i, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123782b = i;
            this.f123783c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53979n(this.f123782b, this.f123783c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
            return ((C53979n) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i2 = this.f123781a;
            boolean z = false;
            if (i2 == 0) {
                C89382r.m154942a(obj);
                try {
                    int i3 = this.f123782b;
                    if (this.f123783c) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    AbstractC89531av a = C55227s.m100993a(AutoMsgSettingApiManager.f123540a.setMsgSwitch(i3, i));
                    this.f123781a = 1;
                    obj = a.mo144106a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                }
            } else if (i2 == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((BaseResponse) obj).status_code == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91018b(p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53973h
            if (r0 == 0) goto L_0x004f
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$h r5 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53973h) r5
            int r0 = r5.f123756b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004f
            int r0 = r5.f123756b
            int r0 = r0 - r1
            r5.f123756b = r0
        L_0x0013:
            java.lang.Object r4 = r5.f123755a
            h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r5.f123756b
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x005d
            if (r0 != r2) goto L_0x0055
            java.lang.Object r0 = r5.f123758d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl) r0
            p4600h.C89382r.m154942a(r4)
        L_0x0028:
            boolean r0 = r0.f123727c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            p4600h.C89382r.m154942a(r4)
            kotlinx.coroutines.bz r0 = r6.f123725a
            if (r0 != 0) goto L_0x0042
            r6.mo91014a()
            r5.f123756b = r1
            java.lang.Object r4 = r6.mo91018b(r5)
            if (r4 != r3) goto L_0x0060
            return r3
        L_0x0042:
            r5.f123758d = r6
            r5.f123756b = r2
            java.lang.Object r0 = r0.mo143991b(r5)
            if (r0 != r3) goto L_0x004d
            return r3
        L_0x004d:
            r0 = r6
            goto L_0x0028
        L_0x004f:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$h r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$h
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x005d:
            p4600h.C89382r.m154942a(r4)
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91018b(h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91022c(p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53869a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53975j
            if (r0 == 0) goto L_0x004b
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$j r5 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53975j) r5
            int r0 = r5.f123764b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004b
            int r0 = r5.f123764b
            int r0 = r0 - r1
            r5.f123764b = r0
        L_0x0013:
            java.lang.Object r4 = r5.f123763a
            h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r5.f123764b
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r1) goto L_0x0059
            if (r0 != r2) goto L_0x0051
            java.lang.Object r0 = r5.f123766d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl) r0
            p4600h.C89382r.m154942a(r4)
        L_0x0028:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a r0 = r0.f123729e
            return r0
        L_0x002b:
            p4600h.C89382r.m154942a(r4)
            kotlinx.coroutines.bz r0 = r6.f123728d
            if (r0 != 0) goto L_0x003e
            r6.mo91020b()
            r5.f123764b = r1
            java.lang.Object r4 = r6.mo91022c(r5)
            if (r4 != r3) goto L_0x005c
            return r3
        L_0x003e:
            r5.f123766d = r6
            r5.f123764b = r2
            java.lang.Object r0 = r0.mo143991b(r5)
            if (r0 != r3) goto L_0x0049
            return r3
        L_0x0049:
            r0 = r6
            goto L_0x0028
        L_0x004b:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$j r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$j
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x0059:
            p4600h.C89382r.m154942a(r4)
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91022c(h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91024d(p4600h.p4603c.AbstractC89124d<? super java.util.List<com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53974i
            if (r0 == 0) goto L_0x004b
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$i r5 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53974i) r5
            int r0 = r5.f123760b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004b
            int r0 = r5.f123760b
            int r0 = r0 - r1
            r5.f123760b = r0
        L_0x0013:
            java.lang.Object r4 = r5.f123759a
            h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r5.f123760b
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r1) goto L_0x0059
            if (r0 != r2) goto L_0x0051
            java.lang.Object r0 = r5.f123762d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl) r0
            p4600h.C89382r.m154942a(r4)
        L_0x0028:
            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> r0 = r0.f123730f
            return r0
        L_0x002b:
            p4600h.C89382r.m154942a(r4)
            kotlinx.coroutines.bz r0 = r6.f123731g
            if (r0 != 0) goto L_0x003e
            r6.mo91023c()
            r5.f123760b = r1
            java.lang.Object r4 = r6.mo91024d(r5)
            if (r4 != r3) goto L_0x005c
            return r3
        L_0x003e:
            r5.f123762d = r6
            r5.f123760b = r2
            java.lang.Object r0 = r0.mo143991b(r5)
            if (r0 != r3) goto L_0x0049
            return r3
        L_0x0049:
            r0 = r6
            goto L_0x0028
        L_0x004b:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$i r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$i
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x0059:
            p4600h.C89382r.m154942a(r4)
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91024d(h.c.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$e */
    public static final class C53969e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123748a;

        /* renamed from: b */
        final /* synthetic */ BaAutoMessageServiceImpl f123749b;

        static {
            Covode.recordClassIndex(63637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53969e(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123749b = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53969e(this.f123749b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53969e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123748a;
            boolean z2 = true;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    AbstractC89531av a = C55227s.m100993a(AutoMsgSettingApiManager.f123540a.getAutoReply());
                    this.f123748a = 1;
                    obj = a.mo144106a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                    this.f123749b.f123731g = null;
                    return C89391z.f203057a;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53872b bVar = (C53872b) obj;
            if (bVar.status_code != 0) {
                this.f123749b.f123730f = new ArrayList();
                this.f123749b.f123731g = null;
                return C89391z.f203057a;
            }
            C53873c[] cVarArr = bVar.f123525a;
            if (cVarArr != null) {
                if (cVarArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                this.f123749b.f123730f = new ArrayList();
                this.f123749b.f123731g = null;
                return C89391z.f203057a;
            }
            this.f123749b.f123730f = C89309k.m154814h(C89309k.m154809e(C89309k.m154810e(C89064i.m154514o(cVarArr), C539701.f123750a)));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$g */
    public static final class C53972g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123753a;

        /* renamed from: b */
        final /* synthetic */ BaAutoMessageServiceImpl f123754b;

        static {
            Covode.recordClassIndex(63640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53972g(BaAutoMessageServiceImpl baAutoMessageServiceImpl, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123754b = baAutoMessageServiceImpl;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53972g(this.f123754b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53972g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            C53869a aVar;
            EnumC89098a aVar2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123753a;
            boolean z = true;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    AbstractC89531av a = C55227s.m100993a(AutoMsgSettingApiManager.f123540a.getWelMsgReviewStatus());
                    this.f123753a = 1;
                    obj = a.mo144106a(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } catch (Exception unused) {
                    this.f123754b.f123728d = null;
                    this.f123754b.f123729e = null;
                    return C89391z.f203057a;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53876f fVar = (C53876f) obj;
            if (fVar.status_code != 0) {
                this.f123754b.f123728d = null;
                this.f123754b.f123729e = null;
                return C89391z.f203057a;
            }
            C53877g gVar = fVar.f123535a;
            if (gVar == null) {
                this.f123754b.f123729e = new C53869a(C89108b.m154611a(0L), 0, "");
                return C89391z.f203057a;
            }
            long j = gVar.f123536a;
            BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.f123754b;
            int i2 = gVar.f123537b;
            if (i2 == 1) {
                if (gVar.f123539d.length() != 0) {
                    z = false;
                }
                if (z) {
                    aVar = new C53869a(C89108b.m154611a(j), 0, "");
                } else {
                    aVar = new C53869a(C89108b.m154611a(j), 4, gVar.f123539d);
                }
            } else if (i2 == 2) {
                aVar = new C53869a(C89108b.m154611a(j), 1, gVar.f123539d);
            } else if (i2 == 3) {
                aVar = new C53869a(C89108b.m154611a(j), 3, gVar.f123539d);
            } else if (i2 != 4) {
                aVar = new C53869a(C89108b.m154611a(j), 0, "");
            } else {
                aVar = new C53869a(C89108b.m154611a(j), 2, gVar.f123539d, gVar.f123538c);
            }
            baAutoMessageServiceImpl.f123729e = aVar;
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91012a(p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53976k
            if (r0 == 0) goto L_0x004f
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$k r5 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53976k) r5
            int r0 = r5.f123768b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004f
            int r0 = r5.f123768b
            int r0 = r0 - r1
            r5.f123768b = r0
        L_0x0013:
            java.lang.Object r4 = r5.f123767a
            h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r5.f123768b
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x005d
            if (r0 != r2) goto L_0x0055
            java.lang.Object r0 = r5.f123770d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl) r0
            p4600h.C89382r.m154942a(r4)
        L_0x0028:
            boolean r0 = r0.f123726b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            p4600h.C89382r.m154942a(r4)
            kotlinx.coroutines.bz r0 = r6.f123725a
            if (r0 != 0) goto L_0x0042
            r6.mo91014a()
            r5.f123768b = r1
            java.lang.Object r4 = r6.mo91012a(r5)
            if (r4 != r3) goto L_0x0060
            return r3
        L_0x0042:
            r5.f123770d = r6
            r5.f123768b = r2
            java.lang.Object r0 = r0.mo143991b(r5)
            if (r0 != r3) goto L_0x004d
            return r3
        L_0x004d:
            r0 = r6
            goto L_0x0028
        L_0x004f:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$k r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$k
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x005d:
            p4600h.C89382r.m154942a(r4)
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91012a(h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[Catch:{ Exception -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91010a(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53869a r8, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91010a(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91011a(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b r12, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r13) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91011a(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91016b(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53869a r9, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r10) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91016b(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097 A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91021c(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b r12, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r13) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91021c(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[Catch:{ Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91017b(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b r8, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91017b(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91013a(boolean r6, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53981p
            if (r0 == 0) goto L_0x0048
            r4 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$p r4 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53981p) r4
            int r0 = r4.f123790b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.f123790b
            int r0 = r0 - r1
            r4.f123790b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f123789a
            h.c.a.a r1 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f123790b
            r2 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r2) goto L_0x0054
            boolean r6 = r4.f123793e
            java.lang.Object r1 = r4.f123792d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r1 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl) r1
            p4600h.C89382r.m154942a(r3)
        L_0x0027:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x004e
            r1.f123726b = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0036:
            p4600h.C89382r.m154942a(r3)
            r4.f123792d = r5
            r4.f123793e = r6
            r4.f123790b = r2
            java.lang.Object r3 = m99179a(r2, r6, r4)
            if (r3 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r1 = r5
            goto L_0x0027
        L_0x0048:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$p r4 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$p
            r4.<init>(r5, r7)
            goto L_0x0013
        L_0x004e:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91013a(boolean, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo91019b(boolean r6, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53977l
            if (r0 == 0) goto L_0x0049
            r4 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$l r4 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.C53977l) r4
            int r0 = r4.f123772b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0049
            int r0 = r4.f123772b
            int r0 = r0 - r1
            r4.f123772b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f123771a
            h.c.a.a r1 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f123772b
            r2 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r2) goto L_0x0055
            boolean r6 = r4.f123775e
            java.lang.Object r1 = r4.f123774d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r1 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl) r1
            p4600h.C89382r.m154942a(r3)
        L_0x0027:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x004f
            r1.f123727c = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0036:
            p4600h.C89382r.m154942a(r3)
            r0 = 2
            r4.f123774d = r5
            r4.f123775e = r6
            r4.f123772b = r2
            java.lang.Object r3 = m99179a(r0, r6, r4)
            if (r3 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r1 = r5
            goto L_0x0027
        L_0x0049:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$l r4 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$l
            r4.<init>(r5, r7)
            goto L_0x0013
        L_0x004f:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl.mo91019b(boolean, h.c.d):java.lang.Object");
    }

    /* renamed from: a */
    private static Object m99179a(int i, boolean z, AbstractC89124d<? super Boolean> dVar) {
        return C89624i.m155554a(C89546bf.f203267b, new C53979n(i, z, null), dVar);
    }
}
