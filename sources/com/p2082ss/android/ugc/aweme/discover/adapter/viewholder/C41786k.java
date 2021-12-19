package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.k */
public final class C41786k extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: a */
    public static final C41787a f97467a = new C41787a((byte) 0);

    static {
        Covode.recordClassIndex(49701);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.k$a */
    public static final class C41787a {
        static {
            Covode.recordClassIndex(49702);
        }

        private C41787a() {
        }

        public /* synthetic */ C41787a(byte b) {
            this();
        }

        /* renamed from: a */
        public static RecyclerView.ViewHolder m83739a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ave, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C41786k(a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41786k(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }
}
