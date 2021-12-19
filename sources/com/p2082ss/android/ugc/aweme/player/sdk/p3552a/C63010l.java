package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.l */
public final class C63010l extends AbstractC86561j {

    /* renamed from: a */
    private AbstractC63037g f143102a;

    static {
        Covode.recordClassIndex(73847);
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: a */
    public final void mo101097a() {
        this.f143102a.mo101171b();
    }

    public C63010l(AbstractC63037g gVar) {
        this.f143102a = gVar;
    }

    /* renamed from: a */
    private AbstractC63037g.AbstractC63038a m113588a(final AbstractC86561j.AbstractC86562a aVar) {
        return new AbstractC63037g.AbstractC63038a() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63010l.C630111 */

            static {
                Covode.recordClassIndex(73848);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g.AbstractC63038a
            /* renamed from: a */
            public final void mo101101a(JSONObject jSONObject, AbstractC63037g.C63039b bVar) {
                if (bVar != null) {
                    aVar.mo137467a(null, new C86633c("", -9994, bVar.toString()));
                } else {
                    aVar.mo137467a(jSONObject, null);
                }
            }
        };
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: a */
    public final void mo101098a(String str, AbstractC86561j.AbstractC86562a aVar) {
        this.f143102a.mo101168a(str, m113588a(aVar));
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: b */
    public final void mo101100b(String str, Map<String, String> map, AbstractC86561j.AbstractC86562a aVar) {
        this.f143102a.mo101169a(str, map, m113588a(aVar));
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: a */
    public final void mo101099a(String str, Map<String, String> map, AbstractC86561j.AbstractC86562a aVar) {
        this.f143102a.mo101170a(str, map, null, 0, m113588a(aVar));
    }
}
