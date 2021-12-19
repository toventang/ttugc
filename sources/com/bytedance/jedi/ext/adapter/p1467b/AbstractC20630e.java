package com.bytedance.jedi.ext.adapter.p1467b;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.ext.adapter.b.e */
public abstract class AbstractC20630e<ITEM> extends RecyclerView.ViewHolder {

    /* renamed from: h */
    static final /* synthetic */ AbstractC89286i[] f48791h = {new C89232y(C89204ab.m154669a(AbstractC20630e.class), "itemViewMap", "getItemViewMap$ext_adapter_release()Landroid/util/SparseArray;")};

    /* renamed from: a */
    private final AbstractC89244h f48792a = C89250i.m154773a((AbstractC89171a) C20632a.f48796a);

    /* renamed from: b */
    private ITEM f48793b;

    /* renamed from: i */
    public int f48794i;

    public void ay_() {
    }

    /* renamed from: b */
    public abstract void mo33822b(ITEM item);

    public void cd_() {
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.b.e$a */
    static final class C20632a extends AbstractC89220m implements AbstractC89171a<SparseArray<View>> {

        /* renamed from: a */
        public static final C20632a f48796a = new C20632a();

        static {
            Covode.recordClassIndex(24164);
        }

        C20632a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SparseArray<View> invoke() {
            return new SparseArray();
        }
    }

    public final ITEM aQ_() {
        ITEM item = this.f48793b;
        if (item == null) {
            C89219l.m154707a();
        }
        return item;
    }

    static {
        Covode.recordClassIndex(24162);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC20630e(View view) {
        super(view);
        C89219l.m154719c(view, "");
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e.View$OnAttachStateChangeListenerC206311 */

            /* renamed from: a */
            final /* synthetic */ AbstractC20630e f48795a;

            static {
                Covode.recordClassIndex(24163);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f48795a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f48795a.ay_();
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f48795a.cd_();
            }
        });
    }

    /* renamed from: b */
    public void mo33823b(ITEM item, int i, List<Object> list) {
        this.f48794i = i;
        this.f48793b = item;
        mo33822b(item);
    }
}
