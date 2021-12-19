package com.bytedance.android.livesdk.chatroom.p489d;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.chatroom.widget.C8187o;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdkapi.p691g.AbstractC11765f;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1206f.C17309b;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.chatroom.d.d */
public final class C7421d implements AbstractC1214u<Boolean>, AbstractC11765f.AbstractC11766a {

    /* renamed from: j */
    private static volatile C7421d f18404j;

    /* renamed from: a */
    public boolean f18405a;

    /* renamed from: b */
    public AbstractC11768h f18406b;

    /* renamed from: c */
    boolean f18407c;

    /* renamed from: d */
    public AbstractC88412b f18408d;

    /* renamed from: e */
    public ViewGroup f18409e;

    /* renamed from: f */
    public boolean f18410f;

    /* renamed from: g */
    public boolean f18411g;

    /* renamed from: h */
    public String f18412h;

    /* renamed from: i */
    public boolean f18413i;

    static {
        Covode.recordClassIndex(8188);
    }

    private C7421d() {
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f.AbstractC11766a
    /* renamed from: c */
    public final void mo13623c() {
        if (this.f18405a) {
            mo13624d();
        }
    }

    /* renamed from: f */
    private String m15307f() {
        return "live.mt.slide_up_guide.need_show." + this.f18412h;
    }

    /* renamed from: a */
    public static C7421d m15306a() {
        MethodCollector.m26663i(4574);
        if (f18404j == null) {
            synchronized (C7421d.class) {
                try {
                    if (f18404j == null) {
                        f18404j = new C7421d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4574);
                    throw th;
                }
            }
        }
        C7421d dVar = f18404j;
        MethodCollector.m26664o(4574);
        return dVar;
    }

    /* renamed from: b */
    public final void mo13622b() {
        if (this.f18405a) {
            this.f18405a = false;
            this.f18409e = null;
            C6905bf.m14776a().mo13210e();
            C6905bf.m14776a().f17292b.removeObserver(this);
            this.f18407c = false;
            this.f18413i = false;
            this.f18410f = false;
            this.f18411g = false;
            AbstractC11768h hVar = this.f18406b;
            if (hVar != null) {
                hVar.mo18712b(this);
                this.f18406b = null;
            }
            AbstractC88412b bVar = this.f18408d;
            if (bVar != null) {
                bVar.dispose();
                this.f18408d = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo13625e() {
        Context e;
        C17309b a;
        if (this.f18405a && (e = C3966y.m9669e()) != null && (a = C17309b.m32048a(e, C17309b.f41588b)) != null) {
            a.mo27623b(m15307f(), false);
        }
    }

    /* renamed from: d */
    public final void mo13624d() {
        C17309b a;
        AbstractC11768h hVar;
        Context e = C3966y.m9669e();
        if (e != null && (a = C17309b.m32048a(e, C17309b.f41588b)) != null) {
            long a2 = a.mo27618a("live.mt.slide_up_guide.last_show", -1L);
            long currentTimeMillis = System.currentTimeMillis();
            if (a2 <= 0 || currentTimeMillis - a2 > 86400000) {
                long a3 = a.mo27618a("live.mt.slide_up_guide.total_show", 0L);
                if (a3 < ((long) LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getMaxShowTimes()) && a.mo27622a(m15307f(), true) && !this.f18413i && !C6905bf.m14776a().mo13209d() && this.f18407c && (hVar = this.f18406b) != null && hVar.mo14898a() >= 2) {
                    C8187o.m16306a(this.f18409e);
                    this.f18410f = true;
                    mo13625e();
                    a.mo27623b("live.mt.slide_up_guide.last_show", Long.valueOf(currentTimeMillis));
                    a.mo27623b("live.mt.slide_up_guide.total_show", Long.valueOf(a3 + 1));
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Boolean bool) {
        Boolean bool2 = bool;
        if (this.f18405a && bool2 != null && bool2.booleanValue()) {
            mo13624d();
        }
    }
}
