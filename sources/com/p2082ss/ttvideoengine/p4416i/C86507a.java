package com.p2082ss.ttvideoengine.p4416i;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4415h.C86505z;

/* renamed from: com.ss.ttvideoengine.i.a */
public final class C86507a implements AbstractC86508b {

    /* renamed from: a */
    private Bundle f194657a = new Bundle();

    /* renamed from: b */
    private int f194658b = 0;

    /* renamed from: c */
    private long f194659c;

    /* renamed from: d */
    private long f194660d;

    /* renamed from: e */
    private long f194661e;

    /* renamed from: f */
    private long f194662f;

    /* renamed from: g */
    private long f194663g;

    /* renamed from: h */
    private long f194664h;

    static {
        Covode.recordClassIndex(101735);
    }

    @Override // com.p2082ss.ttvideoengine.p4416i.AbstractC86508b
    /* renamed from: a */
    public final long mo137721a(String str) {
        return this.f194657a.getLong(str);
    }

    public C86507a(int i) {
    }

    @Override // com.p2082ss.ttvideoengine.p4416i.AbstractC86508b
    /* renamed from: a */
    public final void mo137722a(C86505z zVar) {
        long j;
        if (zVar != null) {
            long j2 = 0;
            if (zVar.f194457ah > 0) {
                j = zVar.f194457ah - zVar.f194650t;
            } else {
                j = 0;
            }
            this.f194659c = j;
            this.f194660d = zVar.f194461al - zVar.f194650t;
            this.f194661e = zVar.f194463an - zVar.f194650t;
            this.f194662f = zVar.f194653w - zVar.f194650t;
            this.f194664h = zVar.f194578cw - zVar.f194650t;
            if (zVar.f194567cl > 0) {
                j2 = zVar.f194567cl - zVar.f194650t;
            }
            this.f194663g = j2;
            this.f194657a.putLong("ffr_read_head_duration", this.f194659c);
            this.f194657a.putLong("ffr_read_first_data_duration", this.f194660d);
            this.f194657a.putLong("ffr_decode_duration", this.f194661e);
            this.f194657a.putLong("ffr_render_duration", this.f194662f);
            this.f194657a.putLong("ffr_playback_buffering_duration", this.f194663g);
            this.f194657a.putLong("ffr_prender_duration", this.f194664h);
        }
    }
}
