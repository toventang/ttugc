package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.dq */
public abstract class AbstractC25901dq<E> extends AbstractC25894dj<E> implements Set<E> {

    /* renamed from: a */
    private transient AbstractC25893di<E> f61046a;

    static {
        Covode.recordClassIndex(31316);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo42328e() {
        return false;
    }

    AbstractC25901dq() {
    }

    public int hashCode() {
        return C25918eg.m50161a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.android.gms.internal.measurement.AbstractC25894dj, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC25893di<E> mo42330f() {
        Object[] array = toArray();
        return AbstractC25893di.m50110a(array, array.length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    public AbstractC25893di<E> zzc() {
        AbstractC25893di<E> diVar = this.f61046a;
        if (diVar != null) {
            return diVar;
        }
        AbstractC25893di<E> f = mo42330f();
        this.f61046a = f;
        return f;
    }

    /* renamed from: a */
    static int m50128a(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C25866ci.m50069a(z, "collection too large");
            return 1073741824;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC25901dq) || !mo42328e() || !((AbstractC25901dq) obj).mo42328e() || hashCode() == obj.hashCode()) {
            return C25918eg.m50162a(this, obj);
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    public static <E> com.google.android.gms.internal.measurement.AbstractC25901dq<E> zza(java.util.Collection<? extends E> r14) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC25901dq.zza(java.util.Collection):com.google.android.gms.internal.measurement.dq");
    }
}
