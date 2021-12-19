package com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74777c;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SelectedCardVM;
import com.p2082ss.android.ugc.aweme.social.widget.p3918a.C74744a;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSelectCell */
public final class RecUserSelectCell extends PowerCell<C74826b> {

    /* renamed from: a */
    public TuxCheckBox f168142a;

    /* renamed from: b */
    private SmartAvatarImageView f168143b;

    /* renamed from: j */
    private TuxTextView f168144j;

    /* renamed from: k */
    private TuxTextView f168145k;

    /* renamed from: l */
    private MutualRelationView f168146l;

    /* renamed from: m */
    private final AbstractC89244h f168147m = C89250i.m154773a((AbstractC89171a) new C74818d(this));

    static {
        Covode.recordClassIndex(87670);
    }

    /* renamed from: a */
    public final SelectedCardVM mo117871a() {
        return (SelectedCardVM) this.f168147m.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: j */
    public final int mo28071j() {
        return R.layout.b09;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSelectCell$d */
    static final class C74818d extends AbstractC89220m implements AbstractC89171a<SelectedCardVM> {

        /* renamed from: a */
        final /* synthetic */ RecUserSelectCell f168154a;

        static {
            Covode.recordClassIndex(87674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74818d(RecUserSelectCell recUserSelectCell) {
            super(0);
            this.f168154a = recUserSelectCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SelectedCardVM invoke() {
            AbstractC1174ac b = PowerCell.m32713b(this.f168154a, SelectedCardVM.class);
            if (b != null || (b = PowerCell.m32711a(this.f168154a, SelectedCardVM.class)) != null) {
                return b;
            }
            throw new IllegalStateException("current cell not attach context");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
        SelectedCardVM a = mo117871a();
        T t = this.f42160d;
        if (t == null) {
            C89219l.m154715b();
        }
        C74826b bVar = (C74826b) t;
        C89219l.m154721d(bVar, "");
        String uid = bVar.f168176a.getUid();
        if (!a.f168245o.contains(uid)) {
            Set<String> set = a.f168245o;
            C89219l.m154716b(uid, "");
            set.add(uid);
            C74777c.m131288a(bVar.f168176a, a.f168231a, a.f168232b, C59256u.EnumC59257a.SHOW, a.f168233c);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxCheckBox m131368a(RecUserSelectCell recUserSelectCell) {
        TuxCheckBox tuxCheckBox = recUserSelectCell.f168142a;
        if (tuxCheckBox == null) {
            C89219l.m154710a("selectView");
        }
        return tuxCheckBox;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSelectCell$b */
    static final class View$OnClickListenerC74816b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecUserSelectCell f168151a;

        static {
            Covode.recordClassIndex(87672);
        }

        View$OnClickListenerC74816b(RecUserSelectCell recUserSelectCell) {
            this.f168151a = recUserSelectCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            RecUserSelectCell.m131368a(this.f168151a).setChecked(!RecUserSelectCell.m131368a(this.f168151a).isChecked());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSelectCell$a */
    static final class View$OnClickListenerC74815a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecUserSelectCell f168148a;

        /* renamed from: b */
        final /* synthetic */ C74826b f168149b;

        /* renamed from: c */
        final /* synthetic */ User f168150c;

        static {
            Covode.recordClassIndex(87671);
        }

        View$OnClickListenerC74815a(RecUserSelectCell recUserSelectCell, C74826b bVar, User user) {
            this.f168148a = recUserSelectCell;
            this.f168149b = bVar;
            this.f168150c = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SelectedCardVM a = this.f168148a.mo117871a();
            C74826b bVar = this.f168149b;
            C89219l.m154721d(bVar, "");
            C74777c.m131287a(bVar.f168176a, C59256u.EnumC59259c.POP_UP, null, C89041ag.m154421a(C89387v.m154943a("enter_from", a.f168231a), C89387v.m154943a("enter_method", a.f168232b)));
            User user = this.f168150c;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C74744a.m131229a(user, context, this.f168148a.mo117871a().f168231a, this.f168148a.mo117871a().f168232b, null, null, 24);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = super.mo23349a(viewGroup);
        View findViewById = a.findViewById(R.id.o4);
        C89219l.m154716b(findViewById, "");
        this.f168143b = (SmartAvatarImageView) findViewById;
        View findViewById2 = a.findViewById(R.id.csi);
        C89219l.m154716b(findViewById2, "");
        this.f168144j = (TuxTextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.df4);
        C89219l.m154716b(findViewById3, "");
        this.f168145k = (TuxTextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.cp2);
        C89219l.m154716b(findViewById4, "");
        this.f168146l = (MutualRelationView) findViewById4;
        View findViewById5 = a.findViewById(R.id.du2);
        C89219l.m154716b(findViewById5, "");
        this.f168142a = (TuxCheckBox) findViewById5;
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C74826b bVar) {
        C74826b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        super.mo23350a((AbstractC17641a) bVar2);
        User user = bVar2.f168176a;
        TuxTextView tuxTextView = this.f168144j;
        if (tuxTextView == null) {
            C89219l.m154710a("nicknameView");
        }
        C74744a.m131226a(tuxTextView, user);
        SmartAvatarImageView smartAvatarImageView = this.f168143b;
        if (smartAvatarImageView == null) {
            C89219l.m154710a("avatarView");
        }
        UrlModel avatarThumb = user.getAvatarThumb();
        C89219l.m154716b(avatarThumb, "");
        C74744a.m131227a(smartAvatarImageView, avatarThumb);
        TuxTextView tuxTextView2 = this.f168145k;
        if (tuxTextView2 == null) {
            C89219l.m154710a("reasonView");
        }
        MutualRelationView mutualRelationView = this.f168146l;
        if (mutualRelationView == null) {
            C89219l.m154710a("mutualView");
        }
        C74744a.m131230a(user, tuxTextView2, mutualRelationView);
        TuxCheckBox tuxCheckBox = this.f168142a;
        if (tuxCheckBox == null) {
            C89219l.m154710a("selectView");
        }
        tuxCheckBox.setChecked(bVar2.f168177b);
        SmartAvatarImageView smartAvatarImageView2 = this.f168143b;
        if (smartAvatarImageView2 == null) {
            C89219l.m154710a("avatarView");
        }
        smartAvatarImageView2.setOnClickListener(new View$OnClickListenerC74815a(this, bVar2, user));
        this.itemView.setOnClickListener(new View$OnClickListenerC74816b(this));
        TuxCheckBox tuxCheckBox2 = this.f168142a;
        if (tuxCheckBox2 == null) {
            C89219l.m154710a("selectView");
        }
        tuxCheckBox2.setOnCheckedChangeListener(new C74817c(this, bVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSelectCell$c */
    static final class C74817c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecUserSelectCell f168152a;

        /* renamed from: b */
        final /* synthetic */ C74826b f168153b;

        static {
            Covode.recordClassIndex(87673);
        }

        C74817c(RecUserSelectCell recUserSelectCell, C74826b bVar) {
            this.f168152a = recUserSelectCell;
            this.f168153b = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SelectedCardVM a = this.f168152a.mo117871a();
            C74826b bVar = this.f168153b;
            boolean isChecked = RecUserSelectCell.m131368a(this.f168152a).isChecked();
            C89219l.m154721d(bVar, "");
            bVar.f168177b = isChecked;
            List<C74826b> value = a.f168237g.getValue();
            int i = 0;
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    i += it.next().f168177b ? 1 : 0;
                }
            }
            a.f168239i.postValue(Integer.valueOf(i));
        }
    }
}
