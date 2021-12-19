package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.fd */
final class C25945fd implements Comparator<AbstractC25943fb> {
    static {
        Covode.recordClassIndex(31360);
    }

    C25945fd() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC25943fb fbVar, AbstractC25943fb fbVar2) {
        AbstractC25943fb fbVar3 = fbVar;
        AbstractC25943fb fbVar4 = fbVar2;
        AbstractC25948fg fgVar = (AbstractC25948fg) fbVar3.iterator();
        AbstractC25948fg fgVar2 = (AbstractC25948fg) fbVar4.iterator();
        while (fgVar.hasNext() && fgVar2.hasNext()) {
            int compare = Integer.compare(fgVar.mo42404a() & 255, fgVar2.mo42404a() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(fbVar3.zza(), fbVar4.zza());
    }
}
