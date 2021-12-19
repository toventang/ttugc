package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.HintCell */
public final class HintCell extends PowerCell<C55600e> {

    /* renamed from: a */
    public static final C55600e f126815a = new C55600e("No results found");

    /* renamed from: b */
    public static final C55580a f126816b = new C55580a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.HintCell$a */
    public static final class C55580a {
        static {
            Covode.recordClassIndex(65355);
        }

        private C55580a() {
        }

        public /* synthetic */ C55580a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(65354);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6r, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C55600e eVar) {
        C55600e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.adq);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(eVar2.f126832a);
    }
}
