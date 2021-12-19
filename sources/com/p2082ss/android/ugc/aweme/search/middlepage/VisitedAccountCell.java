package com.p2082ss.android.ugc.aweme.search.middlepage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.helper.C41988ah;
import com.p2082ss.android.ugc.aweme.search.view.UsernameWithVerifyAndRelation;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.middlepage.VisitedAccountCell */
public final class VisitedAccountCell extends PowerCell<C67666d> {

    /* renamed from: a */
    public static final C67656a f151571a = new C67656a((byte) 0);

    static {
        Covode.recordClassIndex(79297);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.VisitedAccountCell$a */
    public static final class C67656a {
        static {
            Covode.recordClassIndex(79298);
        }

        private C67656a() {
        }

        public /* synthetic */ C67656a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: m */
    public final void mo28074m() {
        super.mo28074m();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.VisitedAccountCell$b */
    static final class View$OnClickListenerC67657b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C67666d f151572a;

        /* renamed from: b */
        final /* synthetic */ VisitedAccountCell f151573b;

        /* renamed from: c */
        final /* synthetic */ C67666d f151574c;

        static {
            Covode.recordClassIndex(79299);
        }

        View$OnClickListenerC67657b(C67666d dVar, VisitedAccountCell visitedAccountCell, C67666d dVar2) {
            this.f151572a = dVar;
            this.f151573b = visitedAccountCell;
            this.f151574c = dVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f151574c.f151598c.mo72849a(this.f151572a.f151596a, this.f151572a.f151597b, this.f151573b.getAdapterPosition());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.VisitedAccountCell$c */
    static final class View$OnClickListenerC67658c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C67666d f151575a;

        /* renamed from: b */
        final /* synthetic */ VisitedAccountCell f151576b;

        /* renamed from: c */
        final /* synthetic */ C67666d f151577c;

        static {
            Covode.recordClassIndex(79300);
        }

        View$OnClickListenerC67658c(C67666d dVar, VisitedAccountCell visitedAccountCell, C67666d dVar2) {
            this.f151575a = dVar;
            this.f151576b = visitedAccountCell;
            this.f151577c = dVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f151577c.f151598c.mo72848a(this.f151575a.f151596a, this.f151576b.getAdapterPosition());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.avh, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C67666d dVar) {
        boolean z;
        C67666d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        getAdapterPosition();
        UserVerify userVerify = new UserVerify(null, dVar2.f151596a.getCustomVerify(), dVar2.f151596a.getEnterpriseVerifyReason(), null);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        UsernameWithVerifyAndRelation usernameWithVerifyAndRelation = (UsernameWithVerifyAndRelation) view.findViewById(R.id.bt);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        String nickname = dVar2.f151596a.getNickname();
        String relationShip = dVar2.f151596a.getRelationShip();
        if (!(context == null || nickname == null)) {
            TuxTextView tuxTextView = (TuxTextView) usernameWithVerifyAndRelation.mo9603b(R.id.f6v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(nickname);
            TextView textView = (TextView) usernameWithVerifyAndRelation.mo9603b(R.id.f6v);
            if (textView != null) {
                C80581io.m139702a(context, textView, C80581io.m139706a(userVerify));
            }
            String a = C41988ah.m84050a(context, relationShip);
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) " • ");
                spannableStringBuilder.append((CharSequence) a);
                TuxTextView tuxTextView2 = (TuxTextView) usernameWithVerifyAndRelation.mo9603b(R.id.f2b);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) usernameWithVerifyAndRelation.mo9603b(R.id.f2b);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setText(spannableStringBuilder);
            } else {
                TuxTextView tuxTextView4 = (TuxTextView) usernameWithVerifyAndRelation.mo9603b(R.id.f2b);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setText("");
                TuxTextView tuxTextView5 = (TuxTextView) usernameWithVerifyAndRelation.mo9603b(R.id.f2b);
                C89219l.m154716b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
            }
        }
        UrlModel avatarUrl = dVar2.f151596a.getAvatarUrl();
        if (avatarUrl != null) {
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(avatarUrl));
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            a2.f49092E = (SmartImageView) view3.findViewById(R.id.bo);
            a2.mo34179a("VisitedAccountCell").mo34186c();
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC67657b(dVar2, this, dVar2));
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        ((TuxIconView) view4.findViewById(R.id.bp)).setOnClickListener(new View$OnClickListenerC67658c(dVar2, this, dVar2));
    }
}
