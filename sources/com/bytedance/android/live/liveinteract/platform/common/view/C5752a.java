package com.bytedance.android.live.liveinteract.platform.common.view;

import android.view.View;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.a */
public final class C5752a {

    /* renamed from: a */
    private View f14594a;

    /* renamed from: b */
    private DataChannel f14595b;

    /* renamed from: c */
    private Set<C5753b> f14596c = new HashSet();

    static {
        Covode.recordClassIndex(6351);
    }

    /* renamed from: a */
    public final void mo11501a() {
        for (C5753b bVar : this.f14596c) {
            bVar.f14597a.mo28316b(bVar);
            bVar.f14599c.clear();
        }
        this.f14596c.clear();
    }

    /* renamed from: a */
    private <V extends View> C5753b.C5754a<V> m12621a(V v) {
        return new C5753b.C5754a<>(this.f14595b, v, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11502a(C5753b bVar) {
        this.f14596c.add(bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.android.live.liveinteract.platform.common.view.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <V extends View> C5753b.C5754a<V> mo11500a(int i) {
        View view = this.f14594a;
        if (view != null) {
            return m12621a(view.findViewById(i));
        }
        throw new IllegalStateException("Unable to find view by id due to null root view.");
    }

    public C5752a(DataChannel dataChannel, View view) {
        this.f14595b = dataChannel;
        this.f14594a = view;
    }
}
