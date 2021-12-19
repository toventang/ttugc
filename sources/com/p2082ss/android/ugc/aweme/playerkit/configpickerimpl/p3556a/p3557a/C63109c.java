package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.p3557a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63120a;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63122b;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a.c */
public final class C63109c {

    /* renamed from: a */
    public C63102f f143429a;

    /* renamed from: b */
    private volatile Map<String, String> f143430b;

    static {
        Covode.recordClassIndex(73951);
    }

    /* renamed from: a */
    public final Map<String, String> mo101336a() {
        if (this.f143430b == null) {
            C63102f fVar = this.f143429a;
            if (fVar == null) {
                C63120a.m114061a("ServerPortrait params null !!");
            } else if (fVar.f143405d != null) {
                this.f143430b = this.f143429a.f143405d;
            } else if (this.f143429a.f143404c != null) {
                this.f143430b = (Map) C63122b.m114064a(this.f143429a.f143404c, new C27895a<Map<String, String>>() {
                    /* class com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.p3557a.C63109c.C631101 */

                    static {
                        Covode.recordClassIndex(73952);
                    }
                }.type);
            }
        }
        return this.f143430b;
    }
}
