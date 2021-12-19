package com.bytedance.android.livesdk.p442ai;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p442ai.AbstractC6724g;
import com.bytedance.android.livesdk.p442ai.p444b.AbstractC6713a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.videoarch.p4474a.AbstractC87117a;
import com.p2082ss.videoarch.p4474a.p4475a.C87118a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.aa */
public final class C6710aa implements AbstractC87117a {

    /* renamed from: a */
    public AbstractC6724g.AbstractC6725a f16642a;

    /* renamed from: b */
    public AbstractC6724g.AbstractC6726b f16643b;

    /* renamed from: c */
    private AbstractC6713a f16644c;

    static {
        Covode.recordClassIndex(7448);
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: b */
    public final void mo12859b() {
        m14248a(AbstractC6724g.EnumC6727c.BUFFERING_START, 0, "player start buffer");
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: c */
    public final void mo12861c() {
        m14248a(AbstractC6724g.EnumC6727c.BUFFERING_END, 0, "player end buffer");
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: d */
    public final void mo12863d() {
        m14248a(AbstractC6724g.EnumC6727c.PLAY_COMPLETED, 0, "play complete");
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: e */
    public final void mo12864e() {
        m14248a(AbstractC6724g.EnumC6727c.PREPARED, 0, "player is prepared");
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: a */
    public final void mo12854a() {
        AbstractC6724g.AbstractC6726b bVar = this.f16643b;
        if (bVar != null) {
            bVar.mo12907i();
        }
        m14248a(AbstractC6724g.EnumC6727c.RENDERING_START, 0, "player start render");
    }

    public C6710aa(AbstractC6713a aVar) {
        this.f16644c = aVar;
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: a */
    public final void mo12857a(String str) {
        m14248a(AbstractC6724g.EnumC6727c.SEI_UPDATE, 0, str);
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: c */
    public final void mo12862c(String str) {
        m14248a(AbstractC6724g.EnumC6727c.RESOLUTION_DEGRADE, 0, str);
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: b */
    public final void mo12860b(String str) {
        if (((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline()) {
            C3854a.m9453a(6, "TTLivePlayerReportALog", str);
        }
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: a */
    public final void mo12856a(C87118a aVar) {
        HashMap hashMap;
        AbstractC6724g.EnumC6727c cVar;
        if (aVar != null) {
            C27910f fVar = C4139e.C4140a.f11576c;
            if (aVar.info == null) {
                hashMap = new HashMap(2);
            } else {
                hashMap = new HashMap(aVar.info);
            }
            hashMap.put("error_code", String.valueOf(aVar.code));
            if (aVar.code != 0) {
                cVar = AbstractC6724g.EnumC6727c.PREPARE_FAILED;
            } else {
                cVar = AbstractC6724g.EnumC6727c.MEDIA_ERROR;
            }
            hashMap.put("error_description", cVar.name());
            String b = fVar.mo46674b(hashMap);
            if (aVar.code != 0) {
                m14248a(AbstractC6724g.EnumC6727c.PREPARE_FAILED, aVar.code, "prepare failed.code:" + aVar.code);
            }
            m14248a(AbstractC6724g.EnumC6727c.MEDIA_ERROR, aVar.code, b);
        }
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: a */
    public final void mo12855a(int i, int i2) {
        m14248a(AbstractC6724g.EnumC6727c.VIDEO_SIZE_CHANGED, (i2 << 16) | i, "videoSizeChanged, width: " + i + ", height: " + i2);
    }

    @Override // com.p2082ss.videoarch.p4474a.AbstractC87117a
    /* renamed from: a */
    public final void mo12858a(JSONObject jSONObject, String str) {
        boolean z;
        String str2;
        StringBuilder sb = new StringBuilder("player==>liveLogSender==null is ");
        if (this.f16644c == null) {
            z = true;
        } else {
            z = false;
        }
        C3854a.m9453a(3, "LiveAppBundleUtils", sb.append(z).toString());
        StringBuilder sb2 = new StringBuilder("player==>player info ");
        if (jSONObject == null) {
            str2 = "event is null";
        } else {
            str2 = "event is not null";
        }
        C3854a.m9453a(3, "LiveAppBundleUtils", sb2.append(str2).toString());
        if (this.f16644c != null) {
            C3854a.m9453a(3, "PlayerLogger", jSONObject.optString("event_key"));
            this.f16644c.mo12868a(jSONObject, str);
        }
    }

    /* renamed from: a */
    private void m14248a(AbstractC6724g.EnumC6727c cVar, int i, String str) {
        AbstractC6724g.AbstractC6725a aVar = this.f16642a;
        if (aVar != null) {
            aVar.mo12905a(cVar, i, str);
        }
    }
}
