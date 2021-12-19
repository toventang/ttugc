package androidx.emoji.widget;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.core.p036g.C0697g;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.widget.g */
public final class C0915g {

    /* renamed from: a */
    public final C0916a f3274a;

    static {
        Covode.recordClassIndex(1003);
    }

    /* renamed from: androidx.emoji.widget.g$a */
    public static class C0916a {
        static {
            Covode.recordClassIndex(1004);
        }

        /* renamed from: a */
        public void mo3226a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3227a(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo3228a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        C0916a() {
        }
    }

    /* renamed from: androidx.emoji.widget.g$b */
    static class C0917b extends C0916a {

        /* renamed from: a */
        private final TextView f3275a;

        /* renamed from: b */
        private final C0912e f3276b;

        static {
            Covode.recordClassIndex(1005);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.C0915g.C0916a
        /* renamed from: a */
        public final void mo3226a() {
            TransformationMethod transformationMethod = this.f3275a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                TextView textView = this.f3275a;
                if (!(transformationMethod instanceof C0920i)) {
                    transformationMethod = new C0920i(transformationMethod);
                }
                textView.setTransformationMethod(transformationMethod);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.C0915g.C0916a
        /* renamed from: a */
        public final void mo3227a(boolean z) {
            if (z) {
                mo3226a();
            }
        }

        C0917b(TextView textView) {
            this.f3275a = textView;
            this.f3276b = new C0912e(textView);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.widget.C0915g.C0916a
        /* renamed from: a */
        public final InputFilter[] mo3228a(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof C0912e) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f3276b;
            return inputFilterArr2;
        }
    }

    /* renamed from: a */
    public final void mo3224a(boolean z) {
        this.f3274a.mo3227a(z);
    }

    /* renamed from: a */
    public final InputFilter[] mo3225a(InputFilter[] inputFilterArr) {
        return this.f3274a.mo3228a(inputFilterArr);
    }

    public C0915g(TextView textView) {
        C0697g.m2453a(textView, "textView cannot be null");
        int i = Build.VERSION.SDK_INT;
        this.f3274a = new C0917b(textView);
    }
}
