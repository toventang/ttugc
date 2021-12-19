package com.p2082ss.android.ugc.aweme.notification.p3521c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62339d;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62341f;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.c.d */
public final class C61921d implements AbstractC62329c {
    static {
        Covode.recordClassIndex(72670);
    }

    /* renamed from: a */
    private static boolean m112044a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final void mo100001a(C62339d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final boolean mo100002a(C62341f fVar) {
        String valueOf;
        String valueOf2;
        String str = "";
        C89219l.m154721d(fVar, str);
        if (fVar.f141475b == null) {
            return true;
        }
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112044a();
        }
        if (!C58029j.f132256h) {
            new C23144b(fVar.f141475b).mo37640e(R.string.dcq).mo37637b();
            return true;
        }
        int id = fVar.f141475b.getId();
        try {
            JSONObject jSONObject = new JSONObject(fVar.f141474a.f139893i);
            String optString = jSONObject.optString("content_schema");
            String optString2 = jSONObject.optString("schema");
            String optString3 = jSONObject.optString("web_url");
            if (id == R.id.dkg) {
                if (!C36125t.m73598a(C36125t.m73591a(), optString2)) {
                    Long l = fVar.f141474a.f139885a;
                    if (!(l == null || (valueOf2 = String.valueOf(l.longValue())) == null)) {
                        str = valueOf2;
                    }
                    m112045a(str, optString3);
                }
            } else if (!C36125t.m73598a(C36125t.m73591a(), optString)) {
                Long l2 = fVar.f141474a.f139885a;
                if (!(l2 == null || (valueOf = String.valueOf(l2.longValue())) == null)) {
                    str = valueOf;
                }
                if (!m112045a(str, optString3)) {
                    C36125t.m73598a(C36125t.m73591a(), optString2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m112045a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("notice_id", str);
        hashMap.put("aid", String.valueOf(C61530a.C61531a.f139672a));
        hashMap.put("channel", SchemaPageHelperImpl.m138975b().mo99361a());
        SchemaPageHelper b = SchemaPageHelperImpl.m138975b();
        Context a = C17867d.m33078a();
        String string = C17867d.m33078a().getString(R.string.ch_);
        if (string == null) {
            string = "";
        }
        C89219l.m154716b(string, "");
        return b.mo99363a(a, str2, string, hashMap);
    }
}
