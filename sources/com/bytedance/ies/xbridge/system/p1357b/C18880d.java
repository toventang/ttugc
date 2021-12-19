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
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.system.activity.GetPermissionActivity;
import com.bytedance.ies.xbridge.system.p1356a.AbstractC18853d;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18873b;
import com.bytedance.ies.xbridge.system.p1361c.C18902e;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.d */
public final class C18880d extends AbstractC18853d {

    /* renamed from: a */
    private final String f44708a;

    static {
        Covode.recordClassIndex(21590);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.system.b.d$a */
    public static final class CallableC18881a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C18902e f44709a;

        /* renamed from: b */
        final /* synthetic */ ContentResolver f44710b;

        static {
            Covode.recordClassIndex(21591);
        }

        CallableC18881a(C18902e eVar, ContentResolver contentResolver) {
            this.f44709a = eVar;
            this.f44710b = contentResolver;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(C18873b.C18874a.m35074a(this.f44709a, this.f44710b));
        }
    }

    public C18880d() {
        String b = C89204ab.m154669a(C18880d.class).mo143613b();
        this.f44708a = b == null ? "XRemoveCalendarEventMethod" : b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.system.b.d$c */
    public static final class C18883c<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC18853d.AbstractC18854a f44712a;

        static {
            Covode.recordClassIndex(21593);
        }

        C18883c(AbstractC18853d.AbstractC18854a aVar) {
            this.f44712a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f44712a.mo29840a("delete calendar failed with unknown error.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.system.b.d$b */
    public static final class C18882b<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC18853d.AbstractC18854a f44711a;

        static {
            Covode.recordClassIndex(21592);
        }

        C18882b(AbstractC18853d.AbstractC18854a aVar) {
            this.f44711a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            C89219l.m154709a((Object) bool2, "");
            if (bool2.booleanValue()) {
                this.f44711a.mo29839a(new C18745b(), "");
            } else {
                this.f44711a.mo29840a("delete calendar Failed.");
            }
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.system.b.d$d */
    public static final class C18884d extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C18880d f44713a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18853d.AbstractC18854a f44714b;

        /* renamed from: c */
        final /* synthetic */ C18902e f44715c;

        /* renamed from: d */
        final /* synthetic */ ContentResolver f44716d;

        static {
            Covode.recordClassIndex(21594);
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                this.f44714b.mo29840a("have no permission");
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
                        C18880d.m35079a(this.f44715c, this.f44714b, this.f44716d);
                        return;
                    }
                } else if (action.equals("GetPermissionActivity.permission_denied")) {
                    if (context != null) {
                        context.unregisterReceiver(this);
                    }
                    this.f44714b.mo29840a("user denied permission");
                    return;
                }
            }
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f44714b.mo29840a("unable to continue to next");
        }

        C18884d(C18880d dVar, AbstractC18853d.AbstractC18854a aVar, C18902e eVar, ContentResolver contentResolver) {
            this.f44713a = dVar;
            this.f44714b = aVar;
            this.f44715c = eVar;
            this.f44716d = contentResolver;
        }
    }

    /* renamed from: a */
    private static Intent m35078a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static void m35079a(C18902e eVar, AbstractC18853d.AbstractC18854a aVar, ContentResolver contentResolver) {
        C89219l.m154709a((Object) AbstractC88403ab.m153604a((Callable) new CallableC18881a(eVar, contentResolver)).mo142909a(C88392a.m153583a()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142915a(new C18882b(aVar), new C18883c(aVar)), "");
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
    private static android.content.Intent m35080b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m35078a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.p1357b.C18880d.m35080b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18853d
    /* renamed from: a */
    public final void mo29838a(C18902e eVar, AbstractC18853d.AbstractC18854a aVar, EnumC18483e eVar2) {
        boolean z;
        boolean z2;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar2, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            ALog.m59866e(this.f44708a, "obtaining context, but got a null.");
            aVar.mo29840a("context is null!!");
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            ALog.m59866e(this.f44708a, "obtaining content resolver but got a null.");
            aVar.mo29840a("contentResolver is null!!");
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
        if ((!z || !z2) && Build.VERSION.SDK_INT >= 23) {
            C18884d dVar = new C18884d(this, aVar, eVar, contentResolver);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("GetPermissionActivity.permission_denied");
            intentFilter.addAction("GetPermissionActivity.permission_granted");
            m35080b(context, dVar, intentFilter);
            Intent intent = new Intent(context, GetPermissionActivity.class);
            intent.putExtra("permissions", new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"});
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return;
        }
        m35079a(eVar, aVar, contentResolver);
    }
}
