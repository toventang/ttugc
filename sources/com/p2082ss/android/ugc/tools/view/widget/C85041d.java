package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.d */
public final class C85041d {

    /* renamed from: a */
    public static AbstractC27255q<Integer> f190305a;

    /* renamed from: b */
    public static AbstractC85042a f190306b;

    /* renamed from: c */
    private int f190307c;

    /* renamed from: d */
    private int f190308d;

    /* renamed from: e */
    private int f190309e = 0;

    /* renamed from: f */
    private int f190310f;

    /* renamed from: g */
    private String f190311g;

    /* renamed from: h */
    private Context f190312h;

    /* renamed from: com.ss.android.ugc.tools.view.widget.d$a */
    public interface AbstractC85042a {
        static {
            Covode.recordClassIndex(99063);
        }

        /* renamed from: a */
        void mo73301a(Context context, String str, int i, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(99062);
    }

    /* renamed from: a */
    public static int m146219a() {
        AbstractC27255q<Integer> qVar = f190305a;
        if (qVar == null) {
            return 1;
        }
        return qVar.mo5560b().intValue();
    }

    /* renamed from: b */
    public final void mo129984b() {
        try {
            if (this.f190312h != null && !TextUtils.isEmpty(this.f190311g) && C63244g.m114602a().mo73269O()) {
                m146225a(this.f190312h, this.f190311g, this.f190307c, this.f190310f, this.f190308d, this.f190309e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C85041d m146220a(Context context, int i) {
        return m146221a(context, i, m146219a());
    }

    /* renamed from: b */
    public static C85041d m146226b(Context context, int i) {
        return m146224a(context, context.getString(i), 1, m146219a());
    }

    /* renamed from: c */
    public static C85041d m146229c(Context context, int i) {
        return m146228b(context, context.getString(i), 1, m146219a());
    }

    /* renamed from: a */
    public static C85041d m146222a(Context context, String str) {
        return m146224a(context, str, 1, m146219a());
    }

    /* renamed from: b */
    public static C85041d m146227b(Context context, String str, int i) {
        return m146228b(context, str, i, m146219a());
    }

    /* renamed from: a */
    private static C85041d m146221a(Context context, int i, int i2) {
        return new C85041d(context, context.getString(i), 1, 2, i2);
    }

    /* renamed from: a */
    public static C85041d m146223a(Context context, String str, int i) {
        return m146224a(context, str, i, m146219a());
    }

    /* renamed from: b */
    private static C85041d m146228b(Context context, String str, int i, int i2) {
        return new C85041d(context, str, i, 3, i2);
    }

    /* renamed from: a */
    private static C85041d m146224a(Context context, String str, int i, int i2) {
        return new C85041d(context, str, i, 2, i2);
    }

    public C85041d(Context context, String str, int i, int i2, int i3) {
        this.f190311g = str;
        this.f190307c = i;
        this.f190310f = i2;
        this.f190312h = context;
        this.f190308d = i3;
    }

    /* renamed from: a */
    private static void m146225a(Context context, String str, int i, int i2, int i3, int i4) {
        AbstractC85042a aVar = f190306b;
        if (aVar != null) {
            aVar.mo73301a(context, str, i, i3, i4);
            return;
        }
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (C63244g.m114602a().mo73297y().mo93848b().booleanValue()) {
            C13628n.m24508a(context, 0, str);
        } else if (i2 == 1) {
            C85043e a = C85043e.m146232a(context);
            a.f190317d = i3;
            a.mo129985a(i4);
            if (a.mo129988a()) {
                a.f190315b.setBackgroundColor(C0643b.m2378c(a.f190314a, R.color.um));
            } else {
                a.f190315b.setBackgroundResource(R.drawable.bng);
            }
            a.f190316c.setImageResource(2131233998);
            a.mo129986a(str, i);
        } else if (i2 == 2) {
            C85043e a2 = C85043e.m146232a(context);
            a2.f190317d = i3;
            a2.mo129985a(i4);
            if (a2.mo129988a()) {
                a2.f190315b.setBackgroundColor(C0643b.m2378c(a2.f190314a, R.color.ul));
            } else {
                a2.f190315b.setBackgroundResource(R.drawable.bnf);
            }
            a2.f190316c.setImageResource(2131233999);
            a2.mo129986a(str, i);
        } else if (i2 == 3) {
            C85043e a3 = C85043e.m146232a(context);
            a3.f190317d = i3;
            a3.mo129985a(i4);
            if (a3.mo129988a()) {
                a3.f190315b.setBackgroundColor(C0643b.m2378c(a3.f190314a, R.color.c7));
            } else {
                a3.f190315b.setBackgroundResource(R.drawable.bne);
            }
            a3.f190316c.setVisibility(8);
            a3.mo129986a(str, i);
        }
    }
}
