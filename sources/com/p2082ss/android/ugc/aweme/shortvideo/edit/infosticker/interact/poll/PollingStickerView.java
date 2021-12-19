package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74286i;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView */
public final class PollingStickerView extends FrameLayout {

    /* renamed from: a */
    public static final C71227a f159620a = new C71227a((byte) 0);

    /* renamed from: b */
    private final int f159621b = C71812ep.m126783a(73.0d, C63247i.f143610a);

    /* renamed from: c */
    private LinearLayout f159622c;

    /* renamed from: d */
    private HashMap f159623d;

    static {
        Covode.recordClassIndex(83741);
    }

    /* renamed from: b */
    public final View mo112627b(int i) {
        if (this.f159623d == null) {
            this.f159623d = new HashMap();
        }
        View view = (View) this.f159623d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f159623d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView$a */
    public static final class C71227a {
        static {
            Covode.recordClassIndex(83742);
        }

        private C71227a() {
        }

        public /* synthetic */ C71227a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo112628b() {
        PollEditText pollEditText = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText, "");
        pollEditText.setVisibility(0);
        Space space = (Space) mo112627b(R.id.c6f);
        C89219l.m154716b(space, "");
        space.setVisibility(0);
    }

    public final PollStruct getPollStruct() {
        PollStruct pollStruct = new PollStruct();
        PollEditText pollEditText = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText, "");
        pollStruct.setQuestion(String.valueOf(pollEditText.getText()));
        ArrayList arrayList = new ArrayList();
        PollStruct.OptionsBean optionsBean = new PollStruct.OptionsBean();
        PollEditText pollEditText2 = (PollEditText) mo112627b(R.id.ax9);
        C89219l.m154716b(pollEditText2, "");
        optionsBean.setPostOption(String.valueOf(pollEditText2.getText()));
        arrayList.add(optionsBean);
        PollStruct.OptionsBean optionsBean2 = new PollStruct.OptionsBean();
        PollEditText pollEditText3 = (PollEditText) mo112627b(R.id.ax_);
        C89219l.m154716b(pollEditText3, "");
        optionsBean2.setPostOption(String.valueOf(pollEditText3.getText()));
        arrayList.add(optionsBean2);
        pollStruct.setOptions(arrayList);
        return pollStruct;
    }

    /* renamed from: a */
    public final void mo112624a() {
        PollEditText pollEditText = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText, "");
        pollEditText.setVisibility(8);
        Space space = (Space) mo112627b(R.id.c6f);
        C89219l.m154716b(space, "");
        space.setVisibility(8);
        PollEditText pollEditText2 = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText2, "");
        if (!C89361p.m154870a((CharSequence) String.valueOf(pollEditText2.getText()))) {
            PollEditText pollEditText3 = (PollEditText) mo112627b(R.id.axa);
            C89219l.m154716b(pollEditText3, "");
            pollEditText3.setVisibility(0);
            Space space2 = (Space) mo112627b(R.id.c6f);
            C89219l.m154716b(space2, "");
            space2.setVisibility(0);
        }
        PollEditText pollEditText4 = (PollEditText) mo112627b(R.id.ax9);
        C89219l.m154716b(pollEditText4, "");
        Editable text = pollEditText4.getText();
        if (text == null || text.length() == 0) {
            ((PollEditText) mo112627b(R.id.ax9)).setText(R.string.haa);
        }
        PollEditText pollEditText5 = (PollEditText) mo112627b(R.id.ax_);
        C89219l.m154716b(pollEditText5, "");
        Editable text2 = pollEditText5.getText();
        if (text2 == null || text2.length() == 0) {
            ((PollEditText) mo112627b(R.id.ax_)).setText(R.string.hab);
        }
    }

    public final int getLastTouchedIndex() {
        if (((PollEditText) mo112627b(R.id.axa)).f159594a > ((PollEditText) mo112627b(R.id.ax9)).f159594a) {
            if (((PollEditText) mo112627b(R.id.axa)).f159594a >= ((PollEditText) mo112627b(R.id.ax_)).f159594a || System.currentTimeMillis() - ((PollEditText) mo112627b(R.id.ax_)).f159594a >= 1000) {
                return 0;
            }
            return 2;
        } else if (((PollEditText) mo112627b(R.id.ax9)).f159594a > ((PollEditText) mo112627b(R.id.ax_)).f159594a) {
            if (System.currentTimeMillis() - ((PollEditText) mo112627b(R.id.ax9)).f159594a < 1000) {
                return 1;
            }
        } else if (System.currentTimeMillis() - ((PollEditText) mo112627b(R.id.ax_)).f159594a < 1000) {
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    private final void m125859c() {
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bjv, this, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a;
        this.f159622c = linearLayout;
        if (linearLayout == null) {
            C89219l.m154710a("container");
        }
        addView(linearLayout);
        C71243e.f159669a = Math.max(C40979n.m82509d(getContext()) / 4, this.f159621b);
        PollEditText pollEditText = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText, "");
        ((PollEditText) mo112627b(R.id.axa)).addTextChangedListener(new C71229c(pollEditText, (EditText) mo112627b(R.id.ax9)));
        PollEditText pollEditText2 = (PollEditText) mo112627b(R.id.ax9);
        C89219l.m154716b(pollEditText2, "");
        ((PollEditText) mo112627b(R.id.ax9)).addTextChangedListener(new C71228b(pollEditText2, (EditText) mo112627b(R.id.ax_)));
        PollEditText pollEditText3 = (PollEditText) mo112627b(R.id.ax_);
        C89219l.m154716b(pollEditText3, "");
        ((PollEditText) mo112627b(R.id.ax_)).addTextChangedListener(new C71228b(pollEditText3));
        Typeface c = C45989b.m88764a().mo77597c("");
        if (c != null) {
            PollEditText pollEditText4 = (PollEditText) mo112627b(R.id.axa);
            C89219l.m154716b(pollEditText4, "");
            pollEditText4.setTypeface(c);
        }
        C71243e.m125886a((EditText) mo112627b(R.id.axa), 10.0d);
        C71243e.m125886a((EditText) mo112627b(R.id.ax9), 20.0d);
        C71243e.m125886a((EditText) mo112627b(R.id.ax_), 20.0d);
        ((PollEditText) mo112627b(R.id.ax9)).setLayerType(1, null);
        ((PollEditText) mo112627b(R.id.ax_)).setLayerType(1, null);
        PollEditText pollEditText5 = (PollEditText) mo112627b(R.id.ax9);
        C89219l.m154716b(pollEditText5, "");
        C74286i.C74288b.m130698a(pollEditText5, Color.parseColor("#ffffff"), C71812ep.m126783a(22.0d, C63247i.f143610a), Color.parseColor("#3d000000"), C71812ep.m126783a(4.0d, C63247i.f143610a), 0, 0);
        PollEditText pollEditText6 = (PollEditText) mo112627b(R.id.ax_);
        C89219l.m154716b(pollEditText6, "");
        C74286i.C74288b.m130698a(pollEditText6, Color.parseColor("#ffffff"), C71812ep.m126783a(22.0d, C63247i.f143610a), Color.parseColor("#3d000000"), C71812ep.m126783a(4.0d, C63247i.f143610a), 0, 0);
        ((PollEditText) mo112627b(R.id.axa)).setOnKeyListener(View$OnKeyListenerC71230d.f159628a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView$b */
    public static final class C71228b implements TextWatcher {

        /* renamed from: a */
        private final EditText f159624a;

        /* renamed from: b */
        private final EditText f159625b;

        static {
            Covode.recordClassIndex(83743);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public /* synthetic */ C71228b(EditText editText) {
            this(editText, null);
        }

        public final void afterTextChanged(Editable editable) {
            C71243e.m125887a(this.f159624a, 1);
            String valueOf = String.valueOf(editable);
            if (C89361p.m154882a((CharSequence) valueOf, '\r', 0, false, 6) >= 0 || C89361p.m154882a((CharSequence) valueOf, '\n', 0, false, 6) >= 0) {
                this.f159624a.setText(C89361p.m154869a(C89361p.m154869a(valueOf, "\r", "", false), "\n", "", false));
                EditText editText = this.f159624a;
                editText.setSelection(editText.getText().length());
                C71243e.m125889b(this.f159625b);
            }
        }

        public C71228b(EditText editText, EditText editText2) {
            C89219l.m154721d(editText, "");
            this.f159624a = editText;
            this.f159625b = editText2;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C71243e.m125886a(this.f159624a, 20.0d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView$c */
    public static final class C71229c implements TextWatcher {

        /* renamed from: a */
        private final EditText f159626a;

        /* renamed from: b */
        private final EditText f159627b;

        static {
            Covode.recordClassIndex(83744);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            C71243e.m125887a(this.f159626a, C71243e.f159673e);
            C71243e.f159674f = C71243e.m125885a(this.f159626a);
        }

        public C71229c(EditText editText, EditText editText2) {
            C89219l.m154721d(editText, "");
            this.f159626a = editText;
            this.f159627b = editText2;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C71243e.m125886a(this.f159626a, 10.0d);
        }
    }

    /* renamed from: a */
    public final void mo112625a(int i) {
        C71243e.f159673e = i;
        PollEditText pollEditText = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText, "");
        pollEditText.setMaxLines(C71243e.f159673e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollingStickerView(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13868);
        m125859c();
        MethodCollector.m26664o(13868);
    }

    public final void setEditEnable(boolean z) {
        PollEditText pollEditText = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText, "");
        pollEditText.setEnabled(z);
        PollEditText pollEditText2 = (PollEditText) mo112627b(R.id.ax9);
        C89219l.m154716b(pollEditText2, "");
        pollEditText2.setEnabled(z);
        PollEditText pollEditText3 = (PollEditText) mo112627b(R.id.ax_);
        C89219l.m154716b(pollEditText3, "");
        pollEditText3.setEnabled(z);
    }

    public final void setTouchEnable(boolean z) {
        ((PollEditText) mo112627b(R.id.axa)).setMode(z);
        ((PollEditText) mo112627b(R.id.ax9)).setMode(z);
        ((PollEditText) mo112627b(R.id.ax_)).setMode(z);
    }

    /* renamed from: a */
    public final void mo112626a(PollStruct pollStruct) {
        C89219l.m154721d(pollStruct, "");
        ((PollEditText) mo112627b(R.id.axa)).setText(pollStruct.getQuestion());
        PollStruct.OptionsBean optionsBean = pollStruct.getOptions().get(0);
        C89219l.m154716b(optionsBean, "");
        ((PollEditText) mo112627b(R.id.ax9)).setText(optionsBean.getPostOption());
        PollStruct.OptionsBean optionsBean2 = pollStruct.getOptions().get(1);
        C89219l.m154716b(optionsBean2, "");
        ((PollEditText) mo112627b(R.id.ax_)).setText(optionsBean2.getPostOption());
    }

    public final void setEditTextFocusable(int i) {
        PollEditText pollEditText = (PollEditText) mo112627b(R.id.axa);
        C89219l.m154716b(pollEditText, "");
        pollEditText.setVisibility(0);
        Space space = (Space) mo112627b(R.id.c6f);
        C89219l.m154716b(space, "");
        space.setVisibility(0);
        if (i == 0) {
            C71243e.m125889b((EditText) mo112627b(R.id.axa));
        } else if (i == 1) {
            C71243e.m125889b((EditText) mo112627b(R.id.ax9));
        } else if (i == 2) {
            C71243e.m125889b((EditText) mo112627b(R.id.ax_));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollingStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(13869);
        m125859c();
        MethodCollector.m26664o(13869);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView$d */
    public static final class View$OnKeyListenerC71230d implements View.OnKeyListener {

        /* renamed from: a */
        public static final View$OnKeyListenerC71230d f159628a = new View$OnKeyListenerC71230d();

        static {
            Covode.recordClassIndex(83745);
        }

        View$OnKeyListenerC71230d() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (66 != i) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() != 0 || C71243e.f159674f < C71243e.f159673e) {
                return false;
            }
            return true;
        }
    }
}
