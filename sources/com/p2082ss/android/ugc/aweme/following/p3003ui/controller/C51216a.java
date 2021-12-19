package com.p2082ss.android.ugc.aweme.following.p3003ui.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.TopRecommendVM;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.EnumC74790k;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.controller.a */
public class C51216a implements AbstractC74788j {

    /* renamed from: a */
    public final TopRecommendVM f118139a;

    /* renamed from: b */
    public final DmtStatusView f118140b;

    /* renamed from: c */
    public final AbstractC74788j f118141c;

    static {
        Covode.recordClassIndex(60420);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: a */
    public void mo86627a(User user) {
        C89219l.m154721d(user, "");
        this.f118141c.mo86627a(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: d */
    public final void mo86630d(int i) {
        boolean z;
        TopRecommendVM topRecommendVM = this.f118139a;
        if (i <= 0) {
            z = true;
        } else {
            z = false;
        }
        topRecommendVM.f118447c = z;
        topRecommendVM.mo86787a(true ^ topRecommendVM.f118447c);
        this.f118141c.mo86630d(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: a */
    public final void mo86629a(EnumC74790k kVar) {
        C89219l.m154721d(kVar, "");
        if (kVar == EnumC74790k.LOADING) {
            this.f118140b.mo27384f();
        } else if (!this.f118140b.mo27390k()) {
            this.f118140b.mo27382d();
        }
        this.f118141c.mo86629a(kVar);
    }

    public C51216a(TopRecommendVM topRecommendVM, DmtStatusView dmtStatusView, AbstractC74788j jVar) {
        C89219l.m154721d(topRecommendVM, "");
        C89219l.m154721d(dmtStatusView, "");
        C89219l.m154721d(jVar, "");
        this.f118139a = topRecommendVM;
        this.f118140b = dmtStatusView;
        this.f118141c = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
    /* renamed from: a */
    public void mo86628a(EnumC74761f fVar, EnumC74760e eVar, List<? extends User> list) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        this.f118141c.mo86628a(fVar, eVar, list);
    }
}
