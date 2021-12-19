package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14182g;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dy */
final /* synthetic */ class RunnableC70750dy implements Runnable {

    /* renamed from: a */
    private final C70748dw f158369a;

    /* renamed from: b */
    private final Integer f158370b;

    /* renamed from: c */
    private final C14206w f158371c;

    static {
        Covode.recordClassIndex(83221);
    }

    RunnableC70750dy(C70748dw dwVar, Integer num, C14206w wVar) {
        this.f158369a = dwVar;
        this.f158370b = num;
        this.f158371c = wVar;
    }

    public final void run() {
        C70748dw dwVar = this.f158369a;
        Integer num = this.f158370b;
        C14206w wVar = this.f158371c;
        C84401c.f188722f.mo123658a("StartRecordingCommandEventHandlerFactory:startRecordWithResult:".concat(String.valueOf(num)));
        if (num.intValue() != 0) {
            int intValue = num.intValue();
            C84401c.f188722f.mo123658a("StartRecordingCommandEventHandlerFactory:onStartRecordFailed ".concat(String.valueOf(intValue)));
            dwVar.f158362b.mo116657a(new AbstractC14182g.C14184b(intValue));
            C85052j.m146241a(dwVar.f158361a, (int) R.string.fc8).mo129996a();
            C14207x xVar = new C14207x("start record failed, error code: ".concat(String.valueOf(intValue)));
            xVar.f34485a = 1;
            dwVar.f158362b.mo22889b(xVar);
        } else if (!dwVar.f158362b.f166640n.f7727a.getValue().booleanValue()) {
            C74172g<?> gVar = dwVar.f158362b;
            C89219l.m154721d(wVar, "");
            if (!gVar.f166628b.f166673n.invoke().booleanValue()) {
                new C74172g.RunnableC74189d().run();
            } else {
                gVar.mo116654S().mo56912a(gVar.mo116645J());
            }
            gVar.mo116643H().mo22794ab();
            wVar.f34484c.putInt("cameraId", gVar.mo116653R());
            wVar.f34484c.putString("cameraLensInfo", gVar.mo116643H().mo22793aa());
            C84401c.f188722f.mo123658a("set hasStopped to false, cur Speed: " + wVar.f34482a);
            gVar.f166631e.mo6999a(wVar);
            gVar.f166629c.mo109891d().begin(wVar.f34482a, wVar.f34484c);
        }
    }
}
