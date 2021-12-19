package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.p775g.AbstractC12473a;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2435cb.C35420a;
import java.util.Iterator;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.r */
final /* synthetic */ class C58445r implements AbstractC12473a {

    /* renamed from: a */
    private final Context f133064a;

    static {
        Covode.recordClassIndex(68706);
    }

    C58445r(Context context) {
        this.f133064a = context;
    }

    @Override // com.bytedance.apm.p775g.AbstractC12473a
    /* renamed from: a */
    public final void mo20293a(String str, JSONObject jSONObject) {
        Context context = this.f133064a;
        if (C35420a.f83577a == null) {
            C35420a.f83577a = Boolean.valueOf(Keva.getRepo("optimize_config", 0).getBoolean("log_open", false));
        }
        if (C35420a.f83577a.booleanValue() && TextUtils.equals("page_load", str)) {
            StringBuilder sb = new StringBuilder();
            try {
                String string = jSONObject.getJSONObject("extra_status").getString("scene");
                sb.append("Activity: ").append(string.substring(string.lastIndexOf(46))).append("\n");
                JSONObject jSONObject2 = jSONObject.getJSONObject("extra_values");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    sb.append(next).append(": ").append(jSONObject2.getInt(next)).append("\n");
                }
                sb.deleteCharAt(sb.lastIndexOf("\n"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            C88391a.m153580a(C88392a.f200660a).mo142900a(new RunnableC58446s(context, sb));
        }
    }
}
