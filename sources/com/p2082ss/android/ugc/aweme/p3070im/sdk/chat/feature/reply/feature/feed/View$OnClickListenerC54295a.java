package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.common.keyboard.AbstractC39142c;
import com.p2082ss.android.ugc.aweme.common.keyboard.C39141b;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.SearchableEditText;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55216l;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a */
public final class View$OnClickListenerC54295a extends AbstractC54304c implements View.OnClickListener, AbstractC39142c, DetailFeedInputView.AbstractC54294a, SearchableEditText.AbstractC54453b {

    /* renamed from: c */
    public static final C54296a f124373c = new C54296a((byte) 0);

    /* renamed from: a */
    public AbstractC54298c f124374a;

    /* renamed from: b */
    public AbstractC54297b f124375b;

    /* renamed from: d */
    private AbstractC54142b f124376d;

    /* renamed from: e */
    private boolean f124377e;

    /* renamed from: f */
    private HashMap f124378f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a$b */
    public interface AbstractC54297b {
        static {
            Covode.recordClassIndex(63992);
        }

        /* renamed from: a */
        void mo91386a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a$c */
    public interface AbstractC54298c {
        static {
            Covode.recordClassIndex(63993);
        }

        /* renamed from: a */
        void mo91387a(String str);
    }

    static {
        Covode.recordClassIndex(63990);
    }

    /* renamed from: a */
    private View m99581a(int i) {
        if (this.f124378f == null) {
            this.f124378f = new HashMap();
        }
        View view = (View) this.f124378f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f124378f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a$a */
    public static final class C54296a {
        static {
            Covode.recordClassIndex(63991);
        }

        private C54296a() {
        }

        public /* synthetic */ C54296a(byte b) {
            this();
        }

        /* renamed from: a */
        public static View$OnClickListenerC54295a m99587a(AbstractC0952i iVar) {
            C89219l.m154721d(iVar, "");
            Fragment a = iVar.mo3551a("ReplyKeyboardDialogFragment");
            if (a != null) {
                return (View$OnClickListenerC54295a) a;
            }
            return new View$OnClickListenerC54295a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.SearchableEditText.AbstractC54453b
    /* renamed from: b */
    public final void mo91384b() {
        dismiss();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView.AbstractC54294a
    /* renamed from: a */
    public final void mo91381a() {
        dismiss();
        AbstractC54297b bVar = this.f124375b;
        if (bVar != null) {
            bVar.mo91386a();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f124378f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.f124377e) {
            dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f124374a = null;
        AbstractC1196i lifecycle = getLifecycle();
        AbstractC54142b bVar = this.f124376d;
        if (bVar == null) {
            C89219l.m154710a("inputView");
        }
        lifecycle.mo4013b(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) m99581a(R.id.di4);
        C89219l.m154716b(measureLinearLayout, "");
        measureLinearLayout.getKeyBoardObservable().mo67905b(this);
        dismiss();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) m99581a(R.id.di4);
        C89219l.m154716b(measureLinearLayout, "");
        measureLinearLayout.getKeyBoardObservable().mo67903a(this);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        SearchableEditText searchableEditText = (SearchableEditText) m99581a(R.id.cmi);
        C89219l.m154716b(searchableEditText, "");
        searchableEditText.setCursorVisible(false);
        C55216l.m100963a(getActivity(), m99581a(R.id.arr));
        this.f124377e = false;
        AbstractC54298c cVar = this.f124374a;
        if (cVar != null) {
            SearchableEditText searchableEditText2 = (SearchableEditText) m99581a(R.id.cmi);
            C89219l.m154716b(searchableEditText2, "");
            cVar.mo91387a(String.valueOf(searchableEditText2.getText()));
        }
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public final void mo91382a(AbstractC54297b bVar) {
        C89219l.m154721d(bVar, "");
        this.f124375b = bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yr);
    }

    /* renamed from: a */
    public final void mo91383a(AbstractC54298c cVar) {
        C89219l.m154721d(cVar, "");
        this.f124374a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (C89219l.m154714a(view, m99581a(R.id.di4))) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
        ((MeasureLinearLayout) m99581a(R.id.di4)).mo67898a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        C89219l.m154716b(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) m99581a(R.id.di4);
        C89219l.m154716b(measureLinearLayout, "");
        measureLinearLayout.setKeyBoardObservable(new C39141b());
        SearchableEditText searchableEditText = (SearchableEditText) m99581a(R.id.cmi);
        searchableEditText.setMaxLines(1);
        searchableEditText.setEllipsize(TextUtils.TruncateAt.END);
        TuxIconView tuxIconView = (TuxIconView) m99581a(R.id.dz8);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(8);
        TuxIconView tuxIconView2 = (TuxIconView) m99581a(R.id.dvb);
        C89219l.m154716b(tuxIconView2, "");
        tuxIconView2.setVisibility(0);
        MeasureLinearLayout measureLinearLayout2 = (MeasureLinearLayout) m99581a(R.id.di4);
        C89219l.m154716b(measureLinearLayout2, "");
        DetailFeedInputView detailFeedInputView = new DetailFeedInputView(measureLinearLayout2, getArguments());
        this.f124376d = detailFeedInputView;
        Objects.requireNonNull(detailFeedInputView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView");
        C89219l.m154721d(this, "");
        detailFeedInputView.f124370j = this;
        AbstractC1196i lifecycle = getLifecycle();
        AbstractC54142b bVar = this.f124376d;
        if (bVar == null) {
            C89219l.m154710a("inputView");
        }
        lifecycle.mo4012a(bVar);
        ((MeasureLinearLayout) m99581a(R.id.di4)).setOnClickListener(this);
        ((SearchableEditText) m99581a(R.id.cmi)).setKeyImeChangeListener(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SearchableEditText searchableEditText2 = (SearchableEditText) m99581a(R.id.cmi);
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                C89219l.m154716b(searchableEditText2, "");
                searchableEditText2.setHint(charSequence.toString());
            }
            CharSequence charSequence2 = arguments.getCharSequence("text");
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                searchableEditText2.setText(charSequence2);
                searchableEditText2.setSelection(searchableEditText2.length());
            }
        }
        if (bundle != null) {
            try {
                super.dismiss();
            } catch (IllegalStateException unused) {
                super.dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void show(AbstractC0952i iVar, String str) {
        super.show(iVar, str);
        this.f124377e = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.keyboard.AbstractC39142c
    /* renamed from: a */
    public final void mo64600a(boolean z, int i) {
        if (z) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = (SoftInputResizeFuncLayoutView) m99581a(R.id.cyt);
            C89219l.m154716b(softInputResizeFuncLayoutView, "");
            softInputResizeFuncLayoutView.setVisibility(8);
            return;
        }
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = (SoftInputResizeFuncLayoutView) m99581a(R.id.cyt);
        C89219l.m154716b(softInputResizeFuncLayoutView2, "");
        softInputResizeFuncLayoutView2.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4q, viewGroup, false);
    }
}
