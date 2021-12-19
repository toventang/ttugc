package com.p2082ss.android.ugc.aweme.upvote.service;

import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractPermission;
import com.p2082ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79722b;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79788d;
import com.p2082ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble;
import com.p2082ss.android.ugc.aweme.upvote.event.C79898a;
import com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79705a;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC79925a;
import com.p2082ss.android.ugc.aweme.upvote.publish.C79981c;
import com.p2082ss.android.ugc.aweme.upvote.publish.C80022g;
import com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl */
public final class UpvoteServiceImpl implements IUpvoteService {

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$a */
    public static final class C80023a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
        public static final C80023a INSTANCE = new C80023a();

        static {
            Covode.recordClassIndex(93253);
        }

        public C80023a() {
            super(1);
        }

        public final C80022g invoke(C80022g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$f */
    public static final class C80028f extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
        public static final C80028f INSTANCE = new C80028f();

        static {
            Covode.recordClassIndex(93258);
        }

        public C80028f() {
            super(1);
        }

        public final C80022g invoke(C80022g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(93252);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final int mo123474a() {
        return R.layout.bhe;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$d */
    public static final class C80026d extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f179342a;

        static {
            Covode.recordClassIndex(93256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80026d(AbstractC1204m mVar) {
            super(0);
            this.f179342a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f179342a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$j */
    public static final class C80032j extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f179345a;

        static {
            Covode.recordClassIndex(93262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80032j(AbstractC1204m mVar) {
            super(0);
            this.f179345a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f179345a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$b */
    public static final class C80024b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C80024b INSTANCE = new C80024b();

        static {
            Covode.recordClassIndex(93254);
        }

        public C80024b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$c */
    public static final class C80025c extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
        public static final C80025c INSTANCE = new C80025c();

        static {
            Covode.recordClassIndex(93255);
        }

        public C80025c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C80022g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$e */
    public static final class C80027e extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C80027e INSTANCE = new C80027e();

        static {
            Covode.recordClassIndex(93257);
        }

        public C80027e() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$i */
    public static final class C80031i extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
        public static final C80031i INSTANCE = new C80031i();

        static {
            Covode.recordClassIndex(93261);
        }

        public C80031i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C80022g> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: b */
    public final void mo123484b() {
        C34727m.m70944a(C79981c.RunnableC79988g.f179307a);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$g */
    public static final class C80029g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f179343a;

        static {
            Covode.recordClassIndex(93259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80029g(ActivityC0945e eVar) {
            super(0);
            this.f179343a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179343a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$h */
    public static final class C80030h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f179344a;

        static {
            Covode.recordClassIndex(93260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80030h(ActivityC0945e eVar) {
            super(0);
            this.f179344a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179344a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: c */
    public final void mo123486c() {
        C79722b.m138556a().clear();
        C79722b.m138560b().clear();
        C79722b.m138562d().evictAll();
        C79722b.m138561c().clear();
    }

    /* renamed from: d */
    public static IUpvoteService m138748d() {
        MethodCollector.m26663i(5743);
        Object a = C81908b.m141854a(IUpvoteService.class, false);
        if (a != null) {
            IUpvoteService iUpvoteService = (IUpvoteService) a;
            MethodCollector.m26664o(5743);
            return iUpvoteService;
        }
        if (C81908b.f183389es == null) {
            synchronized (IUpvoteService.class) {
                try {
                    if (C81908b.f183389es == null) {
                        C81908b.f183389es = new UpvoteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5743);
                    throw th;
                }
            }
        }
        UpvoteServiceImpl upvoteServiceImpl = (UpvoteServiceImpl) C81908b.f183389es;
        MethodCollector.m26664o(5743);
        return upvoteServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: b */
    public final Integer mo123483b(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        return C79722b.m138560b().get(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final AssemViewModel<C80022g> mo123475a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return (UpvotePublishVM) new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C80031i.INSTANCE, new C80032j(eVar), C80024b.INSTANCE, C80028f.INSTANCE, new C80029g(eVar), new C80030h(eVar)).getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final List<C79714h> mo123477a(String str) {
        List<C79714h> upvotes;
        C89219l.m154721d(str, "");
        C79711e b = C79722b.m138559b(str);
        if (b == null || (upvotes = b.getUpvotes()) == null) {
            return C89086z.INSTANCE;
        }
        return upvotes;
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: c */
    public final C79898a mo123485c(String str) {
        boolean z;
        String str2;
        C89219l.m154721d(str, "");
        C79711e b = C79722b.m138559b(str);
        if (b == null) {
            return new C79898a();
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        List<C79714h> upvotes = b.getUpvotes();
        if (!(upvotes instanceof Collection) || !upvotes.isEmpty()) {
            Iterator<T> it = upvotes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User user = it.next().getUser();
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                if (C89219l.m154714a((Object) str2, (Object) curUserId)) {
                    z = true;
                    break;
                }
            }
            return new C79898a(true, (int) b.getTotal(), z);
        }
        z = false;
        return new C79898a(true, (int) b.getTotal(), z);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123482a(List<? extends Aweme> list) {
        Integer num;
        C89219l.m154721d(list, "");
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            String aid = t.getAid();
            if (aid != null) {
                InteractPermission interactPermission = t.getInteractPermission();
                if (interactPermission != null) {
                    num = Integer.valueOf(interactPermission.getUpvote());
                    if (num != null) {
                        C79722b.m138557a(aid, num.intValue());
                    }
                } else {
                    num = null;
                }
                UpvoteReason upvoteReason = t.getUpvoteReason();
                if (upvoteReason != null) {
                    C89219l.m154716b(upvoteReason, "");
                    if (num != null && num.intValue() == 0) {
                        arrayList.add(aid);
                        arrayList2.add(upvoteReason);
                        C89219l.m154721d(aid, "");
                        C89219l.m154721d(upvoteReason, "");
                        C79722b.m138556a().put(aid, upvoteReason);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C79788d.m138618a(arrayList, arrayList2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123479a(String str, int i) {
        C89219l.m154721d(str, "");
        C79722b.m138557a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final AbstractC79704a mo123476a(FrameLayout frameLayout, AbstractC1204m mVar) {
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(mVar, "");
        if (!C79705a.m138533a()) {
            return null;
        }
        return new UpvoteFeedBubble(frameLayout, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl$k */
    static final class C80033k extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends C89378p<? extends Integer, ? extends String>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC79925a f179346a;

        static {
            Covode.recordClassIndex(93263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80033k(AbstractC79925a aVar) {
            super(2);
            this.f179346a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar) {
            T t;
            C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                int intValue = ((Number) t.component1()).intValue();
                String str = (String) t.component2();
                if (C89064i.m154489a(new Integer[]{1, 2}, Integer.valueOf(intValue))) {
                    this.f179346a.mo92910a(str);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123478a(AbstractC12846h hVar, AbstractC79925a aVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar, "");
        AbstractC12818f.C12819a.m23063a(hVar, (AssemViewModel) new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C80025c.INSTANCE, new C80026d(hVar), C80027e.INSTANCE, C80023a.INSTANCE, null, null).getValue(), C80035b.f179349a, C12856l.m23100a(), new C80033k(aVar), 4);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123480a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(upvotePublishMobParam, "");
        C79981c.m138708a(str, upvotePublishMobParam);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123481a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(upvotePublishMobParam, "");
        C79981c.m138709a(str, z, upvotePublishMobParam, aVar);
    }
}
