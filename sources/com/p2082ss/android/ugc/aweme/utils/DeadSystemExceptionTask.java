package com.p2082ss.android.ugc.aweme.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21706a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21710c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21712d;
import com.bytedance.platform.godzilla.p1586d.C21722a;
import com.bytedance.platform.godzilla.p1586d.C21728g;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.DeadSystemExceptionTask */
public class DeadSystemExceptionTask implements AbstractC58264w {

    /* renamed from: a */
    public static AbstractC58264w f179611a = new DeadSystemExceptionTask();

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(93419);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C67214a.m119160j()) {
            return EnumC58151ae.BACKGROUND;
        }
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (context != null && (context instanceof Application)) {
            C21710c cVar = new C21710c();
            try {
                Class<?> cls = Class.forName("android.hardware.display.DisplayManagerGlobal");
                Object obj = C21722a.m40681a(cls, "sInstance").get(null);
                Field a = C21722a.m40681a(cls, "mDm");
                Object obj2 = a.get(obj);
                cVar.mo35354a(obj2);
                a.set(obj, C21728g.m40693a(obj2, cVar));
                a.get(obj).getClass().getName();
                C21689g.m40635a(C21689g.EnumC21691a.ERROR);
            } catch (Exception unused) {
            }
            if (Build.VERSION.SDK_INT >= 29) {
                new C21712d().mo35362a((Application) context);
                new C21706a().mo35360a();
            }
            Npth.setAttachUserData(new C80254bl(), CrashType.ALL);
        }
    }
}
