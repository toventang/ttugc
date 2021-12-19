package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.C0820e;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.common.keyboard.AbstractC3814c;
import com.bytedance.android.live.common.keyboard.C3811a;
import com.bytedance.android.live.common.keyboard.C3812b;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.C8774g;
import com.bytedance.android.livesdk.chatroom.model.C7686f;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.chatroom.p492g.C7569b;
import com.bytedance.android.livesdk.chatroom.p492g.C7571c;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar;
import com.bytedance.android.livesdk.event.C8448b;
import com.bytedance.android.livesdk.livesetting.comment.EnableLiveKeyboardWithHeightSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentInputDialogDismissFixSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveInputDialogAnimationSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11278o;
import com.bytedance.android.livesdk.widget.BarrageView;
import com.bytedance.android.livesdkapi.host.AbstractC11799c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.p147c.p148a.AbstractC2713c;
import com.bytedance.android.p147c.p148a.C2707a;
import com.bytedance.android.p147c.p148a.C2709b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bg */
public final class C7794bg extends DialogInterface$OnCancelListenerC0944d implements AbstractC3814c, AbstractC7766ar {

    /* renamed from: A */
    private boolean f19320A;

    /* renamed from: B */
    private boolean f19321B;

    /* renamed from: C */
    private MeasureLinearLayout f19322C;

    /* renamed from: D */
    private ImageView f19323D;

    /* renamed from: E */
    private ImageView f19324E;

    /* renamed from: F */
    private KeyboardShadowView f19325F;

    /* renamed from: G */
    private LinearLayout f19326G;

    /* renamed from: H */
    private ViewGroup f19327H;

    /* renamed from: I */
    private View f19328I;

    /* renamed from: J */
    private C2709b f19329J;

    /* renamed from: K */
    private long f19330K;

    /* renamed from: L */
    private final View.OnClickListener f19331L = new View$OnClickListenerC7804bh(this);

    /* renamed from: M */
    private final TextWatcher f19332M = new TextWatcher() {
        /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.C77951 */

        static {
            Covode.recordClassIndex(8590);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String obj;
            int i;
            String string;
            if (C7794bg.this.f19333a) {
                Editable text = C7794bg.this.f19343k.getText();
                C7794bg bgVar = C7794bg.this;
                if (text == null) {
                    obj = "";
                } else {
                    obj = text.toString();
                }
                bgVar.f19342j = obj;
                boolean isEmpty = TextUtils.isEmpty(C7794bg.this.f19342j);
                if (isEmpty) {
                    C7794bg.this.f19344l.setVisibility(0);
                } else {
                    C7794bg.this.f19344l.setVisibility(8);
                    if (!C7794bg.this.f19352t && C7794bg.this.f19334b != null) {
                        C7794bg.this.f19352t = true;
                        C7794bg.this.f19334b.mo14048b();
                    }
                }
                C7794bg.this.mo14061b(isEmpty);
                int trimmedLength = TextUtils.getTrimmedLength(C7794bg.this.f19342j);
                int i2 = 15;
                if (C7794bg.this.f19340h) {
                    i = 15;
                } else {
                    i = 100;
                }
                if (trimmedLength > i) {
                    C7794bg bgVar2 = C7794bg.this;
                    CommentEditText commentEditText = bgVar2.f19343k;
                    bgVar2.f19339g = new InputFilter.LengthFilter(C7794bg.this.f19342j.length());
                    commentEditText.setFilters(new InputFilter[]{bgVar2.f19339g});
                } else {
                    C7794bg bgVar3 = C7794bg.this;
                    CommentEditText commentEditText2 = bgVar3.f19343k;
                    if (bgVar3.f19339g != null) {
                        commentEditText2.setFilters(new InputFilter[0]);
                        bgVar3.f19339g = null;
                    }
                }
                if (!C7794bg.this.f19340h) {
                    i2 = 100;
                }
                if (trimmedLength > i2) {
                    if (C7794bg.this.f19340h) {
                        string = C7794bg.this.getString(R.string.gmg);
                    } else {
                        string = C7794bg.this.getString(R.string.gll, 100);
                    }
                    C11226ao.m19883a(C3966y.m9669e(), string, 0);
                    int offsetByCodePoints = C7794bg.this.f19342j.offsetByCodePoints(0, C7794bg.this.f19342j.codePointCount(0, 100));
                    if (offsetByCodePoints >= C7794bg.this.f19342j.length()) {
                        offsetByCodePoints = C7794bg.this.f19342j.length() - 1;
                    }
                    C7794bg.this.f19343k.setText(C7794bg.this.f19342j.substring(0, offsetByCodePoints));
                    try {
                        C7794bg.this.f19343k.setSelection(C7794bg.this.f19343k.getText().length());
                    } catch (Exception e) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("error", e.getMessage());
                        C3868c.m9491a("ttlive_emoji_fragment_error", 1, hashMap);
                    }
                }
                C7794bg.this.f19353u.mo7239a(C7794bg.this.f19350r);
            }
        }
    };

    /* renamed from: a */
    public boolean f19333a;

    /* renamed from: b */
    public AbstractC7766ar.AbstractC7768b f19334b;

    /* renamed from: c */
    public AbstractC7766ar.AbstractC7767a f19335c;

    /* renamed from: d */
    public boolean f19336d;

    /* renamed from: e */
    boolean f19337e;

    /* renamed from: f */
    public EnumC7803a f19338f = EnumC7803a.Keyboard;

    /* renamed from: g */
    InputFilter f19339g;

    /* renamed from: h */
    public boolean f19340h;

    /* renamed from: i */
    boolean f19341i;

    /* renamed from: j */
    public String f19342j;

    /* renamed from: k */
    public CommentEditText f19343k;

    /* renamed from: l */
    public TextView f19344l;

    /* renamed from: m */
    BarrageView f19345m;

    /* renamed from: n */
    ViewPager f19346n;

    /* renamed from: o */
    ViewGroup f19347o;

    /* renamed from: p */
    public LiveButton f19348p;

    /* renamed from: q */
    public AbstractC2713c f19349q;

    /* renamed from: r */
    public C2707a f19350r;

    /* renamed from: s */
    int f19351s;

    /* renamed from: t */
    public boolean f19352t;

    /* renamed from: u */
    public final C2707a.AbstractC2708a f19353u = new C2707a.AbstractC2708a() {
        /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.C77962 */

        static {
            Covode.recordClassIndex(8591);
        }

        @Override // com.bytedance.android.p147c.p148a.AbstractC2713c.AbstractC2714a
        /* renamed from: a_ */
        public final void mo7241a_() {
            C7794bg.this.mo14040b();
        }

        @Override // com.bytedance.android.p147c.p148a.C2707a.AbstractC2708a
        /* renamed from: b */
        public final void mo7231b() {
            C7794bg.this.mo14064e();
        }

        @Override // com.bytedance.android.p147c.p148a.C2707a.AbstractC2708a
        /* renamed from: a */
        public final boolean mo7230a() {
            return TextUtils.isEmpty(C7794bg.this.f19342j);
        }

        @Override // com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a
        /* renamed from: b_ */
        public final void mo7242b_() {
            C7794bg.this.f19343k.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // com.bytedance.android.p147c.p148a.AbstractC2713c.AbstractC2714a
        /* renamed from: a */
        public final void mo7239a(AbstractC2713c cVar) {
            if (cVar == C7794bg.this.f19349q) {
                C7794bg.this.f19348p.setEnabled(!cVar.mo7228d());
            }
        }

        @Override // com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a
        /* renamed from: a */
        public final void mo7240a(C2972a aVar) {
            int i;
            String string;
            if (aVar != null && aVar.f8734a != null) {
                int length = C7794bg.this.f19343k.getText().length() + aVar.f8734a.length();
                if (C7794bg.this.f19340h) {
                    i = 15;
                } else {
                    i = 100;
                }
                if (length > i) {
                    if (C7794bg.this.f19340h) {
                        string = C7794bg.this.getString(R.string.gmg);
                    } else {
                        string = C7794bg.this.getString(R.string.gll, 100);
                    }
                    C11226ao.m19883a(C3966y.m9669e(), string, 0);
                } else if (!TextUtils.isEmpty(aVar.f8734a)) {
                    C7794bg.this.f19343k.getText().insert(C7794bg.this.f19343k.getSelectionStart(), aVar.f8734a);
                }
            }
        }
    };

    /* renamed from: v */
    final List<AbstractC2713c> f19354v = new ArrayList();

    /* renamed from: w */
    private int f19355w;

    /* renamed from: x */
    private boolean f19356x;

    /* renamed from: y */
    private boolean f19357y;

    /* renamed from: z */
    private boolean f19358z;

    static {
        Covode.recordClassIndex(8589);
    }

    @Override // com.bytedance.android.live.common.keyboard.AbstractC3814c
    /* renamed from: a */
    public final void mo9159a(boolean z, int i) {
        if (z) {
            this.f19330K = SystemClock.uptimeMillis();
            if (this.f19338f != EnumC7803a.Keyboard) {
                this.f19338f = EnumC7803a.Keyboard;
            }
            C7571c.m15560a("open keyboard");
            this.f19336d = true;
            this.f19323D.setImageResource(2131234468);
            this.f19326G.setVisibility(8);
            C6779a.m14563a().mo13053a(new C7401r(i, true));
        } else if (this.f19338f == EnumC7803a.Panel) {
            this.f19322C.setVisibility(0);
            this.f19323D.setImageResource(2131234469);
            if (this.f19326G.getVisibility() != 0) {
                this.f19326G.setVisibility(0);
                this.f19326G.post(new RunnableC7810bn(this));
            }
            C6779a.m14563a().mo13053a(new C7401r(C3966y.m9667d(R.dimen.wc) + C3966y.m9667d(R.dimen.wd) + C3966y.m9653a(1.0f), true));
        } else {
            C7571c.m15560a("close keyboard");
            if (!LiveCommentInputDialogDismissFixSetting.getValue().f22761a || SystemClock.uptimeMillis() - this.f19330K >= LiveCommentInputDialogDismissFixSetting.getValue().f22762b) {
                mo14062c();
            } else {
                C7571c.m15560a("Unexpected close keyboard");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar
    /* renamed from: b */
    public final void mo14040b() {
        mo14066g();
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f19333a = false;
    }

    /* renamed from: g */
    public final void mo14066g() {
        if (this.f19343k != null) {
            C11278o.m19996b(getContext(), this.f19343k);
        }
    }

    /* renamed from: h */
    private void m15849h() {
        for (AbstractC2713c cVar : this.f19354v) {
            cVar.mo7246c(this.f19341i);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar
    /* renamed from: a */
    public final void mo14034a() {
        C2709b bVar;
        if (isAdded() && !this.f19341i && (bVar = this.f19329J) != null) {
            bVar.mo7234a((List<? extends EmoteModel>) null);
        }
    }

    /* renamed from: c */
    public final void mo14062c() {
        if (this.f19336d) {
            this.f19336d = false;
            this.f19322C.setVisibility(4);
            try {
                dismiss();
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19356x = false;
        BarrageView barrageView = this.f19345m;
        if (barrageView != null) {
            barrageView.clearAnimation();
            this.f19345m = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C3811a keyBoardObservable = this.f19322C.getKeyBoardObservable();
        if (keyBoardObservable.f10541b != null) {
            keyBoardObservable.f10541b.remove(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bg$a */
    public enum EnumC7803a {
        Keyboard,
        Panel,
        Close;

        static {
            Covode.recordClassIndex(8598);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14063d() {
        if (isAdded()) {
            if (this.f19341i) {
                this.f19343k.setText("");
                this.f19344l.setText(R.string.e_g);
                this.f19343k.setEnabled(false);
                return;
            }
            this.f19343k.setText(this.f19342j);
            if (!TextUtils.isEmpty(this.f19342j) && !C6229a.m13521a(getContext())) {
                this.f19343k.setSelection(this.f19342j.length());
            }
            this.f19343k.setTextSize(1, 17.0f);
            if (this.f19340h) {
                this.f19344l.setText(R.string.gjl);
            } else {
                this.f19344l.setText(R.string.e6l);
            }
            this.f19343k.setEnabled(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14065f() {
        AbstractC2713c cVar;
        MethodCollector.m26663i(10611);
        this.f19327H.removeAllViews();
        if (this.f19338f != EnumC7803a.Panel || (cVar = this.f19349q) == null) {
            this.f19327H.setVisibility(8);
            this.f19328I.setVisibility(0);
            this.f19343k.requestFocus();
            MethodCollector.m26664o(10611);
            return;
        }
        View c = cVar.mo7245c(this.f19327H);
        if (c != null) {
            this.f19327H.addView(c, -1, -1);
            this.f19327H.setVisibility(0);
            this.f19328I.setVisibility(8);
            MethodCollector.m26664o(10611);
            return;
        }
        this.f19327H.setVisibility(8);
        this.f19328I.setVisibility(0);
        this.f19343k.requestFocus();
        MethodCollector.m26664o(10611);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C3811a keyBoardObservable = this.f19322C.getKeyBoardObservable();
        if (keyBoardObservable.f10541b == null) {
            keyBoardObservable.f10541b = new ArrayList();
        }
        keyBoardObservable.f10541b.add(this);
        if (this.f19356x && this.f19338f == EnumC7803a.Keyboard) {
            this.f19356x = false;
            mo14059a(200, 1, 5);
        } else if (this.f19338f == EnumC7803a.Keyboard) {
            this.f19343k.post(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.RunnableC77995 */

                static {
                    Covode.recordClassIndex(8594);
                }

                public final void run() {
                    try {
                        C7794bg.this.f19343k.requestFocus();
                        C3854a.m9453a(4, "KeyboardAction", "show");
                        C11278o.m19995a(C7794bg.this.getContext(), C7794bg.this.f19343k);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            this.f19343k.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.View$OnFocusChangeListenerC78006 */

                static {
                    Covode.recordClassIndex(8595);
                }

                public final void onFocusChange(View view, boolean z) {
                    view.postDelayed(new Runnable() {
                        /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.View$OnFocusChangeListenerC78006.RunnableC78011 */

                        static {
                            Covode.recordClassIndex(8596);
                        }

                        public final void run() {
                            if (C7794bg.this.isAdded() && C7794bg.this.getContext() != null) {
                                if (C7794bg.this.getActivity() != null) {
                                    C7794bg.this.getActivity().getWindow().setSoftInputMode(48);
                                }
                                if (!C7794bg.this.f19336d) {
                                    C3854a.m9453a(4, "KeyboardAction", "show");
                                    C11278o.m19995a(C7794bg.this.getContext(), C7794bg.this.f19343k);
                                }
                            }
                        }
                    }, 100);
                    C7794bg.this.f19343k.setOnFocusChangeListener(null);
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo14064e() {
        AbstractC7766ar.AbstractC7768b bVar = this.f19334b;
        if (bVar != null) {
            bVar.mo14044a();
        }
        if (!C11115u.m19743a().mo17915b().mo13165e()) {
            if (getActivity() == null) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.giy);
                return;
            }
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            ActivityC0945e activity = getActivity();
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C3966y.m9657a((int) R.string.gss);
            a.f17235d = "comment_live";
            a.f17234c = 1000;
            b.mo13149a(activity, a.mo13173a()).mo143062b(new C6873g());
        } else if (!C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.COMMENT)) {
            if (this.f19340h && ((IHostContext) C6193a.m13435a(IHostContext.class)).isNeedProtectMinor()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gq8);
            } else if (this.f19334b != null && this.f19343k.getText() != null) {
                String obj = this.f19343k.getText().toString();
                for (int i = 0; i < obj.length(); i++) {
                    if (!Character.isWhitespace(obj.charAt(i))) {
                        if (obj.length() > 0) {
                            this.f19334b.mo14046a(obj, this.f19340h, this.f19351s);
                            this.f19351s = 0;
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar
    /* renamed from: a */
    public final void mo14036a(AbstractC7766ar.AbstractC7768b bVar) {
        this.f19334b = bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f19356x = this.f19336d;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    /* renamed from: a */
    public final void mo14058a(int i) {
        AbstractC2713c cVar = this.f19354v.get(i);
        this.f19349q = cVar;
        for (int i2 = 0; i2 < this.f19354v.size(); i2++) {
            if (i2 != i) {
                this.f19354v.get(i2).mo7247d(false);
            }
        }
        cVar.mo7247d(true);
        mo14060a(cVar);
        mo14065f();
    }

    /* renamed from: b */
    public final void mo14061b(boolean z) {
        if (z) {
            this.f19324E.setImageResource(2131234719);
            C0820e.m2895a(this.f19324E, (ColorStateList) null);
            return;
        }
        this.f19324E.setImageResource(2131234718);
        ImageView imageView = this.f19324E;
        C0820e.m2895a(imageView, ColorStateList.valueOf(C4079b.m9889a(imageView, (int) R.attr.am9)));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19333a = true;
        setStyle(1, R.style.a2s);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.f19340h = arguments.getBoolean("live.intent.extra.DANMU_OPEN", false);
        this.f19357y = arguments.getBoolean("live.intent.extra.IS_BROADCASTER", false);
        this.f19341i = arguments.getBoolean("live.intent.extra.USER_BANNED", false);
        this.f19358z = arguments.getBoolean("live.intent.extra.USER_BANNED_WHOLE_LIVE", false);
        this.f19342j = arguments.getString("live.intent.extra.INPUT", "");
        this.f19320A = arguments.getBoolean("live.inter.extra.CAN_DANMU", true);
        this.f19321B = arguments.getBoolean("live.inter.extra.IS_OFFICIAL", false);
        LiveInputDialogAnimationSetting.INSTANCE.setDisable(this.f19357y);
        int i = arguments.getInt("live.intent.extra.INPUT_MODE", 0);
        this.f19355w = i;
        if (i == 2) {
            this.f19338f = EnumC7803a.Panel;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(32);
            if (!LiveInputDialogAnimationSetting.INSTANCE.hasAnimation() || Build.VERSION.SDK_INT < 30) {
                window.setSoftInputMode(3);
            } else {
                window.setSoftInputMode(19);
            }
            if ((getActivity() != null && getActivity().getRequestedOrientation() == 0) || (!this.f19357y && !C3931d.m9571a(getActivity()))) {
                window.addFlags(1024);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        C7571c.m15560a("Dialog onDismiss");
        C8774g.m17073a().mo15046c();
        C6779a.m14563a().mo13053a(new C7401r(0, false));
        super.onDismiss(dialogInterface);
        if (this.f19334b != null) {
            C7686f fVar = new C7686f();
            fVar.f19037b = this.f19357y;
            fVar.f19038c = this.f19341i;
            fVar.f19039d = this.f19358z;
            fVar.f19036a = this.f19340h;
            fVar.f19040e = this.f19342j;
            fVar.f19041f = this.f19320A;
            C2709b bVar = this.f19329J;
            if (bVar != null) {
                fVar.mo13912a(bVar.f8088b);
            }
            this.f19334b.mo14045a(fVar);
            this.f19334b = null;
            this.f19336d = false;
        }
        this.f19352t = false;
    }

    /* renamed from: a */
    public final void mo14060a(AbstractC2713c cVar) {
        this.f19348p.setText(cVar.mo7226b());
        this.f19348p.setEnabled(!cVar.mo7228d());
        ViewGroup.LayoutParams layoutParams = this.f19348p.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = cVar.f8106i;
            this.f19348p.setLayoutParams(layoutParams);
        }
        mo14061b(cVar.mo7228d());
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar
    /* renamed from: a */
    public final void mo14037a(C8448b bVar) {
        if (isAdded()) {
            if (this.f19341i && bVar.f20888a) {
                return;
            }
            if (this.f19341i || bVar.f20888a) {
                this.f19341i = bVar.f20888a;
                this.f19358z = bVar.f20889b;
                mo14063d();
                m15849h();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar
    /* renamed from: a */
    public final void mo14038a(String str) {
        if (isAdded() && !this.f19341i) {
            this.f19342j = str;
            mo14063d();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar
    /* renamed from: a */
    public final void mo14039a(boolean z) {
        if (isAdded() && !this.f19341i) {
            if (this.f19340h) {
                if (z) {
                    return;
                }
            } else if (!z) {
                return;
            }
            this.f19340h = z;
            if (z) {
                this.f19345m.mo18139a(true);
            } else {
                this.f19345m.mo18138a();
            }
            mo14063d();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar
    /* renamed from: a */
    public final void mo14035a(Activity activity, String str) {
        show(((ActivityC0945e) activity).getSupportFragmentManager(), str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void show(AbstractC0952i iVar, String str) {
        C8774g.m17073a().mo15045b();
        super.show(iVar, str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void showNow(AbstractC0952i iVar, String str) {
        C8774g.m17073a().mo15045b();
        super.showNow(iVar, str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        Bundle arguments;
        String str;
        super.onViewCreated(view, bundle);
        this.f19343k.addTextChangedListener(this.f19332M);
        this.f19345m.setOnClickListener(this.f19331L);
        this.f19323D.setOnClickListener(this.f19331L);
        if (this.f19321B) {
            C13628n.m24510a(this.f19345m, 8);
        }
        boolean z2 = true;
        if (!((AbstractC11799c) C6193a.m13435a(AbstractC11799c.class)).mo18861b() || this.f19355w == 2) {
            i = 0;
        } else {
            i = 1;
        }
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            if (C89219l.m154714a(a.mo28318b(C9036bc.class), (Object) true)) {
                str = "chat_room";
            } else {
                str = "bubble";
            }
            C6501b a2 = C6501b.C6502a.m13948a("livesdk_comment_pannel_show");
            a2.mo12643a(a);
            a2.mo12645a("is_emoji", i);
            a2.mo12651a("comment_pannel_type", str);
            C7569b.m15556a(a2);
            C7569b.m15557a(a2, a);
            a2.mo12655b();
        }
        Context context = view.getContext();
        C2707a aVar = new C2707a(context);
        this.f19350r = aVar;
        AbstractC7766ar.AbstractC7767a aVar2 = this.f19335c;
        if (aVar2 == null || aVar2.mo14042a()) {
            z = true;
        } else {
            z = false;
        }
        aVar.f8104g = z;
        C2707a aVar3 = this.f19350r;
        C2707a.AbstractC2708a aVar4 = this.f19353u;
        aVar3.f8086a = aVar4;
        aVar3.mo7232a(aVar4);
        if (this.f19355w != 2) {
            this.f19354v.add(this.f19350r);
            this.f19323D.setVisibility(0);
        } else {
            this.f19323D.setVisibility(8);
        }
        if (this.f19355w != 1) {
            C2709b bVar = new C2709b(context);
            this.f19329J = bVar;
            AbstractC7766ar.AbstractC7767a aVar5 = this.f19335c;
            if (aVar5 != null && !aVar5.mo14042a()) {
                z2 = false;
            }
            bVar.f8104g = z2;
            C2709b bVar2 = this.f19329J;
            C77984 r0 = new C2709b.AbstractC2710a() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.C77984 */

                static {
                    Covode.recordClassIndex(8593);
                }

                @Override // com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a
                /* renamed from: a */
                public final void mo7240a(C2972a aVar) {
                }

                @Override // com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a
                /* renamed from: b_ */
                public final void mo7242b_() {
                }

                @Override // com.bytedance.android.p147c.p148a.AbstractC2713c.AbstractC2714a
                /* renamed from: a_ */
                public final void mo7241a_() {
                    C7794bg.this.mo14040b();
                }

                @Override // com.bytedance.android.p147c.p148a.AbstractC2713c.AbstractC2714a
                /* renamed from: a */
                public final void mo7239a(AbstractC2713c cVar) {
                    if (cVar == C7794bg.this.f19349q) {
                        C7794bg.this.mo14060a(cVar);
                    }
                }

                @Override // com.bytedance.android.p147c.p148a.C2709b.AbstractC2710a
                /* renamed from: a */
                public final void mo7238a(List<? extends EmoteModel> list) {
                    if (C7794bg.this.f19334b != null) {
                        C7794bg.this.f19334b.mo14047a(list);
                    }
                }
            };
            bVar2.f8090d = r0;
            bVar2.mo7232a(r0);
            this.f19354v.add(this.f19329J);
        }
        m15849h();
        mo14063d();
        if (!this.f19341i && this.f19340h) {
            this.f19345m.mo18139a(false);
        }
        this.f19345m.setVisibility(8);
        if (this.f19329J != null && (arguments = getArguments()) != null) {
            this.f19329J.mo7234a(arguments.getParcelableArrayList("live.intent.extra.EMOTES"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14059a(long j, int i, int i2) {
        CommentEditText commentEditText = this.f19343k;
        if (commentEditText != null && i <= i2) {
            commentEditText.postDelayed(new RunnableC7808bl(this, j, i, i2), j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b8m, viewGroup, false);
        this.f19322C = (MeasureLinearLayout) a;
        boolean z = true;
        if (EnableLiveKeyboardWithHeightSetting.INSTANCE.getValue() && getActivity() != null && getActivity().getRequestedOrientation() == 1) {
            this.f19322C.f10536a = new C3812b();
        }
        KeyboardShadowView keyboardShadowView = (KeyboardShadowView) this.f19322C.findViewById(R.id.fg1);
        this.f19325F = keyboardShadowView;
        keyboardShadowView.setActivity(getActivity());
        KeyboardShadowView keyboardShadowView2 = this.f19325F;
        if (!this.f19357y || (getActivity() != null && getActivity().getRequestedOrientation() == 0)) {
            z = false;
        }
        keyboardShadowView2.setShowStatusBar(z);
        this.f19323D = (ImageView) a.findViewById(R.id.cwt);
        ImageView imageView = (ImageView) a.findViewById(R.id.dvk);
        this.f19324E = imageView;
        imageView.setOnClickListener(new View$OnClickListenerC7805bi(this));
        this.f19345m = (BarrageView) a.findViewById(R.id.qq);
        CommentEditText commentEditText = (CommentEditText) a.findViewById(R.id.ash);
        this.f19343k = commentEditText;
        commentEditText.f19076a.add(new C7806bj(this));
        this.f19343k.addTextChangedListener(this.f19332M);
        this.f19343k.setOnKeyListener(new View$OnKeyListenerC7807bk(this));
        this.f19344l = (TextView) a.findViewById(R.id.asi);
        BarrageView barrageView = this.f19345m;
        if (this.f19320A) {
            i = 0;
        } else {
            i = 8;
        }
        C13628n.m24510a(barrageView, i);
        if (!this.f19320A) {
            this.f19340h = false;
        }
        this.f19326G = (LinearLayout) a.findViewById(R.id.aue);
        this.f19346n = (ViewPager) a.findViewById(R.id.boy);
        this.f19347o = (ViewGroup) a.findViewById(R.id.bow);
        this.f19348p = (LiveButton) a.findViewById(R.id.box);
        this.f19327H = (ViewGroup) a.findViewById(R.id.bov);
        this.f19328I = a.findViewById(R.id.bor);
        if (getDialog() != null) {
            this.f19325F.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.View$OnClickListenerC77973 */

                static {
                    Covode.recordClassIndex(8592);
                }

                public final void onClick(View view) {
                    C7794bg.this.f19338f = EnumC7803a.Close;
                    C7794bg.this.mo14066g();
                    if (C7794bg.this.f19335c != null) {
                        C7794bg.this.f19335c.mo14043b();
                        try {
                            C7794bg.this.mo14062c();
                            C7794bg.this.dismiss();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        return a;
    }
}
