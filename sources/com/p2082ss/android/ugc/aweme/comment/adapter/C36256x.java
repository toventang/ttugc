package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.C36535m;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36247s;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36173a;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a;
import com.p2082ss.android.ugc.aweme.comment.p2494h.C36487a;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq;
import com.p2082ss.android.ugc.aweme.comment.util.C37188b;
import com.p2082ss.android.ugc.aweme.comment.util.C37208m;
import com.p2082ss.android.ugc.aweme.comment.util.C37210o;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.x */
public final class C36256x extends C36247s {

    /* renamed from: D */
    protected TextView f85672D;

    /* renamed from: E */
    TextView f85673E;

    /* renamed from: F */
    TextView f85674F;

    /* renamed from: G */
    protected TextView f85675G;

    /* renamed from: H */
    protected TextView f85676H;

    /* renamed from: I */
    TuxTextView f85677I;

    /* renamed from: J */
    TuxTextView f85678J;

    /* renamed from: K */
    TuxTextView f85679K;

    /* renamed from: L */
    TuxTextView f85680L;

    /* renamed from: M */
    LinearLayout f85681M;

    /* renamed from: N */
    TextView f85682N;

    /* renamed from: O */
    SmartImageView f85683O;

    /* renamed from: P */
    private AbstractC37056bq f85684P = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36256x.C362571 */

        static {
            Covode.recordClassIndex(43523);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            String str;
            Comment comment;
            if (C36256x.this.f85637a != null && C36256x.this.f85633C != null) {
                String str2 = "";
                if (view.getId() == R.id.f2c) {
                    if (C36256x.this.f85637a.getRelationLabel() != null) {
                        str2 = C36256x.this.f85637a.getRelationLabel().getUserId();
                    }
                    str = C36256x.this.f85637a.getUser().getSecUid();
                } else if (C13603b.m24435a((Collection) C36256x.this.f85637a.getReplyComments()) || (comment = C36256x.this.f85637a.getReplyComments().get(0)) == null) {
                    str = str2;
                } else {
                    if (comment.getRelationLabel() != null) {
                        str2 = comment.getRelationLabel().getUserId();
                    }
                    str = comment.getUser().getSecUid();
                }
                if (!TextUtils.isEmpty(str2)) {
                    C36256x.this.f85633C.mo63746a(str2, str);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(43522);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo63433g() {
        if (this.f85633C != null) {
            this.f85633C.mo63752k();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.comment.adapter.C36247s
    /* renamed from: a */
    public final void mo63411a() {
        this.f85677I.setTypeface(this.f85641e.getTypeface());
        this.f85677I.getPaint().setFakeBoldText(this.f85641e.getPaint().isFakeBoldText());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo63434h() {
        if (this.f85633C != null && C36535m.m74354b(this.f85637a)) {
            this.f85633C.mo63750d(this.f85637a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.adapter.C36247s
    /* renamed from: b */
    public final void mo63419b() {
        int i;
        if (this.f85637a != null) {
            int i2 = 4;
            if (C36535m.m74352a(this.f85637a)) {
                TextView textView = this.f85672D;
                if (textView != null) {
                    C34729o.m70959b(false, textView, this.f85632B);
                }
                this.f85649m.setVisibility(4);
                this.f85651o.setVisibility(4);
                this.f85650n.setVisibility(4);
            } else {
                if (this.f85672D != null) {
                    if (!C36173a.m73726c()) {
                        this.f85672D.setVisibility(8);
                    } else if (this.f85656t) {
                        C34729o.m70959b(false, this.f85672D, this.f85632B);
                    } else {
                        C34729o.m70959b(true, this.f85672D, this.f85632B);
                        if (C16048b.m29633a().mo25421a(true, "standardize_timestamp", false)) {
                            TextView textView2 = this.f85672D;
                            C80187aa.C80188a aVar = C80187aa.f179656s;
                            textView2.setText(C80187aa.C80188a.m139006a(((long) this.f85637a.getCreateTime()) * 1000));
                        } else {
                            this.f85672D.setText(C80566ib.m139651a(this.itemView.getContext(), ((long) this.f85637a.getCreateTime()) * 1000));
                        }
                    }
                }
                TextView textView3 = this.f85649m;
                if (this.f85637a.getDiggCount() != 0) {
                    i2 = 0;
                }
                textView3.setVisibility(i2);
                this.f85651o.setVisibility(0);
                this.f85650n.setVisibility(0);
            }
            if (this.f85637a.getGift() == null || this.f85637a.getGift().getImage() == null || this.f85637a.getGift().getImage().getUrlList() == null || this.f85637a.getGift().getImage().getUrlList().isEmpty()) {
                this.f85681M.setVisibility(8);
            } else {
                this.f85681M.setVisibility(0);
                TextView textView4 = this.f85682N;
                if (textView4 != null) {
                    if (C80471gb.m139482a()) {
                        i = R.drawable.lx;
                    } else {
                        i = R.drawable.lw;
                    }
                    textView4.setBackgroundResource(i);
                }
                C20766v a = C20761r.m39060a(C34735v.m70965a(this.f85637a.getGift().getImage()));
                a.f49092E = this.f85683O;
                a.f49125v = EnumC20767w.CENTER_INSIDE;
                a.mo34186c();
                this.f85681M.setOnClickListener(new View$OnClickListenerC36208aa(this));
            }
            C36535m.m74351a(this.f85637a, this.f85679K);
            mo63422c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.adapter.C36247s
    /* renamed from: a */
    public final void mo63417a(String str) {
        this.f85653q = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo63431a(View view) {
        int i;
        if (view.getId() == R.id.c3u && !C36535m.m74352a(this.f85637a) && this.f85637a.getCid() != null && this.f85651o.getVisibility() == 0) {
            if (!C31575b.m65865g().isLogin()) {
                C58957c.m108319a(C17873f.m33102j(), this.f85653q, "like_comment", new C80222ap().mo123649a("login_title", "").mo123649a("group_id", this.f85654r).mo123649a("log_pb", C59208ac.m108768c(this.f85654r)).f179700a);
            } else if (this.f85637a != null && this.f85633C != null) {
                if (C36487a.m74277a(this.f85637a)) {
                    boolean z = !this.f85637a.isUserDigged();
                    boolean isAuthorDigged = this.f85637a.isAuthorDigged();
                    if (TextUtils.equals(this.f85655s, C31575b.m65865g().getCurUserId()) && !TextUtils.equals(this.f85655s, Comment.getAuthorUid(this.f85637a))) {
                        if (z) {
                            C36539b.m74376b(this.f85653q, this.f85654r, this.f85655s, this.f85637a.getCid());
                        }
                        isAuthorDigged = z;
                    }
                    int diggCount = this.f85637a.getDiggCount();
                    if (z) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    mo63432a(z, diggCount + i, true, isAuthorDigged);
                }
                AbstractC36428a aVar = this.f85633C;
                Comment comment = this.f85637a;
                getAdapterPosition();
                aVar.mo63749c(comment);
            }
        }
    }

    public C36256x(View view, AbstractC36428a aVar) {
        super(view, aVar);
        this.f85672D = (TextView) view.findViewById(R.id.a_v);
        this.f85673E = (TextView) view.findViewById(R.id.a_q);
        this.f85674F = (TextView) view.findViewById(R.id.di0);
        this.f85675G = (TextView) view.findViewById(R.id.f2c);
        this.f85676H = (TextView) view.findViewById(R.id.f2g);
        this.f85677I = (TuxTextView) view.findViewById(R.id.a_e);
        this.f85678J = (TuxTextView) view.findViewById(R.id.dhz);
        this.f85679K = (TuxTextView) view.findViewById(R.id.d52);
        this.f85680L = (TuxTextView) view.findViewById(R.id.c8v);
        this.f85681M = (LinearLayout) view.findViewById(R.id.bal);
        this.f85682N = (TextView) view.findViewById(R.id.ban);
        this.f85683O = (SmartImageView) view.findViewById(R.id.bam);
        View findViewById = view.findViewById(R.id.c3u);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC36259y(this));
        }
        this.f85646j.setVisibility(8);
        view.setOnLongClickListener(new C36247s.View$OnClickListenerC36251a());
        this.f85675G.setOnTouchListener(this.f85684P);
        this.f85676H.setOnTouchListener(this.f85684P);
        TuxTextView tuxTextView = this.f85679K;
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(new C62023a.View$OnTouchListenerC62025a());
            this.f85679K.setOnClickListener(new View$OnClickListenerC36260z(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.adapter.C36247s
    /* renamed from: a */
    public final void mo63415a(Comment comment, Rect rect) {
        int i;
        super.mo63415a(comment, rect);
        if (this.f85637a != null && comment != null) {
            this.f85651o.setVisibility(0);
            this.f85673E.setVisibility(0);
            int diggCount = comment.getDiggCount();
            this.f85649m.setText(C53437b.m98615a((long) diggCount));
            mo63432a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
            TextView textView = this.f85649m;
            if (diggCount == 0) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            if (this.f85680L != null && (this.f85638b instanceof ConstraintLayout)) {
                C37210o.C37211a a = new C37210o((ConstraintLayout) this.f85638b).mo64762a();
                if (a != null) {
                    if (!this.f85660x || this.f85643g.getVisibility() != 0) {
                        a.mo64763a(R.id.eng, R.id.a_v);
                        if (this.f85681M.getVisibility() == 0) {
                            a.mo64763a(R.id.c8v, R.id.bal);
                        } else {
                            a.mo64763a(R.id.c8v, R.id.eng);
                        }
                        a.mo64763a(R.id.d52, R.id.di1);
                    } else {
                        if (this.f85681M.getVisibility() == 0) {
                            a.mo64763a(R.id.c8v, R.id.bal);
                        } else {
                            a.mo64763a(R.id.c8v, R.id.a_v);
                        }
                        a.mo64763a(R.id.eng, R.id.di1);
                        a.mo64763a(R.id.d52, R.id.eng);
                    }
                    C37210o.this.f87732a.mo2454b(C37210o.this.f87733b);
                } else {
                    return;
                }
            }
            C37188b.m75154b(comment, this.f85677I);
            C37188b.m75153a(comment, this.f85673E);
            C37208m.m75198a(this.f85675G, comment.getRelationLabel());
            this.f85675G.setBackgroundResource(R.drawable.ls);
            TextView textView2 = this.f85675G;
            textView2.setTextColor(textView2.getResources().getColor(R.color.bx));
            if (this.f85643g.getVisibility() == 0) {
                Comment comment2 = comment.getReplyComments().get(0);
                C37188b.m75154b(comment2, this.f85678J);
                C37188b.m75153a(comment2, this.f85674F);
                C37208m.m75198a(this.f85676H, comment2.getRelationLabel());
                this.f85676H.setBackgroundResource(R.drawable.ls);
                TextView textView3 = this.f85676H;
                textView3.setTextColor(textView3.getResources().getColor(R.color.bx));
            }
        }
    }

    /* renamed from: a */
    public final void mo63432a(boolean z, int i, boolean z2, boolean z3) {
        int i2;
        boolean z4;
        int i3;
        getClass().getSimpleName();
        if (this.f85680L != null) {
            if (!z3 || TextUtils.equals(this.f85655s, Comment.getAuthorUid(this.f85637a))) {
                z4 = false;
            } else {
                z4 = true;
            }
            TuxTextView tuxTextView = this.f85680L;
            if (z4) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            tuxTextView.setVisibility(i3);
        }
        if (z2) {
            this.f85650n.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36256x.RunnableC362582 */

                static {
                    Covode.recordClassIndex(43524);
                }

                public final void run() {
                    C36256x.this.f85650n.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.f85649m.setText(C53437b.m98615a((long) i));
        TextView textView = this.f85649m;
        if (i == 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (z) {
            this.f85650n.setSelected(true);
            this.f85650n.setImageDrawable(this.f85650n.getResources().getDrawable(2131232219));
            this.f85649m.setTextColor(this.f85649m.getResources().getColor(R.color.bh));
            return;
        }
        this.f85650n.setSelected(false);
        this.f85650n.setImageDrawable(this.f85650n.getResources().getDrawable(2131232220));
        this.f85649m.setTextColor(this.f85649m.getResources().getColor(R.color.c5));
    }
}
