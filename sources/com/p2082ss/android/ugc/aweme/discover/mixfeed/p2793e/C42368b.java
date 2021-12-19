package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.b */
public final class C42368b extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: a */
    public static final C42369a f98705a = new C42369a((byte) 0);

    /* renamed from: b */
    private TextView f98706b;

    static {
        Covode.recordClassIndex(50313);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.b$a */
    public static final class C42369a {
        static {
            Covode.recordClassIndex(50314);
        }

        private C42369a() {
        }

        public /* synthetic */ C42369a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C42368b m84730a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            return m84731b(viewGroup);
        }

        /* renamed from: b */
        private static C42368b m84731b(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            return new C42368b(C67641m.m119786a(viewGroup, R.layout.aw1));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: I */
    public final View mo70834I() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    /* renamed from: b */
    public final void mo71569b(String str) {
        C89219l.m154721d(str, "");
        TextView textView = this.f98706b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42368b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f98706b = (TextView) view.findViewById(R.id.ds8);
        View findViewById = view.findViewById(R.id.dsa);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.bz6);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }
}
