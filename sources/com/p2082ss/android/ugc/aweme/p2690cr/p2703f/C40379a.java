package com.p2082ss.android.ugc.aweme.p2690cr.p2703f;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.File;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.f.a */
public final class C40379a implements AbstractC40387b {

    /* renamed from: a */
    public static final C40380a f94566a = new C40380a((byte) 0);

    static {
        Covode.recordClassIndex(48180);
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.f.a$a */
    public static final class C40380a {
        static {
            Covode.recordClassIndex(48181);
        }

        private C40380a() {
        }

        public /* synthetic */ C40380a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b
    /* renamed from: a */
    public final boolean mo69512a() {
        boolean storageMonitorLocalSwitch = C63244g.m114602a().mo73277e().getStorageMonitorLocalSwitch(true);
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        Boolean enableAvStorageMonitor = iESSettingsProxy.getEnableAvStorageMonitor();
        if (!storageMonitorLocalSwitch) {
            return false;
        }
        C89219l.m154716b(enableAvStorageMonitor, "");
        if (enableAvStorageMonitor.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b
    /* renamed from: a */
    public final void mo69508a(File file) {
        if (file != null) {
            mo69512a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b
    /* renamed from: a */
    public final void mo69511a(boolean z) {
        C63244g.m114602a().mo73277e().setStorageMonitorLocalSwitch(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b
    /* renamed from: a */
    public final void mo69509a(String str, long j) {
        C89219l.m154721d(str, "");
        if (mo69512a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j);
            C40982q.m82522a("av_storage_storage_size_count_time", jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b
    /* renamed from: b */
    public final void mo69513b(String str, long j) {
        C89219l.m154721d(str, "");
        if (mo69512a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j);
            C40982q.m82522a("av_storage_storage_clean_time", jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b
    /* renamed from: a */
    public final void mo69510a(String str, Exception exc) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(exc, "");
        if (mo69512a()) {
            C40346b.m81527b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("exception", Log.getStackTraceString(exc));
            C40982q.m82522a("av_storage_storage_clean_error", jSONObject);
        }
    }
}
