package com.bytedance.android.livesdk.p442ai;

import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeBytevc1EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeH264EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurrySpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowSpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkFastOpenDisableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkNtpEnableSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFirstFrameCallbackInsertMqHeadSetting;
import com.bytedance.android.livesdk.p442ai.AbstractC6724g;
import com.bytedance.android.livesdk.p442ai.p443a.C6707a;
import com.bytedance.android.livesdk.p442ai.p443a.C6708b;
import com.bytedance.android.livesdk.p442ai.p443a.C6709c;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.videoarch.p4474a.C87154g;
import com.p2082ss.videoarch.p4474a.p4477c.C87132c;
import com.p2082ss.videoarch.p4474a.p4479e.C87149b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.v */
public final class C6752v implements Handler.Callback, AbstractC6724g {

    /* renamed from: e */
    private static final SparseIntArray f16765e;

    /* renamed from: a */
    C87154g f16766a;

    /* renamed from: b */
    C6710aa f16767b;

    /* renamed from: c */
    AbstractC6724g.AbstractC6725a f16768c;

    /* renamed from: d */
    public Handler f16769d = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private AbstractC6724g.AbstractC6726b f16770f;

    /* renamed from: g */
    private Handler f16771g;

    /* renamed from: h */
    private HandlerThread f16772h;

    /* renamed from: i */
    private AbstractC6724g.AbstractC6725a f16773i = new AbstractC6724g.AbstractC6725a() {
        /* class com.bytedance.android.livesdk.p442ai.C6752v.C67531 */

        static {
            Covode.recordClassIndex(7491);
        }

        @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g.AbstractC6725a
        /* renamed from: a */
        public final void mo12905a(AbstractC6724g.EnumC6727c cVar, int i, String str) {
            C7572d.m15561a("TTLivePlayer2", "sub thread message is " + cVar.name());
            if (cVar != AbstractC6724g.EnumC6727c.RENDERING_START || !LiveFirstFrameCallbackInsertMqHeadSetting.INSTANCE.getValue()) {
                C6752v.this.f16769d.post(new RunnableC6756y(this, cVar, i, str));
            } else {
                C6752v.this.f16769d.postAtFrontOfQueue(new RunnableC6755x(this, cVar, i, str));
            }
        }
    };

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12886a(String str, Map<String, String> map, AbstractC6724g.EnumC6728d dVar) {
        m14438b("TTLivePlayer2", "setDataSource: with url");
        m14437a(m14436a(2, new C6708b(str, map, dVar)));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12885a(String str, String str2) {
        m14438b("TTLivePlayer2", "setDataSource: with pull stream data");
        m14437a(m14436a(1, new C6707a(str, str2)));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12887a(boolean z) {
        m14438b("TTLivePlayer2", "setMute: ".concat(String.valueOf(z)));
        m14437a(m14436a(7, Boolean.valueOf(z)));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12883a(String str) {
        m14438b("TTLivePlayer2", "switchResolution: ".concat(String.valueOf(str)));
        m14437a(m14436a(10, str));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12888a(boolean z, boolean z2, int i) {
        m14438b("TTLivePlayer2", "setSuperResolutionOptions: " + z + "," + z2 + "," + i);
        m14437a(m14436a(16, new C6709c(z, z2, i)));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12884a(String str, AbstractC11663q qVar) {
        m14438b("TTLivePlayer2", "switchResolution: ".concat(String.valueOf(str)));
        if (this.f16771g == null) {
            this.f16771g = new Handler(this.f16772h.getLooper(), this);
        }
        m14437a(Message.obtain(this.f16771g, new RunnableC6754w(this, str, qVar)));
    }

    /* renamed from: l */
    private void m14439l() {
        HandlerThread handlerThread = this.f16772h;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f16772h.interrupt();
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: g */
    public final boolean mo12900g() {
        C87154g gVar = this.f16766a;
        if (gVar == null || gVar.f197346t != C87154g.EnumC87165c.PLAYED) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: h */
    public final boolean mo12901h() {
        C87154g gVar = this.f16766a;
        if (gVar == null || !gVar.mo141000j()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: j */
    public final JSONObject mo12903j() {
        C87154g gVar = this.f16766a;
        if (gVar != null) {
            return gVar.mo141004n();
        }
        return new JSONObject();
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: k */
    public final String mo12904k() {
        C87154g gVar = this.f16766a;
        if (gVar != null) {
            return gVar.f196994P;
        }
        return "";
    }

    static {
        Covode.recordClassIndex(7490);
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f16765e = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 3);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12877a() {
        m14438b("TTLivePlayer2", "reset: ");
        m14437a(m14436a(15, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: c */
    public final void mo12892c() {
        m14438b("TTLivePlayer2", "start: ");
        m14437a(m14436a(3, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: d */
    public final void mo12895d() {
        m14438b("TTLivePlayer2", "stop: ");
        m14437a(m14436a(12, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: e */
    public final void mo12897e() {
        m14438b("TTLivePlayer2", "release: ");
        m14437a(m14436a(13, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: f */
    public final void mo12899f() {
        m14438b("TTLivePlayer2", "releaseAsync: ");
        m14437a(m14436a(14, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: i */
    public final Point mo12902i() {
        if (this.f16766a != null) {
            return new Point(this.f16766a.mo141001k(), this.f16766a.mo141002l());
        }
        return new Point(0, 0);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: b */
    public final void mo12889b() {
        m14438b("TTLivePlayer2", "prepareAsync: ");
        m14437a(m14436a(4, (Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo12956d(String str) {
        return this.f16766a.mo140982a(str);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: c */
    public final void mo12893c(String str) {
        m14437a(m14436a(22, str));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: d */
    public final void mo12896d(boolean z) {
        m14437a(m14436a(23, Boolean.valueOf(z)));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: e */
    public final void mo12898e(boolean z) {
        m14437a(m14436a(24, Boolean.valueOf(z)));
    }

    /* renamed from: a */
    private void m14437a(Message message) {
        HandlerThread handlerThread = this.f16772h;
        if (handlerThread != null && handlerThread.isAlive() && !this.f16772h.isInterrupted()) {
            if (this.f16771g == null) {
                this.f16771g = new Handler(this.f16772h.getLooper(), this);
            }
            this.f16771g.sendMessageDelayed(message, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: c */
    public final void mo12894c(boolean z) {
        m14438b("TTLivePlayer2", "setPreviewFlag: ".concat(String.valueOf(z)));
        m14437a(m14436a(19, Boolean.valueOf(z)));
    }

    public C6752v(C6757z zVar) {
        HandlerThread handlerThread = new HandlerThread("single-live-player-thread", 10);
        this.f16772h = handlerThread;
        handlerThread.start();
        this.f16771g = new Handler(this.f16772h.getLooper(), this);
        m14438b("TTLivePlayer2", "init: ");
        m14437a(m14436a(18, zVar));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12878a(int i) {
        m14438b("TTLivePlayer2", "setImageLayout: ".concat(String.valueOf(i)));
        m14437a(m14436a(17, Integer.valueOf(i)));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: b */
    public final void mo12890b(String str) {
        m14438b("TTLivePlayer2", "setProjectKey: ".concat(String.valueOf(str)));
        m14437a(m14436a(20, str));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12879a(Surface surface) {
        String valueOf;
        StringBuilder sb = new StringBuilder("setSurfaceDisplay: surface = ");
        if (surface == null) {
            valueOf = "null";
        } else {
            valueOf = String.valueOf(surface.hashCode());
        }
        m14438b("TTLivePlayer2", sb.append(valueOf).toString());
        m14437a(m14436a(5, surface));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: b */
    public final void mo12891b(boolean z) {
        m14438b("TTLivePlayer2", "setSeiOpen: ".concat(String.valueOf(z)));
        m14437a(m14436a(9, Boolean.valueOf(z)));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12880a(SurfaceHolder surfaceHolder) {
        String valueOf;
        StringBuilder sb = new StringBuilder("setSurfaceDisplay: surface holder= ");
        if (surfaceHolder == null) {
            valueOf = "null";
        } else {
            valueOf = String.valueOf(surfaceHolder.hashCode());
        }
        m14438b("TTLivePlayer2", sb.append(valueOf).toString());
        m14437a(m14436a(6, surfaceHolder));
    }

    public final boolean handleMessage(Message message) {
        String str;
        AudioManager audioManager;
        C87154g gVar;
        switch (message.what) {
            case 1:
                C6707a aVar = (C6707a) message.obj;
                String str2 = aVar.f16634a;
                String str3 = aVar.f16635b;
                this.f16766a.mo140985b(str2);
                if (!C13627m.m24498a(str3)) {
                    this.f16766a.mo140970a(43, str3);
                    break;
                }
                break;
            case 2:
                C6708b bVar = (C6708b) message.obj;
                String str4 = bVar.f16636a;
                Map<String, String> map = bVar.f16637b;
                if (str4.indexOf("://") > 0) {
                    Uri parse = Uri.parse(str4);
                    if (map != null) {
                        str = map.get("sdk_params");
                    } else {
                        str = "";
                    }
                    this.f16766a.mo140980a(new C87132c[]{new C87132c(parse.toString(), str)});
                    break;
                } else {
                    this.f16766a.mo140988c(Uri.parse("file://".concat(String.valueOf(str4))).toString());
                    break;
                }
            case 3:
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.f16766a.mo140969a(18, 0);
                    this.f16766a.mo140968a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
                    this.f16766a.mo140969a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.f16766a.mo140968a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
                    this.f16766a.mo140969a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.f16766a.mo140969a(35, 1);
                    this.f16766a.mo140969a(33, 1);
                    this.f16766a.mo140969a(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.f16766a.mo140969a(36, 1);
                }
                this.f16766a.mo140970a(72, C11265g.m19959a());
                this.f16766a.mo140969a(9, 2);
                this.f16766a.mo140983b();
                AbstractC6724g.AbstractC6726b bVar2 = this.f16770f;
                if (bVar2 != null) {
                    bVar2.mo12906h();
                    break;
                }
                break;
            case 4:
                this.f16766a.mo140969a(2, 0);
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.f16766a.mo140969a(18, 0);
                    this.f16766a.mo140968a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
                    this.f16766a.mo140969a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.f16766a.mo140968a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
                    this.f16766a.mo140969a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.f16766a.mo140969a(35, 1);
                    this.f16766a.mo140969a(33, 1);
                    this.f16766a.mo140969a(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.f16766a.mo140969a(36, 1);
                }
                if (LiveSdkFastOpenDisableSetting.INSTANCE.getValue() == 1) {
                    this.f16766a.mo140969a(40, 0);
                }
                if (LiveSdkNtpEnableSetting.INSTANCE.getValue() == 1) {
                    this.f16766a.mo140969a(42, 1);
                }
                this.f16766a.mo140970a(72, C11265g.m19959a());
                this.f16766a.mo140969a(9, 2);
                this.f16766a.mo140983b();
                AbstractC6724g.AbstractC6726b bVar3 = this.f16770f;
                if (bVar3 != null) {
                    bVar3.mo12906h();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                this.f16766a.mo140971a((Surface) message.obj);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                this.f16766a.mo140972a((SurfaceHolder) message.obj);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                this.f16766a.mo140976a(Boolean.valueOf(((Boolean) message.obj).booleanValue()));
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                float floatValue = ((Float) message.obj).floatValue();
                C87154g gVar2 = this.f16766a;
                C87149b bVar4 = gVar2.f197334h;
                if (!(bVar4.f196951b == null || (audioManager = (AudioManager) C87149b.m151081a(bVar4.f196950a, DataType.AUDIO)) == null)) {
                    audioManager.setStreamVolume(3, (int) floatValue, 0);
                }
                gVar2.f197054b.f196529cG = floatValue;
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                if (!((Boolean) message.obj).booleanValue() && (gVar = this.f16766a) != null) {
                    gVar.mo140969a(41, 0);
                    break;
                }
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                mo12956d((String) message.obj);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                C87154g gVar3 = this.f16766a;
                gVar3.mo140996f("pause");
                if (gVar3.f197336j != null && gVar3.f197336j.mo16728p()) {
                    if (gVar3.f197339m != null) {
                        gVar3.f197339m.mo136455a(true);
                    }
                    gVar3.f197346t = C87154g.EnumC87165c.PAUSED;
                    gVar3.f197336j.mo16719g();
                    break;
                }
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                this.f16766a.mo140987c();
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                this.f16766a.mo140998h();
                m14439l();
                break;
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                this.f16766a.mo140999i();
                m14439l();
                break;
            case 15:
                this.f16766a.mo140993e();
                break;
            case 16:
                Object obj = message.obj;
                break;
            case 17:
                ((Integer) message.obj).intValue();
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                C6757z zVar = (C6757z) message.obj;
                this.f16766a = zVar.mo12961a();
                C6710aa aaVar = zVar.f16792g;
                this.f16767b = aaVar;
                aaVar.f16642a = this.f16773i;
                AbstractC6724g.AbstractC6726b bVar5 = this.f16770f;
                if (bVar5 != null) {
                    this.f16767b.f16643b = bVar5;
                }
                this.f16766a.mo140969a(44, 0);
                break;
            case 19:
                this.f16766a.mo140979a(((Boolean) message.obj).booleanValue());
                break;
            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                this.f16766a.mo140991d((String) message.obj);
                break;
            case 21:
                C11690a aVar2 = (C11690a) message.obj;
                this.f16766a.mo140970a(63, aVar2.f27938a + "-" + aVar2.f27939b);
                this.f16766a.mo140970a(64, aVar2.f27940c);
                C3854a.m9453a(4, "LivePlayerEntranceParam", aVar2.f27938a + ", " + aVar2.f27939b + ", " + aVar2.f27940c);
                break;
            case 22:
                String str5 = (String) message.obj;
                if (!C13627m.m24498a(str5)) {
                    this.f16766a.mo140970a(86, str5);
                    break;
                }
                break;
            case 23:
                this.f16766a.mo140969a(76, ((Boolean) message.obj).booleanValue() ? 1 : 0);
                break;
            case 24:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                C87154g gVar4 = this.f16766a;
                if (gVar4 != null) {
                    gVar4.mo140969a(56, booleanValue ? 1 : 0);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12882a(C11690a aVar) {
        if (aVar == null) {
            aVar = new C11690a("", "", "");
        }
        m14437a(m14436a(21, aVar));
    }

    /* renamed from: a */
    private static Message m14436a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: b */
    private void m14438b(String str, String str2) {
        C7572d.m15562b(str, str2 + " <===> player hash:" + hashCode());
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g
    /* renamed from: a */
    public final void mo12881a(AbstractC6724g.AbstractC6725a aVar, AbstractC6724g.AbstractC6726b bVar) {
        this.f16768c = aVar;
        C6710aa aaVar = this.f16767b;
        if (aaVar != null) {
            aaVar.f16643b = bVar;
        }
        this.f16770f = bVar;
    }
}
