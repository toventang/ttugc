package com.p2082ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16083j;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46872eb;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.UnifiedSettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67136e;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.l */
public final class C67172l extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150592a;

    static {
        Covode.recordClassIndex(78775);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        return "/service/settings/v3/";
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150592a;
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.l$a */
    static final class RunnableC67173a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnifiedSettingCombineModel f150593a;

        static {
            Covode.recordClassIndex(78776);
        }

        RunnableC67173a(UnifiedSettingCombineModel unifiedSettingCombineModel) {
            this.f150593a = unifiedSettingCombineModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.l$a$a */
        static final class CallableC67174a<V> implements Callable {

            /* renamed from: a */
            public static final CallableC67174a f150594a = new CallableC67174a();

            static {
                Covode.recordClassIndex(78777);
            }

            CallableC67174a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                if (C46872eb.f109217a) {
                    C80446fr.m139460c(3000);
                }
                AbTestManagerImpl.m104980b().mo95590a(true);
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
            if (r6 != null) goto L_0x008f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 343
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.request_combine.request.C67172l.RunnableC67173a.run():void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        UnifiedSettingCombineModel unifiedSettingCombineModel;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            unifiedSettingCombineModel = null;
        } else {
            unifiedSettingCombineModel = data.getUnifiedSetting();
        }
        this.f150592a = unifiedSettingCombineModel;
        if (unifiedSettingCombineModel == null) {
            return false;
        }
        if (unifiedSettingCombineModel.httpCode == 200) {
            C88925a.m154180b(C88946a.f201991c).mo142900a(new RunnableC67173a(unifiedSettingCombineModel));
        }
        if (unifiedSettingCombineModel.httpCode == 200) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67136e());
        C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = true, is_v3 = " + C16083j.m29874a().mo25538c() + ", is_v3_api = true");
        C39162r.m79460a("config_fetch_success", new C33744d().mo59983a("status", "0").mo59983a("source", "0").mo59983a("is_combine", "1").f79943a);
    }
}
