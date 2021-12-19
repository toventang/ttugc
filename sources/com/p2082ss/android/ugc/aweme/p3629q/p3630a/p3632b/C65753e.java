package com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.q.a.b.e */
public final class C65753e extends AbstractC65728a<C33542a, C65754a> {
    static {
        Covode.recordClassIndex(77252);
    }

    public C65753e(AbstractC34884bl blVar) {
        super(blVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.e$a */
    public final class C65754a extends AbstractC65728a<C33542a, C65754a>.C65729a {

        /* renamed from: b */
        public final TextView f148144b;

        /* renamed from: c */
        final /* synthetic */ C65753e f148145c;

        static {
            Covode.recordClassIndex(77253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65754a(C65753e eVar, View view) {
            super(eVar, view);
            C89219l.m154721d(view, "");
            this.f148145c = eVar;
            View findViewById = view.findViewById(R.id.f8o);
            C89219l.m154716b(findViewById, "");
            this.f148144b = (TextView) findViewById;
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a99, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65754a(this, a);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        C65754a aVar = (C65754a) viewHolder;
        C33542a aVar2 = (C33542a) obj;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        if (TextUtils.isEmpty(aVar2.f79667c)) {
            aVar.f148144b.setVisibility(8);
            return;
        }
        aVar.f148144b.setVisibility(0);
        aVar.f148144b.setText(aVar2.f79667c);
    }
}
