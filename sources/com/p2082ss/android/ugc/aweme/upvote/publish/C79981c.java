package com.p2082ss.android.ugc.aweme.upvote.publish;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79722b;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79788d;
import com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79705a;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.EnumC79710d;
import com.p2082ss.android.ugc.aweme.upvote.p4191e.C79895a;
import com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.p2082ss.android.ugc.aweme.upvote.publish.p4193b.C79974a;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.c */
public final class C79981c {

    /* renamed from: a */
    public static final C79981c f179303a = new C79981c();

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$a */
    public static final class C79982a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
        public static final C79982a INSTANCE = new C79982a();

        static {
            Covode.recordClassIndex(93209);
        }

        public C79982a() {
            super(1);
        }

        public final C80022g invoke(C80022g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$g */
    public static final class RunnableC79988g implements Runnable {

        /* renamed from: a */
        public static final RunnableC79988g f179307a = new RunnableC79988g();

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$g$a */
        public static final class C79989a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
            public static final C79989a INSTANCE = new C79989a();

            static {
                Covode.recordClassIndex(93216);
            }

            public C79989a() {
                super(1);
            }

            public final C80022g invoke(C80022g gVar) {
                C89219l.m154719c(gVar, "");
                return gVar;
            }
        }

        static {
            Covode.recordClassIndex(93215);
        }

        RunnableC79988g() {
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$g$e */
        public static final class C79993e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ AbstractC1204m f179310a;

            static {
                Covode.recordClassIndex(93220);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79993e(AbstractC1204m mVar) {
                super(0);
                this.f179310a = mVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final AbstractC1204m invoke() {
                return this.f179310a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$g$d */
        public static final class C79992d extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
            public static final C79992d INSTANCE = new C79992d();

            static {
                Covode.recordClassIndex(93219);
            }

            public C79992d() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C80022g> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$g$f */
        public static final class C79994f extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C79994f INSTANCE = new C79994f();

            static {
                Covode.recordClassIndex(93221);
            }

            public C79994f() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$g$b */
        public static final class C79990b extends AbstractC89220m implements AbstractC89171a<C12752d> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179308a;

            static {
                Covode.recordClassIndex(93217);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79990b(ActivityC0945e eVar) {
                super(0);
                this.f179308a = eVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12752d invoke() {
                ActivityC0945e b = C12777b.m23004b(this.f179308a);
                if (b != null) {
                    return Assembler.C12747a.m22936a(b).mo20583b(b);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$g$c */
        public static final class C79991c extends AbstractC89220m implements AbstractC89171a<C12753e> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179309a;

            static {
                Covode.recordClassIndex(93218);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79991c(ActivityC0945e eVar) {
                super(0);
                this.f179309a = eVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12753e invoke() {
                ActivityC0945e b = C12777b.m23004b(this.f179309a);
                if (b != null) {
                    return Assembler.C12747a.m22936a(b).mo20584c(b);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        public final void run() {
            Activity topActivity = ActivityStack.getTopActivity();
            if (!(topActivity instanceof ActivityC0945e)) {
                topActivity = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) topActivity;
            if (eVar != null) {
                C12642a aVar = new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C79992d.INSTANCE, new C79993e(eVar), C79994f.INSTANCE, C79989a.INSTANCE, new C79990b(eVar), new C79991c(eVar));
                List<String> a = C79973b.m138699a();
                UpvotePublishVM upvotePublishVM = (UpvotePublishVM) aVar.getValue();
                if (a != null && !a.isEmpty()) {
                    AbstractC88412b a2 = upvotePublishVM.mo23342g().mo20458a().mo123469a(a).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new UpvotePublishVM.C79910h(a), UpvotePublishVM.C79911i.f179166a);
                    C89219l.m154716b(a2, "");
                    upvotePublishVM.mo20659a(a2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i */
    public static final class C79998i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f179315a;

        /* renamed from: b */
        final /* synthetic */ String f179316b;

        /* renamed from: c */
        final /* synthetic */ Map f179317c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f179318d;

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$a */
        public static final class C79999a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
            public static final C79999a INSTANCE = new C79999a();

            static {
                Covode.recordClassIndex(93226);
            }

            public C79999a() {
                super(1);
            }

            public final C80022g invoke(C80022g gVar) {
                C89219l.m154719c(gVar, "");
                return gVar;
            }
        }

        static {
            Covode.recordClassIndex(93225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79998i(ActivityC0945e eVar, String str, Map map, AbstractC89171a aVar) {
            super(0);
            this.f179315a = eVar;
            this.f179316b = str;
            this.f179317c = map;
            this.f179318d = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$e */
        public static final class C80003e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ AbstractC1204m f179321a;

            static {
                Covode.recordClassIndex(93230);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80003e(AbstractC1204m mVar) {
                super(0);
                this.f179321a = mVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final AbstractC1204m invoke() {
                return this.f179321a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$d */
        public static final class C80002d extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
            public static final C80002d INSTANCE = new C80002d();

            static {
                Covode.recordClassIndex(93229);
            }

            public C80002d() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C80022g> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$f */
        public static final class C80004f extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C80004f INSTANCE = new C80004f();

            static {
                Covode.recordClassIndex(93231);
            }

            public C80004f() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$b */
        public static final class C80000b extends AbstractC89220m implements AbstractC89171a<C12752d> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179319a;

            static {
                Covode.recordClassIndex(93227);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80000b(ActivityC0945e eVar) {
                super(0);
                this.f179319a = eVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12752d invoke() {
                ActivityC0945e b = C12777b.m23004b(this.f179319a);
                if (b != null) {
                    return Assembler.C12747a.m22936a(b).mo20583b(b);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$c */
        public static final class C80001c extends AbstractC89220m implements AbstractC89171a<C12753e> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179320a;

            static {
                Covode.recordClassIndex(93228);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80001c(ActivityC0945e eVar) {
                super(0);
                this.f179320a = eVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12753e invoke() {
                ActivityC0945e b = C12777b.m23004b(this.f179320a);
                if (b != null) {
                    return Assembler.C12747a.m22936a(b).mo20584c(b);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$g */
        static final class C80005g extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179322a;

            /* renamed from: b */
            final /* synthetic */ C79998i f179323b;

            static {
                Covode.recordClassIndex(93232);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C80005g(ActivityC0945e eVar, C79998i iVar) {
                super(0);
                this.f179322a = eVar;
                this.f179323b = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C39162r.m79460a("recommend_cancel_success", this.f179323b.f179317c);
                new C23144b(this.f179322a).mo37640e(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f6j), Integer.valueOf((int) R.string.fas))).intValue()).mo37637b();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$i$h */
        static final class C80006h extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179324a;

            static {
                Covode.recordClassIndex(93233);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C80006h(ActivityC0945e eVar) {
                super(0);
                this.f179324a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                new C23144b(this.f179324a).mo37640e(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f66), Integer.valueOf((int) R.string.fal))).intValue()).mo37637b();
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            List<C79714h> upvotes;
            T t;
            String str;
            ActivityC0945e eVar = this.f179315a;
            if (!C80422fe.m139425a(eVar)) {
                new C23144b(eVar).mo37640e(R.string.acq).mo37637b();
            } else {
                UpvotePublishVM upvotePublishVM = (UpvotePublishVM) new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C80002d.INSTANCE, new C80003e(eVar), C80004f.INSTANCE, C79999a.INSTANCE, new C80000b(eVar), new C80001c(eVar)).getValue();
                String str2 = this.f179316b;
                C80005g gVar = new C80005g(eVar, this);
                C80006h hVar = new C80006h(eVar);
                C89219l.m154721d(str2, "");
                C89219l.m154721d(gVar, "");
                C89219l.m154721d(hVar, "");
                C79711e b = C79722b.m138559b(str2);
                if (!(b == null || (upvotes = b.getUpvotes()) == null)) {
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    String curUserId = g.getCurUserId();
                    Iterator<T> it = upvotes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        User user = t.getUser();
                        if (user != null) {
                            str = user.getUid();
                        } else {
                            str = null;
                        }
                        if (C89219l.m154714a((Object) str, (Object) curUserId)) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        UpvotePublishVM.C79905d dVar = new UpvotePublishVM.C79905d(upvotePublishVM, gVar, str2);
                        if (t2.getCacheState() == EnumC79710d.PUBLISH_FAILED) {
                            dVar.invoke();
                        } else {
                            C79788d.f178999a.mo123369a(str2, EnumC79710d.PRE_REMOVE);
                            AbstractC88412b a = upvotePublishVM.mo23342g().mo20458a().mo123467a(str2).mo142917b().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new UpvotePublishVM.C79902b(dVar), new UpvotePublishVM.C79903c(upvotePublishVM, hVar, str2));
                            C89219l.m154716b(a, "");
                            upvotePublishVM.mo20659a(a);
                        }
                    }
                }
            }
            AbstractC89171a aVar = this.f179318d;
            if (aVar != null) {
                return aVar.invoke();
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$l */
    public static final class C80009l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f179330a;

        /* renamed from: b */
        final /* synthetic */ String f179331b;

        /* renamed from: c */
        final /* synthetic */ UpvotePublishMobParam f179332c;

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$l$a */
        public static final class C80010a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
            public static final C80010a INSTANCE = new C80010a();

            static {
                Covode.recordClassIndex(93237);
            }

            public C80010a() {
                super(1);
            }

            public final C80022g invoke(C80022g gVar) {
                C89219l.m154719c(gVar, "");
                return gVar;
            }
        }

        static {
            Covode.recordClassIndex(93236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80009l(ActivityC0945e eVar, String str, UpvotePublishMobParam upvotePublishMobParam) {
            super(0);
            this.f179330a = eVar;
            this.f179331b = str;
            this.f179332c = upvotePublishMobParam;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$l$e */
        public static final class C80014e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ AbstractC1204m f179335a;

            static {
                Covode.recordClassIndex(93241);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80014e(AbstractC1204m mVar) {
                super(0);
                this.f179335a = mVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final AbstractC1204m invoke() {
                return this.f179335a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$l$d */
        public static final class C80013d extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
            public static final C80013d INSTANCE = new C80013d();

            static {
                Covode.recordClassIndex(93240);
            }

            public C80013d() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C80022g> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$l$f */
        public static final class C80015f extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C80015f INSTANCE = new C80015f();

            static {
                Covode.recordClassIndex(93242);
            }

            public C80015f() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$l$b */
        public static final class C80011b extends AbstractC89220m implements AbstractC89171a<C12752d> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179333a;

            static {
                Covode.recordClassIndex(93238);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80011b(ActivityC0945e eVar) {
                super(0);
                this.f179333a = eVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12752d invoke() {
                ActivityC0945e b = C12777b.m23004b(this.f179333a);
                if (b != null) {
                    return Assembler.C12747a.m22936a(b).mo20583b(b);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$l$c */
        public static final class C80012c extends AbstractC89220m implements AbstractC89171a<C12753e> {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f179334a;

            static {
                Covode.recordClassIndex(93239);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80012c(ActivityC0945e eVar) {
                super(0);
                this.f179334a = eVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12753e invoke() {
                ActivityC0945e b = C12777b.m23004b(this.f179334a);
                if (b != null) {
                    return Assembler.C12747a.m22936a(b).mo20584c(b);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ActivityC0945e eVar = this.f179330a;
            ((UpvotePublishVM) new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C80013d.INSTANCE, new C80014e(eVar), C80015f.INSTANCE, C80010a.INSTANCE, new C80011b(eVar), new C80012c(eVar)).getValue()).mo123417a(this.f179331b, this.f179332c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$e */
    public static final class C79986e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f179306a;

        static {
            Covode.recordClassIndex(93213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79986e(AbstractC1204m mVar) {
            super(0);
            this.f179306a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f179306a;
        }
    }

    private C79981c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$d */
    public static final class C79985d extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
        public static final C79985d INSTANCE = new C79985d();

        static {
            Covode.recordClassIndex(93212);
        }

        public C79985d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C80022g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$f */
    public static final class C79987f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79987f INSTANCE = new C79987f();

        static {
            Covode.recordClassIndex(93214);
        }

        public C79987f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$m */
    public static final class C80016m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79974a f179336a;

        static {
            Covode.recordClassIndex(93243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80016m(C79974a aVar) {
            super(0);
            this.f179336a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43787a(this.f179336a.mo123457a());
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(93208);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$b */
    public static final class C79983b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f179304a;

        static {
            Covode.recordClassIndex(93210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79983b(ActivityC0945e eVar) {
            super(0);
            this.f179304a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179304a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$c */
    public static final class C79984c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f179305a;

        static {
            Covode.recordClassIndex(93211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79984c(ActivityC0945e eVar) {
            super(0);
            this.f179305a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179305a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$j */
    public static final class C80007j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79974a f179325a;

        /* renamed from: b */
        final /* synthetic */ UpvotePublishMobParam f179326b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f179327c;

        static {
            Covode.recordClassIndex(93234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80007j(C79974a aVar, UpvotePublishMobParam upvotePublishMobParam, AbstractC89171a aVar2) {
            super(0);
            this.f179325a = aVar;
            this.f179326b = upvotePublishMobParam;
            this.f179327c = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39162r.m79462a("close_recommend_panel", C89387v.m154943a(this.f179326b.f179137a, "enter_from"), C89387v.m154943a("icon", "enter_method"), C89387v.m154943a("finish_panel", "page"), C89387v.m154943a("0", "with_recommendation"));
            this.f179327c.invoke();
            C23226a.C23228b.m43787a(this.f179325a.mo123457a());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$h */
    public static final class C79995h extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map f179311a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179312b;

        static {
            Covode.recordClassIndex(93222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79995h(Map map, AbstractC89171a aVar) {
            super(1);
            this.f179311a = map;
            this.f179312b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String b = C34722h.m70923b(R.string.f6g);
            C89219l.m154716b(b, "");
            bVar2.mo37421c(b, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.publish.C79981c.C79995h.C799961 */

                /* renamed from: a */
                final /* synthetic */ C79995h f179313a;

                static {
                    Covode.recordClassIndex(93223);
                }

                {
                    this.f179313a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f179313a.f179311a.put("action_type", "1");
                    C39162r.m79460a("click_discard_pop_up", this.f179313a.f179311a);
                    this.f179313a.f179312b.invoke();
                    return C89391z.f203057a;
                }
            });
            String b2 = C34722h.m70923b(R.string.f6b);
            C89219l.m154716b(b2, "");
            bVar2.mo37419b(b2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.publish.C79981c.C79995h.C799972 */

                /* renamed from: a */
                final /* synthetic */ C79995h f179314a;

                static {
                    Covode.recordClassIndex(93224);
                }

                {
                    this.f179314a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f179314a.f179311a.put("action_type", "0");
                    C39162r.m79460a("click_discard_pop_up", this.f179314a.f179311a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$k */
    public static final class DialogInterface$OnCancelListenerC80008k implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishMobParam f179328a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179329b;

        static {
            Covode.recordClassIndex(93235);
        }

        DialogInterface$OnCancelListenerC80008k(UpvotePublishMobParam upvotePublishMobParam, AbstractC89171a aVar) {
            this.f179328a = upvotePublishMobParam;
            this.f179329b = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C39162r.m79462a("close_recommend_panel", C89387v.m154943a(this.f179328a.f179137a, "enter_from"), C89387v.m154943a("other", "enter_method"), C89387v.m154943a("finish_panel", "page"), C89387v.m154943a("0", "with_recommendation"));
            this.f179329b.invoke();
        }
    }

    /* renamed from: a */
    public static void m138708a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(upvotePublishMobParam, "");
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof ActivityC0945e)) {
            topActivity = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) topActivity;
        if (eVar != null) {
            C79973b.m138700a(str);
            C39162r.m79462a("recommend", C89387v.m154943a(upvotePublishMobParam.f179137a, "enter_from"), C89387v.m154943a(upvotePublishMobParam.f179138b, "enter_method"), C89387v.m154943a(upvotePublishMobParam.f179139c, "group_id"), C89387v.m154943a(upvotePublishMobParam.f179140d, "author_id"), C89387v.m154943a(upvotePublishMobParam.f179141e, "follow_status"));
            ((UpvotePublishVM) new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C79985d.INSTANCE, new C79986e(eVar), C79987f.INSTANCE, C79982a.INSTANCE, new C79983b(eVar), new C79984c(eVar)).getValue()).mo123418a(str, (String) null);
            C80009l lVar = new C80009l(eVar, str, upvotePublishMobParam);
            C79974a aVar = new C79974a(eVar, str, upvotePublishMobParam);
            aVar.mo123458a(new C80016m(aVar));
            aVar.mo123460b(new C80007j(aVar, upvotePublishMobParam, lVar));
            new C23226a.C23227a().mo37816a(aVar.mo123457a()).mo37814a(new DialogInterface$OnCancelListenerC80008k(upvotePublishMobParam, lVar)).f55057a.show(eVar.getSupportFragmentManager(), "UpvoteCommentPanel");
            if (!C79895a.m138661b()) {
                C79895a.m138662c();
            }
        }
    }

    /* renamed from: a */
    public static void m138709a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, AbstractC89171a<C89391z> aVar) {
        String str2;
        String b;
        C89219l.m154721d(str, "");
        C89219l.m154721d(upvotePublishMobParam, "");
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof ActivityC0945e)) {
            topActivity = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) topActivity;
        if (eVar != null) {
            C89378p[] pVarArr = new C89378p[6];
            pVarArr[0] = C89387v.m154943a("enter_from", upvotePublishMobParam.f179137a);
            pVarArr[1] = C89387v.m154943a("group_id", upvotePublishMobParam.f179139c);
            pVarArr[2] = C89387v.m154943a("author_id", upvotePublishMobParam.f179140d);
            pVarArr[3] = C89387v.m154943a("follow_status", upvotePublishMobParam.f179141e);
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            pVarArr[4] = C89387v.m154943a("with_recommendation", str2);
            pVarArr[5] = C89387v.m154943a("enter_method", upvotePublishMobParam.f179138b);
            Map a = C89041ag.m154421a(pVarArr);
            C39162r.m79460a("recommend_cancel", a);
            C79998i iVar = new C79998i(eVar, str, a, aVar);
            if (z) {
                Map b2 = C89041ag.m154427b(C89387v.m154943a("enter_from", upvotePublishMobParam.f179137a), C89387v.m154943a("pop_up_type", "cancel_status"));
                C39162r.m79460a("show_discard_pop_up", b2);
                if (C79705a.m138534b()) {
                    b = C34722h.m70923b(R.string.f6i);
                } else {
                    b = C34722h.m70923b(R.string.far);
                }
                C23028c.m43435a(C23013a.C23015a.m43405a(eVar).mo37411b(b).mo37413d(C34722h.m70923b(R.string.f6h)), new C79995h(b2, iVar)).mo37405a().mo37396b().show();
                return;
            }
            iVar.invoke();
        }
    }
}
