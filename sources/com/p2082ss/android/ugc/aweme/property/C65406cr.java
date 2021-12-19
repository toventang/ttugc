package com.p2082ss.android.ugc.aweme.property;

import android.content.SharedPreferences;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.C27245k;

/* renamed from: com.ss.android.ugc.aweme.property.cr */
public final class C65406cr {

    /* renamed from: a */
    private SharedPreferences f147554a;

    /* renamed from: b */
    private C0484a<String, Object> f147555b = new C0484a<>();

    /* renamed from: com.ss.android.ugc.aweme.property.cr$a */
    public interface AbstractC65407a {
        static {
            Covode.recordClassIndex(76894);
        }

        /* renamed from: a */
        String mo104593a();

        /* renamed from: b */
        EnumC65408b mo104594b();

        /* renamed from: c */
        Object mo104595c();
    }

    static {
        Covode.recordClassIndex(76893);
    }

    /* renamed from: a */
    public final synchronized void mo104580a() {
        MethodCollector.m26663i(2546);
        this.f147555b.clear();
        this.f147554a.edit().clear().apply();
        MethodCollector.m26664o(2546);
    }

    /* renamed from: com.ss.android.ugc.aweme.property.cr$b */
    public enum EnumC65408b {
        Boolean,
        Integer,
        Long,
        Float,
        String;

        static {
            Covode.recordClassIndex(76895);
        }
    }

    public C65406cr(SharedPreferences sharedPreferences) {
        this.f147554a = sharedPreferences;
    }

    /* renamed from: f */
    public final synchronized boolean mo104591f(AbstractC65407a aVar) {
        boolean contains;
        MethodCollector.m26663i(2492);
        contains = this.f147554a.contains(aVar.mo104593a());
        MethodCollector.m26664o(2492);
        return contains;
    }

    /* renamed from: g */
    public final synchronized void mo104592g(AbstractC65407a aVar) {
        MethodCollector.m26663i(2504);
        this.f147555b.remove(aVar.mo104593a());
        this.f147554a.edit().remove(aVar.mo104593a()).apply();
        MethodCollector.m26664o(2504);
    }

    /* renamed from: b */
    public final synchronized int mo104587b(AbstractC65407a aVar) {
        boolean z;
        int intValue;
        MethodCollector.m26663i(2304);
        if (aVar.mo104594b() == EnumC65408b.Integer) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        Integer num = (Integer) this.f147555b.get(aVar.mo104593a());
        if (num == null) {
            num = Integer.valueOf(this.f147554a.getInt(aVar.mo104593a(), ((Integer) aVar.mo104595c()).intValue()));
            this.f147555b.put(aVar.mo104593a(), num);
        }
        intValue = num.intValue();
        MethodCollector.m26664o(2304);
        return intValue;
    }

    /* renamed from: c */
    public final synchronized long mo104588c(AbstractC65407a aVar) {
        boolean z;
        long longValue;
        MethodCollector.m26663i(2328);
        if (aVar.mo104594b() == EnumC65408b.Long) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        Long l = (Long) this.f147555b.get(aVar.mo104593a());
        if (l == null) {
            l = Long.valueOf(this.f147554a.getLong(aVar.mo104593a(), ((Long) aVar.mo104595c()).longValue()));
            this.f147555b.put(aVar.mo104593a(), l);
        }
        longValue = l.longValue();
        MethodCollector.m26664o(2328);
        return longValue;
    }

    /* renamed from: d */
    public final synchronized float mo104589d(AbstractC65407a aVar) {
        boolean z;
        float floatValue;
        MethodCollector.m26663i(2461);
        if (aVar.mo104594b() == EnumC65408b.Float) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        Float f = (Float) this.f147555b.get(aVar.mo104593a());
        if (f == null) {
            f = Float.valueOf(this.f147554a.getFloat(aVar.mo104593a(), ((Float) aVar.mo104595c()).floatValue()));
            this.f147555b.put(aVar.mo104593a(), f);
        }
        floatValue = f.floatValue();
        MethodCollector.m26664o(2461);
        return floatValue;
    }

    /* renamed from: e */
    public final synchronized String mo104590e(AbstractC65407a aVar) {
        boolean z;
        String str;
        MethodCollector.m26663i(2481);
        if (aVar.mo104594b() == EnumC65408b.String) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        str = (String) this.f147555b.get(aVar.mo104593a());
        if (str == null) {
            str = this.f147554a.getString(aVar.mo104593a(), (String) aVar.mo104595c());
            this.f147555b.put(aVar.mo104593a(), str);
        }
        MethodCollector.m26664o(2481);
        return str;
    }

    /* renamed from: a */
    public final synchronized boolean mo104586a(AbstractC65407a aVar) {
        boolean z;
        boolean booleanValue;
        MethodCollector.m26663i(2288);
        if (aVar.mo104594b() == EnumC65408b.Boolean) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        Boolean bool = (Boolean) this.f147555b.get(aVar.mo104593a());
        if (bool == null) {
            bool = Boolean.valueOf(this.f147554a.getBoolean(aVar.mo104593a(), ((Boolean) aVar.mo104595c()).booleanValue()));
            this.f147555b.put(aVar.mo104593a(), bool);
        }
        booleanValue = bool.booleanValue();
        MethodCollector.m26664o(2288);
        return booleanValue;
    }

    /* renamed from: a */
    public final synchronized void mo104581a(AbstractC65407a aVar, float f) {
        boolean z;
        MethodCollector.m26663i(2474);
        if (aVar.mo104594b() == EnumC65408b.Float) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        this.f147555b.put(aVar.mo104593a(), Float.valueOf(f));
        this.f147554a.edit().putFloat(aVar.mo104593a(), f).apply();
        MethodCollector.m26664o(2474);
    }

    /* renamed from: a */
    public final synchronized void mo104582a(AbstractC65407a aVar, int i) {
        boolean z;
        MethodCollector.m26663i(2311);
        if (aVar.mo104594b() == EnumC65408b.Integer) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        this.f147555b.put(aVar.mo104593a(), Integer.valueOf(i));
        this.f147554a.edit().putInt(aVar.mo104593a(), i).apply();
        MethodCollector.m26664o(2311);
    }

    /* renamed from: a */
    public final synchronized void mo104583a(AbstractC65407a aVar, long j) {
        boolean z;
        MethodCollector.m26663i(2341);
        if (aVar.mo104594b() == EnumC65408b.Long) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        this.f147555b.put(aVar.mo104593a(), Long.valueOf(j));
        this.f147554a.edit().putLong(aVar.mo104593a(), j).apply();
        MethodCollector.m26664o(2341);
    }

    /* renamed from: a */
    public final synchronized void mo104584a(AbstractC65407a aVar, String str) {
        boolean z;
        MethodCollector.m26663i(2487);
        if (aVar.mo104594b() == EnumC65408b.String) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54235a(z);
        this.f147555b.put(aVar.mo104593a(), str);
        this.f147554a.edit().putString(aVar.mo104593a(), str).apply();
        MethodCollector.m26664o(2487);
    }

    /* renamed from: a */
    public final synchronized void mo104585a(AbstractC65407a aVar, boolean z) {
        boolean z2;
        Boolean bool;
        MethodCollector.m26663i(2295);
        if (aVar.mo104594b() == EnumC65408b.Boolean) {
            z2 = true;
        } else {
            z2 = false;
        }
        C27245k.m54235a(z2);
        C0484a<String, Object> aVar2 = this.f147555b;
        String a = aVar.mo104593a();
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        aVar2.put(a, bool);
        this.f147554a.edit().putBoolean(aVar.mo104593a(), z).apply();
        MethodCollector.m26664o(2295);
    }
}
