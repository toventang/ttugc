package com.p2082ss.android.ttve.audio;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.vesdk.C85400c;
import com.p2082ss.android.vesdk.VESensService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.audio.c */
public final class C30637c {

    /* renamed from: a */
    protected static int f73233a = -1;

    /* renamed from: b */
    protected static int[] f73234b = {44100, 8000, 11025, 16000, 22050};

    /* renamed from: c */
    protected static int f73235c = -1;

    /* renamed from: d */
    protected static int[] f73236d = {12, 16, 1};

    /* renamed from: e */
    public AudioRecord f73237e;

    /* renamed from: f */
    public int f73238f = -1;

    /* renamed from: g */
    int f73239g;

    /* renamed from: h */
    int f73240h = -1;

    /* renamed from: i */
    int f73241i = 2;

    /* renamed from: j */
    boolean f73242j;

    /* renamed from: k */
    public AbstractC30636b f73243k;

    /* renamed from: l */
    public PrivacyCert f73244l;

    /* renamed from: b */
    public static void m62968b() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
    }

    static {
        Covode.recordClassIndex(37176);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        AudioRecord audioRecord = this.f73237e;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() != 0) {
                    C30683b.m63032a("vesdk_event_will_stop_mic", m62967a("editor finalize will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    C85400c.m146936b(this.f73244l, this.f73237e);
                    m62968b();
                    C30683b.m63032a("vesdk_event_did_stop_mic", m62967a("editor finalize did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                }
                C85400c.m146938c(this.f73244l, this.f73237e);
            } catch (Exception unused) {
            }
            this.f73237e = null;
        }
        super.finalize();
    }

    /* renamed from: a */
    public final void mo54918a() {
        int i;
        if (this.f73237e == null) {
            int i2 = -1;
            try {
                int i3 = f73235c;
                if (!(i3 == -1 || (i = f73233a) == -1)) {
                    int i4 = f73236d[i3];
                    this.f73240h = i4;
                    int i5 = f73234b[i];
                    this.f73238f = i5;
                    this.f73239g = AudioRecord.getMinBufferSize(i5, i4, this.f73241i);
                    this.f73237e = new AudioRecord(1, this.f73238f, this.f73240h, this.f73241i, this.f73239g);
                }
            } catch (Exception unused) {
            }
            if (this.f73237e == null) {
                f73235c = -1;
                int[] iArr = f73236d;
                int length = iArr.length;
                int i6 = 0;
                loop0:
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    this.f73240h = iArr[i6];
                    f73235c++;
                    f73233a = i2;
                    int[] iArr2 = f73234b;
                    for (int i7 : iArr2) {
                        f73233a++;
                        try {
                            int minBufferSize = AudioRecord.getMinBufferSize(i7, this.f73240h, this.f73241i);
                            this.f73239g = minBufferSize;
                            if (minBufferSize > 0) {
                                this.f73238f = i7;
                                this.f73237e = new AudioRecord(1, this.f73238f, this.f73240h, this.f73241i, this.f73239g);
                                break loop0;
                            }
                            f73233a++;
                        } catch (Exception e) {
                            this.f73238f = 0;
                            this.f73237e = null;
                            e.getMessage();
                            f73233a++;
                        }
                    }
                    i6++;
                    i2 = -1;
                }
            }
            if (this.f73238f > 0) {
                this.f73237e.getState();
            }
        }
    }

    public C30637c(AbstractC30636b bVar) {
        this.f73243k = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|(1:10)|11|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        com.p2082ss.android.vesdk.C85400c.m146938c(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        r6.f73237e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = r6.f73237e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m62969b(com.bytedance.bpea.basics.PrivacyCert r7) {
        /*
            r6 = this;
            java.lang.String r3 = "behavior"
            java.lang.String r4 = ""
            r5 = 0
            android.media.AudioRecord r0 = r6.f73237e     // Catch:{ Exception -> 0x004a }
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = "editor will start mic"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x004a }
            org.json.JSONObject r1 = m62967a(r2, r0, r4)     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = "vesdk_event_will_start_mic"
            com.p2082ss.android.ttve.monitor.C30683b.m63032a(r0, r1, r3)     // Catch:{ Exception -> 0x004a }
            android.media.AudioRecord r0 = r6.f73237e     // Catch:{ Exception -> 0x004a }
            com.p2082ss.android.vesdk.C85400c.m146933a(r7, r0)     // Catch:{ Exception -> 0x004a }
            com.ss.android.vesdk.VESensService r1 = com.p2082ss.android.vesdk.VESensService.getInstance()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = com.p2082ss.android.vesdk.VESensService.SENS_SERVICE_TYPE_MIC     // Catch:{ Exception -> 0x004a }
            int r2 = r1.getIDWithName(r0)     // Catch:{ Exception -> 0x004a }
            com.ss.android.vesdk.VESensService r1 = com.p2082ss.android.vesdk.VESensService.getInstance()     // Catch:{ Exception -> 0x004a }
            com.ss.android.vesdk.VESensService$b r0 = com.p2082ss.android.vesdk.VESensService.EnumC85266b.PRIVACY_STATUS_USING     // Catch:{ Exception -> 0x004a }
            r1.setSensCheckObjStatus(r2, r0)     // Catch:{ Exception -> 0x004a }
            java.lang.String r2 = "editor did start mic"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x004a }
            org.json.JSONObject r1 = m62967a(r2, r4, r0)     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = "vesdk_event_did_start_mic"
            com.p2082ss.android.ttve.monitor.C30683b.m63032a(r0, r1, r3)     // Catch:{ Exception -> 0x004a }
            r0 = 1
            return r0
        L_0x0049:
            return r5
        L_0x004a:
            android.media.AudioRecord r0 = r6.f73237e     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x0051
            com.p2082ss.android.vesdk.C85400c.m146938c(r7, r0)     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            r0 = 0
            r6.f73237e = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.audio.C30637c.m62969b(com.bytedance.bpea.basics.PrivacyCert):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r0.getState() == 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        com.p2082ss.android.ttve.monitor.C30683b.m63032a("vesdk_event_will_stop_mic", m62967a("editor stopRecording will stop mic", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), ""), "behavior");
        com.p2082ss.android.vesdk.C85400c.m146936b(r6, r5.f73237e);
        m62968b();
        com.p2082ss.android.ttve.monitor.C30683b.m63032a("vesdk_event_did_stop_mic", m62967a("editor stopRecording did stop mic", "", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), "behavior");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r5.f73243k.mo54908a();
        r5.f73244l = null;
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4987);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54920a(com.bytedance.bpea.basics.PrivacyCert r6) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.audio.C30637c.mo54920a(com.bytedance.bpea.basics.PrivacyCert):boolean");
    }

    /* renamed from: a */
    public static JSONObject m62967a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r10.f73243k.mo54909a(r11, r10.f73238f, 1.0d, r14, r15) == 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4965);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (m62969b(r16) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        com.p2082ss.android.vesdk.C85315al.m146637a("TEBufferedAudioRecorder", "start mic ok, ready to run AudioRecorderRunnable");
        new java.lang.Thread(new com.p2082ss.android.ttve.audio.C30637c.RunnableC306381(r10)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4965);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54919a(java.lang.String r11, double r12, int r14, int r15, com.bytedance.bpea.basics.PrivacyCert r16) {
        /*
            r10 = this;
            r2 = 4965(0x1365, float:6.957E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            r1 = r16
            r10.f73244l = r1
            monitor-enter(r10)
            boolean r0 = r10.f73242j     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0012
            android.media.AudioRecord r0 = r10.f73237e     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0017
        L_0x0012:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0017:
            r0 = 1
            r10.f73242j = r0
            monitor-exit(r10)
            com.ss.android.ttve.audio.b r3 = r10.f73243k
            int r5 = r10.f73238f
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4 = r11
            r8 = r14
            r9 = r15
            int r0 = r3.mo54909a(r4, r5, r6, r8, r9)
            if (r0 == 0) goto L_0x002e
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x002e:
            boolean r0 = r10.m62969b(r1)
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = "TEBufferedAudioRecorder"
            java.lang.String r0 = "start mic ok, ready to run AudioRecorderRunnable"
            com.p2082ss.android.vesdk.C85315al.m146637a(r1, r0)
            java.lang.Thread r1 = new java.lang.Thread
            com.ss.android.ttve.audio.c$1 r0 = new com.ss.android.ttve.audio.c$1
            r0.<init>()
            r1.<init>(r0)
            r1.start()
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r10)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.audio.C30637c.mo54919a(java.lang.String, double, int, int, com.bytedance.bpea.basics.PrivacyCert):void");
    }
}
