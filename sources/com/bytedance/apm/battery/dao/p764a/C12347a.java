package com.bytedance.apm.battery.dao.p764a;

import android.content.ContentValues;
import com.bytedance.apm.battery.dao.AbstractC12344a;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.List;

/* renamed from: com.bytedance.apm.battery.dao.a.a */
public class C12347a extends AbstractC12344a<C12447a> implements AbstractC12344a.AbstractC12345a<C12447a> {

    /* renamed from: a */
    private static volatile C12347a f29753a;

    /* renamed from: b */
    private static String f29754b = "_id <= ? ";

    /* renamed from: c */
    private static final String[] f29755c = {"_id", "front", StringSet.type, "timestamp", "accumulation", "version_id", "source", "status", "scene", "process", "main_process", "sid"};

    /* renamed from: d */
    private static String f29756d = "main_process = 1 AND delete_flag = 0";

    /* renamed from: e */
    private static String f29757e = "main_process = 0 AND delete_flag = 0 AND timestamp <= ? ";

    @Override // com.bytedance.apm.battery.dao.AbstractC12344a
    /* renamed from: a */
    public final String mo20093a() {
        return "t_battery";
    }

    private C12347a() {
    }

    @Override // com.bytedance.apm.battery.dao.AbstractC12344a
    /* renamed from: b */
    public final String[] mo20095b() {
        return f29755c;
    }

    /* renamed from: c */
    public static C12347a m22182c() {
        if (f29753a == null) {
            synchronized (C12347a.class) {
                if (f29753a == null) {
                    f29753a = new C12347a();
                }
            }
        }
        return f29753a;
    }

    static {
        Covode.recordClassIndex(14153);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.apm.battery.dao.AbstractC12344a.AbstractC12345a
    /* renamed from: a */
    public final /* synthetic */ C12447a mo20096a(AbstractC12344a.C12346b bVar) {
        boolean z;
        boolean z2;
        long a = bVar.mo20097a("_id");
        long a2 = bVar.mo20097a("front");
        String c = bVar.mo20099c(StringSet.type);
        long a3 = bVar.mo20097a("timestamp");
        long a4 = bVar.mo20097a("accumulation");
        long a5 = bVar.mo20097a("version_id");
        String c2 = bVar.mo20099c("source");
        long a6 = bVar.mo20097a("status");
        String c3 = bVar.mo20099c("scene");
        int b = bVar.mo20098b("main_process");
        String c4 = bVar.mo20099c("process");
        if (a2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (a6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C12447a aVar = new C12447a(z, a3, c, z2, c3, a4, c2);
        aVar.f30233j = c4;
        aVar.f30224a = a;
        aVar.f30232i = a5;
        boolean z3 = true;
        if (b != 1) {
            z3 = false;
        }
        aVar.f30234k = z3;
        aVar.f30235l = bVar.mo20099c("sid");
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo20100a(com.bytedance.apm.p772e.C12447a r8) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.p764a.C12347a.mo20100a(com.bytedance.apm.e.a):long");
    }

    /* renamed from: a */
    public final synchronized void mo20102a(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", (Integer) 1);
        mo20091a(contentValues, f29754b, new String[]{String.valueOf(j)});
    }

    /* renamed from: a */
    public final synchronized List<C12447a> mo20101a(boolean z, long j) {
        List<C12447a> list;
        if (z) {
            list = mo20094a(f29756d, null, "_id", this);
        } else {
            list = mo20094a(f29757e, new String[]{String.valueOf(j)}, "_id", this);
        }
        return list;
    }
}
