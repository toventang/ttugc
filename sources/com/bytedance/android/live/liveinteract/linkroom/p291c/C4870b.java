package com.bytedance.android.live.liveinteract.linkroom.p291c;

import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a;
import com.bytedance.android.live.liveinteract.platform.common.p375f.C5701a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.b */
public final class C4870b implements AbstractC4867a {

    /* renamed from: b */
    public C4871c f12727b;

    /* renamed from: c */
    public C4892g f12728c;

    /* renamed from: d */
    private C5701a f12729d = new C5701a((byte) 0);

    /* renamed from: e */
    private boolean f12730e;

    /* renamed from: f */
    private boolean f12731f;

    static {
        Covode.recordClassIndex(5452);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    public final void onClick(View view) {
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: b */
    public final boolean mo10602b() {
        return this.f12727b.f12742j;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: d */
    public final void mo10605d() {
        this.f12728c.mo10628b();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: a */
    public final boolean mo10600a() {
        return this.f12728c.mo10627a();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: c */
    public final void mo10603c() {
        if (this.f12727b.f12742j && this.f12728c.mo10627a()) {
            mo10599a(0, 17);
        } else if (this.f12727b.f12742j && !this.f12728c.mo10627a()) {
            mo10599a(0, 1);
        } else if (this.f12728c.mo10627a() && !this.f12727b.f12742j) {
            mo10599a(0, 16);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: b */
    public final void mo10601b(boolean z) {
        int i;
        C4892g gVar = this.f12728c;
        gVar.f12802a = z;
        if (gVar.f12802a) {
            i = 0;
        } else {
            i = 8;
        }
        gVar.mo10626a(i);
        this.f12730e = z;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: c */
    public final void mo10604c(boolean z) {
        int i;
        C4871c cVar = this.f12727b;
        if (cVar.f12742j != z) {
            cVar.f12742j = z;
            if (cVar.f12742j) {
                i = 0;
            } else {
                i = 8;
            }
            cVar.mo10614b(i);
        }
        this.f12731f = z;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: d */
    public final void mo10606d(boolean z) {
        C4871c cVar = this.f12727b;
        if (z) {
            cVar.mo10614b(8);
            C4097j.m9928a(cVar.f12744l);
        } else if (cVar.f12742j) {
            cVar.mo10614b(0);
        }
        C4892g gVar = this.f12728c;
        if (z) {
            gVar.mo10626a(8);
        } else if (gVar.mo10627a()) {
            gVar.mo10626a(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: a */
    public final void mo10599a(int i, int i2) {
        if ((i2 & 1) == 1) {
            this.f12727b.mo10614b(i);
        }
        if ((i2 & 16) == 16) {
            this.f12728c.mo10626a(i);
        }
    }

    public C4870b(AbstractC4867a.AbstractC4869b bVar, AbstractC1204m mVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(mVar, "");
        this.f12727b = new C4871c(bVar, mVar, this.f12729d);
        this.f12728c = new C4892g(bVar, mVar, this.f12729d);
    }
}
