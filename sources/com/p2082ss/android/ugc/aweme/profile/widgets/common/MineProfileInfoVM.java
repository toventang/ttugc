package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.UserResponse;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.AbstractC89244h;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM */
public final class MineProfileInfoVM extends AssemViewModel<C64590e> {

    /* renamed from: j */
    final AbstractC89244h f146270j = C12646c.m22777a(this, C64567b.f146278a);

    static {
        Covode.recordClassIndex(76028);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM$b */
    static final class C64567b extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC64591f>> {

        /* renamed from: a */
        public static final C64567b f146278a = new C64567b();

        static {
            Covode.recordClassIndex(76032);
        }

        C64567b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC64591f> invoke() {
            return new C64588d();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C64590e mo20674f() {
        return new C64590e();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM$a */
    static final class C64564a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f146271a;

        /* renamed from: b */
        final /* synthetic */ MineProfileInfoVM f146272b;

        /* renamed from: c */
        final /* synthetic */ int f146273c;

        /* renamed from: d */
        final /* synthetic */ EnumC64592g f146274d;

        static {
            Covode.recordClassIndex(76029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64564a(MineProfileInfoVM mineProfileInfoVM, int i, EnumC64592g gVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f146272b = mineProfileInfoVM;
            this.f146273c = i;
            this.f146274d = gVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C64564a(this.f146272b, this.f146273c, this.f146274d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C64564a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            final User user;
            String str;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f146271a;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    int i2 = this.f146273c;
                    this.f146271a = 1;
                    obj = ((AbstractC64591f) ((AbstractC12644a) this.f146272b.f146270j.getValue()).mo20458a()).mo104147a(i2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e) {
                    C33744d dVar = new C33744d();
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    C33744d a = dVar.mo59983a("to_user_id", g.getCurUserId()).mo59983a("enter_from", "personal_homepage").mo59980a("is_success", 0).mo59983a("fail_info", e.getMessage());
                    C89219l.m154716b(a, "");
                    if (e instanceof C34485a) {
                        a.mo59983a("response", ((C34485a) e).getResponse());
                    }
                    Map<String, String> map = a.f79943a;
                    C39162r.m79460a("profile_request_response", map);
                    C51423a.m95784a(4, "aweme/v1/user", map.toString());
                    this.f146272b.mo20662a(new AbstractC89172b<C64590e, C64590e>() {
                        /* class com.p2082ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM.C64564a.C645662 */

                        static {
                            Covode.recordClassIndex(76031);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C64590e invoke(C64590e eVar) {
                            C64590e eVar2 = eVar;
                            C89219l.m154721d(eVar2, "");
                            return C64590e.m116524a(new C12785h(e), eVar2.f146310b);
                        }
                    });
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserResponse userResponse = (UserResponse) obj;
            String str2 = null;
            if (userResponse != null) {
                user = userResponse.getUser();
            } else {
                user = null;
            }
            C33744d dVar2 = new C33744d();
            if (user != null) {
                str2 = user.getUid();
            }
            C33744d a2 = dVar2.mo59983a("to_user_id", str2).mo59983a("enter_from", "personal_homepage").mo59980a("is_success", 1);
            if (user == null || (str = user.getRequestId()) == null) {
                str = "";
            }
            C39162r.m79460a("profile_request_response", a2.mo59983a("log_pb", str).f79943a);
            C31575b.m65865g().updateCurUser(user);
            this.f146272b.mo20662a(new AbstractC89172b<C64590e, C64590e>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM.C64564a.C645651 */

                /* renamed from: a */
                final /* synthetic */ C64564a f146275a;

                static {
                    Covode.recordClassIndex(76030);
                }

                {
                    this.f146275a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C64590e invoke(C64590e eVar) {
                    C89219l.m154721d(eVar, "");
                    return C64590e.m116524a(new C12792n(user), this.f146275a.f146274d);
                }
            });
            return C89391z.f203057a;
        }
    }
}
