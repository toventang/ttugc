package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.sdk.webview.p2175a.C30242g;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.web.C81543e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.e */
public class C81604e extends C30242g implements AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public C18288a f182485b;

    /* renamed from: c */
    public String f182486c;

    /* renamed from: d */
    private JSONObject f182487d;

    static {
        Covode.recordClassIndex(95001);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(62, new RunnableC90250g(C81604e.class, "onEvent", C81543e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @AbstractC90264r
    public void onEvent(C81543e eVar) {
        String str = eVar.f182352a;
        JSONObject jSONObject = eVar.f182353b;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.type, str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C18288a aVar = this.f182485b;
        if (aVar != null) {
            aVar.mo29252b("H5_nativeEvent", jSONObject2);
        }
        EventBus.m156962a().mo145395b(this);
        this.f182487d = null;
    }

    public C81604e(WeakReference<Context> weakReference, C18288a aVar) {
        super(weakReference);
        this.f182485b = aVar;
    }

    @Override // com.p2082ss.android.sdk.webview.p2175a.C30242g, com.bytedance.ies.web.p1285a.AbstractC18293d
    public void call(final C18297h hVar, final JSONObject jSONObject) {
        final JSONObject jSONObject2;
        String string = hVar.f43671d.getString(StringSet.type);
        hVar.f43670c = "open";
        hVar.f43671d.put(StringSet.type, string);
        this.f182486c = hVar.f43669b;
        this.f182487d = jSONObject;
        if (!hVar.f43671d.has("args") || (jSONObject2 = hVar.f43671d.getJSONObject("args")) == null) {
            jSONObject2 = new JSONObject();
            hVar.f43671d.put("args", jSONObject2);
        }
        if ("item".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("item_id"));
        } else if ("profile".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("user_id"));
        } else if ("challenge".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("challenge_id"));
        } else if ("music".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("music_id"));
        } else if ("collection".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("collection_id"));
        } else if ("live".equals(string)) {
            hVar.f43676i = false;
            C29339a.m58752a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.web.jsbridge.C81604e.RunnableC816051 */

                static {
                    Covode.recordClassIndex(95002);
                }

                public final void run() {
                    int i;
                    int i2;
                    final int i3 = 63;
                    final int i4 = 0;
                    try {
                        String string = jSONObject2.getString("user_id");
                        String optString = jSONObject2.optString("sec_user_id");
                        C63419ae aeVar = C63419ae.f143971a;
                        User queryUser = aeVar.queryUser(aeVar.userUrl(optString, string, null, 0), false, null);
                        if (queryUser.roomId == 0) {
                            i = 0;
                            i2 = 47;
                        } else {
                            i = 1;
                            i2 = 31;
                        }
                        jSONObject2.put("room_id", String.valueOf(queryUser.roomId));
                        i4 = i;
                        i3 = i2;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    C29339a.m58754b(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.web.jsbridge.C81604e.RunnableC816051.RunnableC816061 */

                        static {
                            Covode.recordClassIndex(95003);
                        }

                        public final void run() {
                            if (i3 != 47) {
                                C81604e.this.mo53694a(hVar.f43671d);
                            }
                            try {
                                jSONObject.put("code", i4);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            C81604e.this.f182485b.mo29249a(C81604e.this.f182486c, jSONObject2);
                        }
                    });
                }
            });
            return;
        } else if ("login".equals(string)) {
            String optString = jSONObject2.optString("enter_from");
            if (!C31575b.m65865g().isLogin() && this.f72158a != null) {
                Activity a = m61207a((Context) this.f72158a.get());
                EventBus.m156966a(EventBus.m156962a(), this);
                try {
                    C58957c.m108318a(a, optString, "");
                    return;
                } catch (Throwable unused) {
                    EventBus.m156962a().mo145395b(this);
                    return;
                }
            } else {
                return;
            }
        } else if ("webview".equals(string)) {
            try {
                if (TextUtils.equals("1", Uri.parse(hVar.f43671d.getJSONObject("args").getString("url")).getQueryParameter("live_half_charge_dialog"))) {
                    C18288a aVar = this.f182485b;
                    if (aVar != null) {
                        aVar.mo29249a(this.f182486c, jSONObject);
                        return;
                    }
                    return;
                }
            } catch (Exception unused2) {
            }
        }
        EventBus.m156966a(EventBus.m156962a(), this);
        jSONObject2.put("group", "0");
        mo53694a(hVar.f43671d);
        jSONObject.put("code", 1);
    }
}
