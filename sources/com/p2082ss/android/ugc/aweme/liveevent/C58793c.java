package com.p2082ss.android.ugc.aweme.liveevent;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.AbstractC17765f;
import com.bytedance.ies.powerpermissions.C17773l;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18871a;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18873b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89117j;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89308j;

/* renamed from: com.ss.android.ugc.aweme.liveevent.c */
public final class C58793c {

    /* renamed from: c */
    public static final C58795b f133808c = new C58795b((byte) 0);

    /* renamed from: d */
    private static final String[] f133809d = {"LOCAL", "com.android.huawei.phone", "com.xiaomi"};

    /* renamed from: a */
    public boolean f133810a;

    /* renamed from: b */
    public final Context f133811b;

    /* renamed from: com.ss.android.ugc.aweme.liveevent.c$b */
    public static final class C58795b {
        static {
            Covode.recordClassIndex(69105);
        }

        private C58795b() {
        }

        public /* synthetic */ C58795b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.liveevent.c$a */
    public static final class C58794a {

        /* renamed from: a */
        public final long f133812a;

        /* renamed from: b */
        public final String f133813b;

        /* renamed from: c */
        public final String f133814c;

        /* renamed from: d */
        public final String f133815d;

        /* renamed from: e */
        public final String f133816e;

        /* renamed from: f */
        public final int f133817f;

        /* renamed from: g */
        public final String f133818g;

        static {
            Covode.recordClassIndex(69104);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C58794a)) {
                return false;
            }
            C58794a aVar = (C58794a) obj;
            return this.f133812a == aVar.f133812a && C89219l.m154714a(this.f133813b, aVar.f133813b) && C89219l.m154714a(this.f133814c, aVar.f133814c) && C89219l.m154714a(this.f133815d, aVar.f133815d) && C89219l.m154714a(this.f133816e, aVar.f133816e) && this.f133817f == aVar.f133817f && C89219l.m154714a(this.f133818g, aVar.f133818g);
        }

        public final String toString() {
            return "Calendar(id=" + this.f133812a + ", name=" + this.f133813b + ", displayName=" + this.f133814c + ", accountType=" + this.f133815d + ", accountName=" + this.f133816e + ", visible=" + this.f133817f + ", ownerAccount=" + this.f133818g + ")";
        }

        private /* synthetic */ C58794a() {
            this(0, null, null, null, null, 0, null);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            long j = this.f133812a;
            int i5 = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f133813b;
            int i6 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i7 = (i5 + i) * 31;
            String str2 = this.f133814c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 31;
            String str3 = this.f133815d;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 31;
            String str4 = this.f133816e;
            if (str4 != null) {
                i4 = str4.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (((i9 + i4) * 31) + this.f133817f) * 31;
            String str5 = this.f133818g;
            if (str5 != null) {
                i6 = str5.hashCode();
            }
            return i10 + i6;
        }

        public C58794a(long j, String str, String str2, String str3, String str4, int i, String str5) {
            this.f133812a = j;
            this.f133813b = str;
            this.f133814c = str2;
            this.f133815d = str3;
            this.f133816e = str4;
            this.f133817f = i;
            this.f133818g = str5;
        }
    }

    static {
        Covode.recordClassIndex(69103);
    }

    /* renamed from: a */
    public final AbstractC88403ab<Boolean> mo96177a() {
        AbstractC88403ab<Boolean> a = AbstractC88403ab.m153596a((AbstractC88407af) new C58796c(this)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.p2082ss.android.ugc.aweme.liveevent.C58793c.C58794a> m107990b() {
        /*
            r17 = this;
            r4 = 12384(0x3060, float:1.7354E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            android.net.Uri r12 = android.provider.CalendarContract.Calendars.CONTENT_URI
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r12, r0)
            java.lang.String r5 = "_id"
            java.lang.String r6 = "name"
            java.lang.String r7 = "calendar_displayName"
            java.lang.String r8 = "account_name"
            java.lang.String r9 = "account_type"
            java.lang.String r10 = "visible"
            java.lang.String r11 = "ownerAccount"
            java.lang.String[] r13 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11}
            r0 = r17
            android.content.Context r0 = r0.f133811b
            android.content.ContentResolver r11 = r0.getContentResolver()
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0054
            r2 = r3
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x0042 }
            com.ss.android.ugc.aweme.liveevent.c$d r0 = new com.ss.android.ugc.aweme.liveevent.c$d     // Catch:{ all -> 0x0042 }
            r1 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0042 }
            h.l.h r0 = p4600h.p4621l.C89309k.m154791a(r0)     // Catch:{ all -> 0x0042 }
            java.util.List r0 = p4600h.p4621l.C89309k.m154813g(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x004f
        L_0x0042:
            r1 = move-exception
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)     // Catch:{ all -> 0x0047 }
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            p4600h.p4610e.C89146c.m154636a(r3, r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        L_0x004f:
            p4600h.p4610e.C89146c.m154636a(r3, r1)
            if (r0 != 0) goto L_0x0056
        L_0x0054:
            h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0056:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.liveevent.C58793c.m107990b():java.util.List");
    }

    public C58793c(Context context) {
        C89219l.m154721d(context, "");
        this.f133811b = context;
    }

    /* renamed from: a */
    private final ActivityC0945e m107989a(Context context) {
        while (!(context instanceof Application)) {
            if (context instanceof ActivityC0945e) {
                return (ActivityC0945e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C89219l.m154716b(context, "");
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.c$c */
    static final class C58796c<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ C58793c f133819a;

        static {
            Covode.recordClassIndex(69106);
        }

        C58796c(C58793c cVar) {
            this.f133819a = cVar;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<Boolean> adVar) {
            boolean z;
            boolean z2;
            C89219l.m154721d(adVar, "");
            if (C0643b.m2367a(this.f133819a.f133811b, "android.permission.READ_CALENDAR") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (C0643b.m2367a(this.f133819a.f133811b, "android.permission.WRITE_CALENDAR") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                adVar.mo142931a((Boolean) false);
            } else {
                adVar.mo142931a((Boolean) true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.c$e */
    static final class C58798e<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ C58793c f133823a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f133824b;

        static {
            Covode.recordClassIndex(69108);
        }

        C58798e(C58793c cVar, ActivityC0945e eVar) {
            this.f133823a = cVar;
            this.f133824b = eVar;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<Integer> adVar) {
            C89219l.m154721d(adVar, "");
            C17773l.f42440d.mo28243a(this.f133824b, null).mo28229a("android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR").mo28230a(new AbstractC17765f(this) {
                /* class com.p2082ss.android.ugc.aweme.liveevent.C58793c.C58798e.C587991 */

                /* renamed from: a */
                final /* synthetic */ C58798e f133825a;

                static {
                    Covode.recordClassIndex(69109);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.ad */
                /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.powerpermissions.AbstractC17765f
                /* renamed from: a */
                public final void mo28241a(C17749a... aVarArr) {
                    C89219l.m154721d(aVarArr, "");
                    for (C17749a aVar : aVarArr) {
                        if (aVar.f42426b != C17749a.EnumC17750a.GRANTED) {
                            adVar.mo142931a((Object) -1);
                            return;
                        }
                    }
                    this.f133825a.f133823a.f133810a = true;
                    adVar.mo142931a((Object) 0);
                }

                {
                    this.f133825a = r1;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.c$f */
    static final class C58800f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C58793c f133827a;

        /* renamed from: b */
        final /* synthetic */ C58803e f133828b;

        static {
            Covode.recordClassIndex(69110);
        }

        C58800f(C58793c cVar, C58803e eVar) {
            this.f133827a = cVar;
            this.f133828b = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            C89219l.m154721d(num, "");
            if (num.intValue() == 0) {
                return AbstractC88403ab.m153604a((Callable) new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.liveevent.C58793c.C58800f.CallableC588011 */

                    /* renamed from: a */
                    final /* synthetic */ C58800f f133829a;

                    static {
                        Covode.recordClassIndex(69111);
                    }

                    {
                        this.f133829a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.f133829a.f133827a.mo96176a(this.f133829a.f133828b);
                    }
                }).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a));
            }
            C51423a.m95792b("CalendarManager", "no permission to add calendar event");
            return AbstractC88403ab.m153603a((Throwable) new Exception("user denied calendar permission"));
        }
    }

    /* renamed from: b */
    public final AbstractC88403ab<EnumC58802d> mo96178b(C58803e eVar) {
        C89219l.m154721d(eVar, "");
        ActivityC0945e a = m107989a(this.f133811b);
        if (a == null) {
            AbstractC88403ab<EnumC58802d> a2 = AbstractC88403ab.m153602a(EnumC58802d.Failed);
            C89219l.m154716b(a2, "");
            return a2;
        }
        AbstractC88403ab<EnumC58802d> a3 = AbstractC88403ab.m153596a((AbstractC88407af) new C58798e(this, a)).mo142921b((Object) -1).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142914a((AbstractC88434g) new C58800f(this, eVar));
        C89219l.m154716b(a3, "");
        return a3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.liveevent.c$d */
    public static final class C58797d extends AbstractC89117j implements AbstractC89183m<AbstractC89308j<? super C58794a>, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f133820a;

        /* renamed from: b */
        final /* synthetic */ Cursor f133821b;

        /* renamed from: c */
        private /* synthetic */ Object f133822c;

        static {
            Covode.recordClassIndex(69107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58797d(Cursor cursor, AbstractC89124d dVar) {
            super(2, dVar);
            this.f133821b = cursor;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C58797d dVar2 = new C58797d(this.f133821b, dVar);
            dVar2.f133822c = obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89308j<? super C58794a> jVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C58797d) create(jVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC89308j jVar;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f133820a;
            if (i == 0) {
                C89382r.m154942a(obj);
                jVar = (AbstractC89308j) this.f133822c;
            } else if (i == 1) {
                jVar = (AbstractC89308j) this.f133822c;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (this.f133821b.moveToNext()) {
                C58794a aVar2 = new C58794a(this.f133821b.getLong(0), this.f133821b.getString(1), this.f133821b.getString(2), this.f133821b.getString(4), this.f133821b.getString(3), this.f133821b.getInt(5), this.f133821b.getString(6));
                this.f133822c = jVar;
                this.f133820a = 1;
                if (jVar.mo143699a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final EnumC58802d mo96176a(C58803e eVar) {
        String str;
        Long l;
        T t;
        T t2;
        C89219l.m154721d(eVar, "");
        try {
            C58792b bVar = eVar.f133833b;
            if (bVar == null) {
                return EnumC58802d.ArgumentError;
            }
            String str2 = bVar.f133800a;
            if (str2 == null) {
                return EnumC58802d.ArgumentError;
            }
            C58792b bVar2 = eVar.f133833b;
            if (!(bVar2 == null || (str = eVar.f133832a) == null)) {
                if (str.length() != 0) {
                    String str3 = bVar2.f133800a;
                    if (str3 != null) {
                        if (str3.length() != 0) {
                            String str4 = bVar2.f133801b;
                            if (str4 != null) {
                                if (str4.length() != 0) {
                                    if (bVar2.f133803d > 0 && bVar2.f133804e > 0 && bVar2.f133803d <= bVar2.f133804e) {
                                        if (!this.f133810a) {
                                            C51423a.m95792b("CalendarManager", "no calendar permission");
                                            return EnumC58802d.NoPermission;
                                        }
                                        List<C58794a> b = m107990b();
                                        Iterator<T> it = b.iterator();
                                        while (true) {
                                            l = null;
                                            if (!it.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it.next();
                                            if (C89064i.m154489a(f133809d, t.f133815d)) {
                                                break;
                                            }
                                        }
                                        T t3 = t;
                                        if (t3 == null) {
                                            Iterator<T> it2 = b.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    t2 = null;
                                                    break;
                                                }
                                                t2 = it2.next();
                                                T t4 = t2;
                                                String str5 = t4.f133815d;
                                                if (str5 != null) {
                                                    int hashCode = str5.hashCode();
                                                    if (hashCode == -1116924142) {
                                                        if (str5.equals("My calendar") && C89219l.m154714a((Object) t4.f133816e, (Object) "My calendar") && C89219l.m154714a((Object) t4.f133818g, (Object) "My calendar")) {
                                                            break;
                                                        }
                                                    } else if (hashCode == 879034182) {
                                                        if (str5.equals(C18871a.f44691d) && t4.f133816e != null && C89219l.m154714a((Object) t4.f133816e, (Object) t4.f133818g)) {
                                                            break;
                                                        }
                                                    } else if (hashCode == 1664859374) {
                                                        if (str5.equals(C18871a.f44689b) && C89219l.m154714a((Object) t4.f133818g, (Object) C18871a.f44690c)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            t3 = t2;
                                            if (t3 == null) {
                                                return EnumC58802d.Failed;
                                            }
                                        }
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("calendar_id", Long.valueOf(t3.f133812a));
                                        TimeZone timeZone = TimeZone.getDefault();
                                        C89219l.m154716b(timeZone, "");
                                        contentValues.put("eventTimezone", timeZone.getID());
                                        contentValues.put("dtstart", Long.valueOf(bVar.f133803d));
                                        contentValues.put("dtend", Long.valueOf(bVar.f133804e));
                                        contentValues.put("title", bVar.f133801b);
                                        contentValues.put("description", bVar.f133802c);
                                        contentValues.put(C18873b.f44703b, str2);
                                        ContentResolver contentResolver = this.f133811b.getContentResolver();
                                        Uri uri = CalendarContract.Events.CONTENT_URI;
                                        C89219l.m154716b(uri, "");
                                        Uri build = uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "com.bytedance").appendQueryParameter("account_type", "LOCAL").build();
                                        C89219l.m154716b(build, "");
                                        Uri insert = contentResolver.insert(build, contentValues);
                                        if (insert == null) {
                                            return EnumC58802d.Failed;
                                        }
                                        C89219l.m154716b(insert, "");
                                        if (bVar.f133805f != null) {
                                            String lastPathSegment = insert.getLastPathSegment();
                                            if (lastPathSegment != null) {
                                                l = Long.valueOf(Long.parseLong(lastPathSegment));
                                            }
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("minutes", bVar.f133805f);
                                            contentValues2.put("event_id", l);
                                            contentValues2.put("method", (Integer) 1);
                                            this.f133811b.getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues2);
                                        }
                                        return EnumC58802d.Success;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C51423a.m95792b("CalendarManager", "invalid event params: ".concat(String.valueOf(bVar)));
            return EnumC58802d.ArgumentError;
        } catch (Exception unused) {
            C51423a.m95792b("CalendarManager", "failed to add calendar event");
            return EnumC58802d.Failed;
        }
    }
}
