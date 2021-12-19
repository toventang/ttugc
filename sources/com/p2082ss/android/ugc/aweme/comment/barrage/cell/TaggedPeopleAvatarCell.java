package com.p2082ss.android.ugc.aweme.comment.barrage.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36305b;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36311e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleAvatarCell */
public final class TaggedPeopleAvatarCell extends PowerCell<C36311e> {

    /* renamed from: a */
    public static final C36339a f85908a = new C36339a((byte) 0);

    /* renamed from: b */
    private SmartImageView f85909b;

    /* renamed from: j */
    private C36311e f85910j;

    static {
        Covode.recordClassIndex(43619);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleAvatarCell$a */
    public static final class C36339a {
        static {
            Covode.recordClassIndex(43620);
        }

        private C36339a() {
        }

        public /* synthetic */ C36339a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
        C36311e eVar = this.f85910j;
        if (eVar != null && !eVar.f85837c.contains(eVar.f85835a.getUid())) {
            Set<String> set = eVar.f85837c;
            String uid = eVar.f85835a.getUid();
            String str = "";
            C89219l.m154716b(uid, str);
            set.add(uid);
            C33744d a = new C33744d().mo59983a("enter_from", eVar.f85836b.enterFrom);
            String str2 = eVar.f85836b.awemeId;
            if (str2 == null) {
                str2 = str;
            }
            C33744d a2 = a.mo59983a("group_id", str2);
            String str3 = eVar.f85836b.authorUid;
            if (str3 == null) {
                str3 = str;
            }
            C33744d a3 = a2.mo59983a("author_id", str3);
            String uid2 = eVar.f85835a.getUid();
            if (uid2 != null) {
                str = uid2;
            }
            C39162r.m79460a("show_tagged_user", a3.mo59983a("to_user_id", str).mo59983a("anchor_type", "low_interest").f79943a);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jp, viewGroup, false);
        this.f85909b = (SmartImageView) a.findViewById(R.id.o3);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36311e eVar) {
        C36311e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        super.mo23350a((AbstractC17641a) eVar2);
        C20766v a = C20761r.m39060a(C34735v.m70965a(eVar2.f85835a.getAvatarThumb())).mo34179a("TaggedPeopleAvatarCell");
        a.f49092E = this.f85909b;
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        C20745e a2 = aVar.mo34169a();
        C89219l.m154716b(a2, "");
        a.f49126w = a2;
        a.f49106c = true;
        a.mo34186c();
        SmartImageView smartImageView = this.f85909b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new View$OnClickListenerC36340b(this, eVar2));
        }
        this.f85910j = eVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleAvatarCell$b */
    static final class View$OnClickListenerC36340b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TaggedPeopleAvatarCell f85911a;

        /* renamed from: b */
        final /* synthetic */ C36311e f85912b;

        static {
            Covode.recordClassIndex(43621);
        }

        View$OnClickListenerC36340b(TaggedPeopleAvatarCell taggedPeopleAvatarCell, C36311e eVar) {
            this.f85911a = taggedPeopleAvatarCell;
            this.f85912b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TaggedPeopleAvatarCell taggedPeopleAvatarCell = this.f85911a;
            User user = this.f85912b.f85835a;
            C36311e eVar = this.f85912b;
            View view2 = taggedPeopleAvatarCell.itemView;
            String str = "";
            C89219l.m154716b(view2, str);
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
            C36305b bVar = eVar.f85836b;
            C59252q f = new C59252q().mo96749g(bVar.aweme);
            String str2 = bVar.enterFrom;
            if (str2 == null) {
                str2 = str;
            }
            C59252q qVar = (C59252q) f.mo96825o(str2).mo96741a("tag");
            qVar.f135314q = user.getUid();
            qVar.f135312e = bVar.awemeId;
            qVar.f135313p = bVar.authorUid;
            qVar.mo96792f();
            C33744d a = new C33744d().mo59983a("enter_from", eVar.f85836b.enterFrom);
            String str3 = eVar.f85836b.awemeId;
            if (str3 == null) {
                str3 = str;
            }
            C33744d a2 = a.mo59983a("group_id", str3);
            String str4 = eVar.f85836b.authorUid;
            if (str4 == null) {
                str4 = str;
            }
            C33744d a3 = a2.mo59983a("author_id", str4);
            String uid = eVar.f85835a.getUid();
            if (uid != null) {
                str = uid;
            }
            C39162r.m79460a("click_tagged_user", a3.mo59983a("to_user_id", str).mo59983a("click_type", "click_head").mo59983a("anchor_type", "low_interest").f79943a);
        }
    }
}
