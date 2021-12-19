package com.bytedance.android.monitor.lynx.p715a;

import android.view.View;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.lynx.p715a.C11958a;
import com.bytedance.android.monitor.lynx.p715a.C11962c;
import com.bytedance.android.monitor.lynx.p715a.C11966d;
import com.bytedance.android.monitor.lynx.p716b.C11980b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11984a;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11985b;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p713k.C11943a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23500c;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import java.lang.reflect.Field;
import java.util.List;
import java.util.TimerTask;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.android.monitor.lynx.a.b */
public final class C11960b extends TimerTask {

    /* renamed from: a */
    public final String f28599a = "LynxViewChecker";

    /* renamed from: b */
    public boolean f28600b = true;

    /* renamed from: c */
    public double f28601c = 0.05d;

    /* renamed from: d */
    public final LynxView f28602d;

    /* renamed from: e */
    public C11962c.AbstractC11965c f28603e;

    static {
        Covode.recordClassIndex(13686);
    }

    public final void run() {
        String str;
        if (this.f28602d.getWidth() != 0 && this.f28602d.getHeight() != 0) {
            try {
                Field declaredField = LynxView.class.getDeclaredField("mLynxTemplateRender");
                C89219l.m154709a((Object) declaredField, "");
                declaredField.setAccessible(true);
                if (((LynxTemplateRender) declaredField.get(this.f28602d)) == null) {
                    return;
                }
            } catch (Exception unused) {
            }
            if (this.f28600b || HybridMonitor.isDebuggable()) {
                LynxView lynxView = this.f28602d;
                C89219l.m154719c(lynxView, "");
                C11958a aVar = new C11958a();
                aVar.f28582a = lynxView.getTemplateUrl();
                aVar.f28584c = lynxView.getWidth();
                aVar.f28585d = lynxView.getHeight();
                aVar.f28586e = C89241a.m154730a(lynxView.getAlpha() * 100.0f);
                C11966d.f28614a.put(lynxView, aVar);
            }
            C11985b c = C11969b.f28620f.f28624b.mo19194b(this.f28602d);
            if (c != null) {
                str = c.f28530b;
            } else {
                str = null;
            }
            C11969b.f28620f.mo19188b(str, "blank");
            long currentTimeMillis = System.currentTimeMillis();
            LynxView lynxView2 = this.f28602d;
            C11961a aVar2 = new C11961a(this, currentTimeMillis);
            C89219l.m154719c(lynxView2, "");
            C89219l.m154719c("", "");
            C23500c.m44200a(lynxView2, "", C11962c.f28607a, new C11962c.C11963a(aVar2), new C11962c.C11964b(lynxView2, aVar2));
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.a.b$a */
    public static final class C11961a implements C11962c.AbstractC11965c {

        /* renamed from: a */
        public C11984a f28604a = new C11984a();

        /* renamed from: b */
        final /* synthetic */ C11960b f28605b;

        /* renamed from: c */
        final /* synthetic */ long f28606c;

        static {
            Covode.recordClassIndex(13687);
        }

        C11961a(C11960b bVar, long j) {
            this.f28605b = bVar;
            this.f28606c = j;
        }

        @Override // com.bytedance.android.monitor.lynx.p715a.C11962c.AbstractC11965c
        /* renamed from: a */
        public final void mo19171a(View view, String str, float f) {
            int i;
            List<C11958a.C11959a> list;
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            this.f28604a.f28690b = f;
            this.f28604a.f28691c = view.getHeight();
            this.f28604a.f28692d = view.getWidth();
            this.f28604a.f28697i = C89241a.m154730a(view.getAlpha() * 100.0f);
            C11984a aVar = this.f28604a;
            C11958a aVar2 = C11966d.f28614a.get(view);
            if (aVar2 == null || (list = aVar2.f28588g) == null) {
                i = 0;
            } else {
                i = list.size();
            }
            aVar.f28698j = i;
            if (((double) f) <= this.f28605b.f28601c) {
                LynxView lynxView = this.f28605b.f28602d;
                C89219l.m154719c(lynxView, "");
                C11958a aVar3 = C11966d.f28614a.get(lynxView);
                if (aVar3 != null) {
                    aVar3.f28583b = f;
                }
                LynxView lynxView2 = this.f28605b.f28602d;
                C89219l.m154719c(lynxView2, "");
                C11958a aVar4 = C11966d.f28614a.get(lynxView2);
                if (aVar4 != null) {
                    C11929a.m21041a(new C11966d.C11967a(aVar4));
                }
            }
            C11962c.AbstractC11965c cVar = this.f28605b.f28603e;
            if (cVar != null) {
                cVar.mo19171a(view, str, f);
            }
            C11937b.m21063b(this.f28605b.f28599a, "effectivePercentage: " + this.f28604a.f28690b + ", height: " + this.f28604a.f28691c + ", width: " + this.f28604a.f28692d + ", alpha: " + this.f28604a.f28697i + ", elementCount: " + this.f28604a.f28698j);
        }

        @Override // com.bytedance.android.monitor.lynx.p715a.C11962c.AbstractC11965c
        /* renamed from: a */
        public final void mo19172a(View view, String str, long j, long j2) {
            C11985b c;
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            this.f28604a.f28693e = System.currentTimeMillis() - this.f28606c;
            this.f28604a.f28694f = j;
            this.f28604a.f28695g = j2;
            C11969b bVar = C11969b.f28620f;
            LynxView lynxView = (LynxView) view;
            C11984a aVar = this.f28604a;
            C89219l.m154719c(lynxView, "");
            C89219l.m154719c(aVar, "");
            C11980b a = bVar.f28623a.mo19190a(lynxView);
            if (!(a == null || (c = bVar.f28624b.mo19194b(lynxView)) == null)) {
                bVar.mo19185a(C11929a.m21040a(), new C11969b.C11972c(bVar, c, C11943a.m21078a(lynxView), aVar, a));
            }
            C11962c.AbstractC11965c cVar = this.f28605b.f28603e;
            if (cVar != null) {
                cVar.mo19172a(view, str, j, j2);
            }
        }
    }

    public C11960b(LynxView lynxView, C11962c.AbstractC11965c cVar) {
        C89219l.m154719c(lynxView, "");
        this.f28602d = lynxView;
        this.f28603e = cVar;
    }
}
