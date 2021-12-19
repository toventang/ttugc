package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C28027t;
import com.google.gson.internal.C27995d;
import com.google.gson.internal.C28007i;
import com.google.gson.internal.bind.p2022a.C27938a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.internal.bind.b */
public final class C27939b extends AbstractC28031v<Date> {

    /* renamed from: a */
    public static final AbstractC28033w f65662a = new DateTypeAdapter$1();

    /* renamed from: b */
    private final List<DateFormat> f65663b;

    static {
        Covode.recordClassIndex(33552);
    }

    public C27939b() {
        ArrayList arrayList = new ArrayList();
        this.f65663b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C27995d.m56080a()) {
            arrayList.add(C28007i.m56095a(2, 2));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ Date read(C27897a aVar) {
        if (aVar.mo46627f() != EnumC27899b.NULL) {
            return m56006a(aVar.mo46629i());
        }
        aVar.mo46631k();
        return null;
    }

    /* renamed from: a */
    private synchronized Date m56006a(String str) {
        MethodCollector.m26663i(10799);
        for (DateFormat dateFormat : this.f65663b) {
            try {
                Date parse = dateFormat.parse(str);
                MethodCollector.m26664o(10799);
                return parse;
            } catch (ParseException unused) {
            }
        }
        try {
            Date a = C27938a.m56004a(str, new ParsePosition(0));
            MethodCollector.m26664o(10799);
            return a;
        } catch (ParseException e) {
            C28027t tVar = new C28027t(str, e);
            MethodCollector.m26664o(10799);
            throw tVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C27900c cVar, Date date) {
        MethodCollector.m26663i(10800);
        if (date == null) {
            cVar.mo46654f();
            MethodCollector.m26664o(10800);
            return;
        }
        cVar.mo46648b(this.f65663b.get(0).format(date));
        MethodCollector.m26664o(10800);
    }
}
