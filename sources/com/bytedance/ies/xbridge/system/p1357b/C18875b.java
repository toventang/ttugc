package com.bytedance.ies.xbridge.system.p1357b;

import android.content.Context;
import androidx.core.app.C0607l;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.system.p1356a.AbstractC18846b;
import com.bytedance.ies.xbridge.system.p1361c.C18896b;
import com.bytedance.ies.xbridge.system.p1361c.C18898c;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.b */
public final class C18875b extends AbstractC18846b {

    /* renamed from: com.bytedance.ies.xbridge.system.b.b$a */
    public enum EnumC18876a {
        CAMERA("android.permission.CAMERA"),
        MICROPHONE("android.permission.RECORD_AUDIO"),
        PHOTOALBUM("android.permission.READ_EXTERNAL_STORAGE"),
        VIBRATE("android.permission.VIBRATE"),
        READ_CALENDAR("android.permission.READ_CALENDAR"),
        WRITE_CALENDAR("android.permission.WRITE_CALENDAR"),
        NOTIFICATION(""),
        UNKNOWN(null);
        
        public static final C18877a Companion = new C18877a((byte) 0);

        /* renamed from: b */
        private final String f44706b;

        /* renamed from: com.bytedance.ies.xbridge.system.b.b$a$a */
        public static final class C18877a {
            static {
                Covode.recordClassIndex(21587);
            }

            private C18877a() {
            }

            public /* synthetic */ C18877a(byte b) {
                this();
            }

            /* renamed from: a */
            public static EnumC18876a m35076a(String str) {
                if (str == null) {
                    return EnumC18876a.UNKNOWN;
                }
                try {
                    String upperCase = str.toUpperCase();
                    C89219l.m154709a((Object) upperCase, "");
                    return EnumC18876a.valueOf(upperCase);
                } catch (Exception unused) {
                    return EnumC18876a.UNKNOWN;
                }
            }
        }

        public final String getPermission() {
            return this.f44706b;
        }

        static {
            Covode.recordClassIndex(21586);
        }

        private EnumC18876a(String str) {
            this.f44706b = str;
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.system.b.b$b */
    public enum EnumC18878b {
        PERMITTED,
        DENIED,
        UNDETERMINED,
        RESTRICTED;

        static {
            Covode.recordClassIndex(21588);
        }
    }

    static {
        Covode.recordClassIndex(21585);
    }

    @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18846b
    /* renamed from: a */
    public final void mo29832a(C18896b bVar, AbstractC18846b.AbstractC18847a aVar, EnumC18483e eVar) {
        boolean z;
        String name;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String str = bVar.f44734a;
        if (str == null) {
            C89219l.m154710a("permission");
        }
        EnumC18876a a = EnumC18876a.C18877a.m35076a(str);
        if (a == EnumC18876a.UNKNOWN) {
            aVar.mo29833a(-3, "Illegal permission");
            return;
        }
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29833a(0, "Context not provided in host");
            return;
        }
        if (a == EnumC18876a.NOTIFICATION) {
            try {
                z = C0607l.m2289a(context).mo2639a();
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            C18898c cVar = new C18898c();
            if (z) {
                name = EnumC18878b.PERMITTED.name();
                if (name == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                name = EnumC18878b.DENIED.name();
                if (name == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            String lowerCase = name.toLowerCase();
            C89219l.m154709a((Object) lowerCase, "");
            cVar.f44736a = lowerCase;
            aVar.mo29834a((AbstractC18846b.AbstractC18847a) cVar, (C18898c) "");
        }
        String permission = a.getPermission();
        if (permission == null) {
            return;
        }
        if (C0643b.m2367a(context, permission) == 0) {
            C18898c cVar2 = new C18898c();
            String name2 = EnumC18878b.PERMITTED.name();
            if (name2 != null) {
                String lowerCase2 = name2.toLowerCase();
                C89219l.m154709a((Object) lowerCase2, "");
                cVar2.f44736a = lowerCase2;
                aVar.mo29834a((AbstractC18846b.AbstractC18847a) cVar2, (C18898c) "");
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        C18898c cVar3 = new C18898c();
        String name3 = EnumC18878b.DENIED.name();
        if (name3 != null) {
            String lowerCase3 = name3.toLowerCase();
            C89219l.m154709a((Object) lowerCase3, "");
            cVar3.f44736a = lowerCase3;
            aVar.mo29834a((AbstractC18846b.AbstractC18847a) cVar3, (C18898c) "");
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
