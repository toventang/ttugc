package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3160a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54918b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.p3155a.C54916a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3156b.p3157a.C54919a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3161b.C54925a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3161b.C54931b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66621e;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a */
public final class C54922a extends AbstractC1483t<C54919a, RecyclerView.ViewHolder> {

    /* renamed from: d */
    public static final C54923a f125730d = new C54923a((byte) 0);

    /* renamed from: b */
    public C54931b.AbstractC54932a f125731b;

    /* renamed from: c */
    public AbstractC34478k<User> f125732c;

    /* renamed from: e */
    private final RecommendFriendInDMViewModel f125733e;

    static {
        Covode.recordClassIndex(64644);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m100545a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a$a */
    public static final class C54923a {
        static {
            Covode.recordClassIndex(64645);
        }

        private C54923a() {
        }

        public /* synthetic */ C54923a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54922a(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
        super(new C54918b());
        C89219l.m154721d(recommendFriendInDMViewModel, "");
        this.f125733e = recommendFriendInDMViewModel;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        int i2 = ((C54919a) mo5017a(i)).f125727a;
        if (i2 == 1) {
            return 1011;
        }
        if (i2 != 2) {
            return 1013;
        }
        return 1012;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        EnumC66622f fVar;
        User user;
        C89219l.m154721d(viewHolder, "");
        switch (getItemViewType(i)) {
            case 1011:
                if (viewHolder instanceof C54931b) {
                    C54931b.AbstractC54932a aVar = this.f125731b;
                    if (aVar != null) {
                        C54931b bVar = (C54931b) viewHolder;
                        C89219l.m154721d(aVar, "");
                        bVar.f125752b.setOnClickListener(new C54931b.View$OnClickListenerC54933b(bVar, aVar));
                    }
                    View view = viewHolder.itemView;
                    C89219l.m154716b(view, "");
                    String string = view.getContext().getString(R.string.evs);
                    C89219l.m154716b(string, "");
                    C54931b bVar2 = (C54931b) viewHolder;
                    C89219l.m154721d(string, "");
                    bVar2.f125751a.setText(string);
                    bVar2.f125752b.setIconRes(R.raw.icon_info_circle);
                    return;
                }
                return;
            case 1012:
                if (viewHolder instanceof C54924b) {
                    C54924b bVar3 = (C54924b) viewHolder;
                    if (((C54919a) mo5017a(i)).f125729c == 1) {
                        fVar = EnumC66622f.CONTACT;
                    } else {
                        fVar = EnumC66622f.FACEBOOK;
                    }
                    bVar3.f125734a.mo61459a(fVar, EnumC66621e.INBOX_NORMAL, -1);
                    C54916a.m100540a();
                    return;
                }
                return;
            case 1013:
                if ((viewHolder instanceof C54925a) && (user = ((C54919a) mo5017a(i)).f125728b) != null) {
                    C54925a aVar2 = (C54925a) viewHolder;
                    aVar2.f125736a = this.f125732c;
                    C89219l.m154721d(user, "");
                    boolean d = IMUnder16ProxyImpl.m102047n().mo93022d();
                    if (C80580in.m139687c() || d) {
                        aVar2.f125738c.mo61445a(false);
                    } else {
                        aVar2.f125738c.mo61445a(true);
                    }
                    aVar2.f125738c.mo61444a(user);
                    C51086a aVar3 = aVar2.f125737b;
                    if (aVar3 != null) {
                        aVar3.mo86508a(user);
                    }
                    C51086a aVar4 = aVar2.f125737b;
                    if (aVar4 != null) {
                        aVar4.f117879e = new C54925a.C54927a(aVar2, user, d);
                    }
                    C51086a aVar5 = aVar2.f125737b;
                    if (aVar5 != null) {
                        aVar5.f117878d = new C54925a.C54928b(aVar2, user);
                    }
                    C51086a aVar6 = aVar2.f125737b;
                    if (aVar6 != null) {
                        aVar6.f117880f = new C54925a.C54929c(aVar2, user);
                    }
                    aVar2.f125738c.setEventListener(new C54925a.C54930d(aVar2, user));
                    C54916a.m100540a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m100545a(C54922a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(4829);
        C89219l.m154721d(viewGroup, "");
        if (i == 1011) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.mh, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C54931b(a2);
        } else if (i != 1012) {
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            viewHolder = new C54925a(b.mo105667a(context, 7), aVar.f125733e);
        } else {
            RecommendUserService b2 = RecommendUserServiceImpl.m118456b();
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            viewHolder = new C54924b(b2.mo105668a(context2), aVar.f125733e);
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
        MethodCollector.m26664o(4829);
        return viewHolder;
    }
}
