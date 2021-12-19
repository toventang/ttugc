package com.bytedance.lynx.hybrid.p1518d;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1519e.C21187d;
import com.lynx.devtoolwrapper.AbstractC28335e;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.LynxEnv;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.d.b */
public final class C21174b {

    /* renamed from: a */
    public static final C21174b f50226a = new C21174b();

    /* renamed from: b */
    private static boolean f50227b = true;

    /* renamed from: c */
    private static final List<AbstractC21173a> f50228c = new ArrayList();

    /* renamed from: d */
    private static final C21175a f50229d = new C21175a();

    /* renamed from: com.bytedance.lynx.hybrid.d.b$a */
    public static final class C21175a implements AbstractC28335e {
        static {
            Covode.recordClassIndex(24791);
        }

        C21175a() {
        }
    }

    private C21174b() {
    }

    static {
        Covode.recordClassIndex(24790);
        try {
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just Warning: No Devtool Dependency found, add lynx_devtool if needs").printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m39869a() {
        if (f50227b) {
            LynxEnv.m56706b().mo48566a(true);
            if (!C21187d.f50267c) {
                LynxEnv.m56706b().mo48567b(true);
            }
            LynxDevtoolGlobalHelper.getInstance().registerCardListener(f50229d);
        }
    }

    /* renamed from: a */
    public static void m39870a(AbstractC21173a aVar) {
        C89219l.m154719c(aVar, "");
        f50228c.add(aVar);
    }
}
