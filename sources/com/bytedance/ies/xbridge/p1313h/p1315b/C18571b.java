package com.bytedance.ies.xbridge.p1313h.p1315b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18560b;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18578b;
import com.p2082ss.android.agilelogger.ALog;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.b.b */
public final class C18571b extends AbstractC18560b {

    /* renamed from: a */
    public static final C18572a f44253a = new C18572a((byte) 0);

    static {
        Covode.recordClassIndex(21265);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.b.b$a */
    public static final class C18572a {
        static {
            Covode.recordClassIndex(21266);
        }

        private C18572a() {
        }

        public /* synthetic */ C18572a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18560b
    /* renamed from: a */
    public final void mo29661a(C18578b bVar, AbstractC18560b.AbstractC18561a aVar, EnumC18483e eVar) {
        String str;
        String str2;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String str3 = bVar.f44265b;
        if (str3 == null) {
            C89219l.m154710a("message");
        }
        String str4 = bVar.f44266c;
        if (str4 == null) {
            C89219l.m154710a("tag");
        }
        String str5 = bVar.f44264a;
        if (str5 == null) {
            C89219l.m154710a("level");
        }
        int i = 0;
        C18578b.C18579a aVar2 = bVar.f44267d;
        if (aVar2 != null) {
            i = aVar2.f44270c;
            str = aVar2.f44269b;
            str2 = aVar2.f44268a;
        } else {
            str2 = "";
            str = str2;
        }
        try {
            C89219l.m154719c(str3, "");
            C89219l.m154719c(str4, "");
            C89219l.m154719c(str5, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(str, "");
            String sb = new StringBuilder(str3.length() + 100).append("[").append(str2).append(", ").append(str).append(", ").append(i).append("]").append(str3).toString();
            C89219l.m154709a((Object) sb, "");
            String concat = "web_".concat(String.valueOf(str4));
            switch (str5.hashCode()) {
                case 3237038:
                    if (str5.equals("info")) {
                        ALog.m59869i(concat, sb);
                        aVar.mo29662a(new C18745b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 3641990:
                    if (str5.equals("warn")) {
                        ALog.m59871w(concat, sb);
                        aVar.mo29662a(new C18745b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 95458899:
                    if (str5.equals("debug")) {
                        ALog.m59865d(concat, sb);
                        aVar.mo29662a(new C18745b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 96784904:
                    if (str5.equals("error")) {
                        ALog.m59866e(concat, sb);
                        aVar.mo29662a(new C18745b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 351107458:
                    if (str5.equals("verbose")) {
                        ALog.m59870v(concat, sb);
                        aVar.mo29662a(new C18745b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                default:
                    throw new IllegalArgumentException("Illegal level!");
            }
        } catch (IllegalArgumentException e) {
            ALog.m59873w("XReportALogMethod", e);
            aVar.mo29663a("Level is illegal!");
        }
    }
}
