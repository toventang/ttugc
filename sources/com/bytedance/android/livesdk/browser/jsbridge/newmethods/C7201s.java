package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p596o.C9987a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.s */
public final class C7201s extends AbstractC18334e<C7205c, Object> {

    /* renamed from: a */
    C18338g f17924a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.s$c */
    public class C7205c {
        @AbstractC27891c(mo46611a = "urls")

        /* renamed from: a */
        public List<String> f17931a;
        @AbstractC27891c(mo46611a = "action")

        /* renamed from: b */
        public int f17932b;
        @AbstractC27891c(mo46611a = "suffix")

        /* renamed from: c */
        public String f17933c;
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: d */
        public String f17934d;
        @AbstractC27891c(mo46611a = "demand")

        /* renamed from: e */
        public String f17935e;

        static {
            Covode.recordClassIndex(7951);
        }
    }

    static {
        Covode.recordClassIndex(7947);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        C9987a.m18455a().f24265b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.s$a */
    public class C7203a implements C9987a.AbstractC9989a {

        /* renamed from: a */
        public final String f17927a;

        static {
            Covode.recordClassIndex(7949);
        }

        @Override // com.bytedance.android.livesdk.p596o.C9987a.AbstractC9989a
        /* renamed from: a */
        public final void mo13395a(DownloadInfo downloadInfo) {
            C7201s.this.mo13393a(this.f17927a, 1, downloadInfo);
        }

        @Override // com.bytedance.android.livesdk.p596o.C9987a.AbstractC9989a
        /* renamed from: b */
        public final void mo13396b(DownloadInfo downloadInfo) {
            C7201s.this.mo13393a(this.f17927a, 3, downloadInfo);
        }

        @Override // com.bytedance.android.livesdk.p596o.C9987a.AbstractC9989a
        /* renamed from: d */
        public final void mo13398d(DownloadInfo downloadInfo) {
            C7201s.this.mo13393a(this.f17927a, 4, downloadInfo);
        }

        @Override // com.bytedance.android.livesdk.p596o.C9987a.AbstractC9989a
        /* renamed from: c */
        public final void mo13397c(DownloadInfo downloadInfo) {
            C7201s.this.mo13393a(this.f17927a, 2, downloadInfo);
            C6501b a = C6501b.C6502a.m13948a("livesdk_download_live_replay_duration");
            C9987a a2 = C9987a.m18455a();
            int id = downloadInfo.getId();
            HashMap hashMap = new HashMap();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(Downloader.getInstance(C3966y.m9669e()).getDownloadInfo(id).getTargetFilePath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            hashMap.put("duration", String.valueOf(a2.f24264a.get(Integer.valueOf(id)).f24268a));
            hashMap.put("live_duration", extractMetadata);
            a2.f24264a.remove(Integer.valueOf(id));
            a.mo12652a((Map<String, String>) hashMap).mo12655b();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(downloadInfo.getTargetFilePath())));
            C3966y.m9669e().sendBroadcast(intent);
        }

        public C7203a(String str) {
            this.f17927a = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r1 != 6) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15101a(final com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7201s.C7205c r8) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7201s.m15101a(com.bytedance.android.livesdk.browser.jsbridge.newmethods.s$c):void");
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.s$b */
    class C7204b {

        /* renamed from: a */
        public int f17929a;

        static {
            Covode.recordClassIndex(7950);
        }

        public C7204b(int i) {
            this.f17929a = i;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7205c cVar, C18338g gVar) {
        C7205c cVar2 = cVar;
        HashMap hashMap = new HashMap();
        hashMap.put("download_params_action", Integer.valueOf(cVar2.f17932b));
        C3868c.m9491a("ttlive_live_replay_download_action", 0, hashMap);
        if (gVar != null && C13627m.m24499a("live_replay", cVar2.f17935e) && !C13603b.m24435a((Collection) cVar2.f17931a) && C3966y.m9669e() != null) {
            this.f17924a = gVar;
            m15101a(cVar2);
            finishWithResult(new C7204b(1));
        }
        finishWithResult(new C7204b(-1));
    }

    /* renamed from: a */
    public final void mo13393a(String str, int i, DownloadInfo downloadInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("download_status", Integer.valueOf(i));
        C3868c.m9491a("ttlive_live_replay_send_js_event", 0, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", str);
            jSONObject.put("code", 1);
            if (downloadInfo != null) {
                jSONObject.put("status", i);
                double downloadProcess = (double) downloadInfo.getDownloadProcess();
                Double.isNaN(downloadProcess);
                jSONObject.put("percent", downloadProcess / 100.0d);
            } else {
                jSONObject.put("status", 0);
                jSONObject.put("percent", 0.0d);
            }
        } catch (JSONException unused) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error_msg", 1);
            C3868c.m9491a("ttlive_live_replay_send_js_error", 1, hashMap2);
        }
        this.f17924a.mo29356a("downloadMediaStatusChange", jSONObject);
    }
}
