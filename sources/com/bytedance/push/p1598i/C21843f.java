package com.bytedance.push.p1598i;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.bytedance.push.p1590c.AbstractC21778i;
import com.bytedance.push.p1593f.C21799a;
import com.bytedance.push.third.C21922f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.pushmanager.setting.C30221b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.i.f */
public final class C21843f {

    /* renamed from: a */
    private final AbstractC21778i f51747a;

    /* renamed from: b */
    private volatile boolean f51748b;

    /* renamed from: c */
    private volatile AtomicBoolean f51749c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(25495);
    }

    public C21843f(AbstractC21778i iVar) {
        this.f51747a = iVar;
    }

    /* renamed from: a */
    private void m40919a(Context context) {
        if (this.f51749c.compareAndSet(false, true)) {
            C30221b.m61148b();
            m40921a(context, C30221b.m61150d(), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35519a(boolean r17) {
        /*
        // Method dump skipped, instructions count: 510
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p1598i.C21843f.mo35519a(boolean):void");
    }

    /* renamed from: a */
    private static void m40918a(Application application, JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("id");
                    String optString2 = jSONObject.optString(StringSet.name);
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            arrayList.add(new C21799a(jSONObject));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            C21798f.f51646a.mo35449f().mo35432a(application, arrayList);
        }
    }

    /* renamed from: a */
    private void m40920a(Context context, int i, String str) {
        C21798f.m40816d().mo35423a(i, str);
        m40919a(context);
    }

    /* renamed from: a */
    private void m40921a(Context context, String str, boolean z) {
        boolean b = C21922f.m41214a(context).mo35676b(str);
        boolean z2 = false;
        if (z) {
            if (!b) {
                C30221b.m61148b();
                str = C30221b.m61150d();
                if (!C21922f.m41214a(context).mo35676b(str)) {
                    C21798f.m40816d().mo35424a(false, str);
                    return;
                }
            } else {
                z2 = true;
            }
        }
        C21922f.m41189a(str, z2);
        C21798f.m40816d().mo35424a(this.f51747a.mo35440a(context), str);
    }
}
