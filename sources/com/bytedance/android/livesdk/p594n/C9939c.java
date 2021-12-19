package com.bytedance.android.livesdk.p594n;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.network.p381b.C5801a;
import com.bytedance.android.live.p250i.p252b.C4360b;
import com.bytedance.android.live.p379n.AbstractC5779l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveStreamStrategySdkEnableSetting;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.videoarch.strategy.AbstractC87196a;
import com.p2082ss.videoarch.strategy.LiveStrategyManager;
import com.p2082ss.videoarch.strategy.p4484b.AbstractC87202b;
import com.p2082ss.videoarch.strategy.p4484b.C87203c;
import com.p2082ss.videoarch.strategy.p4484b.C87204d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89392a;

/* renamed from: com.bytedance.android.livesdk.n.c */
public final class C9939c implements AbstractC5779l {

    /* renamed from: a */
    public static final C9940a f24077a = new C9940a((byte) 0);

    /* renamed from: b */
    private static boolean f24078b;

    static {
        Covode.recordClassIndex(11489);
    }

    /* renamed from: com.bytedance.android.livesdk.n.c$a */
    public static final class C9940a {
        static {
            Covode.recordClassIndex(11490);
        }

        private C9940a() {
        }

        public /* synthetic */ C9940a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.n.c$c */
    public static final class C9942c implements AbstractC87196a {
        static {
            Covode.recordClassIndex(11492);
        }

        C9942c() {
        }

        @Override // com.p2082ss.videoarch.strategy.AbstractC87196a
        /* renamed from: a */
        public final <T> T mo16647a(String str, T t) {
            C89219l.m154721d(t, "");
            if (C89219l.m154714a((Object) str, (Object) "TTNet_NQE_INFO")) {
                T t2 = (T) C5801a.m12710a().toString();
                return ((t2 instanceof Object) && t2 != null) ? t2 : t;
            }
            T t3 = (T) C6802e.m14593a(str, t);
            C89219l.m154716b(t3, "");
            return t3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.n.c$d */
    public static final class C9943d implements AbstractC87202b {
        static {
            Covode.recordClassIndex(11493);
        }

        C9943d() {
        }

        @Override // com.p2082ss.videoarch.strategy.p4484b.AbstractC87202b
        /* renamed from: a */
        public final String mo16648a(String str, byte[] bArr, String str2) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            buildUpon.appendQueryParameter("user_id", String.valueOf(b.mo13161c()));
            C11835a a = C5809h.m12739a().mo11585a(buildUpon.toString(), null, str2, bArr).mo18908a();
            C89219l.m154716b(a, "");
            byte[] bArr2 = a.f28196e;
            C89219l.m154716b(bArr2, "");
            return new String(bArr2, C89338d.f202990a);
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5779l
    /* renamed from: a */
    public final void mo11556a() {
        String str;
        Context applicationContext;
        try {
            if (!C89392a.m154946a(((IHostContext) C6193a.m13435a(IHostContext.class)).context())) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (LiveStreamStrategySdkEnableSetting.INSTANCE.getValue() != 0 && !f24078b) {
            if (C6193a.m13435a(IHostApp.class) != null) {
                AbstractC2953a a = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a, "");
                if (!((IHostApp) a).isInMusicallyRegion()) {
                    str = "https://hotapi-sg.tiktokv.com";
                    C87204d.C87205a aVar = new C87204d.C87205a();
                    aVar.f197467a = str;
                    aVar.f197468b = new C9943d();
                    C87203c.m151234a().mo141071a(aVar.mo141072a());
                    LiveStrategyManager inst = LiveStrategyManager.inst();
                    Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
                    C89219l.m154716b(context, "");
                    applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    inst.init(applicationContext);
                    LiveStrategyManager.inst().setAppInfoBundle(new C9942c());
                    LiveStrategyManager.inst().start();
                    f24078b = true;
                }
            }
            str = "https://hotapi-va.tiktokv.com";
            C87204d.C87205a aVar2 = new C87204d.C87205a();
            aVar2.f197467a = str;
            aVar2.f197468b = new C9943d();
            C87203c.m151234a().mo141071a(aVar2.mo141072a());
            LiveStrategyManager inst2 = LiveStrategyManager.inst();
            Context context2 = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
            C89219l.m154716b(context2, "");
            applicationContext = context2.getApplicationContext();
            applicationContext = C58003a.f132199a;
            inst2.init(applicationContext);
            LiveStrategyManager.inst().setAppInfoBundle(new C9942c());
            try {
                LiveStrategyManager.inst().start();
            } catch (Exception unused2) {
            }
            f24078b = true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.n.c$b */
    public static final class C9941b implements C4360b.AbstractC4362b<AbstractC5779l> {
        static {
            Covode.recordClassIndex(11491);
        }

        @Override // com.bytedance.android.live.p250i.p252b.C4360b.AbstractC4362b
        /* renamed from: a */
        public final C4360b.AbstractC4362b.C4363a<AbstractC5779l> mo10117a(C4360b.AbstractC4362b.C4363a<AbstractC5779l> aVar) {
            C89219l.m154721d(aVar, "");
            aVar.f11884a = (R) new C9939c();
            aVar.f11885b = true;
            C89219l.m154716b(aVar, "");
            return aVar;
        }
    }
}
