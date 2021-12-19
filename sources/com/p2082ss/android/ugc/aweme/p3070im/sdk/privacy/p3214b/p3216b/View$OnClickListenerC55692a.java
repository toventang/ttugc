package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3216b;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p035f.C0674b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39257p;
import com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.p2082ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.p2082ss.android.ugc.aweme.p2307ai.C33469b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3215a.C55689a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.viewmodel.MessagingPrivacyViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a */
public final class View$OnClickListenerC55692a extends Fragment implements View.OnClickListener {

    /* renamed from: f */
    public static final C55693a f127041f = new C55693a((byte) 0);

    /* renamed from: a */
    public AbstractC55694b f127042a;

    /* renamed from: b */
    public RecyclerView f127043b;

    /* renamed from: c */
    public TuxButton f127044c;

    /* renamed from: d */
    TuxTextView f127045d;

    /* renamed from: e */
    TuxTextView f127046e;

    /* renamed from: g */
    private TuxButton f127047g;

    /* renamed from: h */
    private final AbstractC89244h f127048h = C89250i.m154773a((AbstractC89171a) new C55698f(this));

    /* renamed from: i */
    private HashMap f127049i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a$b */
    public interface AbstractC55694b {
        static {
            Covode.recordClassIndex(65477);
        }

        void onCancel();

        void onSetPrivacyValue(int i);
    }

    static {
        Covode.recordClassIndex(65475);
    }

    /* renamed from: a */
    private final MessagingPrivacyViewModel m101444a() {
        return (MessagingPrivacyViewModel) this.f127048h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a$a */
    public static final class C55693a {
        static {
            Covode.recordClassIndex(65476);
        }

        private C55693a() {
        }

        public /* synthetic */ C55693a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f127049i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a$f */
    static final class C55698f extends AbstractC89220m implements AbstractC89171a<MessagingPrivacyViewModel> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC55692a f127053a;

        static {
            Covode.recordClassIndex(65481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55698f(View$OnClickListenerC55692a aVar) {
            super(0);
            this.f127053a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MessagingPrivacyViewModel invoke() {
            View$OnClickListenerC55692a aVar = this.f127053a;
            C89219l.m154721d(aVar, "");
            AbstractC1174ac a = C1181ae.m3879a(aVar, (C1175ad.AbstractC1177b) null).mo3983a(MessagingPrivacyViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a$d */
    static final class C55696d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC55692a f127051a;

        static {
            Covode.recordClassIndex(65479);
        }

        C55696d(View$OnClickListenerC55692a aVar) {
            this.f127051a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C39257p pVar = (C39257p) obj;
            AbstractC55694b bVar = this.f127051a.f127042a;
            if (bVar != null) {
                bVar.onSetPrivacyValue(pVar.getValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a$c */
    static final class C55695c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC55692a f127050a;

        static {
            Covode.recordClassIndex(65478);
        }

        C55695c(View$OnClickListenerC55692a aVar) {
            this.f127050a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            TuxButton tuxButton = this.f127050a.f127044c;
            if (tuxButton == null) {
                C89219l.m154710a("okButton");
            }
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            RecyclerView recyclerView = this.f127050a.f127043b;
            if (recyclerView == null) {
                C89219l.m154710a("recyclerView");
            }
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.privacy.ui.adapter.MessagingPrivacyAdapter");
            C55689a aVar = (C55689a) adapter;
            int i = aVar.f127036a;
            aVar.f127036a = C89070n.m154546a((List) aVar.f127038c, obj);
            if (i != -1 && i != aVar.f127036a) {
                aVar.notifyItemChanged(i, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a$e */
    static final class C55697e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC55692a f127052a;

        static {
            Covode.recordClassIndex(65480);
        }

        C55697e(View$OnClickListenerC55692a aVar) {
            this.f127052a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                View$OnClickListenerC55692a aVar = this.f127052a;
                if (booleanValue) {
                    TuxTextView tuxTextView = aVar.f127045d;
                    if (tuxTextView == null) {
                        C89219l.m154710a("headerText");
                    }
                    tuxTextView.setText(aVar.getResources().getString(R.string.b97));
                    TuxTextView tuxTextView2 = aVar.f127046e;
                    if (tuxTextView2 == null) {
                        C89219l.m154710a("descText");
                    }
                    tuxTextView2.setText(aVar.getResources().getString(R.string.b96));
                    return;
                }
                TuxTextView tuxTextView3 = aVar.f127045d;
                if (tuxTextView3 == null) {
                    C89219l.m154710a("headerText");
                }
                tuxTextView3.setText(aVar.getResources().getString(R.string.b9h));
                TuxTextView tuxTextView4 = aVar.f127046e;
                if (tuxTextView4 == null) {
                    C89219l.m154710a("descText");
                }
                tuxTextView4.setText(C0674b.m2427a(aVar.getResources().getString(R.string.b9g), 0));
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        TuxButton tuxButton = this.f127044c;
        if (tuxButton == null) {
            C89219l.m154710a("okButton");
        }
        if (C89219l.m154714a(view, tuxButton)) {
            MessagingPrivacyViewModel a = m101444a();
            C39257p value = a.f127070d.getValue();
            if (value != null) {
                a.f127073g.mo142945a(a.f127074h.setChatAuthority(value.getValue()).mo142918b(a.f127077k).mo142909a(a.f127076j).mo142922b(new MessagingPrivacyViewModel.C55707b(value, a)));
                return;
            }
            return;
        }
        TuxButton tuxButton2 = this.f127047g;
        if (tuxButton2 == null) {
            C89219l.m154710a("cancelButton");
        }
        if (C89219l.m154714a(view, tuxButton2)) {
            m101444a().mo92593a(false);
            AbstractC55694b bVar = this.f127042a;
            if (bVar != null) {
                bVar.onCancel();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<C39257p> list;
        String str;
        int i;
        int i2;
        String str2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("chat_set_extra");
        }
        IPrivacyService d = PrivacyServiceImpl.m80573d();
        C89219l.m154716b(d, "");
        boolean z = false;
        C39256o a = d.mo68677a(0, "chatsets");
        View findViewById = view.findViewById(R.id.b8e);
        C89219l.m154716b(findViewById, "");
        this.f127045d = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.b8c);
        C89219l.m154716b(findViewById2, "");
        this.f127046e = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.yh);
        C89219l.m154716b(findViewById3, "");
        this.f127044c = (TuxButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.yg);
        C89219l.m154716b(findViewById4, "");
        this.f127047g = (TuxButton) findViewById4;
        View findViewById5 = view.findViewById(R.id.cx7);
        C89219l.m154716b(findViewById5, "");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.f127043b = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        MessagingPrivacyViewModel a2 = m101444a();
        if (a == null || (list = a.getValues()) == null) {
            list = C89086z.INSTANCE;
        }
        recyclerView.setAdapter(new C55689a(a2, list));
        Drawable c = C3966y.m9665c(R.drawable.arl);
        if (c == null) {
            C89219l.m154715b();
        }
        C33469b bVar = new C33469b(c);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.l5);
        bVar.f79529a = dimensionPixelSize;
        bVar.f79530b = dimensionPixelSize;
        recyclerView.mo4402a(bVar);
        MessagingPrivacyViewModel a3 = m101444a();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("enter_from_extra")) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i = arguments3.getInt("user_type_extra");
        } else {
            i = 0;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            i2 = arguments4.getInt("open_count_extra");
        } else {
            i2 = 0;
        }
        C89219l.m154721d(str, "");
        a3.f127069c = str;
        if (i == 1) {
            str2 = "existing";
        } else if (i != 2) {
            str2 = "non_teenager";
        } else {
            str2 = "new";
        }
        a3.f127068b = str2;
        a3.f127067a = i2;
        C1213t<Boolean> tVar = a3.f127072f;
        if (i == 1) {
            z = true;
        }
        tVar.setValue(Boolean.valueOf(z));
        a3.f127070d.observe(this, new C55695c(this));
        a3.f127071e.observe(this, new C55696d(this));
        a3.f127072f.observe(this, new C55697e(this));
        String str3 = a3.f127069c;
        String str4 = a3.f127068b;
        int i3 = a3.f127067a;
        C0484a aVar = new C0484a();
        aVar.put("enter_from", str3);
        aVar.put("user_type", str4);
        aVar.put("times", String.valueOf(i3));
        C39162r.m79460a("show_dm_permission_pop_up", aVar);
        TuxButton tuxButton = this.f127044c;
        if (tuxButton == null) {
            C89219l.m154710a("okButton");
        }
        tuxButton.setOnClickListener(this);
        TuxButton tuxButton2 = this.f127047g;
        if (tuxButton2 == null) {
            C89219l.m154710a("cancelButton");
        }
        tuxButton2.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4s, viewGroup, false);
    }
}
