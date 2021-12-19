package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22978b;
import com.bytedance.tux.p1708b.C22982f;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1708b.C22988k;
import com.bytedance.tux.p1708b.p1709a.C22973a;
import com.bytedance.tux.p1711d.C23012b;
import com.bytedance.tux.p1719f.C23142d;
import com.bytedance.tux.p1719f.p1720a.C23129d;
import com.bytedance.tux.p1722h.C23152b;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public class TuxTextView extends AppCompatTextView {

    /* renamed from: a */
    private final C22988k<TextView> f54877a;

    /* renamed from: b */
    private int f54878b;

    /* renamed from: c */
    public int f54879c;

    /* renamed from: e */
    private int f54880e;

    /* renamed from: f */
    private boolean f54881f;

    /* renamed from: g */
    private final AbstractC89244h f54882g;

    /* renamed from: h */
    private boolean f54883h;

    static {
        Covode.recordClassIndex(27109);
    }

    public TuxTextView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    private final C23152b getAutoSizeHelper() {
        return (C23152b) this.f54882g.getValue();
    }

    /* access modifiers changed from: protected */
    public final int getMinTextSize() {
        return this.f54880e;
    }

    /* renamed from: com.bytedance.tux.input.TuxTextView$a */
    static final class C23175a extends AbstractC89220m implements AbstractC89171a<C23152b> {

        /* renamed from: a */
        final /* synthetic */ TuxTextView f54885a;

        static {
            Covode.recordClassIndex(27111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23175a(TuxTextView tuxTextView) {
            super(0);
            this.f54885a = tuxTextView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23152b invoke() {
            return new C23152b(this.f54885a);
        }
    }

    /* renamed from: a */
    private final void mo796a() {
        setText(getText());
    }

    /* renamed from: b */
    private final void mo58206b() {
        int i = this.f54878b;
        int i2 = this.f54880e;
        boolean z = true;
        if (1 <= i2 && i > i2) {
            getAutoSizeHelper().mo37650a(this.f54880e, this.f54878b);
        } else {
            getAutoSizeHelper().mo37649a();
            z = false;
        }
        this.f54881f = z;
    }

    /* access modifiers changed from: protected */
    public final void setMinTextSize(int i) {
        this.f54880e = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37698b(boolean z) {
        this.f54883h = z;
        getAutoSizeHelper().f54803a = z;
    }

    public final void setMinTextSizePx(int i) {
        this.f54880e = i;
        mo58206b();
        mo796a();
    }

    public final void setMinTextSize(float f) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f54880e = C89241a.m154730a(TypedValue.applyDimension(1, f, system.getDisplayMetrics()));
        mo58206b();
        mo796a();
    }

    public final void setTextColorRes(int i) {
        Integer a;
        Context context = getContext();
        if (context != null && (a = C23155d.m43641a(context, i)) != null) {
            setTextColor(a.intValue());
        }
    }

    /* renamed from: a */
    public final void mo37697a(float f) {
        setTextSize(1, f);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f54879c = C89241a.m154730a(TypedValue.applyDimension(1, f + 4.0f, system.getDisplayMetrics()));
        this.f54878b = (int) getTextSize();
        mo58206b();
        mo796a();
    }

    public final void setTuxFont(int i) {
        Map<Integer, Object> map;
        Object obj;
        this.f54877a.mo37304a(this, R.attr.ap2, i);
        C22978b a = C22982f.m43324a((int) R.attr.ap2, i);
        if (!(a == null || (map = a.f54330a) == null || (obj = map.get(Integer.valueOf(C22983g.m43334h().f54332a))) == null)) {
            C22983g.m43334h();
            C89219l.m154719c(obj, "");
            float floatValue = ((Number) obj).floatValue();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            this.f54878b = C89241a.m154730a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
        }
        mo58206b();
        mo796a();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        if (this.f54881f && !this.f54883h) {
            TextPaint paint = getPaint();
            C89219l.m154709a((Object) paint, "");
            paint.setTextSize((float) this.f54878b);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C23142d dVar;
        C23129d dVar2;
        Integer valueOf;
        if (charSequence instanceof C23142d) {
            dVar = (C23142d) charSequence;
        } else {
            dVar = new C23142d(charSequence);
        }
        int i = this.f54879c;
        if (i > 0) {
            C23129d[] dVarArr = (C23129d[]) dVar.getSpans(0, dVar.length(), C23129d.class);
            C89219l.m154709a((Object) dVarArr, "");
            ArrayList arrayList = new ArrayList();
            for (C23129d dVar3 : dVarArr) {
                if (true ^ dVar3.f54745a) {
                    arrayList.add(dVar3);
                }
            }
            Iterator it = arrayList.iterator();
            Object obj = null;
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int i2 = ((C23129d) obj).f54746b;
                    do {
                        Object next = it.next();
                        int i3 = ((C23129d) next).f54746b;
                        if (i2 < i3) {
                            obj = next;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            }
            C23129d dVar4 = (C23129d) obj;
            if (dVar4 == null || (valueOf = Integer.valueOf(dVar4.f54746b)) == null || valueOf.intValue() <= 0) {
                dVar2 = new C23129d(i);
                dVar2.f54745a = true;
            } else {
                dVar2 = new C23129d(valueOf.intValue());
            }
            for (C23129d dVar5 : dVarArr) {
                dVar.removeSpan(dVar5);
            }
            dVar.mo37629a(dVar2);
        }
        super.setText(dVar, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TuxTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        C22988k<TextView> kVar = new C22988k<>(new C22973a());
        this.f54877a = kVar;
        this.f54878b = -1;
        this.f54880e = -1;
        this.f54882g = C89250i.m154773a((AbstractC89171a) new C23175a(this));
        kVar.f54377a = new C22988k.AbstractC22990b(this) {
            /* class com.bytedance.tux.input.TuxTextView.C231741 */

            /* renamed from: a */
            final /* synthetic */ TuxTextView f54884a;

            static {
                Covode.recordClassIndex(27110);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f54884a = r1;
            }

            @Override // com.bytedance.tux.p1708b.C22988k.AbstractC22990b
            /* renamed from: a */
            public final void mo37308a(Map<Integer, ? extends Object> map) {
                C89219l.m154719c(map, "");
                for (Map.Entry<Integer, ? extends Object> entry : map.entrySet()) {
                    if (entry.getKey().intValue() == C22983g.m43337k().f54332a) {
                        TuxTextView tuxTextView = this.f54884a;
                        C22983g.m43337k();
                        Object value = entry.getValue();
                        C89219l.m154719c(value, "");
                        tuxTextView.f54879c = ((Number) value).intValue();
                    }
                }
            }
        };
        int a = C23012b.f54478a.mo37393a(this, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap2, R.attr.aq8}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        this.f54880e = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        obtainStyledAttributes.recycle();
        setTuxFont(a);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f54881f) {
            getAutoSizeHelper().mo37651b();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.ce : i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f54881f) {
            getAutoSizeHelper().mo37651b();
        }
    }
}
