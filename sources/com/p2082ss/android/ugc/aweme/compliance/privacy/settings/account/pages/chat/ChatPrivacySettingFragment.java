package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.C39903a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.GroupChatViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat.ChatPrivacySettingFragment */
public final class ChatPrivacySettingFragment extends AbstractC39716d {

    /* renamed from: a */
    public ChatViewModel f93818a;

    /* renamed from: b */
    public GroupChatViewModel f93819b;

    /* renamed from: c */
    private C39870a f93820c;

    /* renamed from: d */
    private C39903a f93821d;

    /* renamed from: e */
    private SparseArray f93822e;

    static {
        Covode.recordClassIndex(47601);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93822e == null) {
            this.f93822e = new SparseArray();
        }
        View view = (View) this.f93822e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93822e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93822e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d
    /* renamed from: c */
    public final List<AbstractC39713b> mo69099c() {
        AbstractC39856a[] aVarArr = new AbstractC39856a[2];
        C39870a aVar = this.f93820c;
        if (aVar == null) {
            C89219l.m154710a("chatAdapter");
        }
        aVarArr[0] = aVar;
        C39903a aVar2 = this.f93821d;
        if (aVar2 == null) {
            C89219l.m154710a("groupChatAdapter");
        }
        aVarArr[1] = aVar2;
        return C89070n.m154522b(aVarArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat.ChatPrivacySettingFragment$a */
    static final class C39868a extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        final /* synthetic */ ChatPrivacySettingFragment f93823a;

        static {
            Covode.recordClassIndex(47602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39868a(ChatPrivacySettingFragment chatPrivacySettingFragment) {
            super(1);
            this.f93823a = chatPrivacySettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Show direct message setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "chatsets"));
            ChatViewModel chatViewModel = this.f93823a.f93818a;
            if (chatViewModel == null) {
                C89219l.m154710a("chatViewModel");
            }
            C40043a.m80992a(cVar2, "cur_value", chatViewModel.f93798d.getValue());
            return C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat.ChatPrivacySettingFragment$b */
    static final class C39869b extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        final /* synthetic */ ChatPrivacySettingFragment f93824a;

        static {
            Covode.recordClassIndex(47603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39869b(ChatPrivacySettingFragment chatPrivacySettingFragment) {
            super(1);
            this.f93824a = chatPrivacySettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Show group chat setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "group_chat"));
            GroupChatViewModel groupChatViewModel = this.f93824a.f93819b;
            if (groupChatViewModel == null) {
                C89219l.m154710a("groupChatViewModel");
            }
            C40043a.m80992a(cVar2, "cur_value", groupChatViewModel.f93798d.getValue());
            return C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(ChatViewModel.class);
        C89219l.m154716b(a, "");
        this.f93818a = (ChatViewModel) a;
        ChatViewModel chatViewModel = this.f93818a;
        if (chatViewModel == null) {
            C89219l.m154710a("chatViewModel");
        }
        this.f93820c = new C39870a(chatViewModel, this);
        AbstractC1174ac a2 = new C1175ad(this).mo3983a(GroupChatViewModel.class);
        C89219l.m154716b(a2, "");
        this.f93819b = (GroupChatViewModel) a2;
        GroupChatViewModel groupChatViewModel = this.f93819b;
        if (groupChatViewModel == null) {
            C89219l.m154710a("groupChatViewModel");
        }
        this.f93821d = new C39903a(groupChatViewModel, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo69098b(R.string.n5);
        C39870a aVar = this.f93820c;
        if (aVar == null) {
            C89219l.m154710a("chatAdapter");
        }
        String d = aVar.mo69151d();
        if (d == null) {
            C39903a aVar2 = this.f93821d;
            if (aVar2 == null) {
                C89219l.m154710a("groupChatAdapter");
            }
            d = aVar2.mo69151d();
        }
        mo69097a(d);
        C40043a.m80998a("PRIVACY_SETTING_ALOG", new C39868a(this));
        C40043a.m80998a("PRIVACY_SETTING_ALOG", new C39869b(this));
    }
}
