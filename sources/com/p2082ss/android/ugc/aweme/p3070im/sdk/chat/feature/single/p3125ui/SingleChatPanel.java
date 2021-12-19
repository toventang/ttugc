package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3125ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1196b.C17156b;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53771a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.C54238a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.DmViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3125ui.p3126a.C54323a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3130ui.ChatTopTip;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53678c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.C54463a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.StrangerChatRiskHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel */
public final class SingleChatPanel extends BaseChatPanel implements AbstractC33974au {

    /* renamed from: a */
    public static final C54316a f124420a = new C54316a((byte) 0);

    /* renamed from: u */
    private C17156b f124421u;

    /* renamed from: v */
    private final C54315a f124422v;

    static {
        Covode.recordClassIndex(64013);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel$a */
    public static final class C54316a {
        static {
            Covode.recordClassIndex(64014);
        }

        private C54316a() {
        }

        public /* synthetic */ C54316a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel$c */
    static final class C54318c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f124424a;

        static {
            Covode.recordClassIndex(64016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54318c(SingleChatPanel singleChatPanel) {
            super(0);
            this.f124424a = singleChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f124424a.f124635e.finish();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    public final void onPause() {
        super.onPause();
        C53678c.m98953a(this.f124422v.getFromUser());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    /* renamed from: a */
    public final AbstractC54386c mo91153a() {
        C53709a aVar = this.f124648r;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        return new C54323a((C54315a) aVar, this.f124647q);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    public final void onResume() {
        super.onResume();
        IMUser fromUser = this.f124422v.getFromUser();
        this.f124422v.getChatExt();
        C53678c.m98953a(fromUser);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    public final void onStop() {
        super.onStop();
        C17156b bVar = this.f124421u;
        if (bVar != null && bVar.isShowing()) {
            bVar.mo27111e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    /* renamed from: b */
    public final void mo91155b() {
        super.mo91155b();
        if (C54322a.f124431a[this.f124642l.ordinal()] == 1) {
            StrangerChatRiskHint strangerChatRiskHint = (StrangerChatRiskHint) this.f124647q.findViewById(R.id.a49);
            if (strangerChatRiskHint != null) {
                strangerChatRiskHint.setVisibility(0);
            }
            mo91486c().mo91245b(8);
            C53709a aVar = this.f124648r;
            C53615d.C53621f fVar = C53615d.C53621f.f123046a;
            C89219l.m154721d(fVar, "");
            C0484a aVar2 = new C0484a();
            aVar2.put("enter_from", C55058a.m100683a(aVar));
            aVar2.put("chat_type", C53615d.m98864b(aVar));
            fVar.invoke("receive_message_request_show", aVar2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel
    public final void onCreate() {
        IMUser fromUser;
        String displayName;
        LiveData liveData;
        super.onCreate();
        DmViewModel a = DmViewModel.C54241a.m99497a(this.f124633c);
        if (!(a == null || (liveData = (LiveData) a.f124260a.getValue()) == null)) {
            liveData.observe(this.f124634d, new C54317b(this));
        }
        ((ChatTopTip) this.f124647q.findViewById(R.id.a4b)).mo91440a(this.f124422v);
        StrangerChatRiskHint strangerChatRiskHint = (StrangerChatRiskHint) this.f124647q.findViewById(R.id.a49);
        C54315a aVar = this.f124422v;
        C54463a aVar2 = new C54463a(new C54318c(this), new C54319d(this));
        String str = "";
        C89219l.m154721d(aVar, str);
        C89219l.m154721d(aVar2, str);
        strangerChatRiskHint.f124748a = aVar2;
        strangerChatRiskHint.f124749b = aVar;
        if (aVar.getSelectMsgType() != 1 && aVar.isStrangerChat() && !strangerChatRiskHint.getKeva().getBoolean(strangerChatRiskHint.getKey(), false)) {
            aVar2.f124760b.invoke(EnumC53771a.RiskHint);
            TuxTextView tuxTextView = (TuxTextView) strangerChatRiskHint.mo91527a(R.id.title_tv);
            C89219l.m154716b(tuxTextView, str);
            C17191a.C17192a aVar3 = new C17191a.C17192a();
            Context context = strangerChatRiskHint.getContext();
            C89219l.m154716b(context, str);
            Resources resources = context.getResources();
            C89219l.m154716b(resources, str);
            String[] strArr = new String[1];
            C54315a aVar4 = strangerChatRiskHint.f124749b;
            if (!(aVar4 == null || (fromUser = aVar4.getFromUser()) == null || (displayName = fromUser.getDisplayName()) == null)) {
                str = displayName;
            }
            strArr[0] = str;
            tuxTextView.setText(aVar3.mo27176a(resources, R.string.b9e, strArr).f40973a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel$d */
    static final class C54319d extends AbstractC89220m implements AbstractC89172b<EnumC53771a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f124425a;

        static {
            Covode.recordClassIndex(64017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54319d(SingleChatPanel singleChatPanel) {
            super(1);
            this.f124425a = singleChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC53771a aVar) {
            EnumC53771a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f124425a.mo91483a(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel$b */
    static final class C54317b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f124423a;

        static {
            Covode.recordClassIndex(64015);
        }

        C54317b(SingleChatPanel singleChatPanel) {
            this.f124423a = singleChatPanel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.im.core.d.ai[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                this.f124423a.mo91487d().mo91465a(C89070n.m154524c(obj), 3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleChatPanel(AbstractC1204m mVar, View view, C54315a aVar) {
        super(mVar, view, aVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f124422v = aVar;
        new C54238a(this.f124634d, ((BaseChatPanel) this).f124632b, this.f124636f, mo91487d(), aVar);
    }
}
