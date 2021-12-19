package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.io */
public final class C26045io extends C26042il<FieldDescriptorType, Object> {
    static {
        Covode.recordClassIndex(31460);
    }

    @Override // com.google.android.gms.internal.measurement.C26042il
    /* renamed from: a */
    public final void mo42710a() {
        if (!this.f61340c) {
            for (int i = 0; i < mo42711b(); i++) {
                Map.Entry b = mo42712b(i);
                if (((AbstractC25972ga) b.getKey()).mo42600d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Map.Entry entry : mo42713c()) {
                if (((AbstractC25972ga) entry.getKey()).mo42600d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo42710a();
    }

    C26045io(int i) {
        super(i, (byte) 0);
    }
}
