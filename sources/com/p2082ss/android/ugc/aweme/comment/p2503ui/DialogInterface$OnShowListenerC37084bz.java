package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.widget.C23669c;
import com.bytedance.widget.Widget;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.comment.C36164a;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36212ae;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36216b;
import com.p2082ss.android.ugc.aweme.comment.gift.C36434b;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36407e;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.util.AbstractC37189c;
import com.p2082ss.android.ugc.aweme.comment.util.C37222w;
import com.p2082ss.android.ugc.aweme.comment.widget.C37298c;
import com.p2082ss.android.ugc.aweme.comment.widget.C37299d;
import com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget;
import com.p2082ss.android.ugc.aweme.comment.widgets.SearchGifWidget;
import com.p2082ss.android.ugc.aweme.comment.widgets.SearchGifWidgetV2;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.keyboard.AbstractC39142c;
import com.p2082ss.android.ugc.aweme.common.keyboard.C39141b;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39112b;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.FadeImageView;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46492c;
import com.p2082ss.android.ugc.aweme.emoji.p2903f.C46531b;
import com.p2082ss.android.ugc.aweme.emoji.p2903f.C46532c;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46577a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46595g;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46605i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.C89517an;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bz */
public final class DialogInterface$OnShowListenerC37084bz extends C39112b implements DialogInterface.OnShowListener, TextWatcher, AbstractC37139dd, AbstractC39142c {

    /* renamed from: ag */
    private static final String[] f87368ag = {"😁", "🥰", "😂", "😳", "😏", "😅", "🥺", "😌", "😬", "😊", "😎"};

    /* renamed from: A */
    LinearLayout f87369A;

    /* renamed from: B */
    View f87370B;

    /* renamed from: C */
    ImageView f87371C;

    /* renamed from: D */
    SmartImageView f87372D;

    /* renamed from: E */
    TuxTextView f87373E;

    /* renamed from: F */
    C46492c f87374F;

    /* renamed from: G */
    public AbstractC37098b f87375G;

    /* renamed from: H */
    public AbstractC37097a f87376H;

    /* renamed from: I */
    public AbstractC37099c f87377I;

    /* renamed from: J */
    protected boolean f87378J;

    /* renamed from: K */
    protected boolean f87379K;

    /* renamed from: L */
    protected int f87380L;

    /* renamed from: M */
    protected boolean f87381M;

    /* renamed from: N */
    protected boolean f87382N;

    /* renamed from: O */
    public boolean f87383O;

    /* renamed from: P */
    protected int f87384P;

    /* renamed from: Q */
    protected boolean f87385Q = false;

    /* renamed from: R */
    protected boolean f87386R = false;

    /* renamed from: S */
    public Aweme f87387S;

    /* renamed from: T */
    public BaseSearchGifWidget f87388T;

    /* renamed from: U */
    public C36164a f87389U;

    /* renamed from: V */
    public boolean f87390V = false;

    /* renamed from: W */
    C36274b f87391W;

    /* renamed from: X */
    public CommentVideoModel.Type f87392X = CommentVideoModel.Type.NONE;

    /* renamed from: Y */
    AbstractC17256a f87393Y;

    /* renamed from: Z */
    public GiftViewModel f87394Z = null;

    /* renamed from: a */
    ConstraintLayout f87395a;

    /* renamed from: aA */
    private boolean f87396aA = true;

    /* renamed from: aa */
    public long f87397aa;

    /* renamed from: ab */
    public AbstractC17256a f87398ab;

    /* renamed from: ac */
    public IVideoGiftService f87399ac = VideoGiftService.m120814l();

    /* renamed from: ah */
    private C37299d f87400ah;

    /* renamed from: ai */
    private C37077bv f87401ai;

    /* renamed from: aj */
    private Pattern f87402aj = Pattern.compile("^\\s*$");

    /* renamed from: ak */
    private ValueAnimator f87403ak;

    /* renamed from: al */
    private C46534a f87404al;

    /* renamed from: am */
    private int[] f87405am = null;

    /* renamed from: an */
    private boolean f87406an = false;

    /* renamed from: ao */
    private CharSequence f87407ao = null;

    /* renamed from: ap */
    private C36216b f87408ap;

    /* renamed from: aq */
    private Set<String> f87409aq = new HashSet();

    /* renamed from: ar */
    private List<String> f87410ar = new ArrayList();

    /* renamed from: as */
    private C46577a f87411as = new C46577a();

    /* renamed from: at */
    private AbstractC37189c f87412at = new AbstractC37189c() {
        /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.C370851 */

        static {
            Covode.recordClassIndex(44439);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.util.AbstractC37189c
        /* renamed from: a */
        public final void mo64623a() {
            DialogInterface$OnShowListenerC37084bz.this.mo64610c();
        }
    };

    /* renamed from: au */
    private CharSequence f87413au;

    /* renamed from: av */
    private boolean f87414av = true;

    /* renamed from: aw */
    private C37004a f87415aw;

    /* renamed from: ax */
    private View f87416ax = null;

    /* renamed from: ay */
    private View f87417ay = null;

    /* renamed from: az */
    private boolean f87418az = false;

    /* renamed from: b */
    FadeImageView f87419b;

    /* renamed from: c */
    SmartCircleImageView f87420c;

    /* renamed from: d */
    public MentionEditText f87421d;

    /* renamed from: e */
    TuxIconView f87422e;

    /* renamed from: f */
    TuxIconView f87423f;

    /* renamed from: g */
    FadeImageView f87424g;

    /* renamed from: h */
    public TuxIconView f87425h;

    /* renamed from: i */
    View f87426i;

    /* renamed from: j */
    View f87427j;

    /* renamed from: k */
    View f87428k;

    /* renamed from: l */
    CommentAtSearchLayout f87429l;

    /* renamed from: m */
    View f87430m;

    /* renamed from: n */
    RemoteImageView f87431n;

    /* renamed from: o */
    View f87432o;

    /* renamed from: p */
    AppCompatCheckBox f87433p;

    /* renamed from: q */
    LinearLayout f87434q;

    /* renamed from: r */
    ClipLinearLayout f87435r;

    /* renamed from: s */
    MeasureLinearLayout f87436s;

    /* renamed from: t */
    ImageView f87437t;

    /* renamed from: u */
    View f87438u;

    /* renamed from: v */
    ViewGroup f87439v;

    /* renamed from: w */
    TextView f87440w;

    /* renamed from: x */
    RecyclerView f87441x;

    /* renamed from: y */
    CommentAtSearchLoadingView f87442y;

    /* renamed from: z */
    TuxTextView f87443z;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bz$a */
    public interface AbstractC37097a {
        static {
            Covode.recordClassIndex(44451);
        }

        /* renamed from: a */
        void mo63486a(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean);

        /* renamed from: b */
        void mo63496b(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean);

        /* renamed from: e */
        void mo63504e(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bz$b */
    public interface AbstractC37098b {
        static {
            Covode.recordClassIndex(44452);
        }

        /* renamed from: a */
        void mo63468a(int i, int i2, int i3, String str, String str2, CommentAtSummonFriendItem commentAtSummonFriendItem);

        /* renamed from: a */
        void mo63471a(CommentVideoModel.Type type);

        /* renamed from: a */
        void mo63474a(User user);

        /* renamed from: a */
        void mo63480a(CharSequence charSequence, List<TextExtraStruct> list, C46534a aVar, boolean z, boolean z2);

        /* renamed from: a */
        void mo63484a(String str, int i);

        /* renamed from: b */
        void mo63493b(User user);

        /* renamed from: b */
        void mo63494b(CharSequence charSequence);

        /* renamed from: b */
        void mo63495b(String str);

        /* renamed from: c */
        void mo63500c(String str);

        /* renamed from: c */
        void mo63501c(boolean z);

        /* renamed from: h */
        void mo63509h();

        /* renamed from: i */
        int mo63510i();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bz$c */
    public interface AbstractC37099c {
        static {
            Covode.recordClassIndex(44453);
        }

        /* renamed from: a */
        void mo63473a(C46534a aVar);

        /* renamed from: j */
        void mo63511j();
    }

    /* renamed from: d */
    private static String m74814d(int i) {
        return i == 2 ? "favorite" : i == 3 ? "recent" : "recommend";
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: a */
    public final boolean mo64602a() {
        return this.f87385Q || this.f87386R;
    }

    /* renamed from: a */
    public final boolean mo64603a(String str, String str2, String str3) {
        return this.f87421d.mo125102a(str, str2, str3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0151  */
    @Override // com.p2082ss.android.ugc.aweme.common.keyboard.AbstractC39142c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64600a(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.mo64600a(boolean, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64601a(boolean z, boolean z2) {
        Editable text = this.f87421d.getText();
        if (!TextUtils.isEmpty(this.f87421d.getHint())) {
            this.f87413au = this.f87421d.getHint();
        }
        boolean z3 = false;
        boolean z4 = true;
        if ((text == null || text.length() <= 0) && this.f87404al == null) {
            C37004a aVar = this.f87415aw;
            if (this.f87392X == CommentVideoModel.Type.NONE) {
                z4 = false;
            }
            aVar.mo64518a(false, z2, z4);
            this.f87421d.setHint(this.f87413au);
            return;
        }
        C37004a aVar2 = this.f87415aw;
        if (this.f87392X != CommentVideoModel.Type.NONE) {
            z3 = true;
        }
        aVar2.mo64518a(true, z, z3);
    }

    /* renamed from: b */
    public final void mo64605b() {
        this.f87385Q = false;
        this.f87386R = false;
    }

    /* renamed from: f */
    public final void mo64613f() {
        C36274b bVar = this.f87391W;
        if (bVar != null) {
            bVar.mo63470a(this.f87421d);
        }
    }

    /* renamed from: d */
    public final void mo64611d() {
        KeyboardUtils.m70897c(this.f87421d);
        dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo64617j() {
        AbstractC37098b bVar;
        if (mo64602a() && (bVar = this.f87375G) != null) {
            bVar.mo63495b("box");
        }
        mo64593a(0);
        mo64605b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo64620m() {
        C36274b bVar = this.f87391W;
        if (bVar != null) {
            bVar.f85744o = "keyboard_enter";
            this.f87391W.mo63506f("keyboard_dialog");
        }
        mo64610c();
    }

    static {
        Covode.recordClassIndex(44438);
    }

    /* renamed from: n */
    private void m74815n() {
        if (this.f87405am == null) {
            int[] iArr = new int[2];
            this.f87421d.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            this.f87405am = iArr2;
            iArr2[0] = iArr[0];
            iArr2[1] = (int) (((float) iArr[1]) + C13628n.m24520b(C17867d.m33078a(), -15.0f));
        }
    }

    /* renamed from: o */
    private boolean m74816o() {
        if (getArguments() == null) {
            return false;
        }
        if (getArguments().getInt("viewType") == 1 || getArguments().getInt("viewType") == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo64614g() {
        if (!C31575b.m65865g().isLogin() || !this.f87379K) {
            return false;
        }
        if (this.f87421d.getTextExtraStructList() == null || this.f87421d.getTextExtraStructList().size() < 5) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo64616i() {
        if (!this.f87386R) {
            if (this.f87385Q) {
                this.f87385Q = false;
                m74810b(false);
                m74813c(true);
            } else {
                m74812c(0);
            }
            this.f87386R = true;
            C36274b bVar = this.f87391W;
            if (bVar != null) {
                bVar.mo63483a("click_gift_icon");
                return;
            }
            return;
        }
        mo64593a(0);
        mo64605b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo64618k() {
        AbstractC37098b bVar = this.f87375G;
        if (bVar != null) {
            if (this.f87385Q) {
                bVar.mo63495b("icon");
            } else {
                bVar.mo63509h();
            }
        }
        if (!this.f87385Q) {
            if (this.f87386R) {
                this.f87386R = false;
                m74813c(false);
                m74810b(true);
            } else {
                m74812c(0);
            }
            this.f87385Q = true;
            return;
        }
        mo64593a(0);
        mo64605b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo64619l() {
        if (this.f87375G != null) {
            this.f87390V = true;
            if (!mo64602a()) {
                int selectionStart = this.f87421d.getSelectionStart();
                Editable text = this.f87421d.getText();
                if (text != null) {
                    text.insert(selectionStart, "@");
                    return;
                }
                return;
            }
            this.f87406an = true;
            mo64593a(0);
            mo64605b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC88412b bVar;
        MentionEditText mentionEditText;
        super.onDestroy();
        C36274b bVar2 = this.f87391W;
        if (!(bVar2 == null || (mentionEditText = this.f87421d) == null || !bVar2.f85745p.contains(mentionEditText))) {
            bVar2.f85745p.remove(mentionEditText);
        }
        C36164a aVar = this.f87389U;
        if (!(aVar == null || (bVar = aVar.f85436g.f87761b) == null)) {
            bVar.dispose();
        }
        C46492c cVar = this.f87374F;
        if (cVar != null) {
            C89517an.m155450b(cVar.f108359i);
            if (cVar.f108360j.f108381c) {
                C89219l.m154721d(cVar, "");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onPause() {
        ActivityC0945e activity;
        ViewGroup viewGroup;
        MethodCollector.m26663i(8238);
        super.onPause();
        this.f87436s.getKeyBoardObservable().mo67905b(this);
        if (!(!C36407e.m74108a() || (activity = getActivity()) == null || this.f87416ax == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null)) {
            viewGroup.removeView(this.f87416ax);
        }
        MethodCollector.m26664o(8238);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f87436s.getKeyBoardObservable().mo67903a(this);
        this.f87421d.requestFocus();
        if (mo64602a()) {
            m74812c(200);
        } else if (!C36407e.m74108a()) {
            mo64593a(200);
        } else if (this.f87414av) {
            this.f87414av = false;
        } else {
            mo64593a(0);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStart() {
        try {
            Window window = getDialog().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                if (C36407e.m74108a()) {
                    attributes.dimAmount = 0.0f;
                    attributes.windowAnimations = 0;
                } else {
                    attributes.dimAmount = 0.15f;
                }
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo64610c() {
        int i;
        AbstractC37098b bVar = this.f87375G;
        if (bVar != null) {
            bVar.mo63480a(this.f87421d.getText(), this.f87421d.getTextExtraStructList(), this.f87404al, this.f87382N, false);
            this.f87411as.mo79106b();
            C46577a aVar = this.f87411as;
            Editable text = this.f87421d.getText();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!TextUtils.isEmpty(text)) {
                Matcher matcher = C46579b.f108602a.matcher(text);
                while (matcher.find()) {
                    String group = matcher.group();
                    if (aVar.mo79105a(group)) {
                        Integer num = (Integer) linkedHashMap.get(group);
                        if (num == null || num.intValue() <= 0) {
                            i = 1;
                        } else {
                            i = Integer.valueOf(num.intValue() + 1);
                        }
                        C89219l.m154716b(group, "");
                        linkedHashMap.put(group, i);
                    }
                }
            }
            C36539b.m74375a(linkedHashMap);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        this.f87401ai = null;
        ValueAnimator valueAnimator = this.f87403ak;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f87403ak.cancel();
            this.f87437t.setVisibility(8);
        }
        this.f87388T.mo64907n();
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        AbstractC37099c cVar = this.f87377I;
        if (cVar != null) {
            cVar.mo63473a(this.f87404al);
        }
        this.f87404al = null;
        if (this.f87392X != CommentVideoModel.Type.NONE) {
            this.f87419b.setVisibility(8);
            if (this.f87378J) {
                this.f87423f.setVisibility(0);
                this.f87378J = false;
            }
            AbstractC17256a aVar = this.f87393Y;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
        if (this.f87421d != null && Build.VERSION.SDK_INT < 23) {
            this.f87421d.setCursorVisible(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37139dd
    /* renamed from: e */
    public final void mo64612e() {
        m74815n();
        int height = this.f87427j.getHeight();
        int height2 = this.f87428k.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, (float) height2, 0.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(300);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.animationAnimation$AnimationListenerC3708812 */

            static {
                Covode.recordClassIndex(44442);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                DialogInterface$OnShowListenerC37084bz.this.f87427j.setVisibility(8);
            }
        });
        translateAnimation2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.animationAnimation$AnimationListenerC370892 */

            static {
                Covode.recordClassIndex(44443);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                DialogInterface$OnShowListenerC37084bz.this.f87428k.setAlpha(1.0f);
                DialogInterface$OnShowListenerC37084bz.this.f87428k.setVisibility(0);
                DialogInterface$OnShowListenerC37084bz.this.f87388T.mo64905l();
            }
        });
        this.f87427j.startAnimation(translateAnimation);
        this.f87428k.startAnimation(translateAnimation2);
    }

    /* renamed from: h */
    public final void mo64615h() {
        this.f87388T.mo64906m();
        int height = this.f87427j.getHeight();
        int height2 = this.f87428k.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height2));
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setDuration(300);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.animationAnimation$AnimationListenerC370903 */

            static {
                Covode.recordClassIndex(44444);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                DialogInterface$OnShowListenerC37084bz.this.f87427j.setVisibility(0);
            }
        });
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.animationAnimation$AnimationListenerC370914 */

            static {
                Covode.recordClassIndex(44445);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                DialogInterface$OnShowListenerC37084bz.this.f87428k.setAlpha(0.0f);
                DialogInterface$OnShowListenerC37084bz.this.f87428k.setVisibility(8);
                DialogInterface$OnShowListenerC37084bz.this.f87421d.requestFocus();
                if (!DialogInterface$OnShowListenerC37084bz.this.mo64602a()) {
                    DialogInterface$OnShowListenerC37084bz.this.f87389U.mo63319a(DialogInterface$OnShowListenerC37084bz.this.f87421d.getSelectionStart(), DialogInterface$OnShowListenerC37084bz.this.f87421d.getText());
                    DialogInterface$OnShowListenerC37084bz.this.f87423f.setIconRes(R.raw.icon_emoji);
                    KeyboardUtils.m70896b(DialogInterface$OnShowListenerC37084bz.this.f87421d);
                    return;
                }
                DialogInterface$OnShowListenerC37084bz.this.f87429l.mo64496b();
                DialogInterface$OnShowListenerC37084bz.this.f87423f.setIconRes(R.raw.icon_keyboard_circle);
                KeyboardUtils.m70897c(DialogInterface$OnShowListenerC37084bz.this.f87421d);
            }
        });
        this.f87427j.startAnimation(translateAnimation);
        this.f87428k.startAnimation(animationSet);
    }

    /* renamed from: a */
    public final void mo64595a(C46534a aVar) {
        this.f87404al = aVar;
        this.f87391W.mo63492b(aVar);
    }

    public final void onShow(DialogInterface dialogInterface) {
        AbstractC37099c cVar = this.f87377I;
        if (cVar != null) {
            cVar.mo63511j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MeasureLinearLayout measureLinearLayout = this.f87436s;
        if (measureLinearLayout != null) {
            measureLinearLayout.mo67898a();
        }
    }

    /* renamed from: b */
    public static String m74809b(C46534a aVar) {
        if (aVar == null || aVar.getAnimateUrl() == null) {
            return "";
        }
        return aVar.getAnimateUrl().getUri();
    }

    /* renamed from: c */
    private void m74812c(int i) {
        RunnableC37110cj cjVar = new RunnableC37110cj(this);
        if (i == 0) {
            cjVar.run();
        } else {
            this.f87421d.postDelayed(cjVar, (long) i);
        }
    }

    public final void afterTextChanged(Editable editable) {
        boolean z;
        C46579b.m89899a(this.f87421d);
        mo64613f();
        if (this.f87424g.getVisibility() != 0) {
            z = true;
        } else {
            z = false;
        }
        mo64601a(z, true);
    }

    /* renamed from: b */
    private void m74810b(boolean z) {
        int i;
        int i2;
        TuxIconView tuxIconView = this.f87423f;
        if (z) {
            i = R.raw.icon_keyboard_circle;
        } else {
            i = R.raw.icon_emoji;
        }
        tuxIconView.setIconRes(i);
        C37299d dVar = this.f87400ah;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        dVar.mo64894a(i2);
    }

    /* renamed from: c */
    private void m74813c(boolean z) {
        float f;
        int i;
        if (z) {
            this.f87425h.setIconRes(R.raw.icon_color_gift);
            this.f87425h.mo37657a();
        } else {
            this.f87425h.setIconRes(R.raw.icon_gift);
            this.f87425h.setTintColorRes(R.attr.bc);
            TuxIconView tuxIconView = this.f87425h;
            if (m74816o()) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            tuxIconView.setAlpha(f);
        }
        LinearLayout linearLayout = this.f87369A;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r7) {
        /*
            r6 = this;
            android.app.Dialog r5 = super.onCreateDialog(r7)
            android.view.Window r4 = r5.getWindow()
            android.os.Bundle r3 = r6.getArguments()
            r2 = 19
            r1 = 1
            if (r3 == 0) goto L_0x0038
            java.lang.String r0 = "showEmojiPanel"
            boolean r0 = r3.getBoolean(r0)
            if (r0 == 0) goto L_0x002d
            r6.f87385Q = r1
        L_0x001b:
            if (r4 == 0) goto L_0x0025
            r4.setSoftInputMode(r2)
            r0 = 80
            r4.setGravity(r0)
        L_0x0025:
            r0 = 0
            r5.setCanceledOnTouchOutside(r0)
            r5.setCancelable(r1)
            return r5
        L_0x002d:
            java.lang.String r0 = "showGiftPanel"
            boolean r0 = r3.getBoolean(r0)
            if (r0 == 0) goto L_0x0038
            r6.f87386R = r1
            goto L_0x001b
        L_0x0038:
            r2 = 20
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    /* renamed from: a */
    public final void mo64593a(int i) {
        RunnableC37109ci ciVar = new RunnableC37109ci(this);
        if (i == 0) {
            ciVar.run();
        } else {
            this.f87421d.postDelayed(ciVar, (long) i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37139dd
    /* renamed from: b */
    public final void mo64606b(int i) {
        String str;
        AbstractC37097a aVar = this.f87376H;
        if (aVar != null) {
            if (i == 2) {
                str = "favorite";
            } else if (i == 3 || i == 4) {
                str = "recommend";
            } else {
                str = "system";
            }
            aVar.mo63504e(str);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C36407e.m74108a()) {
            setStyle(1, R.style.ut);
        } else {
            setStyle(1, R.style.us);
        }
        GiftViewModel giftViewModel = this.f87394Z;
        if (giftViewModel != null) {
            giftViewModel.mo63843d().removeObservers(getActivity());
            this.f87394Z.mo63841b().removeObservers(getActivity());
            this.f87394Z.mo63842c().removeObservers(getActivity());
            this.f87394Z.mo63843d().setValue(-1L);
        }
    }

    /* renamed from: a */
    public final void mo64594a(C36274b bVar) {
        this.f87391W = bVar;
        MentionEditText mentionEditText = this.f87421d;
        if (mentionEditText != null) {
            bVar.mo63490b(mentionEditText);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v70, resolved type: java.util.List<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        UrlModel animateUrl;
        String str;
        String str2;
        String str3;
        int i7;
        MethodCollector.m26663i(8094);
        super.onActivityCreated(bundle);
        if (this.f87389U == null) {
            this.f87389U = new C36164a();
        }
        C36164a aVar = this.f87389U;
        aVar.f85435f = "";
        C37222w wVar = aVar.f85436g;
        C36164a.C36167c cVar = new C36164a.C36167c(aVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(timeUnit, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C37222w.C37225c(wVar));
        C89219l.m154716b(a, "");
        wVar.f87761b = a.mo143291d(300, timeUnit).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C37222w.C37227d(cVar));
        RecyclerView recyclerView = this.f87441x;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C36216b bVar = new C36216b(this.f87387S);
        this.f87408ap = bVar;
        this.f87441x.setAdapter(bVar);
        this.f87443z.setOnClickListener(new View$OnClickListenerC37114cn(this));
        C36164a aVar2 = this.f87389U;
        C370969 r0 = new C36164a.AbstractC36166b() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.C370969 */

            static {
                Covode.recordClassIndex(44450);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.C36164a.AbstractC36166b
            /* renamed from: a */
            public final void mo63326a() {
                DialogInterface$OnShowListenerC37084bz.this.f87429l.mo64496b();
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.C36164a.AbstractC36166b
            /* renamed from: b */
            public final void mo63329b() {
                DialogInterface$OnShowListenerC37084bz.this.f87443z.setVisibility(8);
                DialogInterface$OnShowListenerC37084bz.this.f87441x.setVisibility(0);
                DialogInterface$OnShowListenerC37084bz.this.f87429l.mo64495a();
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.C36164a.AbstractC36166b
            /* renamed from: c */
            public final void mo63330c() {
                DialogInterface$OnShowListenerC37084bz.this.f87443z.setVisibility(0);
                DialogInterface$OnShowListenerC37084bz.this.f87441x.setVisibility(8);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.C36164a.AbstractC36166b
            /* renamed from: a */
            public final void mo63327a(boolean z) {
                DialogInterface$OnShowListenerC37084bz.this.f87442y.mo64511a(!z);
                if (z) {
                    DialogInterface$OnShowListenerC37084bz.this.f87442y.setVisibility(8);
                } else {
                    DialogInterface$OnShowListenerC37084bz.this.f87442y.setVisibility(0);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.C36164a.AbstractC36166b
            /* renamed from: a */
            public final boolean mo63328a(String str) {
                return TextUtils.equals(str, C36164a.m73707a(DialogInterface$OnShowListenerC37084bz.this.f87421d.getSelectionStart(), DialogInterface$OnShowListenerC37084bz.this.f87421d.getEditableText(), true));
            }
        };
        C89219l.m154721d(r0, "");
        aVar2.f85430a = r0;
        C36164a aVar3 = this.f87389U;
        C36216b bVar2 = this.f87408ap;
        C89219l.m154721d(bVar2, "");
        aVar3.f85431b = bVar2;
        this.f87408ap.mo67813a((AbstractC39063h.AbstractC39067a) new C37115co(this));
        this.f87408ap.f85531a = new C36216b.AbstractC36218b() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.C3708610 */

            static {
                Covode.recordClassIndex(44440);
            }

            /* renamed from: a */
            private static boolean m74844a() {
                try {
                    return C34719f.C34720a.f82009a.mo61395c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.adapter.C36216b.AbstractC36218b
            /* renamed from: a */
            public final void mo63382a(User user) {
                if (user != null) {
                    Context context = DialogInterface$OnShowListenerC37084bz.this.getContext();
                    if (context == null) {
                        context = C17867d.m33078a();
                    }
                    if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132253e = m74844a();
                    }
                    if (!C58029j.f132253e) {
                        new C79459a(context).mo123050a(R.string.dcq).mo123053a();
                    } else if (!DialogInterface$OnShowListenerC37084bz.this.f87429l.f87137b) {
                        DialogInterface$OnShowListenerC37084bz.this.f87375G.mo63474a(user);
                        new C79459a(context).mo123050a(R.string.ch9).mo123053a();
                        DialogInterface$OnShowListenerC37084bz.this.f87421d.setText("");
                        DialogInterface$OnShowListenerC37084bz.this.mo64611d();
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.adapter.C36216b.AbstractC36218b
            /* renamed from: a */
            public final void mo63381a(int i, CommentAtSummonFriendItem commentAtSummonFriendItem) {
                int i2;
                if (!DialogInterface$OnShowListenerC37084bz.this.f87429l.f87137b) {
                    if (commentAtSummonFriendItem.isMentionBlocked) {
                        new C23144b(DialogInterface$OnShowListenerC37084bz.this).mo37640e(R.string.d23).mo37637b();
                        return;
                    }
                    DialogInterface$OnShowListenerC37084bz.this.f87429l.mo64496b();
                    Editable text = DialogInterface$OnShowListenerC37084bz.this.f87421d.getText();
                    int selectionStart = DialogInterface$OnShowListenerC37084bz.this.f87421d.getSelectionStart();
                    String a = C36164a.m73707a(selectionStart, DialogInterface$OnShowListenerC37084bz.this.f87421d.getText(), false);
                    if (a == null) {
                        a = "";
                    }
                    if (text != null) {
                        text.delete(selectionStart - a.length(), selectionStart);
                    }
                    User user = CommentAtUser.Companion.toUser(commentAtSummonFriendItem.mUser);
                    if (user != null) {
                        String nickname = user.getNickname();
                        if (DialogInterface$OnShowListenerC37084bz.this.mo64603a(C80580in.m139684b(user), commentAtSummonFriendItem.mUser.uid, commentAtSummonFriendItem.mUser.secUid)) {
                            AbstractC37098b bVar = DialogInterface$OnShowListenerC37084bz.this.f87375G;
                            int length = a.length();
                            if (nickname != null) {
                                i2 = nickname.length();
                            } else {
                                i2 = 0;
                            }
                            bVar.mo63468a(length, i2, i + 1, a, user.getUid(), commentAtSummonFriendItem);
                            DialogInterface$OnShowListenerC37084bz.this.f87375G.mo63493b(user);
                        } else if (DialogInterface$OnShowListenerC37084bz.this.getContext() != null) {
                            new C23144b(DialogInterface$OnShowListenerC37084bz.this).mo37640e(R.string.sw).mo37637b();
                        }
                    }
                }
            }
        };
        this.f87421d.addTextChangedListener(new C34699o() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.C3708711 */

            static {
                Covode.recordClassIndex(44441);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
            public final void afterTextChanged(Editable editable) {
                if (DialogInterface$OnShowListenerC37084bz.this.mo64614g() && !DialogInterface$OnShowListenerC37084bz.this.mo64602a() && !DialogInterface$OnShowListenerC37084bz.this.f87429l.f87138c) {
                    DialogInterface$OnShowListenerC37084bz.this.f87389U.mo63319a(DialogInterface$OnShowListenerC37084bz.this.f87421d.getSelectionStart(), editable);
                }
                DialogInterface$OnShowListenerC37084bz.this.mo64613f();
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!TextUtils.isEmpty(charSequence) && i3 > 0) {
                    if ('@' == charSequence.toString().charAt((i + i3) - 1) && DialogInterface$OnShowListenerC37084bz.this.mo64614g()) {
                        DialogInterface$OnShowListenerC37084bz.this.f87429l.mo64495a();
                        if (DialogInterface$OnShowListenerC37084bz.this.f87375G != null) {
                            if (DialogInterface$OnShowListenerC37084bz.this.f87390V) {
                                DialogInterface$OnShowListenerC37084bz.this.f87375G.mo63500c("button");
                            } else {
                                DialogInterface$OnShowListenerC37084bz.this.f87375G.mo63500c("input");
                            }
                            if (DialogInterface$OnShowListenerC37084bz.this.mo64602a()) {
                                DialogInterface$OnShowListenerC37084bz.this.f87375G.mo63495b("icon");
                                DialogInterface$OnShowListenerC37084bz.this.mo64593a(0);
                                DialogInterface$OnShowListenerC37084bz.this.mo64605b();
                            }
                        }
                        DialogInterface$OnShowListenerC37084bz.this.f87390V = false;
                    } else if (DialogInterface$OnShowListenerC37084bz.this.f87421d.getTextExtraStructList() != null && DialogInterface$OnShowListenerC37084bz.this.f87421d.getTextExtraStructList().size() >= 5) {
                        new C23144b(DialogInterface$OnShowListenerC37084bz.this).mo37640e(R.string.d1l).mo37637b();
                    }
                }
            }
        });
        this.f87421d.setHighlightColor(C0643b.m2378c(getContext(), R.color.f));
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setOnShowListener(this);
        boolean z4 = false;
        if (C36407e.m74108a()) {
            mo64593a(0);
        }
        if (getArguments() == null || !getArguments().getBoolean("isCommentDesc", false)) {
            z = false;
        } else {
            z = true;
        }
        int i8 = 2;
        if (z && C76706a.m134278d(this.f87387S) && C76660b.m134241a() == 2) {
            this.f87373E.setVisibility(0);
        }
        this.f87424g.setOnClickListener(new View$OnClickListenerC37123cw(this));
        this.f87422e.setOnClickListener(new View$OnClickListenerC37124cx(this));
        this.f87419b.setOnClickListener(new View$OnClickListenerC37125cy(this));
        this.f87423f.setOnClickListener(new View$OnClickListenerC37126cz(this));
        TuxIconView tuxIconView = this.f87423f;
        if (this.f87385Q) {
            i = R.raw.icon_keyboard_circle;
        } else {
            i = R.raw.icon_emoji;
        }
        tuxIconView.setIconRes(i);
        C37299d dVar = new C37299d(this.f87434q);
        this.f87400ah = dVar;
        C37128da daVar = new C37128da(this);
        C89219l.m154721d(daVar, "");
        dVar.f87973a = daVar;
        this.f87421d.setMentionTextColor(C0643b.m2378c(C17867d.m33078a(), R.color.bx));
        this.f87421d.setMentionTextTypeface(1);
        this.f87421d.setOnMentionInputListener(new C37129db(this));
        this.f87421d.setOnClickListener(new View$OnClickListenerC37103cc(this));
        this.f87436s.setOnClickListener(new View$OnClickListenerC37104cd(this));
        this.f87436s.findViewById(R.id.acf).setOnClickListener(View$OnClickListenerC37105ce.f87463a);
        this.f87433p.setOnCheckedChangeListener(new C37106cf(this));
        this.f87432o.setOnClickListener(new View$OnClickListenerC37107cg(this));
        TuxIconView tuxIconView2 = this.f87425h;
        if (this.f87399ac.mo108903a(this.f87387S)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView2.setVisibility(i2);
        if (!this.f87399ac.mo108903a(this.f87387S) || !m74816o() || this.f87394Z == null) {
            GiftViewModel giftViewModel = this.f87394Z;
            if (!(giftViewModel == null || giftViewModel.mo63841b().getValue() == null)) {
                this.f87394Z.mo63841b().setValue(null);
            }
        } else {
            if (this.f87369A != null) {
                Aweme aweme = this.f87387S;
                if (aweme != null) {
                    str = aweme.getGroupId();
                } else {
                    str = "";
                }
                Aweme aweme2 = this.f87387S;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                } else {
                    str2 = "";
                }
                if (getArguments() != null) {
                    str3 = getArguments().getString("enterFrom");
                } else {
                    str3 = "";
                }
                if (!(getActivity() == null || this.f87387S == null || this.f87394Z == null)) {
                    this.f87369A.addView(new C36434b(this, this.f87369A, getActivity(), this.f87394Z, this.f87412at, str3, str, str2).f86128b);
                    LinearLayout linearLayout = this.f87369A;
                    if (this.f87386R) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    linearLayout.setVisibility(i7);
                }
            }
            this.f87394Z.mo63844e();
            this.f87394Z.mo63841b().observe(getActivity(), new C37116cp(this));
            this.f87394Z.mo63843d().observe(getActivity(), C37117cq.f87477a);
            this.f87372D.setOnClickListener(new View$OnClickListenerC37118cr(this));
            this.f87371C.setOnClickListener(new View$OnClickListenerC37119cs(this));
        }
        m74813c(this.f87386R);
        if (m74816o()) {
            this.f87425h.setOnClickListener(new View$OnClickListenerC37120ct(this));
        } else {
            this.f87425h.setOnClickListener(new View$OnClickListenerC37121cu(this));
        }
        C20766v a2 = C20761r.m39060a(C34735v.m70965a(C31575b.m65865g().getCurUser().getAvatarThumb()));
        a2.f49092E = this.f87420c;
        a2.mo34186c();
        this.f87420c.setVisibility(0);
        if (C36407e.m74108a()) {
            this.f87417ay.setVisibility(0);
            ObjectAnimator.ofFloat(this.f87417ay, "alpha", 0.0f, 1.0f).start();
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            if (!(attributes == null || (attributes.softInputMode & 3) == 0)) {
                ObjectAnimator.ofFloat(this.f87436s, "translationY", (float) C13628n.m24521b(this.f87436s.getContext()), 0.0f).start();
            }
        } else {
            mo64601a(false, true);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f87406an = arguments.getBoolean("clickAt");
            int i9 = arguments.getInt("maxLength");
            this.f87384P = i9;
            if (i9 > 0) {
                this.f87421d.setFilters(new InputFilter[]{new C37298c(this.f87384P)});
            }
            C46534a aVar4 = this.f87404al;
            if (!(aVar4 == null || (animateUrl = aVar4.getAnimateUrl()) == null)) {
                this.f87430m.setVisibility(0);
                this.f87432o.setVisibility(0);
                C89219l.m154721d(aVar4, "");
                int b = (int) C13628n.m24520b(C17867d.m33078a(), 60.0f);
                int[] iArr = (aVar4.getWidth() == 0 || aVar4.getHeight() == 0) ? new int[]{b, b} : new int[]{Math.min((aVar4.getWidth() / aVar4.getHeight()) * b, (int) C13628n.m24520b(C17867d.m33078a(), 107.0f)), b};
                this.f87430m.getLayoutParams().width = iArr[0];
                this.f87430m.requestLayout();
                C34577e.m70593a(this.f87431n, animateUrl, iArr[0], iArr[1]);
            }
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                this.f87421d.setHint(charSequence);
                this.f87421d.setMaxLines(1);
                this.f87421d.setEllipsize(TextUtils.TruncateAt.END);
            }
            User user = (User) arguments.getSerializable("user");
            if (user != null) {
                this.f87421d.setHint(C17867d.m33078a().getString(R.string.fa2, C80580in.m139676a(user)));
                AbstractC37098b bVar3 = this.f87375G;
                if (bVar3 != null) {
                    bVar3.mo63494b(this.f87421d.getHint());
                }
            }
            this.f87421d.addTextChangedListener(this);
            HashSet hashSet = (HashSet) arguments.getSerializable("atUserSet");
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    User user2 = (User) it.next();
                    mo64603a(C80580in.m139684b(user2), user2.getUid(), user2.getSecUid());
                }
            }
            User user3 = (User) arguments.getSerializable("atUser");
            if (user3 != null) {
                mo64603a(C80580in.m139684b(user3), user3.getUid(), user3.getSecUid());
            }
            if (C36407e.m74108a()) {
                mo64601a(false, false);
            } else {
                mo64601a(true, true);
            }
            boolean z5 = arguments.getBoolean("showAt");
            TuxIconView tuxIconView3 = this.f87422e;
            if (z5) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            tuxIconView3.setVisibility(i4);
            this.f87379K = z5;
            this.f87380L = arguments.getInt("viewType");
            boolean z6 = arguments.getBoolean("canForward");
            this.f87381M = z6;
            if (!z6 || this.f87380L == 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            AppCompatCheckBox appCompatCheckBox = this.f87433p;
            if (z2) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            appCompatCheckBox.setVisibility(i5);
            if (!this.f87381M || z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f87382N = z3;
            this.f87433p.setTextColor(C0643b.m2378c(getContext(), R.color.oe));
            if (this.f87434q != null) {
                if (this.f87401ai == null) {
                    this.f87401ai = new C37077bv(this.f87421d, this.f87384P, this);
                }
                C46597h.f108651e.mo79192c();
                C46492c.C46493a aVar5 = new C46492c.C46493a(this.f87401ai, this.f87434q);
                C46595g.C46596a.m89935a();
                if (C46597h.m89940b(2)) {
                    aVar5.f108369a.f108383e = true;
                    aVar5.f108369a.f108386h.add(5);
                } else {
                    aVar5.f108369a.f108379a = true;
                    aVar5.f108369a.f108386h.add(1);
                }
                aVar5.f108369a.f108385g = 2;
                C46492c cVar2 = new C46492c(aVar5.f108370b, aVar5.f108369a, aVar5.f108371c, (byte) 0);
                this.f87374F = cVar2;
                this.f87434q.addView(cVar2.f108227b);
            }
            C37299d dVar2 = this.f87400ah;
            if (this.f87385Q) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            dVar2.mo64894a(i6);
            if (this.f87435r != null) {
                if (this.f87401ai == null) {
                    this.f87401ai = new C37077bv(this.f87421d, this.f87384P, this);
                }
                if (this.f87409aq != null && this.f87410ar.size() <= 0) {
                    if (this.f87409aq.size() == 0) {
                        C46595g.C46596a.m89935a();
                        List<C46605i> a3 = C46595g.m89932a(2);
                        if (a3 != null && !a3.isEmpty()) {
                            for (C46605i iVar : a3) {
                                this.f87409aq.add(iVar.getPreviewEmoji());
                            }
                        } else if (this.f87435r.getVisibility() == 0) {
                            this.f87435r.setVisibility(4);
                        }
                    }
                    if (this.f87409aq.size() > 0 && this.f87410ar.size() == 0) {
                        for (Object obj : new ArrayList(Arrays.asList(f87368ag))) {
                            if (this.f87409aq.contains(obj)) {
                                this.f87410ar.add(obj);
                            }
                        }
                    }
                }
                if (this.f87410ar.size() > 0) {
                    int a4 = C13628n.m24504a(getContext());
                    int b2 = (int) C13628n.m24520b(getContext(), 40.0f);
                    int b3 = (int) C13628n.m24520b(getContext(), 4.0f);
                    int b4 = a4 - (((int) C13628n.m24520b(getContext(), 8.0f)) * 2);
                    int i10 = (b4 + b3) / (b3 + b2);
                    if (i10 >= 9) {
                        i8 = 9;
                    } else if (i10 > 0) {
                        i8 = i10;
                    }
                    List<String> list = this.f87410ar;
                    int min = Math.min(i8, list.size());
                    this.f87435r.addView(new C46531b(this.f87401ai, this.f87435r, list.subList(0, min), new C46532c(min, (b4 - (b2 * min)) / (min - 1)), min).f108227b);
                }
            }
            if (!C36407e.m74108a()) {
                m74811b(!mo64602a(), true);
            }
            if (this.f87392X != CommentVideoModel.Type.NONE) {
                this.f87420c.setVisibility(8);
                this.f87419b.setVisibility(0);
                this.f87415aw.mo64517a(false, 1);
                this.f87415aw.mo64519b(false, true, false);
                if (this.f87423f.getVisibility() == 0) {
                    z4 = true;
                }
                this.f87378J = z4;
                if (z4) {
                    this.f87423f.setVisibility(8);
                }
            } else {
                this.f87419b.setVisibility(8);
            }
        }
        if (bundle != null) {
            try {
                super.dismiss();
                MethodCollector.m26664o(8094);
            } catch (IllegalStateException unused) {
                i3 = 8094;
                super.dismissAllowingStateLoss();
            }
        } else {
            i3 = 8094;
            MethodCollector.m26664o(i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo64599a(boolean z) {
        this.f87382N = z;
        if (z) {
            this.f87421d.setFilters(new InputFilter[]{new C37298c(60)});
            C37077bv bvVar = this.f87401ai;
            if (bvVar != null) {
                bvVar.f87357a = 60;
            }
        } else {
            this.f87421d.setFilters(new InputFilter[]{new C37298c(100)});
            C37077bv bvVar2 = this.f87401ai;
            if (bvVar2 != null) {
                bvVar2.f87357a = 100;
            }
        }
        AbstractC37098b bVar = this.f87375G;
        if (bVar != null) {
            bVar.mo63501c(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C23669c a = C23669c.C23671a.m44763a(this, view);
        C37113cm cmVar = new C37113cm(this);
        C370925 r3 = new AbstractC36212ae() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.C370925 */

            static {
                Covode.recordClassIndex(44446);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36212ae
            /* renamed from: b */
            public final void mo63372b(C46534a aVar, int i) {
                DialogInterface$OnShowListenerC37084bz.this.mo64608b("search", DialogInterface$OnShowListenerC37084bz.m74809b(aVar), i, aVar.getLogPb());
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36212ae
            /* renamed from: a */
            public final void mo63371a(C46534a aVar, int i) {
                DialogInterface$OnShowListenerC37084bz.this.mo64595a(aVar);
                DialogInterface$OnShowListenerC37084bz.this.mo64598a("search", DialogInterface$OnShowListenerC37084bz.m74809b(aVar), i, aVar.getLogPb());
                DialogInterface$OnShowListenerC37084bz.this.mo64601a(true, true);
                DialogInterface$OnShowListenerC37084bz.this.mo64615h();
            }
        };
        C37122cv cvVar = new C37122cv(this);
        Aweme aweme = this.f87387S;
        if (aweme == null || aweme.getAid() == null) {
            str = "";
        } else {
            str = this.f87387S.getAid();
        }
        if (C36407e.m74108a()) {
            this.f87388T = new SearchGifWidgetV2(cmVar, r3, cvVar, str);
        } else {
            this.f87388T = new SearchGifWidget(cmVar, r3, cvVar, str);
        }
        a.mo39101a(R.id.c64, (Widget) this.f87388T, false);
        C36274b bVar = this.f87391W;
        if (bVar != null) {
            bVar.mo63490b(this.f87421d);
            C36274b.m73917a(this.f87421d, (int) R.color.bx);
        }
        if (!C37156j.f87552a) {
            C37156j.f87555d = System.currentTimeMillis();
        }
        if (SettingsManager.m29616a().mo25400a("keyboard_show_judge_by_screen_height", true)) {
            this.f87436s.setKeyBoardObservable(new C39141b());
        }
    }

    /* renamed from: b */
    private void m74811b(final boolean z, boolean z2) {
        ValueAnimator ofFloat;
        if (this.f87435r != null && this.f87410ar.size() > 0) {
            int i = 0;
            if (z2) {
                this.f87435r.setVisibility(0);
                if (C36407e.m74108a()) {
                    this.f87435r.measure(0, 0);
                    int measuredHeight = this.f87435r.getMeasuredHeight();
                    if (z) {
                        ((ViewGroup.MarginLayoutParams) this.f87435r.getLayoutParams()).bottomMargin = -measuredHeight;
                        this.f87435r.setClipHeight(measuredHeight);
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.f87435r.getLayoutParams()).bottomMargin = 0;
                        this.f87435r.setClipHeight(0);
                    }
                    this.f87435r.requestLayout();
                }
                float[] fArr = {0.0f, 1.0f};
                if (z) {
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                ofFloat.setDuration(150L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.C370947 */

                    static {
                        Covode.recordClassIndex(44448);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int measuredHeight = (int) (((float) DialogInterface$OnShowListenerC37084bz.this.f87435r.getMeasuredHeight()) * floatValue);
                        ((ViewGroup.MarginLayoutParams) DialogInterface$OnShowListenerC37084bz.this.f87435r.getLayoutParams()).bottomMargin = -measuredHeight;
                        DialogInterface$OnShowListenerC37084bz.this.f87435r.setAlpha(1.0f - floatValue);
                        DialogInterface$OnShowListenerC37084bz.this.f87435r.setClipHeight(measuredHeight);
                        DialogInterface$OnShowListenerC37084bz.this.f87435r.requestLayout();
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.C370958 */

                    static {
                        Covode.recordClassIndex(44449);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        int i;
                        super.onAnimationEnd(animator);
                        ClipLinearLayout clipLinearLayout = DialogInterface$OnShowListenerC37084bz.this.f87435r;
                        if (z) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        clipLinearLayout.setVisibility(i);
                    }
                });
                ofFloat.start();
                return;
            }
            ClipLinearLayout clipLinearLayout = this.f87435r;
            if (!z) {
                i = 8;
            }
            clipLinearLayout.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37139dd
    /* renamed from: a */
    public final void mo64597a(String str, int i) {
        AbstractC37098b bVar = this.f87375G;
        if (bVar != null) {
            bVar.mo63484a(str, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37139dd
    /* renamed from: b */
    public final void mo64607b(C46534a aVar, int i, int i2) {
        mo64608b(m74814d(i), m74809b(aVar), i2, aVar.getLogPb());
    }

    /* renamed from: a */
    public static DialogInterface$OnShowListenerC37084bz m74806a(int i, boolean z, String str) {
        DialogInterface$OnShowListenerC37084bz bzVar = new DialogInterface$OnShowListenerC37084bz();
        Bundle bundle = new Bundle();
        bundle.putInt("viewType", i);
        bundle.putBoolean("canForward", z);
        bundle.putString("enterFrom", str);
        bzVar.setArguments(bundle);
        return bzVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37139dd
    /* renamed from: a */
    public final void mo64596a(C46534a aVar, int i, int i2) {
        m74815n();
        mo64595a(aVar);
        mo64598a(m74814d(i), m74809b(aVar), i2, aVar.getLogPb());
        mo64601a(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a;
        if (C36407e.m74108a()) {
            a = C1870c.m6046a(getActivity(), R.layout.ic, viewGroup, false);
        } else {
            a = C1764a.m5927a(layoutInflater, R.layout.ic, viewGroup, false);
        }
        this.f87419b = (FadeImageView) a.findViewById(R.id.dih);
        this.f87420c = (SmartCircleImageView) a.findViewById(R.id.a94);
        this.f87421d = (MentionEditText) a.findViewById(R.id.a9f);
        this.f87395a = (ConstraintLayout) a.findViewById(R.id.a9e);
        this.f87422e = (TuxIconView) a.findViewById(R.id.bsk);
        this.f87423f = (TuxIconView) a.findViewById(R.id.bv9);
        this.f87425h = (TuxIconView) a.findViewById(R.id.bvw);
        this.f87424g = (FadeImageView) a.findViewById(R.id.a_a);
        this.f87426i = a.findViewById(R.id.c3o);
        this.f87427j = a.findViewById(R.id.c4g);
        this.f87428k = a.findViewById(R.id.c64);
        this.f87429l = (CommentAtSearchLayout) a.findViewById(R.id.a0n);
        this.f87430m = a.findViewById(R.id.c49);
        this.f87431n = (RemoteImageView) a.findViewById(R.id.b_i);
        this.f87432o = a.findViewById(R.id.b_j);
        this.f87433p = (AppCompatCheckBox) a.findViewById(R.id.a2b);
        this.f87434q = (LinearLayout) a.findViewById(R.id.cyt);
        this.f87435r = (ClipLinearLayout) a.findViewById(R.id.cyu);
        this.f87436s = (MeasureLinearLayout) a.findViewById(R.id.cy4);
        this.f87437t = (ImageView) a.findViewById(R.id.b_k);
        this.f87438u = a.findViewById(R.id.c4b);
        this.f87439v = (ViewGroup) a.findViewById(R.id.a99);
        this.f87440w = (TextView) a.findViewById(R.id.egc);
        this.f87441x = (RecyclerView) a.findViewById(R.id.doi);
        this.f87442y = (CommentAtSearchLoadingView) a.findViewById(R.id.cg3);
        this.f87443z = (TuxTextView) a.findViewById(R.id.evu);
        this.f87369A = (LinearLayout) a.findViewById(R.id.bad);
        this.f87370B = a.findViewById(R.id.dut);
        this.f87371C = (ImageView) a.findViewById(R.id.dhp);
        this.f87372D = (SmartImageView) a.findViewById(R.id.duu);
        this.f87373E = (TuxTextView) a.findViewById(R.id.eqm);
        this.f87417ay = a.findViewById(R.id.px);
        if (C36407e.m74108a()) {
            this.f87426i.setVisibility(4);
            this.f87426i.postDelayed(new RunnableC37102cb(this), 500);
        }
        this.f87429l.setVisibilityChangeListener(C37101ca.f87459a);
        this.f87415aw = new C37004a(this.f87395a);
        return a;
    }

    /* renamed from: a */
    public static DialogInterface$OnShowListenerC37084bz m74807a(int i, boolean z, String str, Bundle bundle) {
        DialogInterface$OnShowListenerC37084bz a = m74806a(i, z, str);
        Bundle arguments = a.getArguments();
        if (arguments != null) {
            arguments.putAll(bundle);
        }
        return a;
    }

    /* renamed from: a */
    public static void m74808a(Aweme aweme, String str, String str2, String str3) {
        C33744d a = new C33744d().mo59983a("enter_from", str2).mo59983a("group_id", C59208ac.m108771e(aweme)).mo59983a("author_id", C59208ac.m108758a(aweme));
        if (str3.equals("show_gift_tooltip")) {
            C39162r.m79460a("show_gift_tooltip", a.f79943a);
            return;
        }
        a.mo59983a("enter_method", str);
        C39162r.m79460a("dismiss_gift_tooltip", a.f79943a);
    }

    /* renamed from: b */
    public final void mo64608b(String str, String str2, int i, LogPbBean logPbBean) {
        AbstractC37097a aVar = this.f87376H;
        if (aVar != null) {
            aVar.mo63496b(str, this.f87388T.mo64908o(), str2, i, logPbBean);
        }
    }

    /* renamed from: a */
    public final void mo64598a(String str, String str2, int i, LogPbBean logPbBean) {
        AbstractC37097a aVar = this.f87376H;
        if (aVar != null) {
            aVar.mo63486a(str, this.f87388T.mo64908o(), str2, i, logPbBean);
        }
    }
}
