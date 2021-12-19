package androidx.p060l;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.l.s */
public final class C1150s {

    /* renamed from: a */
    public final Map<String, Object> f3899a = new HashMap();

    /* renamed from: b */
    public View f3900b;

    /* renamed from: c */
    final ArrayList<AbstractC1134m> f3901c = new ArrayList<>();

    static {
        Covode.recordClassIndex(1243);
    }

    public final int hashCode() {
        return (this.f3900b.hashCode() * 31) + this.f3899a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3900b + "\n") + "    values:";
        for (String str2 : this.f3899a.keySet()) {
            str = str + "    " + str2 + ": " + this.f3899a.get(str2) + "\n";
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1150s)) {
            return false;
        }
        C1150s sVar = (C1150s) obj;
        if (this.f3900b != sVar.f3900b || !this.f3899a.equals(sVar.f3899a)) {
            return false;
        }
        return true;
    }
}
