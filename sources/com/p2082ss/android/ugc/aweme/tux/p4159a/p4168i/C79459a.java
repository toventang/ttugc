package com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.view.C0277d;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tux.a.i.a */
public final class C79459a {

    /* renamed from: b */
    public static final C79460a f178370b = new C79460a((byte) 0);

    /* renamed from: e */
    private static long f178371e;

    /* renamed from: f */
    private static String f178372f;

    /* renamed from: g */
    private static final int f178373g = R.style.nz;

    /* renamed from: a */
    public C23144b f178374a;

    /* renamed from: c */
    private String f178375c;

    /* renamed from: d */
    private final Context f178376d;

    /* renamed from: com.ss.android.ugc.aweme.tux.a.i.a$a */
    public static final class C79460a {
        static {
            Covode.recordClassIndex(92658);
        }

        private C79460a() {
        }

        public /* synthetic */ C79460a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(92657);
    }

    /* renamed from: b */
    private final boolean m138174b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f178371e <= InteractFirstFrameTimeOutDurationSetting.DEFAULT && TextUtils.equals(f178372f, this.f178375c)) {
            return true;
        }
        f178372f = this.f178375c;
        f178371e = currentTimeMillis;
        return false;
    }

    /* renamed from: c */
    private final void m138175c() {
        int i;
        MethodCollector.m26663i(1948);
        Context context = this.f178376d;
        if (context == null) {
            MethodCollector.m26664o(1948);
        } else if (C17873f.f42636l) {
            MethodCollector.m26664o(1948);
        } else {
            C0277d dVar = new C0277d(context, f178373g);
            Toast toast = new Toast(dVar);
            toast.setDuration(0);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            toast.setGravity(55, 0, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
            Object a = m138172a(context, "layout_inflater");
            if (a != null) {
                View inflate = ((LayoutInflater) a).inflate(R.layout.bh0, (ViewGroup) null);
                inflate.findViewById(R.id.dlx).setBackgroundDrawable(C23009f.m43397a(C79461b.f178377a).mo37389a(dVar));
                TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.eu6);
                tuxTextView.setText(this.f178375c);
                Integer a2 = C23155d.m43641a(dVar, R.attr.aa);
                if (a2 != null) {
                    i = a2.intValue();
                } else {
                    i = -1;
                }
                tuxTextView.setTextColor(i);
                toast.setView(inflate);
                m138173a(toast);
                MethodCollector.m26664o(1948);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
            MethodCollector.m26664o(1948);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public final void mo123053a() {
        String str;
        if (!m138174b() && (str = this.f178375c) != null && str.length() != 0) {
            C23144b bVar = this.f178374a;
            if (bVar != null) {
                bVar.mo37637b();
                return;
            }
            try {
                m138175c();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final C79459a mo123051a(long j) {
        C23144b bVar = this.f178374a;
        if (bVar != null) {
            bVar.mo37634a(j);
        }
        return this;
    }

    /* renamed from: a */
    private static void m138173a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    public final C79459a mo123050a(int i) {
        String str;
        Resources resources;
        C23144b bVar = this.f178374a;
        if (bVar != null) {
            bVar.mo37640e(i);
        }
        Context context = this.f178376d;
        if (context == null || (resources = context.getResources()) == null) {
            str = null;
        } else {
            str = resources.getString(i);
        }
        this.f178375c = str;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79459a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.f178376d = r4
            r0 = 0
            if (r4 == 0) goto L_0x0025
        L_0x0008:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0026
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 == 0) goto L_0x0025
            com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
            r1.<init>(r4)
            r3.f178374a = r1
            int r0 = com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a.f178373g
            r1.mo37633a(r0)
            com.bytedance.tux.g.b r2 = r3.f178374a
            if (r2 == 0) goto L_0x0025
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.mo37634a(r0)
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = r4 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0025
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            if (r4 == 0) goto L_0x0025
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final C79459a mo123052a(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        C23144b bVar = this.f178374a;
        if (bVar != null) {
            bVar.mo37635a(charSequence);
        }
        this.f178375c = charSequence.toString();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.a.i.a$b */
    public static final class C79461b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C79461b f178377a = new C79461b();

        static {
            Covode.recordClassIndex(92659);
        }

        C79461b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.bl);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54469h = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system3.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static Object m138172a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2075);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2075);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
