package com.bytedance.android.livesdk.browser.jsbridge.p473d;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6107a;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg;
import com.bytedance.android.livesdk.browser.p468i.C7030b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.g */
public final class C7057g implements AbstractC18293d {

    /* renamed from: a */
    private WeakReference<Context> f17666a;

    /* renamed from: b */
    private WeakReference<C7124bg.AbstractC7125a> f17667b;

    static {
        Covode.recordClassIndex(7796);
    }

    public C7057g(WeakReference<Context> weakReference, C7124bg.AbstractC7125a aVar) {
        this.f17666a = weakReference;
        this.f17667b = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        C7030b c;
        JSONObject jSONObject2 = hVar.f43671d;
        if (jSONObject2 != null) {
            jSONObject2.optString("title");
            jSONObject2.optString("desc");
            jSONObject2.optString("image");
            jSONObject2.optString("url");
            String optString = jSONObject2.optString("platform");
            String optString2 = jSONObject2.optString(StringSet.type);
            WeakReference<Context> weakReference = this.f17666a;
            Context context = null;
            if (weakReference != null) {
                context = weakReference.get();
            }
            if (!C13627m.m24498a(optString) && context != null) {
                int i = 0;
                if ("live_room".equals(optString2)) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("url_extra");
                    HashMap hashMap = new HashMap();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object obj = optJSONObject.get(next);
                            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                                hashMap.put(next, String.valueOf(obj));
                            }
                        }
                    }
                    Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    if (room == null || room.getShareUrl() == null) {
                        jSONObject.put("code", 0);
                        return;
                    }
                    Uri.Builder buildUpon = Uri.parse(room.getShareUrl()).buildUpon();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
                    AbstractC6107a share = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
                    ActivityC0945e a = C11279p.m20001a(context);
                    C11666c.C11667a a2 = C11666c.m20576a(room);
                    a2.f27854a = optString;
                    a2.f27837A = hashMap;
                    a2.f27865l = buildUpon.toString();
                    share.mo11988a(a, a2.mo18437a());
                    jSONObject.put("code", 1);
                } else if ("open_platform".equals(optString2)) {
                    AbstractC6107a share2 = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
                    ActivityC0945e a3 = C11279p.m20001a(context);
                    C11666c.C11667a a4 = C11666c.m20575a();
                    a4.f27854a = optString;
                    a4.f27839C = true;
                    share2.mo11988a(a3, a4.mo18437a());
                    jSONObject.put("code", 1);
                } else {
                    if (!(this.f17667b.get() == null || (c = this.f17667b.get().mo13299c()) == null || c.f17631d == null)) {
                        Uri.Builder buildUpon2 = Uri.parse(c.f17631d).buildUpon();
                        buildUpon2.appendQueryParameter("share_ht_uid", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
                        AbstractC6107a share3 = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
                        ActivityC0945e a5 = C11279p.m20001a(context);
                        C11666c.C11667a a6 = C11666c.m20575a();
                        a6.f27854a = optString;
                        a6.f27866m = c.f17628a;
                        a6.f27867n = c.f17629b;
                        a6.f27868o = c.f17630c;
                        a6.f27865l = buildUpon2.toString();
                        share3.mo11988a(a5, a6.mo18437a());
                        i = 1;
                    }
                    jSONObject.put("code", i);
                }
            }
        }
    }
}
