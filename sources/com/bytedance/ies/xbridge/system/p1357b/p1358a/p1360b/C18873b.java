package com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b;

import android.content.ContentResolver;
import android.provider.CalendarContract;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.system.p1361c.C18902e;
import com.p2082ss.android.agilelogger.ALog;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.a.b.b */
public final class C18873b {

    /* renamed from: a */
    public static final String f44702a = f44702a;

    /* renamed from: b */
    public static final String f44703b = f44703b;

    /* renamed from: c */
    public static final C18874a f44704c = new C18874a((byte) 0);

    /* renamed from: com.bytedance.ies.xbridge.system.b.a.b.b$a */
    public static final class C18874a {
        static {
            Covode.recordClassIndex(21584);
        }

        private C18874a() {
        }

        public /* synthetic */ C18874a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m35074a(C18902e eVar, ContentResolver contentResolver) {
            MethodCollector.m26663i(4274);
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(contentResolver, "");
            try {
                String str = C18873b.f44703b + "=?";
                String[] strArr = new String[1];
                String str2 = eVar.f44740a;
                if (str2 == null) {
                    C89219l.m154710a("eventID");
                }
                strArr[0] = str2;
                if (contentResolver.delete(CalendarContract.Events.CONTENT_URI, str, strArr) > 0) {
                    MethodCollector.m26664o(4274);
                    return true;
                }
                MethodCollector.m26664o(4274);
                return false;
            } catch (Throwable th) {
                ALog.m59865d(C18873b.f44702a, "deleteCalendar: error occurs here! msg = " + th.getMessage());
                MethodCollector.m26664o(4274);
                return false;
            }
        }
    }

    static {
        Covode.recordClassIndex(21583);
    }
}
