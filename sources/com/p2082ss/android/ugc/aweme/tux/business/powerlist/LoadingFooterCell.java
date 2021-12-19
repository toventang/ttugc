package com.p2082ss.android.ugc.aweme.tux.business.powerlist;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell */
public final class LoadingFooterCell extends PowerLoadingCell {

    /* renamed from: a */
    public static final int f178378a;

    /* renamed from: b */
    public static final C79469a f178379b = new C79469a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell$a */
    public static final class C79469a {
        static {
            Covode.recordClassIndex(92668);
        }

        private C79469a() {
        }

        public /* synthetic */ C79469a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: a */
    public final void mo28142a() {
        mo28144b();
    }

    static {
        Covode.recordClassIndex(92667);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f178378a = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: b */
    public final void mo28144b() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C89219l.m154716b(layoutParams, "");
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
        ((TuxDualBallView) view.findViewById(R.id.ap9)).mo37885c();
        view.setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: c */
    public final void mo28145c() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C89219l.m154716b(layoutParams, "");
        layoutParams.height = f178378a;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        ((TuxDualBallView) view.findViewById(R.id.ap9)).mo37884b();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bgy, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}
