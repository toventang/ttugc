package com.bytedance.jedi.ext.adapter.internal;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.h */
public final class C20669h {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f48878a = {new C89232y(C89204ab.m154669a(C20669h.class), "trashStation", "getTrashStation()Landroid/util/SparseArray;")};

    /* renamed from: b */
    private final AbstractC89244h f48879b = C89250i.m154773a((AbstractC89171a) C20670a.f48880a);

    /* renamed from: a */
    public final SparseArray<List<RecyclerView.ViewHolder>> mo33922a() {
        return (SparseArray) this.f48879b.getValue();
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.h$a */
    static final class C20670a extends AbstractC89220m implements AbstractC89171a<SparseArray<List<RecyclerView.ViewHolder>>> {

        /* renamed from: a */
        public static final C20670a f48880a = new C20670a();

        static {
            Covode.recordClassIndex(24206);
        }

        C20670a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SparseArray<List<RecyclerView.ViewHolder>> invoke() {
            return new SparseArray();
        }
    }

    static {
        Covode.recordClassIndex(24205);
    }
}
