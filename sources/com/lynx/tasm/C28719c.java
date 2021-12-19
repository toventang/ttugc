package com.lynx.tasm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.p2054c.C28726d;
import com.lynx.tasm.p2054c.C28728f;
import com.lynx.tasm.p2054c.C28731i;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.c */
public class C28719c {

    /* renamed from: a */
    ArrayList<AbstractC28721b> f67729a = new ArrayList<>();

    /* renamed from: b */
    public AbstractC28720a f67730b;

    /* renamed from: c */
    private TemplateAssembler f67731c;

    /* renamed from: com.lynx.tasm.c$a */
    public interface AbstractC28720a {
        static {
            Covode.recordClassIndex(34814);
        }
    }

    /* renamed from: com.lynx.tasm.c$b */
    public interface AbstractC28721b {
        static {
            Covode.recordClassIndex(34815);
        }

        /* renamed from: a */
        void mo49057a(EnumC28722c cVar, C28726d dVar);
    }

    static {
        Covode.recordClassIndex(34813);
    }

    /* renamed from: com.lynx.tasm.c$c */
    public enum EnumC28722c {
        kLynxEventTypeTouchEvent,
        kLynxEventTypeCustomEvent,
        kLynxEventTypeLayoutEvent;

        static {
            Covode.recordClassIndex(34816);
        }
    }

    /* renamed from: b */
    public final void mo49837b(C28724b bVar) {
        TemplateAssembler templateAssembler = this.f67731c;
        if (templateAssembler != null) {
            templateAssembler.mo48761a(bVar);
        }
    }

    public C28719c(TemplateAssembler templateAssembler) {
        this.f67731c = templateAssembler;
    }

    /* renamed from: a */
    public final void mo49834a(C28724b bVar) {
        TemplateAssembler templateAssembler = this.f67731c;
        if (templateAssembler != null) {
            templateAssembler.mo48761a(bVar);
        }
        mo49833a(EnumC28722c.kLynxEventTypeCustomEvent, bVar);
    }

    /* renamed from: a */
    public final void mo49835a(C28728f fVar) {
        MethodCollector.m26663i(1485);
        TemplateAssembler templateAssembler = this.f67731c;
        if (templateAssembler != null) {
            if (templateAssembler.f66692g) {
                LLog.m56856a(6, "TemplateAssembler", "SendInternalEvent: id " + fVar.f67743b + " tag: " + fVar.f67742a);
                MethodCollector.m26664o(1485);
                return;
            }
            templateAssembler.nativeSendInternalEvent(templateAssembler.f66686a, fVar.f67742a, fVar.f67743b, null, 0);
        }
        MethodCollector.m26664o(1485);
    }

    /* renamed from: a */
    public final void mo49836a(C28731i iVar) {
        MethodCollector.m26663i(1477);
        if (this.f67731c != null) {
            if (this.f67730b != null) {
                "tap".equals(iVar.f67739e);
            }
            TemplateAssembler templateAssembler = this.f67731c;
            String str = iVar.f67739e;
            if (templateAssembler.f66692g) {
                LLog.m56856a(6, "TemplateAssembler", "SendTouchEvent: " + str + " error: TemplateAssemble is destroyed.");
                MethodCollector.m26664o(1477);
                return;
            }
            templateAssembler.nativeSendTouchEvent(templateAssembler.f66686a, str, iVar.f67738d, iVar.f67744a.f67747a, iVar.f67744a.f67748b, iVar.f67745b.f67747a, iVar.f67745b.f67748b, iVar.f67746c.f67747a, iVar.f67746c.f67748b);
        }
        MethodCollector.m26664o(1477);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49833a(EnumC28722c cVar, C28726d dVar) {
        Iterator<AbstractC28721b> it = this.f67729a.iterator();
        while (it.hasNext()) {
            it.next().mo49057a(cVar, dVar);
        }
    }
}
