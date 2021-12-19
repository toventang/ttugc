package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractView$OnClickListenerC42302e;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.f */
public final class C41773f extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C41774a f97448b = new C41774a((byte) 0);

    /* renamed from: a */
    public AbstractC42664al.AbstractC42666b f97449a;

    static {
        Covode.recordClassIndex(49688);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.f$a */
    public static final class C41774a {
        static {
            Covode.recordClassIndex(49689);
        }

        private C41774a() {
        }

        public /* synthetic */ C41774a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.f$b */
    public static final class C41775b extends AbstractView$OnClickListenerC42302e {

        /* renamed from: a */
        final /* synthetic */ C41773f f97450a;

        /* renamed from: b */
        final /* synthetic */ AbstractC42664al.AbstractC42666b f97451b;

        static {
            Covode.recordClassIndex(49690);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractView$OnClickListenerC42302e
        /* renamed from: a */
        public final void mo70821a() {
            AbstractC42664al.AbstractC42666b bVar;
            if (this.f97450a.f97449a != null && (bVar = this.f97451b) != null) {
                bVar.mo72865c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41775b(C41773f fVar, AbstractC42664al.AbstractC42666b bVar) {
            super((byte) 0);
            this.f97450a = fVar;
            this.f97451b = bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41773f(View view, AbstractC42664al.AbstractC42666b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97449a = bVar;
        this.itemView.setOnClickListener(new C41775b(this, bVar));
    }
}
