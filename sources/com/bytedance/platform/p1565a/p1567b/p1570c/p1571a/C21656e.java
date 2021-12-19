package com.bytedance.platform.p1565a.p1567b.p1570c.p1571a;

import android.util.Printer;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.platform.a.b.c.a.e */
public final class C21656e extends AbstractC21651a implements Printer {

    /* renamed from: c */
    public Printer f51390c;

    static {
        Covode.recordClassIndex(25297);
    }

    public C21656e(AbstractC21652b bVar) {
        super("TriggerFromLooperPrinter", bVar);
    }

    public final void println(String str) {
        if (str.charAt(0) == '<' && this.f51383b != null) {
            this.f51383b.mo35299a();
        }
        Printer printer = this.f51390c;
        if (printer != null) {
            printer.println(str);
        }
    }
}
