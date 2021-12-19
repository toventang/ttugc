package com.p2082ss.android.ugc.aweme.upvote.publish;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79722b;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79788d;
import com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79709c;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79713g;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.EnumC79710d;
import com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC80018e;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM */
public final class UpvotePublishVM extends AssemViewModel<C80022g> {

    /* renamed from: j */
    public static final C79901a f179150j = new C79901a((byte) 0);

    /* renamed from: k */
    private final AbstractC89244h f179151k = C12646c.m22777a(this, C79909g.f179164a);

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$i */
    static final class C79911i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C79911i f179166a = new C79911i();

        static {
            Covode.recordClassIndex(93138);
        }

        C79911i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(93127);
    }

    /* renamed from: g */
    public final AbstractC12644a<AbstractC80018e> mo23342g() {
        return (AbstractC12644a) this.f179151k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$a */
    public static final class C79901a {
        static {
            Covode.recordClassIndex(93128);
        }

        private C79901a() {
        }

        public /* synthetic */ C79901a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$g */
    static final class C79909g extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC80018e>> {

        /* renamed from: a */
        public static final C79909g f179164a = new C79909g();

        static {
            Covode.recordClassIndex(93136);
        }

        C79909g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC80018e> invoke() {
            return new C80020f();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C80022g mo20674f() {
        return new C80022g();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$d */
    static final class C79905d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179157a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179158b;

        /* renamed from: c */
        final /* synthetic */ String f179159c;

        static {
            Covode.recordClassIndex(93132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79905d(UpvotePublishVM upvotePublishVM, AbstractC89171a aVar, String str) {
            super(0);
            this.f179157a = upvotePublishVM;
            this.f179158b = aVar;
            this.f179159c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            List<C79714h> upvotes;
            String str;
            this.f179158b.invoke();
            String str2 = this.f179159c;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str2, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C79711e eVar = C79722b.m138562d().get(str2);
            if (eVar != null && (upvotes = eVar.getUpvotes()) != null) {
                Iterator<T> it = upvotes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    User user = next.getUser();
                    if (user != null) {
                        str = user.getUid();
                    } else {
                        str = null;
                    }
                    C89219l.m154716b(curUser, "");
                    if (C89219l.m154714a((Object) str, (Object) curUser.getUid())) {
                        if (next != null) {
                            List g2 = C89070n.m154585g((Collection) eVar.getUpvotes());
                            g2.remove(next);
                            C79722b.m138562d().put(str2, C79711e.copy$default(eVar, g2, 0, false, eVar.getTotal() - 1, null, 22, null));
                        }
                    }
                }
            }
            C79788d.m138615a(str2);
            this.f179157a.mo20662a(new AbstractC89172b<C80022g, C80022g>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.C79905d.C799061 */

                /* renamed from: a */
                final /* synthetic */ C79905d f179160a;

                static {
                    Covode.recordClassIndex(93133);
                }

                {
                    this.f179160a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C80022g invoke(C80022g gVar) {
                    C80022g gVar2 = gVar;
                    C89219l.m154721d(gVar2, "");
                    return C80022g.m138721a(gVar2, null, null, new C12776a(new C89378p(1, this.f179160a.f179159c)), 3);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$b */
    static final class C79902b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f179152a;

        static {
            Covode.recordClassIndex(93129);
        }

        C79902b(AbstractC89171a aVar) {
            this.f179152a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f179152a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$o */
    public static final class C79920o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179183a;

        static {
            Covode.recordClassIndex(93147);
        }

        public C79920o(UpvotePublishVM upvotePublishVM) {
            this.f179183a = upvotePublishVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f179183a.mo20662a(C799211.f179184a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$f */
    static final class C79908f extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {

        /* renamed from: a */
        final /* synthetic */ CommentRethinkPopup f179163a;

        static {
            Covode.recordClassIndex(93135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79908f(CommentRethinkPopup commentRethinkPopup) {
            super(1);
            this.f179163a = commentRethinkPopup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C80022g invoke(C80022g gVar) {
            C80022g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            return C80022g.m138721a(gVar2, null, this.f179163a, null, 5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$n */
    public static final class C79919n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179181a;

        /* renamed from: b */
        final /* synthetic */ String f179182b;

        static {
            Covode.recordClassIndex(93146);
        }

        C79919n(UpvotePublishVM upvotePublishVM, String str) {
            this.f179181a = upvotePublishVM;
            this.f179182b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            UpvotePublishVM upvotePublishVM = this.f179181a;
            String str = this.f179182b;
            C89219l.m154716b(th, "");
            upvotePublishVM.mo123420a(str, th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$q */
    public static final class C79924q<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179192a;

        /* renamed from: b */
        final /* synthetic */ String f179193b;

        static {
            Covode.recordClassIndex(93151);
        }

        public C79924q(UpvotePublishVM upvotePublishVM, String str) {
            this.f179192a = upvotePublishVM;
            this.f179193b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            UpvotePublishVM upvotePublishVM = this.f179192a;
            String str = this.f179193b;
            C89219l.m154716b(th, "");
            upvotePublishVM.mo123420a(str, th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$c */
    static final class C79903c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179153a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179154b;

        /* renamed from: c */
        final /* synthetic */ String f179155c;

        static {
            Covode.recordClassIndex(93130);
        }

        C79903c(UpvotePublishVM upvotePublishVM, AbstractC89171a aVar, String str) {
            this.f179153a = upvotePublishVM;
            this.f179154b = aVar;
            this.f179155c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f179154b.invoke();
            C79788d.f178999a.mo123369a(this.f179155c, (EnumC79710d) null);
            this.f179153a.mo20662a(new AbstractC89172b<C80022g, C80022g>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.C79903c.C799041 */

                /* renamed from: a */
                final /* synthetic */ C79903c f179156a;

                static {
                    Covode.recordClassIndex(93131);
                }

                {
                    this.f179156a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C80022g invoke(C80022g gVar) {
                    C80022g gVar2 = gVar;
                    C89219l.m154721d(gVar2, "");
                    return C80022g.m138721a(gVar2, null, null, new C12776a(new C89378p(2, this.f179156a.f179155c)), 3);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$j */
    public static final class C79912j extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {

        /* renamed from: a */
        final /* synthetic */ String f179167a;

        static {
            Covode.recordClassIndex(93139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79912j(String str) {
            super(1);
            this.f179167a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C80022g invoke(C80022g gVar) {
            C80022g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            return C80022g.m138721a(gVar2, null, null, new C12776a(new C89378p(0, this.f179167a)), 3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$l */
    static final class C79915l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179172a;

        /* renamed from: b */
        final /* synthetic */ String f179173b;

        static {
            Covode.recordClassIndex(93142);
        }

        C79915l(UpvotePublishVM upvotePublishVM, String str) {
            this.f179172a = upvotePublishVM;
            this.f179173b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79788d.f178999a.mo123369a(this.f179173b, EnumC79710d.PUBLISH_FAILED);
            this.f179172a.mo20662a(new AbstractC89172b<C80022g, C80022g>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.C79915l.C799161 */

                /* renamed from: a */
                final /* synthetic */ C79915l f179174a;

                static {
                    Covode.recordClassIndex(93143);
                }

                {
                    this.f179174a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C80022g invoke(C80022g gVar) {
                    C80022g gVar2 = gVar;
                    C89219l.m154721d(gVar2, "");
                    return C80022g.m138721a(gVar2, null, null, new C12776a(new C89378p(2, this.f179174a.f179173b)), 3);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$k */
    static final class C79913k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179168a;

        /* renamed from: b */
        final /* synthetic */ UpvotePublishMobParam f179169b;

        /* renamed from: c */
        final /* synthetic */ String f179170c;

        static {
            Covode.recordClassIndex(93140);
        }

        C79913k(UpvotePublishVM upvotePublishVM, UpvotePublishMobParam upvotePublishMobParam, String str) {
            this.f179168a = upvotePublishVM;
            this.f179169b = upvotePublishMobParam;
            this.f179170c = str;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$k$a */
        static final class C79914a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {

            /* renamed from: a */
            final /* synthetic */ C79913k f179171a;

            static {
                Covode.recordClassIndex(93141);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C79914a(C79913k kVar) {
                super(1);
                this.f179171a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C80022g invoke(C80022g gVar) {
                C80022g gVar2 = gVar;
                C89219l.m154721d(gVar2, "");
                return C80022g.m138721a(gVar2, null, null, new C12776a(new C89378p(1, this.f179171a.f179170c)), 3);
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            C79713g gVar = (C79713g) obj;
            UpvotePublishMobParam upvotePublishMobParam = this.f179169b;
            C89378p[] pVarArr = new C89378p[5];
            String str5 = null;
            if (upvotePublishMobParam != null) {
                str = upvotePublishMobParam.f179137a;
            } else {
                str = null;
            }
            pVarArr[0] = C89387v.m154943a(str, "enter_from");
            if (upvotePublishMobParam != null) {
                str2 = upvotePublishMobParam.f179138b;
            } else {
                str2 = null;
            }
            pVarArr[1] = C89387v.m154943a(str2, "enter_method");
            if (upvotePublishMobParam != null) {
                str3 = upvotePublishMobParam.f179139c;
            } else {
                str3 = null;
            }
            pVarArr[2] = C89387v.m154943a(str3, "group_id");
            if (upvotePublishMobParam != null) {
                str4 = upvotePublishMobParam.f179140d;
            } else {
                str4 = null;
            }
            pVarArr[3] = C89387v.m154943a(str4, "author_id");
            if (upvotePublishMobParam != null) {
                str5 = upvotePublishMobParam.f179141e;
            }
            pVarArr[4] = C89387v.m154943a(str5, "follow_status");
            C39162r.m79462a("recommend_success", pVarArr);
            C79973b.m138703b(this.f179170c);
            C79714h hVar = gVar.f178854a;
            if (hVar != null) {
                C79788d.f178999a.mo123371a(this.f179170c, hVar);
                this.f179168a.mo20662a(new C79914a(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$e */
    public static final class C79907e extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {

        /* renamed from: a */
        final /* synthetic */ Throwable f179161a;

        /* renamed from: b */
        final /* synthetic */ String f179162b;

        static {
            Covode.recordClassIndex(93134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79907e(Throwable th, String str) {
            super(1);
            this.f179161a = th;
            this.f179162b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C80022g invoke(C80022g gVar) {
            C80022g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            return C80022g.m138721a(gVar2, new C12785h(this.f179161a), null, new C12776a(new C89378p(2, this.f179162b)), 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$m */
    public static final class C79917m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179175a;

        /* renamed from: b */
        final /* synthetic */ String f179176b;

        /* renamed from: c */
        final /* synthetic */ UpvotePublishMobParam f179177c;

        /* renamed from: d */
        final /* synthetic */ String f179178d;

        static {
            Covode.recordClassIndex(93144);
        }

        C79917m(UpvotePublishVM upvotePublishVM, String str, UpvotePublishMobParam upvotePublishMobParam, String str2) {
            this.f179175a = upvotePublishVM;
            this.f179176b = str;
            this.f179177c = upvotePublishMobParam;
            this.f179178d = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            final C79713g gVar = (C79713g) obj;
            C79714h hVar = gVar.f178854a;
            if (hVar == null || (str = hVar.getCommentId()) == null) {
                str = "";
            }
            C80017d.m138710a(str, this.f179176b, this.f179177c);
            C79973b.m138703b(this.f179178d);
            C79714h hVar2 = gVar.f178854a;
            if (hVar2 != null) {
                C79788d.f178999a.mo123371a(this.f179178d, hVar2);
            }
            this.f179175a.mo20662a(new AbstractC89172b<C80022g, C80022g>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.C79917m.C799181 */

                /* renamed from: a */
                final /* synthetic */ C79917m f179179a;

                static {
                    Covode.recordClassIndex(93145);
                }

                {
                    this.f179179a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C80022g invoke(C80022g gVar) {
                    C80022g gVar2 = gVar;
                    C89219l.m154721d(gVar2, "");
                    return C80022g.m138721a(gVar2, new C12792n(gVar), null, new C12776a(new C89378p(1, this.f179179a.f179178d)), 2);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$h */
    static final class C79910h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ List f179165a;

        static {
            Covode.recordClassIndex(93137);
        }

        C79910h(List list) {
            this.f179165a = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Iterable iterable = ((C79709c) obj).f178845b;
            if (iterable == null) {
                iterable = C89086z.INSTANCE;
            }
            List<T> j = C89070n.m154590j(C89070n.m154568c((Iterable) this.f179165a, iterable));
            C89219l.m154721d(j, "");
            for (T t : j) {
                C39162r.m79462a("recommend_success", C89387v.m154943a("cold_start", "enter_method"), C89387v.m154943a(t, "group_id"));
            }
            C89219l.m154721d(j, "");
            List g = C89070n.m154585g((Collection) C79973b.m138699a());
            g.removeAll(j);
            C79973b.m138701a(g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$p */
    public static final class C79922p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvotePublishVM f179185a;

        /* renamed from: b */
        final /* synthetic */ String f179186b;

        /* renamed from: c */
        final /* synthetic */ UpvotePublishMobParam f179187c;

        /* renamed from: d */
        final /* synthetic */ String f179188d;

        /* renamed from: e */
        final /* synthetic */ boolean f179189e;

        static {
            Covode.recordClassIndex(93149);
        }

        public C79922p(UpvotePublishVM upvotePublishVM, String str, UpvotePublishMobParam upvotePublishMobParam, String str2, boolean z) {
            this.f179185a = upvotePublishVM;
            this.f179186b = str;
            this.f179187c = upvotePublishMobParam;
            this.f179188d = str2;
            this.f179189e = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String commentId;
            final C79713g gVar = (C79713g) obj;
            String str2 = "";
            if (gVar.f178855b == null) {
                C79714h hVar = gVar.f178854a;
                if (!(hVar == null || (commentId = hVar.getCommentId()) == null)) {
                    str2 = commentId;
                }
                C80017d.m138710a(str2, this.f179186b, this.f179187c);
                C79973b.m138703b(this.f179188d);
                C79714h hVar2 = gVar.f178854a;
                if (hVar2 != null) {
                    C79788d.f178999a.mo123371a(this.f179188d, hVar2);
                }
                this.f179185a.mo20662a(new AbstractC89172b<C80022g, C80022g>(this) {
                    /* class com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.C79922p.C799231 */

                    /* renamed from: a */
                    final /* synthetic */ C79922p f179190a;

                    static {
                        Covode.recordClassIndex(93150);
                    }

                    {
                        this.f179190a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C80022g invoke(C80022g gVar) {
                        C80022g gVar2 = gVar;
                        C89219l.m154721d(gVar2, "");
                        return C80022g.m138721a(gVar2, new C12792n(gVar), null, new C12776a(new C89378p(1, this.f179190a.f179188d)), 2);
                    }
                });
                return;
            }
            UpvotePublishVM upvotePublishVM = this.f179185a;
            String str3 = this.f179188d;
            String str4 = this.f179186b;
            CommentRethinkPopup commentRethinkPopup = gVar.f178855b;
            boolean z = this.f179189e;
            UpvotePublishMobParam upvotePublishMobParam = this.f179187c;
            Activity topActivity = ActivityStack.getTopActivity();
            if (!(topActivity instanceof ActivityC0945e)) {
                topActivity = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) topActivity;
            if (eVar != null) {
                if (eVar.getSupportFragmentManager().mo3551a("UpvoteCommentDialogFragment") == null) {
                    C89219l.m154721d(str3, str2);
                    C89378p[] pVarArr = new C89378p[5];
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    pVarArr[0] = C89387v.m154943a(str, "resend_same_cmt");
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, str2);
                    pVarArr[1] = C89387v.m154943a(g.getCurUserId(), "user_id");
                    pVarArr[2] = C89387v.m154943a(str3, "group_id");
                    pVarArr[3] = C89387v.m154943a("0", "no_sw");
                    pVarArr[4] = C89387v.m154943a("recommend", "scene");
                    C39162r.m79462a("comment_rethink_hit", pVarArr);
                    upvotePublishVM.mo123419a(str3, str4, upvotePublishMobParam);
                    return;
                }
                upvotePublishVM.mo20662a(new C79908f(commentRethinkPopup));
            }
        }
    }

    /* renamed from: a */
    public final void mo123418a(String str, String str2) {
        C89219l.m154721d(str, "");
        C79788d.f178999a.mo123372a(str, str2);
        mo20662a(new C79912j(str));
    }

    /* renamed from: a */
    public final void mo123417a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        C89219l.m154721d(str, "");
        AbstractC88412b a = AbstractC80018e.C80019a.m138715a(mo23342g().mo20458a(), str).mo142917b().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C79913k(this, upvotePublishMobParam, str), new C79915l(this, str));
        C89219l.m154716b(a, "");
        mo20659a(a);
    }

    /* renamed from: a */
    public final void mo123420a(String str, Throwable th) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            if (!(th instanceof C34480a) || ((C34480a) th).getErrorCode() != 7) {
                new C23144b(topActivity).mo37640e(R.string.f67).mo37637b();
            } else {
                new C23144b(topActivity).mo37640e(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f6o), Integer.valueOf((int) R.string.fay))).intValue()).mo37637b();
            }
            C79788d.f178999a.mo123369a(str, EnumC79710d.PUBLISH_FAILED);
            mo20662a(new C79907e(th, str));
        }
    }

    /* renamed from: a */
    public final void mo123419a(String str, String str2, UpvotePublishMobParam upvotePublishMobParam) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        mo123418a(str, str2);
        AbstractC88412b a = mo23342g().mo20458a().mo123470b(str, str2).mo142917b().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C79917m(this, str2, upvotePublishMobParam, str), new C79919n(this, str));
        C89219l.m154716b(a, "");
        mo20659a(a);
    }
}
