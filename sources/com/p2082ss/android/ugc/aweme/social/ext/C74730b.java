package com.p2082ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39145n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.friends.model.LocalContact;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.service.IContactService;
import com.p2082ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74775a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.social.ext.b */
public final class C74730b {
    static {
        Covode.recordClassIndex(87569);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.ext.b$a */
    public static final class RunnableC74731a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC39145n f167969a;

        /* renamed from: b */
        final /* synthetic */ String f167970b;

        /* renamed from: c */
        final /* synthetic */ String f167971c;

        static {
            Covode.recordClassIndex(87570);
        }

        RunnableC74731a(AbstractC39145n nVar, String str, String str2) {
            this.f167969a = nVar;
            this.f167970b = str;
            this.f167971c = str2;
        }

        public final void run() {
            if (this.f167970b != null && C51648a.f118980a.mo87322d().mo86984c()) {
                C39162r.m79460a("rec_user_video_pref", C89041ag.m154421a(C89387v.m154943a("cache_ready", C74775a.m131281a(this.f167969a.mo67908a())), C89387v.m154943a("group_id", this.f167970b)));
            }
        }
    }

    /* renamed from: a */
    static final C89378p<String, String> m131191a(ExternalRecommendReasonStruct externalRecommendReasonStruct, String str) {
        String formatReason;
        LocalContact a;
        String str2;
        C89378p<String, String> a2;
        if (externalRecommendReasonStruct == null || !externalRecommendReasonStruct.isValid() || (formatReason = externalRecommendReasonStruct.getFormatReason()) == null) {
            return null;
        }
        if (!C89361p.m154908a((CharSequence) formatReason, (CharSequence) "%s", false)) {
            return C89387v.m154943a(formatReason, "");
        }
        String hashedPhoneNumber = externalRecommendReasonStruct.getHashedPhoneNumber();
        if (!(hashedPhoneNumber == null || hashedPhoneNumber.length() == 0)) {
            AbstractC39145n a3 = ((IContactService) ServiceManager.get().getService(IContactService.class)).mo87291a();
            C39162r.m79452a().execute(new RunnableC74731a(a3, str, formatReason));
            if (!(!a3.mo67908a() || (a = a3.mo67907a(hashedPhoneNumber)) == null || (str2 = a.contactName) == null || str2.length() == 0 || (a2 = C89387v.m154943a(formatReason, str2)) == null)) {
                return a2;
            }
        }
        String externalUsername = externalRecommendReasonStruct.getExternalUsername();
        if (externalUsername == null || externalUsername.length() == 0) {
            return null;
        }
        return C89387v.m154943a(formatReason, externalUsername);
    }
}
