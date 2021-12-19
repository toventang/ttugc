package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.search.C67446h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.ui.aj */
public final /* synthetic */ class C41358aj implements AwemeChangeCallBack.AbstractC59111a {

    /* renamed from: a */
    private final C41426z f96522a;

    static {
        Covode.recordClassIndex(49253);
    }

    C41358aj(C41426z zVar) {
        this.f96522a = zVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
    /* renamed from: a */
    public final void mo37101a(Aweme aweme) {
        C41426z zVar = this.f96522a;
        ArrayMap arrayMap = new ArrayMap(4);
        if (zVar.f96635j != null) {
            arrayMap.put("enter_from", zVar.f96635j.getEventType());
            if (!TextUtils.isEmpty(zVar.f96635j.getTrendingEventId())) {
                arrayMap.put("isTrending", "ture");
            }
            String tabName = zVar.f96635j.getTabName();
            if (!TextUtils.isEmpty(tabName)) {
                arrayMap.put("tab_name", tabName);
            }
        }
        if (aweme != null) {
            C67446h.f151111a.mo106198a(zVar, aweme.getAid(), arrayMap);
        }
    }
}
