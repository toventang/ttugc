package com.p2082ss.android.ugc.aweme.mix.profile.entry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59393g;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell */
public final class PlayListNameCell extends PowerCell<C59910b> {
    static {
        Covode.recordClassIndex(70319);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell$b */
    public static final class ViewTreeObserver$OnPreDrawListenerC59908b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ PlayListNameCell f136440a;

        /* renamed from: b */
        final /* synthetic */ C59910b f136441b;

        static {
            Covode.recordClassIndex(70321);
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x015a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x015d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
            // Method dump skipped, instructions count: 371
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell.ViewTreeObserver$OnPreDrawListenerC59908b.onPreDraw():boolean");
        }

        ViewTreeObserver$OnPreDrawListenerC59908b(PlayListNameCell playListNameCell, C59910b bVar) {
            this.f136440a = playListNameCell;
            this.f136441b = bVar;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao3, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell$a */
    static final class View$OnClickListenerC59907a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PlayListNameCell f136436a;

        /* renamed from: b */
        final /* synthetic */ C59910b f136437b;

        /* renamed from: c */
        final /* synthetic */ boolean f136438c;

        /* renamed from: d */
        final /* synthetic */ C59538b f136439d;

        static {
            Covode.recordClassIndex(70320);
        }

        View$OnClickListenerC59907a(PlayListNameCell playListNameCell, C59910b bVar, boolean z, C59538b bVar2) {
            this.f136436a = playListNameCell;
            this.f136437b = bVar;
            this.f136438c = z;
            this.f136439d = bVar2;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            IMixFeedService k = MixFeedService.m109435k();
            View view2 = this.f136436a.itemView;
            C89219l.m154716b(view2, "");
            Context context = ((TuxButton) view2).getContext();
            String str = this.f136437b.f136445d;
            if (str == null) {
                str = "";
            }
            String str2 = this.f136437b.f136447f;
            String str3 = this.f136437b.f136448g;
            if (!this.f136438c || this.f136437b.f136450i) {
                z = false;
            } else {
                z = true;
            }
            k.mo97315a(context, "", (Aweme) null, "from_profile_mix_list", str, str2, str3, z, this.f136439d, this.f136437b.f136449h);
            String str4 = this.f136437b.f136449h;
            String str5 = this.f136437b.f136445d;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = this.f136437b.f136447f;
            String str7 = this.f136437b.f136452k;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = this.f136437b.f136453l;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = this.f136437b.f136451j;
            if (str9 == null) {
                str9 = "";
            }
            C59330a.m109035a(str4, str5, str6, null, 0, "click_profile", str7, str8, str9, this.f136439d, 8);
            String str10 = this.f136437b.f136449h;
            String str11 = this.f136437b.f136445d;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = this.f136437b.f136447f;
            C89219l.m154721d(str10, "");
            C89219l.m154721d(str11, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(str12, "");
            C39162r.m79460a("click_playlist_entrance", new C33744d().mo59983a("enter_from", str10).mo59983a("playlist_id", str11).mo59983a("group_id", "").mo59983a("author_id", str12).f79943a);
            AbstractC59393g gVar = this.f136437b.f136455n;
            if (gVar != null) {
                gVar.mo97058a(this.f136437b.f136445d, this.f136437b.f136443b, Integer.valueOf(this.f136436a.getLayoutPosition()));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C59910b bVar) {
        int i;
        C59910b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        Objects.requireNonNull(this.itemView, "null cannot be cast to non-null type com.bytedance.tux.button.TuxButton");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((TuxButton) this.itemView).setIconTintColor(((TuxButton) view).getResources().getColor(R.color.bx));
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ((TuxButton) view2).setText(bVar2.f136443b);
        C31575b.m65859a();
        IAccountUserService e = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e, "");
        boolean a = C89219l.m154714a((Object) e.getCurUserId(), (Object) bVar2.f136447f);
        String str = bVar2.f136452k;
        if (bVar2.f136450i) {
            i = 0;
        } else {
            i = -1;
        }
        C59538b bVar3 = new C59538b(str, Integer.valueOf(i), bVar2.f136454m, 0, 8, null);
        if (bVar2.f136446e) {
            String str2 = bVar2.f136449h;
            String str3 = bVar2.f136445d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = bVar2.f136447f;
            String str5 = bVar2.f136452k;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = bVar2.f136453l;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = bVar2.f136451j;
            if (str7 == null) {
                str7 = "";
            }
            C59330a.m109036a(str2, str3, null, str4, str5, str6, str7, bVar3, 4);
            bVar2.f136446e = false;
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC59907a(this, bVar2, a, bVar3));
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        ((TuxButton) view3).setMinWidth(C59911c.f136461o);
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        ((TuxButton) view4).getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC59908b(this, bVar2));
    }
}
