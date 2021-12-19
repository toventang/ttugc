package com.bytedance.ies.p1208im.core.p1225f;

import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.ies.p1208im.core.p1222c.C17499e;
import com.bytedance.ies.p1208im.core.p1224e.C17535m;
import com.bytedance.p1399im.core.p1407c.AbstractC19507b;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.f.e */
public final class C17568e implements AbstractC19507b {

    /* renamed from: a */
    public static final C17568e f42022a = new C17568e();

    private C17568e() {
    }

    static {
        Covode.recordClassIndex(20057);
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: a */
    public final void mo27983a(JSONObject jSONObject) {
        C17415a.m32255b().mo27835a(jSONObject);
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: a */
    public final void mo27979a(Object obj) {
        if (((Boolean) C17499e.f41887b.getValue()).booleanValue()) {
            try {
                String b = C80342dg.m139300a().mo46674b(obj);
                while (true) {
                    if (b == null) {
                        C89219l.m154715b();
                    }
                    if (b.length() > 2000) {
                        AbstractC17449b b2 = C17415a.m32255b();
                        String substring = b.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                        C89219l.m154716b(substring, "");
                        b2.mo27836b("imsdk2", substring);
                        b = b.substring(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                        C89219l.m154716b(b, "");
                    } else {
                        C17415a.m32255b().mo27836b("imsdk2", b);
                        return;
                    }
                }
            } catch (Exception e) {
                C17415a.m32255b().mo27834a(e);
            }
        }
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: a */
    public final void mo27982a(Throwable th) {
        String str;
        if ((th instanceof SQLiteDatabaseLockedException) || (th instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException) || (th instanceof SQLiteTableLockedException) || (th instanceof com.tencent.wcdb.database.SQLiteTableLockedException)) {
            C17415a.m32255b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C17415a.m32254a().mo27856l()) {
                str = "1";
            } else {
                str = "0";
            }
            linkedHashMap.put("is_main_proc", str);
            C17415a.m32255b().mo27831a("im_db_lock", linkedHashMap);
        }
        C17415a.m32254a();
        if (C17415a.m32254a().mo27851g()) {
            C17415a.m32255b();
        }
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: a */
    public final void mo27981a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C17415a.m32255b().mo27833a(str, jSONObject, (JSONObject) null);
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: b */
    public final void mo27984b(String str, JSONObject jSONObject) {
        if (str != null && str.length() != 0) {
            C17535m.m32505a(str, jSONObject);
            C17415a.m32255b().mo27837b(str, jSONObject);
        }
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: c */
    public final void mo27985c(String str, JSONObject jSONObject) {
        if (str != null && str.length() != 0) {
            C17415a.m32255b().mo27839c(str, jSONObject);
        }
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: d */
    public final void mo27986d(String str, JSONObject jSONObject) {
        if (str != null && str.length() != 0) {
            C17415a.m32255b().mo27832a(str, jSONObject);
        }
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19507b
    /* renamed from: a */
    public final void mo27980a(String str, String str2, Map<String, Object> map) {
        C89219l.m154721d(str, "");
        AbstractC17449b b = C17415a.m32255b();
        if (str2 == null) {
            str2 = "";
        }
        b.mo27829a(str, str2, map);
    }
}
