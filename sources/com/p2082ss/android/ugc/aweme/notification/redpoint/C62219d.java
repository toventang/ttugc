package com.p2082ss.android.ugc.aweme.notification.redpoint;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.Collection;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.d */
public final /* synthetic */ class C62219d implements AbstractC1729g {

    /* renamed from: a */
    private final C62218c f141234a;

    /* renamed from: b */
    private final String f141235b;

    static {
        Covode.recordClassIndex(72986);
    }

    C62219d(C62218c cVar, String str) {
        this.f141234a = cVar;
        this.f141235b = str;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C62220e eVar;
        C62218c cVar = this.f141234a;
        String str = this.f141235b;
        if (iVar == null || !iVar.mo5535a() || (eVar = (C62220e) iVar.mo5545d()) == null || C13603b.m24435a((Collection) eVar.f141236a)) {
            return null;
        }
        cVar.f141233a.clear();
        for (NoticeList noticeList : eVar.f141236a) {
            int i = 0;
            for (NoticeCount noticeCount : noticeList.getItems()) {
                int group = noticeCount.getGroup();
                if (!C56297a.m102302d() && (group == 3 || group == 7 || group == 6 || group == 2 || group == 228)) {
                    i += noticeCount.getCount();
                }
            }
            cVar.f141233a.put(noticeList.getUserId(), Integer.valueOf(i));
            if (str.equals("cold_start") && TextUtils.equals(C31575b.m65865g().getCurUserId(), noticeList.getUserId().toString())) {
                C62211a.f141224b.mo100225a(noticeList);
            }
        }
        return null;
    }
}
