package com.bytedance.android.monitorV2.lynx.p741a;

import android.view.View;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.lynx.C12155c;
import com.bytedance.android.monitorV2.lynx.p741a.C12137a;
import com.bytedance.android.monitorV2.lynx.p741a.C12141c;
import com.bytedance.android.monitorV2.lynx.p741a.C12145d;
import com.bytedance.android.monitorV2.lynx.p742b.C12152b;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12165a;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12166b;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12167c;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p739k.C12118a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23500c;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import java.lang.reflect.Field;
import java.util.List;
import java.util.TimerTask;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.android.monitorV2.lynx.a.b */
public final class C12139b extends TimerTask {

    /* renamed from: a */
    public final String f29174a = "LynxViewBlankChecker";

    /* renamed from: b */
    public boolean f29175b = true;

    /* renamed from: c */
    public double f29176c = 0.05d;

    /* renamed from: d */
    public final LynxView f29177d;

    /* renamed from: e */
    public C12141c.AbstractC12144c f29178e;

    static {
        Covode.recordClassIndex(13868);
    }

    public final void run() {
        String str;
        if (this.f29177d.getWidth() != 0 && this.f29177d.getHeight() != 0) {
            try {
                Field declaredField = LynxView.class.getDeclaredField("mLynxTemplateRender");
                C89219l.m154709a((Object) declaredField, "");
                declaredField.setAccessible(true);
                if (((LynxTemplateRender) declaredField.get(this.f29177d)) == null) {
                    return;
                }
            } catch (Exception unused) {
            }
            if (this.f29175b || HybridMultiMonitor.isDebuggable()) {
                LynxView lynxView = this.f29177d;
                C89219l.m154719c(lynxView, "");
                C12137a aVar = new C12137a();
                aVar.f29157a = lynxView.getTemplateUrl();
                aVar.f29159c = lynxView.getWidth();
                aVar.f29160d = lynxView.getHeight();
                aVar.f29161e = C89241a.m154730a(lynxView.getAlpha() * 100.0f);
                C12145d.f29189a.put(lynxView, aVar);
            }
            C12166b c = C12155c.f29212j.f29218d.mo19536b(this.f29177d);
            if (c != null) {
                str = c.f29010b;
            } else {
                str = null;
            }
            C12155c.f29212j.mo19529b(str, "blank");
            long currentTimeMillis = System.currentTimeMillis();
            LynxView lynxView2 = this.f29177d;
            C12140a aVar2 = new C12140a(this, currentTimeMillis);
            C89219l.m154719c(lynxView2, "");
            C89219l.m154719c("", "");
            C23500c.m44201b(lynxView2, "", C12141c.f29182a, new C12141c.C12142a(aVar2), new C12141c.C12143b(lynxView2, aVar2));
        }
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.b$a */
    public static final class C12140a implements C12141c.AbstractC12144c {

        /* renamed from: a */
        public C12165a f29179a = new C12165a();

        /* renamed from: b */
        final /* synthetic */ C12139b f29180b;

        /* renamed from: c */
        final /* synthetic */ long f29181c;

        static {
            Covode.recordClassIndex(13869);
        }

        C12140a(C12139b bVar, long j) {
            this.f29180b = bVar;
            this.f29181c = j;
        }

        @Override // com.bytedance.android.monitorV2.lynx.p741a.C12141c.AbstractC12144c
        /* renamed from: a */
        public final void mo19510a(View view, String str, float f) {
            String str2;
            List<C12137a.C12138a> list;
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            C12152b a = C12155c.f29212j.f29217c.mo19514a(this.f29180b.f29177d);
            String str3 = null;
            if (a != null) {
                str2 = a.f29205c;
            } else {
                str2 = null;
            }
            int i = 0;
            if (C89219l.m154714a((Object) "detect_when_detach", (Object) str2)) {
                this.f29179a.f29267h = 0;
            } else {
                if (a != null) {
                    str3 = a.f29205c;
                }
                if (C89219l.m154714a((Object) "detect_when_load_success", (Object) str3)) {
                    this.f29179a.f29267h = 1;
                }
            }
            this.f29179a.f29261b = f;
            this.f29179a.f29262c = view.getHeight();
            this.f29179a.f29263d = view.getWidth();
            this.f29179a.f29270k = C89241a.m154730a(view.getAlpha() * 100.0f);
            C12165a aVar = this.f29179a;
            C12137a aVar2 = C12145d.f29189a.get(view);
            if (!(aVar2 == null || (list = aVar2.f29163g) == null)) {
                i = list.size();
            }
            aVar.f29271l = i;
            if (((double) f) <= this.f29180b.f29176c) {
                LynxView lynxView = this.f29180b.f29177d;
                C89219l.m154719c(lynxView, "");
                C12137a aVar3 = C12145d.f29189a.get(lynxView);
                if (aVar3 != null) {
                    aVar3.f29158b = f;
                }
                LynxView lynxView2 = this.f29180b.f29177d;
                C89219l.m154719c(lynxView2, "");
                C12137a aVar4 = C12145d.f29189a.get(lynxView2);
                if (aVar4 != null) {
                    C12093a.m21523a(new C12145d.C12146a(aVar4));
                }
            }
            C12141c.AbstractC12144c cVar = this.f29180b.f29178e;
            if (cVar != null) {
                cVar.mo19510a(view, str, f);
            }
            C12115b.m21583b(this.f29180b.f29174a, "effectivePercentage: " + this.f29179a.f29261b + ", height: " + this.f29179a.f29262c + ", width: " + this.f29179a.f29263d + ", alpha: " + this.f29179a.f29270k + ", elementCount: " + this.f29179a.f29271l);
        }

        @Override // com.bytedance.android.monitorV2.lynx.p741a.C12141c.AbstractC12144c
        /* renamed from: a */
        public final void mo19511a(View view, String str, long j, long j2) {
            C12166b c;
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            this.f29179a.f29264e = System.currentTimeMillis() - this.f29181c;
            this.f29179a.f29265f = j;
            this.f29179a.f29266g = j2;
            this.f29179a.f29268i = 0;
            this.f29179a.f29269j = this.f29181c;
            C12155c cVar = C12155c.f29212j;
            LynxView lynxView = (LynxView) view;
            C12165a aVar = this.f29179a;
            C89219l.m154719c(lynxView, "");
            C89219l.m154719c(aVar, "");
            C12115b.m21583b("LynxViewMonitor", "reportBlank");
            C12152b a = cVar.f29217c.mo19514a(lynxView);
            if (!(a == null || (c = cVar.f29218d.mo19536b(lynxView)) == null)) {
                C12081a a2 = C12118a.m21594a(lynxView);
                C12167c cVar2 = (C12167c) cVar.f29219e.mo19536b(lynxView);
                if (cVar2 != null) {
                    aVar.f29268i = cVar2.f29275a;
                }
                c.mo19442a(cVar.mo19528b(lynxView), cVar.mo19519a(lynxView));
                cVar.mo19526a(C12093a.m21522a(), new C12155c.C12158c(cVar, lynxView, c, a2, aVar, a));
            }
            C12141c.AbstractC12144c cVar3 = this.f29180b.f29178e;
            if (cVar3 != null) {
                cVar3.mo19511a(view, str, j, j2);
            }
        }
    }

    public C12139b(LynxView lynxView, C12141c.AbstractC12144c cVar) {
        C89219l.m154719c(lynxView, "");
        this.f29177d = lynxView;
        this.f29178e = cVar;
    }
}
