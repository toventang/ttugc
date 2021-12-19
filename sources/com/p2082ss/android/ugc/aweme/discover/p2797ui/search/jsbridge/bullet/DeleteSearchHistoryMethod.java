package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.DeleteSearchHistoryMethod */
public final class DeleteSearchHistoryMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f100073b = "deleteSearchHistory";

    static {
        Covode.recordClassIndex(51029);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100073b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteSearchHistoryMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    private static JSONObject m85674a(ISearchHistoryManager iSearchHistoryManager) {
        C89219l.m154721d(iSearchHistoryManager, "");
        ArrayList<SearchHistory> arrayList = new ArrayList();
        List<SearchHistory> searchHistory = iSearchHistoryManager.getSearchHistory();
        C89219l.m154716b(searchHistory, "");
        arrayList.addAll(searchHistory);
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory2 : arrayList) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("word", searchHistory2.keyword);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("history_list", jSONArray);
        return jSONObject2;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            String string = jSONObject.getString(StringSet.type);
            ISearchHistoryManager inst = SearchHistoryManager.inst(jSONObject.optString("enterFrom"));
            if (C89219l.m154714a((Object) string, (Object) "0")) {
                inst.clearSearchHistory();
                C89219l.m154716b(inst, "");
                aVar.mo61872a((Object) m85674a(inst));
            } else if (C89219l.m154714a((Object) string, (Object) "1")) {
                inst.deleteSearchHistory(new SearchHistory(jSONObject.getString("keyword"), 0));
                C89219l.m154716b(inst, "");
                aVar.mo61872a((Object) m85674a(inst));
            }
        } catch (Exception e) {
            C42912b.m85668a(e, "DeleteSearchHistoryMethod");
            aVar.mo61871a(-1, e.getMessage());
            e.printStackTrace();
        }
    }
}
