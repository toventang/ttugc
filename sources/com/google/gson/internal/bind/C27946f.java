package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C28027t;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.f */
public final class C27946f extends AbstractC28031v<Date> {

    /* renamed from: a */
    public static final AbstractC28033w f65678a = new SqlDateTypeAdapter$1();

    /* renamed from: b */
    private final DateFormat f65679b = new SimpleDateFormat("MMM d, yyyy");

    static {
        Covode.recordClassIndex(33559);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Date read(C27897a aVar) {
        MethodCollector.m26663i(10275);
        if (aVar.mo46627f() == EnumC27899b.NULL) {
            aVar.mo46631k();
            MethodCollector.m26664o(10275);
            return null;
        }
        try {
            Date date = new Date(this.f65679b.parse(aVar.mo46629i()).getTime());
            MethodCollector.m26664o(10275);
            return date;
        } catch (ParseException e) {
            C28027t tVar = new C28027t(e);
            MethodCollector.m26664o(10275);
            throw tVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C27900c cVar, Date date) {
        String str;
        MethodCollector.m26663i(10425);
        if (date == null) {
            str = null;
        } else {
            str = this.f65679b.format(date);
        }
        cVar.mo46648b(str);
        MethodCollector.m26664o(10425);
    }
}
