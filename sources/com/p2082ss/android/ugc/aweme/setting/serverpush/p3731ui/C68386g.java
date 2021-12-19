package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.p3070im.C53602f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.NotificationManagerServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56212h;
import com.p2082ss.android.ugc.aweme.setting.p3713a.C67968a;
import com.p2082ss.android.ugc.aweme.setting.p3717e.C68075a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.cell.CommonItemViewCell;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68365i;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68368j;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68375m;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3730c.C68376a;
import com.p2082ss.android.ugc.aweme.setting.services.C68431e;
import com.p2082ss.android.ugc.aweme.setting.services.C68434h;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68616a;
import com.p2082ss.android.ugc.aweme.setting.utils.C68689d;
import com.p2082ss.android.ugc.aweme.setting.utils.C68695j;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.g */
public final class C68386g extends AbstractC34586a implements AbstractC68350b, AbstractC68351c {

    /* renamed from: A */
    C40937d f153070A;

    /* renamed from: B */
    C40937d f153071B;

    /* renamed from: C */
    C40937d f153072C;

    /* renamed from: D */
    C68415n f153073D;

    /* renamed from: E */
    C68616a f153074E;

    /* renamed from: F */
    C68368j f153075F;

    /* renamed from: G */
    C68365i f153076G;

    /* renamed from: H */
    PackageManager f153077H;

    /* renamed from: I */
    public JSONObject f153078I;

    /* renamed from: J */
    private C68375m f153079J;

    /* renamed from: K */
    private List<C68415n> f153080K = new ArrayList();

    /* renamed from: L */
    private C88960c<C68415n> f153081L;

    /* renamed from: M */
    private boolean f153082M = false;

    /* renamed from: N */
    private List<String> f153083N;

    /* renamed from: O */
    private NotificationManager f153084O;

    /* renamed from: P */
    private Keva f153085P = null;

    /* renamed from: a */
    TextView f153086a;

    /* renamed from: b */
    ImageView f153087b;

    /* renamed from: c */
    C68415n f153088c;

    /* renamed from: d */
    C68415n f153089d;

    /* renamed from: e */
    PowerList f153090e;

    /* renamed from: j */
    C43047dm f153091j;

    /* renamed from: k */
    C68415n f153092k;

    /* renamed from: l */
    C68415n f153093l;

    /* renamed from: m */
    C68415n f153094m;

    /* renamed from: n */
    C68415n f153095n;

    /* renamed from: o */
    C68415n f153096o;

    /* renamed from: p */
    C68415n f153097p;

    /* renamed from: q */
    C68415n f153098q;

    /* renamed from: r */
    C68415n f153099r;

    /* renamed from: s */
    C68415n f153100s;

    /* renamed from: t */
    C68415n f153101t;

    /* renamed from: u */
    C68415n f153102u;

    /* renamed from: v */
    C68415n f153103v;

    /* renamed from: w */
    C40937d f153104w;

    /* renamed from: y */
    C40937d f153105y;

    /* renamed from: z */
    C40937d f153106z;

    static {
        Covode.recordClassIndex(80615);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void aD_() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.g$a */
    public static class C68389a {

        /* renamed from: a */
        public String f153111a;

        /* renamed from: b */
        public boolean f153112b;

        /* renamed from: c */
        public boolean f153113c;

        static {
            Covode.recordClassIndex(80618);
        }

        /* renamed from: a */
        public final boolean mo108828a() {
            if (!this.f153112b || !this.f153113c) {
                return false;
            }
            return true;
        }

        public C68389a(String str) {
            this.f153111a = str;
        }
    }

    /* renamed from: c */
    public final Keva mo108826c() {
        if (this.f153085P == null) {
            this.f153085P = Keva.getRepo("need_sync");
        }
        return this.f153085P;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void cm_() {
        new C23144b(this).mo37640e(R.string.dck).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f153075F.ck_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.g$2 */
    static /* synthetic */ class C683882 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153110a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 80617(0x13ae9, float:1.12968E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.setting.serverpush.b.l[] r0 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68386g.C683882.f153110a = r2
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l.WITH_TEXT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68386g.C683882.f153110a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68386g.C683882.<clinit>():void");
        }
    }

    /* renamed from: e */
    private C88960c<C68415n> m120676e() {
        if (this.f153081L == null) {
            C88960c<C68415n> cVar = new C88960c<>();
            this.f153081L = cVar;
            cVar.mo143291d(400, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C68394l(this));
        }
        return this.f153081L;
    }

    /* renamed from: d */
    private void m120675d() {
        C68389a aVar;
        String string = mo108826c().getString("need_sync_channel_name", "");
        if (this.f153078I != null && !TextUtils.isEmpty(string) && mo108825a(string)) {
            C68415n b = m120672b(string);
            if (!(b == null || (aVar = (C68389a) ((C34800h) b.f95762k).f82204g) == null || aVar.f153112b)) {
                int i = 1;
                b.mo108844b(true);
                C68434h.f153192a.mo108582a(aVar.f153111a, 1);
                aVar.f153112b = true;
                try {
                    JSONObject jSONObject = this.f153078I;
                    String str = aVar.f153111a;
                    if (!aVar.f153112b) {
                        i = 0;
                    }
                    jSONObject.put(str, i);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                m120676e().onNext(b);
            }
            mo108826c().storeString("need_sync_channel_name", "");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f153079J.mo108820a(C80428fg.m139432a(getContext()));
        boolean a = C80428fg.m139432a(getContext());
        this.f153092k.mo70129c(a);
        this.f153093l.mo70129c(a);
        this.f153094m.mo70129c(a);
        this.f153095n.mo70129c(a);
        this.f153089d.mo70129c(a);
        this.f153096o.mo70129c(a);
        this.f153097p.mo70129c(a);
        this.f153098q.mo70129c(a);
        this.f153099r.mo70129c(a);
        this.f153102u.mo70129c(a);
        this.f153074E.mo70129c(a);
        this.f153073D.mo70129c(a);
        this.f153101t.mo70129c(a);
        if (this.f153078I != null) {
            for (C68415n nVar : this.f153080K) {
                try {
                    m120668a(nVar, this.f153078I.getInt(((C68389a) ((C34800h) nVar.f95762k).f82204g).f153111a));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        m120675d();
    }

    /* renamed from: a */
    public static boolean m120670a(Context context) {
        if (C80428fg.m139432a(context)) {
            return true;
        }
        C80429fh.m139440a(context, true, null, true);
        return false;
    }

    /* renamed from: c */
    private static boolean m120674c(String str) {
        if (!C68695j.m121130b()) {
            return true;
        }
        String[] c = C68695j.m121131c();
        if (c.length != 0) {
            return m120671a(c, str);
        }
        return true;
    }

    /* renamed from: b */
    private C68415n m120672b(String str) {
        for (C68415n nVar : this.f153080K) {
            C68389a aVar = (C68389a) ((C34800h) nVar.f95762k).f82204g;
            if (aVar != null && TextUtils.equals(str, aVar.f153111a)) {
                return nVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m120673b(C68348f fVar) {
        if (this.f153082M) {
            fVar.f152987i = 0;
            fVar.f152990l = 0;
            fVar.f152993o = 0;
        }
        m120668a(this.f153092k, fVar.f152964a);
        m120668a(this.f153093l, fVar.f152980b);
        m120668a(this.f153094m, fVar.f152981c);
        m120668a(this.f153095n, fVar.f152982d);
        m120668a(this.f153089d, fVar.f152978an);
        m120668a(this.f153096o, fVar.f152986h);
        m120668a(this.f153097p, fVar.f152987i);
        m120668a(this.f153098q, fVar.f152988j);
        m120668a(this.f153099r, fVar.f152992n);
        m120668a(this.f153102u, fVar.f152993o);
        m120668a(this.f153103v, fVar.f152994p);
        m120668a(this.f153073D, fVar.f152990l);
        m120668a(this.f153101t, fVar.f152991m);
        NotificationManagerServiceImpl.m101386d().mo90141c(Integer.valueOf(fVar.f152990l));
        m120675d();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68831a(C68348f fVar) {
        try {
            this.f153078I = new JSONObject(C80342dg.m139300a().mo46674b(fVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m120673b(fVar);
        C68434h.f153192a.mo108583a(this.f153078I);
        m120675d();
    }

    /* renamed from: a */
    public final boolean mo108825a(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = this.f153084O.getNotificationChannel(m120667a(str, C68695j.m121129a()))) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m120668a(C68415n nVar, int i) {
        C68389a aVar = (C68389a) ((C34800h) nVar.f95762k).f82204g;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        aVar.f153112b = z;
        aVar.f153113c = mo108825a(aVar.f153111a);
        nVar.mo108844b(aVar.mo108828a());
    }

    /* renamed from: a */
    private void m120669a(final C68415n nVar, String str) {
        final C68389a aVar = new C68389a(str);
        nVar.mo108841a(aVar);
        nVar.mo108840a(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68386g.View$OnClickListenerC683871 */

            static {
                Covode.recordClassIndex(80616);
            }

            public final void onClick(View view) {
                String str;
                String curUserId;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                if (C68386g.this.af_() && C68386g.this.getContext() != null) {
                    C68389a aVar = (C68389a) ((C34800h) nVar.f95762k).f82204g;
                    String str4 = aVar.f153111a;
                    if (C68386g.m120670a(C68386g.this.getContext())) {
                        int i = 0;
                        String str5 = "off";
                        if (TextUtils.equals(str4, "live_inner_push")) {
                            if (((C34800h) nVar.f95762k).f82200c) {
                                str3 = str5;
                            } else {
                                str3 = "on";
                            }
                            C53602f.m98841b(str3);
                            NotificationManagerServiceImpl.m101386d().mo90141c(Integer.valueOf(!((C34800h) nVar.f95762k).f82200c ? 1 : 0));
                        } else if (TextUtils.equals(str4, "im_inner_push")) {
                            if (((C34800h) nVar.f95762k).f82200c) {
                                str2 = str5;
                            } else {
                                str2 = "on";
                            }
                            C53602f.m98838a(str2);
                            NotificationManagerServiceImpl.m101386d().mo90138b(Integer.valueOf(!((C34800h) nVar.f95762k).f82200c ? 1 : 0));
                        } else if (TextUtils.equals(str4, "im_push")) {
                            if (((C34800h) nVar.f95762k).f82200c) {
                                str = str5;
                            } else {
                                str = "on";
                            }
                            C53602f.m98838a(str);
                            NotificationManagerServiceImpl.m101386d().mo90134a(Integer.valueOf(!((C34800h) nVar.f95762k).f82200c ? 1 : 0));
                            Boolean valueOf = Boolean.valueOf(((C34800h) nVar.f95762k).f82200c);
                            IAccountUserService e = AccountService.m65215a().mo57069e();
                            if (AccountService.m65215a().mo57069e() == null) {
                                curUserId = "-1";
                            } else {
                                curUserId = e.getCurUserId();
                            }
                            SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "imbase_".concat(String.valueOf(Long.parseLong(curUserId.toString()))), 0);
                            if (valueOf.booleanValue()) {
                                a.edit().putBoolean("key_mt_inner_push_switch_on", false).commit();
                            } else {
                                a.edit().putBoolean("key_mt_inner_push_switch_on", true).commit();
                            }
                        } else if (!C68386g.m120670a(C68386g.this.getContext())) {
                            return;
                        }
                        if (Build.VERSION.SDK_INT < 26 || C68386g.this.mo108825a(str4)) {
                            boolean z = !((C34800h) nVar.f95762k).f82200c ? 1 : 0;
                            nVar.mo108844b(z);
                            aVar.f153112b = z;
                            C68434h.f153192a.mo108582a(str4, z ? 1 : 0);
                            C68386g.this.f153076G.mo57616a(aVar.f153111a, Integer.valueOf(aVar.f153112b ? 1 : 0));
                            try {
                                if (C68386g.this.f153078I != null) {
                                    JSONObject jSONObject = C68386g.this.f153078I;
                                    String str6 = aVar.f153111a;
                                    if (aVar.f153112b) {
                                        i = 1;
                                    }
                                    jSONObject.put(str6, i);
                                }
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            if (z) {
                                str5 = "on";
                            }
                            C39162r.m79460a("notification_switch", new C33744d().mo59983a("label", str4).mo59983a("to_status", str5).f79943a);
                            return;
                        }
                        if (!aVar.f153112b && !aVar.f153113c) {
                            C68386g.this.mo108826c().storeString("need_sync_channel_name", str4);
                        }
                        C68386g gVar = C68386g.this;
                        if (Build.VERSION.SDK_INT >= 26) {
                            String a2 = C68386g.m120667a(str4, C68695j.m121129a());
                            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                            intent.setFlags(268435456);
                            intent.putExtra("android.provider.extra.APP_PACKAGE", C17867d.m33078a().getPackageName());
                            intent.putExtra("android.provider.extra.CHANNEL_ID", a2);
                            if (gVar.f153077H == null) {
                                gVar.f153077H = C17867d.m33078a().getPackageManager();
                            }
                            if (gVar.f153077H.resolveActivity(intent, 65536) != null) {
                                gVar.startActivity(intent);
                            }
                        }
                    }
                }
            }
        });
        this.f153080K.add(nVar);
    }

    /* renamed from: a */
    private static Object m120666a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5645);
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
                    MethodCollector.m26664o(5645);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static String m120667a(String str, int i) {
        m120674c(str);
        if (i == 0) {
            int a = C68695j.m121129a();
            if (a != 0 && m120674c(str)) {
                return str + "_associated_" + a;
            }
            return str;
        } else if (m120674c(str)) {
            return str + "_associated_" + i;
        } else {
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m120671a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        this.f153086a = (TextView) view.findViewById(R.id.title);
        this.f153087b = (ImageView) view.findViewById(R.id.pi);
        this.f153090e = (PowerList) view.findViewById(R.id.dau);
        this.f153088c = new C68415n(new C34800h(getString(R.string.ez_), new View$OnClickListenerC68390h(this), (byte) 0));
        this.f153092k = new C68415n(new C34800h(getString(R.string.ez7)));
        this.f153093l = new C68415n(new C34800h(getString(R.string.ez6), "item_push_comment"));
        this.f153094m = new C68415n(new C34800h(getString(R.string.ez8), "item_push_follow"));
        this.f153095n = new C68415n(new C34800h(getString(R.string.ez5)));
        this.f153089d = new C68415n(new C34800h(getString(R.string.f6r), (View.OnClickListener) null));
        this.f153096o = new C68415n(new C34800h(getString(R.string.ez9)));
        this.f153097p = new C68415n(new C34800h(getString(R.string.ezd)));
        this.f153098q = new C68415n(new C34800h(getString(R.string.ezj)));
        this.f153099r = new C68415n(new C34800h(getString(R.string.ezc)));
        this.f153100s = new C68415n(new C34800h(getString(R.string.acb), (View.OnClickListener) null));
        this.f153101t = new C68415n(new C34800h(getString(R.string.f05), (View.OnClickListener) null));
        this.f153102u = new C68415n(new C34800h(getString(R.string.fop)));
        this.f153103v = new C68415n(new C34800h(getString(R.string.f5y)));
        this.f153104w = new C40937d(new C34797e(getString(R.string.ezf)));
        this.f153105y = new C40937d(new C34797e(getString(R.string.ezf), false, false));
        this.f153106z = new C40937d(new C34797e(getString(R.string.ezg)));
        this.f153070A = new C40937d(new C34797e(getString(R.string.ezh)));
        this.f153071B = new C40937d(new C34797e(getString(R.string.eze)));
        this.f153072C = new C40937d(new C34797e(getString(R.string.foo)));
        this.f153073D = new C68415n(new C34800h(getString(R.string.acd)));
        this.f153074E = new C68616a(new C68546a(0, getString(R.string.edt), new View$OnClickListenerC68391i(this), null));
        C43047dm dmVar = new C43047dm(this.f153090e);
        this.f153091j = dmVar;
        dmVar.f100359a.mo28083a(CommonItemViewCell.class);
        this.f153091j.mo73247a(this.f153088c);
        this.f153091j.mo73247a(this.f153104w);
        this.f153091j.mo73247a(this.f153105y);
        this.f153091j.mo73247a(this.f153092k);
        this.f153091j.mo73247a(this.f153093l);
        this.f153091j.mo73247a(this.f153094m);
        this.f153091j.mo73247a(this.f153095n);
        this.f153091j.mo73247a(this.f153089d);
        this.f153091j.mo73247a(this.f153106z);
        this.f153091j.mo73247a(this.f153099r);
        this.f153091j.mo73247a(this.f153100s);
        this.f153091j.mo73247a(this.f153101t);
        this.f153091j.mo73247a(this.f153070A);
        this.f153091j.mo73247a(this.f153096o);
        this.f153091j.mo73247a(this.f153097p);
        this.f153091j.mo73247a(this.f153071B);
        this.f153091j.mo73247a(this.f153098q);
        this.f153091j.mo73247a(this.f153073D);
        this.f153091j.mo73247a(this.f153074E);
        this.f153091j.mo73247a(this.f153072C);
        this.f153091j.mo73247a(this.f153103v);
        this.f153091j.mo73247a(this.f153102u);
        this.f153092k.mo108843b(getString(R.string.ma));
        this.f153103v.mo108845c(getString(R.string.f5z));
        View findViewById = view.findViewById(R.id.pi);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC68392j(this));
        }
        super.onViewCreated(view, bundle);
        this.f153084O = (NotificationManager) m120666a(C17867d.m33078a(), "notification");
        this.f153082M = TextUtils.equals(getArguments().getString("enter_from"), "policy_notice");
        this.f153079J = new C68375m();
        this.f153086a.setText(R.string.fl4);
        this.f153079J.f153024a.observe(this, new C68393k(this));
        this.f153098q.mo70127a(false);
        this.f153074E.mo70127a(true);
        this.f153074E.mo109131a(2131233762);
        m120669a(this.f153092k, "digg_push");
        m120669a(this.f153093l, "comment_push");
        m120669a(this.f153094m, "follow_push");
        m120669a(this.f153095n, "mention_push");
        m120669a(this.f153089d, "friend_upvote_push");
        m120669a(this.f153096o, "follow_new_video_push");
        m120669a(this.f153097p, "recommend_video_push");
        m120669a(this.f153098q, "live_push");
        m120669a(this.f153099r, "im_push");
        m120669a(this.f153102u, "other_channel");
        m120669a(this.f153073D, "live_inner_push");
        m120669a(this.f153103v, "friend_suggestions");
        m120669a(this.f153101t, "im_push_preview");
        this.f153099r.mo108842a(C17867d.m33078a().getResources().getString(R.string.ezc));
        this.f153098q.mo108842a(C17867d.m33078a().getResources().getString(R.string.ezj));
        this.f153100s.mo70127a(false);
        this.f153100s.mo70127a(false);
        if (C67968a.m120299a()) {
            this.f153073D.mo70127a(true);
        } else {
            this.f153073D.mo70127a(false);
        }
        if (C56212h.m102127a()) {
            this.f153101t.mo70127a(true);
        } else {
            this.f153101t.mo70127a(false);
        }
        if (this.f153083N == null) {
            this.f153083N = C68431e.f153187a.mo108853a();
        }
        List<String> list = this.f153083N;
        if (list != null) {
            C68689d.m121122a(this.f153091j, list);
            this.f153106z.mo70127a(false);
            this.f153070A.mo70127a(false);
            this.f153071B.mo70127a(false);
        }
        C68348f a = C68434h.f153192a.mo108581a();
        if (a != null) {
            m120673b(a);
        }
        C68368j jVar = new C68368j();
        this.f153075F = jVar;
        jVar.mo67839a_(this);
        this.f153075F.mo57616a(new Object[0]);
        C68365i iVar = new C68365i();
        this.f153076G = iVar;
        iVar.mo67839a_(this);
        this.f153076G.f92288j = false;
        this.f153086a.setText(R.string.foc);
        this.f153088c.mo108842a(getContext().getString(R.string.foc));
        this.f153104w.mo70134a(getString(R.string.fog));
        this.f153104w.mo70127a(false);
        this.f153105y.mo70134a(getString(R.string.fog));
        this.f153105y.mo70127a(true);
        this.f153092k.mo108842a(getContext().getString(R.string.foh));
        this.f153093l.mo108842a(getContext().getString(R.string.fod));
        this.f153094m.mo108842a(getContext().getString(R.string.fof));
        C68415n nVar = this.f153095n;
        Context context = getContext();
        if (C36410g.m74113d()) {
            i = R.string.d21;
        } else {
            i = R.string.fok;
        }
        nVar.mo108842a(context.getString(i));
        this.f153106z.mo70134a(getString(R.string.fol));
        if (C68376a.m120654a()) {
            this.f153089d.mo70127a(true);
            this.f153089d.mo108842a(C68376a.m120655b());
        } else {
            this.f153089d.mo70127a(false);
        }
        this.f153099r.mo108842a(getContext().getString(R.string.foe));
        this.f153070A.mo70134a(getString(R.string.fou));
        this.f153096o.mo108842a(getContext().getString(R.string.fov));
        this.f153097p.mo108842a(getContext().getString(R.string.fow));
        this.f153071B.mo70134a(getString(R.string.foi));
        this.f153098q.mo108842a(getContext().getString(R.string.foj));
        this.f153073D.mo108842a(getContext().getString(R.string.u7));
        this.f153072C.mo70134a(getString(R.string.foo));
        if (!C16048b.m29633a().mo25421a(true, "enable_other_push_settings", false)) {
            this.f153072C.mo70127a(false);
            this.f153102u.mo70127a(false);
        } else {
            this.f153072C.mo70127a(true);
            this.f153102u.mo70127a(true);
            if (C68075a.m120374a()) {
                this.f153103v.mo70127a(true);
                return;
            }
        }
        this.f153103v.mo70127a(false);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.axz, viewGroup, false);
    }
}
