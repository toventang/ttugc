package com.p2082ss.android.vesdk.audio;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.presenter.C30031g;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.VEAudioEncodeSettings;
import com.p2082ss.android.vesdk.audio.C85342j;

/* renamed from: com.ss.android.vesdk.audio.g */
public enum EnumC85339g implements AbstractC85340h {
    INSTANCE;
    

    /* renamed from: a */
    C30031g f191050a;

    /* renamed from: b */
    VEAudioEncodeSettings f191051b;

    /* renamed from: c */
    private boolean f191052c = true;

    public final void startFeedPCM() {
        this.f191052c = true;
    }

    public final void stopFeedPCM() {
        this.f191052c = false;
    }

    static {
        Covode.recordClassIndex(99451);
    }

    public final void setAudioBufferConsumer(C30031g gVar) {
        this.f191050a = gVar;
    }

    public final void setAudioEncodeSettings(VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.f191051b = vEAudioEncodeSettings;
    }

    private EnumC85339g(String str) {
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
    public final void onReceive(C85342j jVar) {
        C30031g gVar = this.f191050a;
        if (gVar == null) {
            C85315al.m146642d("AudioCaptureHolder", "onReceiver error: please set buffer consumer, before init AudioCapture");
        } else if (!this.f191052c) {
            C85315al.m146637a("AudioCaptureHolder", "pcm feed stop");
        } else {
            gVar.mo53225a(((C85342j.C85343a) jVar.f191054a).f191057a, jVar.f191055b, jVar.f191056c);
        }
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
    public final void onError(int i, int i2, String str) {
        C85315al.m146637a("AudioCaptureHolder", "errType" + i + "ret:" + i2 + "msg:" + str);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
    public final void onInfo(int i, int i2, double d, Object obj) {
        if (i == C85310ah.f190925M) {
            if (i2 == 0) {
                C85521l lVar = (C85521l) obj;
                if (this.f191051b == null) {
                    C85315al.m146642d("AudioCaptureHolder", "please set VEAudioEncodeSettings, before init AudioCapture");
                    return;
                }
                C30031g gVar = this.f191050a;
                if (gVar == null) {
                    C85315al.m146642d("AudioCaptureHolder", "please set buffer consumer, before init AudioCapture");
                    return;
                } else {
                    gVar.initAudioConfig(lVar.f191576b, lVar.f191575a, this.f191051b.f190618c, this.f191051b.f190620e, this.f191051b.f190619d);
                    C85315al.m146637a("AudioCaptureHolder", "mVEAudioCapture inited: channelCount:" + lVar.f191575a + " sampleHz:" + lVar.f191576b + " encode sample rate:" + this.f191051b.f190618c + " encode channel count:" + this.f191051b.f190620e);
                }
            } else {
                C85315al.m146637a("AudioCaptureHolder", "initAudio error:".concat(String.valueOf(i2)));
            }
            if (i == C85310ah.f190926N) {
                this.f191052c = true;
            }
        }
    }
}
