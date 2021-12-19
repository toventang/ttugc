package com.p2082ss.android.ugc.aweme.inbox;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.j */
public final class C56464j extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public int f128752a;

    /* renamed from: b */
    public int f128753b;

    /* renamed from: c */
    private List<? extends InboxAdapterWidget> f128754c;

    /* renamed from: d */
    private boolean f128755d = true;

    /* renamed from: e */
    private Paint f128756e;

    /* renamed from: f */
    private int f128757f;

    /* renamed from: g */
    private int f128758g;

    /* renamed from: h */
    private int f128759h;

    /* renamed from: i */
    private float f128760i;

    /* renamed from: j */
    private float f128761j;

    static {
        Covode.recordClassIndex(66284);
    }

    /* renamed from: a */
    private final int m102439a() {
        Iterator<T> it = this.f128754c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().mo87493g().getItemCount();
        }
        if (m102442d()) {
            return i;
        }
        return i - 1;
    }

    /* renamed from: b */
    private final boolean m102440b() {
        if (!(!this.f128754c.isEmpty()) || (this.f128754c.get(0) instanceof MultiAdapterWidget) || ((InboxAdapterWidget) this.f128754c.get(0)).mo87493g().getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m102441c() {
        List<? extends InboxAdapterWidget> list = this.f128754c;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof MultiAdapterWidget) {
                arrayList.add(t);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            return ((MultiAdapterWidget) it.next()).mo93463b().mo93473c();
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m102442d() {
        InboxAdapterWidget inboxAdapterWidget = (InboxAdapterWidget) C89070n.m154588i((List) this.f128754c);
        if (inboxAdapterWidget == null || (inboxAdapterWidget instanceof MultiAdapterWidget) || inboxAdapterWidget.mo87493g().getItemCount() == 0) {
            return true;
        }
        return C89219l.m154714a((Object) inboxAdapterWidget.bw_().getValue(), (Object) true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        float f;
        Canvas canvas2 = canvas;
        C89219l.m154721d(canvas2, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (this.f128759h == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int d = RecyclerView.m4277d(childAt);
                if (!m102440b() || d != 0) {
                    if (d < m102439a()) {
                        C89219l.m154716b(childAt, "");
                        int bottom = childAt.getBottom();
                        int i2 = bottom - this.f128758g;
                        if (this.f128755d) {
                            if (!m102441c() || (m102440b() ? d != 1 : d != 0)) {
                                f = this.f128760i + 0.0f;
                            } else {
                                f = 0.0f;
                            }
                            canvas2.drawRect(f, (float) i2, ((float) measuredWidth) - this.f128761j, (float) bottom, this.f128756e);
                        } else {
                            float f2 = (float) i2;
                            float f3 = (float) bottom;
                            canvas2.drawRect(0.0f, f2, this.f128760i, f3, this.f128756e);
                            float f4 = (float) measuredWidth;
                            canvas2 = canvas2;
                            canvas2.drawRect(f4 - this.f128761j, f2, f4, f3, this.f128756e);
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt2 = recyclerView.getChildAt(i3);
            if (RecyclerView.m4277d(childAt2) < m102439a()) {
                C89219l.m154716b(childAt2, "");
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int left = childAt2.getLeft() + ((RecyclerView.C1367j) layoutParams).leftMargin;
                int i4 = left - this.f128758g;
                if (this.f128755d) {
                    canvas2.drawRect((float) i4, this.f128760i + 0.0f, (float) left, ((float) measuredHeight) - this.f128761j, this.f128756e);
                } else {
                    float f5 = (float) i4;
                    float f6 = this.f128760i;
                    float f7 = (float) left;
                    canvas2.drawRect(f5, f6 + 0.0f, f7, f6, this.f128756e);
                    float f8 = (float) measuredHeight;
                    canvas2.drawRect(f5, f8 - this.f128761j, f7, f8, this.f128756e);
                }
            } else {
                return;
            }
        }
    }

    public C56464j(List<? extends InboxAdapterWidget> list, int i, int i2, float f) {
        C89219l.m154721d(list, "");
        this.f128754c = list;
        Paint paint = new Paint(1);
        this.f128756e = paint;
        this.f128757f = i;
        this.f128758g = i2;
        this.f128759h = 1;
        this.f128752a = -1;
        this.f128760i = f;
        this.f128761j = 0.0f;
        paint.setColor(i);
        this.f128756e.setStyle(Paint.Style.FILL);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = android.content.res.Resources.getSystem();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r1 = p4600h.p4615g.C89241a.m154730a(android.util.TypedValue.applyDimension(1, 8.0f, r0.getDisplayMetrics()));
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, androidx.recyclerview.widget.RecyclerView.C1378s r9) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r4)
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r4)
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r4)
            p4600h.p4611f.p4613b.C89219l.m154721d(r9, r4)
            int r1 = androidx.recyclerview.widget.RecyclerView.m4277d(r7)
            int r0 = r5.f128759h
            r3 = 1
            r2 = 0
            if (r0 != r3) goto L_0x0055
            boolean r0 = r5.m102440b()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r5.m102441c()
            if (r0 == 0) goto L_0x0041
            r0 = 2
            if (r1 != r0) goto L_0x0053
        L_0x0027:
            r1 = 1090519040(0x41000000, float:8.0)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            p4600h.p4611f.p4613b.C89219l.m154709a(r0, r4)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r3, r1, r0)
            int r1 = p4600h.p4615g.C89241a.m154730a(r0)
        L_0x003c:
            r0 = 0
        L_0x003d:
            r6.set(r2, r1, r0, r2)
            return
        L_0x0041:
            boolean r0 = r5.m102440b()
            if (r0 != 0) goto L_0x004d
            boolean r0 = r5.m102441c()
            if (r0 == 0) goto L_0x0050
        L_0x004d:
            if (r1 != r3) goto L_0x0053
            goto L_0x0027
        L_0x0050:
            if (r1 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            r1 = 0
            goto L_0x003c
        L_0x0055:
            int r0 = r5.f128752a
            if (r1 != r0) goto L_0x005d
            int r0 = r5.f128753b
        L_0x005b:
            r1 = 0
            goto L_0x003d
        L_0x005d:
            int r0 = r5.f128758g
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.C56464j.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$s):void");
    }
}
