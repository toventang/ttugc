package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.f */
public abstract class AbstractC84686f<DATA> extends RecyclerView.ViewHolder {

    /* renamed from: d */
    public DATA f189205d;

    /* renamed from: e */
    public EnumC84444c f189206e = EnumC84444c.NOT_DOWNLOAD;

    /* renamed from: f */
    public int f189207f;

    /* renamed from: g */
    public final C85037b f189208g;

    /* renamed from: h */
    public final AbstractC89187q<DATA, Integer, EnumC84444c, C89391z> f189209h;

    static {
        Covode.recordClassIndex(98653);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo114483a(DATA data);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super DATA, ? super java.lang.Integer, ? super com.ss.android.ugc.tools.h.a.c, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC84686f(View view, C85037b bVar, AbstractC89187q<? super DATA, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(qVar, "");
        this.f189208g = bVar;
        this.f189209h = qVar;
        view.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
            /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f.C846871 */

            /* renamed from: a */
            final /* synthetic */ AbstractC84686f f189210a;

            static {
                Covode.recordClassIndex(98654);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f189210a = r3;
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                DATA data;
                if (this.f189210a.getAdapterPosition() != -1 && (data = this.f189210a.f189205d) != null) {
                    this.f189210a.f189209h.invoke(data, Integer.valueOf(this.f189210a.f189207f), this.f189210a.f189206e);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo129601a(DATA data, int i, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(cVar, "");
        mo114483a(data);
        int i2 = C84688g.f189211a[cVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            this.f189208g.mo129975a(1, 0);
        } else if (i2 == 5) {
            if (num == null) {
                this.f189208g.mo129975a(2, 0);
            } else {
                this.f189208g.mo129975a(5, num.intValue());
            }
        }
        this.f189205d = data;
        this.f189206e = cVar;
        this.f189207f = i;
    }
}
