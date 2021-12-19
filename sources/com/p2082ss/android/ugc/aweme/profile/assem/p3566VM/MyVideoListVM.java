package com.p2082ss.android.ugc.aweme.profile.assem.p3566VM;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.profile.assem.p3567a.C63471b;
import com.p2082ss.android.ugc.aweme.profile.assem.powercell.C63492a;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM */
public final class MyVideoListVM extends AssemListViewModel<C63443a, C63492a, Long> {

    /* renamed from: o */
    public static final C63438a f144036o = new C63438a((byte) 0);

    /* renamed from: k */
    public String f144037k;

    /* renamed from: l */
    public String f144038l;

    /* renamed from: m */
    public final C1213t<List<C63492a>> f144039m = new C1213t<>();

    /* renamed from: n */
    public Fragment f144040n;

    /* renamed from: p */
    private final AbstractC89244h f144041p = C12646c.m22778a(this, C89204ab.m154669a(C63471b.class));

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM$b */
    public static final class C63439b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f144042a;

        /* renamed from: b */
        int f144043b;

        /* renamed from: c */
        final /* synthetic */ MyVideoListVM f144044c;

        /* renamed from: d */
        Object f144045d;

        /* renamed from: e */
        Object f144046e;

        static {
            Covode.recordClassIndex(74746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63439b(MyVideoListVM myVideoListVM, AbstractC89124d dVar) {
            super(dVar);
            this.f144044c = myVideoListVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f144042a = obj;
            this.f144043b |= Integer.MIN_VALUE;
            return this.f144044c.mo102118a(0, (String) null, 0, this);
        }
    }

    static {
        Covode.recordClassIndex(74744);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM$a */
    public static final class C63438a {
        static {
            Covode.recordClassIndex(74745);
        }

        private C63438a() {
        }

        public /* synthetic */ C63438a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C63443a();
    }

    /* renamed from: j */
    public static boolean m115031j() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final ActivityC0945e mo102120k() {
        Fragment fragment = this.f144040n;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo102119a(List<C63492a> list) {
        this.f144039m.setValue(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM$d */
    static final class C63442d extends AbstractC89220m implements AbstractC89172b<C63443a, C63443a> {

        /* renamed from: a */
        final /* synthetic */ C14515a f144049a;

        static {
            Covode.recordClassIndex(74749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63442d(C14515a aVar) {
            super(1);
            this.f144049a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C63443a invoke(C63443a aVar) {
            C63443a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C63443a.m115039a(aVar2, this.f144049a, 0, false, 6);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
        return mo102118a(0, this.f144038l, 20, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM$c */
    public static final class C63440c extends AbstractC89220m implements AbstractC89172b<C63443a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyVideoListVM f144047a;

        static {
            Covode.recordClassIndex(74747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63440c(MyVideoListVM myVideoListVM) {
            super(1);
            this.f144047a = myVideoListVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C63443a aVar) {
            C63443a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (!aVar2.f144051b) {
                this.f144047a.mo20662a((AbstractC89172b) C634411.f144048a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<C63492a> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C63442d(aVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static List<Aweme> m115030b(List<? extends Aweme> list) {
        ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
        if (list == 0 || e == null || e.mo67032b() == null || e.mo67032b().isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme != null) {
                if (aweme.getAwemeRawAd() != null) {
                    List<String> b = e.mo67032b();
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(awemeRawAd, "");
                    if (b.contains(awemeRawAd.getCreativeIdStr())) {
                    }
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* synthetic */ Object mo23331a(Long l, AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
        return mo102118a(l.longValue(), this.f144038l, 20, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[Catch:{ Exception -> 0x00dc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3 A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7 A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo102118a(long r10, java.lang.String r12, int r13, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<java.lang.Long>> r14) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.assem.p3566VM.MyVideoListVM.mo102118a(long, java.lang.String, int, h.c.d):java.lang.Object");
    }
}
