package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33593ai;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41929h;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SearchKeywordChangeMethod */
public final class SearchKeywordChangeMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(51024);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public SearchKeywordChangeMethod() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchKeywordChangeMethod(C18288a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        NextLiveData<C33593ai> nextLiveData;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("enterFrom");
                String optString2 = jSONObject.optString("keyword");
                String optString3 = jSONObject.optString(StringSet.type);
                C67678d keyword = new C67678d().setSearchFrom(optString).setKeyword(optString2);
                C89219l.m154716b(keyword, "");
                AbstractC81915c.m141874a(new C41929h(keyword));
                SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
                if (!(searchTabViewModel == null || (nextLiveData = searchTabViewModel.tabInfo) == null)) {
                    if (optString3 == null) {
                        C89219l.m154715b();
                    }
                    nextLiveData.setValue(new C33593ai(optString3));
                }
            } catch (Exception e) {
                C42912b.m85668a(e, "SearchKeywordChangeMethod");
                if (aVar != null) {
                    aVar.mo79885a(0, e.getMessage());
                }
                e.printStackTrace();
                return;
            }
        }
        if (aVar != null) {
            aVar.mo79886a(new JSONArray());
        }
    }
}
