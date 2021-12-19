package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.view.SearchFollowUserBtn;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.b */
public final class C41755b extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: p */
    public static final C41757a f97405p = new C41757a((byte) 0);

    /* renamed from: a */
    public AvatarImageView f97406a;

    /* renamed from: b */
    public TuxTextView f97407b;

    /* renamed from: c */
    public TuxTextView f97408c;

    /* renamed from: d */
    public SearchFollowUserBtn f97409d;

    /* renamed from: e */
    public C51086a f97410e;

    /* renamed from: f */
    public User f97411f;

    /* renamed from: g */
    public C42410g f97412g;

    /* renamed from: h */
    public String f97413h = "";

    /* renamed from: i */
    public int f97414i;

    /* renamed from: m */
    public int f97415m;

    /* renamed from: n */
    public String f97416n = "";

    /* renamed from: o */
    public AbstractC51187d f97417o;

    static {
        Covode.recordClassIndex(49670);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.b$a */
    public static final class C41757a {
        static {
            Covode.recordClassIndex(49672);
        }

        private C41757a() {
        }

        public /* synthetic */ C41757a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.b$b */
    public static final class C41758b extends C51086a.C51094g {

        /* renamed from: a */
        final /* synthetic */ C41755b f97419a;

        static {
            Covode.recordClassIndex(49673);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        public final String getEnterFrom() {
            return "search_result";
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        public final String getEnterMethod() {
            return "click_follow";
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        public final int getFollowFromType() {
            return 14;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C41758b(C41755b bVar) {
            this.f97419a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            String str;
            AbstractC51187d dVar;
            if (i == 0) {
                str = "click_cancel_follow";
            } else {
                str = "click_follow_button";
            }
            this.f97419a.mo70940b(str);
            if (user != null && (dVar = this.f97419a.f97417o) != null) {
                dVar.mo71326a(user);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41755b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97406a = (AvatarImageView) view.findViewById(R.id.nz);
        this.f97407b = (TuxTextView) view.findViewById(R.id.fa1);
        this.f97408c = (TuxTextView) view.findViewById(R.id.fa5);
        SearchFollowUserBtn searchFollowUserBtn = (SearchFollowUserBtn) view.findViewById(R.id.b6a);
        C89219l.m154716b(searchFollowUserBtn, "");
        this.f97409d = searchFollowUserBtn;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41755b.View$OnClickListenerC417561 */

            /* renamed from: a */
            final /* synthetic */ C41755b f97418a;

            static {
                Covode.recordClassIndex(49671);
            }

            {
                this.f97418a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C41755b bVar = this.f97418a;
                AbstractC51187d dVar = bVar.f97417o;
                if (dVar != null) {
                    View view2 = bVar.itemView;
                    User user = bVar.f97411f;
                    if (user == null) {
                        C89219l.m154710a("mItem");
                    }
                    int adapterPosition = bVar.getAdapterPosition();
                    User user2 = bVar.f97411f;
                    if (user2 == null) {
                        C89219l.m154710a("mItem");
                    }
                    dVar.mo71325a(view2, user, adapterPosition, C42312e.m84674a(user2), null);
                }
                bVar.mo70940b("click_info");
            }
        });
    }

    /* renamed from: b */
    public final void mo70940b(String str) {
        C89219l.m154721d(str, "");
        C67542d dVar = (C67542d) C42317b.m84680b(mo70877F()).mo106487g(this.f97416n);
        User user = this.f97411f;
        if (user == null) {
            C89219l.m154710a("mItem");
        }
        C67542d dVar2 = (C67542d) ((C67542d) ((C67542d) dVar.mo106493t(C42312e.m84674a(user)).mo106459o("general_search")).mo106497x(this.f97413h).mo106479a(Integer.valueOf(this.f97414i)).mo106456l(mo70877F().f151323r)).mo106491r("user");
        User user2 = this.f97411f;
        if (user2 == null) {
            C89219l.m154710a("mItem");
        }
        C67542d dVar3 = (C67542d) dVar2.mo106495v(user2.getUid());
        User user3 = this.f97411f;
        if (user3 == null) {
            C89219l.m154710a("mItem");
        }
        ((C67496as) ((C67542d) dVar3.mo106492s(user3.getNickname())).mo106490d(Integer.valueOf(this.f97415m))).mo106440B(str).mo96792f();
    }
}
