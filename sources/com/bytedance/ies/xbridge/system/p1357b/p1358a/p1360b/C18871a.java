package com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.CalendarContract;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1359a.C18870b;
import com.bytedance.ies.xbridge.system.p1361c.C18906g;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89117j;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89308j;

/* renamed from: com.bytedance.ies.xbridge.system.b.a.b.a */
public final class C18871a {

    /* renamed from: a */
    public static final String[] f44688a = {"LOCAL", "com.android.huawei.phone", "com.xiaomi"};

    /* renamed from: b */
    public static final String f44689b = f44689b;

    /* renamed from: c */
    public static final String f44690c = f44690c;

    /* renamed from: d */
    public static final String f44691d = f44691d;

    /* renamed from: e */
    public static final String f44692e = "My calendar";

    /* renamed from: f */
    public static final String f44693f = "My calendar";

    /* renamed from: g */
    public static final String f44694g = "My calendar";

    /* renamed from: h */
    public static final C18871a f44695h = new C18871a();

    /* renamed from: i */
    private static final String f44696i = f44696i;

    private C18871a() {
    }

    static {
        Covode.recordClassIndex(21581);
    }

    /* renamed from: com.bytedance.ies.xbridge.system.b.a.b.a$a */
    static final class C18872a extends AbstractC89117j implements AbstractC89183m<AbstractC89308j<? super C18870b>, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f44697a;

        /* renamed from: b */
        Object f44698b;

        /* renamed from: c */
        int f44699c;

        /* renamed from: d */
        final /* synthetic */ Cursor f44700d;

        /* renamed from: e */
        private AbstractC89308j f44701e;

        static {
            Covode.recordClassIndex(21582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18872a(Cursor cursor, AbstractC89124d dVar) {
            super(2, dVar);
            this.f44700d = cursor;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C18872a aVar = new C18872a(this.f44700d, dVar);
            aVar.f44701e = (AbstractC89308j) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89308j<? super C18870b> jVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C18872a) create(jVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC89308j jVar;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f44699c;
            if (i == 0) {
                C89382r.m154942a(obj);
                jVar = this.f44701e;
            } else if (i == 1) {
                jVar = (AbstractC89308j) this.f44697a;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (this.f44700d.moveToNext()) {
                C18870b bVar = new C18870b(this.f44700d.getLong(0), this.f44700d.getString(1), this.f44700d.getString(2), this.f44700d.getString(4), this.f44700d.getString(3), this.f44700d.getInt(5), this.f44700d.getString(6));
                this.f44697a = jVar;
                this.f44698b = bVar;
                this.f44699c = 1;
                if (jVar.mo143699a(bVar, this) == aVar) {
                    return aVar;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.ies.xbridge.system.p1357b.p1358a.p1359a.C18870b> m35072a(android.content.ContentResolver r17) {
        /*
            r4 = 4650(0x122a, float:6.516E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            android.net.Uri r12 = android.provider.CalendarContract.Calendars.CONTENT_URI
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154709a(r12, r0)
            java.lang.String r5 = "_id"
            java.lang.String r6 = "name"
            java.lang.String r7 = "calendar_displayName"
            java.lang.String r8 = "account_name"
            java.lang.String r9 = "account_type"
            java.lang.String r10 = "visible"
            java.lang.String r11 = "ownerAccount"
            java.lang.String[] r13 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11}
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r17
            android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x004e
            r2 = r3
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x003c }
            com.bytedance.ies.xbridge.system.b.a.b.a$a r0 = new com.bytedance.ies.xbridge.system.b.a.b.a$a     // Catch:{ all -> 0x003c }
            r1 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003c }
            h.l.h r0 = p4600h.p4621l.C89309k.m154791a(r0)     // Catch:{ all -> 0x003c }
            java.util.List r0 = p4600h.p4621l.C89309k.m154813g(r0)     // Catch:{ all -> 0x003c }
            goto L_0x0049
        L_0x003c:
            r1 = move-exception
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            p4600h.p4610e.C89146c.m154636a(r3, r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        L_0x0049:
            p4600h.p4610e.C89146c.m154636a(r3, r1)
            if (r0 != 0) goto L_0x0050
        L_0x004e:
            h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0050:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18871a.m35072a(android.content.ContentResolver):java.util.List");
    }

    /* renamed from: a */
    public static boolean m35073a(C18906g gVar, ContentResolver contentResolver) {
        MethodCollector.m26663i(4653);
        String a = C89064i.m154484a(new String[]{"title=?", "description=?", "sync_data2=?", "sync_data3=?", "dtstart=?", "dtend=?", "sync_data4=?"}, " and ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        boolean z = false;
        String[] strArr = {gVar.f44748d, gVar.f44749e, gVar.f44752h, gVar.f44753i, String.valueOf(gVar.f44746b), String.valueOf(gVar.f44745a), String.valueOf(gVar.f44751g)};
        Cursor query = contentResolver.query(CalendarContract.Events.CONTENT_URI, new String[]{"title", "description", "sync_data2", "sync_data3", "dtstart", "dtend", "sync_data4", "_id"}, a, strArr, null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    z = true;
                }
                C89146c.m154636a(query, null);
                MethodCollector.m26664o(4653);
                return z;
            } catch (Throwable th) {
                C89146c.m154636a(query, th);
                MethodCollector.m26664o(4653);
                throw th;
            }
        } else {
            MethodCollector.m26664o(4653);
            return false;
        }
    }
}
