package com.bytedance.android.livesdk.p643ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.ui.b */
public abstract class AbstractC10937b<T> extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final C88411a f26278a = new C88411a();

    /* renamed from: z */
    public boolean f26279z;

    static {
        Covode.recordClassIndex(12549);
    }

    /* renamed from: a */
    public void mo14823a() {
        this.f26279z = true;
    }

    /* renamed from: a */
    public abstract void mo9329a(T t, int i);

    /* renamed from: b */
    public void mo14824b() {
        this.f26279z = false;
    }

    /* renamed from: c */
    public boolean mo14825c() {
        return false;
    }

    /* renamed from: e */
    public void mo14840e() {
        this.f26278a.mo142944a();
    }

    /* renamed from: a */
    public final void mo17797a(AbstractC88412b bVar) {
        this.f26278a.mo142945a(bVar);
    }

    public AbstractC10937b(View view) {
        super(view);
    }
}
