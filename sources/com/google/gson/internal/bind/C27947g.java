package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C28027t;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.g */
public final class C27947g extends AbstractC28031v<Time> {

    /* renamed from: a */
    public static final AbstractC28033w f65680a = new TimeTypeAdapter$1();

    /* renamed from: b */
    private final DateFormat f65681b = new SimpleDateFormat("hh:mm:ss a");

    static {
        Covode.recordClassIndex(33560);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Time read(C27897a aVar) {
        MethodCollector.m26663i(10108);
        if (aVar.mo46627f() == EnumC27899b.NULL) {
            aVar.mo46631k();
            MethodCollector.m26664o(10108);
            return null;
        }
        try {
            Time time = new Time(this.f65681b.parse(aVar.mo46629i()).getTime());
            MethodCollector.m26664o(10108);
            return time;
        } catch (ParseException e) {
            C28027t tVar = new C28027t(e);
            MethodCollector.m26664o(10108);
            throw tVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C27900c cVar, Time time) {
        String str;
        MethodCollector.m26663i(10273);
        if (time == null) {
            str = null;
        } else {
            str = this.f65681b.format(time);
        }
        cVar.mo46648b(str);
        MethodCollector.m26664o(10273);
    }
}
