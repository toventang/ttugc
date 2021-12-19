package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.m */
public interface AbstractC20582m {
    static {
        Covode.recordClassIndex(24114);
    }

    /* renamed from: a */
    RecyclerView.ViewHolder mo33859a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo33860a(int i);

    /* renamed from: a */
    void mo33853a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: a */
    void mo33854a(boolean z);

    /* renamed from: a */
    boolean mo33855a();

    /* renamed from: b */
    RecyclerView.ViewHolder mo33856b();

    /* renamed from: d */
    void mo33858d();

    /* renamed from: e */
    int mo33862e();

    /* renamed from: g */
    boolean mo33864g();

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a.m$a */
    public static final class C20583a {
        static {
            Covode.recordClassIndex(24115);
        }

        /* renamed from: a */
        public static void m38804a(AbstractC20582m mVar) {
            RecyclerView.ViewHolder b = mVar.mo33856b();
            if (b != null) {
                b.setIsRecyclable(false);
            }
            mVar.mo33853a((RecyclerView.ViewHolder) null);
            mVar.mo33854a(false);
            mVar.mo33860a(mVar.mo33862e() + 1);
        }
    }
}
