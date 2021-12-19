package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3135c;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.GroupChatPanel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.GroupChatTitleBarComponent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.viewmodel.C54080a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3125ui.SingleChatPanel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3125ui.SingleChatTitleBarComponent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54431c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55171ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a */
public final class C54434a extends AbstractC54437b {

    /* renamed from: e */
    public BaseChatPanel f124685e;

    /* renamed from: f */
    private View f124686f;

    /* renamed from: g */
    private AbstractC54431c f124687g;

    /* renamed from: h */
    private HashMap f124688h;

    static {
        Covode.recordClassIndex(64139);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f124688h == null) {
            this.f124688h = new HashMap();
        }
        View view = (View) this.f124688h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f124688h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f124688h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final void mo64296c() {
        BaseChatPanel baseChatPanel = this.f124685e;
        if (baseChatPanel != null) {
            baseChatPanel.mo91490g();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BaseChatPanel baseChatPanel = this.f124685e;
        if (baseChatPanel != null) {
            getLifecycle().mo4013b(baseChatPanel);
        }
        AbstractC54431c cVar = this.f124687g;
        if (cVar != null) {
            getLifecycle().mo4013b(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a$a */
    static final class C54435a extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C54435a f124689a = new C54435a();

        static {
            Covode.recordClassIndex(64140);
        }

        C54435a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C544361.f124690a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C54435a.f124689a);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        AbstractC1174ac a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C55171ac.m100879a("enterChatRoom");
        Bundle arguments = getArguments();
        C53709a aVar = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_session_info");
        } else {
            serializable = null;
        }
        if (serializable instanceof C53709a) {
            aVar = serializable;
        }
        C53709a aVar2 = aVar;
        if (aVar2 == null) {
            requireActivity().finish();
        } else {
            View view2 = this.f124686f;
            if (view2 == null) {
                C89219l.m154710a("rootView");
            }
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) view2.findViewById(R.id.a4a);
            if (aVar2.getChatType() != 3) {
                C54315a aVar3 = (C54315a) aVar2;
                View view3 = this.f124686f;
                if (view3 == null) {
                    C89219l.m154710a("rootView");
                }
                this.f124685e = new SingleChatPanel(this, view3, aVar3);
                C89219l.m154716b(imTextTitleBar, "");
                this.f124687g = new SingleChatTitleBarComponent(aVar3, this, imTextTitleBar);
            } else {
                C54004b bVar = (C54004b) aVar2;
                ActivityC0945e requireActivity = requireActivity();
                C89219l.m154716b(requireActivity, "");
                C89219l.m154721d(requireActivity, "");
                C89219l.m154721d(bVar, "");
                C1175ad a2 = C1181ae.m3881a(requireActivity, new C54080a(bVar));
                String str = "GroupChatViewModel-" + bVar.getConversationId();
                if (GroupChatViewModel.class.equals(ScopeViewModel.class)) {
                    a = a2.mo3984a(str, GroupChatViewModel.class);
                } else {
                    a = a2.mo3984a(str, GroupChatViewModel.class);
                    C1171ab.m3870a(a, a2);
                }
                C89219l.m154716b(a, "");
                GroupChatViewModel groupChatViewModel = (GroupChatViewModel) a;
                View view4 = this.f124686f;
                if (view4 == null) {
                    C89219l.m154710a("rootView");
                }
                this.f124685e = new GroupChatPanel(this, view4, bVar, groupChatViewModel);
                C89219l.m154716b(imTextTitleBar, "");
                this.f124687g = new GroupChatTitleBarComponent(groupChatViewModel, this, imTextTitleBar);
            }
            BaseChatPanel baseChatPanel = this.f124685e;
            if (baseChatPanel != null) {
                getLifecycle().mo4012a(baseChatPanel);
            }
            AbstractC54431c cVar = this.f124687g;
            if (cVar != null) {
                getLifecycle().mo4012a(cVar);
            }
        }
        C55171ac.m100880b("enterChatRoom");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BaseChatPanel baseChatPanel = this.f124685e;
        if (baseChatPanel != null) {
            baseChatPanel.mo91154a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a4m, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f124686f = a;
        if (a == null) {
            C89219l.m154710a("rootView");
        }
        return a;
    }
}
