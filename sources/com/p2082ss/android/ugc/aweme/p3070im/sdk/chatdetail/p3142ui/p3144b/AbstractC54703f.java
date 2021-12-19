package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54610b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ExtendedEditText;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f */
public abstract class AbstractC54703f extends AbstractC1973t<C54705b> {

    /* renamed from: l */
    public static final C54704a f125364l = new C54704a((byte) 0);

    /* renamed from: h */
    public GroupChatDetailViewModel f125365h;

    /* renamed from: i */
    public AbstractC17427b f125366i;

    /* renamed from: j */
    public C54610b f125367j;

    /* renamed from: k */
    public int f125368k = -1;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$b */
    public static final class C54705b extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125369a = {new C89232y(C54705b.class, "avatarView", "getAvatarView()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new C89232y(C54705b.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new C89232y(C54705b.class, "editButton", "getEditButton()Landroid/widget/ImageView;", 0), new C89232y(C54705b.class, "memberCountView", "getMemberCountView()Landroid/widget/TextView;", 0), new C89232y(C54705b.class, "editContainer", "getEditContainer()Landroid/view/ViewGroup;", 0), new C89232y(C54705b.class, "editText", "getEditText()Lcom/ss/android/ugc/aweme/im/sdk/common/ui/widget/ExtendedEditText;", 0), new C89232y(C54705b.class, "editTextClearIcon", "getEditTextClearIcon()Landroid/widget/ImageView;", 0), new C89232y(C54705b.class, "editCheckProgressBar", "getEditCheckProgressBar()Landroid/widget/ProgressBar;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125370b = m100198a((int) R.id.bjn);

        /* renamed from: c */
        private final AbstractC89248d f125371c = m100198a((int) R.id.bjr);

        /* renamed from: d */
        private final AbstractC89248d f125372d = m100198a((int) R.id.bjt);

        /* renamed from: e */
        private final AbstractC89248d f125373e = m100198a((int) R.id.bjq);

        /* renamed from: f */
        private final AbstractC89248d f125374f = m100198a((int) R.id.bjo);

        /* renamed from: h */
        private final AbstractC89248d f125375h = m100198a((int) R.id.bjp);

        /* renamed from: i */
        private final AbstractC89248d f125376i = m100198a((int) R.id.bjv);

        /* renamed from: j */
        private final AbstractC89248d f125377j = m100198a((int) R.id.bju);

        static {
            Covode.recordClassIndex(64420);
        }

        /* renamed from: b */
        public final TextView mo91728b() {
            return (TextView) this.f125371c.mo23374a(this, f125369a[1]);
        }

        /* renamed from: c */
        public final ImageView mo91729c() {
            return (ImageView) this.f125372d.mo23374a(this, f125369a[2]);
        }

        /* renamed from: d */
        public final TextView mo91730d() {
            return (TextView) this.f125373e.mo23374a(this, f125369a[3]);
        }

        /* renamed from: e */
        public final ViewGroup mo91731e() {
            return (ViewGroup) this.f125374f.mo23374a(this, f125369a[4]);
        }

        /* renamed from: f */
        public final ExtendedEditText mo91732f() {
            return (ExtendedEditText) this.f125375h.mo23374a(this, f125369a[5]);
        }

        /* renamed from: g */
        public final ImageView mo91733g() {
            return (ImageView) this.f125376i.mo23374a(this, f125369a[6]);
        }

        /* renamed from: h */
        public final ProgressBar mo91734h() {
            return (ProgressBar) this.f125377j.mo23374a(this, f125369a[7]);
        }
    }

    static {
        Covode.recordClassIndex(64418);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a81;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$a */
    public static final class C54704a {
        static {
            Covode.recordClassIndex(64419);
        }

        private C54704a() {
        }

        public /* synthetic */ C54704a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$e */
    public static final class View$OnClickListenerC54708e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54703f f125387a;

        /* renamed from: b */
        final /* synthetic */ C54705b f125388b;

        /* renamed from: c */
        final /* synthetic */ C19638h f125389c;

        /* renamed from: d */
        final /* synthetic */ C54610b f125390d;

        static {
            Covode.recordClassIndex(64423);
        }

        View$OnClickListenerC54708e(AbstractC54703f fVar, C54705b bVar, C19638h hVar, C54610b bVar2) {
            this.f125387a = fVar;
            this.f125388b = bVar;
            this.f125389c = hVar;
            this.f125390d = bVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125387a.f125365h;
            if (groupChatDetailViewModel != null) {
                groupChatDetailViewModel.mo91835a(StringSet.name);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$f */
    public static final class View$OnClickListenerC54709f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54703f f125391a;

        /* renamed from: b */
        final /* synthetic */ C54705b f125392b;

        /* renamed from: c */
        final /* synthetic */ C19638h f125393c;

        /* renamed from: d */
        final /* synthetic */ C54610b f125394d;

        static {
            Covode.recordClassIndex(64424);
        }

        View$OnClickListenerC54709f(AbstractC54703f fVar, C54705b bVar, C19638h hVar, C54610b bVar2) {
            this.f125391a = fVar;
            this.f125392b = bVar;
            this.f125393c = hVar;
            this.f125394d = bVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125391a.f125365h;
            if (groupChatDetailViewModel != null) {
                groupChatDetailViewModel.mo91835a("button");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$g */
    public static final class View$OnClickListenerC54710g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54705b f125395a;

        static {
            Covode.recordClassIndex(64425);
        }

        View$OnClickListenerC54710g(C54705b bVar) {
            this.f125395a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Editable text = this.f125395a.mo91732f().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo5788a(C54705b bVar) {
        C19638h c;
        C54610b bVar2;
        String str;
        String str2;
        C89219l.m154721d(bVar, "");
        AbstractC17427b bVar3 = this.f125366i;
        if (bVar3 != null && (c = bVar3.mo27749c()) != null && (bVar2 = this.f125367j) != null) {
            Context context = bVar.mo91720a().getContext();
            String string = context.getString(R.string.c5x);
            C89219l.m154716b(string, "");
            int i = 0;
            C55357e.C55358a.m101168a();
            C34577e.m70608b((RemoteImageView) bVar.f125370b.mo23374a(bVar, C54705b.f125369a[0]), C55357e.m101163a(c), -1, -1);
            String str3 = null;
            if (bVar2.f125175d.f125195d) {
                this.f125368k = 2;
                bVar.mo91728b().setVisibility(8);
                bVar.mo91729c().setVisibility(8);
                bVar.mo91733g().setVisibility(8);
                bVar.mo91730d().setVisibility(8);
                bVar.mo91731e().setVisibility(0);
                bVar.mo91734h().setVisibility(0);
                bVar.mo91732f().setEnabled(false);
                bVar.mo91732f().mo92322a();
                if (bVar2.f125175d.f125193b) {
                    ExtendedEditText f = bVar.mo91732f();
                    C19639i coreInfo = c.getCoreInfo();
                    if (coreInfo != null) {
                        str3 = coreInfo.getName();
                    }
                    f.setText(str3);
                    return;
                }
                bVar.mo91732f().setHint(string);
            } else if (bVar2.f125175d.f125194c) {
                this.f125368k = 1;
                bVar.mo91728b().setVisibility(8);
                bVar.mo91729c().setVisibility(8);
                bVar.mo91730d().setVisibility(8);
                bVar.mo91731e().setVisibility(0);
                bVar.mo91734h().setVisibility(8);
                bVar.mo91732f().setText("");
                bVar.mo91732f().setEnabled(true);
                bVar.mo91733g().setOnClickListener(new View$OnClickListenerC54710g(bVar));
                if (bVar2.f125175d.f125193b) {
                    ExtendedEditText f2 = bVar.mo91732f();
                    C19639i coreInfo2 = c.getCoreInfo();
                    if (coreInfo2 != null) {
                        str2 = coreInfo2.getName();
                    } else {
                        str2 = null;
                    }
                    f2.setText(str2);
                    bVar.mo91733g().setVisibility(0);
                } else {
                    bVar.mo91732f().setHint(string);
                    bVar.mo91733g().setVisibility(8);
                }
                bVar.mo91732f().mo92322a();
                bVar.mo91732f().addTextChangedListener(new C54706c(bVar, this, bVar, c, bVar2));
                bVar.mo91732f().setOnEditorActionListener(new C54707d(this, bVar, c, bVar2));
                if (!bVar.mo91732f().hasFocus()) {
                    bVar.mo91732f().requestFocus();
                    Object a = m100220a(context, "input_method");
                    if (a instanceof InputMethodManager) {
                        str3 = a;
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) str3;
                    if (inputMethodManager != null) {
                        inputMethodManager.toggleSoftInput(1, 0);
                    }
                    ExtendedEditText f3 = bVar.mo91732f();
                    Editable text = bVar.mo91732f().getText();
                    if (text != null) {
                        i = text.length();
                    }
                    f3.setSelection(i);
                }
            } else {
                this.f125368k = 0;
                bVar.mo91728b().setVisibility(0);
                bVar.mo91729c().setVisibility(0);
                bVar.mo91730d().setVisibility(0);
                bVar.mo91731e().setVisibility(8);
                bVar.mo91734h().setVisibility(8);
                bVar.mo91732f().setEnabled(false);
                if (bVar2.f125175d.f125193b) {
                    TextView b = bVar.mo91728b();
                    C19639i coreInfo3 = c.getCoreInfo();
                    if (coreInfo3 != null) {
                        str = coreInfo3.getName();
                    } else {
                        str = null;
                    }
                    b.setText(str);
                    bVar.mo91728b().setTextColor(C0643b.m2378c(context, R.color.bx));
                } else {
                    bVar.mo91728b().setText(string);
                    bVar.mo91728b().setTextColor(C0643b.m2378c(context, R.color.c5));
                }
                TextView d = bVar.mo91730d();
                C89219l.m154716b(context, "");
                Resources resources = context.getResources();
                if (resources != null) {
                    str3 = resources.getQuantityString(R.plurals.cu, c.getMemberCount(), Integer.valueOf(c.getMemberCount()));
                }
                d.setText(str3);
                bVar.mo91728b().setOnClickListener(new View$OnClickListenerC54708e(this, bVar, c, bVar2));
                bVar.mo91729c().setOnClickListener(new View$OnClickListenerC54709f(this, bVar, c, bVar2));
                KeyboardUtils.m70897c(bVar.mo91732f());
            }
        }
    }

    /* renamed from: a */
    private static Object m100220a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$d */
    public static final class C54707d implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54703f f125383a;

        /* renamed from: b */
        final /* synthetic */ C54705b f125384b;

        /* renamed from: c */
        final /* synthetic */ C19638h f125385c;

        /* renamed from: d */
        final /* synthetic */ C54610b f125386d;

        static {
            Covode.recordClassIndex(64422);
        }

        C54707d(AbstractC54703f fVar, C54705b bVar, C19638h hVar, C54610b bVar2) {
            this.f125383a = fVar;
            this.f125384b = bVar;
            this.f125385c = hVar;
            this.f125386d = bVar2;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125383a.f125365h;
            if (groupChatDetailViewModel != null) {
                groupChatDetailViewModel.mo91840d();
            }
            KeyboardUtils.m70897c(textView);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f$c */
    public static final class C54706c extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C54705b f125378a;

        /* renamed from: b */
        final /* synthetic */ AbstractC54703f f125379b;

        /* renamed from: c */
        final /* synthetic */ C54705b f125380c;

        /* renamed from: d */
        final /* synthetic */ C19638h f125381d;

        /* renamed from: e */
        final /* synthetic */ C54610b f125382e;

        static {
            Covode.recordClassIndex(64421);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            GroupChatDetailViewModel groupChatDetailViewModel = this.f125379b.f125365h;
            if (groupChatDetailViewModel != null) {
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence;
                }
                C89219l.m154721d(charSequence2, "");
                groupChatDetailViewModel.f125505b = charSequence2.toString();
            }
            if (charSequence == null || charSequence.length() <= 0) {
                this.f125378a.mo91733g().setVisibility(8);
            } else {
                this.f125378a.mo91733g().setVisibility(0);
            }
        }

        C54706c(C54705b bVar, AbstractC54703f fVar, C54705b bVar2, C19638h hVar, C54610b bVar3) {
            this.f125378a = bVar;
            this.f125379b = fVar;
            this.f125380c = bVar2;
            this.f125381d = hVar;
            this.f125382e = bVar3;
        }
    }
}
