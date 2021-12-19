package com.bytedance.apm.trace.p790a;

import com.bytedance.apm.trace.model.AbstractC12639a;
import com.bytedance.apm.trace.model.cross.NativeSpan;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.apm.trace.a.d */
public class C12608d {

    /* renamed from: a */
    public AbstractC12639a f30657a;

    /* renamed from: b */
    private boolean f30658b;

    /* renamed from: c */
    private boolean f30659c;

    static {
        Covode.recordClassIndex(14425);
    }

    /* renamed from: a */
    public final synchronized void mo20423a(String str, ArrayList<NativeSpan> arrayList) {
        if (!this.f30659c) {
            if (this.f30658b) {
                boolean z = true;
                Iterator<NativeSpan> it = arrayList.iterator();
                while (it.hasNext()) {
                    NativeSpan next = it.next();
                    if (next != null) {
                        AbstractC12607c parseToSpan = next.parseToSpan(this.f30657a);
                        if (z) {
                            parseToSpan.mo20418a(Long.parseLong(str));
                        }
                        parseToSpan.mo20422a(next.getStartTime(), next.getFinishTime());
                        z = false;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo20424b(String str, ArrayList<NativeSpan> arrayList) {
        if (!this.f30659c) {
            if (this.f30658b) {
                boolean z = true;
                Iterator<NativeSpan> it = arrayList.iterator();
                while (it.hasNext()) {
                    NativeSpan next = it.next();
                    if (next != null) {
                        AbstractC12607c parseToSpan = next.parseToSpan(this.f30657a);
                        if (z) {
                            parseToSpan.mo20421b(Long.parseLong(str));
                        }
                        parseToSpan.mo20422a(next.getStartTime(), next.getFinishTime());
                        z = false;
                    }
                }
            }
        }
    }
}
