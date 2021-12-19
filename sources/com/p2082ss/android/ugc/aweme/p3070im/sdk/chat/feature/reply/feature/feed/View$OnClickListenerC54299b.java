package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed.View$OnClickListenerC54295a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel.ChatViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55195e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.p3188a.AbstractC55249a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3196a.C55326b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.b */
public final class View$OnClickListenerC54299b extends AbstractC54305d implements View.OnClickListener, View$OnClickListenerC54295a.AbstractC54297b, View$OnClickListenerC54295a.AbstractC54298c {

    /* renamed from: h */
    public static final C54300a f124379h = new C54300a((byte) 0);

    /* renamed from: e */
    public String f124380e;

    /* renamed from: f */
    public C19538ai f124381f;

    /* renamed from: g */
    public String f124382g;

    /* renamed from: i */
    private final AbstractC89244h f124383i = C89250i.m154773a((AbstractC89171a) new C54303d(this));

    /* renamed from: j */
    private HashMap f124384j;

    static {
        Covode.recordClassIndex(63994);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f124384j == null) {
            this.f124384j = new HashMap();
        }
        View view = (View) this.f124384j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f124384j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f124384j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final ChatViewModel mo64296c() {
        return (ChatViewModel) this.f124383i.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.b$a */
    public static final class C54300a {
        static {
            Covode.recordClassIndex(63995);
        }

        private C54300a() {
        }

        public /* synthetic */ C54300a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.b$d */
    static final class C54303d extends AbstractC89220m implements AbstractC89171a<ChatViewModel> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC54299b f124387a;

        static {
            Covode.recordClassIndex(63998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54303d(View$OnClickListenerC54299b bVar) {
            super(0);
            this.f124387a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ChatViewModel invoke() {
            return ChatViewModel.C54598a.m100094a(this.f124387a);
        }
    }

    /* renamed from: d */
    private final void m99592d() {
        TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.di9);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText("");
        m99591b("");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed.View$OnClickListenerC54295a.AbstractC54297b
    /* renamed from: a */
    public final void mo91386a() {
        if (C55196f.m100912a(this)) {
            TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.di9);
            C89219l.m154716b(tuxTextView, "");
            CharSequence text = tuxTextView.getText();
            if (text != null) {
                mo64296c().mo91669a(text, this.f124380e);
                m99592d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.b$c */
    static final class C54302c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC54299b f124386a;

        static {
            Covode.recordClassIndex(63997);
        }

        C54302c(View$OnClickListenerC54299b bVar) {
            this.f124386a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            T t;
            AbstractC55249a aVar = (AbstractC55249a) obj;
            if ((aVar instanceof AbstractC55249a.C55254d) && (t = ((AbstractC55249a.C55254d) aVar).f126348a) != null) {
                this.f124386a.f124381f = t;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed.View$OnClickListenerC54295a.AbstractC54298c
    /* renamed from: a */
    public final void mo91387a(String str) {
        if (C55196f.m100912a(this) && str != null) {
            TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.di9);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str);
            m99591b(str);
        }
    }

    /* renamed from: a */
    private void m99590a(boolean z) {
        if (C55196f.m100912a(this)) {
            TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.di9);
            C89219l.m154716b(tuxTextView, "");
            CharSequence hint = tuxTextView.getHint();
            TuxTextView tuxTextView2 = (TuxTextView) mo27715a(R.id.di9);
            C89219l.m154716b(tuxTextView2, "");
            CharSequence text = tuxTextView2.getText();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("hint", hint);
            bundle.putCharSequence("text", text);
            bundle.putBoolean("showEmojiPanel", z);
            AbstractC0952i childFragmentManager = getChildFragmentManager();
            C89219l.m154716b(childFragmentManager, "");
            View$OnClickListenerC54295a a = View$OnClickListenerC54295a.C54296a.m99587a(childFragmentManager);
            a.setArguments(bundle);
            a.mo91383a((View$OnClickListenerC54295a.AbstractC54298c) this);
            a.mo91382a((View$OnClickListenerC54295a.AbstractC54297b) this);
            if (a.isAdded()) {
                C56244a.m102185a("ReplyKeyboardDialogFragment", "Fragment is already added");
            } else {
                a.show(getChildFragmentManager(), "ReplyKeyboardDialogFragment");
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!C55196f.m100912a(this) || C58001a.m104815a(view, 500)) {
            return;
        }
        if (C89219l.m154714a(view, mo27715a(R.id.dvp))) {
            mo91386a();
        } else if (C89219l.m154714a(view, mo27715a(R.id.di9))) {
            m99590a(false);
        } else if (C89219l.m154714a(view, mo27715a(R.id.aul))) {
            m99590a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.b$b */
    static final class C54301b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC54299b f124385a;

        static {
            Covode.recordClassIndex(63996);
        }

        C54301b(View$OnClickListenerC54299b bVar) {
            this.f124385a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ActivityC0945e activity;
            ActivityC0945e activity2;
            if (obj instanceof AbstractC55249a.C55254d) {
                View$OnClickListenerC54299b bVar = this.f124385a;
                if (C55196f.m100912a(bVar) && (activity2 = bVar.getActivity()) != null) {
                    C89219l.m154716b(activity2, "");
                    new C23144b(activity2).mo37640e(R.string.h_).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
                }
            } else if (obj instanceof AbstractC55249a.C55250a) {
                int i = this.f124385a.mo64296c().f125138b;
                if (i == 1) {
                    C55195e.m100909a(this.f124385a.getActivity());
                } else if (i == 2) {
                    C55195e.m100910b(this.f124385a.getActivity());
                } else if (i == 3) {
                    View$OnClickListenerC54299b bVar2 = this.f124385a;
                    if (C55196f.m100912a(bVar2) && (activity = bVar2.getActivity()) != null) {
                        C89219l.m154716b(activity, "");
                        new C23144b(activity).mo37640e(R.string.ha).mo37636b(R.raw.icon_x_mark_small).mo37639d(R.attr.av).mo37637b();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m99591b(String str) {
        int i;
        int i2;
        boolean z;
        int length = str.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length) {
            if (!z2) {
                i2 = i3;
            } else {
                i2 = length;
            }
            if (C89219l.m154703a(str.charAt(i2), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (!z) {
                    break;
                }
                length--;
            } else if (!z) {
                z2 = true;
            } else {
                i3++;
            }
        }
        boolean z3 = !TextUtils.isEmpty(str.subSequence(i3, length + 1).toString());
        TuxIconView tuxIconView = (TuxIconView) mo27715a(R.id.dvp);
        C89219l.m154716b(tuxIconView, "");
        boolean isActivated = tuxIconView.isActivated();
        TuxIconView tuxIconView2 = (TuxIconView) mo27715a(R.id.dvp);
        C89219l.m154716b(tuxIconView2, "");
        tuxIconView2.setActivated(z3);
        TuxIconView tuxIconView3 = (TuxIconView) mo27715a(R.id.dvp);
        C89219l.m154716b(tuxIconView3, "");
        tuxIconView3.setEnabled(z3);
        TuxIconView tuxIconView4 = (TuxIconView) mo27715a(R.id.dvp);
        if (z3) {
            i = R.attr.ay;
        } else {
            i = R.attr.ad;
        }
        tuxIconView4.setTintColorRes(i);
        if (z3 && !isActivated) {
            TuxIconView tuxIconView5 = (TuxIconView) mo27715a(R.id.dvp);
            C89219l.m154716b(tuxIconView5, "");
            C55326b.m101137a(tuxIconView5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b4, code lost:
        if (r6 != null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed.View$OnClickListenerC54299b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4t, viewGroup, false);
    }
}
