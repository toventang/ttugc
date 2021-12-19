package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39112b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStoryContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.SearchableEditText;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3262l.AbstractC56243a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a */
public final class C54341a extends C39112b {

    /* renamed from: b */
    public static final C54342a f124476b = new C54342a((byte) 0);

    /* renamed from: a */
    public AbstractC56243a f124477a;

    /* renamed from: c */
    private View f124478c;

    /* renamed from: d */
    private Aweme f124479d;

    /* renamed from: e */
    private HashMap f124480e;

    static {
        Covode.recordClassIndex(64041);
    }

    /* renamed from: a */
    public final View mo91424a(int i) {
        if (this.f124480e == null) {
            this.f124480e = new HashMap();
        }
        View view = (View) this.f124480e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f124480e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a$a */
    public static final class C54342a {
        static {
            Covode.recordClassIndex(64042);
        }

        private C54342a() {
        }

        public /* synthetic */ C54342a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f124480e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        String str;
        Editable text;
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        AbstractC56243a aVar = this.f124477a;
        if (aVar != null) {
            SearchableEditText searchableEditText = (SearchableEditText) mo91424a(R.id.cmi);
            if (searchableEditText == null || (text = searchableEditText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            aVar.mo70416a(str);
        }
        if (mo91424a(R.id.cmi) != null && Build.VERSION.SDK_INT < 23) {
            SearchableEditText searchableEditText2 = (SearchableEditText) mo91424a(R.id.cmi);
            C89219l.m154716b(searchableEditText2, "");
            searchableEditText2.setCursorVisible(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a$c */
    static final class C54344c implements AbstractC54142b.AbstractC54144b {

        /* renamed from: a */
        final /* synthetic */ C54341a f124482a;

        static {
            Covode.recordClassIndex(64044);
        }

        C54344c(C54341a aVar) {
            this.f124482a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b.AbstractC54144b
        /* renamed from: a */
        public final void mo91257a(int i) {
            if (8 == i) {
                this.f124482a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a$d */
    static final class DialogInterface$OnShowListenerC54345d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C54341a f124483a;

        static {
            Covode.recordClassIndex(64045);
        }

        DialogInterface$OnShowListenerC54345d(C54341a aVar) {
            this.f124483a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            AbstractC56243a aVar = this.f124483a.f124477a;
            if (aVar != null) {
                aVar.mo70415a();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yn);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a$b */
    static final class View$OnClickListenerC54343b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54341a f124481a;

        static {
            Covode.recordClassIndex(64043);
        }

        View$OnClickListenerC54343b(C54341a aVar) {
            this.f124481a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(this.f124481a.mo91424a(R.id.cy3));
            this.f124481a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(21);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String str;
        User user;
        long j;
        String str2;
        ShareStoryContent shareStoryContent;
        SearchableEditText searchableEditText;
        String uid;
        Window window;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface$OnShowListenerC54345d(this));
        }
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("bindAweme");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof Aweme)) {
            serializable = null;
        }
        this.f124479d = (Aweme) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("enter_from");
        } else {
            str = null;
        }
        C55059b.m100694b("enter_from", str);
        C55059b.m100694b("enter_method", "story");
        mo91424a(R.id.cy3).setOnClickListener(new View$OnClickListenerC54343b(this));
        Aweme aweme = this.f124479d;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        IMUser fromUser = IMUser.fromUser(user);
        if (user == null || (uid = user.getUid()) == null) {
            j = 0;
        } else {
            j = Long.parseLong(uid);
        }
        String a = AbstractC17427b.C17428a.m32309a(j);
        C54315a aVar = new C54315a();
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        aVar.setShareUserId(str2);
        aVar.setFromUser(fromUser);
        boolean z = true;
        if (a.length() == 0 && user != null) {
            String uid2 = user.getUid();
            C89219l.m154716b(uid2, "");
            a = AbstractC17427b.C17428a.m32309a(Long.parseLong(uid2));
        }
        aVar.setConversationId(a);
        aVar.setEnterFrom(0);
        aVar.setChatType(0);
        aVar.setUnreadCount(0);
        Aweme aweme2 = this.f124479d;
        if (aweme2 != null) {
            shareStoryContent = ShareStoryContent.Companion.fromAweme(aweme2);
        } else {
            shareStoryContent = null;
        }
        View view2 = this.f124478c;
        if (view2 == null) {
            C89219l.m154710a("mRootView");
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view2;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        StoryInputView storyInputView = new StoryInputView(viewGroup, aVar, shareStoryContent);
        storyInputView.mo91207a(new C54344c(this));
        getLifecycle().mo4012a(storyInputView);
        Bundle arguments3 = getArguments();
        if (!(arguments3 == null || (str3 = arguments3.getString("bindInputText")) == null || str3.length() == 0)) {
            z = false;
        }
        if (!z && (searchableEditText = (SearchableEditText) mo91424a(R.id.cmi)) != null) {
            searchableEditText.setText(str3);
        }
        if (bundle != null) {
            dismiss();
        }
        SearchableEditText searchableEditText2 = (SearchableEditText) mo91424a(R.id.cmi);
        if (searchableEditText2 != null) {
            searchableEditText2.requestFocus();
        }
        KeyboardUtils.m70896b(mo91424a(R.id.cmi));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a4e, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f124478c = a;
        if (a == null) {
            C89219l.m154710a("mRootView");
        }
        return a;
    }
}
