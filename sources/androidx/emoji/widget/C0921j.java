package androidx.emoji.widget;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.p036g.C0697g;
import androidx.emoji.p045a.AbstractC0891d;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji.widget.j */
public final class C0921j extends SpannableStringBuilder {

    /* renamed from: a */
    private final Class<?> f3283a;

    /* renamed from: b */
    private final List<C0922a> f3284b = new ArrayList();

    static {
        Covode.recordClassIndex(1009);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.emoji.widget.j$a */
    public static class C0922a implements SpanWatcher, TextWatcher {

        /* renamed from: a */
        final Object f3285a;

        /* renamed from: b */
        private final AtomicInteger f3286b = new AtomicInteger(0);

        static {
            Covode.recordClassIndex(1010);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3253a() {
            this.f3286b.incrementAndGet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo3255b() {
            this.f3286b.decrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3285a).afterTextChanged(editable);
        }

        C0922a(Object obj) {
            this.f3285a = obj;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3285a).beforeTextChanged(charSequence, i, i2, i3);
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3285a).onTextChanged(charSequence, i, i2, i3);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3286b.get() <= 0 || !(obj instanceof AbstractC0891d)) {
                ((SpanWatcher) this.f3285a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3286b.get() <= 0 || !(obj instanceof AbstractC0891d)) {
                ((SpanWatcher) this.f3285a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f3286b.get() <= 0 || !(obj instanceof AbstractC0891d)) {
                ((SpanWatcher) this.f3285a).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: c */
    private void m3133c() {
        for (int i = 0; i < this.f3284b.size(); i++) {
            this.f3284b.get(i).mo3255b();
        }
    }

    /* renamed from: a */
    public final void mo3234a() {
        m3133c();
        m3134d();
    }

    /* renamed from: d */
    private void m3134d() {
        for (int i = 0; i < this.f3284b.size(); i++) {
            this.f3284b.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: b */
    public final void mo3239b() {
        for (int i = 0; i < this.f3284b.size(); i++) {
            this.f3284b.get(i).mo3253a();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable, android.text.Editable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: a */
    private boolean m3130a(Class<?> cls) {
        if (this.f3283a == cls) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3131a(Object obj) {
        if (obj == null || !m3130a(obj.getClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private C0922a m3132b(Object obj) {
        for (int i = 0; i < this.f3284b.size(); i++) {
            C0922a aVar = this.f3284b.get(i);
            if (aVar.f3285a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final int getSpanEnd(Object obj) {
        C0922a b;
        if (m3131a(obj) && (b = m3132b(obj)) != null) {
            obj = b;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        C0922a b;
        if (m3131a(obj) && (b = m3132b(obj)) != null) {
            obj = b;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        C0922a b;
        if (m3131a(obj) && (b = m3132b(obj)) != null) {
            obj = b;
        }
        return super.getSpanStart(obj);
    }

    public final void removeSpan(Object obj) {
        C0922a aVar;
        if (m3131a(obj)) {
            aVar = m3132b(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f3284b.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable, android.text.Editable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final CharSequence subSequence(int i, int i2) {
        return new C0921j(this.f3283a, this, i, i2);
    }

    C0921j(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C0697g.m2453a(cls, "watcherClass cannot be null");
        this.f3283a = cls;
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (m3130a((Class<?>) cls)) {
            cls = C0922a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        mo3239b();
        super.replace(i, i2, charSequence);
        m3133c();
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m3130a((Class<?>) cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        C0922a[] aVarArr = (C0922a[]) super.getSpans(i, i2, C0922a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f3285a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable, android.text.Editable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m3131a(obj)) {
            C0922a aVar = new C0922a(obj);
            this.f3284b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    private C0921j(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C0697g.m2453a(cls, "watcherClass cannot be null");
        this.f3283a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.SpannableStringBuilder
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo3239b();
        super.replace(i, i2, charSequence, i3, i4);
        m3133c();
        return this;
    }
}
