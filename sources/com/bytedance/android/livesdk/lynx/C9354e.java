package com.bytedance.android.livesdk.lynx;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.lynx.p568b.C9342a;
import com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a;
import com.bytedance.android.livesdk.lynx.p570ui.C9431c;
import com.bytedance.android.livesdk.lynx.p570ui.C9442d;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.e */
public class C9354e implements AbstractC9352c {
    static {
        Covode.recordClassIndex(10859);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9352c
    public void tryInitEnvIfNeeded() {
        ((IHostAction) C6193a.m13435a(IHostAction.class)).initLynxEnv();
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9352c
    public AbstractC9376a createLynxFragment(Context context, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bundle, "");
        C9442d dVar = new C9442d();
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9352c
    public AbstractC9341b create(Activity activity, Integer num, String str, AbstractC9353d dVar, String str2) {
        Object obj;
        C89219l.m154721d(activity, "");
        try {
            obj = C89379q.m157068constructorimpl(new C9431c(activity, null, num, str, null, dVar, false, str2, 82));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Throwable r3 = C89379q.m157071exceptionOrNullimpl(obj);
        if (r3 != null) {
            C9342a.EnumC9343a aVar = C9342a.EnumC9343a.INIT_FAILED;
            StringWriter stringWriter = new StringWriter();
            r3.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            C89219l.m154716b(stringWriter2, "");
            C9342a.m17606a(aVar, stringWriter2);
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        return (AbstractC9341b) obj;
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9352c
    public AbstractC9341b createAndLoad(Activity activity, String str, Integer num, String str2, String str3, AbstractC9353d dVar) {
        Object obj;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        try {
            obj = C89379q.m157068constructorimpl(new C9431c(activity, str, num, str2, str3, dVar, true, null, 128));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Throwable r3 = C89379q.m157071exceptionOrNullimpl(obj);
        if (r3 != null) {
            C9342a.EnumC9343a aVar = C9342a.EnumC9343a.INIT_FAILED;
            StringWriter stringWriter = new StringWriter();
            r3.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            C89219l.m154716b(stringWriter2, "");
            C9342a.m17606a(aVar, stringWriter2);
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        return (AbstractC9341b) obj;
    }
}
