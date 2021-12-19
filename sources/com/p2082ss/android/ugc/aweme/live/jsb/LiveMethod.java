package com.p2082ss.android.ugc.aweme.live.jsb;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.jsb.LiveMethod */
public final class LiveMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    private final WeakReference<Context> f133553a;

    static {
        Covode.recordClassIndex(68948);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveMethod(WeakReference<Context> weakReference, C18288a aVar) {
        super(aVar);
        C89219l.m154721d(weakReference, "");
        this.f133553a = weakReference;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("room_id_list");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(Long.valueOf(Long.parseLong(jSONArray.get(i).toString())));
                }
                String string = jSONObject.getString("current_room_id");
                C89219l.m154716b(string, "");
                long parseLong = Long.parseLong(string);
                String string2 = jSONObject.getString("enter_from");
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f28233c.f28301R = parseLong;
                enterRoomConfig.f28233c.f28293J = string2;
                enterRoomConfig.f28233c.f28291H = C89070n.m154582f((Collection<Long>) arrayList);
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                s.mo95835i().mo105587a(this.f133553a.get(), enterRoomConfig);
                if (aVar != null) {
                    aVar.mo79886a((Object) null);
                }
            } catch (Exception e) {
                if (aVar != null) {
                    aVar.mo79885a(-1, e.getMessage());
                }
                e.printStackTrace();
            }
        }
    }
}
