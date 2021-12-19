package com.p2082ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34506c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.main.AbstractC59040ay;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p2082ss.android.ugc.aweme.p2430by.C35330a;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.NoticeCountCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67132c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.h */
public final class C67168h extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150587a;

    static {
        Covode.recordClassIndex(78771);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150587a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return "/aweme/v1/notice/count/";
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67132c());
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final Map<String, String> mo106077a(Context context) {
        AbstractC59040ay ayVar;
        C89219l.m154721d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("source", "1");
        C89219l.m154716b(C35330a.m72309a(), "");
        boolean z = false;
        z = false;
        int a = C16048b.m29633a().mo25412a(true, "second_tab_last_status", 0);
        if (a == 0) {
            z = true;
        } else if (!(a == 1 || (ayVar = (AbstractC59040ay) C34506c.m70491a(C17867d.m33078a(), AbstractC59040ay.class)) == null)) {
            z = ayVar.mo60979d();
        }
        hashMap.put("second_tab_type", String.valueOf(!z ? 1 : 0));
        hashMap.put("follow_tab_position", "1");
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        NoticeCountCombineModel noticeCountCombineModel;
        NoticeList noticeList;
        boolean z;
        boolean z2;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            noticeCountCombineModel = null;
        } else {
            noticeCountCombineModel = data.getNoticeCountModel();
        }
        if (!(noticeCountCombineModel == null || (noticeList = noticeCountCombineModel.getNoticeList()) == null || noticeList.status_code != 0)) {
            this.f150587a = noticeCountCombineModel;
            if (noticeCountCombineModel.httpCode == 200) {
                z = C13603b.m24435a((Collection) noticeCountCombineModel.getNoticeList().getItems());
                Message obtain = Message.obtain();
                obtain.obj = noticeCountCombineModel.getNoticeList();
                obtain.what = 0;
                C89219l.m154716b(obtain, "");
                C89219l.m154721d(obtain, "");
                C61542b.m111459a().mo99301a(obtain);
                z2 = true;
            } else {
                z = true;
                z2 = false;
            }
            C39162r.m79460a("homepage_follow_monitor", new C33744d().mo59983a("error_type", "combine_yellow_dot").mo59982a("is_success", Boolean.valueOf(z2)).mo59982a("is_empty", Boolean.valueOf(z)).f79943a);
            if (noticeCountCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
