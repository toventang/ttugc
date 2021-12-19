package com.bytedance.p802b.p824f.p825a;

import com.bytedance.apm.p789q.C12592m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p819d.C13026a;
import com.bytedance.p802b.p819d.p820a.AbstractC13029b;
import com.bytedance.p802b.p819d.p820a.C13028a;
import com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b;
import com.bytedance.p802b.p824f.p825a.p826a.C13065a;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a.c */
public final class C13072c implements AbstractC13029b {

    /* renamed from: a */
    C13028a f31872a;

    static {
        Covode.recordClassIndex(14908);
    }

    @Override // com.bytedance.p802b.p819d.p820a.AbstractC13029b
    /* renamed from: a */
    public final C13028a mo20888a() {
        return this.f31872a;
    }

    public C13072c() {
        C13065a.m23491a().mo20920b();
        C13065a.m23491a().mo20918a(new AbstractC13069b() {
            /* class com.bytedance.p802b.p824f.p825a.C13072c.C130731 */

            static {
                Covode.recordClassIndex(14909);
            }

            @Override // com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b
            /* renamed from: a */
            public final void mo20917a(JSONObject jSONObject) {
                JSONObject optJSONObject;
                C13072c cVar = C13072c.this;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("disk")) != null) {
                    C13028a aVar = new C13028a();
                    boolean z = false;
                    aVar.f31749a = optJSONObject.optBoolean("enable_collect_apm6", false);
                    if (optJSONObject.optInt("enable_upload", 0) == 1) {
                        z = true;
                    }
                    aVar.f31760l = z;
                    if (optJSONObject.optInt("dump_threshold") > 0) {
                        aVar.f31750b = ((long) optJSONObject.optInt("dump_threshold")) * 1024 * 1024;
                    }
                    if (optJSONObject.optInt("abnormal_folder_size") > 0) {
                        aVar.f31751c = ((long) optJSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
                    }
                    aVar.f31752d = ((long) optJSONObject.optInt("abnormal_file_size", 100)) * 1024;
                    if (optJSONObject.optInt("dump_top_count") > 0) {
                        aVar.f31753e = optJSONObject.optInt("dump_top_count");
                    }
                    aVar.f31754f = optJSONObject.optInt("dump_outdated_count", 50);
                    aVar.f31755g = optJSONObject.optInt("dump_top_file_count", 20);
                    aVar.f31756h = optJSONObject.optInt("dump_exception_dir_count", 50);
                    if (optJSONObject.optInt("outdated_days") > 0) {
                        aVar.f31757i = ((long) optJSONObject.optInt("outdated_days")) * 86400000;
                    }
                    aVar.f31758j = C12592m.m22694c(optJSONObject, "disk_customed_paths");
                    aVar.f31759k = C12592m.m22693b(optJSONObject, "ignored_relative_paths");
                    cVar.f31872a = aVar;
                    C13026a.f31743a.mo20885a(cVar.f31872a);
                }
            }
        });
    }
}
