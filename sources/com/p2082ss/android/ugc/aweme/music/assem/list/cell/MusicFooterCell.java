package com.p2082ss.android.ugc.aweme.music.assem.list.cell;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.footer.C17657a;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.page.AbstractC17714i;
import com.bytedance.ies.powerlist.page.EnumC17699e;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2629a.C39072k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell */
public final class MusicFooterCell extends PowerLoadingCell {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f137716a = {new C89232y(MusicFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/music/assem/list/cell/IFooterControl;", 0)};

    /* renamed from: j */
    public static final C60522b f137717j = new C60522b((byte) 0);

    /* renamed from: q */
    private static final CharSequence f137718q;

    /* renamed from: r */
    private static final CharSequence f137719r;

    /* renamed from: b */
    public C39072k f137720b;

    /* renamed from: k */
    private TextView f137721k;

    /* renamed from: l */
    private TextView f137722l;

    /* renamed from: m */
    private DmtStatusView f137723m;

    /* renamed from: n */
    private final AbstractC89248d f137724n = new C60521a(this);

    /* renamed from: o */
    private final AbstractC89244h f137725o = C89250i.m154773a((AbstractC89171a) new C60525e(this));

    /* renamed from: p */
    private final AbstractC89244h f137726p = C89250i.m154773a((AbstractC89171a) new C60523c(this));

    /* renamed from: d */
    public final AbstractC60601b mo23351d() {
        return (AbstractC60601b) this.f137724n.mo23374a(this, f137716a[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell$b */
    public static final class C60522b {
        static {
            Covode.recordClassIndex(71074);
        }

        private C60522b() {
        }

        public /* synthetic */ C60522b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: b */
    public final void mo28144b() {
        DmtStatusView dmtStatusView = this.f137723m;
        if (dmtStatusView != null) {
            dmtStatusView.mo27385g();
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: c */
    public final void mo28145c() {
        DmtStatusView dmtStatusView = this.f137723m;
        if (dmtStatusView != null) {
            dmtStatusView.mo27382d();
        }
        DmtStatusView dmtStatusView2 = this.f137723m;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo27384f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell$c */
    static final class C60523c extends AbstractC89220m implements AbstractC89171a<AbstractC39063h.AbstractC39067a> {

        /* renamed from: a */
        final /* synthetic */ MusicFooterCell f137728a;

        static {
            Covode.recordClassIndex(71075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60523c(MusicFooterCell musicFooterCell) {
            super(0);
            this.f137728a = musicFooterCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC39063h.AbstractC39067a invoke() {
            AbstractC60601b d = this.f137728a.mo23351d();
            if (d != null) {
                return d.mo98066C().f137732b;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell$e */
    static final class C60525e extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ MusicFooterCell f137730a;

        static {
            Covode.recordClassIndex(71077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60525e(MusicFooterCell musicFooterCell) {
            super(0);
            this.f137730a = musicFooterCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            AbstractC60601b d = this.f137730a.mo23351d();
            if (d != null) {
                return d.mo98066C().f137731a;
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(71072);
        String string = C17867d.m33078a().getString(R.string.cxi);
        C89219l.m154716b(string, "");
        f137718q = string;
        String string2 = C17867d.m33078a().getString(R.string.cxh);
        C89219l.m154716b(string2, "");
        f137719r = string2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        MethodCollector.m26663i(7914);
        super.mo28072k();
        View view = this.itemView;
        if (view != null) {
            this.f137723m = (DmtStatusView) view;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            Context context = ((DmtStatusView) view2).getContext();
            C89219l.m154716b(context, "");
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.gz);
            DmtStatusView dmtStatusView = this.f137723m;
            if (dmtStatusView != null) {
                dmtStatusView.setLayoutParams(new RecyclerView.C1367j(-1, dimensionPixelSize));
            }
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            TextView textView = (TextView) LayoutInflater.from(((DmtStatusView) view3).getContext()).inflate(R.layout.bif, (ViewGroup) null);
            this.f137721k = textView;
            if (textView != null) {
                textView.setGravity(17);
            }
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            TextView textView2 = (TextView) LayoutInflater.from(((DmtStatusView) view4).getContext()).inflate(R.layout.big, (ViewGroup) null);
            this.f137722l = textView2;
            if (textView2 != null) {
                textView2.setText(R.string.cxh);
            }
            TextView textView3 = this.f137722l;
            if (textView3 != null) {
                textView3.setGravity(17);
            }
            DmtStatusView dmtStatusView2 = this.f137723m;
            if (dmtStatusView2 != null) {
                View view5 = this.itemView;
                C89219l.m154716b(view5, "");
                dmtStatusView2.setBuilder(DmtStatusView.C17269a.m31905a(((DmtStatusView) view5).getContext()).mo27406b(this.f137721k).mo27408c(this.f137722l));
            }
            TextView textView4 = this.f137722l;
            if (textView4 != null) {
                textView4.setOnClickListener(new View$OnClickListenerC60524d(this));
                MethodCollector.m26664o(7914);
                return;
            }
            MethodCollector.m26664o(7914);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        MethodCollector.m26664o(7914);
        throw nullPointerException;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell$a */
    public static final class C60521a implements AbstractC89248d<Object, AbstractC60601b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f137727a;

        static {
            Covode.recordClassIndex(71073);
        }

        public C60521a(PowerCell powerCell) {
            this.f137727a = powerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if (r0 == null) goto L_0x004b;
         */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.music.assem.list.cell.AbstractC60601b mo23374a(java.lang.Object r6, p4600h.p4620k.AbstractC89286i r7) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell.C60521a.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo23350a(C17657a aVar) {
        mo23350a(aVar);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return new DmtStatusView(viewGroup.getContext());
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell$d */
    static final class View$OnClickListenerC60524d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicFooterCell f137729a;

        static {
            Covode.recordClassIndex(71076);
        }

        View$OnClickListenerC60524d(MusicFooterCell musicFooterCell) {
            this.f137729a = musicFooterCell;
        }

        public final void onClick(View view) {
            AbstractC39063h.AbstractC39067a aVar;
            ClickAgent.onClick(view);
            AbstractC60601b d = this.f137729a.mo23351d();
            if (!(d == null || (aVar = d.mo98066C().f137732b) == null)) {
                aVar.mo62679l();
            }
            C39072k kVar = this.f137729a.f137720b;
            if (kVar != null) {
                kVar.f92268a = false;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* renamed from: a */
    public final void mo28143a(C17657a aVar) {
        RecyclerView recyclerView;
        CharSequence charSequence;
        TextView textView;
        C89219l.m154721d(aVar, "");
        TextView textView2 = this.f137722l;
        if (textView2 != null) {
            textView2.setText(f137719r);
        }
        TextView textView3 = this.f137722l;
        if (textView3 != null) {
            textView3.setTextColor(-16777216);
        }
        TextView textView4 = this.f137721k;
        if (textView4 != null) {
            textView4.setText(f137718q);
        }
        TextView textView5 = this.f137721k;
        if (textView5 != null) {
            textView5.setTextColor(-16777216);
        }
        AbstractC17714i iVar = aVar.f42224a.f42308b;
        if (iVar instanceof AbstractC17714i.C17718d) {
            mo28145c();
        } else if (iVar instanceof AbstractC17714i.C17716b) {
            EnumC17699e eVar = iVar.f42364a;
            C89219l.m154721d(eVar, "");
            if (C60602c.f137816a[eVar.ordinal()] == 1 && (recyclerView = (RecyclerView) this.f137725o.getValue()) != null) {
                View view = this.itemView;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
                DmtStatusView dmtStatusView = (DmtStatusView) view;
                TextView textView6 = this.f137722l;
                if (textView6 != null) {
                    charSequence = textView6.getText();
                } else {
                    charSequence = null;
                }
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                if (!TextUtils.equals(charSequence, ((DmtStatusView) view2).getResources().getString(R.string.eyo)) && (textView = this.f137722l) != null) {
                    textView.setText(R.string.eyo);
                }
                dmtStatusView.mo27387h();
                if (this.f137720b == null) {
                    this.f137720b = new C39072k(recyclerView, (AbstractC39063h.AbstractC39067a) this.f137726p.getValue());
                }
                C39072k kVar = this.f137720b;
                if (kVar != null) {
                    kVar.f92268a = true;
                }
            }
        } else if (iVar instanceof AbstractC17714i.C17715a) {
            mo28144b();
        }
    }
}
