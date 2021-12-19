package com.bytedance.android.livesdk.util.rxutils;

import android.util.Pair;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4591l.C88958b;

public class RxViewModel extends AbstractC1174ac {

    /* renamed from: E */
    public final C88958b<EnumC11186b> f26731E = new C88958b<>();

    /* renamed from: a */
    private final C88411a f26732a = new C88411a();

    /* renamed from: b */
    private final List<Pair<LiveData, AbstractC1214u>> f26733b = new ArrayList();

    static {
        Covode.recordClassIndex(12745);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        this.f26732a.mo142944a();
        for (Pair<LiveData, AbstractC1214u> pair : this.f26733b) {
            ((LiveData) pair.first).removeObserver((AbstractC1214u) pair.second);
        }
        this.f26733b.clear();
        this.f26731E.onNext(EnumC11186b.DESTROY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17918a(AbstractC88412b bVar) {
        this.f26732a.mo142945a(bVar);
    }
}
