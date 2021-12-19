package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.p4217a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.mediakit.net.AVMDLNetClient;
import com.p2082ss.mediakit.net.Error;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.a.b */
public final class C80891b extends AVMDLNetClient {

    /* renamed from: a */
    private AbstractC63037g f180877a;

    static {
        Covode.recordClassIndex(94190);
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClient
    public final void cancel() {
        this.f180877a.mo101171b();
    }

    public C80891b(AbstractC63037g gVar) {
        this.f180877a = gVar;
    }

    /* renamed from: a */
    private AbstractC63037g.AbstractC63038a m140365a(final AVMDLNetClient.CompletionListener completionListener) {
        return new AbstractC63037g.AbstractC63038a() {
            /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.p4217a.C80891b.C808921 */

            static {
                Covode.recordClassIndex(94191);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g.AbstractC63038a
            /* renamed from: a */
            public final void mo101101a(JSONObject jSONObject, AbstractC63037g.C63039b bVar) {
                if (bVar != null) {
                    completionListener.onCompletion(null, new Error(bVar.code, "", bVar.toString()));
                } else {
                    completionListener.onCompletion(jSONObject, null);
                }
            }
        };
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, AVMDLNetClient.CompletionListener completionListener) {
        this.f180877a.mo101168a(str, m140365a(completionListener));
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, Map<String, String> map, AVMDLNetClient.CompletionListener completionListener) {
        this.f180877a.mo101169a(str, map, m140365a(completionListener));
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, AVMDLNetClient.CompletionListener completionListener) {
        this.f180877a.mo101170a(str, map, jSONObject, i, m140365a(completionListener));
    }
}
