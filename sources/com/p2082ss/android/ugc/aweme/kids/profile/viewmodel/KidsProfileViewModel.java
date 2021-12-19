package com.p2082ss.android.ugc.aweme.kids.profile.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.kids.profile.AbstractC57776e;
import com.p2082ss.android.ugc.aweme.kids.profile.p3363a.AbstractC57744a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel */
public final class KidsProfileViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public AbstractC89568bz f131803a;

    /* renamed from: b */
    public final C1213t<AbstractC57153a> f131804b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<List<AbstractC57776e>> f131805c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Integer> f131806d = new C1213t<>();

    /* renamed from: e */
    public final AbstractC57744a f131807e;

    static {
        Covode.recordClassIndex(67772);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        AbstractC89568bz bzVar;
        super.onCleared();
        AbstractC89568bz bzVar2 = this.f131803a;
        if ((bzVar2 == null || !bzVar2.mo144008l()) && (bzVar = this.f131803a) != null) {
            bzVar.mo143985a((CancellationException) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel$b */
    public static final class C57786b<I, O> implements AbstractC0189a {

        /* renamed from: a */
        public static final C57786b f131813a = new C57786b();

        static {
            Covode.recordClassIndex(67775);
        }

        C57786b() {
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            if (C89219l.m154714a((Object) ((AbstractC57153a) obj).isKidsMode(), (Object) true)) {
                return EnumC57787a.NONE;
            }
            return EnumC57787a.RESTART;
        }
    }

    public KidsProfileViewModel(AbstractC57744a aVar) {
        C89219l.m154721d(aVar, "");
        this.f131807e = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel$a */
    public static final class C57784a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f131808a;

        /* renamed from: b */
        final /* synthetic */ KidsProfileViewModel f131809b;

        static {
            Covode.recordClassIndex(67773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57784a(KidsProfileViewModel kidsProfileViewModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f131809b = kidsProfileViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C57784a(this.f131809b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C57784a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f131808a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89507ah ahVar = C89546bf.f203267b;
                C577851 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel.C57784a.C577851 */

                    /* renamed from: a */
                    Object f131810a;

                    /* renamed from: b */
                    int f131811b;

                    /* renamed from: c */
                    final /* synthetic */ C57784a f131812c;

                    static {
                        Covode.recordClassIndex(67774);
                    }

                    {
                        this.f131812c = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 
                    }
