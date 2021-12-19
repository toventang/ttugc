package com.p2082ss.android.ugc.aweme.bridge;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.OpenInviteHalfDialogMethod */
public final class OpenInviteHalfDialogMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82382b = "openInviteHalfDialog";

    static {
        Covode.recordClassIndex(41934);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82382b;
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.OpenInviteHalfDialogMethod$a */
    static final class C34921a extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82383a;

        static {
            Covode.recordClassIndex(41935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34921a(AbstractC16183k.AbstractC16185b bVar) {
            super(1);
            this.f82383a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends IMUser> list) {
            C89219l.m154721d(list, "");
            C34927a.m71314a(this.f82383a, (JSONObject) null);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenInviteHalfDialogMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        Activity a;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        try {
            AbstractC17045g f = mo26894f();
            if (f == null || (a = f.mo26816a()) == null) {
                C34927a.m71313a(bVar, (Throwable) null);
                return;
            }
            long optLong = jSONObject.optLong("question_id");
            String optString = jSONObject.optString("enter_method");
            if (optLong == 0) {
                C34927a.m71313a(bVar, (Throwable) null);
                return;
            }
            IQAInvitationService b = QAInvitationService.m117786b();
            C89219l.m154716b(optString, "");
            EnumC65848e eVar = EnumC65848e.VIDEO;
            Long valueOf = Long.valueOf(optLong);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            C89219l.m154716b(curUserId, "");
            IQAInvitationService.C65856a.m117785a(b, a, optString, "eoy_hub", eVar, valueOf, Long.valueOf(Long.parseLong(curUserId)), new C34921a(bVar), 64);
        } catch (Throwable th) {
            C34927a.m71313a(bVar, th);
        }
    }
}
