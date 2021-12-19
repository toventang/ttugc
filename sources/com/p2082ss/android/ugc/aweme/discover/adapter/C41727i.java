package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41755b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.view.SearchFollowUserBtn;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.i */
public final class C41727i extends RecyclerView.AbstractC1350a<C41755b> {

    /* renamed from: a */
    public List<SearchUser> f97346a = new ArrayList();

    /* renamed from: b */
    public C42410g f97347b;

    /* renamed from: c */
    public int f97348c;

    /* renamed from: d */
    public String f97349d = "";

    /* renamed from: e */
    public AbstractC51187d f97350e;

    static {
        Covode.recordClassIndex(49640);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C41755b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83690a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f97346a.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(C41755b bVar) {
        C41755b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        super.onViewAttachedToWindow(bVar2);
        C67542d dVar = (C67542d) C42317b.m84679a(bVar2.mo70877F()).mo106487g(bVar2.f97416n).mo106459o("general_search");
        User user = bVar2.f97411f;
        if (user == null) {
            C89219l.m154710a("mItem");
        }
        C67542d dVar2 = (C67542d) ((C67542d) ((C67542d) dVar.mo106493t(C42312e.m84674a(user))).mo106497x(bVar2.f97413h).mo106479a(Integer.valueOf(bVar2.f97414i))).mo106491r("user");
        User user2 = bVar2.f97411f;
        if (user2 == null) {
            C89219l.m154710a("mItem");
        }
        C67542d dVar3 = (C67542d) dVar2.mo106495v(user2.getUid());
        User user3 = bVar2.f97411f;
        if (user3 == null) {
            C89219l.m154710a("mItem");
        }
        ((C67542d) dVar3.mo106492s(user3.getNickname())).mo106490d(Integer.valueOf(bVar2.f97415m)).mo96792f();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C41755b bVar, int i) {
        String str;
        C41755b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        C42410g gVar = this.f97347b;
        SearchUser searchUser = this.f97346a.get(i);
        AbstractC51187d dVar = this.f97350e;
        C89219l.m154721d(searchUser, "");
        User user = searchUser.user;
        C89219l.m154716b(user, "");
        bVar2.f97411f = user;
        bVar2.f97415m = i;
        bVar2.f97412g = gVar;
        C42410g gVar2 = bVar2.f97412g;
        String str2 = null;
        if (gVar2 != null) {
            str = gVar2.f98786b;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            C42410g gVar3 = bVar2.f97412g;
            if (gVar3 != null) {
                str2 = gVar3.f98786b;
            }
        } else {
            str2 = "charac_user";
        }
        bVar2.f97413h = str2;
        AvatarImageView avatarImageView = bVar2.f97406a;
        User user2 = bVar2.f97411f;
        if (user2 == null) {
            C89219l.m154710a("mItem");
        }
        C34577e.m70592a(avatarImageView, user2.getAvatarThumb());
        User user3 = bVar2.f97411f;
        if (user3 == null) {
            C89219l.m154710a("mItem");
        }
        if (C63770ai.m139700m(user3)) {
            TuxTextView tuxTextView = bVar2.f97407b;
            C89219l.m154716b(tuxTextView, "");
            StringBuilder sb = new StringBuilder("@");
            User user4 = bVar2.f97411f;
            if (user4 == null) {
                C89219l.m154710a("mItem");
            }
            tuxTextView.setText(sb.append(user4.getUniqueId()).toString());
            TuxTextView tuxTextView2 = bVar2.f97408c;
            C89219l.m154716b(tuxTextView2, "");
            User user5 = bVar2.f97411f;
            if (user5 == null) {
                C89219l.m154710a("mItem");
            }
            tuxTextView2.setText(user5.getNickname());
        } else {
            TuxTextView tuxTextView3 = bVar2.f97407b;
            C89219l.m154716b(tuxTextView3, "");
            User user6 = bVar2.f97411f;
            if (user6 == null) {
                C89219l.m154710a("mItem");
            }
            tuxTextView3.setText(user6.getNickname());
            TuxTextView tuxTextView4 = bVar2.f97408c;
            C89219l.m154716b(tuxTextView4, "");
            StringBuilder sb2 = new StringBuilder("@");
            User user7 = bVar2.f97411f;
            if (user7 == null) {
                C89219l.m154710a("mItem");
            }
            tuxTextView4.setText(sb2.append(user7.getUniqueId()).toString());
        }
        View view = bVar2.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        User user8 = bVar2.f97411f;
        if (user8 == null) {
            C89219l.m154710a("mItem");
        }
        String customVerify = user8.getCustomVerify();
        User user9 = bVar2.f97411f;
        if (user9 == null) {
            C89219l.m154710a("mItem");
        }
        C80581io.m139704a(context, customVerify, user9.getEnterpriseVerifyReason(), bVar2.f97408c);
        SearchFollowUserBtn searchFollowUserBtn = bVar2.f97409d;
        ViewGroup.LayoutParams buttonLayoutParams = searchFollowUserBtn.getButtonLayoutParams();
        buttonLayoutParams.height = C34728n.m70946a(30.0d);
        buttonLayoutParams.width = C34728n.m70946a(68.0d);
        searchFollowUserBtn.setButtonLayoutParams(buttonLayoutParams);
        searchFollowUserBtn.getLayoutParams().height = buttonLayoutParams.height;
        searchFollowUserBtn.requestLayout();
        bVar2.f97410e = new C51086a(bVar2.f97409d, new C41755b.C41758b(bVar2));
        C51086a aVar = bVar2.f97410e;
        if (aVar == null) {
            C89219l.m154710a("followBlock");
        }
        User user10 = bVar2.f97411f;
        if (user10 == null) {
            C89219l.m154710a("mItem");
        }
        aVar.mo86508a(user10);
        bVar2.f97417o = dVar;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m83690a(C41727i iVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8416);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aui, viewGroup, false);
        C89219l.m154716b(a2, "");
        C41755b bVar = new C41755b(a2);
        bVar.f97414i = iVar.f97348c;
        String str = iVar.f97349d;
        C89219l.m154721d(str, "");
        bVar.f97416n = str;
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(8416);
        return bVar;
    }
}
