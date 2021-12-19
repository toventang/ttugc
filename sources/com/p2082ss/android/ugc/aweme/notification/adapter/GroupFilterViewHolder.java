package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder */
public final class GroupFilterViewHolder extends PowerCell<C61631f> implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC89244h f140297a = C89250i.m154773a((AbstractC89171a) new C61807a(this));

    /* renamed from: b */
    private View f140298b;

    /* renamed from: j */
    private TuxIconView f140299j;

    /* renamed from: k */
    private TextView f140300k;

    /* renamed from: l */
    private TuxIconView f140301l;

    /* renamed from: m */
    private ImageView f140302m;

    static {
        Covode.recordClassIndex(72542);
    }

    /* renamed from: a */
    private final FilterViewModel m111870a() {
        return (FilterViewModel) this.f140297a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder$a */
    static final class C61807a extends AbstractC89220m implements AbstractC89171a<FilterViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupFilterViewHolder f140303a;

        static {
            Covode.recordClassIndex(72543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61807a(GroupFilterViewHolder groupFilterViewHolder) {
            super(0);
            this.f140303a = groupFilterViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FilterViewModel invoke() {
            return PowerCell.m32711a(this.f140303a, FilterViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder$b */
    static final class C61808b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GroupFilterViewHolder f140304a;

        static {
            Covode.recordClassIndex(72544);
        }

        C61808b(GroupFilterViewHolder groupFilterViewHolder) {
            this.f140304a = groupFilterViewHolder;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C61631f fVar = (C61631f) this.f140304a.f42160d;
            if (fVar != null) {
                GroupFilterViewHolder groupFilterViewHolder = this.f140304a;
                C89219l.m154716b(num, "");
                groupFilterViewHolder.mo99884a(fVar, num.intValue());
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 == null) goto L_0x001b;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo23350a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.f r3 = (com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f) r3
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            com.ss.android.ugc.aweme.notification.adapter.FilterViewModel r0 = r2.m111870a()
            if (r0 == 0) goto L_0x0029
            androidx.lifecycle.t r0 = r0.mo99882a()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x001e
        L_0x001b:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x001e:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            int r0 = r0.intValue()
            r2.mo99884a(r3, r0)
            return
        L_0x0029:
            r0 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder.mo23350a(com.bytedance.ies.powerlist.b.a):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T extends com.bytedance.ies.powerlist.b.a, java.lang.Object] */
    public final void onClick(View view) {
        FilterViewModel a;
        ClickAgent.onClick(view);
        C61631f fVar = (C61631f) this.f42160d;
        if (fVar != null) {
            int i = fVar.f139899a;
            FilterViewModel a2 = m111870a();
            if (a2 != null) {
                a2.mo99882a().postValue(Integer.valueOf(i));
            }
        }
        T t = this.f42160d;
        if (t != 0 && (a = m111870a()) != null) {
            C89219l.m154721d(t, "");
            a.mo99883b().postValue(t);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        FilterViewModel a;
        C1213t<Integer> a2;
        C89219l.m154721d(viewGroup, "");
        View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ky, viewGroup, false);
        View findViewById = a3.findViewById(R.id.a60);
        C89219l.m154716b(findViewById, "");
        this.f140298b = findViewById;
        View findViewById2 = a3.findViewById(R.id.bgt);
        C89219l.m154716b(findViewById2, "");
        this.f140299j = (TuxIconView) findViewById2;
        View findViewById3 = a3.findViewById(R.id.f0d);
        C89219l.m154716b(findViewById3, "");
        this.f140300k = (TextView) findViewById3;
        View findViewById4 = a3.findViewById(R.id.bgu);
        C89219l.m154716b(findViewById4, "");
        this.f140301l = (TuxIconView) findViewById4;
        View findViewById5 = a3.findViewById(R.id.by2);
        C89219l.m154716b(findViewById5, "");
        this.f140302m = (ImageView) findViewById5;
        if (Build.VERSION.SDK_INT >= 23) {
            View view = this.f140298b;
            if (view == null) {
                C89219l.m154710a("mVRoot");
            }
            View view2 = this.f140298b;
            if (view2 == null) {
                C89219l.m154710a("mVRoot");
            }
            view.setForeground(view2.getResources().getDrawable(R.drawable.oj));
        } else {
            View view3 = this.f140298b;
            if (view3 == null) {
                C89219l.m154710a("mVRoot");
            }
            C62023a.m112168a(view3);
        }
        a3.setOnClickListener(this);
        AbstractC1204m i = mo28070i();
        if (!(i == null || (a = m111870a()) == null || (a2 = a.mo99882a()) == null)) {
            a2.observe(i, new C61808b(this));
        }
        C89219l.m154716b(a3, "");
        return a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r0 > r5) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        if (com.p2082ss.android.ugc.aweme.notice.api.C61542b.m111469c(82) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0125, code lost:
        if (r0 > r5) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (com.p2082ss.android.ugc.aweme.notice.api.C61542b.m111469c(82) != false) goto L_0x0078;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99884a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f r11, int r12) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder.mo99884a(com.ss.android.ugc.aweme.notice.repo.list.bean.f, int):void");
    }
}
