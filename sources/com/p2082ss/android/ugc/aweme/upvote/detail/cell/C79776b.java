package com.p2082ss.android.ugc.aweme.upvote.detail.cell;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.p2082ss.android.ugc.aweme.upvote.event.C79899b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.b */
public final class C79776b {

    /* renamed from: h */
    public static final C79777a f178970h = new C79777a((byte) 0);

    /* renamed from: a */
    public final TuxIconView f178971a;

    /* renamed from: b */
    public boolean f178972b;

    /* renamed from: c */
    public int f178973c;

    /* renamed from: d */
    User f178974d;

    /* renamed from: e */
    C79899b f178975e;

    /* renamed from: f */
    final ViewGroup f178976f;

    /* renamed from: g */
    final UpvoteDetailPanelViewModel f178977g;

    /* renamed from: i */
    private final TuxTextView f178978i;

    static {
        Covode.recordClassIndex(93000);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.b$a */
    public static final class C79777a {
        static {
            Covode.recordClassIndex(93001);
        }

        private C79777a() {
        }

        public /* synthetic */ C79777a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.b$b */
    static final class RunnableC79778b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C79776b f178979a;

        static {
            Covode.recordClassIndex(93002);
        }

        RunnableC79778b(C79776b bVar) {
            this.f178979a = bVar;
        }

        public final void run() {
            this.f178979a.f178971a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.b$d */
    static final class C79780d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79776b f178982a;

        static {
            Covode.recordClassIndex(93004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79780d(C79776b bVar) {
            super(0);
            this.f178982a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C79776b bVar = this.f178982a;
            int i = 1;
            boolean z = !bVar.f178972b;
            int i2 = bVar.f178973c;
            if (bVar.f178972b) {
                i = -1;
            }
            bVar.mo123363a(z, i2 + i);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.b$c */
    public static final class C79779c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f178980a;

        /* renamed from: b */
        final /* synthetic */ int f178981b;

        static {
            Covode.recordClassIndex(93003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79779c(int i, int i2) {
            super(1);
            this.f178980a = i;
            this.f178981b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f178980a;
            aVar2.f54435e = Integer.valueOf(this.f178981b);
            return C89391z.f203057a;
        }
    }

    public C79776b(ViewGroup viewGroup, UpvoteDetailPanelViewModel upvoteDetailPanelViewModel) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(upvoteDetailPanelViewModel, "");
        this.f178976f = viewGroup;
        this.f178977g = upvoteDetailPanelViewModel;
        View findViewById = viewGroup.findViewById(R.id.bgo);
        C89219l.m154716b(findViewById, "");
        this.f178971a = (TuxIconView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.eva);
        C89219l.m154716b(findViewById2, "");
        this.f178978i = (TuxTextView) findViewById2;
    }

    /* renamed from: a */
    public final void mo123363a(boolean z, int i) {
        int i2;
        int i3;
        int i4;
        this.f178972b = z;
        this.f178973c = i;
        if (z) {
            i2 = R.raw.icon_heart_fill;
            i3 = R.attr.ay;
        } else {
            i2 = R.raw.icon_heart;
            i3 = R.attr.bi;
        }
        this.f178971a.setTuxIcon(C23005c.m43393a(new C79779c(i2, i3)));
        this.f178978i.setText(C53437b.m98615a((long) i));
        TuxTextView tuxTextView = this.f178978i;
        if (i <= 0) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        tuxTextView.setVisibility(i4);
    }
}
