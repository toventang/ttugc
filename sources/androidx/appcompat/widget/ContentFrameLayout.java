package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f1341a;

    /* renamed from: b */
    private TypedValue f1342b;

    /* renamed from: c */
    private TypedValue f1343c;

    /* renamed from: d */
    private TypedValue f1344d;

    /* renamed from: e */
    private TypedValue f1345e;

    /* renamed from: f */
    private TypedValue f1346f;

    /* renamed from: g */
    private final Rect f1347g;

    /* renamed from: h */
    private AbstractC0351a f1348h;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface AbstractC0351a {
        static {
            Covode.recordClassIndex(405);
        }

        /* renamed from: a */
        void mo555a();
    }

    static {
        Covode.recordClassIndex(404);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1345e == null) {
            this.f1345e = new TypedValue();
        }
        return this.f1345e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1346f == null) {
            this.f1346f = new TypedValue();
        }
        return this.f1346f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1343c == null) {
            this.f1343c = new TypedValue();
        }
        return this.f1343c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1344d == null) {
            this.f1344d = new TypedValue();
        }
        return this.f1344d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1341a == null) {
            this.f1341a = new TypedValue();
        }
        return this.f1341a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1342b == null) {
            this.f1342b = new TypedValue();
        }
        return this.f1342b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0351a aVar = this.f1348h;
        if (aVar != null) {
            aVar.mo555a();
        }
    }

    /* renamed from: a */
    public final void mo1429a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(AbstractC0351a aVar) {
        this.f1348h = aVar;
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    private ContentFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f1347g = new Rect();
    }

    /* renamed from: a */
    public final void mo1428a(int i, int i2, int i3, int i4) {
        this.f1347g.set(i, i2, i3, i4);
        if (C0792v.m2788v(this)) {
            requestLayout();
        }
    }
}
