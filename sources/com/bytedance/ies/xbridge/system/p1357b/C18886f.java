package com.bytedance.ies.xbridge.system.p1357b;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.system.activity.GetPermissionActivity;
import com.bytedance.ies.xbridge.system.p1356a.AbstractC18859f;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1359a.EnumC18869a;
import com.bytedance.ies.xbridge.system.p1361c.C18906g;
import com.bytedance.ies.xbridge.system.p1361c.C18908h;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.f */
public final class C18886f extends AbstractC18859f {

    /* renamed from: a */
    public final String f44717a = "XSetCalendarEventMethod";

    static {
        Covode.recordClassIndex(21596);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.system.b.f$a */
    public static final class CallableC18887a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C18886f f44718a;

        /* renamed from: b */
        final /* synthetic */ C18906g f44719b;

        /* renamed from: c */
        final /* synthetic */ ContentResolver f44720c;

        static {
            Covode.recordClassIndex(21597);
        }

        CallableC18887a(C18886f fVar, C18906g gVar, ContentResolver contentResolver) {
            this.f44718a = fVar;
            this.f44719b = gVar;
            this.f44720c = contentResolver;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f44718a.mo29858a(this.f44719b, this.f44720c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.system.b.f$c */
    public static final class C18889c<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC18859f.AbstractC18860a f44722a;

        static {
            Covode.recordClassIndex(21599);
        }

        C18889c(AbstractC18859f.AbstractC18860a aVar) {
            this.f44722a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f44722a.mo29845a(0, "Cannot create calendar event.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.system.b.f$b */
    public static final class C18888b<T> implements AbstractC88433f<C89378p<? extends EnumC18869a, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC18859f.AbstractC18860a f44721a;

        static {
            Covode.recordClassIndex(21598);
        }

        C18888b(AbstractC18859f.AbstractC18860a aVar) {
            this.f44721a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends EnumC18869a, ? extends String> pVar) {
            C89378p<? extends EnumC18869a, ? extends String> pVar2 = pVar;
            if (((EnumC18869a) pVar2.getFirst()).getValue() == EnumC18869a.Success.getValue()) {
                AbstractC18859f.AbstractC18860a aVar = this.f44721a;
                C18908h hVar = new C18908h();
                hVar.f44755a = (String) pVar2.getSecond();
                aVar.mo29846a(hVar, "");
                return;
            }
            this.f44721a.mo29845a(((EnumC18869a) pVar2.getFirst()).getValue(), "Cannot create calendar event. fail code = " + ((EnumC18869a) pVar2.getFirst()).getValue());
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.system.b.f$d */
    public static final class C18890d extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C18886f f44723a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18859f.AbstractC18860a f44724b;

        /* renamed from: c */
        final /* synthetic */ C18906g f44725c;

        /* renamed from: d */
        final /* synthetic */ EnumC18483e f44726d;

        /* renamed from: e */
        final /* synthetic */ ContentResolver f44727e;

        static {
            Covode.recordClassIndex(21600);
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                this.f44724b.mo29845a((AbstractC18859f.AbstractC18860a) 0, "have no permission");
                return;
            }
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != 1063370865) {
                    if (hashCode == 1627606181 && action.equals("GetPermissionActivity.permission_granted")) {
                        if (context != null) {
                            context.unregisterReceiver(this);
                        }
                        this.f44723a.mo29859a(this.f44725c, this.f44724b, this.f44727e);
                        return;
                    }
                } else if (action.equals("GetPermissionActivity.permission_denied")) {
                    if (context != null) {
                        context.unregisterReceiver(this);
                    }
                    ALog.m59865d(this.f44723a.f44717a, "user denied permission");
                    this.f44724b.mo29845a((AbstractC18859f.AbstractC18860a) 0, "user denied permission");
                    return;
                }
            }
            if (context != null) {
                context.unregisterReceiver(this);
            }
            ALog.m59865d(this.f44723a.f44717a, "something unknown happend");
            this.f44724b.mo29845a((AbstractC18859f.AbstractC18860a) 0, "unable to continue to next");
        }

        C18890d(C18886f fVar, AbstractC18859f.AbstractC18860a aVar, C18906g gVar, EnumC18483e eVar, ContentResolver contentResolver) {
            this.f44723a = fVar;
            this.f44724b = aVar;
            this.f44725c = gVar;
            this.f44726d = eVar;
            this.f44727e = contentResolver;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r2.f44687g, (java.lang.Object) com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18871a.f44694g) != false) goto L_0x00bb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4600h.C89378p<com.bytedance.ies.xbridge.system.p1357b.p1358a.p1359a.EnumC18869a, java.lang.String> mo29858a(com.bytedance.ies.xbridge.system.p1361c.C18906g r10, android.content.ContentResolver r11) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.p1357b.C18886f.mo29858a(com.bytedance.ies.xbridge.system.c.g, android.content.ContentResolver):h.p");
    }

    /* renamed from: a */
    private static Intent m35083a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m35084b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m35083a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.p1357b.C18886f.m35084b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: a */
    public final void mo29859a(C18906g gVar, AbstractC18859f.AbstractC18860a aVar, ContentResolver contentResolver) {
        C89219l.m154709a((Object) AbstractC88403ab.m153604a((Callable) new CallableC18887a(this, gVar, contentResolver)).mo142909a(C88392a.m153583a()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142915a(new C18888b(aVar), new C18889c(aVar)), "");
    }

    @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18859f
    /* renamed from: a */
    public final void mo29844a(C18906g gVar, AbstractC18859f.AbstractC18860a aVar, EnumC18483e eVar) {
        boolean z;
        boolean z2;
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29845a((AbstractC18859f.AbstractC18860a) 0, "context is null!!!!");
            ALog.m59866e(this.f44717a, "obtain context, however context == null");
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            aVar.mo29845a((AbstractC18859f.AbstractC18860a) 0, "contentResolver is null!!!!");
            ALog.m59866e(this.f44717a, "obtain contentResolver, however contentResolver == null");
            return;
        }
        if (C0643b.m2367a(context, "android.permission.READ_CALENDAR") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C0643b.m2367a(context, "android.permission.WRITE_CALENDAR") == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z || !z2) && Build.VERSION.SDK_INT > 23) {
            C18890d dVar = new C18890d(this, aVar, gVar, eVar, contentResolver);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("GetPermissionActivity.permission_denied");
            intentFilter.addAction("GetPermissionActivity.permission_granted");
            m35084b(context, dVar, intentFilter);
            Intent intent = new Intent(context, GetPermissionActivity.class);
            intent.putExtra("permissions", new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"});
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return;
        }
        mo29859a(gVar, aVar, contentResolver);
    }
}
