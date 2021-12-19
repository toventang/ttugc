package com.p2082ss.android.ugc.aweme.notice.repo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.p3516b.C61617a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager */
public final class TutorialVideoApiManager {

    /* renamed from: a */
    public static final TutorialVideoApi f139816a;

    /* renamed from: b */
    public static final C61614a f139817b = new C61614a((byte) 0);

    /* renamed from: c */
    private static final String f139818c;

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager$TutorialVideoApi */
    public interface TutorialVideoApi {
        static {
            Covode.recordClassIndex(72305);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/inbox/top/message/")
        C1731i<TutorialVideoResp> getTutorialVideoAndPoint(@AbstractC89736t(mo144292a = "msg_id") String str, @AbstractC89736t(mo144292a = "first_show_time") long j, @AbstractC89736t(mo144292a = "current_show_time") long j2, @AbstractC89736t(mo144292a = "clicked") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager$a */
    public static final class C61614a {
        static {
            Covode.recordClassIndex(72306);
        }

        private C61614a() {
        }

        public /* synthetic */ C61614a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C1731i<TutorialVideoResp> m111625a(String str, long j, long j2, int i) {
            C89219l.m154721d(str, "");
            return TutorialVideoApiManager.f139816a.getTutorialVideoAndPoint(str, j, j2, i);
        }
    }

    static {
        Covode.recordClassIndex(72304);
        String str = C61617a.C61618a.f139828c;
        f139818c = str;
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(TutorialVideoApi.class);
        C89219l.m154716b(create, "");
        f139816a = (TutorialVideoApi) create;
    }
}
