package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.sdk.webview.C30246d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.p2082ss.android.ugc.aweme.bullet.p2415c.C35130a;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60794c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33118a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.profile.C63504c;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.BroadcastMethod */
public class BroadcastMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56450);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public BroadcastMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        try {
            m90846a(C30246d.m61213a((Context) this.mContextRef.get()), jSONObject, this.mJsBridge, null);
            aVar.mo79886a("");
        } catch (JSONException e) {
            aVar.mo79885a(-1, "");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m90846a(Context context, JSONObject jSONObject, C18288a aVar, AbstractC16208i iVar) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        AbstractC81915c.m141874a(new C47959j("notification", jSONObject));
        AbstractC81915c.m141874a(new C33118a("notification", jSONObject));
        AbstractC81915c.m141874a(new C35130a("notification", jSONObject));
        C31575b.m65866h().notifyFromRnAndH5(jSONObject);
        C67446h.f151111a.mo106205a(jSONObject);
        if (TextUtils.equals(jSONObject.getString("eventName"), "activity_view")) {
            C63504c.m115069a().mo102135a(jSONObject.getJSONObject("data"));
            C63504c.m115069a().mo102136a(false);
            C63504c.m115069a().mo102138b(false);
            C63504c.m115069a().mo102143f();
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "music_feedback_send_success")) {
            AbstractC81915c.m141874a(new C60794c());
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "anchor_TCM_content") && (optJSONObject2 = jSONObject.optJSONObject("data")) != null) {
            if (C77763a.m135856a()) {
                C77728a.m135799a(optJSONObject2.optString("campaignInfo"));
            } else {
                C77731c.m135805a(optJSONObject2.optString("campaignInfo"));
            }
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "branded_content_type") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            if (C77763a.m135856a()) {
                C77728a.m135801b(optJSONObject.optString("branded_content_type"));
            } else {
                C77731c.m135807b(optJSONObject.optString("branded_content_type"));
            }
            if (TextUtils.equals(optJSONObject.optString("branded_content_type"), "0")) {
                C77728a.m135798a((TagBAUser) null);
            }
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "bc_on_creator_tag_BA")) {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
            if (optJSONObject3 != null) {
                try {
                    C77728a.m135798a((TagBAUser) new C27910f().mo46671a(optJSONObject3.toString(), new C27895a<TagBAUser>() {
                        /* class com.p2082ss.android.ugc.aweme.p2929fe.method.BroadcastMethod.C478181 */

                        static {
                            Covode.recordClassIndex(56451);
                        }
                    }.type));
                } catch (Exception unused) {
                }
            }
            C77728a.m135798a((TagBAUser) null);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "bc_pop_music_alert")) {
            TcmServiceImpl.m135859j().mo121250a(context, aVar, iVar);
        }
        BroadcastMethod.C35004a.m71558a(jSONObject);
        if (TextUtils.equals(jSONObject.getString("eventName"), "userBlockSuccess")) {
            IMService.createIIMServicebyMonsterPlugin(false).onBlockUserSuccessEvent();
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "_dou_ad_create_tcm_order")) {
            User curUser = C31575b.m65865g().getCurUser();
            ProfileServiceImpl.m114884g().queryUser(ProfileServiceImpl.m114884g().userUrl(curUser.getSecUid(), curUser.getUid(), curUser.getUniqueId(), 0), true, "");
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "live-link-pin") || TextUtils.equals(jSONObject.getString("eventName"), "live-link-card")) {
            CommercializeLiveServiceImpl.m77282a().mo66427a(jSONObject);
        }
    }
}
