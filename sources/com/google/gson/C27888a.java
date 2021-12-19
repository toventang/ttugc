package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.internal.C27995d;
import com.google.gson.internal.C28007i;
import com.google.gson.internal.bind.p2022a.C27938a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.google.gson.a */
public final class C27888a extends AbstractC28031v<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f65502a;

    /* renamed from: b */
    private final List<DateFormat> f65503b;

    static {
        Covode.recordClassIndex(33482);
    }

    public final String toString() {
        DateFormat dateFormat = this.f65503b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ Date read(C27897a aVar) {
        if (aVar.mo46627f() == EnumC27899b.NULL) {
            aVar.mo46631k();
            return null;
        }
        Date a = m55840a(aVar.mo46629i());
        Class<? extends Date> cls = this.f65502a;
        if (cls == Date.class) {
            return a;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private static Class<? extends Date> m55839a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: a */
    private Date m55840a(String str) {
        MethodCollector.m26663i(10650);
        synchronized (this.f65503b) {
            try {
                for (DateFormat dateFormat : this.f65503b) {
                    try {
                        return dateFormat.parse(str);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    Date a = C27938a.m56004a(str, new ParsePosition(0));
                    MethodCollector.m26664o(10650);
                    return a;
                } catch (ParseException e) {
                    C28027t tVar = new C28027t(str, e);
                    MethodCollector.m26664o(10650);
                    throw tVar;
                }
            } finally {
                MethodCollector.m26664o(10650);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ void write(C27900c cVar, Date date) {
        MethodCollector.m26663i(10793);
        Date date2 = date;
        if (date2 == null) {
            cVar.mo46654f();
            MethodCollector.m26664o(10793);
            return;
        }
        synchronized (this.f65503b) {
            try {
                cVar.mo46648b(this.f65503b.get(0).format(date2));
            } finally {
                MethodCollector.m26664o(10793);
            }
        }
    }

    C27888a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f65503b = arrayList;
        this.f65502a = m55839a(cls);
        arrayList.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public C27888a(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f65503b = arrayList;
        this.f65502a = m55839a(cls);
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C27995d.m56080a()) {
            arrayList.add(C28007i.m56095a(i, i2));
        }
    }
}
