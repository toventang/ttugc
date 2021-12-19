package com.p2082ss.android.ugc.aweme.tools.p4082b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.p4082b.p4083a.C77809a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.tools.b.g */
public final class C77816g {

    /* renamed from: a */
    public static Map<EnumC77815f, AbstractC77812c> f174565a = new ConcurrentHashMap();

    /* renamed from: b */
    public static boolean f174566b;

    /* renamed from: c */
    private static final AbstractC77812c f174567c = new C77809a();

    static {
        Covode.recordClassIndex(90901);
    }

    /* renamed from: a */
    private static AbstractC77812c m135929a(EnumC77815f fVar) {
        AbstractC77812c cVar = f174565a.get(fVar);
        if (cVar == null) {
            return f174567c;
        }
        return cVar;
    }

    /* renamed from: a */
    private static String m135930a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m135932a(Intent intent, AbstractC77808a aVar) {
        EnumC77815f[] values = EnumC77815f.values();
        for (EnumC77815f fVar : values) {
            aVar.mo114970a(fVar, m135930a(intent, fVar.intentKey));
        }
    }

    /* renamed from: a */
    public static void m135931a(Intent intent, Intent intent2, EnumC77814e eVar, EnumC77814e eVar2) {
        EnumC77815f[] values = EnumC77815f.values();
        for (EnumC77815f fVar : values) {
            intent2.putExtra(fVar.intentKey, m135929a(fVar).mo121394a(m135930a(intent, fVar.intentKey), eVar, eVar2));
        }
    }

    /* renamed from: a */
    public static void m135933a(Intent intent, AbstractC77811b bVar, EnumC77814e eVar, EnumC77814e eVar2) {
        EnumC77815f[] values = EnumC77815f.values();
        for (EnumC77815f fVar : values) {
            intent.putExtra(fVar.intentKey, m135929a(fVar).mo121394a(bVar.mo114971a(fVar), eVar, eVar2));
        }
    }

    /* renamed from: a */
    public static void m135934a(AbstractC77811b bVar, AbstractC77808a aVar, EnumC77814e eVar, EnumC77814e eVar2) {
        EnumC77815f[] values = EnumC77815f.values();
        for (EnumC77815f fVar : values) {
            aVar.mo114970a(fVar, m135929a(fVar).mo121394a(bVar.mo114971a(fVar), eVar, eVar2));
        }
    }
}
