package com.bytedance.tux.icon;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.tux.icon.b */
public final class C23169b {

    /* renamed from: a */
    public int f54833a;

    /* renamed from: b */
    public int f54834b;

    /* renamed from: c */
    public Integer f54835c;

    /* renamed from: d */
    public float f54836d;

    /* renamed from: e */
    public float f54837e;

    /* renamed from: f */
    public C23001b f54838f;

    /* renamed from: g */
    private C23001b f54839g;

    /* renamed from: h */
    private final TextView f54840h;

    static {
        Covode.recordClassIndex(27099);
    }

    /* renamed from: a */
    public final void mo37669a(Integer num) {
        this.f54838f = m43674c(num);
    }

    /* renamed from: b */
    public final void mo37671b(Integer num) {
        this.f54839g = m43674c(num);
    }

    public C23169b(TextView textView) {
        C89219l.m154719c(textView, "");
        this.f54840h = textView;
    }

    /* renamed from: a */
    public final void mo37668a(C23001b bVar) {
        Integer num = this.f54835c;
        if (num != null) {
            int intValue = num.intValue();
            if (bVar != null) {
                bVar.mo37377c(intValue);
            }
        }
    }

    /* renamed from: a */
    public final void mo37670a(boolean z) {
        C23001b bVar = this.f54838f;
        if (bVar != null) {
            bVar.mo37373a(z);
        }
        C23001b bVar2 = this.f54839g;
        if (bVar2 != null) {
            bVar2.mo37373a(z);
        }
    }

    /* renamed from: c */
    private final C23001b m43674c(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        if (num.intValue() <= 0) {
            return null;
        }
        Context context = this.f54840h.getContext();
        C89219l.m154709a((Object) context, "");
        return new C23001b(context, num.intValue());
    }

    /* renamed from: a */
    public final void mo37666a(int i) {
        int i2;
        int i3;
        C23001b bVar;
        C23001b bVar2;
        TextView textView = this.f54840h;
        mo37668a(this.f54838f);
        mo37668a(this.f54839g);
        float width = ((((float) textView.getWidth()) - textView.getPaint().measureText(textView.getText().toString())) - ((float) textView.getPaddingLeft())) - ((float) textView.getPaddingRight());
        if (textView.getCompoundDrawablePadding() != i) {
            textView.setCompoundDrawablePadding(i);
        }
        if (this.f54838f != null) {
            i2 = this.f54834b + i;
        } else {
            i2 = 0;
        }
        if (this.f54839g != null) {
            i3 = this.f54834b + i;
        } else {
            i3 = 0;
        }
        float b = C89271h.m154768b((width - ((float) i2)) - ((float) i3), 0.0f) / 2.0f;
        if (C23163i.m43664a(textView)) {
            bVar = this.f54839g;
            bVar2 = this.f54838f;
        } else {
            bVar = this.f54838f;
            bVar2 = this.f54839g;
        }
        int a = C89241a.m154730a(b);
        if (bVar != null) {
            bVar.setBounds(a, 0, this.f54834b + a, this.f54833a);
        }
        if (bVar2 != null) {
            int i4 = -a;
            bVar2.setBounds(i4, 0, this.f54834b + i4, this.f54833a);
        }
        textView.setCompoundDrawables(bVar, null, bVar2, null);
    }

    /* renamed from: a */
    public final void mo37667a(AttributeSet attributeSet, int i) {
        Context context = this.f54840h.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap6, R.attr.ap8, R.attr.ap9, R.attr.apj, R.attr.apl, R.attr.arj}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId < 0) {
            resourceId = obtainStyledAttributes.getResourceId(3, -1);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        this.f54836d = obtainStyledAttributes.getDimension(4, -1.0f);
        this.f54837e = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f54835c = Integer.valueOf(obtainStyledAttributes.getColor(5, 0));
        }
        obtainStyledAttributes.recycle();
        if (resourceId > 0) {
            C89219l.m154709a((Object) context, "");
            this.f54838f = new C23001b(context, resourceId);
        }
        if (resourceId2 > 0) {
            C89219l.m154709a((Object) context, "");
            this.f54839g = new C23001b(context, resourceId2);
        }
    }
}
