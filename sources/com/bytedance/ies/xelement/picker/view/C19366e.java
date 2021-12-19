package com.bytedance.ies.xelement.picker.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.picker.p1384a.C19326b;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19339c;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19342f;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.view.e */
public final class C19366e {

    /* renamed from: o */
    private static List<String> f45840o = Arrays.asList("1", "3", "5", "7", "8", "10", "12");

    /* renamed from: p */
    private static List<String> f45841p = Arrays.asList("4", "6", "9", "11");

    /* renamed from: a */
    public View f45842a;

    /* renamed from: b */
    WheelView f45843b;

    /* renamed from: c */
    public WheelView f45844c;

    /* renamed from: d */
    public WheelView f45845d;

    /* renamed from: e */
    public int f45846e = 1900;

    /* renamed from: f */
    public int f45847f = 2100;

    /* renamed from: g */
    public int f45848g = 1;

    /* renamed from: h */
    public int f45849h = 12;

    /* renamed from: i */
    public int f45850i = 1;

    /* renamed from: j */
    public int f45851j = 31;

    /* renamed from: k */
    public int f45852k;

    /* renamed from: l */
    public int f45853l;

    /* renamed from: m */
    public int f45854m;

    /* renamed from: n */
    public AbstractC19339c f45855n;

    /* renamed from: a */
    public final Calendar mo30870a() {
        Calendar instance = Calendar.getInstance();
        instance.set(this.f45852k, this.f45853l - 1, this.f45854m);
        return instance;
    }

    static {
        Covode.recordClassIndex(22155);
    }

    /* renamed from: a */
    public static int m36135a(int i, int i2, int i3) {
        if (f45840o.contains(String.valueOf(i2))) {
            return Math.min(i3, 31);
        }
        if (f45841p.contains(String.valueOf(i2))) {
            return Math.min(i3, 30);
        }
        if (i % 4 != 0 || i % 100 == 0) {
            return Math.min(i3, 28);
        }
        return Math.min(i3, 29);
    }

    /* renamed from: b */
    public final void mo30872b(boolean z, int i, int i2, int i3) {
        this.f45845d.setAdapter(new C19326b(i2, i3));
        if (z) {
            this.f45845d.setCurrentIndex(i);
        } else if (i > this.f45845d.getAdapter().mo30777a() - 1) {
            i = this.f45845d.getAdapter().mo30777a() - 1;
            this.f45845d.setCurrentIndex(i);
        }
        this.f45854m = i + i2;
    }

    /* renamed from: a */
    public final void mo30871a(boolean z, int i, int i2, int i3) {
        int currentItem;
        int i4 = this.f45846e;
        int i5 = this.f45847f;
        int i6 = 31;
        int i7 = 1;
        if (i4 == i5 && this.f45848g == this.f45849h) {
            i7 = this.f45850i;
            i6 = this.f45851j;
        } else if (i == i4 && i2 == this.f45848g) {
            i7 = this.f45850i;
        } else if (i == i5 && i2 == this.f45849h) {
            i6 = this.f45851j;
        }
        int a = m36135a(i, i2, i6);
        if (z) {
            currentItem = i3 - i7;
        } else {
            currentItem = this.f45845d.getCurrentItem();
        }
        mo30872b(z, currentItem, i7, a);
    }

    public C19366e(View view, boolean[] zArr, int i, int i2, AbstractC19054a aVar) {
        int i3;
        int i4;
        this.f45842a = view;
        this.f45843b = (WheelView) view.findViewById(R.id.fjz);
        this.f45844c = (WheelView) view.findViewById(R.id.cl9);
        this.f45845d = (WheelView) view.findViewById(R.id.ahn);
        this.f45843b.setLocalizeAdapter(aVar);
        this.f45844c.setLocalizeAdapter(aVar);
        this.f45845d.setLocalizeAdapter(aVar);
        if (zArr.length == 3) {
            WheelView wheelView = this.f45843b;
            int i5 = 0;
            if (zArr[0]) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            wheelView.setVisibility(i3);
            WheelView wheelView2 = this.f45844c;
            if (zArr[1]) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            wheelView2.setVisibility(i4);
            this.f45845d.setVisibility(!zArr[2] ? 8 : i5);
            this.f45843b.setGravity(i);
            this.f45844c.setGravity(i);
            this.f45845d.setGravity(i);
            float f = (float) i2;
            this.f45845d.setTextSize(f);
            this.f45844c.setTextSize(f);
            this.f45843b.setTextSize(f);
            this.f45843b.setOnItemSelectedListener(new AbstractC19342f() {
                /* class com.bytedance.ies.xelement.picker.view.C19366e.C193671 */

                static {
                    Covode.recordClassIndex(22156);
                }

                @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19342f
                /* renamed from: a */
                public final void mo30810a(int i) {
                    int i2;
                    int currentItem = C19366e.this.f45844c.getCurrentItem();
                    int i3 = i + C19366e.this.f45846e;
                    C19366e.this.f45852k = i3;
                    int i4 = 12;
                    if (C19366e.this.f45846e == C19366e.this.f45847f) {
                        i2 = C19366e.this.f45848g;
                        i4 = C19366e.this.f45849h;
                    } else if (i3 == C19366e.this.f45846e) {
                        i2 = C19366e.this.f45848g;
                    } else {
                        if (i3 == C19366e.this.f45847f) {
                            i4 = C19366e.this.f45849h;
                        }
                        i2 = 1;
                    }
                    C19366e.this.f45844c.setAdapter(new C19326b(i2, i4));
                    int a = C19366e.this.f45844c.getAdapter().mo30777a() - 1;
                    if (currentItem > a) {
                        C19366e.this.f45844c.setCurrentIndex(a);
                        currentItem = a;
                    }
                    int i5 = i2 + currentItem;
                    C19366e.this.f45853l = i5;
                    C19366e eVar = C19366e.this;
                    eVar.mo30871a(false, i3, i5, eVar.f45854m);
                    if (C19366e.this.f45855n != null) {
                        C19366e.this.f45855n.mo30807a();
                    }
                }
            });
            this.f45844c.setOnItemSelectedListener(new AbstractC19342f() {
                /* class com.bytedance.ies.xelement.picker.view.C19366e.C193682 */

                static {
                    Covode.recordClassIndex(22157);
                }

                @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19342f
                /* renamed from: a */
                public final void mo30810a(int i) {
                    int i2;
                    int i3 = C19366e.this.f45852k;
                    int i4 = 1;
                    if (i3 == C19366e.this.f45846e) {
                        i2 = C19366e.this.f45848g;
                    } else {
                        i2 = 1;
                    }
                    int i5 = i2 + i;
                    C19366e.this.f45853l = i5;
                    C19366e eVar = C19366e.this;
                    eVar.mo30871a(false, i3, i5, eVar.f45854m);
                    int i6 = 31;
                    if (C19366e.this.f45846e == C19366e.this.f45847f && C19366e.this.f45848g == C19366e.this.f45849h) {
                        i4 = C19366e.this.f45850i;
                        i6 = C19366e.this.f45851j;
                    } else if (i3 == C19366e.this.f45846e && i5 == C19366e.this.f45848g) {
                        i4 = C19366e.this.f45850i;
                    } else if (i3 == C19366e.this.f45847f && i5 == C19366e.this.f45849h) {
                        i6 = C19366e.this.f45851j;
                    }
                    int a = C19366e.m36135a(i3, i5, i6);
                    C19366e eVar2 = C19366e.this;
                    eVar2.mo30872b(false, eVar2.f45845d.getCurrentItem(), i4, a);
                    if (C19366e.this.f45855n != null) {
                        C19366e.this.f45855n.mo30807a();
                    }
                }
            });
            this.f45845d.setOnItemSelectedListener(new AbstractC19342f() {
                /* class com.bytedance.ies.xelement.picker.view.C19366e.C193693 */

                static {
                    Covode.recordClassIndex(22158);
                }

                @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19342f
                /* renamed from: a */
                public final void mo30810a(int i) {
                    if (C19366e.this.f45852k == C19366e.this.f45846e && C19366e.this.f45853l == C19366e.this.f45848g) {
                        C19366e eVar = C19366e.this;
                        eVar.f45854m = i + eVar.f45850i;
                    } else {
                        C19366e.this.f45854m = i + 1;
                    }
                    if (C19366e.this.f45855n != null) {
                        C19366e.this.f45855n.mo30807a();
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
