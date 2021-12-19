package com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.q.a.b.d */
public final class C65749d extends AbstractC65728a<C33542a, C65751b> {

    /* renamed from: d */
    public static final C65750a f148138d = new C65750a((byte) 0);

    static {
        Covode.recordClassIndex(77248);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.d$a */
    public static final class C65750a {
        static {
            Covode.recordClassIndex(77249);
        }

        private C65750a() {
        }

        public /* synthetic */ C65750a(byte b) {
            this();
        }
    }

    public C65749d(AbstractC34884bl blVar) {
        super(blVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.d$b */
    public final class C65751b extends AbstractC65728a<C33542a, C65751b>.C65729a {

        /* renamed from: b */
        final TextView f148139b;

        /* renamed from: c */
        final TextView f148140c;

        /* renamed from: d */
        final /* synthetic */ C65749d f148141d;

        static {
            Covode.recordClassIndex(77250);
        }

        /* renamed from: com.ss.android.ugc.aweme.q.a.b.d$b$a */
        static final class View$OnClickListenerC65752a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65751b f148142a;

            /* renamed from: b */
            final /* synthetic */ C33542a f148143b;

            static {
                Covode.recordClassIndex(77251);
            }

            View$OnClickListenerC65752a(C65751b bVar, C33542a aVar) {
                this.f148142a = bVar;
                this.f148143b = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC34884bl blVar = this.f148142a.f148141d.f148117b;
                if (blVar != null) {
                    blVar.mo59598a(this.f148143b.f79669e);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65751b(C65749d dVar, View view) {
            super(dVar, view);
            C89219l.m154721d(view, "");
            this.f148141d = dVar;
            this.f148139b = (TextView) view.findViewById(R.id.f8_);
            this.f148140c = (TextView) view.findViewById(R.id.f8e);
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a98, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65751b(this, a);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        C65751b bVar = (C65751b) viewHolder;
        C33542a aVar = (C33542a) obj;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        TextView textView = bVar.f148140c;
        if (TextUtils.isEmpty(aVar.f79667c)) {
            str = textView.getContext().getString(R.string.an6);
        } else {
            str = aVar.f79667c;
        }
        textView.setText(str);
        TextView textView2 = bVar.f148139b;
        ArrayList<AnchorCell> arrayList = aVar.f79669e;
        int i = 0;
        if (arrayList == null || arrayList.size() <= 3) {
            i = 4;
        }
        textView2.setVisibility(i);
        textView2.setOnClickListener(new C65751b.View$OnClickListenerC65752a(bVar, aVar));
    }
}
