package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserStruct;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$updateIMUser$1 */
public final class IMService$updateIMUser$1 extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {
    final /* synthetic */ IMUser $user;
    int label;
    final /* synthetic */ IMService this$0;

    static {
        Covode.recordClassIndex(64897);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IMService$updateIMUser$1(IMService iMService, IMUser iMUser, AbstractC89124d dVar) {
        super(2, dVar);
        this.this$0 = iMService;
        this.$user = iMUser;
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
        C89219l.m154721d(dVar, "");
        return new IMService$updateIMUser$1(this.this$0, this.$user, dVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
        return ((IMService$updateIMUser$1) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
    public final Object invokeSuspend(Object obj) {
        UserStruct userStruct;
        if (this.label == 0) {
            C89382r.m154942a(obj);
            if (this.$user.getAvatarThumb() == null) {
                User user = null;
                try {
                    userStruct = C55257a.f126351a.queryUser(this.$user.getUid(), this.$user.getSecUid()).get();
                } catch (Exception e) {
                    C56244a.m102188a(e);
                    userStruct = null;
                }
                if (userStruct != null) {
                    user = userStruct.getUser();
                }
                if (user != null) {
                    User user2 = userStruct.getUser();
                    C89219l.m154716b(user2, "");
                    user2.setFollowStatus(this.$user.getFollowStatus());
                    IMUser fromUser = IMUser.fromUser(userStruct.getUser());
                    this.this$0.updateContactName(fromUser);
                    C55085g.m100752a(fromUser);
                }
            } else {
                this.this$0.updateContactName(this.$user);
                C55085g.m100752a(this.$user);
            }
            return C89391z.f203057a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
