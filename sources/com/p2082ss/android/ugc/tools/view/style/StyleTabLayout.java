package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.StyleTabLayout */
public final class StyleTabLayout extends TabLayout {

    /* renamed from: v */
    public static final C84963a f189883v = new C84963a((byte) 0);

    /* renamed from: u */
    public TabLayout.AbstractC73099c f189884u;

    /* renamed from: w */
    private int f189885w;

    /* renamed from: x */
    private int f189886x;

    static {
        Covode.recordClassIndex(98965);
    }

    public StyleTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.StyleTabLayout$a */
    public static final class C84963a {
        static {
            Covode.recordClassIndex(98966);
        }

        private C84963a() {
        }

        public /* synthetic */ C84963a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.StyleTabLayout$b */
    public static final class C84964b implements TabLayout.AbstractC73099c {

        /* renamed from: a */
        final /* synthetic */ StyleTabLayout f189887a;

        static {
            Covode.recordClassIndex(98967);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84964b(StyleTabLayout styleTabLayout) {
            this.f189887a = styleTabLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(TabLayout.C73104f fVar) {
            C89219l.m154721d(fVar, "");
            if (this.f189887a.f189884u != null) {
                TabLayout.AbstractC73099c cVar = this.f189887a.f189884u;
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
            if (this.f189887a.f189884u != null) {
                TabLayout.AbstractC73099c cVar = this.f189887a.f189884u;
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
            if (this.f189887a.f189884u != null) {
                TabLayout.AbstractC73099c cVar = this.f189887a.f189884u;
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
        this.f189884u = cVar;
    }

    private /* synthetic */ StyleTabLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleTabLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f189885w = context.getResources().getColor(R.color.ua);
        this.f189886x = context.getResources().getColor(R.color.ub);
        setOverScrollMode(2);
        mo115522a(this.f189886x, this.f189885w);
        setSelectedTabIndicatorColor(this.f189885w);
        setTabMargin(14);
        super.mo115524a(new C84964b(this));
    }
}
