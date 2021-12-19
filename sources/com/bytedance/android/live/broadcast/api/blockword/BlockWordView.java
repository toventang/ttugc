package com.bytedance.android.live.broadcast.api.blockword;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.blockword.C3034a;
import com.bytedance.android.live.broadcast.api.blockword.model.C3043a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class BlockWordView extends FrameLayout implements C3034a.AbstractC3035a {

    /* renamed from: e */
    public static final C3027a f8844e = new C3027a((byte) 0);

    /* renamed from: a */
    public final C3034a f8845a;

    /* renamed from: b */
    InputFilter.LengthFilter f8846b;

    /* renamed from: c */
    public int f8847c;

    /* renamed from: d */
    public boolean f8848d;

    /* renamed from: f */
    private long f8849f;

    /* renamed from: g */
    private final TextWatcher f8850g;

    /* renamed from: h */
    private final TextView.OnEditorActionListener f8851h;

    /* renamed from: i */
    private HashMap f8852i;

    static {
        Covode.recordClassIndex(3503);
    }

    public BlockWordView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo8249a(int i) {
        if (this.f8852i == null) {
            this.f8852i = new HashMap();
        }
        View view = (View) this.f8852i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f8852i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.C3034a.AbstractC3035a
    /* renamed from: b */
    public final void mo8258b(Throwable th) {
        C89219l.m154721d(th, "");
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.C3034a.AbstractC3035a
    /* renamed from: c */
    public final void mo8259c(Throwable th) {
        C89219l.m154721d(th, "");
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.BlockWordView$a */
    public static final class C3027a {
        static {
            Covode.recordClassIndex(3504);
        }

        private C3027a() {
        }

        public /* synthetic */ C3027a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo8256a(boolean z, String str, long j, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C3034a aVar = this.f8845a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        aVar.f8867c = z;
        aVar.f8868d = str;
        aVar.f8869e = j;
        aVar.f8866b = str2;
        C3034a aVar2 = this.f8845a;
        aVar2.f8865a.getBlockWord(aVar2.f8868d.toString(), aVar2.f8869e).mo143271a(new C11191f()).mo143254a(new C3034a.C3040f(aVar2), new C3034a.C3041g(aVar2));
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.BlockWordView$c */
    static final class C3029c implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ BlockWordView f8854a;

        /* renamed from: b */
        final /* synthetic */ Context f8855b;

        static {
            Covode.recordClassIndex(3506);
        }

        C3029c(BlockWordView blockWordView, Context context) {
            this.f8854a = blockWordView;
            this.f8855b = context;
        }

        /* renamed from: a */
        private static boolean m8348a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            if (i != 4) {
                return false;
            }
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m8348a();
            }
            if (!C58029j.f132253e) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
                return false;
            }
            C89219l.m154716b(textView, "");
            String obj = textView.getText().toString();
            if (C89361p.m154870a((CharSequence) obj)) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8r);
                return false;
            }
            C3034a aVar = this.f8854a.f8845a;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            C3043a aVar2 = new C3043a(C89361p.m154910b((CharSequence) obj).toString());
            C89219l.m154721d(aVar2, "");
            C6501b a = C6501b.C6502a.m13948a("livesdk_tns_add_keywords");
            String str2 = aVar.f8866b;
            if (str2 == null) {
                C89219l.m154710a("eventPage");
            }
            C6501b a2 = a.mo12658d(str2).mo12651a("keyword", aVar2.f8884b).mo12646a("timestamp", System.currentTimeMillis());
            if (aVar.f8867c) {
                str = "host";
            } else {
                str = "moderator";
            }
            a2.mo12651a("modified_by", str).mo12655b();
            aVar.f8865a.addBlockWord(aVar2.f8884b, aVar.f8868d, aVar.f8869e).mo143271a(new C11191f()).mo143254a(new C3034a.C3036b(aVar, aVar2), new C3034a.C3037c(aVar, aVar2));
            textView.setText("");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.BlockWordView$e */
    public static final class RunnableC3031e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockWordView f8857a;

        /* renamed from: b */
        final /* synthetic */ EditText f8858b;

        /* renamed from: c */
        final /* synthetic */ long f8859c;

        /* renamed from: d */
        final /* synthetic */ int f8860d;

        /* renamed from: e */
        final /* synthetic */ int f8861e;

        static {
            Covode.recordClassIndex(3508);
        }

        RunnableC3031e(BlockWordView blockWordView, EditText editText, long j, int i, int i2) {
            this.f8857a = blockWordView;
            this.f8858b = editText;
            this.f8859c = j;
            this.f8860d = i;
            this.f8861e = i2;
        }

        public final void run() {
            if (!this.f8857a.f8848d) {
                C11279p.m20003a(this.f8858b);
                this.f8857a.mo8251a(this.f8858b, this.f8859c, this.f8860d + 1, this.f8861e);
            }
        }
    }

    /* renamed from: a */
    public final void mo8250a() {
        if (this.f8848d) {
            LiveEditText liveEditText = (LiveEditText) mo8249a(R.id.t8);
            C89219l.m154716b(liveEditText, "");
            C11279p.m20016b((EditText) liveEditText);
        }
    }

    /* renamed from: b */
    private final void m8336b() {
        int i;
        int size = ((BlockWordFlowLayout) mo8249a(R.id.b65)).getSize();
        LiveTextView liveTextView = (LiveTextView) mo8249a(R.id.ta);
        C89219l.m154716b(liveTextView, "");
        boolean z = false;
        liveTextView.setText(C3966y.m9660a((int) R.string.e7b, Integer.valueOf(size), Long.valueOf(this.f8849f)));
        if (((long) size) >= this.f8849f) {
            z = true;
        }
        ImageView imageView = (ImageView) mo8249a(R.id.t5);
        if (z) {
            i = R.drawable.c5c;
        } else {
            i = R.drawable.c5b;
        }
        imageView.setImageResource(i);
        ((ImageView) mo8249a(R.id.t5)).setOnClickListener(new View$OnClickListenerC3032f(this, z));
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.BlockWordView$d */
    public static final class C3030d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BlockWordView f8856a;

        static {
            Covode.recordClassIndex(3507);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3030d(BlockWordView blockWordView) {
            this.f8856a = blockWordView;
        }

        public final void afterTextChanged(Editable editable) {
            String obj;
            int i;
            C89219l.m154721d(editable, "");
            LiveEditText liveEditText = (LiveEditText) this.f8856a.mo8249a(R.id.t8);
            C89219l.m154716b(liveEditText, "");
            Editable text = liveEditText.getText();
            if (text != null && (obj = text.toString()) != null) {
                FitTextView fitTextView = (FitTextView) this.f8856a.mo8249a(R.id.t9);
                C89219l.m154716b(fitTextView, "");
                if (obj.length() == 0) {
                    i = 0;
                } else {
                    i = 8;
                }
                fitTextView.setVisibility(i);
                if (obj.length() > this.f8856a.f8847c) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8p);
                    BlockWordView blockWordView = this.f8856a;
                    LiveEditText liveEditText2 = (LiveEditText) blockWordView.mo8249a(R.id.t8);
                    C89219l.m154716b(liveEditText2, "");
                    blockWordView.f8846b = new InputFilter.LengthFilter(obj.length());
                    liveEditText2.setFilters(new InputFilter.LengthFilter[]{blockWordView.f8846b});
                    int i2 = this.f8856a.f8847c;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    String substring = obj.substring(0, i2);
                    C89219l.m154716b(substring, "");
                    ((LiveEditText) this.f8856a.mo8249a(R.id.t8)).setText(substring);
                    ((LiveEditText) this.f8856a.mo8249a(R.id.t8)).setSelection(substring.length());
                    return;
                }
                BlockWordView blockWordView2 = this.f8856a;
                LiveEditText liveEditText3 = (LiveEditText) blockWordView2.mo8249a(R.id.t8);
                C89219l.m154716b(liveEditText3, "");
                if (blockWordView2.f8846b != null) {
                    liveEditText3.setFilters(new InputFilter[0]);
                    blockWordView2.f8846b = null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.BlockWordView$f */
    public static final class View$OnClickListenerC3032f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockWordView f8862a;

        /* renamed from: b */
        final /* synthetic */ boolean f8863b;

        static {
            Covode.recordClassIndex(3509);
        }

        View$OnClickListenerC3032f(BlockWordView blockWordView, boolean z) {
            this.f8862a = blockWordView;
            this.f8863b = z;
        }

        public final void onClick(View view) {
            if (this.f8863b) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8q);
                return;
            }
            ((LiveEditText) this.f8862a.mo8249a(R.id.t8)).postDelayed(new Runnable(this) {
                /* class com.bytedance.android.live.broadcast.api.blockword.BlockWordView.View$OnClickListenerC3032f.RunnableC30331 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC3032f f8864a;

                static {
                    Covode.recordClassIndex(3510);
                }

                {
                    this.f8864a = r1;
                }

                public final void run() {
                    this.f8864a.f8862a.mo8251a((EditText) this.f8864a.f8862a.mo8249a(R.id.t8), 200, 1, 5);
                    ((LiveEditText) this.f8864a.f8862a.mo8249a(R.id.t8)).requestFocus();
                    LiveEditText liveEditText = (LiveEditText) this.f8864a.f8862a.mo8249a(R.id.t8);
                    C89219l.m154716b(liveEditText, "");
                    C11279p.m20003a((EditText) liveEditText);
                }
            }, 100);
            C6501b.C6502a.m13948a("livesdk_stopword_set").mo12639a().mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.BlockWordView$b */
    static final class C3028b extends AbstractC89220m implements AbstractC89172b<C3043a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BlockWordView f8853a;

        static {
            Covode.recordClassIndex(3505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3028b(BlockWordView blockWordView) {
            super(1);
            this.f8853a = blockWordView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3043a aVar) {
            String str;
            C3043a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C3034a aVar3 = this.f8853a.f8845a;
            C89219l.m154721d(aVar2, "");
            C6501b a = C6501b.C6502a.m13948a("livesdk_tns_delete_keywords");
            String str2 = aVar3.f8866b;
            if (str2 == null) {
                C89219l.m154710a("eventPage");
            }
            C6501b a2 = a.mo12658d(str2).mo12651a("keyword", aVar2.f8884b).mo12646a("timestamp", System.currentTimeMillis());
            if (aVar3.f8867c) {
                str = "host";
            } else {
                str = "moderator";
            }
            a2.mo12651a("modified_by", str).mo12655b();
            aVar3.f8865a.deleteBlockWord(aVar2.f8883a, aVar3.f8868d.toString(), aVar3.f8869e).mo143271a(new C11191f()).mo143254a(new C3034a.C3038d(aVar3, aVar2), new C3034a.C3039e(aVar3, aVar2));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.C3034a.AbstractC3035a
    /* renamed from: a */
    public final void mo8252a(C3043a aVar) {
        C89219l.m154721d(aVar, "");
        ((BlockWordFlowLayout) mo8249a(R.id.b65)).mo8241a(aVar, 0);
        m8336b();
        C6501b.C6502a.m13948a("livesdk_stopword_set_success").mo12639a().mo12651a("context", aVar.f8884b).mo12655b();
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.C3034a.AbstractC3035a
    /* renamed from: b */
    public final void mo8257b(C3043a aVar) {
        C89219l.m154721d(aVar, "");
        BlockWordFlowLayout blockWordFlowLayout = (BlockWordFlowLayout) mo8249a(R.id.b65);
        C89219l.m154721d(aVar, "");
        blockWordFlowLayout.f8831c = true;
        int childCount = blockWordFlowLayout.getChildCount() - 2;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = blockWordFlowLayout.getChildAt(i);
                C89219l.m154716b(childAt, "");
                LiveTextView liveTextView = (LiveTextView) childAt.findViewById(R.id.t6);
                C89219l.m154716b(liveTextView, "");
                if (!C89219l.m154714a((Object) liveTextView.getText(), (Object) aVar.f8884b)) {
                    if (i == childCount) {
                        break;
                    }
                    i++;
                } else {
                    blockWordFlowLayout.removeViewAt(i);
                    break;
                }
            }
        }
        m8336b();
        C6501b.C6502a.m13948a("livesdk_stopword_cancel").mo12639a().mo12651a("context", aVar.f8884b).mo12655b();
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.C3034a.AbstractC3035a
    /* renamed from: a */
    public final void mo8253a(Throwable th) {
        String str;
        C89219l.m154721d(th, "");
        if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            switch (aVar.getErrorCode()) {
                case 80070:
                    str = "limited";
                    break;
                case 80071:
                    str = "illegal";
                    break;
                case 80072:
                    str = "lengthy";
                    break;
                case 80073:
                    str = "existed";
                    break;
                default:
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gt9);
                    return;
            }
            String prompt = aVar.getPrompt();
            C89219l.m154716b(prompt, "");
            C11279p.m20010a(prompt);
            C6501b.C6502a.m13948a("livesdk_stopword_set_toast").mo12639a().mo12651a("toast_type", str).mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo8255a(boolean z) {
        int i;
        if (this.f8848d != z) {
            this.f8848d = z;
            RelativeLayout relativeLayout = (RelativeLayout) mo8249a(R.id.t_);
            C89219l.m154716b(relativeLayout, "");
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            RelativeLayout relativeLayout2 = (RelativeLayout) mo8249a(R.id.t_);
            C89219l.m154716b(relativeLayout2, "");
            RelativeLayout relativeLayout3 = (RelativeLayout) mo8249a(R.id.t_);
            C89219l.m154716b(relativeLayout3, "");
            ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
            if (z) {
                i2 = C3966y.m9653a(52.0f);
            }
            layoutParams.height = i2;
            relativeLayout2.setLayoutParams(layoutParams);
        }
    }

    private /* synthetic */ BlockWordView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BlockWordView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6515);
        this.f8845a = new C3034a(this);
        this.f8847c = 30;
        C3030d dVar = new C3030d(this);
        this.f8850g = dVar;
        C3029c cVar = new C3029c(this, context);
        this.f8851h = cVar;
        FrameLayout.inflate(getContext(), R.layout.b4n, this);
        ((LiveEditText) mo8249a(R.id.t8)).addTextChangedListener(dVar);
        ((LiveEditText) mo8249a(R.id.t8)).setOnEditorActionListener(cVar);
        ((BlockWordFlowLayout) mo8249a(R.id.b65)).setDeleteListener(new C3028b(this));
        MethodCollector.m26664o(6515);
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.C3034a.AbstractC3035a
    /* renamed from: a */
    public final void mo8254a(List<C3043a> list, long j, long j2) {
        C89219l.m154721d(list, "");
        this.f8849f = j;
        this.f8847c = (int) j2;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BlockWordFlowLayout blockWordFlowLayout = (BlockWordFlowLayout) mo8249a(R.id.b65);
            blockWordFlowLayout.mo8241a(it.next(), blockWordFlowLayout.getChildCount() - 1);
        }
        m8336b();
        FitTextView fitTextView = (FitTextView) mo8249a(R.id.t9);
        C89219l.m154716b(fitTextView, "");
        fitTextView.setText(getContext().getString(R.string.e8s, Integer.valueOf(this.f8847c)));
    }

    /* renamed from: a */
    public final void mo8251a(EditText editText, long j, int i, int i2) {
        if (i <= i2 && editText != null) {
            editText.postDelayed(new RunnableC3031e(this, editText, j, i, i2), j);
        }
    }
}
