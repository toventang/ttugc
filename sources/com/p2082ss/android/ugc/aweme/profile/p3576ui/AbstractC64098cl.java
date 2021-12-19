package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23191e;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.navigation.p1723a.EnumC23193f;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.cl */
public abstract class AbstractC64098cl extends C64020bf {

    /* renamed from: q */
    public static final C64099a f145416q = new C64099a((byte) 0);

    /* renamed from: a */
    private SparseArray f145417a;

    /* renamed from: o */
    public TuxNavBar f145418o;

    /* renamed from: p */
    protected TextView f145419p;

    static {
        Covode.recordClassIndex(75542);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    /* renamed from: a */
    public View mo102214a(int i) {
        if (this.f145417a == null) {
            this.f145417a = new SparseArray();
        }
        View view = (View) this.f145417a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145417a.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public void cj_() {
        SparseArray sparseArray = this.f145417a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo102217d();

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cj_();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cl$a */
    public static final class C64099a {
        static {
            Covode.recordClassIndex(75543);
        }

        private C64099a() {
        }

        public /* synthetic */ C64099a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cl$d */
    public static final class C64102d implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ AbstractC64098cl f145422a;

        static {
            Covode.recordClassIndex(75546);
        }

        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            this.f145422a.ch_();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64102d(AbstractC64098cl clVar) {
            this.f145422a = clVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final TextView mo103720g() {
        TextView textView = this.f145419p;
        if (textView == null) {
            C89219l.m154710a("mEditLengthHint");
        }
        return textView;
    }

    /* renamed from: h */
    public final void mo103721h() {
        TuxNavBar tuxNavBar = this.f145418o;
        if (tuxNavBar != null) {
            tuxNavBar.mo37726a("save", C64101c.f145421a);
        }
    }

    /* renamed from: i */
    public final void mo103722i() {
        TuxNavBar tuxNavBar = this.f145418o;
        if (tuxNavBar != null) {
            tuxNavBar.mo37726a("save", C64100b.f145420a);
        }
    }

    public boolean ch_() {
        Dialog dialog;
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final AbstractC23189c mo103723j() {
        C23191e a = new C23191e().mo37748a((Object) "cancel");
        String string = getString(R.string.a7d);
        C89219l.m154716b(string, "");
        return a.mo37749a(string).mo37746a(EnumC23193f.SECONDARY).mo37745a((AbstractC23190d) new C64102d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo103718a(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f145419p = textView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cl$b */
    public static final class C64100b extends AbstractC89220m implements AbstractC89172b<AbstractC23189c, C89391z> {

        /* renamed from: a */
        public static final C64100b f145420a = new C64100b();

        static {
            Covode.recordClassIndex(75544);
        }

        C64100b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC23189c cVar) {
            AbstractC23189c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            ((C23191e) cVar2).f54939c = false;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cl$c */
    public static final class C64101c extends AbstractC89220m implements AbstractC89172b<AbstractC23189c, C89391z> {

        /* renamed from: a */
        public static final C64101c f145421a = new C64101c();

        static {
            Covode.recordClassIndex(75545);
        }

        C64101c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC23189c cVar) {
            AbstractC23189c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            ((C23191e) cVar2).f54939c = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    protected static C23194g m116006b(String str) {
        C89219l.m154721d(str, "");
        return new C23194g().mo37753a(str).mo37752a((Object) "title");
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (C80471gb.m139482a()) {
            i = R.style.a00;
        } else {
            i = R.style.zz;
        }
        setStyle(1, i);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        onCreateDialog.setOnKeyListener(new DialogInterface$OnKeyListenerC64103e(this));
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    protected static boolean m116005a(EditText editText, int i) {
        C89219l.m154721d(editText, "");
        Editable text = editText.getText();
        if (text.length() <= i) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(text);
        String obj = text.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String substring = obj.substring(0, i);
        C89219l.m154716b(substring, "");
        editText.setText(substring);
        Editable text2 = editText.getText();
        if (selectionEnd > text2.length()) {
            selectionEnd = text2.length();
        }
        Selection.setSelection(text2, selectionEnd);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cl$e */
    static final class DialogInterface$OnKeyListenerC64103e implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC64098cl f145423a;

        static {
            Covode.recordClassIndex(75547);
        }

        DialogInterface$OnKeyListenerC64103e(AbstractC64098cl clVar) {
            this.f145423a = clVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() != 1) {
                return false;
            }
            this.f145423a.ch_();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo103719a(boolean z, int i, int i2) {
        int i3;
        ForegroundColorSpan foregroundColorSpan;
        Integer a;
        if (z) {
            i3 = R.attr.av;
        } else {
            i3 = R.attr.bj;
        }
        Context context = getContext();
        if (context == null || (a = C23155d.m43641a(context, i3)) == null) {
            foregroundColorSpan = null;
        } else {
            foregroundColorSpan = new ForegroundColorSpan(a.intValue());
        }
        C17191a aVar = new C17191a.C17192a().mo27178a(C17191a.C17193b.m31755a(Math.min(i, i2)), foregroundColorSpan, 33).mo27180c("/").mo27177a(C17191a.C17193b.m31755a(i2)).f40973a;
        TextView textView = this.f145419p;
        if (textView == null) {
            C89219l.m154710a("mEditLengthHint");
        }
        textView.setText(aVar);
    }
}
