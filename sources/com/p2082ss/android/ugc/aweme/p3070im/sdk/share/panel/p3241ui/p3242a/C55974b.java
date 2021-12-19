package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.p3078b.C53610a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55966a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3240b.C55970a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56014g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56019h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56025i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.EnumC79710d;
import com.p2082ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b */
public class C55974b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final C55975a f127638a = new C55975a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f127639b = C89250i.m154773a((AbstractC89171a) C55976b.f127641a);

    /* renamed from: c */
    private final SharePanelViewModel f127640c;

    static {
        Covode.recordClassIndex(65768);
    }

    /* renamed from: a */
    private final List<IMContact> m101849a() {
        return (List) this.f127639b.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m101848a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b$a */
    public static final class C55975a {
        static {
            Covode.recordClassIndex(65769);
        }

        private C55975a() {
        }

        public /* synthetic */ C55975a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b$b */
    static final class C55976b extends AbstractC89220m implements AbstractC89171a<List<IMContact>> {

        /* renamed from: a */
        public static final C55976b f127641a = new C55976b();

        static {
            Covode.recordClassIndex(65770);
        }

        C55976b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return m101849a().size();
    }

    public C55974b(SharePanelViewModel sharePanelViewModel) {
        C89219l.m154721d(sharePanelViewModel, "");
        this.f127640c = sharePanelViewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        IMContact iMContact = m101849a().get(i);
        if (iMContact instanceof C55966a) {
            return 2;
        }
        if (iMContact instanceof C55970a) {
            return 3;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof C56025i)) {
            viewHolder = null;
        }
        C56025i iVar = (C56025i) viewHolder;
        if (iVar != null) {
            iVar.f127752f = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        String second;
        String uid;
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        IMUser iMUser = null;
        if (!(viewHolder instanceof C56025i)) {
            viewHolder = null;
        }
        C56025i iVar = (C56025i) viewHolder;
        if (iVar != null) {
            int i = 1;
            iVar.f127752f = true;
            C89378p<Boolean, String> pVar = iVar.f127753g;
            if (!(pVar == null || (second = pVar.getSecond()) == null || second.length() == 0)) {
                IMContact iMContact = iVar.f127749c;
                if (iMContact instanceof IMUser) {
                    iMUser = iMContact;
                }
                IMUser iMUser2 = iMUser;
                if (!(iMUser2 == null || (uid = iMUser2.getUid()) == null || iVar.f127756j.mo92939c().contains(uid))) {
                    boolean booleanValue = pVar.getFirst().booleanValue();
                    String second2 = pVar.getSecond();
                    C89219l.m154721d("share_head_online_status_show", "");
                    JSONObject jSONObject = new JSONObject();
                    if (!booleanValue) {
                        i = 0;
                    }
                    try {
                        jSONObject.put("online_dot", i);
                        jSONObject.put("online_status", second2);
                        jSONObject.put("to_user_id", uid);
                    } catch (Throwable unused) {
                    }
                    C39162r.m79461a("share_head_online_status_show", jSONObject);
                    iVar.f127756j.mo92939c().add(uid);
                }
            }
            IMContact iMContact2 = iVar.f127749c;
            if (iMContact2 != null) {
                C55940a.m101781a(iMContact2, iVar.f127750d, "row", iVar.f127756j.f127873d, false, C55940a.C55941a.f127577a);
            }
        }
    }

    /* renamed from: a */
    public final void mo92843a(List<? extends IMContact> list) {
        StringBuilder sb = new StringBuilder("setData: ");
        Integer num = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        C56244a.m102191c("SharePanelHeadAdapter", sb.append(num).toString());
        List<IMContact> a = m101849a();
        if (!(list == null || list.isEmpty() || a == null)) {
            a.clear();
            if (this.f127640c.mo92942f()) {
                a.add(new C55970a(C53610a.m98851a().getBoolean("has_upvote_bounce_shown_" + C53610a.m98852b(), false)));
            }
            if (list == null) {
                C89219l.m154715b();
            }
            a.addAll(list);
            a.add(new C55966a());
            notifyDataSetChanged();
        }
        C56244a.m102191c("SharePanelHeadAdapter", "setData finish: " + m101849a().size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IMContact iMContact;
        String str;
        T t;
        int i2;
        String str2;
        Bundle bundle;
        List<String> urlList;
        boolean z;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C56014g) {
            C56014g gVar = (C56014g) viewHolder;
            IMContact iMContact2 = m101849a().get(i);
            C89219l.m154721d(iMContact2, "");
            gVar.f127730c = iMContact2;
            gVar.f127728a.setImageDrawable(C17867d.m33078a().getResources().getDrawable(gVar.f127729b));
            return;
        }
        float f = 0.34f;
        boolean z2 = false;
        if (viewHolder instanceof C56025i) {
            C56025i iVar = (C56025i) viewHolder;
            IMContact iMContact3 = m101849a().get(i);
            C89219l.m154721d(iMContact3, "");
            iVar.f127749c = iMContact3;
            iVar.f127750d = i;
            iVar.f127753g = null;
            iVar.mo92874a(iVar.f127756j.mo92938b().contains(iMContact3));
            C56025i.C56031d dVar = new C56025i.C56031d(iVar);
            iVar.f127753g = null;
            dVar.mo92877a(2);
            boolean z3 = iMContact3 instanceof IMUser;
            if (z3) {
                IMUser iMUser = (IMUser) iMContact3;
                iVar.mo92873a(iMUser);
                C34577e.m70592a(iVar.f127748b, iMUser.getDisplayAvatar());
            } else if (iMContact3 instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) iMContact3;
                iVar.mo92872a(iMConversation);
                UrlModel displayAvatar = iMConversation.getDisplayAvatar();
                if (!(displayAvatar == null || (urlList = displayAvatar.getUrlList()) == null || urlList.isEmpty() || displayAvatar == null)) {
                    C34577e.m70592a(iVar.f127748b, displayAvatar);
                }
            }
            if (!iVar.f127756j.f127871b || (z3 && IMUser.isFriend(((IMUser) iMContact3).getFollowStatus()))) {
                z = false;
            } else {
                z = true;
            }
            if (iVar.f127756j.f127872c || z) {
                z2 = true;
            }
            iVar.f127755i = z2;
            iVar.f127754h = z;
            if (z) {
                iVar.f127755i = true;
            }
            View view = iVar.itemView;
            C89219l.m154716b(view, "");
            if (!iVar.f127754h) {
                f = 1.0f;
            }
            view.setAlpha(f);
        } else if (viewHolder instanceof C56019h) {
            C56019h hVar = (C56019h) viewHolder;
            IMContact iMContact4 = m101849a().get(i);
            C89219l.m154721d(iMContact4, "");
            if (!(iMContact4 instanceof C55970a)) {
                iMContact = null;
            } else {
                iMContact = iMContact4;
            }
            C55970a aVar = (C55970a) iMContact;
            if (aVar != null) {
                SharePackage sharePackage = hVar.f127736a.f127873d;
                if (sharePackage == null || (bundle = sharePackage.f155492i) == null || (str = bundle.getString("aid")) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                List<C79714h> a = UpvoteServiceImpl.m138748d().mo123477a(str);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String curUserId = g.getCurUserId();
                Iterator<T> it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    User user = t.getUser();
                    if (user != null) {
                        str2 = user.getUid();
                    } else {
                        str2 = null;
                    }
                    if (C89219l.m154714a((Object) str2, (Object) curUserId)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    i2 = 0;
                } else if (t2.getCacheState() == EnumC79710d.PRE_PUBLISH) {
                    i2 = 1;
                } else if (t2.getCacheState() == EnumC79710d.PRE_REMOVE) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                if (C89064i.m154489a(new Integer[]{0, 1}, Integer.valueOf(i2))) {
                    int intValue = ((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f64), Integer.valueOf((int) R.string.fai))).intValue();
                    hVar.mo92868a().setAnimation((String) C79706b.m138537a("im_upvote_recommend_guide.json", "im_upvote_repost_guide.json"));
                    TuxTextView b = hVar.mo92870b();
                    C89219l.m154716b(b, "");
                    b.setText(C34722h.m70923b(intValue));
                } else {
                    int intValue2 = ((Number) C79706b.m138537a(2131232845, 2131232846)).intValue();
                    int intValue3 = ((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f65), Integer.valueOf((int) R.string.faj))).intValue();
                    hVar.mo92868a().setImageResource(intValue2);
                    TuxTextView b2 = hVar.mo92870b();
                    C89219l.m154716b(b2, "");
                    b2.setText(C34722h.m70923b(intValue3));
                }
                if (hVar.mo92869a(i2)) {
                    AnimationImageView a2 = hVar.mo92868a();
                    C89219l.m154716b(a2, "");
                    a2.setAlpha(0.34f);
                    TuxTextView b3 = hVar.mo92870b();
                    C89219l.m154716b(b3, "");
                    b3.setAlpha(0.34f);
                } else {
                    AnimationImageView a3 = hVar.mo92868a();
                    C89219l.m154716b(a3, "");
                    a3.setAlpha(1.0f);
                    TuxTextView b4 = hVar.mo92870b();
                    C89219l.m154716b(b4, "");
                    b4.setAlpha(1.0f);
                }
                if (!aVar.getHasShownGuide() && i2 == 0) {
                    C53610a.m98851a().storeBoolean("has_upvote_bounce_shown_" + C53610a.m98852b(), true);
                    AnimationImageView a4 = hVar.mo92868a();
                    C89219l.m154716b(a4, "");
                    a4.setRepeatCount(3);
                    hVar.mo92868a().mo5826a();
                }
                if (hVar.mo92869a(i2)) {
                    hVar.mo92868a().setOnClickListener(null);
                } else {
                    hVar.mo92868a().setOnClickListener(new C56019h.View$OnClickListenerC56022c(hVar, iMContact4));
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m101848a(C55974b bVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(2793);
        C89219l.m154721d(viewGroup, "");
        if (i == 2) {
            SharePanelViewModel sharePanelViewModel = bVar.f127640c;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(sharePanelViewModel, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a5_, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C56014g(a2, sharePanelViewModel);
        } else if (i != 3) {
            SharePanelViewModel sharePanelViewModel2 = bVar.f127640c;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(sharePanelViewModel2, "");
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6p, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C56025i(a3, sharePanelViewModel2);
        } else {
            SharePanelViewModel sharePanelViewModel3 = bVar.f127640c;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(sharePanelViewModel3, "");
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6s, viewGroup, false);
            C89219l.m154716b(a4, "");
            viewHolder = new C56019h(a4, sharePanelViewModel3);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(2793);
        return viewHolder;
    }
}
