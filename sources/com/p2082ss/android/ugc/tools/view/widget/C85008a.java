package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ugc.tools.view.widget.a */
public class C85008a {

    /* renamed from: a */
    public Drawable f190169a;

    /* renamed from: b */
    public CharSequence f190170b;

    /* renamed from: c */
    public CharSequence f190171c;

    /* renamed from: d */
    public EnumC85050h f190172d;

    /* renamed from: e */
    public int f190173e;

    /* renamed from: f */
    public String f190174f;

    /* renamed from: g */
    public View.OnClickListener f190175g;

    /* renamed from: h */
    public String f190176h;

    /* renamed from: i */
    public View.OnClickListener f190177i;

    /* renamed from: j */
    public boolean f190178j;

    /* renamed from: k */
    public boolean f190179k;

    /* renamed from: l */
    public boolean f190180l;

    /* renamed from: m */
    public boolean f190181m;

    /* renamed from: n */
    public boolean f190182n;

    /* renamed from: o */
    public boolean f190183o;

    static {
        Covode.recordClassIndex(99029);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$a */
    public static class C85009a {

        /* renamed from: a */
        public C85008a f190184a = new C85008a();

        /* renamed from: b */
        private Context f190185b;

        static {
            Covode.recordClassIndex(99030);
        }

        /* renamed from: a */
        public final C85009a mo129932a(int i) {
            this.f190184a.f190171c = this.f190185b.getString(i);
            this.f190184a.f190180l = true;
            return this;
        }

        public C85009a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f190185b = applicationContext;
        }
    }
}
