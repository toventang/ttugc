package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout */
public final class AVDmtTabLayout extends TabLayout {

    /* renamed from: v */
    public static final C77790a f174486v = new C77790a((byte) 0);

    /* renamed from: u */
    public TabLayout.AbstractC73099c f174487u;

    /* renamed from: w */
    private int f174488w;

    /* renamed from: x */
    private int f174489x;

    static {
        Covode.recordClassIndex(90865);
    }

    public AVDmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$a */
    public static final class C77790a {
        static {
            Covode.recordClassIndex(90866);
        }

        private C77790a() {
        }

        public /* synthetic */ C77790a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C77792a m135898a(Context context) {
            if (context == null) {
                C89219l.m154715b();
            }
            return new C77792a(context, (byte) 0);
        }

        /* renamed from: b */
        public static C77792a m135899b(Context context) {
            if (context == null) {
                C89219l.m154715b();
            }
            return new C77792a(context, (byte) 0);
        }
    }

    /* renamed from: f */
    public final void mo121356f() {
        setTabMargin(C84370a.f188623l.f188629e);
    }

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$b */
    public static final class C77791b implements TabLayout.AbstractC73099c {

        /* renamed from: a */
        final /* synthetic */ AVDmtTabLayout f174490a;

        static {
            Covode.recordClassIndex(90867);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77791b(AVDmtTabLayout aVDmtTabLayout) {
            this.f174490a = aVDmtTabLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(TabLayout.C73104f fVar) {
            C89219l.m154721d(fVar, "");
            if (this.f174490a.f174487u != null) {
                TabLayout.AbstractC73099c cVar = this.f174490a.f174487u;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo86253a(fVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: b */
        public final void mo86254b(TabLayout.C73104f fVar) {
            C89219l.m154721d(fVar, "");
            if (this.f174490a.f174487u != null) {
                TabLayout.AbstractC73099c cVar = this.f174490a.f174487u;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo86254b(fVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: c */
        public final void mo86255c(TabLayout.C73104f fVar) {
            C89219l.m154721d(fVar, "");
            if (this.f174490a.f174487u != null) {
                TabLayout.AbstractC73099c cVar = this.f174490a.f174487u;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo86255c(fVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout
    /* renamed from: a */
    public final void mo115524a(TabLayout.AbstractC73099c cVar) {
        C89219l.m154721d(cVar, "");
        this.f174487u = cVar;
    }

    public final void setMaxTabModeForCount(int i) {
        if (i <= 1) {
            setHideIndicatorView(true);
        } else {
            setHideIndicatorView(false);
        }
        if (i > 4 || i <= 1) {
            setTabMode(0);
        } else {
            setTabMode(1);
        }
    }

    private /* synthetic */ AVDmtTabLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtTabLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            obtainStyledAttributes.getBoolean(27, false);
        }
        int i = C77795c.f174518a;
        this.f174488w = i;
        this.f174489x = (i & 16777215) | Integer.MIN_VALUE;
        setOverScrollMode(2);
        mo115522a(this.f174489x, this.f174488w);
        setSelectedTabIndicatorColor(this.f174488w);
        setTabMargin(16);
        super.mo115524a(new C77791b(this));
    }
}
