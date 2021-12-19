package com.p2082ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.e */
public final class C81001e implements AbstractC63040h {

    /* renamed from: a */
    private final Object f181072a = new Object();

    /* renamed from: b */
    private final Object f181073b = new Object();

    /* renamed from: c */
    private final LinkedList<Pair<String, JSONObject>> f181074c = new LinkedList<>();

    /* renamed from: d */
    private final LinkedList<Pair<String, Map<String, Object>>> f181075d = new LinkedList<>();

    static {
        Covode.recordClassIndex(94319);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h
    /* renamed from: a */
    public final void mo101173a(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C84231a.m144837c().onEvent("nor_on_prepared_time", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h
    /* renamed from: b */
    public final void mo101177b(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C84231a.m144837c().onEvent("nor_on_render_start_time", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(14057);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        return null;
     */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo101172a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simplayer.C81001e.mo101172a(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(14088);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        return null;
     */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.Object> mo101176b(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simplayer.C81001e.mo101176b(java.lang.String):java.util.HashMap");
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h
    /* renamed from: a */
    public final void mo101174a(String str, Map map) {
        MethodCollector.m26663i(14058);
        try {
            synchronized (this.f181073b) {
                try {
                    if (!TextUtils.isEmpty(str) && map != null) {
                        if (this.f181075d.size() > 5) {
                            this.f181075d.remove(0);
                        }
                        this.f181075d.add(new Pair<>(str, map));
                    }
                } finally {
                    MethodCollector.m26664o(14058);
                }
            }
        } catch (Exception e) {
            if (C84231a.m144834a() == null || !C84231a.m144834a().isDebug()) {
                MethodCollector.m26664o(14058);
                return;
            }
            RuntimeException runtimeException = new RuntimeException(e);
            MethodCollector.m26664o(14058);
            throw runtimeException;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h
    /* renamed from: a */
    public final void mo101175a(String str, JSONObject jSONObject) {
        MethodCollector.m26663i(14034);
        try {
            synchronized (this.f181072a) {
                try {
                    if (!TextUtils.isEmpty(str) && jSONObject != null) {
                        if (this.f181074c.size() > 5) {
                            this.f181074c.remove(0);
                        }
                        this.f181074c.add(new Pair<>(str, jSONObject));
                    }
                } finally {
                    MethodCollector.m26664o(14034);
                }
            }
        } catch (Exception e) {
            if (C84231a.m144834a() == null || !C84231a.m144834a().isDebug()) {
                MethodCollector.m26664o(14034);
                return;
            }
            RuntimeException runtimeException = new RuntimeException(e);
            MethodCollector.m26664o(14034);
            throw runtimeException;
        }
    }
}
