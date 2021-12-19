package androidx.emoji.p045a;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.KeyEvent;
import androidx.core.graphics.C0701c;
import androidx.emoji.p045a.C0877a;
import androidx.emoji.p045a.C0903g;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: androidx.emoji.a.c */
public final class C0888c {

    /* renamed from: a */
    private final C0877a.C0886h f3213a;

    /* renamed from: b */
    private final C0903g f3214b;

    /* renamed from: c */
    private C0889a f3215c = new C0889a();

    /* renamed from: d */
    private final boolean f3216d;

    /* renamed from: e */
    private final int[] f3217e;

    static {
        Covode.recordClassIndex(974);
    }

    /* renamed from: a */
    static boolean m3080a(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: androidx.emoji.a.c$a */
    public static class C0889a {

        /* renamed from: a */
        private static final ThreadLocal<StringBuilder> f3218a = new ThreadLocal<>();

        /* renamed from: b */
        private final TextPaint f3219b;

        static {
            Covode.recordClassIndex(975);
        }

        C0889a() {
            TextPaint textPaint = new TextPaint();
            this.f3219b = textPaint;
            textPaint.setTextSize(10.0f);
        }

        /* renamed from: a */
        private static StringBuilder m3084a() {
            ThreadLocal<StringBuilder> threadLocal = f3218a;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        /* renamed from: a */
        public final boolean mo3183a(CharSequence charSequence, int i, int i2) {
            StringBuilder a = m3084a();
            a.setLength(0);
            while (i < i2) {
                a.append(charSequence.charAt(i));
                i++;
            }
            return C0701c.m2469a(this.f3219b, a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.emoji.a.c$b */
    public static final class C0890b {

        /* renamed from: a */
        int f3220a = 1;

        /* renamed from: b */
        C0903g.C0904a f3221b;

        /* renamed from: c */
        C0903g.C0904a f3222c;

        /* renamed from: d */
        int f3223d;

        /* renamed from: e */
        int f3224e;

        /* renamed from: f */
        private final C0903g.C0904a f3225f;

        /* renamed from: g */
        private final boolean f3226g;

        /* renamed from: h */
        private final int[] f3227h;

        static {
            Covode.recordClassIndex(976);
        }

        /* renamed from: a */
        static boolean m3086a(int i) {
            return i == 65039;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo3184a() {
            this.f3220a = 1;
            this.f3221b = this.f3225f;
            this.f3224e = 0;
            return 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo3185b() {
            if (this.f3221b.f3256b.mo3179a().mo3819b() || m3086a(this.f3223d)) {
                return true;
            }
            if (this.f3226g) {
                if (this.f3227h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3227h, this.f3221b.f3256b.mo3178a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        C0890b(C0903g.C0904a aVar, boolean z, int[] iArr) {
            this.f3225f = aVar;
            this.f3221b = aVar;
            this.f3226g = z;
            this.f3227h = iArr;
        }
    }

    /* renamed from: a */
    public static boolean m3081a(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC0891d[] dVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m3080a(selectionStart, selectionEnd) && (dVarArr = (AbstractC0891d[]) editable.getSpans(selectionStart, selectionEnd, AbstractC0891d.class)) != null && dVarArr.length > 0) {
            for (AbstractC0891d dVar : dVarArr) {
                int spanStart = editable.getSpanStart(dVar);
                int spanEnd = editable.getSpanEnd(dVar);
                if (z) {
                    if (spanStart == selectionStart) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                } else if (spanEnd == selectionStart) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
                if (selectionStart > spanStart && selectionStart < spanEnd) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m3079a(Spannable spannable, C0887b bVar, int i, int i2) {
        spannable.setSpan(C0877a.C0886h.m3075a(bVar), i, i2, 33);
    }

    C0888c(C0903g gVar, C0877a.C0886h hVar, boolean z, int[] iArr) {
        this.f3213a = hVar;
        this.f3214b = gVar;
        this.f3216d = z;
        this.f3217e = iArr;
    }

    /* renamed from: a */
    private boolean m3082a(CharSequence charSequence, int i, int i2, C0887b bVar) {
        if (Build.VERSION.SDK_INT < 23 && bVar.mo3179a().mo3820c() > Build.VERSION.SDK_INT) {
            return false;
        }
        if (bVar.f3212c == 0) {
            bVar.mo3180a(this.f3215c.mo3183a(charSequence, i, i2));
        }
        if (bVar.f3212c == 2) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x010a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0118 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x016e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x015e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x017c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0116, code lost:
        if (m3082a(r17, r4, r13, r7.f3222c.f3256b) == false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0106 A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0136 A[Catch:{ all -> 0x0190 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo3182a(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.p045a.C0888c.mo3182a(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
