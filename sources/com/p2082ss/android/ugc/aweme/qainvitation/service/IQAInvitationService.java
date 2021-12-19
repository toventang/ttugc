package com.p2082ss.android.ugc.aweme.qainvitation.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65849f;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService */
public interface IQAInvitationService {
    static {
        Covode.recordClassIndex(77357);
    }

    /* renamed from: a */
    C65849f mo105000a();

    /* renamed from: a */
    List<IMUser> mo105001a(List<? extends User> list);

    /* renamed from: a */
    void mo105002a(Activity activity, String str, String str2, long j, long j2, List<? extends User> list);

    /* renamed from: a */
    void mo105003a(Activity activity, String str, String str2, EnumC65848e eVar, Long l, Long l2, List<? extends IMUser> list, AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar);

    /* renamed from: a */
    void mo105004a(Activity activity, String str, String str2, Long l, Long l2, List<? extends User> list, Boolean bool);

    /* renamed from: b */
    List<User> mo105005b(List<? extends IMUser> list);

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService$a */
    public static final class C65856a {
        static {
            Covode.recordClassIndex(77358);
        }

        /* renamed from: a */
        public static /* synthetic */ void m117785a(IQAInvitationService iQAInvitationService, Activity activity, String str, String str2, EnumC65848e eVar, Long l, Long l2, AbstractC89172b bVar, int i) {
            Long l3 = l;
            Long l4 = l2;
            AbstractC89172b bVar2 = null;
            if ((i & 16) != 0) {
                l3 = null;
            }
            if ((i & 32) != 0) {
                l4 = null;
            }
            if ((i & 128) == 0) {
                bVar2 = bVar;
            }
            iQAInvitationService.mo105003a(activity, str, str2, eVar, l3, l4, null, bVar2);
        }
    }
}
