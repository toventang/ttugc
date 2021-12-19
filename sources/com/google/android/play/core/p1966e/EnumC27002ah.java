package com.google.android.play.core.p1966e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.android.play.core.e.ah */
public final class EnumC27002ah extends Enum<EnumC27002ah> implements AbstractC26995aa {

    /* renamed from: a */
    public static final EnumC27002ah f63903a = new EnumC27002ah();

    /* renamed from: b */
    private static final AtomicReference<AbstractC26996ab> f63904b = new AtomicReference<>(null);

    static {
        Covode.recordClassIndex(32478);
    }

    private EnumC27002ah() {
    }

    @Override // com.google.android.play.core.p1966e.AbstractC26995aa
    /* renamed from: a */
    public final AbstractC26996ab mo44700a() {
        return f63904b.get();
    }

    /* renamed from: b */
    public final void mo44711b(AbstractC26996ab abVar) {
        f63904b.set(abVar);
    }
}
