package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bv */
public final class C37077bv implements AbstractC46454h {

    /* renamed from: a */
    public int f87357a;

    /* renamed from: b */
    private EditText f87358b;

    /* renamed from: c */
    private InputConnection f87359c;

    /* renamed from: d */
    private AbstractC37139dd f87360d;

    static {
        Covode.recordClassIndex(44431);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h
    /* renamed from: b */
    public final void mo64590b() {
        this.f87360d.mo64612e();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h
    /* renamed from: a */
    public final void mo64586a() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        InputConnection inputConnection = this.f87359c;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        } else {
            this.f87358b.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h
    /* renamed from: a */
    public final void mo64587a(int i) {
        this.f87360d.mo64606b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h
    /* renamed from: a */
    public final void mo64589a(String str, int i) {
        if (this.f87358b.getText().length() + str.length() > this.f87357a) {
            new C79459a(C51427a.f118503a).mo123052a(C51427a.f118503a.getResources().getString(R.string.fin, Integer.valueOf(this.f87357a))).mo123053a();
            return;
        }
        if (i == 2) {
            this.f87360d.mo64597a(str, i);
        }
        int selectionStart = this.f87358b.getSelectionStart();
        int selectionEnd = this.f87358b.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.f87358b.getText().insert(max, str);
        } else {
            try {
                this.f87358b.getText().replace(max, max2, str);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        int length = max + str.length();
        if (length >= this.f87358b.length()) {
            EditText editText = this.f87358b;
            editText.setSelection(editText.length());
            return;
        }
        this.f87358b.setSelection(length);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h
    /* renamed from: a */
    public final void mo64588a(C46447a aVar, int i, int i2) {
        this.f87360d.mo64596a(aVar.f108224d, i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h
    /* renamed from: b */
    public final void mo64591b(C46447a aVar, int i, int i2) {
        this.f87360d.mo64607b(aVar.f108224d, i, i2);
    }

    public C37077bv(EditText editText, int i, AbstractC37139dd ddVar) {
        this.f87358b = editText;
        this.f87359c = editText.onCreateInputConnection(new EditorInfo());
        this.f87357a = i;
        this.f87360d = ddVar;
    }
}
