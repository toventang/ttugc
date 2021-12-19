package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33593ai;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.activity.C41571b;
import com.p2082ss.android.ugc.aweme.discover.activity.SearchLiveListActivity;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p2082ss.android.ugc.aweme.p2226a.C31292a;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenLiveMoreMethod */
public final class OpenLiveMoreMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42931a f100106b = new C42931a((byte) 0);

    /* renamed from: c */
    private final String f100107c = "open_live_more";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f100108d = AbstractC16183k.EnumC16184a.PRIVATE;

    /* renamed from: e */
    private String f100109e = "";

    static {
        Covode.recordClassIndex(51049);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenLiveMoreMethod$a */
    public static final class C42931a {
        static {
            Covode.recordClassIndex(51050);
        }

        private C42931a() {
        }

        public /* synthetic */ C42931a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f100108d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100107c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f100108d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenLiveMoreMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        String str;
        NextLiveData<C33593ai> nextLiveData;
        JSONArray optJSONArray;
        int length;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject.has("react_id")) {
            this.f100109e = jSONObject.optString("react_id");
            try {
                String optString = jSONObject.optString("enter_from");
                String optString2 = jSONObject.optString("search_keyword");
                if (!jSONObject.has("item_ids") || (length = (optJSONArray = jSONObject.optJSONArray("item_ids")).length()) <= 0) {
                    str = "";
                } else {
                    C89269g a = C89271h.m154766a(0, length);
                    ArrayList arrayList = new ArrayList(C89070n.m154526a(a, 10));
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(optJSONArray.get(((AbstractC89040af) it).mo143429a()));
                    }
                    str = C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
                }
                if (!C31292a.m65465a()) {
                    Context context = GlobalContext.getContext();
                    C89219l.m154716b(context, "");
                    C41571b bVar = new C41571b();
                    bVar.setSearchKeyword(optString2);
                    bVar.setEnterFrom(optString);
                    bVar.setSearchId("searchId");
                    bVar.setSearchType("general");
                    bVar.setRoomIdList(str);
                    bVar.setEnterMethod("click_more_general_list");
                    SearchLiveListActivity.C41564a.m83502a(context, bVar, C67446h.f151111a.mo106216e());
                } else {
                    SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
                    if (!(searchTabViewModel == null || (nextLiveData = searchTabViewModel.tabInfo) == null)) {
                        nextLiveData.setValue(new C33593ai(EnumC67453i.LIVE.getTabName()));
                    }
                }
            } catch (Exception e) {
                aVar.mo61871a(0, e.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo61874a(jSONObject2);
    }
}
