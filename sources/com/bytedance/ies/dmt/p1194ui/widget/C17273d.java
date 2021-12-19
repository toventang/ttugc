package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.ies.dmt.ui.widget.d */
public class C17273d {

    /* renamed from: a */
    int f41342a;

    /* renamed from: b */
    public Drawable f41343b;

    /* renamed from: c */
    int f41344c;

    /* renamed from: d */
    int f41345d;

    /* renamed from: e */
    public CharSequence f41346e;

    /* renamed from: f */
    public CharSequence f41347f;

    /* renamed from: g */
    public EnumC17270a f41348g;

    /* renamed from: h */
    public int f41349h;

    /* renamed from: i */
    public String f41350i;

    /* renamed from: j */
    public View.OnClickListener f41351j;

    /* renamed from: k */
    public String f41352k;

    /* renamed from: l */
    public View.OnClickListener f41353l;

    /* renamed from: m */
    int f41354m;

    /* renamed from: n */
    public boolean f41355n;

    /* renamed from: o */
    public boolean f41356o;

    /* renamed from: p */
    public boolean f41357p;

    /* renamed from: q */
    public boolean f41358q;

    /* renamed from: r */
    public boolean f41359r;

    /* renamed from: s */
    public boolean f41360s;

    /* renamed from: t */
    public boolean f41361t;

    /* renamed from: u */
    public boolean f41362u;

    /* renamed from: v */
    boolean f41363v;

    /* renamed from: w */
    public int f41364w;

    static {
        Covode.recordClassIndex(19751);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.d$a */
    public static class C17274a {

        /* renamed from: a */
        public C17273d f41365a = new C17273d();

        /* renamed from: b */
        private Context f41366b;

        static {
            Covode.recordClassIndex(19752);
        }

        /* renamed from: a */
        public final C17274a mo27456a() {
            this.f41365a.f41359r = true;
            return this;
        }

        /* renamed from: d */
        public final C17274a mo27465d(int i) {
            this.f41365a.f41364w = i;
            return this;
        }

        /* renamed from: a */
        public final C17274a mo27461a(String str) {
            this.f41365a.f41346e = str;
            this.f41365a.f41356o = true;
            return this;
        }

        /* renamed from: b */
        public final C17274a mo27463b(String str) {
            this.f41365a.f41347f = str;
            this.f41365a.f41357p = true;
            return this;
        }

        /* renamed from: c */
        public final C17274a mo27464c(int i) {
            this.f41365a.f41347f = this.f41366b.getString(i);
            this.f41365a.f41357p = true;
            return this;
        }

        public C17274a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f41366b = applicationContext;
        }

        /* renamed from: a */
        public final C17274a mo27457a(int i) {
            this.f41365a.f41342a = i;
            this.f41365a.f41343b = this.f41366b.getResources().getDrawable(i);
            this.f41365a.f41355n = true;
            return this;
        }

        /* renamed from: b */
        public final C17274a mo27462b(int i) {
            this.f41365a.f41346e = this.f41366b.getString(i);
            if (!TextUtils.isEmpty(this.f41365a.f41346e)) {
                this.f41365a.f41356o = true;
                return this;
            }
            throw new IllegalArgumentException("title should not be empty string!");
        }

        /* renamed from: a */
        public final C17274a mo27460a(EnumC17270a aVar, View.OnClickListener onClickListener) {
            this.f41365a.f41348g = aVar;
            this.f41365a.f41349h = 1979777029;
            this.f41365a.f41350i = this.f41366b.getString(1979973649);
            this.f41365a.f41351j = onClickListener;
            this.f41365a.f41361t = true;
            this.f41365a.f41360s = true;
            return this;
        }

        /* renamed from: a */
        public final C17274a mo27458a(int i, int i2, int i3) {
            this.f41365a.f41342a = i;
            this.f41365a.f41343b = this.f41366b.getResources().getDrawable(i);
            this.f41365a.f41355n = true;
            this.f41365a.f41344c = i2;
            this.f41365a.f41345d = i3;
            return this;
        }

        /* renamed from: a */
        public final C17274a mo27459a(EnumC17270a aVar, int i, View.OnClickListener onClickListener) {
            this.f41365a.f41348g = aVar;
            this.f41365a.f41350i = this.f41366b.getString(i);
            this.f41365a.f41351j = onClickListener;
            this.f41365a.f41360s = true;
            return this;
        }
    }
}
