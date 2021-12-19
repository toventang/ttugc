package com.p2082ss.android.vesdk;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.audio.C30637c;
import com.p2082ss.android.ttve.audio.TEDubWriter;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.vesdk.VESensService;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import com.p2082ss.android.vesdk.runtime.VERuntime;

/* renamed from: com.ss.android.vesdk.VEAudioRecorder */
public class VEAudioRecorder implements AbstractC33974au {

    /* renamed from: a */
    public long f190631a;

    /* renamed from: b */
    private VERuntime f190632b = VERuntime.EnumC85549a.INSTANCE.f191667b;

    /* renamed from: c */
    private VEAudioEncodeSettings f190633c;

    /* renamed from: d */
    private String f190634d;

    /* renamed from: e */
    private boolean f190635e;

    /* renamed from: f */
    private C30637c f190636f = new C30637c(new TEDubWriter());

    static {
        Covode.recordClassIndex(99250);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destory();
        }
    }

    public VEAudioRecorder() {
        C85315al.m146637a("VEAudioRecorder", "VEAudioRecorder constructor in.");
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void destory() {
        C85315al.m146637a("VEAudioRecorder", "VEAudioRecorder destory in. mbRecording = " + this.f190635e);
        C30637c cVar = this.f190636f;
        if (cVar.f73237e != null) {
            try {
                if (cVar.f73237e.getState() != 0) {
                    C30683b.m63032a("vesdk_event_will_stop_mic", C30637c.m62967a("editor uninit will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    C85400c.m146936b(cVar.f73244l, cVar.f73237e);
                    C30637c.m62968b();
                    C30683b.m63032a("vesdk_event_did_stop_mic", C30637c.m62967a("editor uninit did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                }
                C85400c.m146938c(cVar.f73244l, cVar.f73237e);
            } catch (Exception unused) {
            }
            cVar.f73237e = null;
        }
        if (cVar.f73243k != null) {
            cVar.f73243k.mo54911b();
        }
    }

    /* renamed from: a */
    public final String mo130153a() {
        if (!this.f190635e) {
            return this.f190634d;
        }
        throw new C85615x(-105, "audio is recording");
    }

    /* renamed from: a */
    public final long mo130152a(PrivacyCert privacyCert) {
        C85315al.m146637a("VEAudioRecorder", "VEAudioRecorder stopRecord in. mbRecording = " + this.f190635e);
        if (!this.f190635e) {
            return -105;
        }
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
        this.f190631a = ((TEDubWriter) this.f190636f.f73243k).f73231b;
        this.f190636f.mo54920a(privacyCert);
        C85315al.m146637a("VEAudioRecorder", "Stop record ,current time is " + this.f190631a);
        this.f190635e = false;
        C30689e.m63052a("iesve_veaudiorecorder_audio_record", 1, (C85509a) null);
        return this.f190631a;
    }

    /* renamed from: a */
    public final int mo130148a(int i, int i2) {
        if (i >= i2 || i < 0) {
            return -100;
        }
        C30689e.m63052a("iesve_veaudiorecorder_audio_delete", 1, (C85509a) null);
        return TEVideoUtils.clearWavSeg(this.f190634d, i, i2);
    }

    /* renamed from: a */
    public final int mo130150a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.f190633c = vEAudioEncodeSettings;
        this.f190635e = false;
        this.f190634d = str;
        C85315al.m146637a("VEAudioRecorder", "VEAudioRecorder init in. mWavFilePath = " + this.f190634d);
        this.f190636f.mo54918a();
        return 0;
    }

    /* renamed from: a */
    public final int mo130149a(int i, int i2, PrivacyCert privacyCert) {
        C85315al.m146637a("VEAudioRecorder", "VEAudioRecorder startRecord in. mbRecording = " + this.f190635e);
        if (this.f190635e) {
            return -105;
        }
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
        this.f190636f.mo54919a(this.f190634d, 1.0d, i, i2, privacyCert);
        this.f190635e = true;
        return 0;
    }

    /* renamed from: a */
    public final int mo130151a(String str, VEAudioEncodeSettings vEAudioEncodeSettings, int i) {
        this.f190633c = vEAudioEncodeSettings;
        this.f190635e = false;
        if (TextUtils.isEmpty(str)) {
            C85315al.m146637a("VEAudioRecorder", "Empty directory use default path");
            this.f190634d = this.f190632b.f191644c.mo131528a();
        } else {
            C85315al.m146637a("VEAudioRecorder", "Use wav save path ".concat(String.valueOf(str)));
            this.f190634d = str;
        }
        C85315al.m146637a("VEAudioRecorder", "VEAudioRecorder init in. mWavFilePath = " + this.f190634d);
        this.f190636f.mo54918a();
        TEVideoUtils.generateMuteWav(this.f190634d, this.f190636f.f73238f, 2, i);
        return 0;
    }
}
