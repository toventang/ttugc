package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55194d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55966a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C55980a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C55997d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56007e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56010f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56204e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a */
public final class C55971a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: c */
    public static final C55972a f127631c = new C55972a((byte) 0);

    /* renamed from: a */
    public final List<Integer> f127632a = new ArrayList();

    /* renamed from: b */
    public final List<Integer> f127633b = new ArrayList();

    /* renamed from: d */
    private final AbstractC89244h f127634d = C89250i.m154773a((AbstractC89171a) C55973b.f127637a);

    /* renamed from: e */
    private final SharePanelViewModel f127635e;

    /* renamed from: f */
    private final AbstractC56264b f127636f;

    static {
        Covode.recordClassIndex(65765);
    }

    /* renamed from: a */
    public final List<IMContact> mo92842a() {
        return (List) this.f127634d.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m101846a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a$a */
    public static final class C55972a {
        static {
            Covode.recordClassIndex(65766);
        }

        private C55972a() {
        }

        public /* synthetic */ C55972a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a$b */
    static final class C55973b extends AbstractC89220m implements AbstractC89171a<List<IMContact>> {

        /* renamed from: a */
        public static final C55973b f127637a = new C55973b();

        static {
            Covode.recordClassIndex(65767);
        }

        C55973b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return mo92842a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        IMContact iMContact = mo92842a().get(i);
        if (iMContact instanceof C55966a) {
            return 2;
        }
        if (iMContact instanceof C56253f) {
            return 3;
        }
        if (iMContact instanceof C74721a) {
            return 4;
        }
        return 1;
    }

    public C55971a(SharePanelViewModel sharePanelViewModel, AbstractC56264b bVar) {
        C89219l.m154721d(sharePanelViewModel, "");
        this.f127635e = sharePanelViewModel;
        this.f127636f = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IMContact iMContact;
        int i2;
        float f;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C56007e) {
            C56007e eVar = (C56007e) viewHolder;
            IMContact iMContact2 = mo92842a().get(i);
            C89219l.m154721d(iMContact2, "");
            eVar.f127709c = iMContact2;
            eVar.f127707a.setImageDrawable(C17867d.m33078a().getResources().getDrawable(eVar.f127708b));
            return;
        }
        boolean z = true;
        if (viewHolder instanceof C55980a) {
            C55980a aVar = (C55980a) viewHolder;
            IMContact iMContact3 = mo92842a().get(i);
            Objects.requireNonNull(iMContact3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMBatchGroup");
            C56253f fVar = (C56253f) iMContact3;
            C89219l.m154721d(fVar, "");
            if (fVar.getBatchContacts().isEmpty()) {
                aVar.mo92852e().setVisibility(8);
            } else if (fVar.getBatchContacts().size() == 1) {
                C34577e.m70592a(aVar.mo92848a(), fVar.getBatchContacts().get(0).getDisplayAvatar());
                aVar.mo92848a().setVisibility(0);
                aVar.mo92852e().setVisibility(0);
                aVar.mo92849b().setVisibility(8);
                aVar.mo92850c().setVisibility(8);
                aVar.mo92851d().setVisibility(8);
            } else {
                C34577e.m70592a(aVar.mo92849b(), fVar.getBatchContacts().get(0).getDisplayAvatar());
                C34577e.m70592a(aVar.mo92850c(), fVar.getBatchContacts().get(1).getDisplayAvatar());
                aVar.mo92848a().setVisibility(8);
                aVar.mo92852e().setVisibility(0);
                aVar.mo92849b().setVisibility(0);
                aVar.mo92850c().setVisibility(0);
                aVar.mo92851d().setVisibility(0);
            }
            ((TextView) aVar.f127649a.getValue()).setText(fVar.getDisplayName());
            aVar.itemView.setOnClickListener(new C55980a.View$OnClickListenerC55983c(aVar, fVar));
            C55940a.m101781a(fVar, aVar.getBindingAdapterPosition(), "column", aVar.f127650b.f127873d, true, C55940a.C55941a.f127577a);
        } else if (viewHolder instanceof C56010f) {
            C56010f fVar2 = (C56010f) viewHolder;
            IMContact iMContact4 = mo92842a().get(i);
            boolean contains = this.f127632a.contains(Integer.valueOf(i));
            boolean contains2 = this.f127633b.contains(Integer.valueOf(i));
            C89219l.m154721d(iMContact4, "");
            fVar2.f127717c = iMContact4;
            if (!(iMContact4 instanceof IMUser)) {
                iMContact = null;
            } else {
                iMContact = iMContact4;
            }
            IMUser iMUser = (IMUser) iMContact;
            if (iMUser != null) {
                i2 = iMUser.getFollowStatus();
            } else {
                i2 = -1;
            }
            boolean z2 = !IMUser.isFriend(i2);
            if (!fVar2.f127720f.f127871b || !z2) {
                z = false;
            }
            fVar2.f127718d = z;
            TextView textView = fVar2.f127715a;
            String displayName = iMContact4.getDisplayName();
            if (displayName == null) {
                displayName = C55194d.m100908a("");
            }
            textView.setText(displayName);
            fVar2.mo92864b(contains);
            fVar2.mo92863a(contains2);
            View view = fVar2.itemView;
            C89219l.m154716b(view, "");
            if (fVar2.f127718d) {
                f = 0.34f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
            C34577e.m70592a(fVar2.f127716b, iMContact4.getDisplayAvatar());
            C55940a.m101781a(iMContact4, i, "column", fVar2.f127720f.f127873d, false, C55940a.C55941a.f127577a);
            fVar2.f127719e.mo92947a(iMContact4, i);
        } else if (viewHolder instanceof C55997d) {
            C55997d dVar = (C55997d) viewHolder;
            IMContact iMContact5 = mo92842a().get(i);
            Objects.requireNonNull(iMContact5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.social.model.MAFIMUser");
            C74721a aVar2 = (C74721a) iMContact5;
            C89219l.m154721d(aVar2, "");
            dVar.f127685a = aVar2;
            User a = C74722b.m131180a(aVar2);
            AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) dVar.f127687c.getValue();
            avatarImageWithVerify.setUserData(new UserVerify(a.getAvatarThumb(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), Integer.valueOf(a.getVerificationType())));
            avatarImageWithVerify.mo61285a();
            MutualRelationView mutualRelationView = (MutualRelationView) dVar.f127690f.getValue();
            TuxTextView tuxTextView = (TuxTextView) dVar.f127689e.getValue();
            mutualRelationView.setVisibility(8);
            tuxTextView.setVisibility(8);
            if (a.getMutualStruct() != null) {
                mutualRelationView.setVisibility(0);
                tuxTextView.setVisibility(4);
                View view2 = dVar.itemView;
                C89219l.m154716b(view2, "");
                mutualRelationView.setTextColor(C0643b.m2378c(view2.getContext(), R.color.c5));
                mutualRelationView.mo125023a(a.getMutualStruct(), C51487e.m95907d());
            } else if (C80537hk.m139613a(a.getRecommendReason())) {
                tuxTextView.setVisibility(0);
                tuxTextView.setText(a.getRecommendReason());
            }
            ((TuxTextView) dVar.f127688d.getValue()).setText(a.getNickname());
            dVar.mo92860b().mo86508a(a);
            dVar.itemView.setOnClickListener(dVar.mo92858a(a));
            dVar.mo92859a().setOnClickListener(dVar.mo92858a(a));
            dVar.f127686b.mo92947a(aVar2, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
        } else if (C56204e.m102119c()) {
            if (!(viewHolder instanceof C56010f)) {
                viewHolder = null;
            }
            C56010f fVar = (C56010f) viewHolder;
            if (fVar != null) {
                Object obj = list.get(0);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                fVar.mo92863a(((Boolean) obj).booleanValue());
            }
        } else if (C56204e.m102117a()) {
            if (!(viewHolder instanceof C56010f)) {
                viewHolder = null;
            }
            C56010f fVar2 = (C56010f) viewHolder;
            if (fVar2 != null) {
                Object obj2 = list.get(0);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                fVar2.mo92864b(((Boolean) obj2).booleanValue());
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m101846a(C55971a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(2595);
        C89219l.m154721d(viewGroup, "");
        if (i == 2) {
            SharePanelViewModel sharePanelViewModel = aVar.f127635e;
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8i, viewGroup, false);
            C56244a.m102190b("LongPressShareListMoreContactViewHolder", "create(): itemView = ".concat(String.valueOf(a2)));
            C89219l.m154716b(a2, "");
            viewHolder = new C56007e(a2, sharePanelViewModel);
        } else if (i == 3) {
            SharePanelViewModel sharePanelViewModel2 = aVar.f127635e;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(sharePanelViewModel2, "");
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8g, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C55980a(a3, sharePanelViewModel2);
        } else if (i != 4) {
            SharePanelViewModel sharePanelViewModel3 = aVar.f127635e;
            AbstractC56264b bVar = aVar.f127636f;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(sharePanelViewModel3, "");
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8h, viewGroup, false);
            C89219l.m154716b(a4, "");
            viewHolder = new C56010f(a4, sharePanelViewModel3, bVar);
        } else {
            SharePanelViewModel sharePanelViewModel4 = aVar.f127635e;
            AbstractC56264b bVar2 = aVar.f127636f;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(sharePanelViewModel4, "");
            View a5 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8f, viewGroup, false);
            C89219l.m154716b(a5, "");
            viewHolder = new C55997d(a5, sharePanelViewModel4, bVar2);
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
        MethodCollector.m26664o(2595);
        return viewHolder;
    }
}
