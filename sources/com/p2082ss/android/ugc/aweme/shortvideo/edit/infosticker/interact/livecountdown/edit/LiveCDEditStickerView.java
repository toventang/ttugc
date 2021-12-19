package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71167b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71168c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.AbstractC71173a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.DatePicker;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.DialogC71174b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDLinearLayout;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.GregorianCalendar;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView */
public final class LiveCDEditStickerView extends FrameLayout {

    /* renamed from: j */
    static int f159526j = 2;

    /* renamed from: k */
    public static final C71197a f159527k = new C71197a((byte) 0);

    /* renamed from: u */
    private static int f159528u = 200;

    /* renamed from: v */
    private static final int f159529v = C71812ep.m126783a(73.0d, C63247i.f143610a);

    /* renamed from: a */
    public LinearLayout f159530a;

    /* renamed from: b */
    public LiveCDEditText f159531b;

    /* renamed from: c */
    DialogC71174b f159532c;

    /* renamed from: d */
    final C71204b f159533d = new C71204b();

    /* renamed from: e */
    public boolean f159534e;

    /* renamed from: f */
    long f159535f;

    /* renamed from: g */
    long f159536g;

    /* renamed from: h */
    int f159537h = 1;

    /* renamed from: i */
    AbstractC71207d f159538i;

    /* renamed from: l */
    private LiveCDLinearLayout f159539l;

    /* renamed from: m */
    private TuxTextView f159540m;

    /* renamed from: n */
    private TuxTextView f159541n;

    /* renamed from: o */
    private TuxTextView f159542o;

    /* renamed from: p */
    private TuxTextView f159543p;

    /* renamed from: q */
    private TuxTextView f159544q;

    /* renamed from: r */
    private TuxTextView f159545r;

    /* renamed from: s */
    private AbstractC71208e f159546s;

    /* renamed from: t */
    private AbstractC71205c f159547t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView$a */
    public static final class C71197a {
        static {
            Covode.recordClassIndex(83707);
        }

        private C71197a() {
        }

        public /* synthetic */ C71197a(byte b) {
            this();
        }
    }

    public final AbstractC71205c getHintTextStateChanged() {
        return this.f159547t;
    }

    public final AbstractC71207d getLiveCDEditStateListener() {
        return this.f159538i;
    }

    public final AbstractC71208e getLiveCDStickerInterface() {
        return this.f159546s;
    }

    public final long getSelectTimeMiles() {
        return this.f159536g;
    }

    public final int getState() {
        return this.f159537h;
    }

    /* renamed from: f */
    public final void mo112569f() {
        DialogC71174b bVar = this.f159532c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo112566c() {
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        liveCDEditText.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo112567d() {
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        C71209f.m125828b(liveCDEditText);
    }

    public final String getTitleText() {
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        return String.valueOf(liveCDEditText.getText());
    }

    static {
        Covode.recordClassIndex(83706);
    }

    /* renamed from: a */
    public final void mo112562a() {
        Integer valueOf;
        AbstractC71208e eVar;
        AbstractC71208e eVar2 = this.f159546s;
        if (eVar2 != null && (valueOf = Integer.valueOf(eVar2.getHintState())) != null) {
            if ((valueOf.intValue() == 2 || valueOf.intValue() == 3 || valueOf.intValue() == 4) && (eVar = this.f159546s) != null) {
                eVar.mo112531a(-1);
            }
        }
    }

    /* renamed from: b */
    public final void mo112565b() {
        C71204b bVar = this.f159533d;
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        bVar.f159562a = String.valueOf(liveCDEditText.getText());
        this.f159533d.f159563b = this.f159536g;
        this.f159534e = !TextUtils.isEmpty(this.f159533d.f159562a);
    }

    /* renamed from: g */
    public final void mo112570g() {
        InputMethodManager inputMethodManager = (InputMethodManager) m125803a(getContext(), "input_method");
        Context context = getContext();
        C89219l.m154716b(context, "");
        Activity a = C67279a.m119194a(context);
        if (a != null && inputMethodManager != null) {
            Window window = a.getWindow();
            C89219l.m154716b(window, "");
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    public final CountDownStickerStruct getLiveCDStruct() {
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        return new CountDownStickerStruct(String.valueOf(liveCDEditText.getText()), this.f159536g, 0, null, null, null, null, 124, null);
    }

    /* renamed from: e */
    public final boolean mo112568e() {
        if (this.f159536g == 0) {
            return false;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f159536g);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(this.f159535f);
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(5) == gregorianCalendar2.get(5) && gregorianCalendar.get(11) == gregorianCalendar2.get(11) && gregorianCalendar.get(12) == gregorianCalendar2.get(12)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final void m125805h() {
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bjt, this, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a;
        this.f159530a = linearLayout;
        if (linearLayout == null) {
            C89219l.m154710a("container");
        }
        addView(linearLayout);
        LinearLayout linearLayout2 = this.f159530a;
        if (linearLayout2 == null) {
            C89219l.m154710a("container");
        }
        View findViewById = linearLayout2.findViewById(R.id.aqu);
        C89219l.m154716b(findViewById, "");
        this.f159531b = (LiveCDEditText) findViewById;
        LinearLayout linearLayout3 = this.f159530a;
        if (linearLayout3 == null) {
            C89219l.m154710a("container");
        }
        View findViewById2 = linearLayout3.findViewById(R.id.euh);
        C89219l.m154716b(findViewById2, "");
        this.f159540m = (TuxTextView) findViewById2;
        LinearLayout linearLayout4 = this.f159530a;
        if (linearLayout4 == null) {
            C89219l.m154710a("container");
        }
        View findViewById3 = linearLayout4.findViewById(R.id.euj);
        C89219l.m154716b(findViewById3, "");
        this.f159541n = (TuxTextView) findViewById3;
        LinearLayout linearLayout5 = this.f159530a;
        if (linearLayout5 == null) {
            C89219l.m154710a("container");
        }
        View findViewById4 = linearLayout5.findViewById(R.id.eul);
        C89219l.m154716b(findViewById4, "");
        this.f159542o = (TuxTextView) findViewById4;
        TuxTextView tuxTextView = this.f159540m;
        if (tuxTextView == null) {
            C89219l.m154710a("tvCountDownFirst");
        }
        tuxTextView.mo37697a(32.0f);
        TuxTextView tuxTextView2 = this.f159541n;
        if (tuxTextView2 == null) {
            C89219l.m154710a("tvCountDownSecond");
        }
        tuxTextView2.mo37697a(32.0f);
        TuxTextView tuxTextView3 = this.f159542o;
        if (tuxTextView3 == null) {
            C89219l.m154710a("tvCountDownThird");
        }
        tuxTextView3.mo37697a(32.0f);
        LinearLayout linearLayout6 = this.f159530a;
        if (linearLayout6 == null) {
            C89219l.m154710a("container");
        }
        View findViewById5 = linearLayout6.findViewById(R.id.eui);
        C89219l.m154716b(findViewById5, "");
        this.f159543p = (TuxTextView) findViewById5;
        LinearLayout linearLayout7 = this.f159530a;
        if (linearLayout7 == null) {
            C89219l.m154710a("container");
        }
        View findViewById6 = linearLayout7.findViewById(R.id.euk);
        C89219l.m154716b(findViewById6, "");
        this.f159544q = (TuxTextView) findViewById6;
        LinearLayout linearLayout8 = this.f159530a;
        if (linearLayout8 == null) {
            C89219l.m154710a("container");
        }
        View findViewById7 = linearLayout8.findViewById(R.id.eum);
        C89219l.m154716b(findViewById7, "");
        this.f159545r = (TuxTextView) findViewById7;
        mo112564a("0", "0", "0", "0", true);
        LinearLayout linearLayout9 = this.f159530a;
        if (linearLayout9 == null) {
            C89219l.m154710a("container");
        }
        View findViewById8 = linearLayout9.findViewById(R.id.cct);
        C89219l.m154716b(findViewById8, "");
        LiveCDLinearLayout liveCDLinearLayout = (LiveCDLinearLayout) findViewById8;
        this.f159539l = liveCDLinearLayout;
        if (liveCDLinearLayout == null) {
            C89219l.m154710a("llCountDown");
        }
        liveCDLinearLayout.setOnClickListener(new C71199c(this));
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        LiveCDEditText liveCDEditText2 = this.f159531b;
        if (liveCDEditText2 == null) {
            C89219l.m154710a("edLiveTitle");
        }
        liveCDEditText.addTextChangedListener(new C71198b(liveCDEditText2, this));
        f159528u = Math.max(C70636dh.m124836e(getContext()) / 4, f159529v);
        LiveCDEditText liveCDEditText3 = this.f159531b;
        if (liveCDEditText3 == null) {
            C89219l.m154710a("edLiveTitle");
        }
        C71209f.m125828b(liveCDEditText3);
    }

    public final void setEditCurrentSticker(boolean z) {
        this.f159534e = z;
    }

    public final void setHintTextStateChanged(AbstractC71205c cVar) {
        this.f159547t = cVar;
    }

    public final void setLiveCDEditStateListener(AbstractC71207d dVar) {
        this.f159538i = dVar;
    }

    public final void setLiveCDStickerInterface(AbstractC71208e eVar) {
        this.f159546s = eVar;
    }

    public final void setSelectTimeMiles(long j) {
        this.f159536g = j;
    }

    public final void setState(int i) {
        this.f159537h = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView$c */
    public static final class C71199c extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerView f159551a;

        static {
            Covode.recordClassIndex(83709);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71199c(LiveCDEditStickerView liveCDEditStickerView) {
            this.f159551a = liveCDEditStickerView;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            AbstractC71205c hintTextStateChanged = this.f159551a.getHintTextStateChanged();
            if (hintTextStateChanged != null) {
                hintTextStateChanged.mo112555a();
            }
            LiveCDEditStickerView liveCDEditStickerView = this.f159551a;
            liveCDEditStickerView.f159537h = 2;
            LiveCDEditText liveCDEditText = liveCDEditStickerView.f159531b;
            if (liveCDEditText == null) {
                C89219l.m154710a("edLiveTitle");
            }
            liveCDEditText.clearFocus();
            liveCDEditStickerView.mo112570g();
            liveCDEditStickerView.f159535f = System.currentTimeMillis();
            liveCDEditStickerView.f159532c = new DialogC71174b(liveCDEditStickerView.getContext(), liveCDEditStickerView.f159535f);
            DialogC71174b bVar = liveCDEditStickerView.f159532c;
            if (bVar != null) {
                bVar.f159463b = liveCDEditStickerView.f159536g;
            }
            DialogC71174b bVar2 = liveCDEditStickerView.f159532c;
            if (bVar2 != null) {
                bVar2.f159462a = new C71200d(bVar2, liveCDEditStickerView);
                bVar2.show();
            }
            DialogC71174b bVar3 = liveCDEditStickerView.f159532c;
            if (bVar3 != null) {
                C71202e eVar = new C71202e(liveCDEditStickerView);
                C89219l.m154721d(eVar, "");
                DatePicker b = bVar3.mo9590b();
                if (b != null) {
                    b.setDateChangedListener(eVar);
                }
            }
            this.f159551a.mo112562a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView$e */
    public static final class C71202e implements AbstractC71173a {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerView f159555a;

        static {
            Covode.recordClassIndex(83712);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71202e(LiveCDEditStickerView liveCDEditStickerView) {
            this.f159555a = liveCDEditStickerView;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.AbstractC71173a
        /* renamed from: a */
        public final void mo112522a(String str, String str2, String str3, String str4, long j) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            this.f159555a.setSelectTimeMiles(j);
            this.f159555a.mo112564a(str, str2, str3, str4, false);
            AbstractC71207d liveCDEditStateListener = this.f159555a.getLiveCDEditStateListener();
            if (liveCDEditStateListener != null) {
                liveCDEditStateListener.mo112558a(String.valueOf(LiveCDEditStickerView.m125802a(this.f159555a).getText()));
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LiveCDEditText m125802a(LiveCDEditStickerView liveCDEditStickerView) {
        LiveCDEditText liveCDEditText = liveCDEditStickerView.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        return liveCDEditText;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCDEditStickerView(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13273);
        m125805h();
        MethodCollector.m26664o(13273);
    }

    /* renamed from: a */
    private static String m125804a(String str) {
        if (Integer.parseInt(str) < 10) {
            return "0".concat(String.valueOf(str));
        }
        return str;
    }

    public final void setEditEnable(boolean z) {
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        liveCDEditText.setEnabled(z);
        LiveCDLinearLayout liveCDLinearLayout = this.f159539l;
        if (liveCDLinearLayout == null) {
            C89219l.m154710a("llCountDown");
        }
        liveCDLinearLayout.setEnabled(z);
    }

    public final void setTouchEnable(boolean z) {
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        liveCDEditText.setMode(z);
        LiveCDLinearLayout liveCDLinearLayout = this.f159539l;
        if (liveCDLinearLayout == null) {
            C89219l.m154710a("llCountDown");
        }
        liveCDLinearLayout.setMode(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView$d */
    public static final class C71200d implements DialogC71174b.AbstractC71175a {

        /* renamed from: a */
        final /* synthetic */ DialogC71174b f159552a;

        /* renamed from: b */
        final /* synthetic */ LiveCDEditStickerView f159553b;

        static {
            Covode.recordClassIndex(83710);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.DialogC71174b.AbstractC71175a
        /* renamed from: a */
        public final void mo112524a(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            if (C71210g.m125830a(LiveCDEditStickerView.m125802a(this.f159553b), (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                C71209f.m125828b(LiveCDEditStickerView.m125802a(this.f159553b));
                this.f159553b.setState(1);
                this.f159552a.dismiss();
                LinearLayout linearLayout = this.f159553b.f159530a;
                if (linearLayout == null) {
                    C89219l.m154710a("container");
                }
                linearLayout.postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView.C71200d.RunnableC712011 */

                    /* renamed from: a */
                    final /* synthetic */ C71200d f159554a;

                    static {
                        Covode.recordClassIndex(83711);
                    }

                    {
                        this.f159554a = r1;
                    }

                    public final void run() {
                        LiveCDEditText a = LiveCDEditStickerView.m125802a(this.f159554a.f159553b);
                        Context context = LiveCDEditStickerView.m125802a(this.f159554a.f159553b).getContext();
                        C89219l.m154716b(context, "");
                        C89219l.m154721d(context, "");
                        Object a2 = LiveCDEditStickerView.m125803a(context, "input_method");
                        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        InputMethodManager inputMethodManager = (InputMethodManager) a2;
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(a, 2);
                        }
                    }
                }, 200);
                this.f159553b.mo112562a();
                return;
            }
            AbstractC71208e liveCDStickerInterface = this.f159553b.getLiveCDStickerInterface();
            if (liveCDStickerInterface != null) {
                liveCDStickerInterface.mo112535a(motionEvent);
            }
        }

        C71200d(DialogC71174b bVar, LiveCDEditStickerView liveCDEditStickerView) {
            this.f159552a = bVar;
            this.f159553b = liveCDEditStickerView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView$b */
    public static final class C71198b implements TextWatcher {

        /* renamed from: a */
        private final EditText f159548a;

        /* renamed from: b */
        private final EditText f159549b = null;

        /* renamed from: c */
        private final LiveCDEditStickerView f159550c;

        static {
            Covode.recordClassIndex(83708);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            Editable text;
            EditText editText = this.f159548a;
            if (!(editText == null || (text = editText.getText()) == null || text.length() == 0 || C71209f.m125825a(editText) <= 2)) {
                String obj = editText.getText().toString();
                if (obj.length() >= 100) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    obj = obj.substring(0, 100);
                    C89219l.m154716b(obj, "");
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(0, obj.length() - 1);
                C89219l.m154716b(substring, "");
                int length = substring.length() - 1;
                while (length >= 0 && Character.isHighSurrogate(substring.charAt(length))) {
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    substring = substring.substring(0, length);
                    C89219l.m154716b(substring, "");
                    length--;
                }
                editText.setText(substring);
                editText.setSelection(editText.getText().length());
            }
            String valueOf = String.valueOf(editable);
            if (C89361p.m154882a((CharSequence) valueOf, '\r', 0, false, 6) >= 0 || C89361p.m154882a((CharSequence) valueOf, '\n', 0, false, 6) >= 0) {
                this.f159548a.setText(C89361p.m154868a(C89361p.m154868a(valueOf, "\r", ""), "\n", ""));
                EditText editText2 = this.f159548a;
                editText2.setSelection(editText2.getText().length());
                C71209f.m125828b(this.f159549b);
            }
            AbstractC71205c hintTextStateChanged = this.f159550c.getHintTextStateChanged();
            if (hintTextStateChanged != null) {
                hintTextStateChanged.mo112556b();
            }
            AbstractC71207d liveCDEditStateListener = this.f159550c.getLiveCDEditStateListener();
            if (liveCDEditStateListener != null) {
                String obj2 = this.f159548a.getText().toString();
                this.f159550c.getSelectTimeMiles();
                liveCDEditStateListener.mo112558a(obj2);
            }
            this.f159550c.mo112562a();
        }

        public C71198b(EditText editText, LiveCDEditStickerView liveCDEditStickerView) {
            C89219l.m154721d(editText, "");
            C89219l.m154721d(liveCDEditStickerView, "");
            this.f159548a = editText;
            this.f159550c = liveCDEditStickerView;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText = this.f159548a;
            if (editText != null) {
                if (!TextUtils.isEmpty(editText.getText().toString()) || editText.getHint() == null) {
                    editText.setGravity(17);
                    C71209f.m125827a(editText, C71812ep.m126783a(0.0d, C63247i.f143610a), C71812ep.m126783a(0.0d, C63247i.f143610a));
                    return;
                }
                Paint paint = new Paint();
                paint.setTextSize(editText.getTextSize());
                paint.setTypeface(editText.getTypeface());
                int measureText = (int) ((((float) editText.getLayoutParams().width) - paint.measureText(editText.getHint().toString())) / 2.0f);
                if (measureText < 0) {
                    C71209f.m125827a(editText, 0, 0);
                    editText.setGravity(8388659);
                    return;
                }
                C71209f.m125827a(editText, measureText, 0);
                editText.setGravity(8388627);
            }
        }
    }

    /* renamed from: a */
    public final void mo112563a(CountDownStickerStruct countDownStickerStruct) {
        long j;
        String str = "";
        C89219l.m154721d(countDownStickerStruct, str);
        LiveCDEditText liveCDEditText = this.f159531b;
        if (liveCDEditText == null) {
            C89219l.m154710a("edLiveTitle");
        }
        String title = countDownStickerStruct.getTitle();
        if (title != null) {
            str = title;
        }
        liveCDEditText.setText(str);
        Long expiredTime = countDownStickerStruct.getExpiredTime();
        if (expiredTime != null) {
            j = expiredTime.longValue();
        } else {
            j = 0;
        }
        this.f159536g = j;
        C71167b a = C71168c.m125750a(j, System.currentTimeMillis());
        mo112564a(a.f159414a, a.f159415b, a.f159416c, a.f159417d, false);
        AbstractC71207d dVar = this.f159538i;
        if (dVar != null) {
            LiveCDEditText liveCDEditText2 = this.f159531b;
            if (liveCDEditText2 == null) {
                C89219l.m154710a("edLiveTitle");
            }
            dVar.mo112558a(String.valueOf(liveCDEditText2.getText()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCDEditStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(13332);
        m125805h();
        MethodCollector.m26664o(13332);
    }

    /* renamed from: a */
    public static Object m125803a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13270);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(13270);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo112564a(String str, String str2, String str3, String str4, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        if (z) {
            TuxTextView tuxTextView = this.f159540m;
            if (tuxTextView == null) {
                C89219l.m154710a("tvCountDownFirst");
            }
            tuxTextView.setText(m125804a(str2));
            TuxTextView tuxTextView2 = this.f159541n;
            if (tuxTextView2 == null) {
                C89219l.m154710a("tvCountDownSecond");
            }
            tuxTextView2.setText(m125804a(str3));
            TuxTextView tuxTextView3 = this.f159542o;
            if (tuxTextView3 == null) {
                C89219l.m154710a("tvCountDownThird");
            }
            tuxTextView3.setText(m125804a(str4));
            TuxTextView tuxTextView4 = this.f159543p;
            if (tuxTextView4 == null) {
                C89219l.m154710a("tvCountDownFirstHint");
            }
            tuxTextView4.setVisibility(4);
            TuxTextView tuxTextView5 = this.f159544q;
            if (tuxTextView5 == null) {
                C89219l.m154710a("tvCountDownSecondHint");
            }
            tuxTextView5.setVisibility(4);
            TuxTextView tuxTextView6 = this.f159545r;
            if (tuxTextView6 == null) {
                C89219l.m154710a("tvCountDownThirdHint");
            }
            tuxTextView6.setVisibility(4);
            return;
        }
        TuxTextView tuxTextView7 = this.f159543p;
        if (tuxTextView7 == null) {
            C89219l.m154710a("tvCountDownFirstHint");
        }
        tuxTextView7.setVisibility(0);
        TuxTextView tuxTextView8 = this.f159544q;
        if (tuxTextView8 == null) {
            C89219l.m154710a("tvCountDownSecondHint");
        }
        tuxTextView8.setVisibility(0);
        TuxTextView tuxTextView9 = this.f159545r;
        if (tuxTextView9 == null) {
            C89219l.m154710a("tvCountDownThirdHint");
        }
        tuxTextView9.setVisibility(0);
        if (Integer.parseInt(str) == 0) {
            TuxTextView tuxTextView10 = this.f159543p;
            if (tuxTextView10 == null) {
                C89219l.m154710a("tvCountDownFirstHint");
            }
            Context context = getContext();
            C89219l.m154716b(context, "");
            tuxTextView10.setText(context.getResources().getText(R.string.auw));
            TuxTextView tuxTextView11 = this.f159544q;
            if (tuxTextView11 == null) {
                C89219l.m154710a("tvCountDownSecondHint");
            }
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            tuxTextView11.setText(context2.getResources().getText(R.string.auy));
            TuxTextView tuxTextView12 = this.f159545r;
            if (tuxTextView12 == null) {
                C89219l.m154710a("tvCountDownThirdHint");
            }
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            tuxTextView12.setText(context3.getResources().getText(R.string.av3));
            TuxTextView tuxTextView13 = this.f159540m;
            if (tuxTextView13 == null) {
                C89219l.m154710a("tvCountDownFirst");
            }
            tuxTextView13.setText(m125804a(str2));
            TuxTextView tuxTextView14 = this.f159541n;
            if (tuxTextView14 == null) {
                C89219l.m154710a("tvCountDownSecond");
            }
            tuxTextView14.setText(m125804a(str3));
            TuxTextView tuxTextView15 = this.f159542o;
            if (tuxTextView15 == null) {
                C89219l.m154710a("tvCountDownThird");
            }
            tuxTextView15.setText(m125804a(str4));
            return;
        }
        TuxTextView tuxTextView16 = this.f159543p;
        if (tuxTextView16 == null) {
            C89219l.m154710a("tvCountDownFirstHint");
        }
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        tuxTextView16.setText(context4.getResources().getText(R.string.aum));
        TuxTextView tuxTextView17 = this.f159544q;
        if (tuxTextView17 == null) {
            C89219l.m154710a("tvCountDownSecondHint");
        }
        Context context5 = getContext();
        C89219l.m154716b(context5, "");
        tuxTextView17.setText(context5.getResources().getText(R.string.auw));
        TuxTextView tuxTextView18 = this.f159545r;
        if (tuxTextView18 == null) {
            C89219l.m154710a("tvCountDownThirdHint");
        }
        Context context6 = getContext();
        C89219l.m154716b(context6, "");
        tuxTextView18.setText(context6.getResources().getText(R.string.auy));
        TuxTextView tuxTextView19 = this.f159540m;
        if (tuxTextView19 == null) {
            C89219l.m154710a("tvCountDownFirst");
        }
        tuxTextView19.setText(m125804a(str));
        TuxTextView tuxTextView20 = this.f159541n;
        if (tuxTextView20 == null) {
            C89219l.m154710a("tvCountDownSecond");
        }
        tuxTextView20.setText(m125804a(str2));
        TuxTextView tuxTextView21 = this.f159542o;
        if (tuxTextView21 == null) {
            C89219l.m154710a("tvCountDownThird");
        }
        tuxTextView21.setText(m125804a(str3));
    }
}
