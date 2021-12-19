package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.content.p032a.C0637f;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46460b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46595g;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.EmojiContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStoryContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54141a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54145c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractView$OnClickListenerC54146d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.InputViewDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54157a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54111b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53651a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.SearchableEditText;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3176g.C55126a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55172ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3196a.C55326b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView */
public final class StoryInputView implements AbstractC54141a, AbstractC54142b, AbstractC54232b.AbstractC54233a {

    /* renamed from: g */
    public static final String f124434g = StoryInputView.class.getSimpleName();

    /* renamed from: h */
    public static final C54324a f124435h = new C54324a((byte) 0);

    /* renamed from: a */
    public SearchableEditText f124436a;

    /* renamed from: b */
    public TuxIconView f124437b;

    /* renamed from: c */
    public TuxIconView f124438c;

    /* renamed from: d */
    public View f124439d;

    /* renamed from: e */
    public final C54101a f124440e;

    /* renamed from: f */
    public final ViewGroup f124441f;

    /* renamed from: i */
    private final ViewGroup f124442i;

    /* renamed from: j */
    private final AbstractC89244h f124443j = C89250i.m154773a((AbstractC89171a) new C54329f(this));

    /* renamed from: k */
    private final AbstractC89244h f124444k = C89250i.m154773a((AbstractC89171a) new C54325b(this));

    /* renamed from: l */
    private final AbstractC89244h f124445l = C89250i.m154773a((AbstractC89171a) new C54338l(this));

    /* renamed from: m */
    private final AbstractC89244h f124446m = C89250i.m154773a((AbstractC89171a) new C54326c(this));

    /* renamed from: n */
    private C54111b f124447n;

    /* renamed from: o */
    private SoftInputResizeFuncLayoutView f124448o;

    /* renamed from: p */
    private AbstractC54142b.AbstractC54144b f124449p;

    /* renamed from: q */
    private final AbstractC89244h f124450q = C89250i.m154773a((AbstractC89171a) new C54330g(this));

    /* renamed from: r */
    private final AbstractC89244h f124451r = C89250i.m154773a((AbstractC89171a) new C54333h(this));

    /* renamed from: s */
    private final AbstractC89244h f124452s = C89250i.m154773a((AbstractC89171a) new C54339m(this));

    /* renamed from: t */
    private int f124453t = 4;

    /* renamed from: u */
    private int f124454u = -1;

    /* renamed from: v */
    private boolean f124455v = true;

    /* renamed from: w */
    private boolean f124456w = true;

    /* renamed from: x */
    private boolean f124457x;

    /* renamed from: y */
    private final C53709a f124458y;

    /* renamed from: z */
    private final ShareStoryContent f124459z;

    /* renamed from: f */
    private final int m99626f() {
        return ((Number) this.f124444k.getValue()).intValue();
    }

    /* renamed from: g */
    private final int m99627g() {
        return ((Number) this.f124445l.getValue()).intValue();
    }

    /* renamed from: h */
    private final int m99628h() {
        return ((Number) this.f124446m.getValue()).intValue();
    }

    /* renamed from: i */
    private final View.OnClickListener m99629i() {
        return (View.OnClickListener) this.f124450q.getValue();
    }

    /* renamed from: j */
    private final TextWatcher m99630j() {
        return (TextWatcher) this.f124452s.getValue();
    }

    /* renamed from: a */
    public final AbstractC54142b mo91412a() {
        return (AbstractC54142b) this.f124443j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54141a
    /* renamed from: a */
    public final void mo91242a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91208a(AbstractView$OnClickListenerC54146d dVar) {
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91210a(AbstractC54232b.AbstractC54233a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    public final void onPause() {
        AbstractC54145c.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    public final void onResume() {
        AbstractC54145c.onResume(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$a */
    public static final class C54324a {
        static {
            Covode.recordClassIndex(64024);
        }

        private C54324a() {
        }

        public /* synthetic */ C54324a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo91415a(boolean z) {
        TuxIconView tuxIconView = this.f124438c;
        if (tuxIconView == null) {
            C89219l.m154710a("sendBtn");
        }
        boolean isActivated = tuxIconView.isActivated();
        TuxIconView tuxIconView2 = this.f124438c;
        if (tuxIconView2 == null) {
            C89219l.m154710a("sendBtn");
        }
        tuxIconView2.setActivated(z);
        TuxIconView tuxIconView3 = this.f124438c;
        if (tuxIconView3 == null) {
            C89219l.m154710a("sendBtn");
        }
        tuxIconView3.setTintColorRes(z ? R.attr.ay : R.attr.bd);
        if (z && !isActivated) {
            TuxIconView tuxIconView4 = this.f124438c;
            if (tuxIconView4 == null) {
                C89219l.m154710a("sendBtn");
            }
            C55326b.m101137a(tuxIconView4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91414a(List<? extends C46534a> list) {
        C54111b bVar = this.f124447n;
        if (bVar == null) {
            C89219l.m154710a("emojiSearchView");
        }
        bVar.mo91196a(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$g */
    static final class C54330g extends AbstractC89220m implements AbstractC89171a<View.OnClickListener> {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124465a;

        static {
            Covode.recordClassIndex(64030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54330g(StoryInputView storyInputView) {
            super(0);
            this.f124465a = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View.OnClickListener invoke() {
            return new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.StoryInputView.C54330g.View$OnClickListenerC543311 */

                /* renamed from: a */
                final /* synthetic */ C54330g f124466a;

                static {
                    Covode.recordClassIndex(64031);
                }

                {
                    this.f124466a = r1;
                }

                public final void onClick(View view) {
                    ActivityC0945e eVar;
                    Activity activity;
                    ClickAgent.onClick(view);
                    C89219l.m154721d(view, "");
                    if (!C55232u.m101003a(view, 500)) {
                        if (C89219l.m154714a(view, StoryInputView.m99623a(this.f124466a.f124465a))) {
                            String str = StoryInputView.f124434g;
                            C89219l.m154716b(str, "");
                            C56244a.m102190b(str, "on edit text click");
                            this.f124466a.f124465a.mo91419e();
                            this.f124466a.f124465a.mo91413a(-2);
                            return;
                        }
                        TuxIconView tuxIconView = this.f124466a.f124465a.f124438c;
                        if (tuxIconView == null) {
                            C89219l.m154710a("sendBtn");
                        }
                        if (C89219l.m154714a(view, tuxIconView)) {
                            String str2 = StoryInputView.f124434g;
                            C89219l.m154716b(str2, "");
                            C56244a.m102190b(str2, "on send button click");
                            this.f124466a.f124465a.mo91412a().mo91249q();
                        } else if (C89219l.m154714a(view, StoryInputView.m99624b(this.f124466a.f124465a))) {
                            String str3 = StoryInputView.f124434g;
                            C89219l.m154716b(str3, "");
                            C56244a.m102190b(str3, "on emoji button click");
                            StoryInputView.m99624b(this.f124466a.f124465a).setSelected(!StoryInputView.m99624b(this.f124466a.f124465a).isSelected());
                            if (StoryInputView.m99624b(this.f124466a.f124465a).isSelected()) {
                                StoryInputView.m99624b(this.f124466a.f124465a).setIconRes(R.raw.icon_3pt_keyboard);
                                StoryInputView.m99624b(this.f124466a.f124465a).setTintColor(R.attr.bc);
                                this.f124466a.f124465a.mo91413a(1);
                                return;
                            }
                            this.f124466a.f124465a.mo91419e();
                            this.f124466a.f124465a.mo91413a(-2);
                        } else if (C89219l.m154714a(view, this.f124466a.f124465a.f124440e.mo91182e())) {
                            String str4 = StoryInputView.f124434g;
                            C89219l.m154716b(str4, "");
                            C56244a.m102190b(str4, "on gif emoji click");
                            boolean c = this.f124466a.f124465a.mo91417c();
                            if (c) {
                                new C23144b(view).mo37640e(R.string.b93).mo37637b();
                            } else if (!c) {
                                Context b = this.f124466a.f124465a.mo91416b();
                                while (true) {
                                    eVar = null;
                                    if (b != null) {
                                        if (!(b instanceof Activity)) {
                                            if (!(b instanceof ContextWrapper)) {
                                                break;
                                            }
                                            b = ((ContextWrapper) b).getBaseContext();
                                        } else {
                                            activity = (Activity) b;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                activity = null;
                                if (activity instanceof ActivityC0945e) {
                                    eVar = activity;
                                }
                                ActivityC0945e eVar2 = eVar;
                                if (eVar2 != null) {
                                    C54157a.C54160c.m99418a(eVar2, new AbstractC89187q<View, C46447a, Integer, C89391z>(this) {
                                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.StoryInputView.C54330g.View$OnClickListenerC543311.C543321 */

                                        /* renamed from: a */
                                        final /* synthetic */ View$OnClickListenerC543311 f124467a;

                                        static {
                                            Covode.recordClassIndex(64032);
                                        }

                                        {
                                            this.f124467a = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89187q
                                        public final /* synthetic */ C89391z invoke(View view, C46447a aVar, Integer num) {
                                            C46447a aVar2 = aVar;
                                            num.intValue();
                                            C89219l.m154721d(view, "");
                                            C89219l.m154721d(aVar2, "");
                                            C46534a aVar3 = aVar2.f108224d;
                                            C89219l.m154716b(aVar3, "");
                                            C46460b.m89694a(aVar3);
                                            this.f124467a.f124466a.f124465a.mo91412a().mo91243a(aVar2);
                                            return C89391z.f203057a;
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$h */
    static final class C54333h extends AbstractC89220m implements AbstractC89171a<View.OnKeyListener> {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124468a;

        static {
            Covode.recordClassIndex(64033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54333h(StoryInputView storyInputView) {
            super(0);
            this.f124468a = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View.OnKeyListener invoke() {
            return new View.OnKeyListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.StoryInputView.C54333h.View$OnKeyListenerC543341 */

                /* renamed from: a */
                final /* synthetic */ C54333h f124469a;

                static {
                    Covode.recordClassIndex(64034);
                }

                {
                    this.f124469a = r1;
                }

                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (!C89219l.m154714a(view, StoryInputView.m99623a(this.f124469a.f124468a)) || i != 4) {
                        return false;
                    }
                    C89219l.m154716b(keyEvent, "");
                    if (keyEvent.getAction() == 0) {
                        return this.f124469a.f124468a.mo91250r();
                    }
                    return false;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$m */
    static final class C54339m extends AbstractC89220m implements AbstractC89171a<C543401> {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124474a;

        static {
            Covode.recordClassIndex(64039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54339m(StoryInputView storyInputView) {
            super(0);
            this.f124474a = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C543401 invoke() {
            return new C34699o(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.StoryInputView.C54339m.C543401 */

                /* renamed from: a */
                final /* synthetic */ C54339m f124475a;

                static {
                    Covode.recordClassIndex(64040);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f124475a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
                public final void afterTextChanged(Editable editable) {
                    int i;
                    boolean z;
                    C89219l.m154721d(editable, "");
                    String obj = editable.toString();
                    int length = obj.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        if (!z2) {
                            i = i2;
                        } else {
                            i = length;
                        }
                        if (C89219l.m154703a(obj.charAt(i), 32) <= 0) {
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
                            i2++;
                        }
                    }
                    if (TextUtils.isEmpty(obj.subSequence(i2, length + 1).toString())) {
                        this.f124475a.f124474a.f124440e.mo91179a(false);
                        this.f124475a.f124474a.mo91415a(false);
                    } else {
                        this.f124475a.f124474a.f124440e.mo91179a(true);
                        this.f124475a.f124474a.mo91415a(true);
                    }
                    this.f124475a.f124474a.mo91418d();
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    C89219l.m154721d(charSequence, "");
                    Object tag = StoryInputView.m99623a(this.f124475a.f124474a).getTag(R.id.v);
                    if (!(tag instanceof CharSequence)) {
                        tag = null;
                    }
                    CharSequence charSequence2 = (CharSequence) tag;
                    if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
                        StoryInputView storyInputView = this.f124475a.f124474a;
                        if (C46616a.m89982b()) {
                            return;
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            storyInputView.mo91414a((List<? extends C46534a>) null);
                        } else {
                            storyInputView.mo91414a(C46616a.m89976a(charSequence.toString()));
                        }
                    } else {
                        StoryInputView.m99623a(this.f124475a.f124474a).setTag(R.id.v, null);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$f */
    static final class C54329f extends AbstractC89220m implements AbstractC89171a<InputViewDelegate> {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124464a;

        static {
            Covode.recordClassIndex(64029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54329f(StoryInputView storyInputView) {
            super(0);
            this.f124464a = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InputViewDelegate invoke() {
            StoryInputView storyInputView = this.f124464a;
            storyInputView.mo91416b();
            return new InputViewDelegate(storyInputView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: m */
    public final void mo91227m() {
        SearchableEditText searchableEditText = this.f124436a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        searchableEditText.setText("");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: n */
    public final void mo91228n() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124448o;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        softInputResizeFuncLayoutView.mo91312a(-1);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$b */
    static final class C54325b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124460a;

        static {
            Covode.recordClassIndex(64025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54325b(StoryInputView storyInputView) {
            super(0);
            this.f124460a = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0637f.m2349b(this.f124460a.mo91416b().getResources(), R.color.c5, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$c */
    static final class C54326c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124461a;

        static {
            Covode.recordClassIndex(64026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54326c(StoryInputView storyInputView) {
            super(0);
            this.f124461a = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0637f.m2349b(this.f124461a.mo91416b().getResources(), R.color.c5, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$e */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC54328e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124463a;

        static {
            Covode.recordClassIndex(64028);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC54328e(StoryInputView storyInputView) {
            this.f124463a = storyInputView;
        }

        public final void onGlobalLayout() {
            View view = this.f124463a.f124439d;
            if (view == null) {
                C89219l.m154710a("editLayout");
            }
            if (view.getVisibility() != 0) {
                this.f124463a.mo91228n();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$l */
    static final class C54338l extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124473a;

        static {
            Covode.recordClassIndex(64038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54338l(StoryInputView storyInputView) {
            super(0);
            this.f124473a = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0637f.m2349b(this.f124473a.mo91416b().getResources(), R.color.bx, null));
        }
    }

    static {
        Covode.recordClassIndex(64023);
    }

    /* renamed from: k */
    private void m99631k() {
        SearchableEditText searchableEditText = this.f124436a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        searchableEditText.setVisibility(0);
        this.f124453t = 4;
    }

    /* renamed from: b */
    public final Context mo91416b() {
        Context context = this.f124442i.getContext();
        C89219l.m154716b(context, "");
        return context;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    public final void onDestroy() {
        String str = f124434g;
        C89219l.m154716b(str, "");
        C56244a.m102190b(str, "onDestroy");
        this.f124440e.mo91184g();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: r */
    public final boolean mo91250r() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124448o;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        if (softInputResizeFuncLayoutView.mo91326a()) {
            mo91228n();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo91418d() {
        if (!this.f124456w) {
            SearchableEditText searchableEditText = this.f124436a;
            if (searchableEditText == null) {
                C89219l.m154710a("editText");
            }
            searchableEditText.setVisibility(8);
        }
        if (!this.f124455v) {
            TuxIconView tuxIconView = this.f124437b;
            if (tuxIconView == null) {
                C89219l.m154710a("emojiBtn");
            }
            tuxIconView.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo91419e() {
        TuxIconView tuxIconView = this.f124437b;
        if (tuxIconView == null) {
            C89219l.m154710a("emojiBtn");
        }
        tuxIconView.setIconRes(R.raw.icon_3pt_dm_emoji);
        TuxIconView tuxIconView2 = this.f124437b;
        if (tuxIconView2 == null) {
            C89219l.m154710a("emojiBtn");
        }
        tuxIconView2.setTintColor(R.attr.bc);
        TuxIconView tuxIconView3 = this.f124437b;
        if (tuxIconView3 == null) {
            C89219l.m154710a("emojiBtn");
        }
        tuxIconView3.setSelected(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: l */
    public final void mo91226l() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        SearchableEditText searchableEditText = this.f124436a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        if (!searchableEditText.mo91538a()) {
            SearchableEditText searchableEditText2 = this.f124436a;
            if (searchableEditText2 == null) {
                C89219l.m154710a("editText");
            }
            searchableEditText2.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: c */
    public final boolean mo91417c() {
        if ((this.f124458y.isAuthorSupporterChat() && C53651a.m98928b()) || this.f124458y.isGroupChat()) {
            return false;
        }
        IMUser a = C55085g.m100751a(String.valueOf(AbstractC17427b.C17428a.m32311c(this.f124458y.getConversationId())), C55080c.m100730a(this.f124458y.getConversationId()));
        if (a == null) {
            return true;
        }
        if (a.getFollowStatus() == 2 || C55197c.m100918a(a)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: q */
    public final void mo91249q() {
        String str;
        String str2;
        String str3;
        ShareStoryContent shareStoryContent;
        int i;
        boolean z;
        int i2;
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        SearchableEditText searchableEditText = this.f124436a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        Editable text = searchableEditText.getText();
        if (text != null) {
            C89219l.m154716b(text, "");
            String obj = text.toString();
            int length = obj.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (C89219l.m154703a(obj.charAt(i2), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z3 = true;
                } else {
                    i3++;
                }
            }
            if (TextUtils.isEmpty(obj.subSequence(i3, length + 1).toString())) {
                SearchableEditText searchableEditText2 = this.f124436a;
                if (searchableEditText2 == null) {
                    C89219l.m154710a("editText");
                }
                new C23144b(searchableEditText2).mo37640e(R.string.cf9).mo37637b();
            } else if (text.length() > 6000) {
                SearchableEditText searchableEditText3 = this.f124436a;
                if (searchableEditText3 == null) {
                    C89219l.m154710a("editText");
                }
                new C23144b(searchableEditText3).mo37635a(C17867d.m33078a().getResources().getString(R.string.cey)).mo37637b();
            } else {
                TextContent.Companion companion = TextContent.Companion;
                String obj2 = text.toString();
                int length2 = obj2.length() - 1;
                int i4 = 0;
                boolean z4 = false;
                while (i4 <= length2) {
                    if (!z4) {
                        i = i4;
                    } else {
                        i = length2;
                    }
                    if (C89219l.m154703a(obj2.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z4) {
                        if (!z) {
                            break;
                        }
                        length2--;
                    } else if (!z) {
                        z4 = true;
                    } else {
                        i4++;
                    }
                }
                TextContent obtain = companion.obtain(obj2.subSequence(i4, length2 + 1).toString());
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                C55126a.m100847a(this.f124458y.getConversationId(), obtain);
                ArrayList arrayList = new ArrayList();
                String conversationId = this.f124458y.getConversationId();
                ShareStoryContent shareStoryContent2 = this.f124459z;
                if (shareStoryContent2 == null || (str = shareStoryContent2.getItemId()) == null) {
                    str = "";
                }
                if (!C54346b.m99661b(conversationId, str) && (shareStoryContent = this.f124459z) != null) {
                    String conversationId2 = this.f124458y.getConversationId();
                    String itemId = shareStoryContent.getItemId();
                    C89219l.m154716b(itemId, "");
                    C54346b.m99660a(conversationId2, itemId);
                    arrayList.add(shareStoryContent);
                }
                arrayList.add(obtain);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ShareStoryContent shareStoryContent3 = this.f124459z;
                if (shareStoryContent3 == null || (str2 = shareStoryContent3.getItemId()) == null) {
                    str2 = "";
                }
                linkedHashMap.put("from_group_id", str2);
                ShareStoryContent shareStoryContent4 = this.f124459z;
                if (shareStoryContent4 == null || (str3 = shareStoryContent4.getStoryCollectionId()) == null) {
                    str3 = "";
                }
                linkedHashMap.put("from_story_collection_id", str3);
                C17438g.C17439a.m32347a().mo27820b(this.f124458y.getConversationId()).mo27816a(arrayList).mo27817a(linkedHashMap).mo27819a(new C54336j(this));
                SearchableEditText searchableEditText4 = this.f124436a;
                if (searchableEditText4 == null) {
                    C89219l.m154710a("editText");
                }
                searchableEditText4.setText("");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$i */
    public static final class C54335i implements AbstractC17426e {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124470a;

        static {
            Covode.recordClassIndex(64035);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54335i(StoryInputView storyInputView) {
            this.f124470a = storyInputView;
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27800a(C19538ai aiVar) {
            String str = StoryInputView.f124434g;
            C89219l.m154716b(str, "");
            C56244a.m102190b(str, "sendBigEmoji onSendSuccess: ".concat(String.valueOf(aiVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new C23144b(this.f124470a.f124441f).mo37640e(R.string.h_).mo37637b();
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27801a(C19538ai aiVar, C19672u uVar) {
            String str = StoryInputView.f124434g;
            C89219l.m154716b(str, "");
            C56244a.m102190b(str, "sendBigEmoji onSendFailure: ".concat(String.valueOf(uVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new C23144b(this.f124470a.f124441f).mo37640e(R.string.ha).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$j */
    public static final class C54336j implements AbstractC17426e {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124471a;

        static {
            Covode.recordClassIndex(64036);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54336j(StoryInputView storyInputView) {
            this.f124471a = storyInputView;
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27800a(C19538ai aiVar) {
            String str = StoryInputView.f124434g;
            C89219l.m154716b(str, "");
            C56244a.m102190b(str, "sendMsg onSendSuccess onSendSuccess: ".concat(String.valueOf(aiVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new C23144b(this.f124471a.f124441f).mo37640e(R.string.h_).mo37637b();
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27801a(C19538ai aiVar, C19672u uVar) {
            String str = StoryInputView.f124434g;
            C89219l.m154716b(str, "");
            C56244a.m102190b(str, "sendMsg onSendFailed onSendSuccess: ".concat(String.valueOf(aiVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new C23144b(this.f124471a.f124441f).mo37640e(R.string.ha).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$k */
    public static final class C54337k extends C34699o {

        /* renamed from: a */
        final /* synthetic */ AbstractC54142b.AbstractC54143a f124472a;

        static {
            Covode.recordClassIndex(64037);
        }

        C54337k(AbstractC54142b.AbstractC54143a aVar) {
            this.f124472a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            this.f124472a.mo91256a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54141a
    /* renamed from: b */
    public final void mo91245b(int i) {
        this.f124442i.setVisibility(i);
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchableEditText m99623a(StoryInputView storyInputView) {
        SearchableEditText searchableEditText = storyInputView.f124436a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        return searchableEditText;
    }

    /* renamed from: b */
    public static final /* synthetic */ TuxIconView m99624b(StoryInputView storyInputView) {
        TuxIconView tuxIconView = storyInputView.f124437b;
        if (tuxIconView == null) {
            C89219l.m154710a("emojiBtn");
        }
        return tuxIconView;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91206a(AbstractC54142b.AbstractC54143a aVar) {
        C89219l.m154721d(aVar, "");
        SearchableEditText searchableEditText = this.f124436a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        searchableEditText.addTextChangedListener(new C54337k(aVar));
    }

    /* renamed from: b */
    private final void m99625b(boolean z) {
        int h;
        if (this.f124457x != z) {
            this.f124457x = z;
            SearchableEditText searchableEditText = this.f124436a;
            if (searchableEditText == null) {
                C89219l.m154710a("editText");
            }
            if (z) {
                h = m99626f();
            } else {
                h = m99628h();
            }
            searchableEditText.setHintTextColor(h);
            SearchableEditText searchableEditText2 = this.f124436a;
            if (searchableEditText2 == null) {
                C89219l.m154710a("editText");
            }
            searchableEditText2.setTextColor(m99627g());
            SearchableEditText searchableEditText3 = this.f124436a;
            if (searchableEditText3 == null) {
                C89219l.m154710a("editText");
            }
            searchableEditText3.setSelected(z);
            TuxIconView tuxIconView = this.f124437b;
            if (tuxIconView == null) {
                C89219l.m154710a("emojiBtn");
            }
            tuxIconView.setActivated(z);
            if (z) {
                m99631k();
            }
            View view = this.f124439d;
            if (view == null) {
                C89219l.m154710a("editLayout");
            }
            view.setBackgroundResource(R.drawable.aqg);
            mo91418d();
        }
    }

    /* renamed from: a */
    public final void mo91413a(int i) {
        C54111b bVar = this.f124447n;
        if (bVar == null) {
            C89219l.m154710a("emojiSearchView");
        }
        bVar.mo91196a(null);
        if (i == -2) {
            String str = f124434g;
            C89219l.m154716b(str, "");
            C56244a.m102190b(str, "switchPanel SOFT_KEYBOARD");
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124448o;
            if (softInputResizeFuncLayoutView == null) {
                C89219l.m154710a("inputPanelView");
            }
            softInputResizeFuncLayoutView.mo91313c();
        } else if (i == -1) {
            String str2 = f124434g;
            C89219l.m154716b(str2, "");
            C56244a.m102190b(str2, "switchPanel NONE");
            mo91228n();
        } else if (i == 1) {
            String str3 = f124434g;
            C89219l.m154716b(str3, "");
            C56244a.m102190b(str3, "switchPanel EMOJI_PANEL");
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.f124448o;
            if (softInputResizeFuncLayoutView2 == null) {
                C89219l.m154710a("inputPanelView");
            }
            if (softInputResizeFuncLayoutView2.mo91327b() == 1) {
                C89219l.m154716b(str3, "");
                C56244a.m102190b(str3, "switchPanel currentPanelType == EMOJI_PANEL");
                mo91228n();
                return;
            }
            this.f124440e.mo91183f();
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView3 = this.f124448o;
            if (softInputResizeFuncLayoutView3 == null) {
                C89219l.m154710a("inputPanelView");
            }
            softInputResizeFuncLayoutView3.mo91312a(1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91243a(C46447a aVar) {
        String str;
        ShareStoryContent shareStoryContent;
        C89219l.m154721d(aVar, "");
        C46534a aVar2 = aVar.f108224d;
        C89219l.m154716b(aVar2, "");
        int stickerType = aVar2.getStickerType();
        if ((stickerType == 10 || stickerType == 2 || stickerType == 3) && mo91417c()) {
            TuxIconView tuxIconView = this.f124438c;
            if (tuxIconView == null) {
                C89219l.m154710a("sendBtn");
            }
            new C23144b(tuxIconView).mo37640e(R.string.b93).mo37637b();
            return;
        }
        ArrayList arrayList = new ArrayList();
        String conversationId = this.f124458y.getConversationId();
        ShareStoryContent shareStoryContent2 = this.f124459z;
        if (shareStoryContent2 == null || (str = shareStoryContent2.getItemId()) == null) {
            str = "";
        }
        if (!C54346b.m99661b(conversationId, str) && (shareStoryContent = this.f124459z) != null) {
            String conversationId2 = this.f124458y.getConversationId();
            String itemId = shareStoryContent.getItemId();
            C89219l.m154716b(itemId, "");
            C54346b.m99660a(conversationId2, itemId);
            arrayList.add(shareStoryContent);
        }
        EmojiContent obtain = EmojiContent.obtain(aVar.f108224d);
        C89219l.m154716b(obtain, "");
        arrayList.add(obtain);
        C17438g.C17439a.m32347a().mo27820b(this.f124458y.getConversationId()).mo27816a(arrayList).mo27819a(new C54335i(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91207a(AbstractC54142b.AbstractC54144b bVar) {
        C89219l.m154721d(bVar, "");
        this.f124449p = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91212a(String str) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            SearchableEditText searchableEditText = this.f124436a;
            if (searchableEditText == null) {
                C89219l.m154710a("editText");
            }
            Editable text = searchableEditText.getText();
            if (text == null || text.length() + str.length() <= 6000) {
                if (this.f124454u == -1) {
                    mo91413a(-2);
                }
                SearchableEditText searchableEditText2 = this.f124436a;
                if (searchableEditText2 == null) {
                    C89219l.m154710a("editText");
                }
                searchableEditText2.mo91539a(str);
                return;
            }
            new C23144b(this.f124442i).mo37640e(R.string.cey).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView$d */
    static final class View$OnFocusChangeListenerC54327d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ StoryInputView f124462a;

        static {
            Covode.recordClassIndex(64027);
        }

        View$OnFocusChangeListenerC54327d(StoryInputView storyInputView) {
            this.f124462a = storyInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                this.f124462a.mo91228n();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b.AbstractC54233a
    /* renamed from: a */
    public final void mo91202a(int i, View view) {
        int i2 = 0;
        if (i == -2) {
            String str = f124434g;
            C89219l.m154716b(str, "");
            C56244a.m102190b(str, "onPanelChange SOFT_KEYBOARD");
            m99625b(true);
            mo91419e();
        } else if (i == -1) {
            String str2 = f124434g;
            C89219l.m154716b(str2, "");
            C56244a.m102190b(str2, "onPanelChange NONE");
            if (this.f124455v) {
                TuxIconView tuxIconView = this.f124437b;
                if (tuxIconView == null) {
                    C89219l.m154710a("emojiBtn");
                }
                if (tuxIconView.isSelected()) {
                    mo91419e();
                }
            }
            m99625b(false);
        } else if (i == 1) {
            String str3 = f124434g;
            C89219l.m154716b(str3, "");
            C56244a.m102190b(str3, "onPanelChange EMOJI_PANEL");
            m99625b(true);
        }
        AbstractC54142b.AbstractC54144b bVar = this.f124449p;
        if (bVar != null) {
            if (i == -1) {
                i2 = 8;
            }
            bVar.mo91257a(i2);
        }
        this.f124454u = i;
    }

    public StoryInputView(ViewGroup viewGroup, C53709a aVar, ShareStoryContent shareStoryContent) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        this.f124441f = viewGroup;
        this.f124458y = aVar;
        this.f124459z = shareStoryContent;
        if (aVar.isAuthorSupporterChat()) {
            this.f124456w = C53651a.m98925a();
            this.f124455v = C53651a.m98929c();
        }
        View findViewById = viewGroup.findViewById(R.id.boz);
        C89219l.m154716b(findViewById, "");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f124442i = viewGroup2;
        View findViewById2 = viewGroup.findViewById(R.id.cmi);
        C89219l.m154716b(findViewById2, "");
        this.f124436a = (SearchableEditText) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.arr);
        C89219l.m154716b(findViewById3, "");
        this.f124439d = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.au7);
        C89219l.m154716b(findViewById4, "");
        this.f124437b = (TuxIconView) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.dvb);
        C89219l.m154716b(findViewById5, "");
        this.f124438c = (TuxIconView) findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.dz8);
        C89219l.m154716b(findViewById6, "");
        findViewById6.setVisibility(8);
        TuxIconView tuxIconView = this.f124438c;
        if (tuxIconView == null) {
            C89219l.m154710a("sendBtn");
        }
        tuxIconView.setVisibility(0);
        View findViewById7 = viewGroup.findViewById(R.id.cyt);
        C89219l.m154716b(findViewById7, "");
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = (SoftInputResizeFuncLayoutView) findViewById7;
        this.f124448o = softInputResizeFuncLayoutView;
        if (softInputResizeFuncLayoutView == null) {
            C89219l.m154710a("inputPanelView");
        }
        softInputResizeFuncLayoutView.setOuterView(viewGroup2);
        SearchableEditText searchableEditText = this.f124436a;
        if (searchableEditText == null) {
            C89219l.m154710a("editText");
        }
        softInputResizeFuncLayoutView.setEditText(searchableEditText);
        softInputResizeFuncLayoutView.setResizable(true);
        this.f124447n = new C54111b(this, viewGroup2, aVar.getConversationId());
        mo91418d();
        SearchableEditText searchableEditText2 = this.f124436a;
        if (searchableEditText2 == null) {
            C89219l.m154710a("editText");
        }
        searchableEditText2.removeTextChangedListener(m99630j());
        searchableEditText2.addTextChangedListener(m99630j());
        searchableEditText2.setFilters(new InputFilter[]{new C55172ad(searchableEditText2)});
        searchableEditText2.setOnClickListener(m99629i());
        searchableEditText2.setOnFocusChangeListener(new View$OnFocusChangeListenerC54327d(this));
        TuxIconView tuxIconView2 = this.f124438c;
        if (tuxIconView2 == null) {
            C89219l.m154710a("sendBtn");
        }
        tuxIconView2.setOnClickListener(m99629i());
        TuxIconView tuxIconView3 = this.f124437b;
        if (tuxIconView3 == null) {
            C89219l.m154710a("emojiBtn");
        }
        tuxIconView3.setOnClickListener(m99629i());
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.f124448o;
        if (softInputResizeFuncLayoutView2 == null) {
            C89219l.m154710a("inputPanelView");
        }
        softInputResizeFuncLayoutView2.setOnPanelChangeListener(this);
        softInputResizeFuncLayoutView2.setOnClickListener(m99629i());
        View view = this.f124439d;
        if (view == null) {
            C89219l.m154710a("editLayout");
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC54328e(this));
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView3 = this.f124448o;
        if (softInputResizeFuncLayoutView3 == null) {
            C89219l.m154710a("inputPanelView");
        }
        C54101a.C54104b d = new C54101a.C54104b(this, softInputResizeFuncLayoutView3).mo91192f().mo91189c().mo91190d();
        C46595g.C46596a.m89935a();
        if (C46597h.m89940b(1)) {
            d.mo91188b();
        } else {
            d.mo91187a();
        }
        C54101a g = d.mo91191e().mo91193g();
        this.f124440e = g;
        g.mo91178a(m99629i());
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView4 = this.f124448o;
        if (softInputResizeFuncLayoutView4 == null) {
            C89219l.m154710a("inputPanelView");
        }
        softInputResizeFuncLayoutView4.mo91325a(g.f108227b);
    }
}
