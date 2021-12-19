package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$updateIMUserFollowStatus$1 */
final class IMService$updateIMUserFollowStatus$1 extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {
    final /* synthetic */ IMUser $user;
    int label;
    final /* synthetic */ IMService this$0;

    static {
        Covode.recordClassIndex(64898);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IMService$updateIMUserFollowStatus$1(IMService iMService, IMUser iMUser, AbstractC89124d dVar) {
        super(2, dVar);
        this.this$0 = iMService;
        this.$user = iMUser;
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
        C89219l.m154721d(dVar, "");
        return new IMService$updateIMUserFollowStatus$1(this.this$0, this.$user, dVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
        return ((IMService$updateIMUserFollowStatus$1) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
    public final Object invokeSuspend(Object obj) {
        String str;
        IMUser iMUser;
        if (this.label == 0) {
            C89382r.m154942a(obj);
            IMUser iMUser2 = this.$user;
            String str2 = null;
            if (iMUser2 != null) {
                str = iMUser2.getUid();
            } else {
                str = null;
            }
            IMUser iMUser3 = this.$user;
            if (iMUser3 != null) {
                str2 = iMUser3.getSecUid();
            }
            IMUser a = C55085g.m100751a(str, str2);
            if (a == null || (iMUser = this.$user) == null) {
                a = this.$user;
            } else {
                a.setFollowStatus(iMUser.getFollowStatus());
                a.setBlock(this.$user.isBlock());
            }
            IMUser iMUser4 = this.$user;
            if (iMUser4 == null || iMUser4.getFollowStatus() != 0) {
                if (a != null) {
                    a.setFollowTime(System.currentTimeMillis() / 1000);
                }
            } else if (a != null) {
                a.setFollowTime(0);
            }
            this.this$0.updateIMUser(a);
            return C89391z.f203057a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
