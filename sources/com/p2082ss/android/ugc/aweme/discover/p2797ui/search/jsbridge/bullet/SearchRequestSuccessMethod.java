package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.helper.C42040m;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41934m;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchRequestSuccessMethod */
public final class SearchRequestSuccessMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42947a f100150b = new C42947a((byte) 0);

    /* renamed from: c */
    private final String f100151c = "searchRequestSuccess";

    static {
        Covode.recordClassIndex(51073);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchRequestSuccessMethod$a */
    public static final class C42947a {
        static {
            Covode.recordClassIndex(51074);
        }

        private C42947a() {
        }

        public /* synthetic */ C42947a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100151c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRequestSuccessMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Long l;
        String str;
        String str2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            C27917g gVar = new C27917g();
            gVar.f65564d = true;
            gVar.f65566f = true;
            C27910f b = gVar.mo46682b();
            GlobalDoodleConfig globalDoodleConfig = (GlobalDoodleConfig) b.mo46670a(jSONObject.getString("global_doodle_config"), GlobalDoodleConfig.class);
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            String str3 = null;
            if (optJSONObject != null) {
                l = Long.valueOf(optJSONObject.optLong("now"));
                optJSONObject.optString("logid");
                optJSONObject.optJSONArray("fatal_item_ids");
                optJSONObject.optString("search_request_id");
            } else {
                l = null;
            }
            LogPbBean logPbBean = (LogPbBean) b.mo46670a(jSONObject.getString("log_pb"), LogPbBean.class);
            AbstractC81915c.m141874a(new C41934m(globalDoodleConfig, logPbBean));
            if (!jSONObject.optBoolean("is_load_more")) {
                C42047s a = C42047s.C42048a.m84150a();
                if (globalDoodleConfig != null) {
                    str = globalDoodleConfig.getRequestKeyword();
                } else {
                    str = null;
                }
                C89219l.m154716b(logPbBean, "");
                String imprId = logPbBean.getImprId();
                if (globalDoodleConfig != null) {
                    str2 = globalDoodleConfig.getSearchChannel();
                    str3 = globalDoodleConfig.getNewSource();
                } else {
                    str2 = null;
                }
                a.mo71203a(new C42040m(str, imprId, str2, str3, l));
            }
            aVar.mo61872a(new JSONArray());
        } catch (Exception e) {
            aVar.mo61871a(0, e.getMessage());
        }
    }
}
