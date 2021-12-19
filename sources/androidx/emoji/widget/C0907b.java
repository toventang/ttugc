package androidx.emoji.widget;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.p036g.C0697g;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.widget.b */
public final class C0907b {

    /* renamed from: a */
    final C0908a f3261a;

    /* renamed from: b */
    public int f3262b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f3263c;

    static {
        Covode.recordClassIndex(995);
    }

    /* renamed from: androidx.emoji.widget.b$a */
    static class C0908a {
        static {
            Covode.recordClassIndex(996);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo3211a(KeyListener keyListener) {
            return keyListener;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputConnection mo3212a(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3213a(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3214b(int i) {
        }

        C0908a() {
        }
    }

    /* renamed from: androidx.emoji.widget.b$b */
    static class C0909b extends C0908a {

        /* renamed from: a */
        private final EditText f3264a;

        /* renamed from: b */
        private final C0918h f3265b;

        static {
            Covode.recordClassIndex(997);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.C0907b.C0908a
        /* renamed from: a */
        public final void mo3213a(int i) {
            this.f3265b.f3277a = i;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.C0907b.C0908a
        /* renamed from: b */
        public final void mo3214b(int i) {
            this.f3265b.f3278b = i;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.C0907b.C0908a
        /* renamed from: a */
        public final KeyListener mo3211a(KeyListener keyListener) {
            if (keyListener instanceof C0914f) {
                return keyListener;
            }
            return new C0914f(keyListener);
        }

        C0909b(EditText editText) {
            this.f3264a = editText;
            C0918h hVar = new C0918h(editText);
            this.f3265b = hVar;
            editText.addTextChangedListener(hVar);
            editText.setEditableFactory(C0910c.m3118a());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.C0907b.C0908a
        /* renamed from: a */
        public final InputConnection mo3212a(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C0911d) {
                return inputConnection;
            }
            return new C0911d(this.f3264a, inputConnection, editorInfo);
        }
    }

    /* renamed from: a */
    public final KeyListener mo3208a(KeyListener keyListener) {
        C0697g.m2453a(keyListener, "keyListener cannot be null");
        return this.f3261a.mo3211a(keyListener);
    }

    public C0907b(EditText editText) {
        C0697g.m2453a(editText, "editText cannot be null");
        int i = Build.VERSION.SDK_INT;
        this.f3261a = new C0909b(editText);
    }

    /* renamed from: a */
    public final void mo3210a(int i) {
        C0697g.m2451a(i, "maxEmojiCount should be greater than 0");
        this.f3262b = i;
        this.f3261a.mo3213a(i);
    }

    /* renamed from: a */
    public final InputConnection mo3209a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f3261a.mo3212a(inputConnection, editorInfo);
    }
}
