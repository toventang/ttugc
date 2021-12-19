package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.mob.AbstractC42448c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenPlaylistMethod */
public final class OpenPlaylistMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42932a f100110b = new C42932a((byte) 0);

    /* renamed from: c */
    private final String f100111c = "open_playlist";

    static {
        Covode.recordClassIndex(51051);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenPlaylistMethod$a */
    public static final class C42932a {
        static {
            Covode.recordClassIndex(51052);
        }

        private C42932a() {
        }

        public /* synthetic */ C42932a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100111c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenPlaylistMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            String optString = jSONObject.optString("mix_id");
            String optString2 = jSONObject.optString("uid");
            String optString3 = jSONObject.optString("secUid");
            boolean optBoolean = jSONObject.optBoolean("needShowDialog");
            String optString4 = jSONObject.optString("enter_groupId");
            JSONObject optJSONObject = jSONObject.optJSONObject("log_extra");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            String optString5 = optJSONObject.optString("search_id");
            int optInt = optJSONObject.optInt("is_from_video");
            String optString6 = optJSONObject.optString("enter_from");
            optJSONObject.optString("list_item_id");
            optJSONObject.optString("search_result_id");
            String a = AbstractC42448c.AbstractC42450b.C42451a.m84856a(3);
            Activity j = C17873f.m33102j();
            if (j != null) {
                IMixFeedService k = MixFeedService.m109435k();
                C89219l.m154716b(optString, "");
                k.mo97315a(j, optString4, (Aweme) null, "from_profile_mix_list", optString, optString2, optString3, optBoolean, new C59538b(optString5, Integer.valueOf(optInt), a, 0, 8, null), optString6);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C89219l.m154716b(next, "");
                String string = optJSONObject.getString(next);
                C89219l.m154716b(string, "");
                linkedHashMap.put(next, string);
            }
            C67690d.C67691a.m119848a(linkedHashMap);
            aVar.mo61872a(new JSONArray());
        } catch (Exception e) {
            aVar.mo61871a(0, e.getMessage());
            e.printStackTrace();
        }
    }
}
